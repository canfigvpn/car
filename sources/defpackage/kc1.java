package defpackage;

import android.database.SQLException;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kc1 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ kc1(xd2 xd2Var, ii2 ii2Var, da1 da1Var) {
        this.e = 14;
        this.f = ii2Var;
        this.g = da1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        b21 b21VarH;
        int i = 3;
        int i2 = 0;
        int i3 = 4;
        int i4 = 6;
        switch (this.e) {
            case 0:
                return new gg(i, (p82) this.f, (hu) this.g);
            case 1:
                ic1 ic1Var = (ic1) this.f;
                y11 y11Var = (y11) this.g;
                ic1Var.getClass();
                y11Var.getClass();
                rb1 rb1Var = ic1Var.b;
                q1 q1Var = rb1Var.r;
                if (!y11Var.equals(rb1Var.n)) {
                    y11 y11Var2 = rb1Var.n;
                    if (y11Var2 != null && (b21VarH = y11Var2.h()) != null) {
                        b21VarH.f(q1Var);
                    }
                    rb1Var.n = y11Var;
                    y11Var.h().a(q1Var);
                }
                return new n8(3);
            case 2:
                rf1 rf1Var = (rf1) this.f;
                ArrayList arrayList = (ArrayList) this.g;
                vv1 vv1Var = (vv1) obj;
                vv1Var.getClass();
                zm zmVar = rf1Var.b;
                xv1 xv1VarC = vv1Var.C("INSERT OR ABORT INTO `odometer_readings` (`id`,`carId`,`epochDay`,`odometerKm`,`source`,`recordId`) VALUES (nullif(?, 0),?,?,?,?,?)");
                try {
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (obj2 != null) {
                            zmVar.n(xv1VarC, obj2);
                            xv1VarC.y();
                            xv1VarC.D();
                        }
                    }
                    ir2.h(xv1VarC, null);
                    return ll2.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ir2.h(xv1VarC, th);
                        throw th2;
                    }
                }
            case 3:
                rf1 rf1Var2 = (rf1) this.f;
                sf1 sf1Var = (sf1) this.g;
                vv1 vv1Var2 = (vv1) obj;
                vv1Var2.getClass();
                return Long.valueOf(rf1Var2.b.G(vv1Var2, sf1Var));
            case 4:
                fj1 fj1Var = (fj1) this.f;
                jm1 jm1Var = (jm1) this.g;
                im1 im1Var = (im1) obj;
                boolean z = fj1Var.w;
                float f = fj1Var.s;
                if (z) {
                    im1.k(im1Var, jm1Var, im1Var.O(f), im1Var.O(fj1Var.t));
                } else {
                    im1Var.h(jm1Var, im1Var.O(f), im1Var.O(fj1Var.t), 0.0f);
                }
                return ll2.a;
            case 5:
                bg bgVar = (bg) this.f;
                nu nuVar = (nu) this.g;
                bgVar.a(nuVar);
                return new gg(i3, bgVar, nuVar);
            case 6:
                p82 p82Var = (p82) this.f;
                p82 p82Var2 = (p82) this.g;
                l80 l80Var = (l80) obj;
                float fX = l80Var.x(2.0f);
                float f2 = fX / 2.0f;
                l80.C(l80Var, ((dr) p82Var.getValue()).a, l80Var.x(j20.M / 2.0f) - f2, 0L, new p92(fX, 0.0f, 0, 0, 30), 108);
                if (w60.a(((w60) p82Var2.getValue()).e, 0.0f) > 0) {
                    l80.C(l80Var, ((dr) p82Var.getValue()).a, l80Var.x(((w60) p82Var2.getValue()).e) - f2, 0L, fd0.a, 108);
                }
                return ll2.a;
            case 7:
                qv qvVar = (qv) this.f;
                x91 x91Var = (x91) this.g;
                qvVar.z(obj);
                if (x91Var != null) {
                    x91Var.a(obj);
                }
                return ll2.a;
            case 8:
                rr1 rr1Var = (rr1) this.f;
                Throwable th3 = (Throwable) this.g;
                Throwable th4 = (Throwable) obj;
                synchronized (rr1Var.c) {
                    if (th3 == null) {
                        th3 = null;
                    } else if (th4 != null) {
                        try {
                            if (th4 instanceof CancellationException) {
                                th4 = null;
                            }
                            if (th4 != null) {
                                vv.e(th3, th4);
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    rr1Var.e = th3;
                    s82 s82Var = rr1Var.u;
                    or1 or1Var = or1.e;
                    s82Var.getClass();
                    s82Var.j(null, or1Var);
                }
                return ll2.a;
            case 9:
                ((ha1) this.f).a.setValue(new gc0((uo2) this.g, (uo2) obj));
                return ll2.a;
            case 10:
                sy1 sy1Var = (sy1) this.f;
                uy1 uy1Var = (uy1) this.g;
                k70 k70Var = (k70) obj;
                float f3 = k70Var.b ? -1.0f : 1.0f;
                long j = k70Var.a;
                sy1Var.a(1, uf1.f(f3, uy1Var.d == di1.f ? uf1.a(0.0f, 1, j) : uf1.a(0.0f, 2, j)));
                return ll2.a;
            case 11:
                s22 s22Var = (s22) this.f;
                xn xnVar = (xn) this.g;
                vv1 vv1Var3 = (vv1) obj;
                vv1Var3.getClass();
                dq0 dq0Var = s22Var.b;
                try {
                    ((zm) dq0Var.f).F(vv1Var3, xnVar);
                    break;
                } catch (SQLException e) {
                    dq0.l(e);
                    ((an) dq0Var.g).A(vv1Var3, xnVar);
                }
                return ll2.a;
            case 12:
                s22 s22Var2 = (s22) this.f;
                ArrayList arrayList2 = (ArrayList) this.g;
                vv1 vv1Var4 = (vv1) obj;
                vv1Var4.getClass();
                dq0 dq0Var2 = s22Var2.b;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    try {
                        ((zm) dq0Var2.f).F(vv1Var4, obj3);
                    } catch (SQLException e2) {
                        dq0.l(e2);
                        ((an) dq0Var2.g).A(vv1Var4, obj3);
                    }
                }
                return ll2.a;
            case 13:
                w22 w22Var = (w22) this.f;
                x22 x22Var = (x22) this.g;
                vv1 vv1Var5 = (vv1) obj;
                vv1Var5.getClass();
                return Long.valueOf(w22Var.b.G(vv1Var5, x22Var));
            case 14:
                p82 p82Var3 = (p82) this.f;
                da1 da1Var = (da1) this.g;
                d52 d52Var = (d52) obj;
                float fFloatValue = ((Number) p82Var3.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (d52Var.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d52Var.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((d52) da1Var.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((d52) da1Var.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    da1Var.setValue(new d52((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return ll2.a;
            case 15:
                sl slVar = (sl) obj;
                return slVar.a(new y3(i4, new kc1(16, ((u32) this.f).a(slVar.e.d(), slVar.e.getLayoutDirection(), slVar), (kd2) this.g)));
            case 16:
                qx.y((l80) obj, (mx) this.f, ((dr) ((kd2) this.g).a.get()).a);
                return ll2.a;
            case 17:
                return new gg(5, (da1) this.f, (f91) this.g);
            case 18:
                ti0 ti0Var = (ti0) this.f;
                ti0 ti0Var2 = (ti0) this.g;
                ad2 ad2Var = (ad2) obj;
                ti0Var.a();
                if (ti0Var2 != null ? ((Boolean) ti0Var2.a()).booleanValue() : true) {
                    ad2Var.close();
                }
                return ll2.a;
            case 19:
                nj2.y((ez) this.f, null, new oc1((ki2) this.g, null), 1);
                return new n8(4);
            case 20:
                ki2 ki2Var = (ki2) this.f;
                ii2 ii2Var = (ii2) this.g;
                ki2Var.i.add(ii2Var);
                return new gg(8, ki2Var, ii2Var);
            case 21:
                ki2 ki2Var2 = (ki2) this.f;
                ki2 ki2Var3 = (ki2) this.g;
                ki2Var2.j.add(ki2Var3);
                return new gg(i4, ki2Var2, ki2Var3);
            case 22:
                return new gg(7, (ki2) this.f, (fi2) this.g);
            case 23:
                ru1 ru1Var = (ru1) this.f;
                bk2 bk2Var = (bk2) this.g;
                ek2 ek2Var = (ek2) obj;
                synchronized (((iq1) ru1Var.b)) {
                    try {
                        boolean zC = ek2Var.c();
                        e51 e51Var = (e51) ru1Var.c;
                        if (zC) {
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return ll2.a;
            case 24:
                wl2 wl2Var = (wl2) this.f;
                ej0 ej0Var = (ej0) this.g;
                ((Long) obj).getClass();
                float f4 = wl2Var.e;
                wl2Var.e = 0.0f;
                ej0Var.h(Float.valueOf(f4));
                return ll2.a;
            default:
                fq2 fq2Var = (fq2) this.f;
                View view = (View) this.g;
                fq2Var.a(view);
                return new gg(9, fq2Var, view);
        }
    }

    public /* synthetic */ kc1(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
