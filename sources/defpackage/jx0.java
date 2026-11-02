package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jx0 implements x61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x61 b;
    public final /* synthetic */ ox0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ x61 e;

    public /* synthetic */ jx0(x61 x61Var, ox0 ox0Var, int i, x61 x61Var2, int i2) {
        this.a = i2;
        this.c = ox0Var;
        this.d = i;
        this.e = x61Var2;
        this.b = x61Var;
    }

    @Override // defpackage.x61
    public final Map a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[LOOP:0: B:11:0x002f->B:33:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[SYNTHETIC] */
    @Override // defpackage.x61
    public final void b() {
        int i = this.a;
        x61 x61Var = this.e;
        int i2 = this.d;
        ox0 ox0Var = this.c;
        switch (i) {
            case 0:
                ox0Var.i = i2;
                x61Var.b();
                fa1 fa1Var = ox0Var.q;
                w91 w91Var = ox0Var.p;
                long[] jArr = w91Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j) < 128) {
                                    int i7 = (i3 << 3) + i6;
                                    Object obj = w91Var.b[i7];
                                    y92 y92Var = (y92) w91Var.c[i7];
                                    int i8 = fa1Var.i(obj);
                                    if (i8 < 0 || i8 >= ox0Var.i) {
                                        if (i8 >= 0) {
                                            Object obj2 = ws0.O;
                                            Object[] objArr = fa1Var.e;
                                            Object obj3 = objArr[i8];
                                            objArr[i8] = obj2;
                                        }
                                        if (ox0Var.n.b(obj)) {
                                            y92Var.a();
                                        }
                                        w91Var.l(i7);
                                    } else {
                                        i4 = i4;
                                    }
                                } else {
                                    i4 = i4;
                                }
                                j >>= i4;
                                i6++;
                                i4 = i4;
                            }
                            if (i5 == i4) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                ox0Var.f(ox0Var.h);
                break;
            default:
                ox0Var.h = i2;
                x61Var.b();
                if (ox0Var.e.l == null) {
                    ox0Var.f(ox0Var.h);
                }
                break;
        }
    }

    @Override // defpackage.x61
    public final int c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    @Override // defpackage.x61
    public final ej0 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.d();
    }

    @Override // defpackage.x61
    public final int e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }
}
