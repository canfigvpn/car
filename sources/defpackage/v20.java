package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v20 extends wa2 implements ij0 {
    public final /* synthetic */ int i = 0;
    public ds1 j;
    public int k;
    public final /* synthetic */ float l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ xx1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(j62 j62Var, float f, ej0 ej0Var, xx1 xx1Var, sx sxVar) {
        super(2, sxVar);
        this.m = j62Var;
        this.l = f;
        this.n = ej0Var;
        this.o = xx1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        ez ezVar = (ez) obj;
        sx sxVar = (sx) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((v20) p(sxVar, ezVar)).r(ll2Var);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                m01 m01Var = (m01) this.o;
                return new v20(this.l, (w20) obj2, m01Var, sxVar);
            default:
                xx1 xx1Var = this.o;
                return new v20((j62) this.m, this.l, (ej0) obj2, xx1Var, sxVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [g62] */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        ds1 ds1Var;
        ob obVar;
        final ds1 ds1Var2;
        Object objD;
        char c;
        int i = this.i;
        fz fzVar = fz.e;
        float f = this.l;
        Object obj2 = this.n;
        final int i2 = 0;
        float f2 = 0.0f;
        boolean z = true;
        switch (i) {
            case 0:
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obVar = (ob) this.m;
                    ds1Var = this.j;
                    try {
                        ix.Q(obj);
                    } catch (CancellationException unused) {
                        ds1Var.e = ((Number) obVar.a()).floatValue();
                    }
                    f = ds1Var.e;
                    break;
                } else {
                    ix.Q(obj);
                    if (Math.abs(f) > 1.0f) {
                        ds1Var = new ds1();
                        ds1Var.e = f;
                        ds1 ds1Var3 = new ds1();
                        ob obVarA = j20.a(0.0f, f, 28);
                        try {
                            w20 w20Var = (w20) obj2;
                            l20 l20Var = w20Var.a;
                            o1 o1Var = new o1(ds1Var3, (m01) this.o, ds1Var, w20Var);
                            this.j = ds1Var;
                            this.m = obVarA;
                            this.k = 1;
                            if (c12.c(obVarA, l20Var, false, o1Var, this) == fzVar) {
                                return fzVar;
                            }
                        } catch (CancellationException unused2) {
                            obVar = obVarA;
                            ds1Var.e = ((Number) obVar.a()).floatValue();
                        }
                        f = ds1Var.e;
                    }
                }
                return new Float(f);
            default:
                final ej0 ej0Var = (ej0) obj2;
                j62 j62Var = (j62) this.m;
                int i4 = this.k;
                char c2 = 2;
                if (i4 == 0) {
                    ix.Q(obj);
                    ix.m(j62Var.b, f);
                    if (Float.isNaN(0.0f)) {
                        yp0.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    ds1Var2 = new ds1();
                    float fSignum = Math.signum(f) * Math.abs(0.0f);
                    ds1Var2.e = fSignum;
                    ej0Var.h(new Float(fSignum));
                    float f3 = ds1Var2.e;
                    ?? r4 = new ej0() { // from class: g62
                        @Override // defpackage.ej0
                        public final Object h(Object obj3) {
                            int i5 = i2;
                            ll2 ll2Var = ll2.a;
                            ej0 ej0Var2 = ej0Var;
                            ds1 ds1Var4 = ds1Var2;
                            float fFloatValue = ((Float) obj3).floatValue();
                            switch (i5) {
                                case 0:
                                    float f4 = ds1Var4.e - fFloatValue;
                                    ds1Var4.e = f4;
                                    ej0Var2.h(Float.valueOf(f4));
                                    break;
                                default:
                                    float f5 = ds1Var4.e - fFloatValue;
                                    ds1Var4.e = f5;
                                    ej0Var2.h(Float.valueOf(f5));
                                    break;
                            }
                            return ll2Var;
                        }
                    };
                    this.j = ds1Var2;
                    this.k = 1;
                    objD = j62Var.d(this.o, f3, this.l, r4, this);
                    if (objD != fzVar) {
                    }
                    return fzVar;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        ix.Q(obj);
                        return obj;
                    }
                    fu1.h("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ds1 ds1Var4 = this.j;
                ix.Q(obj);
                ds1Var2 = ds1Var4;
                objD = obj;
                ob obVar2 = (ob) objD;
                ao2 ao2Var = j62Var.a;
                float fFloatValue = ((Number) obVar2.a()).floatValue();
                dq0 dq0Var = (dq0) ao2Var.f;
                q01 q01Var = (q01) dq0Var.f;
                List list = q01Var.j().k;
                is1 is1Var = (is1) dq0Var.g;
                int size = list.size();
                float f4 = Float.NEGATIVE_INFINITY;
                float f5 = Float.POSITIVE_INFINITY;
                while (i2 < size) {
                    l01 l01Var = (l01) list.get(i2);
                    float f6 = f2;
                    l01 l01Var2 = l01Var != null ? l01Var : null;
                    if (l01Var2 == null || l01Var2.p != z) {
                        k01 k01VarJ = q01Var.j();
                        c = c2;
                        int iG = (int) (k01VarJ.o == di1.e ? k01VarJ.g() & 4294967295L : k01VarJ.g() >> 32);
                        int i5 = -q01Var.j().l;
                        int i6 = q01Var.j().p;
                        int i7 = l01Var.m;
                        int i8 = l01Var.l;
                        int i9 = q01Var.j().n;
                        is1Var.getClass();
                        float f7 = i8 - ((((iG - i5) - i6) / 2) - (i7 / 2));
                        if (f7 <= f6 && f7 > f4) {
                            f4 = f7;
                        }
                        if (f7 >= f6 && f7 < f5) {
                            f5 = f7;
                        }
                    } else {
                        is1Var = is1Var;
                        fFloatValue = fFloatValue;
                        c = c2;
                    }
                    i2++;
                    fFloatValue = fFloatValue;
                    is1Var = is1Var;
                    f2 = f6;
                    c2 = c;
                    z = true;
                }
                float f8 = fFloatValue;
                float f9 = f2;
                char c3 = c2;
                char c4 = Math.abs(f8) < ((k01) q01Var.f.getValue()).i.x(400.0f) ? (char) 0 : f8 > f9 ? (char) 1 : c3;
                if (c4 == 0) {
                    if (Math.abs(f5) <= Math.abs(f4)) {
                        f4 = f5;
                    }
                } else if (c4 == 1) {
                    f4 = f5;
                } else if (c4 != c3) {
                    f4 = f9;
                }
                float f10 = (f4 == Float.POSITIVE_INFINITY || f4 == Float.NEGATIVE_INFINITY) ? f9 : f4;
                if (Float.isNaN(f10)) {
                    yp0.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                ds1Var2.e = f10;
                ob obVarK = j20.k(obVar2, f9, f9, 30);
                g82 g82Var = j62Var.c;
                final int i10 = 1;
                ej0 ej0Var2 = new ej0() { // from class: g62
                    @Override // defpackage.ej0
                    public final Object h(Object obj3) {
                        int i11 = i10;
                        ll2 ll2Var = ll2.a;
                        ej0 ej0Var3 = ej0Var;
                        ds1 ds1Var5 = ds1Var2;
                        float fFloatValue2 = ((Float) obj3).floatValue();
                        switch (i11) {
                            case 0:
                                float f11 = ds1Var5.e - fFloatValue2;
                                ds1Var5.e = f11;
                                ej0Var3.h(Float.valueOf(f11));
                                break;
                            default:
                                float f12 = ds1Var5.e - fFloatValue2;
                                ds1Var5.e = f12;
                                ej0Var3.h(Float.valueOf(f12));
                                break;
                        }
                        return ll2Var;
                    }
                };
                this.j = null;
                this.k = 2;
                Object objF = r02.f(this.o, f10, f10, obVarK, g82Var, ej0Var2, this);
                if (objF != fzVar) {
                    return objF;
                }
                return fzVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v20(float f, w20 w20Var, m01 m01Var, sx sxVar) {
        super(2, sxVar);
        this.l = f;
        this.n = w20Var;
        this.o = m01Var;
    }
}
