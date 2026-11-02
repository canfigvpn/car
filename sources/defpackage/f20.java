package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f20 {
    public final lr0 a;
    public final Locale b;
    public final bm c;
    public final dk1 d;
    public final dk1 e;
    public final dk1 f;
    public final dk1 g;

    public f20(Long l, Long l2, lr0 lr0Var, int i, n00 n00Var, Locale locale) {
        em emVarG;
        this.a = lr0Var;
        this.b = locale;
        bm dmVar = Build.VERSION.SDK_INT >= 26 ? new dm(locale) : new a11(locale);
        this.c = dmVar;
        this.d = y12.s(n00Var);
        if (l2 != null) {
            emVarG = dmVar.f(l2.longValue());
            if (!lr0Var.a(emVarG.a)) {
                emVarG = dmVar.g(dmVar.h());
            }
        } else {
            emVarG = dmVar.g(dmVar.h());
        }
        this.e = y12.s(emVarG);
        zl zlVar = null;
        if (l != null) {
            zl zlVarB = this.c.b(l.longValue());
            if (lr0Var.a(zlVarB.e)) {
                zlVar = zlVarB;
            }
        }
        this.f = y12.s(zlVar);
        this.g = y12.s(new x50(i));
    }

    public final int a() {
        return ((x50) this.g.getValue()).a;
    }

    public final Long b() {
        zl zlVar = (zl) this.f.getValue();
        if (zlVar != null) {
            return Long.valueOf(zlVar.h);
        }
        return null;
    }
}
