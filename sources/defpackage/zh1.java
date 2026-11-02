package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zh1 {
    public final int a;
    public final int b;

    public /* synthetic */ zh1(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public abstract void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var);

    public vj0 b(vp vpVar) {
        return null;
    }

    public final String toString() {
        String strC = js1.a(getClass()).c();
        return strC == null ? "" : strC;
    }

    public zh1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
