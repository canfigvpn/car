package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m32 {
    public final SharedPreferences a;
    public final s82 b;
    public final jr1 c;
    public final s82 d;
    public final jr1 e;
    public final s82 f;
    public final jr1 g;
    public final s82 h;
    public final jr1 i;

    public m32(Context context) {
        Object next;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("mygarage_ui_prefs", 0);
        this.a = sharedPreferences;
        sharedPreferences.getClass();
        Object obj = null;
        String string = sharedPreferences.getString("theme_mode", null);
        Iterator it = dg2.g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ws0.j(((dg2) next).name(), string));
        dg2 dg2Var = (dg2) next;
        s82 s82VarF = j20.f(dg2Var == null ? dg2.e : dg2Var);
        this.b = s82VarF;
        this.c = new jr1(s82VarF);
        s82 s82VarF2 = j20.f(Boolean.valueOf(this.a.getBoolean("dynamic_color", true)));
        this.d = s82VarF2;
        this.e = new jr1(s82VarF2);
        SharedPreferences sharedPreferences2 = this.a;
        sharedPreferences2.getClass();
        String string2 = sharedPreferences2.getString("language", null);
        yb0 yb0Var = vd.h;
        yb0Var.getClass();
        v vVar = new v(0, yb0Var);
        while (vVar.hasNext()) {
            Object next2 = vVar.next();
            if (ws0.j(((vd) next2).name(), string2)) {
                obj = next2;
                break;
            }
        }
        vd vdVar = (vd) obj;
        s82 s82VarF3 = j20.f(vdVar == null ? vd.f : vdVar);
        this.f = s82VarF3;
        this.g = new jr1(s82VarF3);
        s82 s82VarF4 = j20.f(Boolean.valueOf(this.a.getBoolean("smart_odometer", false)));
        this.h = s82VarF4;
        this.i = new jr1(s82VarF4);
    }

    public final void a(boolean z) {
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putBoolean("dynamic_color", z);
        editorEdit.apply();
        this.d.j(null, Boolean.valueOf(z));
    }

    public final void b(vd vdVar) {
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putString("language", vdVar.name());
        editorEdit.apply();
        this.f.j(null, vdVar);
    }

    public final void c(boolean z) {
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putBoolean("smart_odometer", z);
        editorEdit.apply();
        this.h.j(null, Boolean.valueOf(z));
    }

    public final void d(dg2 dg2Var) {
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putString("theme_mode", dg2Var.name());
        editorEdit.apply();
        this.b.j(null, dg2Var);
    }
}
