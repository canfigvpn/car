package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class je1 extends dw0 implements ej0 {
    public static final je1 g;
    public static final je1 h;
    public static final je1 i;
    public static final je1 j;
    public static final je1 k;
    public static final je1 l;
    public static final je1 m;
    public static final je1 n;
    public static final je1 o;
    public static final je1 p;
    public static final je1 q;
    public static final je1 r;
    public static final je1 s;
    public static final je1 t;
    public static final je1 u;
    public static final je1 v;
    public static final je1 w;
    public static final je1 x;
    public static final je1 y;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        g = new je1(i2, 0);
        h = new je1(i2, 1);
        i = new je1(i2, 2);
        j = new je1(i2, 3);
        k = new je1(i2, 4);
        l = new je1(i2, 5);
        m = new je1(i2, 6);
        n = new je1(i2, 7);
        o = new je1(i2, 8);
        p = new je1(i2, 9);
        q = new je1(i2, 10);
        r = new je1(i2, 11);
        s = new je1(i2, 12);
        t = new je1(i2, 13);
        u = new je1(i2, 14);
        v = new je1(i2, 15);
        w = new je1(i2, 16);
        x = new je1(i2, 17);
        y = new je1(i2, 18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je1(int i2) {
        super(1);
        this.f = 21;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) throws Throwable {
        int i2 = this.f;
        ll2 ll2Var = ll2.a;
        switch (i2) {
            case 0:
                zi1 zi1Var = ((me1) obj).P;
                if (zi1Var != null) {
                    ((dl0) zi1Var).c();
                }
                return ll2Var;
            case 1:
                me1 me1Var = (me1) obj;
                ax0 ax0Var = me1Var.s;
                try {
                    if (me1Var.y()) {
                        me1Var.s1(true);
                        break;
                    }
                    return ll2Var;
                } catch (Throwable th) {
                    ax0Var.Y(th);
                    throw null;
                }
            case 2:
                mf1 mf1Var = (mf1) obj;
                if (mf1Var.y()) {
                    mf1Var.e.I();
                }
                return ll2Var;
            case 3:
                ax0 ax0Var2 = (ax0) obj;
                if (ax0Var2.H()) {
                    ax0Var2.U(false);
                }
                return ll2Var;
            case 4:
                ax0 ax0Var3 = (ax0) obj;
                if (ax0Var3.H()) {
                    ax0Var3.U(false);
                }
                return ll2Var;
            case 5:
                ax0 ax0Var4 = (ax0) obj;
                if (ax0Var4.H()) {
                    ax0Var4.S(false);
                }
                return ll2Var;
            case 6:
                ax0 ax0Var5 = (ax0) obj;
                if (ax0Var5.H()) {
                    ax0Var5.S(false);
                }
                return ll2Var;
            case 7:
                ax0 ax0Var6 = (ax0) obj;
                if (ax0Var6.H()) {
                    ax0.T(ax0Var6, false, 7);
                }
                return ll2Var;
            case 8:
                ax0 ax0Var7 = (ax0) obj;
                if (ax0Var7.H()) {
                    ax0.V(ax0Var7, false, 7);
                }
                return ll2Var;
            case 9:
                ax0 ax0Var8 = (ax0) obj;
                if (ax0Var8.H()) {
                    ax0Var8.F();
                }
                return ll2Var;
            case 10:
                return ll2Var;
            case 11:
                uo1 uo1Var = (uo1) obj;
                if (uo1Var.isAttachedToWindow()) {
                    uo1Var.r();
                }
                return ll2Var;
            case 12:
                return ll2Var;
            case 13:
                return Integer.valueOf(((qx1) obj).b);
            case 14:
                return Integer.valueOf(((qx1) obj).c.b());
            case 15:
                return ll2Var;
            case 16:
                int i3 = ((no0) obj).a;
                return ll2Var;
            case 17:
                return ll2Var;
            case 18:
                int i4 = ((no0) obj).a;
                return ll2Var;
            case 19:
                return new qr0((((long) ((int) (((qr0) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 20:
                return new qr0((((long) ((int) (((qr0) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 21:
                return Boolean.valueOf(((cg0) obj).F0());
            default:
                ((vn0) obj).getClass();
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je1(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je1(gs1 gs1Var) {
        super(1);
        this.f = 22;
    }
}
