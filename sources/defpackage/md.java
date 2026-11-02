package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class md implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ md(dn2 dn2Var, jm1 jm1Var, int i) {
        this.e = 3;
        this.g = dn2Var;
        this.h = jm1Var;
        this.f = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        kv kvVar;
        ll2 ll2Var;
        kv kvVar2;
        ll2 ll2Var2;
        int i;
        int i2 = this.e;
        ll2 ll2Var3 = ll2.a;
        int i3 = 0;
        int i4 = this.f;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i2) {
            case 0:
                List list = (List) obj3;
                yx0 yx0Var = (yx0) obj;
                yx0Var.getClass();
                yx0Var.e.a(list.size(), new xx0(yx0.f, new sd(0, list), new gt(new td(list, i4, (ej0) obj2), true, -1117249557)));
                return ll2Var3;
            case 1:
                lr1 lr1Var = (lr1) obj3;
                l91 l91Var = (l91) obj2;
                kv kvVar3 = (kv) obj;
                if (lr1Var.e == i4 && ws0.j(l91Var, lr1Var.f) && (kvVar3 instanceof qv)) {
                    long[] jArr = l91Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = l91Var.b[i9];
                                        boolean z = l91Var.c[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            qv qvVar = (qv) kvVar3;
                                            kvVar2 = kvVar3;
                                            w91 w91Var = qvVar.k;
                                            qx.Q(w91Var, obj4, lr1Var);
                                            ll2Var2 = ll2Var3;
                                            if (obj4 instanceof v40) {
                                                v40 v40Var = (v40) obj4;
                                                if (!w91Var.c(v40Var)) {
                                                    qx.R(qvVar.n, v40Var);
                                                }
                                                w91 w91Var2 = lr1Var.g;
                                                if (w91Var2 != null) {
                                                    w91Var2.k(obj4);
                                                }
                                            }
                                        } else {
                                            kvVar2 = kvVar3;
                                            ll2Var2 = ll2Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            l91Var.f(i9);
                                        }
                                    } else {
                                        kvVar2 = kvVar3;
                                        ll2Var2 = ll2Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    kvVar3 = kvVar2;
                                    ll2Var3 = ll2Var2;
                                }
                                kvVar = kvVar3;
                                ll2Var = ll2Var3;
                                if (i7 != i6) {
                                    return ll2Var;
                                }
                            } else {
                                kvVar = kvVar3;
                                ll2Var = ll2Var3;
                            }
                            if (i5 == length) {
                                return ll2Var;
                            }
                            i5++;
                            kvVar3 = kvVar;
                            ll2Var3 = ll2Var;
                            i3 = 0;
                        }
                    }
                }
                return ll2Var3;
            case 2:
                vx1 vx1Var = (vx1) obj3;
                jm1 jm1Var = (jm1) obj2;
                im1 im1Var = (im1) obj;
                int iH = vx1Var.s.a.h();
                if (iH < 0) {
                    iH = 0;
                }
                if (iH <= i4) {
                    i4 = iH;
                }
                int i10 = -i4;
                boolean z2 = vx1Var.t;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                im1Var.e = true;
                im1.m(im1Var, jm1Var, i11, i10);
                im1Var.e = false;
                return ll2Var3;
            default:
                dn2 dn2Var = (dn2) obj3;
                jm1 jm1Var2 = (jm1) obj2;
                im1 im1Var2 = (im1) obj;
                int i12 = dn2Var.b;
                de2 de2Var = dn2Var.a;
                bi2 bi2Var = dn2Var.c;
                if2 if2Var = (if2) dn2Var.d.a();
                de2Var.a(di1.e, p12.d(im1Var2, i12, bi2Var, if2Var != null ? if2Var.a : null, false, jm1Var2.e), i4, jm1Var2.f);
                im1.k(im1Var2, jm1Var2, 0, Math.round(-de2Var.a.h()));
                return ll2Var3;
        }
    }

    public /* synthetic */ md(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
        this.h = obj2;
    }
}
