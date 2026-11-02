package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tz0 {
    public final ej0 a;
    public ew0 c;
    public int f;
    public final ud b = new ud(13);
    public int d = -1;
    public int e = -1;

    public tz0(ej0 ej0Var) {
        this.a = ej0Var;
    }

    public final sz0 a(int i, long j, boolean z, ej0 ej0Var) {
        ew0 ew0Var = this.c;
        if (ew0Var == null) {
            return v80.a;
        }
        kp1 kp1Var = (kp1) ew0Var.d;
        boolean z2 = kp1Var instanceof v8;
        jp1 jp1Var = new jp1(ew0Var, i, this.b, ej0Var);
        jp1Var.d = new sw(j);
        if (!z2) {
            kp1Var.a(jp1Var);
        } else if (z) {
            v8 v8Var = (v8) kp1Var;
            v8Var.f.add(new aq1(1, jp1Var));
            if (!v8Var.g) {
                v8Var.g = true;
                v8Var.e.post(v8Var);
            }
        } else {
            v8 v8Var2 = (v8) kp1Var;
            v8Var2.f.add(new aq1(0, jp1Var));
            if (!v8Var2.g) {
                v8Var2.g = true;
                v8Var2.e.post(v8Var2);
            }
        }
        nj2.G("compose:lazy:schedule_prefetch:index", i);
        return jp1Var;
    }
}
