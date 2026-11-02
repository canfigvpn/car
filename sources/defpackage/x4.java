package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x4 extends dw0 implements ej0 {
    public static final x4 A;
    public static final x4 B;
    public static final x4 C;
    public static final x4 D;
    public static final x4 E;
    public static final x4 F;
    public static final x4 G;
    public static final x4 H;
    public static final x4 I;
    public static final x4 J;
    public static final x4 g;
    public static final x4 h;
    public static final x4 i;
    public static final x4 j;
    public static final x4 k;
    public static final x4 l;
    public static final x4 m;
    public static final x4 n;
    public static final x4 o;
    public static final x4 p;
    public static final x4 q;
    public static final x4 r;
    public static final x4 s;
    public static final x4 t;
    public static final x4 u;
    public static final x4 v;
    public static final x4 w;
    public static final x4 x;
    public static final x4 y;
    public static final x4 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 1;
        g = new x4(i2, 0);
        h = new x4(i2, 1);
        i = new x4(i2, 2);
        j = new x4(i2, 3);
        k = new x4(i2, 4);
        l = new x4(i2, 5);
        m = new x4(i2, 6);
        n = new x4(i2, 7);
        o = new x4(i2, 8);
        p = new x4(i2, 9);
        q = new x4(i2, 10);
        r = new x4(i2, 11);
        s = new x4(i2, 12);
        t = new x4(i2, 13);
        u = new x4(i2, 14);
        v = new x4(i2, 15);
        w = new x4(i2, 16);
        x = new x4(i2, 17);
        y = new x4(i2, 18);
        z = new x4(i2, 19);
        A = new x4(i2, 20);
        B = new x4(i2, 21);
        C = new x4(i2, 22);
        D = new x4(i2, 23);
        E = new x4(i2, 24);
        F = new x4(i2, 25);
        G = new x4(i2, 26);
        H = new x4(i2, 27);
        I = new x4(i2, 28);
        J = new x4(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006a A[LOOP:0: B:15:0x0034->B:25:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x006d A[SYNTHETIC] */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i2 = this.f;
        ll2 ll2Var = ll2.a;
        switch (i2) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(((p02) obj).k().e.c(u02.B));
            case 2:
                sl1 sl1Var = (sl1) obj;
                a90 a90Var = u5.a;
                sl1Var.getClass();
                vv.N(sl1Var, a90Var);
                return ((Context) vv.N(sl1Var, u5.b)).getResources();
            case 3:
                return Boolean.valueOf(((p02) obj).k().e.c(u02.B));
            case 4:
                lv0[] lv0VarArr = w02.a;
                ((z02) obj).a(u02.y, ll2Var);
                return ll2Var;
            case 5:
                ((Number) obj).longValue();
                return ll2Var;
            case 6:
                return ll2Var;
            case 7:
                lv0[] lv0VarArr2 = w02.a;
                ((z02) obj).a(u02.x, ll2Var);
                return ll2Var;
            case 8:
                return ll2Var;
            case 9:
                return obj;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 12:
                long jA = dr.a(((dr) obj).a, qr.x);
                return new sb(dr.c(jA), dr.g(jA), dr.f(jA), dr.d(jA));
            case 13:
                ((Number) obj).longValue();
                return ll2Var;
            case 14:
                wu wuVar = (wu) obj;
                ax0 ax0Var = wuVar instanceof ax0 ? (ax0) wuVar : null;
                if (ax0Var != null && ax0Var.R) {
                    vp0.b("Apply is called on deactivated node " + wuVar);
                }
                return ll2Var;
            case 15:
                return Boolean.valueOf(!(((s71) obj) instanceof bv));
            case 16:
                float[] fArr = ((q61) obj).a;
                return ll2Var;
            case 17:
                float[] fArr2 = ((q61) obj).a;
                return ll2Var;
            case 18:
                return Boolean.valueOf(sv0.Q(obj));
            case 19:
                long j2 = ((ai2) obj).a;
                return new qb(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 20:
                qb qbVar = (qb) obj;
                return new ai2(j12.d(qbVar.a, qbVar.b));
            case 21:
                return s5.T(0.0f, 0.0f, null, 7);
            case 22:
                ((Number) obj).intValue();
                return 0;
            case 23:
                ((Number) obj).intValue();
                return 0;
            case 24:
                return nb0.c;
            case 25:
                return ll2Var;
            case 26:
                return ll2Var;
            case 27:
                return ll2Var;
            case 28:
                l80.c0((l80) obj, dr.f, 0L, 0L, 126);
                return ll2Var;
            default:
                lm1 lm1Var = (lm1) obj;
                if (lm1Var.y()) {
                    x41 x41Var = lm1Var.f;
                    if (!x41Var.o) {
                        ej0 ej0VarD = lm1Var.e.d();
                        w91 w91Var = x41Var.r;
                        if (ej0VarD != null) {
                            x41Var.u0(lm1Var, 9223372034707292159L, 0L);
                            x41Var.k = ej0VarD;
                        } else if (w91Var != null) {
                            Object[] objArr = w91Var.c;
                            long[] jArr = w91Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j3 = jArr[i3];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            if ((255 & j3) < 128) {
                                                x41Var.F0((x91) objArr[(i3 << 3) + i5]);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i4 == 8) {
                                            if (i3 != length) {
                                                i3++;
                                            }
                                        }
                                    } else if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                            w91Var.a();
                        }
                    }
                }
                return ll2Var;
        }
    }
}
