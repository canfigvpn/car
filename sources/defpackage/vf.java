package defpackage;

import android.app.Activity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ vf(ak0 ak0Var, io ioVar, k52 k52Var, p81 p81Var) {
        this.e = 6;
        this.f = ak0Var;
        this.g = ioVar;
        this.h = k52Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i;
        cx cxVar;
        int i2;
        cx cxVar2;
        yr1 yr1Var;
        Object value;
        int i3 = this.e;
        int i4 = 0;
        ll2 ll2Var = ll2.a;
        sx sxVar = null;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i3) {
            case 0:
                ((wf) obj3).a();
                ff ffVar = (ff) ((xf) obj2).g;
                int i5 = ((es1) obj).e;
                do {
                    i = ffVar.get();
                } while (!ffVar.compareAndSet(i, ((i >>> 27) & 15) == i5 ? i - 1 : i));
                return ll2Var;
            case 1:
                mh2 mh2Var = (mh2) obj3;
                ez ezVar = (ez) obj2;
                da1 da1Var = (da1) obj;
                if (mh2Var.b()) {
                    nj2.y(ezVar, null, new hi(i4, sxVar, mh2Var), 3);
                    da1Var.setValue(Boolean.FALSE);
                }
                return ll2Var;
            case 2:
                jk jkVar = (jk) obj3;
                yr1 yr1VarF0 = jk.F0(jkVar, (me1) obj2, (v4) obj);
                if (yr1VarF0 == null) {
                    return null;
                }
                cx cxVar3 = jkVar.s;
                if (qr0.a(cxVar3.y, 0L)) {
                    yp0.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return yr1VarF0.i(cxVar3.I0(yr1VarF0, cxVar3.y, 0L) ^ (-9223372034707292160L));
            case 3:
                ((ej0) obj3).h((ni0) obj2);
                ((da1) obj).setValue(Boolean.FALSE);
                return ll2Var;
            case 4:
                ((da1) obj).setValue(Boolean.FALSE);
                ((ao) obj3).b.a(((wm) obj2).a);
                return ll2Var;
            case 5:
                cx cxVar4 = (cx) obj3;
                wl2 wl2Var = (wl2) obj2;
                mk mkVar = (mk) obj;
                ck ckVar = cxVar4.w;
                while (true) {
                    fa1 fa1Var = ckVar.a;
                    int i6 = fa1Var.g;
                    boolean zG0 = true;
                    if (i6 == 0) {
                        cxVar = cxVar4;
                        i2 = 1;
                    } else {
                        if (i6 == 0) {
                            fu1.k("MutableVector is empty.");
                            return null;
                        }
                        yr1 yr1Var2 = (yr1) ((zw) fa1Var.e[i6 - 1]).a.a();
                        if (yr1Var2 == null) {
                            cxVar = cxVar4;
                            i2 = 1;
                        } else {
                            cxVar = cxVar4;
                            i2 = 1;
                            zG0 = cx.G0(cxVar, yr1Var2, 0L, 0L, 3);
                        }
                        if (zG0) {
                            fa1 fa1Var2 = ckVar.a;
                            ((zw) fa1Var2.k(fa1Var2.g - i2)).b.i(ll2Var);
                            cxVar4 = cxVar;
                        }
                    }
                }
                if (!cxVar.x || (yr1Var = (yr1) cxVar.v.a()) == null) {
                    cxVar2 = cxVar;
                } else {
                    cxVar2 = cxVar;
                    if (cx.G0(cxVar2, yr1Var, 0L, 0L, 3) == i2) {
                        cxVar2.x = false;
                    }
                }
                wl2Var.e = cxVar2.F0(mkVar, 0L);
                return ll2Var;
            case 6:
                ak0 ak0Var = (ak0) obj3;
                io ioVar = (io) obj2;
                k52 k52Var = (k52) obj;
                ev evVar = ak0Var.M;
                io ioVar2 = evVar.b;
                try {
                    evVar.b = ioVar;
                    k52 k52Var2 = ak0Var.G;
                    int[] iArr = ak0Var.o;
                    d91 d91Var = ak0Var.v;
                    ak0Var.o = null;
                    ak0Var.v = null;
                    try {
                        ak0Var.G = k52Var;
                        boolean z = evVar.e;
                        try {
                            evVar.e = false;
                            ak0Var.C(null, null);
                            evVar.e = z;
                            ak0Var.G = k52Var2;
                            ak0Var.o = iArr;
                            ak0Var.v = d91Var;
                            evVar.b = ioVar2;
                            return ll2Var;
                        } catch (Throwable th) {
                            evVar.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ak0Var.G = k52Var2;
                        ak0Var.o = iArr;
                        ak0Var.v = d91Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    evVar.b = ioVar2;
                    throw th3;
                }
            case 7:
                q01 q01Var = (q01) obj2;
                f01 f01Var = (f01) ((v40) obj3).getValue();
                return new g01(q01Var, f01Var, (vy0) obj, new h7((lr0) q01Var.e.f.getValue(), f01Var));
            case 8:
                ((ej0) obj3).h((String) obj2);
                ((da1) obj).setValue(Boolean.FALSE);
                return ll2Var;
            case 9:
                ((ej0) obj3).h(Long.valueOf(((u22) obj2).a));
                ((da1) obj).setValue(Boolean.FALSE);
                return ll2Var;
            case 10:
                vj0 vj0Var = (vj0) obj3;
                o52 o52Var = (o52) obj2;
                ai1 ai1Var = (ai1) obj;
                if (vj0Var != null) {
                    o52Var.a(o52Var.c(vj0Var) - o52Var.t);
                }
                List listO = sv0.O(o52Var, null, o52Var.t, null);
                uu uuVar = (uu) vq.X(listO);
                Integer num = uuVar != null ? uuVar.b : null;
                List listC = ai1Var.c(num);
                if (num != null && !listC.isEmpty()) {
                    listC = vq.a0(vs0.u(new uu(((uu) vq.Q(listC)).a, null, num)), vq.P(listC));
                }
                return new su(vq.a0(listO, listC), ai1Var.f());
            default:
                dh dhVar = (dh) obj2;
                Activity activity = (Activity) obj;
                s82 s82Var = ((ph) obj3).c;
                do {
                    value = s82Var.getValue();
                } while (!s82Var.h(value, nh.a((nh) value, false, null, null, 3)));
                if ((dhVar instanceof bh) && ((bh) dhVar).c && activity != null) {
                    activity.recreate();
                }
                return ll2Var;
        }
    }

    public /* synthetic */ vf(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
