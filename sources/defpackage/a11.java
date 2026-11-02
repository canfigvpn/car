package defpackage;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a11 extends bm {
    public static final TimeZone e = TimeZone.getTimeZone("UTC");
    public final int c;
    public final z21 d;

    public a11(Locale locale) {
        super(locale);
        int firstDayOfWeek = (Calendar.getInstance(locale).getFirstDayOfWeek() + 6) % 7;
        this.c = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        z21 z21VarL = vs0.l();
        String[] weekdays = new DateFormatSymbols(locale).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(locale).getShortWeekdays();
        List listA0 = ve.A0(weekdays);
        int size = listA0.size();
        for (int i = 0; i < size; i++) {
            z21VarL.add(new qj1((String) listA0.get(i), shortWeekdays[i + 2]));
        }
        z21VarL.add(new qj1(weekdays[1], shortWeekdays[1]));
        this.d = vs0.i(z21VarL);
    }

    @Override // defpackage.bm
    public final String a(long j, String str, Locale locale) {
        String str2 = str + locale.toLanguageTag();
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(str2);
        TimeZone timeZone = e;
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(str2, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // defpackage.bm
    public final zl b(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new zl(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // defpackage.bm
    public final d00 c(Locale locale) {
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        dateInstance.getClass();
        return ws0.q(((SimpleDateFormat) dateInstance).toPattern());
    }

    @Override // defpackage.bm
    public final int d() {
        return this.c;
    }

    @Override // defpackage.bm
    public final em e(int i, int i2) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // defpackage.bm
    public final em f(long j) {
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(j);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // defpackage.bm
    public final em g(zl zlVar) {
        return e(zlVar.e, zlVar.f);
    }

    @Override // defpackage.bm
    public final zl h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new zl(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(16) + calendar.get(15))));
    }

    @Override // defpackage.bm
    public final List i() {
        return this.d;
    }

    @Override // defpackage.bm
    public final zl j(String str, String str2, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = e;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new zl(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // defpackage.bm
    public final em k(em emVar, int i) {
        if (i <= 0) {
            return emVar;
        }
        Calendar calendar = Calendar.getInstance(e);
        calendar.setTimeInMillis(emVar.e);
        calendar.add(2, i);
        return l(calendar);
    }

    public final em l(Calendar calendar) {
        int i = (calendar.get(7) + 6) % 7;
        int i2 = (i != 0 ? i : 7) - this.c;
        if (i2 < 0) {
            i2 += 7;
        }
        return new em(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i2, calendar.getTimeInMillis());
    }

    public final String toString() {
        return "LegacyCalendarModel";
    }
}
