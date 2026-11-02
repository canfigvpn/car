package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lh0 implements Comparable {
    public static final lh0 f;
    public static final lh0 g;
    public static final lh0 h;
    public static final lh0 i;
    public static final lh0 j;
    public static final lh0 k;
    public final int e;

    static {
        lh0 lh0Var = new lh0(100);
        lh0 lh0Var2 = new lh0(200);
        lh0 lh0Var3 = new lh0(300);
        lh0 lh0Var4 = new lh0(400);
        f = lh0Var4;
        lh0 lh0Var5 = new lh0(500);
        g = lh0Var5;
        lh0 lh0Var6 = new lh0(600);
        h = lh0Var6;
        lh0 lh0Var7 = new lh0(700);
        lh0 lh0Var8 = new lh0(800);
        lh0 lh0Var9 = new lh0(900);
        i = lh0Var4;
        j = lh0Var5;
        k = lh0Var7;
        vs0.v(lh0Var, lh0Var2, lh0Var3, lh0Var4, lh0Var5, lh0Var6, lh0Var7, lh0Var8, lh0Var9);
    }

    public lh0(int i2) {
        this.e = i2;
        boolean z = false;
        if (1 <= i2 && i2 < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        wp0.a("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(lh0 lh0Var) {
        return ws0.n(this.e, lh0Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lh0) {
            return this.e == ((lh0) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        return k3.l(new StringBuilder("FontWeight(weight="), this.e, ')');
    }
}
