package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class s01 implements gw1, ew1 {
    public final hw1 e;
    public final ew1 f;
    public final x91 g;

    public s01(gw1 gw1Var, Map map, ew1 ew1Var) {
        m mVar = new m(19, gw1Var);
        a90 a90Var = iw1.a;
        this.e = new hw1(map, mVar);
        this.f = ew1Var;
        x91 x91Var = kx1.a;
        this.g = new x91();
    }

    @Override // defpackage.gw1
    public final ud a(String str, ti0 ti0Var) {
        return this.e.a(str, ti0Var);
    }

    @Override // defpackage.ew1
    public final void b(Object obj, gt gtVar, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-858296452);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(this) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            this.f.b(obj, gtVar, ak0Var, i2 & 126);
            boolean zH = ak0Var.h(this) | ak0Var.h(obj);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new d(24, this, obj);
                ak0Var.g0(objL);
            }
            s5.e(obj, (ej0) objL, ak0Var);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(this, obj, gtVar, i, 11);
        }
    }

    @Override // defpackage.ew1
    public final void c(Object obj) {
        this.f.c(obj);
    }

    @Override // defpackage.gw1
    public final boolean d(Object obj) {
        return this.e.d(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.gw1
    public final Map e() {
        x91 x91Var = this.g;
        Object[] objArr = x91Var.b;
        long[] jArr = x91Var.a;
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
                            this.f.c(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.e.e();
    }

    @Override // defpackage.gw1
    public final Object f(String str) {
        return this.e.f(str);
    }
}
