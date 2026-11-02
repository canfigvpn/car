package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class tj0 extends gm implements sj0, ev0, qj0 {
    public final int k;

    public tj0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.k = i;
    }

    @Override // defpackage.sj0
    public final int c() {
        return this.k;
    }

    @Override // defpackage.gm
    public final ev0 e() {
        js1.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tj0) {
            tj0 tj0Var = (tj0) obj;
            return this.h.equals(tj0Var.h) && this.i.equals(tj0Var.i) && ws0.j(this.f, tj0Var.f) && f().equals(tj0Var.f());
        }
        if (!(obj instanceof tj0)) {
            return false;
        }
        ev0 ev0Var = this.e;
        if (ev0Var == null) {
            e();
            this.e = this;
            this = this;
        } else {
            r2 = ev0Var;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        f();
        return this.i.hashCode() + k3.e(f().hashCode() * 31, 31, this.h);
    }

    public final String toString() {
        ev0 ev0Var = this.e;
        if (ev0Var == null) {
            e();
            this.e = this;
            ev0Var = this;
        }
        if (ev0Var != this) {
            return ev0Var.toString();
        }
        String str = this.h;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : k3.j("function ", str, " (Kotlin reflection is not available)");
    }

    public tj0(int i, Class cls, String str, String str2, int i2) {
        this(i, i2, cls, fm.e, str, str2);
    }
}
