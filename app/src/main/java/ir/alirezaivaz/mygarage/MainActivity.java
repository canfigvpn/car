package ir.alirezaivaz.mygarage;

import android.app.*;
import android.os.*;
import android.content.*;
import android.database.*;
import android.database.sqlite.*;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.*;
import android.widget.*;
import org.json.*;
import java.io.*;
import java.text.*;
import java.util.*;

public class MainActivity extends Activity {
    static final int GOLD=Color.rgb(211,174,102), GOLD_LIGHT=Color.rgb(239,211,157);
    static final int DARK_BG=Color.rgb(15,17,21), DARK_CARD=Color.rgb(29,32,38), DARK_CARD2=Color.rgb(38,40,45);
    static final int LIGHT_BG=Color.rgb(244,242,237), LIGHT_CARD=Color.WHITE;
    static final int EXPORT=91, IMPORT=92;
    DB db; LinearLayout root, body, bottom; boolean dark=true; int carId=1; String currentPage="home", serviceFilter="active";
    JSONObject backupPending;

    @Override public void onCreate(Bundle state){
        super.onCreate(state);
        db=new DB(this);
        dark=getPreferences(0).getBoolean("dark",true);
        ensureCar(); createChannel(); scheduleDaily();
        if(Build.VERSION.SDK_INT>=33 && checkSelfPermission("android.permission.POST_NOTIFICATIONS")!=0)
            requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"},7);
        home();
    }

