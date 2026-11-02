package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jl2 {
    public ru1 a;
    public ru1 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    public final void a(te2 te2Var) {
        ru1 ru1Var;
        te2 te2Var2;
        this.e = false;
        ru1 ru1Var2 = this.a;
        if (ws0.j(te2Var, ru1Var2 != null ? (te2) ru1Var2.c : null)) {
            return;
        }
        String str = te2Var.a.f;
        ru1 ru1Var3 = this.a;
        boolean zJ = ws0.j(str, (ru1Var3 == null || (te2Var2 = (te2) ru1Var3.c) == null) ? null : te2Var2.a.f);
        ru1 ru1Var4 = this.a;
        if (zJ) {
            if (ru1Var4 != null) {
                ru1Var4.c = te2Var;
                return;
            }
            return;
        }
        this.a = new ru1(9, ru1Var4, te2Var);
        this.b = null;
        int length = te2Var.a.f.length() + this.c;
        this.c = length;
        if (length > 100000) {
            ru1 ru1Var5 = this.a;
            if ((ru1Var5 != null ? (ru1) ru1Var5.b : null) == null) {
                return;
            }
            while (true) {
                if (ru1Var5 == null) {
                    ru1Var = null;
                } else {
                    ru1 ru1Var6 = (ru1) ru1Var5.b;
                    if (ru1Var6 != null) {
                        ru1Var = (ru1) ru1Var6.b;
                    } else {
                        ru1Var = null;
                    }
                }
                if (ru1Var == null) {
                    break;
                } else {
                    ru1Var5 = (ru1) ru1Var5.b;
                }
            }
            if (ru1Var5 != null) {
                ru1Var5.b = null;
            }
        }
    }
}
