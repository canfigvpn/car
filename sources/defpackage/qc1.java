package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qc1 extends wa2 implements ij0 {
    public final /* synthetic */ ki2 i;
    public final /* synthetic */ ic1 j;
    public final /* synthetic */ kb1 k;
    public final /* synthetic */ k91 l;
    public final /* synthetic */ p82 m;
    public final /* synthetic */ hu n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc1(ki2 ki2Var, ic1 ic1Var, kb1 kb1Var, k91 k91Var, p82 p82Var, hu huVar, sx sxVar) {
        super(2, sxVar);
        this.i = ki2Var;
        this.j = ic1Var;
        this.k = kb1Var;
        this.l = k91Var;
        this.m = p82Var;
        this.n = huVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        qc1 qc1Var = (qc1) p((sx) obj2, (ez) obj);
        ll2 ll2Var = ll2.a;
        qc1Var.r(ll2Var);
        return ll2Var;
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        return new qc1(this.i, this.j, this.k, this.l, this.m, this.n, sxVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7 A[LOOP:1: B:15:0x005f->B:27:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00da A[EDGE_INSN: B:32:0x00da->B:28:0x00da BREAK  A[LOOP:1: B:15:0x005f->B:27:0x00d7], SYNTHETIC] */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        ix.Q(obj);
        ki2 ki2Var = this.i;
        Object objF = ki2Var.a.f();
        dk1 dk1Var = ki2Var.d;
        if (ws0.j(objF, dk1Var.getValue()) && (((kb1) this.j.b.f.g()) == null || ws0.j(dk1Var.getValue(), this.k))) {
            Iterator it = ((List) this.m.getValue()).iterator();
            while (it.hasNext()) {
                this.n.b().c((kb1) it.next());
            }
            k91 k91Var = this.l;
            long[] jArr = k91Var.a;
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
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = k91Var.b[i4];
                                float f = k91Var.c[i4];
                                if (!ws0.j((String) obj2, ((kb1) dk1Var.getValue()).j)) {
                                    k91Var.e--;
                                    long[] jArr2 = k91Var.a;
                                    int i5 = k91Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    k91Var.b[i4] = null;
                                }
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
        }
        return ll2.a;
    }
}
