package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 {
    public qv a;
    public int b;
    public vj0 c;
    public ij0 d;
    public int e;
    public l91 f;
    public w91 g;

    public lr1(qv qvVar) {
        this.a = qvVar;
    }

    public final boolean a() {
        if (this.a != null) {
            vj0 vj0Var = this.c;
            if (vj0Var != null ? vj0Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final ft0 b(Object obj) {
        ft0 ft0VarS;
        qv qvVar = this.a;
        return (qvVar == null || (ft0VarS = qvVar.s(this, obj)) == null) ? ft0.e : ft0VarS;
    }

    public final void c() {
        qv qvVar = this.a;
        if (qvVar != null) {
            qvVar.s = true;
            qvVar.x.j();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
