package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4 extends tj0 implements ti0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.l = i3;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x027f A[PHI: r12
  0x027f: PHI (r12v5 int) = (r12v4 int), (r12v7 int), (r12v7 int) binds: [B:112:0x0256, B:117:0x0260, B:119:0x0266] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x02c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x02ca A[LOOP:8: B:137:0x029c->B:147:0x02ca, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0215 A[LOOP:4: B:87:0x01e0->B:97:0x0215, LOOP_END] */
    @Override // defpackage.ti0
    public final Object a() throws Exception {
        ContentCaptureSession contentCaptureSessionA;
        Object value;
        he1 he1Var;
        Object value2;
        d41 d41Var;
        String string;
        Double dValueOf;
        Object value3;
        int i = this.l;
        int i2 = 2;
        sx sxVar = null;
        ll2 ll2Var = ll2.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                View view = (View) obj;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    g1.f(view);
                }
                if (i3 < 29 || (contentCaptureSessionA = cc.a(view)) == null) {
                    return null;
                }
                return new dq0(contentCaptureSessionA, view);
            case 1:
                mn mnVar = (mn) obj;
                s82 s82Var = mnVar.e;
                kn knVar = (kn) s82Var.getValue();
                if (h92.I(knVar.b)) {
                    do {
                        value = s82Var.getValue();
                    } while (!s82Var.h(value, kn.a((kn) value, null, null, null, null, null, null, null, null, true, 1535)));
                } else {
                    nj2.y(s5.H(mnVar), null, new n7(i2, sxVar, knVar, mnVar), 3);
                }
                return ll2Var;
            case 2:
                return ((nc2) obj).o0();
            case 3:
                qf0 qf0Var = (qf0) obj;
                x91 x91Var = qf0Var.c;
                x91 x91Var2 = qf0Var.d;
                vf0 vf0Var = qf0Var.a;
                cg0 cg0VarF = vf0Var.f();
                bg0 bg0Var = bg0.g;
                if (cg0VarF == null) {
                    Object[] objArr = x91Var2.b;
                    long[] jArr = x91Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j = jArr[i4];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((j & 255) < 128) {
                                        ((mf0) objArr[(i4 << 3) + i6]).U(bg0Var);
                                    }
                                    j >>= 8;
                                }
                                if (i5 == 8) {
                                    if (i4 != length) {
                                        i4++;
                                    }
                                }
                            } else if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                } else if (cg0VarF.r) {
                    if (x91Var.c(cg0VarF)) {
                        cg0VarF.L0();
                    }
                    bg0 bg0VarK0 = cg0VarF.K0();
                    if (!cg0VarF.e.r) {
                        vp0.b("visitAncestors called on an unattached node");
                    }
                    t71 t71Var = cg0VarF.e;
                    ax0 ax0VarV = qx.V(cg0VarF);
                    int i7 = 0;
                    while (ax0VarV != null) {
                        if ((ax0VarV.I.f.h & 5120) != 0) {
                            while (t71Var != null) {
                                int i8 = t71Var.g;
                                if ((i8 & 5120) != 0) {
                                    if ((i8 & 1024) != 0) {
                                        i7++;
                                    }
                                    if ((t71Var instanceof mf0) && x91Var2.c(t71Var)) {
                                        if (i7 <= 1) {
                                            ((mf0) t71Var).U(bg0VarK0);
                                        } else {
                                            ((mf0) t71Var).U(bg0.f);
                                        }
                                        x91Var2.l(t71Var);
                                    }
                                }
                                t71Var = t71Var.i;
                            }
                        }
                        ax0VarV = ax0VarV.u();
                        t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
                    }
                    Object[] objArr2 = x91Var2.b;
                    long[] jArr2 = x91Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j2 = jArr2[i9];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                for (int i11 = 0; i11 < i10; i11++) {
                                    if ((j2 & 255) < 128) {
                                        ((mf0) objArr2[(i9 << 3) + i11]).U(bg0Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i10 == 8) {
                                    if (i9 != length2) {
                                        i9++;
                                    }
                                }
                            } else if (i9 != length2) {
                                i9++;
                            }
                        }
                    }
                }
                if (vf0Var.f() == null || vf0Var.c.K0() == bg0Var) {
                    vf0Var.c();
                }
                x91Var.b();
                x91Var2.b();
                qf0Var.e = false;
                return ll2Var;
            case 4:
                return Boolean.valueOf(cg0.N0(((gg0) obj).z));
            case 5:
                s82 s82Var2 = ((f41) obj).g;
                do {
                    value2 = s82Var2.getValue();
                    d41Var = (d41) value2;
                    Integer num = d41Var.f;
                    if (num == null || (string = num.toString()) == null) {
                        string = d41Var.e;
                    }
                } while (!s82Var2.h(value2, d41.a(d41Var, null, 0L, 0, string, null, null, null, null, null, null, false, 8175)));
                return ll2Var;
            case 6:
                f41 f41Var = (f41) obj;
                s82 s82Var3 = f41Var.g;
                d41 d41Var2 = (d41) s82Var3.getValue();
                if (d41Var2.c == 0) {
                    do {
                        value3 = s82Var3.getValue();
                    } while (!s82Var3.h(value3, d41.a((d41) value3, null, 0L, 0, null, null, null, null, null, null, null, true, 6143)));
                } else {
                    boolean zC = d41Var2.c();
                    d22 d22Var = d22.e;
                    d22 d22Var2 = zC ? d41Var2.j : d22Var;
                    boolean z = d22Var2 == d22Var;
                    Integer numA = o92.A(d41Var2.e);
                    long j3 = d41Var2.a;
                    long j4 = f41Var.e;
                    long j5 = d41Var2.c;
                    int i12 = d41Var2.d;
                    sx sxVar2 = null;
                    Long lB = z ? o92.B(d41Var2.g) : null;
                    String str = d41Var2.h;
                    try {
                        dValueOf = n92.u(str) ? Double.valueOf(Double.parseDouble(str)) : null;
                        break;
                    } catch (NumberFormatException unused) {
                    }
                    u22 u22VarB = d41Var2.b();
                    Double d = (u22VarB != null && u22VarB.g && z) ? dValueOf : null;
                    String string2 = h92.Q(d41Var2.i).toString();
                    g22 g22Var = new g22(j3, j4, j5, i12, numA, lB, d, !h92.I(string2) ? string2 : null, d22Var2);
                    List list = d41Var2.k;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((js) obj2).b != is.e) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(wq.G(arrayList, 10));
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList.get(i13);
                        i13++;
                        js jsVar = (js) obj3;
                        long j6 = f41Var.e;
                        long j7 = jsVar.a.a;
                        int i14 = d41Var2.d;
                        Long lB2 = o92.B(jsVar.c);
                        is isVar = jsVar.b;
                        g22 g22Var2 = g22Var;
                        arrayList2.add(new g22(0L, j6, j7, i14, numA, isVar == is.f ? lB2 : null, null, null, e41.a[isVar.ordinal()] == 1 ? d22Var : d22.f));
                        g22Var = g22Var2;
                    }
                    nj2.y(s5.H(f41Var), null, new g(f41Var, g22Var, arrayList2, sxVar2, 14), 3);
                }
                return ll2Var;
            default:
                bv1 bv1Var = (bv1) obj;
                rx rxVar = bv1Var.a;
                if (rxVar == null) {
                    ws0.U("coroutineScope");
                    throw null;
                }
                qx.o(rxVar, null);
                bv1Var.e();
                t61 t61Var = bv1Var.e;
                if (t61Var == null) {
                    ws0.U("connectionManager");
                    throw null;
                }
                ((gw) t61Var.f).close();
                ia2 ia2Var = (ia2) t61Var.g;
                if (ia2Var != null) {
                    ia2Var.close();
                }
                return ll2Var;
        }
    }
}
