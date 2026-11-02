package defpackage;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cv1 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv1(int i, sx sxVar, Object obj, Object obj2) {
        super(2, sxVar);
        this.i = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) throws Throwable {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 1:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 2:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 3:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 4:
                ((cv1) p((sx) obj2, (qe0) obj)).r(ll2Var);
                return fz.e;
            case 5:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 6:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 7:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
            case 8:
                return ((cv1) p((sx) obj2, obj)).r(ll2Var);
            default:
                return ((cv1) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                cv1 cv1Var = new cv1(0, sxVar, (ej0) obj2);
                cv1Var.k = obj;
                return cv1Var;
            case 1:
                return new cv1(1, sxVar, (m70) this.k, (ny1) obj2);
            case 2:
                return new cv1(2, sxVar, (ur0) this.k, (ak1) obj2);
            case 3:
                return new cv1(3, sxVar, (u52) this.k, (y0) obj2);
            case 4:
                cv1 cv1Var2 = new cv1(4, sxVar, (ea2) obj2);
                cv1Var2.k = obj;
                return cv1Var2;
            case 5:
                return new cv1(5, sxVar, (jp) this.k, (nb) obj2);
            case 6:
                return new cv1(6, sxVar, (ot0) this.k, (pp1) obj2);
            case 7:
                return new cv1(7, sxVar, (ij2) this.k, (ti0) obj2);
            case 8:
                cv1 cv1Var3 = new cv1(8, sxVar, (qe0) obj2);
                cv1Var3.k = obj;
                return cv1Var3;
            default:
                return new cv1(9, sxVar, (rr1) this.k, (View) obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016e  */
    @Override // defpackage.sh
    public final Object r(Object obj) throws Throwable {
        long j;
        int i = this.i;
        int i2 = 2;
        int i3 = 0;
        byte b = 0;
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        Object obj2 = this.l;
        sx sxVar = null;
        switch (i) {
            case 0:
                int i4 = this.j;
                if (i4 == 0) {
                    ix.Q(obj);
                    if (((ez) this.k).h().p(vh2.f) != null) {
                        this.j = 1;
                        Object objH = ((ej0) obj2).h(this);
                        return objH == fzVar ? fzVar : objH;
                    }
                    fu1.h("Expected a TransactionElement in the CoroutineContext but none was found.");
                } else {
                    if (i4 == 1) {
                        ix.Q(obj);
                        return obj;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                int i5 = this.j;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                m70 m70Var = (m70) this.k;
                float f = m70Var.b ? -1.0f : 1.0f;
                uy1 uy1Var = ((ny1) obj2).R;
                long j2 = m70Var.a;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f)));
                this.j = 1;
                return uy1Var.b(jFloatToRawIntBits, false, this) == fzVar ? fzVar : ll2Var;
            case 2:
                int i6 = this.j;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                pe0 pe0VarA = ((ur0) this.k).a();
                k7 k7Var = new k7(4, (ak1) obj2);
                this.j = 1;
                return pe0VarA.a(k7Var, this) == fzVar ? fzVar : ll2Var;
            case 3:
                u52 u52Var = (u52) this.k;
                int i7 = this.j;
                if (i7 == 0) {
                    ix.Q(obj);
                    if (u52Var == null) {
                        return ll2Var;
                    }
                    u52Var.a.getClass();
                    y0 y0Var = (y0) obj2;
                    if (y0Var == null) {
                        j = 4000;
                    } else {
                        AccessibilityManager accessibilityManager = ((d4) y0Var).a;
                        if (Build.VERSION.SDK_INT >= 29) {
                            int iB = cc.b(accessibilityManager, 4000, 3);
                            j = iB == Integer.MAX_VALUE ? Long.MAX_VALUE : iB;
                        } else {
                            j = 4000;
                        }
                    }
                    this.j = 1;
                    if (mx.t(j, this) == fzVar) {
                        return fzVar;
                    }
                } else {
                    if (i7 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                om omVar = u52Var.b;
                if (!(omVar.u() instanceof ve1)) {
                    return ll2Var;
                }
                omVar.i(e62.e);
                return ll2Var;
            case 4:
                int i8 = this.j;
                if (i8 != 0) {
                    if (i8 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ix.Q(obj);
                        qj.e();
                    }
                    return null;
                }
                ix.Q(obj);
                j60 j60Var = new j60(6, new cs1(), (qe0) this.k, b == true ? 1 : 0);
                this.j = 1;
                ((ea2) obj2).a(j60Var, this);
                return fzVar;
            case 5:
                int i9 = this.j;
                if (i9 == 0) {
                    ix.Q(obj);
                    this.j = 1;
                    return ia.a((ia) ((jp) this.k).c, new Float(0.0f), (nb) obj2, this) == fzVar ? fzVar : ll2Var;
                }
                if (i9 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                int i10 = this.j;
                if (i10 == 0) {
                    ix.Q(obj);
                    ot0 ot0Var = (ot0) this.k;
                    this.j = 1;
                    if (ot0Var.A(this) != fzVar) {
                    }
                    return fzVar;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        ix.Q(obj);
                        return ll2Var;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ix.Q(obj);
                this.j = 2;
                if (((pp1) obj2).e(this) != fzVar) {
                    return ll2Var;
                }
                return fzVar;
            case 7:
                ti0 ti0Var = (ti0) obj2;
                int i11 = this.j;
                try {
                    if (i11 == 0) {
                        ix.Q(obj);
                        ij2 ij2Var = (ij2) this.k;
                        this.j = 1;
                        obj = ij2Var.b(this);
                        if (obj == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i11 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    ti0Var.a();
                    return ll2Var;
                } catch (Throwable th) {
                    ti0Var.a();
                    throw th;
                }
            case 8:
                int i12 = this.j;
                if (i12 == 0) {
                    ix.Q(obj);
                    Object obj3 = this.k;
                    this.j = 1;
                    return ((qe0) obj2).k(obj3, this) == fzVar ? fzVar : ll2Var;
                }
                if (i12 == 1) {
                    ix.Q(obj);
                    return ll2Var;
                }
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                rr1 rr1Var = (rr1) this.k;
                View view = (View) obj2;
                int i13 = this.j;
                try {
                    if (i13 == 0) {
                        ix.Q(obj);
                        this.j = 1;
                        Object objR = ex.r(rr1Var.u, new pr1(i2, sxVar, i3), this);
                        if (objR != fzVar) {
                            objR = ll2Var;
                        }
                        if (objR == fzVar) {
                            return fzVar;
                        }
                    } else {
                        if (i13 != 1) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    if (vq2.a(view) != rr1Var) {
                        return ll2Var;
                    }
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    return ll2Var;
                } catch (Throwable th2) {
                    if (vq2.a(view) == rr1Var) {
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
                    }
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv1(int i, sx sxVar, Object obj) {
        super(2, sxVar);
        this.i = i;
        this.l = obj;
    }
}
