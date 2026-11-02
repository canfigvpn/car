package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i02 implements z02, Iterable, fv0 {
    public final w91 e;
    public e61 f;
    public boolean g;
    public boolean h;

    public i02() {
        long[] jArr = jx1.a;
        this.e = new w91();
    }

    @Override // defpackage.z02
    public final void a(y02 y02Var, Object obj) {
        boolean z = obj instanceof p0;
        w91 w91Var = this.e;
        if (z && w91Var.c(y02Var)) {
            Object objG = w91Var.g(y02Var);
            objG.getClass();
            p0 p0Var = (p0) objG;
            p0 p0Var2 = (p0) obj;
            String str = p0Var2.a;
            if (str == null) {
                str = p0Var.a;
            }
            qj0 qj0Var = p0Var2.b;
            if (qj0Var == null) {
                qj0Var = p0Var.b;
            }
            w91Var.m(y02Var, new p0(str, qj0Var));
        } else {
            w91Var.m(y02Var, obj);
        }
        y02Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0055 A[LOOP:0: B:5:0x001c->B:15:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0058 A[EDGE_INSN: B:18:0x0058->B:16:0x0058 BREAK  A[LOOP:0: B:5:0x001c->B:15:0x0055], SYNTHETIC] */
    public final i02 b() {
        i02 i02Var = new i02();
        i02Var.g = this.g;
        i02Var.h = this.h;
        w91 w91Var = this.e;
        Object[] objArr = w91Var.b;
        Object[] objArr2 = w91Var.c;
        long[] jArr = w91Var.a;
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
                            i02Var.e.m(objArr[i4], objArr2[i4]);
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
        return i02Var;
    }

    public final Object c(y02 y02Var) {
        Object objG = this.e.g(y02Var);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + y02Var + " - consider getOrElse or getOrNull");
    }

    public final void d(i02 i02Var) {
        w91 w91Var = i02Var.e;
        Object[] objArr = w91Var.b;
        Object[] objArr2 = w91Var.c;
        long[] jArr = w91Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        y02 y02Var = (y02) obj;
                        w91 w91Var2 = this.e;
                        Object objG = w91Var2.g(y02Var);
                        y02Var.getClass();
                        Object objG2 = y02Var.b.g(objG, obj2);
                        if (objG2 != null) {
                            w91Var2.m(y02Var, objG2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i02)) {
            return false;
        }
        i02 i02Var = (i02) obj;
        return this.e.equals(i02Var.e) && this.g == i02Var.g && this.h == i02Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + k3.f(this.e.hashCode() * 31, 31, this.g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        e61 e61Var = this.f;
        if (e61Var == null) {
            e61Var = new e61(this.e);
            this.f = e61Var;
        }
        return ((ub0) e61Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
  0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        w91 w91Var = this.e;
        Object[] objArr = w91Var.b;
        Object[] objArr2 = w91Var.c;
        long[] jArr = w91Var.a;
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
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((y02) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return sv.V(this) + "{ " + ((Object) sb) + " }";
    }
}
