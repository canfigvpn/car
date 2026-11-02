package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ol1 implements ss1 {
    public final Set e;
    public final fa1 f = new fa1(new ek0[16]);

    public ol1(Set set) {
        this.e = set;
    }

    @Override // defpackage.ss1
    public final void a() {
        fa1 fa1Var = this.f;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ss1 ss1Var = ((ek0) objArr[i2]).a;
            this.e.remove(ss1Var);
            ss1Var.a();
        }
    }

    @Override // defpackage.ss1
    public final void c() {
    }

    @Override // defpackage.ss1
    public final void e() {
    }
}
