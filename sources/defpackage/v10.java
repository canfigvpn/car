package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v10 implements jj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v10(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.jj0
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        int i2 = 3;
        ll2 ll2Var = ll2.a;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                lh2 lh2Var = (lh2) obj;
                ak0 ak0Var = (ak0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ak0Var.f(lh2Var) : ak0Var.h(lh2Var) ? 4 : 2;
                }
                if (ak0Var.O(iIntValue & 1, (iIntValue & 19) != 18)) {
                    jh2.a(lh2Var, null, 0.0f, null, 0L, 0L, vs0.C(1905952188, new i00((String) obj4, true ? 1 : 0), ak0Var), ak0Var, (iIntValue & 14) | 805306368);
                } else {
                    ak0Var.R();
                }
                return ll2Var;
            case 1:
                long j = ((dr) obj).a;
                ak0 ak0Var2 = (ak0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ak0Var2.e(j) ? 4 : 2;
                }
                if (ak0Var2.O(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    v30.b(((uc2) obj4).c, j, ak0Var2, (iIntValue2 << 3) & 112);
                } else {
                    ak0Var2.R();
                }
                return ll2Var;
            case 2:
                ak0 ak0Var3 = (ak0) obj2;
                ((Number) obj3).intValue();
                Object objL = ak0Var3.L();
                if (objL == cv.a) {
                    objL = new n30(i2);
                    ak0Var3.g0(objL);
                }
                AtomicInteger atomicInteger = l02.a;
                gq gqVar = new gq((ej0) objL);
                gt gtVar = (gt) obj4;
                sv1 sv1VarA = rv1.a(ws0.e, q90.o, ak0Var3, 0);
                int iX = ws0.x(ak0Var3);
                sl1 sl1VarL = ak0Var3.l();
                u71 u71VarB = nj2.B(ak0Var3, gqVar);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var3.Z();
                if (ak0Var3.S) {
                    ak0Var3.k(wvVar);
                } else {
                    ak0Var3.j0();
                }
                p12.l(vu.f, ak0Var3, sv1VarA);
                p12.l(vu.e, ak0Var3, sl1VarL);
                ra raVar = vu.g;
                if (ak0Var3.S || !ws0.j(ak0Var3.L(), Integer.valueOf(iX))) {
                    k3.p(iX, ak0Var3, iX, raVar);
                }
                p12.l(vu.d, ak0Var3, u71VarB);
                r02.b(ak0Var3, f52.n(r71.a, 12.0f));
                gtVar.g(ak0Var3, 0);
                ak0Var3.p(true);
                return ll2Var;
            case 3:
                ak0 ak0Var4 = (ak0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if (ak0Var4.O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ((ij0) obj4).g(ak0Var4, 0);
                } else {
                    ak0Var4.R();
                }
                return ll2Var;
            case 4:
                long j2 = ((dr) obj).a;
                ak0 ak0Var5 = (ak0) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (ak0Var5.O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    is1.q.f((Drawable) obj4, ak0Var5, 48);
                } else {
                    ak0Var5.R();
                }
                return ll2Var;
            case 5:
                long j3 = ((dr) obj).a;
                ak0 ak0Var6 = (ak0) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (ak0Var6.O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    is1.q.g(((RemoteAction) obj4).getIcon(), ak0Var6, 48);
                } else {
                    ak0Var6.R();
                }
                return ll2Var;
            default:
                u71 u71Var = (u71) obj;
                ak0 ak0Var7 = (ak0) obj2;
                ((Number) obj3).intValue();
                ak0Var7.W(-1498516085);
                g82 g82VarQ = rw.Q(h81.f, ak0Var7);
                g82 g82VarQ2 = rw.Q(h81.h, ak0Var7);
                ki2 ki2Var = (ki2) obj4;
                mj2 mj2Var = ir2.V;
                tu tuVar = ki2Var.a;
                dk1 dk1Var = ki2Var.d;
                boolean zBooleanValue = ((Boolean) tuVar.f()).booleanValue();
                ak0Var7.W(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                ak0Var7.p(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) dk1Var.getValue()).booleanValue();
                ak0Var7.W(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                ak0Var7.p(false);
                Float fValueOf2 = Float.valueOf(f2);
                ki2Var.f();
                ak0Var7.W(386845748);
                ak0Var7.p(false);
                ii2 ii2VarC = oi2.c(ki2Var, fValueOf, fValueOf2, g82VarQ, mj2Var, ak0Var7, 196608);
                boolean zBooleanValue3 = ((Boolean) ki2Var.a.f()).booleanValue();
                ak0Var7.W(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                ak0Var7.p(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) dk1Var.getValue()).booleanValue();
                ak0Var7.W(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                ak0Var7.p(false);
                Float fValueOf4 = Float.valueOf(f4);
                ki2Var.f();
                ak0Var7.W(-281714272);
                ak0Var7.p(false);
                u71 u71VarU = nj2.u(u71Var, ((Number) ii2VarC.n.getValue()).floatValue(), ((Number) ii2VarC.n.getValue()).floatValue(), ((Number) oi2.c(ki2Var, fValueOf3, fValueOf4, g82VarQ2, mj2Var, ak0Var7, 196608).n.getValue()).floatValue(), 0.0f, null, 131064);
                ak0Var7.p(false);
                return u71VarU;
        }
    }
}
