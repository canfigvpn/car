package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nn extends wa2 implements ej0 {
    public int i;
    public long j;
    public int k;
    public final /* synthetic */ vn l;
    public final /* synthetic */ wm m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(vn vnVar, wm wmVar, sx sxVar) {
        super(1, sxVar);
        this.l = vnVar;
        this.m = wmVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        return new nn(this.l, this.m, (sx) obj).r(ll2.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f A[LOOP:0: B:22:0x0099->B:24:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        int iA;
        Object objR;
        long jLongValue;
        Object objA;
        long j;
        ArrayList arrayList;
        wm wmVar;
        Object objR2;
        int i;
        long j2;
        rf1 rf1Var;
        sf1 sf1Var;
        long j3;
        long j4;
        int i2 = this.k;
        int i3 = 0;
        wm wmVar2 = this.m;
        vn vnVar = this.l;
        fz fzVar = fz.e;
        if (i2 == 0) {
            ix.Q(obj);
            vnVar.b.getClass();
            iA = jb2.a();
            bn bnVar = vnVar.c;
            cn cnVarK = ei1.K(wm.a(wmVar2, iA, iA));
            this.i = iA;
            this.k = 1;
            objR = sv.R(this, new ym(bnVar, cnVarK, i3), bnVar.a, false, true);
            if (objR != fzVar) {
            }
            return fzVar;
        }
        if (i2 == 1) {
            iA = this.i;
            ix.Q(obj);
            objR = obj;
        } else {
            if (i2 == 2) {
                jLongValue = this.j;
                iA = this.i;
                ix.Q(obj);
                objA = obj;
                j = jLongValue;
                Iterable<x22> iterable = (Iterable) objA;
                arrayList = new ArrayList(wq.G(iterable, 10));
                for (x22 x22Var : iterable) {
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(new xn(j, x22Var.a, x22Var.e, x22Var.f, true));
                    arrayList = arrayList2;
                    wmVar2 = wmVar2;
                }
                wmVar = wmVar2;
                s22 s22Var = vnVar.e;
                this.i = iA;
                this.j = j;
                this.k = 3;
                bv1 bv1Var = s22Var.a;
                objR2 = sv.R(this, new kc1(12, s22Var, arrayList), bv1Var, false, true);
                if (objR2 != fzVar) {
                    objR2 = ll2.a;
                }
                if (objR2 != fzVar) {
                    i = iA;
                    j2 = j;
                    rf1Var = vnVar.f;
                    sf1Var = new sf1(0L, j2, i, wmVar.h, "INITIAL", null);
                    j3 = j2;
                    this.i = i;
                    this.j = j3;
                    this.k = 4;
                    if (rf1Var.a(sf1Var, this) != fzVar) {
                        j4 = j3;
                    }
                }
                return fzVar;
            }
            if (i2 == 3) {
                long j5 = this.j;
                int i4 = this.i;
                ix.Q(obj);
                j2 = j5;
                wmVar = wmVar2;
                i = i4;
                rf1Var = vnVar.f;
                sf1Var = new sf1(0L, j2, i, wmVar.h, "INITIAL", null);
                j3 = j2;
                this.i = i;
                this.j = j3;
                this.k = 4;
                if (rf1Var.a(sf1Var, this) != fzVar) {
                    j4 = j3;
                }
                return fzVar;
            }
            if (i2 != 4) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = this.j;
            ix.Q(obj);
        }
        return new Long(j4);
        jLongValue = ((Number) objR).longValue();
        w22 w22Var = vnVar.d;
        this.i = iA;
        this.j = jLongValue;
        this.k = 2;
        objA = w22Var.a(this);
        if (objA != fzVar) {
            j = jLongValue;
            Iterable<x22> iterable2 = (Iterable) objA;
            arrayList = new ArrayList(wq.G(iterable2, 10));
            while (r6.hasNext()) {
                ArrayList arrayList3 = arrayList;
                arrayList3.add(new xn(j, x22Var.a, x22Var.e, x22Var.f, true));
                arrayList = arrayList3;
                wmVar2 = wmVar2;
            }
            wmVar = wmVar2;
            s22 s22Var2 = vnVar.e;
            this.i = iA;
            this.j = j;
            this.k = 3;
            bv1 bv1Var2 = s22Var2.a;
            objR2 = sv.R(this, new kc1(12, s22Var2, arrayList), bv1Var2, false, true);
            if (objR2 != fzVar) {
                objR2 = ll2.a;
            }
            if (objR2 != fzVar) {
                i = iA;
                j2 = j;
                rf1Var = vnVar.f;
                sf1Var = new sf1(0L, j2, i, wmVar.h, "INITIAL", null);
                j3 = j2;
                this.i = i;
                this.j = j3;
                this.k = 4;
                if (rf1Var.a(sf1Var, this) != fzVar) {
                    j4 = j3;
                    return new Long(j4);
                }
            }
        }
        return fzVar;
    }
}
