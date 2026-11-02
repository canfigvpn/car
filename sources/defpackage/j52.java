package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class j52 extends tt1 implements ij0 {
    public Object g;
    public Iterator h;
    public int i;
    public int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Iterator m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j52(Iterator it, sx sxVar) {
        super(2, sxVar);
        this.m = it;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((j52) p((sx) obj2, (n12) obj)).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        j52 j52Var = new j52(this.m, sxVar);
        j52Var.l = obj;
        return j52Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        int i5;
        nu1 nu1Var;
        n12 n12Var = (n12) this.l;
        int i6 = this.k;
        boolean z = true;
        fz fzVar = fz.e;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 == 3) {
                        i4 = this.j;
                        int i7 = this.i;
                        Iterator it2 = this.h;
                        nu1 nu1Var2 = (nu1) this.g;
                        ix.Q(obj);
                        nu1Var2.b();
                        while (true) {
                            int i8 = nu1Var2.f;
                            Object[] objArr = nu1Var2.e;
                            if (!it2.hasNext()) {
                                i5 = i7;
                                nu1Var = nu1Var2;
                                break;
                            }
                            Object next = it2.next();
                            boolean z2 = z;
                            if (nu1Var2.a() == i8) {
                                fu1.h("ring buffer is full");
                                return null;
                            }
                            int i9 = nu1Var2.g;
                            int i10 = nu1Var2.h;
                            objArr[(i9 + i10) % i8] = next;
                            nu1Var2.h = i10 + 1;
                            if (nu1Var2.a() == i8) {
                                if (nu1Var2.h >= 2) {
                                    ArrayList arrayList2 = new ArrayList(nu1Var2);
                                    this.l = n12Var;
                                    this.g = nu1Var2;
                                    this.h = it2;
                                    this.i = i7;
                                    this.j = i4;
                                    this.k = 3;
                                    n12Var.b(this, arrayList2);
                                    return fzVar;
                                }
                                int i11 = i8 + (i8 >> 1) + 1;
                                if (i11 > 2) {
                                    i11 = 2;
                                }
                                nu1Var2 = new nu1(nu1Var2.h, nu1Var2.g == 0 ? Arrays.copyOf(objArr, i11) : nu1Var2.toArray(new Object[i11]));
                            }
                            z = z2;
                        }
                    } else if (i6 == 4) {
                        i4 = this.j;
                        i5 = this.i;
                        nu1Var = (nu1) this.g;
                        ix.Q(obj);
                        nu1Var.b();
                    } else {
                        if (i6 != 5) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    if (nu1Var.h > 2) {
                        ArrayList arrayList3 = new ArrayList(nu1Var);
                        this.l = n12Var;
                        this.g = nu1Var;
                        this.h = null;
                        this.i = i5;
                        this.j = i4;
                        this.k = 4;
                        n12Var.b(this, arrayList3);
                        return fzVar;
                    }
                    if (!nu1Var.isEmpty()) {
                        this.l = null;
                        this.g = null;
                        this.h = null;
                        this.i = i5;
                        this.j = i4;
                        this.k = 5;
                        n12Var.b(this, nu1Var);
                        return fzVar;
                    }
                }
                ix.Q(obj);
            } else {
                i = this.j;
                int i12 = this.i;
                Iterator it3 = this.h;
                ix.Q(obj);
                arrayList = new ArrayList(2);
                it = it3;
                i3 = i12;
                i2 = i;
            }
            return ll2.a;
        }
        ix.Q(obj);
        i = 0;
        i2 = 0;
        arrayList = new ArrayList(2);
        it = this.m;
        i3 = 2;
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i > 0) {
                i--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 2) {
                    this.l = n12Var;
                    this.g = arrayList;
                    this.h = it;
                    this.i = i3;
                    this.j = i2;
                    this.k = 1;
                    n12Var.b(this, arrayList);
                    return fzVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.l = null;
            this.g = null;
            this.h = null;
            this.i = i3;
            this.j = i2;
            this.k = 2;
            n12Var.b(this, arrayList);
            return fzVar;
        }
        return ll2.a;
    }
}