    int bg(){return dark?DARK_BG:LIGHT_BG;}
    int cardColor(){return dark?DARK_CARD:LIGHT_CARD;}
    int cardAlt(){return dark?DARK_CARD2:Color.rgb(249,247,242);}
    int fg(){return dark?Color.rgb(246,243,235):Color.rgb(39,40,42);}
    int muted(){return dark?Color.rgb(160,160,157):Color.rgb(120,117,109);}
    int line(){return dark?Color.rgb(67,61,49):Color.rgb(226,218,203);}
    int dp(float n){return (int)(n*getResources().getDisplayMetrics().density+.5f);}
    void ensureCar(){
        if(db.count("cars")==0){ContentValues v=new ContentValues();v.put("name","پژو ۲۰۶");v.put("model","۲۰۶");v.put("km",0);db.getWritableDatabase().insert("cars",null,v);}
        carId=db.firstCar();
    }
    GradientDrawable shape(int color,int stroke,int radius){
        GradientDrawable d=new GradientDrawable();d.setColor(color);d.setCornerRadius(dp(radius));d.setStroke(dp(1),stroke);return d;
    }
    TextView txt(String s,int size,boolean bold){
        TextView t=new TextView(this);t.setText(s);t.setTextSize(size);t.setTextColor(fg());
        if(bold)t.setTypeface(Typeface.DEFAULT,Typeface.BOLD);
        t.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);t.setTextDirection(View.TEXT_DIRECTION_RTL);
        return t;
    }
    LinearLayout col(){LinearLayout l=new LinearLayout(this);l.setOrientation(1);return l;}
    LinearLayout row(){LinearLayout l=new LinearLayout(this);l.setOrientation(0);l.setGravity(Gravity.CENTER_VERTICAL);return l;}
    void space(LinearLayout l,int h){View v=new View(this);l.addView(v,new LinearLayout.LayoutParams(1,dp(h)));}
    void pad(View v,int n){v.setPadding(dp(n),dp(n),dp(n),dp(n));}
    LinearLayout card(){
        LinearLayout c=col();c.setPadding(dp(17),dp(16),dp(17),dp(16));
        c.setBackground(shape(cardColor(),line(),22));return c;
    }
    TextView action(String label,Runnable run,boolean primary){
        TextView t=txt(label,13,true);t.setGravity(Gravity.CENTER);
        t.setPadding(dp(13),dp(12),dp(13),dp(12));
        t.setBackground(shape(primary?(dark?Color.rgb(83,67,42):Color.rgb(239,224,192)):cardAlt(),primary?GOLD:line(),15));
        t.setTextColor(primary?(dark?GOLD_LIGHT:Color.rgb(88,65,30)):fg());
        t.setOnClickListener(v->run.run());return t;
    }
    void shell(String title,String subtitle){
        getWindow().setStatusBarColor(bg());getWindow().setNavigationBarColor(bg());
        if(Build.VERSION.SDK_INT>=26)getWindow().getDecorView().setSystemUiVisibility(dark?0:(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR|View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR));
        root=col();root.setLayoutDirection(View.LAYOUT_DIRECTION_RTL);root.setBackgroundColor(bg());setContentView(root);
        LinearLayout header=row();header.setPadding(dp(16),dp(10),dp(16),dp(10));
        TextView add=action("＋ افزودن خودرو",()->editCar(),true);header.addView(add,new LinearLayout.LayoutParams(0,dp(44),1));
        TextView menu=action("⋮",()->topMenu(),false);LinearLayout.LayoutParams mp=new LinearLayout.LayoutParams(dp(48),dp(44));mp.setMargins(dp(8),0,0,0);header.addView(menu,mp);root.addView(header);
        ScrollView scroll=new ScrollView(this);scroll.setFillViewport(false);scroll.setClipToPadding(false);
        body=col();body.setPadding(dp(16),dp(7),dp(16),dp(22));scroll.addView(body);root.addView(scroll,new LinearLayout.LayoutParams(-1,0,1));
        bottom=row();bottom.setPadding(dp(5),dp(7),dp(5),dp(7));bottom.setBackground(shape(cardColor(),line(),22));
        LinearLayout.LayoutParams bp=new LinearLayout.LayoutParams(-1,-2);bp.setMargins(dp(12),dp(5),dp(12),dp(8));root.addView(bottom,bp);
        navItem("خانه","⌂","home");navItem("تاریخچه","◷","history");navItem("سوخت","⛽","fuel");navItem("تنظیمات","⚙","settings");
    }
    void topMenu(){String[] opts={"بازه‌های سرویس","ویرایش اطلاعات خودرو"};new AlertDialog.Builder(this).setItems(opts,(d,w)->{if(w==0)intervalsPage();else editCar();}).show();}
    void navItem(String label,String icon,String page){
        LinearLayout item=col();item.setGravity(Gravity.CENTER);item.setPadding(dp(3),dp(5),dp(3),dp(5));
        TextView a=txt(icon,19,true);a.setGravity(Gravity.CENTER);a.setTextColor(currentPage.equals(page)?GOLD:muted());item.addView(a);
        TextView b=txt(label,10,true);b.setGravity(Gravity.CENTER);b.setTextColor(currentPage.equals(page)?GOLD:muted());item.addView(b);
        item.setOnClickListener(v->{if(page.equals("home"))home();else if(page.equals("history"))historyPage();else if(page.equals("fuel"))fuelPage();else settingsPage();});
        bottom.addView(item,new LinearLayout.LayoutParams(0,-2,1));
    }
    void renderPage(){if("intervals".equals(currentPage))intervalsPage();else if("history".equals(currentPage))historyPage();else if("fuel".equals(currentPage))fuelPage();else if("settings".equals(currentPage))settingsPage();else if("services".equals(currentPage))services();else if("backup".equals(currentPage))backupPage();else home();}
    void home(){
        currentPage="home";shell("خودرو من",db.carName(carId)+"  ·  "+db.carModel(carId));int km=db.carKm(carId);ensureIntervals();
        LinearLayout hero=card();hero.setBackground(shape(dark?Color.rgb(35,39,45):Color.rgb(250,248,242),GOLD,24));
        LinearLayout top=row();TextView label=txt("کیلومتر فعلی",15,true);top.addView(label,new LinearLayout.LayoutParams(0,dp(38),1));top.addView(action("✎",()->editMileage(),false),new LinearLayout.LayoutParams(dp(44),dp(40)));hero.addView(top);space(hero,12);
        LinearLayout digits=row();digits.setGravity(Gravity.CENTER);String number=String.format(Locale.US,"%07d",Math.min(9999999,Math.max(0,km)));
        for(int i=0;i<number.length();i++){TextView digit=txt(number.substring(i,i+1),27,true);digit.setGravity(Gravity.CENTER);digit.setTextColor(GOLD_LIGHT);digit.setBackground(shape(Color.rgb(13,17,22),Color.rgb(74,78,82),9));LinearLayout.LayoutParams p=new LinearLayout.LayoutParams(0,dp(58),1);p.setMargins(dp(2),0,dp(2),0);digits.addView(digit,p);}
        hero.addView(digits);space(hero,7);TextView unit=txt("KM  ·  کیلومتر",10,true);unit.setGravity(Gravity.CENTER);unit.setTextColor(muted());hero.addView(unit);body.addView(hero);space(body,20);
        body.addView(txt("وضعیت سلامت سرویس‌ها",18,true));space(body,10);int near=0,updated=0,unregistered=0;
        Cursor sc=db.getReadableDatabase().rawQuery("SELECT last_km,interval_km FROM service_intervals WHERE car_id=?",new String[]{""+carId});
        while(sc.moveToNext()){int last=sc.getInt(0),interval=sc.getInt(1);if(last<=0)unregistered++;else if(interval>0&&km-last>=interval-500)near++;else updated++;}sc.close();
        LinearLayout stats=row();stats.addView(statCard("نزدیک به سرویس",""+near,"نیازمند بررسی",near>0),new LinearLayout.LayoutParams(0,-2,1));
        View gap=new View(this);stats.addView(gap,new LinearLayout.LayoutParams(dp(6),1));stats.addView(statCard("سرویس به‌روز",""+updated,"در محدوده مجاز",false),new LinearLayout.LayoutParams(0,-2,1));
        View gap2=new View(this);stats.addView(gap2,new LinearLayout.LayoutParams(dp(6),1));stats.addView(statCard("ثبت نشده",""+unregistered,"بدون سابقه",false),new LinearLayout.LayoutParams(0,-2,1));body.addView(stats);space(body,18);
        body.addView(txt("موارد نگه‌داری خودرو",17,true));space(body,9);showIntervalGrid(body,km);space(body,15);body.addView(action("＋ ثبت سرویس جدید",()->serviceDialog(0),true));
    }
    LinearLayout statCard(String title,String value,String hint,boolean warning){
        LinearLayout c=card();TextView a=txt(title,11,false);a.setTextColor(muted());c.addView(a);space(c,5);
        TextView b=txt(value,25,true);b.setTextColor(warning?Color.rgb(218,130,93):GOLD);c.addView(b);
        TextView d=txt(hint,10,false);d.setTextColor(muted());c.addView(d);return c;
    }
    void editMileage(){
        EditText e=field("کیلومتر فعلی");e.setInputType(2);e.setText(String.valueOf(db.carKm(carId)));
        new AlertDialog.Builder(this).setTitle("به‌روزرسانی کیلومتر").setView(wrap(e))
        .setNegativeButton("انصراف",null).setPositiveButton("ذخیره",(d,w)->{
            try{int k=Integer.parseInt(e.getText().toString().trim());if(k<0)throw new Exception();
                ContentValues v=new ContentValues();v.put("km",k);db.getWritableDatabase().update("cars",v,"id=?",new String[]{""+carId});home();
            }catch(Exception ex){toast("عدد کیلومتر معتبر نیست");}
        }).show();
    }
    void editCar(){
        EditText n=field("نام خودرو"),m=field("مدل"),k=field("کیلومتر فعلی");
        n.setText(db.carName(carId));m.setText(db.carModel(carId));k.setText(String.valueOf(db.carKm(carId)));k.setInputType(2);
        LinearLayout box=col();box.addView(n);box.addView(m);box.addView(k);
        new AlertDialog.Builder(this).setTitle("مشخصات خودرو").setView(wrap(box)).setNegativeButton("انصراف",null)
        .setPositiveButton("ذخیره",(d,w)->{try{int km=Integer.parseInt(k.getText().toString().trim());if(km<0)throw new Exception();
            ContentValues v=new ContentValues();v.put("name",n.getText().toString().trim());v.put("model",m.getText().toString().trim());v.put("km",km);
            db.getWritableDatabase().update("cars",v,"id=?",new String[]{""+carId});home();
        }catch(Exception ex){toast("اطلاعات خودرو را بررسی کنید");}}).show();
    }
    EditText field(String hint){
        EditText e=new EditText(this);e.setSingleLine(true);e.setHint(hint);e.setTextColor(fg());e.setHintTextColor(muted());
        e.setGravity(Gravity.RIGHT|Gravity.CENTER_VERTICAL);e.setTextDirection(View.TEXT_DIRECTION_RTL);
        e.setPadding(dp(13),dp(10),dp(13),dp(10));e.setBackground(shape(bg(),line(),13));return e;
    }
    View wrap(View v){LinearLayout l=col();l.setPadding(dp(19),dp(8),dp(19),dp(4));l.addView(v);return l;}
    void serviceDialog(int id){
        boolean editing=id>0;String oldName="",oldDate="",oldCat="عمومی",oldNote="";int oldKm=0;
        if(editing){Cursor c=db.getReadableDatabase().rawQuery("SELECT name,due_km,due_date,category,note FROM services WHERE id=?",new String[]{""+id});
            if(c.moveToFirst()){oldName=c.getString(0);oldKm=c.getInt(1);oldDate=c.getString(2);oldCat=c.getString(3);oldNote=c.getString(4);}c.close();}
        EditText name=field("نام سرویس؛ مثل تعویض روغن"),km=field("کیلومتر سررسید (اختیاری)"),date=field("تاریخ سررسید (YYYY-MM-DD)"),note=field("یادداشت (اختیاری)");
        name.setText(oldName);km.setInputType(2);if(oldKm>0)km.setText(String.valueOf(oldKm));date.setText(oldDate==null?"":oldDate);note.setText(oldNote==null?"":oldNote);
        Spinner cat=new Spinner(this);String[] cats={"عمومی","روغن و فیلتر","موتور","ترمز","لاستیک و جلوبندی","برق و باتری","گیربکس","بدنه و سایر"};
        ArrayAdapter<String> ad=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,cats);cat.setAdapter(ad);
        for(int i=0;i<cats.length;i++)if(cats[i].equals(oldCat))cat.setSelection(i);
        LinearLayout box=col();box.addView(name);space(box,5);box.addView(cat);space(box,5);box.addView(km);space(box,5);box.addView(date);space(box,5);box.addView(note);
        new AlertDialog.Builder(this).setTitle(editing?"ویرایش سرویس":"ثبت سرویس جدید").setView(wrap(box))
        .setNegativeButton("انصراف",null).setPositiveButton("ذخیره",(d,w)->{
            String n=name.getText().toString().trim(),ds=date.getText().toString().trim(),ks=km.getText().toString().trim();
            if(n.isEmpty()){toast("نام سرویس را وارد کنید");return;}
            if(!ds.isEmpty()&&!validDate(ds)){toast("تاریخ را با قالب YYYY-MM-DD وارد کنید");return;}
            int due=0;try{if(!ks.isEmpty())due=Integer.parseInt(ks);if(due<0)throw new Exception();}catch(Exception ex){toast("کیلومتر سررسید معتبر نیست");return;}
            ContentValues v=new ContentValues();v.put("car_id",carId);v.put("name",n);v.put("category",cat.getSelectedItem().toString());
            v.put("due_km",due);v.put("due_date",ds);v.put("note",note.getText().toString().trim());
            if(!editing)v.put("done",0);
            if(editing)db.getWritableDatabase().update("services",v,"id=?",new String[]{""+id});
            else db.getWritableDatabase().insert("services",null,v);
            scheduleDaily();if("services".equals(currentPage))services();else home();
        }).show();
    }
    boolean validDate(String s){try{SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd",Locale.US);f.setLenient(false);f.parse(s);return s.length()==10;}catch(Exception e){return false;}}
    boolean dateOverdue(String s){if(s==null||s.isEmpty())return false;try{SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd",Locale.US);f.setLenient(false);return f.parse(s).getTime()<dayStart();}catch(Exception e){return false;}}
    long dayStart(){Calendar c=Calendar.getInstance();c.set(Calendar.HOUR_OF_DAY,0);c.set(Calendar.MINUTE,0);c.set(Calendar.SECOND,0);c.set(Calendar.MILLISECOND,0);return c.getTimeInMillis();}
    boolean isOverdue(int due,String date,int km){return (due>0&&km>=due)||dateOverdue(date);}
    void services(){
        currentPage="services";shell("برنامه سرویس‌ها","ثبت، پیگیری و مدیریت نگه‌داری");
        body.addView(action("＋ افزودن سرویس جدید",()->serviceDialog(0),true));space(body,13);
        LinearLayout filters=row();
        filters.addView(action("فعال",()->{serviceFilter="active";services();},serviceFilter.equals("active")),new LinearLayout.LayoutParams(0,-2,1));
        View g=new View(this);filters.addView(g,new LinearLayout.LayoutParams(dp(6),1));
        filters.addView(action("انجام‌شده",()->{serviceFilter="done";services();},serviceFilter.equals("done")),new LinearLayout.LayoutParams(0,-2,1));
        body.addView(filters);space(body,12);showServices(body,db.carKm(carId),false);
    }
    void showServices(LinearLayout target,int km,boolean compact){
        String where=compact?"":" AND done="+(serviceFilter.equals("done")?1:0);
        Cursor c=db.getReadableDatabase().rawQuery("SELECT id,name,due_km,due_date,done,category,note FROM services WHERE car_id=?"+where+" ORDER BY done ASC,id DESC",new String[]{""+carId});
        if(c.getCount()==0){LinearLayout empty=card();empty.addView(txt(compact?"سرویسی برای نمایش وجود ندارد":"موردی در این فهرست ثبت نشده است.",13,false));target.addView(empty);c.close();return;}
        int shown=0;
        while(c.moveToNext()){
            int id=c.getInt(0),due=c.getInt(2),done=c.getInt(4);String name=c.getString(1),date=c.getString(3),category=c.getString(5),note=c.getString(6);
            boolean overdue=done==0&&isOverdue(due,date,km);
            if(compact&&shown>=4)break;
            LinearLayout item=card();LinearLayout head=row();
            TextView title=txt(name,15,true);head.addView(title,new LinearLayout.LayoutParams(0,-2,1));
            TextView badge=txt(done==1?"انجام‌شده":overdue?"سررسید گذشته":"در برنامه",10,true);
            badge.setTextColor(done==1?GOLD:overdue?Color.rgb(220,125,90):muted());badge.setGravity(Gravity.CENTER);
            badge.setPadding(dp(8),dp(5),dp(8),dp(5));badge.setBackground(shape(cardAlt(),line(),20));head.addView(badge);item.addView(head);
            space(item,6);TextView cat=txt(category==null?"عمومی":category,10,false);cat.setTextColor(GOLD);item.addView(cat);
            String detail=(due>0?"کیلومتر: "+String.format(Locale.US,"%,d",due):"بدون موعد کیلومتری")+(date!=null&&!date.isEmpty()?"  ·  "+date:"");
            space(item,4);TextView sub=txt(detail,11,false);sub.setTextColor(muted());item.addView(sub);
            if(note!=null&&!note.isEmpty()){space(item,4);TextView nt=txt(note,11,false);nt.setTextColor(muted());item.addView(nt);}
            space(item,10);LinearLayout actions=row();
            actions.addView(action("ویرایش",()->serviceDialog(id),false),new LinearLayout.LayoutParams(0,-2,1));
            View s=new View(this);actions.addView(s,new LinearLayout.LayoutParams(dp(6),1));
            actions.addView(action(done==1?"فعال‌سازی":"ثبت انجام",()->{ContentValues v=new ContentValues();v.put("done",done==1?0:1);db.getWritableDatabase().update("services",v,"id=?",new String[]{""+id});renderPage();},true),new LinearLayout.LayoutParams(0,-2,1));
            View s2=new View(this);actions.addView(s2,new LinearLayout.LayoutParams(dp(6),1));
            actions.addView(action("حذف",()->new AlertDialog.Builder(this).setMessage("این سرویس حذف شود؟").setNegativeButton("انصراف",null).setPositiveButton("حذف",(a,b)->{db.getWritableDatabase().delete("services","id=?",new String[]{""+id});renderPage();}).show(),false),new LinearLayout.LayoutParams(0,-2,1));
            item.addView(actions);target.addView(item);space(target,9);shown++;
        }c.close();
        if(compact&&db.openCount()>4)target.addView(action("مشاهده همه سرویس‌ها",()->services(),false));
    }
    void backupPage(){
        currentPage="backup";shell("پشتیبان‌گیری","اطلاعات فقط روی دستگاه شما ذخیره می‌شود");
        LinearLayout c=card();c.addView(txt("امنیت اطلاعات خودرو",17,true));space(c,7);
        TextView desc=txt("از اطلاعات خودرو و سوابق سرویس‌ها یک فایل پشتیبان JSON بسازید و در صورت نیاز آن را بازیابی کنید. این عملیات کاملاً آفلاین است.",12,false);desc.setTextColor(muted());c.addView(desc);
        body.addView(c);space(body,12);
        body.addView(action("⇧  تهیه فایل پشتیبان",()->exportBackup(),true));space(body,9);
        body.addView(action("⇩  بازیابی از فایل پشتیبان",()->importBackup(),false));space(body,17);
        LinearLayout info=card();info.addView(txt("اطلاعات ذخیره‌شده",15,true));space(info,8);
        info.addView(txt("خودروها: "+db.count("cars")+"     سرویس‌ها: "+db.count("services"),12,false));
        body.addView(info);
    }
    void exportBackup(){
        try{JSONObject j=new JSONObject();j.put("format","mygarage-backup");j.put("version",2);j.put("cars",db.readTable("cars"));j.put("services",db.readTable("services"));
            backupPending=j;Intent i=new Intent(Intent.ACTION_CREATE_DOCUMENT);i.addCategory(Intent.CATEGORY_OPENABLE);i.setType("application/json");i.putExtra(Intent.EXTRA_TITLE,"mygarage-backup.json");startActivityForResult(i,EXPORT);
        }catch(Exception e){toast("ساخت فایل پشتیبان ناموفق بود");}
    }
    void importBackup(){Intent i=new Intent(Intent.ACTION_OPEN_DOCUMENT);i.addCategory(Intent.CATEGORY_OPENABLE);i.setType("*/*");startActivityForResult(i,IMPORT);}
    @Override protected void onActivityResult(int req,int res,Intent data){
        super.onActivityResult(req,res,data);if(res!=RESULT_OK||data==null)return;
        try{
            if(req==EXPORT&&backupPending!=null){OutputStream out=getContentResolver().openOutputStream(data.getData());out.write(backupPending.toString(2).getBytes("UTF-8"));out.close();toast("فایل پشتیبان ذخیره شد");}
            else if(req==IMPORT){InputStream in=getContentResolver().openInputStream(data.getData());ByteArrayOutputStream b=new ByteArrayOutputStream();byte[] buf=new byte[4096];int n;while((n=in.read(buf))>0)b.write(buf,0,n);in.close();
                JSONObject j=new JSONObject(b.toString("UTF-8"));if(!"mygarage-backup".equals(j.optString("format"))||!j.has("cars")||!j.has("services"))throw new Exception("invalid");
                new AlertDialog.Builder(this).setTitle("بازیابی اطلاعات").setMessage("اطلاعات فعلی با محتوای فایل پشتیبان جایگزین می‌شود. ادامه می‌دهید؟")
                .setNegativeButton("انصراف",null).setPositiveButton("بازیابی",(d,w)->{if(db.restore(j)){ensureCar();scheduleDaily();home();toast("بازیابی با موفقیت انجام شد");}else toast("بازیابی انجام نشد");}).show();
            }
        }catch(Exception e){toast("فایل پشتیبان معتبر یا قابل خواندن نیست");}
    }
    void toast(String s){Toast.makeText(this,s,Toast.LENGTH_SHORT).show();}
    void createChannel(){if(Build.VERSION.SDK_INT>=26){NotificationChannel ch=new NotificationChannel("service_due","یادآوری سرویس خودرو",NotificationManager.IMPORTANCE_DEFAULT);ch.setDescription("یادآوری موعد سرویس‌های ثبت‌شده");((NotificationManager)getSystemService(NOTIFICATION_SERVICE)).createNotificationChannel(ch);}}
    void scheduleDaily(){
        Intent i=new Intent(this,ReminderReceiver.class);PendingIntent p=PendingIntent.getBroadcast(this,10,i,PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);
        Calendar c=Calendar.getInstance();c.set(Calendar.HOUR_OF_DAY,9);c.set(Calendar.MINUTE,0);c.set(Calendar.SECOND,0);if(c.getTimeInMillis()<System.currentTimeMillis())c.add(Calendar.DAY_OF_YEAR,1);
        AlarmManager a=(AlarmManager)getSystemService(ALARM_SERVICE);if(a!=null)a.setInexactRepeating(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),AlarmManager.INTERVAL_DAY,p);
    }
    public static class ReminderReceiver extends BroadcastReceiver {
        public void onReceive(Context ctx,Intent i){
            DB db=new DB(ctx);int km=db.carKm(db.firstCar());Cursor c=db.getReadableDatabase().rawQuery("SELECT name,due_km,due_date FROM services WHERE done=0",null);
            ArrayList<String> due=new ArrayList<>();long now=System.currentTimeMillis();
            while(c.moveToNext()){int dk=c.getInt(1);String date=c.getString(2);boolean soon=dk>0&&km>=dk-500;
                try{if(date!=null&&!date.isEmpty()){SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd",Locale.US);f.setLenient(false);long t=f.parse(date).getTime();soon|=t-now<14L*86400000&&t-now>=-86400000;}}catch(Exception e){}
                if(soon)due.add(c.getString(0));
            }c.close();
            if(!due.isEmpty()){Notification.Builder b=Build.VERSION.SDK_INT>=26?new Notification.Builder(ctx,"service_due"):new Notification.Builder(ctx);
                b.setSmallIcon(android.R.drawable.ic_dialog_info).setContentTitle("یادآوری سرویس خودرو")
                .setContentText("موعد سرویس: "+due.get(0)+(due.size()>1?" و "+(due.size()-1)+" مورد دیگر":"")).setAutoCancel(true);
                ((NotificationManager)ctx.getSystemService(Context.NOTIFICATION_SERVICE)).notify(33,b.build());
            }
        }
    }
    public static class BootReceiver extends BroadcastReceiver {
        public void onReceive(Context c,Intent i){Intent x=new Intent(c,ReminderReceiver.class);PendingIntent p=PendingIntent.getBroadcast(c,10,x,PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE);
            Calendar t=Calendar.getInstance();t.set(Calendar.HOUR_OF_DAY,9);t.set(Calendar.MINUTE,0);AlarmManager a=(AlarmManager)c.getSystemService(ALARM_SERVICE);
            if(a!=null){if(t.getTimeInMillis()<System.currentTimeMillis())t.add(Calendar.DAY_OF_YEAR,1);a.setInexactRepeating(AlarmManager.RTC_WAKEUP,t.getTimeInMillis(),AlarmManager.INTERVAL_DAY,p);}
        }
    }
    static class DB extends SQLiteOpenHelper {
        DB(Context c){super(c,"mygarage_local.db",null,2);}
        public void onCreate(SQLiteDatabase d){
            d.execSQL("CREATE TABLE cars(id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,model TEXT,km INTEGER DEFAULT 0)");
            d.execSQL("CREATE TABLE services(id INTEGER PRIMARY KEY AUTOINCREMENT,car_id INTEGER,name TEXT,due_km INTEGER DEFAULT 0,due_date TEXT,done INTEGER DEFAULT 0,category TEXT DEFAULT 'عمومی',note TEXT DEFAULT '')");
        }
        public void onUpgrade(SQLiteDatabase d,int old,int now){
            if(old<2){try{d.execSQL("ALTER TABLE services ADD COLUMN category TEXT DEFAULT 'عمومی'");}catch(Exception e){}try{d.execSQL("ALTER TABLE services ADD COLUMN note TEXT DEFAULT ''");}catch(Exception e){}}
        }
        int count(String table){Cursor c=getReadableDatabase().rawQuery("SELECT COUNT(*) FROM "+table,null);c.moveToFirst();int n=c.getInt(0);c.close();return n;}
        int firstCar(){Cursor c=getReadableDatabase().rawQuery("SELECT id FROM cars ORDER BY id LIMIT 1",null);int n=c.moveToFirst()?c.getInt(0):1;c.close();return n;}
        int carKm(int id){Cursor c=getReadableDatabase().rawQuery("SELECT km FROM cars WHERE id=?",new String[]{""+id});int n=c.moveToFirst()?c.getInt(0):0;c.close();return n;}
        String carName(int id){return carField(id,"name");}String carModel(int id){return carField(id,"model");}
        String carField(int id,String f){Cursor c=getReadableDatabase().rawQuery("SELECT "+f+" FROM cars WHERE id=?",new String[]{""+id});String s=c.moveToFirst()?c.getString(0):"";c.close();return s==null?"":s;}
        int dueCount(int km){Cursor c=getReadableDatabase().rawQuery("SELECT COUNT(*) FROM services WHERE done=0 AND due_km>0 AND due_km<=?",new String[]{""+km});c.moveToFirst();int n=c.getInt(0);c.close();return n;}
        int overdueCount(int km){Cursor c=getReadableDatabase().rawQuery("SELECT COUNT(*) FROM services WHERE car_id=? AND done=0 AND ((due_km>0 AND due_km<=?) OR (due_date IS NOT NULL AND due_date!='' AND due_date<?))",new String[]{""+firstCar(),""+km,new SimpleDateFormat("yyyy-MM-dd",Locale.US).format(new Date())});c.moveToFirst();int n=c.getInt(0);c.close();return n;}
        int upcomingCount(int km){int n=0;Cursor c=getReadableDatabase().rawQuery("SELECT due_km,due_date FROM services WHERE car_id=? AND done=0",new String[]{""+firstCar()});long now=System.currentTimeMillis();while(c.moveToNext()){int k=c.getInt(0);String date=c.getString(1);boolean soon=k>0&&k>km&&k-km<=500;try{if(date!=null&&!date.isEmpty()){SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd",Locale.US);long t=f.parse(date).getTime();soon|=t-now<=14L*86400000&&t-now>=0;}}catch(Exception e){}if(soon)n++;}c.close();return n;}
        int openCount(){Cursor c=getReadableDatabase().rawQuery("SELECT COUNT(*) FROM services WHERE car_id=? AND done=0",new String[]{""+firstCar()});c.moveToFirst();int n=c.getInt(0);c.close();return n;}
        int doneCount(){Cursor c=getReadableDatabase().rawQuery("SELECT COUNT(*) FROM services WHERE car_id=? AND done=1",new String[]{""+firstCar()});c.moveToFirst();int n=c.getInt(0);c.close();return n;}
        JSONArray readTable(String table)throws Exception{JSONArray a=new JSONArray();Cursor c=getReadableDatabase().rawQuery("SELECT * FROM "+table,null);while(c.moveToNext()){JSONObject o=new JSONObject();for(int i=0;i<c.getColumnCount();i++)o.put(c.getColumnName(i),c.isNull(i)?JSONObject.NULL:c.getString(i));a.put(o);}c.close();return a;}
        boolean restore(JSONObject j){
            SQLiteDatabase d=getWritableDatabase();d.beginTransaction();
            try{
                d.delete("services",null,null);d.delete("cars",null,null);
                JSONArray cars=j.getJSONArray("cars");for(int i=0;i<cars.length();i++){JSONObject o=cars.getJSONObject(i);ContentValues v=new ContentValues();
                    if(o.has("id"))v.put("id",o.optInt("id"));v.put("name",o.optString("name","خودرو"));v.put("model",o.optString("model",""));v.put("km",o.optInt("km",0));d.insertOrThrow("cars",null,v);}
                JSONArray ss=j.getJSONArray("services");for(int i=0;i<ss.length();i++){JSONObject o=ss.getJSONObject(i);ContentValues v=new ContentValues();
                    if(o.has("id"))v.put("id",o.optInt("id"));v.put("car_id",o.optInt("car_id",1));v.put("name",o.optString("name","سرویس"));v.put("due_km",o.optInt("due_km",0));
                    v.put("due_date",o.optString("due_date",""));v.put("done",o.optInt("done",0));v.put("category",o.optString("category","عمومی"));v.put("note",o.optString("note",""));d.insertOrThrow("services",null,v);}
                d.setTransactionSuccessful();return true;
            }catch(Exception e){return false;}finally{d.endTransaction();}
        }
    }
    @Override public void onBackPressed(){if(!"home".equals(currentPage))home();else super.onBackPressed();}
}
