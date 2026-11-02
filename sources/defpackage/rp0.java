package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 extends on1 {
    public final boolean l;

    public rp0(String str, sp0 sp0Var) {
        super(str, sp0Var, 1);
        this.l = true;
    }

    @Override // defpackage.on1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rp0) {
            s12 s12Var = (s12) obj;
            if (this.a.equals(s12Var.b())) {
                rp0 rp0Var = (rp0) obj;
                if (rp0Var.l && Arrays.equals((s12[]) this.j.getValue(), (s12[]) rp0Var.j.getValue())) {
                    int iD = s12Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (ws0.j(j(i2).b(), s12Var.j(i2).b()) && ws0.j(j(i2).c(), s12Var.j(i2).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.on1, defpackage.s12
    public final boolean f() {
        return this.l;
    }

    @Override // defpackage.on1
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
