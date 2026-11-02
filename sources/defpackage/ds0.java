package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 {
    public final int a;
    public final int b;
    public final cz0 c;

    public ds0(int i, int i2, cz0 cz0Var) {
        this.a = i;
        this.b = i2;
        this.c = cz0Var;
        if (i < 0) {
            yp0.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        yp0.a("size should be > 0");
    }
}
