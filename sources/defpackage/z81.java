package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z81 {
    public final w91 a;

    public static final Object a(w91 w91Var) {
        Object objG = w91Var.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof p91)) {
            w91Var.k(null);
            return objG;
        }
        p91 p91Var = (p91) objG;
        if (p91Var.h()) {
            fu1.k("List is empty.");
            return null;
        }
        int i = p91Var.b - 1;
        Object objF = p91Var.f(i);
        p91Var.k(i);
        objF.getClass();
        if (p91Var.h()) {
            w91Var.k(null);
        }
        if (p91Var.b == 1) {
            w91Var.m(null, p91Var.e());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    public static final p91 b(w91 w91Var) {
        if (w91Var.i()) {
            p91 p91Var = ff1.b;
            p91Var.getClass();
            return p91Var;
        }
        p91 p91Var2 = new p91();
        Object[] objArr = w91Var.c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof p91) {
                                p91Var2.b((p91) obj);
                            } else {
                                obj.getClass();
                                p91Var2.a(obj);
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
        return p91Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z81) {
            return this.a.equals(((z81) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
