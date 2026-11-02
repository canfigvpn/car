package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 implements e30, View.OnAttachStateChangeListener {
    public final e5 e;
    public final t4 f;
    public dq0 g;
    public final ArrayList h = new ArrayList();
    public v5 i = v5.e;
    public boolean j = true;
    public final zk k = s5.d(1, 6, null);
    public d91 l;
    public long m;
    public final d91 n;
    public q02 o;
    public boolean p;
    public final p q;

    public a6(e5 e5Var, t4 t4Var) {
        this.e = e5Var;
        this.f = t4Var;
        new Handler(Looper.getMainLooper());
        d91 d91Var = hr0.a;
        d91Var.getClass();
        this.l = d91Var;
        this.n = new d91();
        this.o = new q02(e5Var.getSemanticsOwner().a(), d91Var);
        this.q = new p(2, this);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (defpackage.mx.t(100, r0) == r4) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:13:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.tx r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.y5
            if (r0 == 0) goto L13
            r0 = r9
            y5 r0 = (defpackage.y5) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            y5 r0 = new y5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.i
            int r1 = r0.k
            r2 = 2
            r3 = 1
            fz r4 = defpackage.fz.e
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            wk r1 = r0.h
            defpackage.ix.Q(r9)
        L2b:
            r9 = r1
            goto L44
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.fu1.h(r8)
            r8 = 0
            return r8
        L34:
            wk r1 = r0.h
            defpackage.ix.Q(r9)
            goto L52
        L3a:
            defpackage.ix.Q(r9)
            wk r9 = new wk
            zk r1 = r8.k
            r9.<init>(r1)
        L44:
            r0.h = r9
            r0.k = r3
            java.lang.Object r1 = r9.b(r0)
            if (r1 != r4) goto L4f
            goto L85
        L4f:
            r7 = r1
            r1 = r9
            r9 = r7
        L52:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r1.c()
            boolean r9 = r8.f()
            if (r9 == 0) goto L66
            r8.g()
        L66:
            e5 r9 = r8.e
            android.os.Handler r9 = r9.getHandler()
            boolean r5 = r8.p
            if (r5 != 0) goto L79
            if (r9 == 0) goto L79
            r8.p = r3
            p r5 = r8.q
            r9.post(r5)
        L79:
            r0.h = r1
            r0.k = r2
            r5 = 100
            java.lang.Object r9 = defpackage.mx.t(r5, r0)
            if (r9 != r4) goto L2b
        L85:
            return r4
        L86:
            ll2 r8 = defpackage.ll2.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6.a(tx):java.lang.Object");
    }

    @Override // defpackage.e30
    public final void b(y11 y11Var) {
        m(this.e.getSemanticsOwner().a());
        g();
        this.g = null;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void c(gr0 gr0Var) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        gr0 gr0Var2 = gr0Var;
        int[] iArr3 = gr0Var2.b;
        long[] jArr = gr0Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        q02 q02Var = (q02) this.n.b(i7);
                        s02 s02Var = (s02) gr0Var2.b(i7);
                        p02 p02Var = s02Var != null ? s02Var.a : null;
                        if (p02Var == null) {
                            throw k3.g("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = p02Var.f;
                        w91 w91Var = p02Var.d.e;
                        if (q02Var == null) {
                            Object[] objArr = w91Var.b;
                            long[] jArr2 = w91Var.a;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                y02 y02Var = (y02) objArr[(i10 << 3) + i12];
                                                y02 y02Var2 = u02.C;
                                                if (ws0.j(y02Var, y02Var2)) {
                                                    Object objG = w91Var.g(y02Var2);
                                                    if (objG == null) {
                                                        objG = null;
                                                    }
                                                    List list = (List) objG;
                                                    k(String.valueOf(list != null ? (yb) vq.R(list) : null), i8);
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = w91Var.b;
                            long[] jArr3 = w91Var.a;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                y02 y02Var3 = (y02) objArr2[(i13 << 3) + i15];
                                                y02 y02Var4 = u02.C;
                                                if (ws0.j(y02Var3, y02Var4)) {
                                                    Object objG2 = q02Var.a.e.g(y02Var4);
                                                    if (objG2 == null) {
                                                        objG2 = null;
                                                    }
                                                    List list2 = (List) objG2;
                                                    yb ybVar = list2 != null ? (yb) vq.R(list2) : null;
                                                    Object objG3 = w91Var.g(y02Var4);
                                                    if (objG3 == null) {
                                                        objG3 = null;
                                                    }
                                                    List list3 = (List) objG3;
                                                    yb ybVar2 = list3 != null ? (yb) vq.R(list3) : null;
                                                    if (!ws0.j(ybVar, ybVar2)) {
                                                        k(String.valueOf(ybVar2), i8);
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    gr0Var2 = gr0Var;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            gr0Var2 = gr0Var;
            iArr3 = iArr;
        }
    }

    @Override // defpackage.e30
    public final void d(y11 y11Var) {
        this.g = (dq0) this.f.a();
        l(-1, this.e.getSemanticsOwner().a());
        g();
    }

    public final gr0 e() {
        if (this.j) {
            this.j = false;
            this.l = j20.o(this.e.getSemanticsOwner(), x4.j);
            this.m = System.currentTimeMillis();
        }
        return this.l;
    }

    public final boolean f() {
        return this.g != null;
    }

    public final void g() {
        dq0 dq0Var = this.g;
        if (dq0Var == null) {
            return;
        }
        Object obj = dq0Var.g;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ww wwVar = (ww) arrayList.get(i);
            int iOrdinal = wwVar.c.ordinal();
            if (iOrdinal == 0) {
                qk1 qk1Var = wwVar.d;
                if (qk1Var != null) {
                    ViewStructure viewStructure = (ViewStructure) qk1Var.f;
                    if (Build.VERSION.SDK_INT >= 29) {
                        cc.e(i4.f(obj), viewStructure);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    qj.p();
                    return;
                }
                AutofillId autofillIdT = dq0Var.t(wwVar.a);
                if (autofillIdT != null && Build.VERSION.SDK_INT >= 29) {
                    cc.f(i4.f(obj), autofillIdT);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionF = i4.f(obj);
            pf pfVarI = c12.i((View) dq0Var.f);
            Objects.requireNonNull(pfVarI);
            cc.h(contentCaptureSessionF, of.b(pfVarI.a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    public final void i(p02 p02Var, q02 q02Var) {
        int i = 0;
        z5 z5Var = new z5(i, q02Var, this);
        p02Var.getClass();
        List listJ = p02.j(4, p02Var);
        int size = listJ.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listJ.get(i3);
            if (e().a(((p02) obj).f)) {
                z5Var.g(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listJ2 = p02.j(4, p02Var);
        int size2 = listJ2.size();
        while (i < size2) {
            p02 p02Var2 = (p02) listJ2.get(i);
            gr0 gr0VarE = e();
            int i4 = p02Var2.f;
            if (gr0VarE.a(i4)) {
                d91 d91Var = this.n;
                if (d91Var.a(i4)) {
                    Object objB = d91Var.b(i4);
                    if (objB == null) {
                        throw k3.g("node not present in pruned tree before this change");
                    }
                    i(p02Var2, (q02) objB);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    public final void k(String str, int i) {
        dq0 dq0Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (dq0Var = this.g) != null) {
            AutofillId autofillIdT = dq0Var.t(i);
            if (autofillIdT == null) {
                throw k3.g("Invalid content capture ID");
            }
            if (i2 >= 29) {
                cc.g(i4.f(dq0Var.g), autofillIdT, str);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0196  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    public final void l(int i, p02 p02Var) {
        ej0 ej0Var;
        int i2;
        pf pfVarI;
        AutofillId autofillIdB;
        yr1 yr1VarA;
        qk1 qk1Var;
        String strB;
        ej0 ej0Var2;
        if (f()) {
            w91 w91Var = p02Var.d.e;
            Object objG = w91Var.g(u02.E);
            if (objG == null) {
                objG = null;
            }
            Boolean bool = (Boolean) objG;
            if (this.i == v5.e && ws0.j(bool, Boolean.TRUE)) {
                Object objG2 = w91Var.g(h02.m);
                if (objG2 == null) {
                    objG2 = null;
                }
                p0 p0Var = (p0) objG2;
                if (p0Var != null && (ej0Var2 = (ej0) p0Var.b) != null) {
                }
            } else if (this.i == v5.f && ws0.j(bool, Boolean.FALSE)) {
                Object objG3 = w91Var.g(h02.m);
                if (objG3 == null) {
                    objG3 = null;
                }
                p0 p0Var2 = (p0) objG3;
                if (p0Var2 != null && (ej0Var = (ej0) p0Var2.b) != null) {
                }
            }
            int i3 = p02Var.f;
            dq0 dq0Var = this.g;
            if (dq0Var == null || (i2 = Build.VERSION.SDK_INT) < 29 || (pfVarI = c12.i(this.e)) == null) {
                qk1Var = null;
            } else {
                p02 p02VarL = p02Var.l();
                int i4 = p02Var.f;
                if (p02VarL != null) {
                    autofillIdB = dq0Var.t(p02VarL.f);
                    if (autofillIdB == null) {
                        qk1Var = null;
                    }
                } else {
                    autofillIdB = of.b(pfVarI.a);
                }
                qk1 qk1Var2 = i2 >= 29 ? new qk1(25, cc.d(i4.f(dq0Var.g), autofillIdB, i4)) : null;
                if (qk1Var2 == null) {
                    qk1Var = null;
                } else {
                    ViewStructure viewStructure = (ViewStructure) qk1Var2.f;
                    i02 i02Var = p02Var.d;
                    y02 y02Var = u02.L;
                    w91 w91Var2 = i02Var.e;
                    if (w91Var2.c(y02Var)) {
                        qk1Var = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.m);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objG4 = w91Var2.g(u02.A);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        String str = (String) objG4;
                        if (str != null) {
                            viewStructure.setId(i4, null, null, str);
                        }
                        Object objG5 = w91Var2.g(u02.n);
                        if (objG5 == null) {
                            objG5 = null;
                        }
                        if (((Boolean) objG5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objG6 = w91Var2.g(u02.C);
                        if (objG6 == null) {
                            objG6 = null;
                        }
                        List list = (List) objG6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(c31.a(list, "\n", null, 62));
                        }
                        Object objG7 = w91Var2.g(u02.G);
                        if (objG7 == null) {
                            objG7 = null;
                        }
                        yb ybVar = (yb) objG7;
                        if (ybVar != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(ybVar);
                        }
                        Object objG8 = w91Var2.g(u02.a);
                        if (objG8 == null) {
                            objG8 = null;
                        }
                        List list2 = (List) objG8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(c31.a(list2, "\n", null, 62));
                        }
                        Object objG9 = w91Var2.g(u02.z);
                        if (objG9 == null) {
                            objG9 = null;
                        }
                        wu1 wu1Var = (wu1) objG9;
                        if (wu1Var != null && (strB = c12.B(wu1Var.a)) != null) {
                            viewStructure.setClassName(strB);
                        }
                        hf2 hf2VarL = c12.l(i02Var);
                        if (hf2VarL != null) {
                            gf2 gf2Var = hf2VarL.a;
                            vf2 vf2Var = gf2Var.b;
                            m40 m40Var = gf2Var.g;
                            viewStructure.setTextStyle(m40Var.l() * m40Var.b() * yf2.c(vf2Var.a.b), 0, 0, 0);
                        }
                        me1 me1VarD = p02Var.d();
                        if (me1VarD == null) {
                            yr1VarA = yr1.e;
                        } else {
                            me1 me1Var = me1VarD.S0().r ? me1VarD : null;
                            if (me1Var != null) {
                                yr1VarA = p02Var.a(me1Var);
                            } else {
                                yr1VarA = yr1.e;
                            }
                        }
                        float f = yr1VarA.a;
                        float f2 = yr1VarA.b;
                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (yr1VarA.c - f), (int) (yr1VarA.d - f2));
                        qk1Var = qk1Var2;
                    }
                }
            }
            if (qk1Var != null) {
                this.h.add(new ww(i3, this.m, xw.e, qk1Var));
            }
            List listJ = p02.j(4, p02Var);
            int size = listJ.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Object obj = listJ.get(i6);
                if (e().a(((p02) obj).f)) {
                    l(i5, (p02) obj);
                    i5++;
                }
            }
        }
    }

    public final void m(p02 p02Var) {
        if (f()) {
            this.h.add(new ww(p02Var.f, this.m, xw.f, null));
            List listJ = p02.j(4, p02Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                m((p02) listJ.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void n() {
        d91 d91Var = this.n;
        d91Var.c();
        gr0 gr0VarE = e();
        int[] iArr = gr0VarE.b;
        Object[] objArr = gr0VarE.c;
        long[] jArr = gr0VarE.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            d91Var.h(iArr[i4], new q02(((s02) objArr[i4]).a, e()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.o = new q02(this.e.getSemanticsOwner().a(), e());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.e.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.q);
        this.g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
