package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 extends t71 implements ao1, m40, zn1 {
    public pn1 A;
    public long B;
    public Object s;
    public Object t;
    public PointerInputEventHandler u;
    public j82 v;
    public pn1 w = ya2.a;
    public final fa1 x;
    public final fa1 y;
    public final fa1 z;

    public cb2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.s = obj;
        this.t = obj2;
        this.u = pointerInputEventHandler;
        fa1 fa1Var = new fa1(new bb2[16]);
        this.x = fa1Var;
        this.y = fa1Var;
        this.z = new fa1(new bb2[16]);
        this.B = 0L;
    }

    public final Object F0(ij0 ij0Var, sx sxVar) {
        om omVar = new om(1, ex.y(sxVar));
        omVar.v();
        bb2 bb2Var = new bb2(this, omVar);
        synchronized (this.y) {
            this.x.b(bb2Var);
            new bw1(ex.y(ex.m(bb2Var, bb2Var, ij0Var))).i(ll2.a);
        }
        omVar.x(new y3(22, bb2Var));
        return omVar.t();
    }

    @Override // defpackage.zn1
    public final void G(pn1 pn1Var, qn1 qn1Var, long j) {
        this.B = j;
        if (qn1Var == qn1.e) {
            this.w = pn1Var;
        }
        sx sxVar = null;
        if (this.v == null) {
            this.v = nj2.y(t0(), null, new ln(13, sxVar, this), 1);
        }
        G0(pn1Var, qn1Var);
        List list = pn1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!sv.q((wn1) list.get(i))) {
                this.A = pn1Var;
            }
        }
        pn1Var = null;
        this.A = pn1Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void G0(pn1 pn1Var, qn1 qn1Var) {
        Object[] objArr;
        int i;
        int i2;
        bb2 bb2Var;
        om omVar;
        om omVar2;
        synchronized (this.y) {
            fa1 fa1Var = this.z;
            fa1Var.c(fa1Var.g, this.x);
        }
        try {
            int iOrdinal = qn1Var.ordinal();
            if (iOrdinal == 0) {
                fa1 fa1Var2 = this.z;
                objArr = fa1Var2.e;
                i = fa1Var2.g;
                for (i2 = 0; i2 < i; i2++) {
                    bb2Var = (bb2) objArr[i2];
                    if (qn1Var != bb2Var.h && (omVar = bb2Var.g) != null) {
                        bb2Var.g = null;
                        omVar.i(pn1Var);
                    }
                }
            } else if (iOrdinal == 1) {
                fa1 fa1Var3 = this.z;
                int i3 = fa1Var3.g - 1;
                Object[] objArr2 = fa1Var3.e;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        bb2 bb2Var2 = (bb2) objArr2[i3];
                        if (qn1Var == bb2Var2.h && (omVar2 = bb2Var2.g) != null) {
                            bb2Var2.g = null;
                            omVar2.i(pn1Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new ps();
                }
                fa1 fa1Var4 = this.z;
                objArr = fa1Var4.e;
                i = fa1Var4.g;
                while (i2 < i) {
                    bb2Var = (bb2) objArr[i2];
                    if (qn1Var != bb2Var.h) {
                    }
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
    }

    public final void H0() {
        j82 j82Var = this.v;
        if (j82Var != null) {
            j82Var.D(new x71("Pointer input was reset", 2));
            this.v = null;
        }
    }

    @Override // defpackage.zn1
    public final void Z() {
        H0();
    }

    @Override // defpackage.b40, defpackage.zn1
    public final void a() {
        H0();
    }

    @Override // defpackage.m40
    public final float b() {
        return qx.V(this).B.b();
    }

    @Override // defpackage.zn1
    public final void f0() {
        pn1 pn1Var = this.A;
        if (pn1Var == null) {
            return;
        }
        List list = pn1Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((wn1) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    wn1 wn1Var = (wn1) list.get(i2);
                    long j = wn1Var.a;
                    long j2 = wn1Var.c;
                    long j3 = wn1Var.b;
                    float f = wn1Var.e;
                    boolean z = wn1Var.d;
                    arrayList.add(new wn1(j, j3, j2, false, f, j3, j2, z, z, wn1Var.i, 0L, 1.0f, 0L));
                }
                pn1 pn1Var2 = new pn1(arrayList, null);
                this.w = pn1Var2;
                G0(pn1Var2, qn1.e);
                G0(pn1Var2, qn1.f);
                G0(pn1Var2, qn1.g);
                this.A = null;
                return;
            }
        }
    }

    @Override // defpackage.m40
    public final float l() {
        return qx.V(this).B.l();
    }

    @Override // defpackage.t71
    public final void y0() {
        H0();
    }
}
