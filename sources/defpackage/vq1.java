package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vq1 {
    public final tq1 a;
    public final boolean b;
    public final d72 c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public vq1(tq1 tq1Var, Object obj, boolean z, d72 d72Var, boolean z2) {
        this.a = tq1Var;
        this.b = z;
        this.c = d72Var;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        hv.b("Unexpected form of a provided value");
        qj.e();
        return null;
    }
}
