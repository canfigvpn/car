package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uv1 implements tv1 {
    public static final uv1 a = new uv1();

    @Override // defpackage.tv1
    public final u71 a(u71 u71Var, float f) {
        if (f <= 0.0d) {
            tp0.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return u71Var.c(new px0(f, true));
    }
}
