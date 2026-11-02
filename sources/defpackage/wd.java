package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wd {
    public final dg2 a;
    public final boolean b;
    public final vd c;
    public final boolean d;

    public wd(dg2 dg2Var, boolean z, vd vdVar, boolean z2) {
        dg2Var.getClass();
        vdVar.getClass();
        this.a = dg2Var;
        this.b = z;
        this.c = vdVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return this.a == wdVar.a && this.b == wdVar.b && this.c == wdVar.c && this.d == wdVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + k3.f(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "AppSettings(themeMode=" + this.a + ", dynamicColor=" + this.b + ", language=" + this.c + ", smartOdometer=" + this.d + ")";
    }
}
