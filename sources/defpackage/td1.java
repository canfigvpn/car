package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class td1 extends ba1 {
    public final ba1 o;
    public boolean p;

    public td1(long j, u62 u62Var, ej0 ej0Var, ej0 ej0Var2, ba1 ba1Var) {
        super(j, u62Var, ej0Var, ej0Var2);
        this.o = ba1Var;
        ba1Var.k();
    }

    @Override // defpackage.ba1, defpackage.o62
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.ba1
    public final j12 w() {
        td1 td1Var;
        ba1 ba1Var = this.o;
        if (ba1Var.m || ba1Var.c) {
            return new q62(this);
        }
        x91 x91Var = this.h;
        long j = this.b;
        HashMap mapM = x91Var != null ? x62.m(ba1Var.g(), this, this.o.d()) : null;
        Object obj = x62.c;
        synchronized (obj) {
            try {
                x62.v(this);
                if (x91Var == null || x91Var.d == 0) {
                    td1Var = this;
                    td1Var.a();
                } else {
                    td1Var = this;
                    j12 j12VarZ = td1Var.z(this.o.g(), x91Var, mapM, this.o.d());
                    if (!j12VarZ.equals(r62.a)) {
                        return j12VarZ;
                    }
                    x91 x91VarX = td1Var.o.x();
                    if (x91VarX != null) {
                        x91VarX.j(x91Var);
                    } else {
                        td1Var.o.B(x91Var);
                        td1Var.h = null;
                    }
                }
                if (ws0.o(td1Var.o.g(), j) < 0) {
                    td1Var.o.v();
                }
                ba1 ba1Var2 = td1Var.o;
                ba1Var2.r(ba1Var2.d().b(j).a(td1Var.j));
                td1Var.o.A(j);
                ba1 ba1Var3 = td1Var.o;
                int i = td1Var.d;
                td1Var.d = -1;
                if (i >= 0) {
                    int[] iArr = ba1Var3.k;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    ba1Var3.k = iArrCopyOf;
                } else {
                    ba1Var3.getClass();
                }
                ba1 ba1Var4 = td1Var.o;
                u62 u62Var = td1Var.j;
                ba1Var4.getClass();
                synchronized (obj) {
                    ba1Var4.j = ba1Var4.j.d(u62Var);
                    ba1 ba1Var5 = td1Var.o;
                    int[] iArr2 = td1Var.k;
                    ba1Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = ba1Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        ba1Var5.k = iArr2;
                    }
                }
                td1Var.m = true;
                if (!td1Var.p) {
                    td1Var.p = true;
                    td1Var.o.l();
                }
                return r62.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
