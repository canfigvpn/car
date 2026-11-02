package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ms {
    public final Object a;
    public final km b;
    public final jj0 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ ms(Object obj, km kmVar, jj0 jj0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : kmVar, (i & 4) != 0 ? null : jj0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static ms a(ms msVar, km kmVar, Throwable th, int i) {
        Object obj = msVar.a;
        if ((i & 2) != 0) {
            kmVar = msVar.b;
        }
        km kmVar2 = kmVar;
        jj0 jj0Var = msVar.c;
        Object obj2 = msVar.d;
        if ((i & 16) != 0) {
            th = msVar.e;
        }
        return new ms(obj, kmVar2, jj0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms)) {
            return false;
        }
        ms msVar = (ms) obj;
        return ws0.j(this.a, msVar.a) && ws0.j(this.b, msVar.b) && ws0.j(this.c, msVar.c) && ws0.j(this.d, msVar.d) && ws0.j(this.e, msVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        km kmVar = this.b;
        int iHashCode2 = (iHashCode + (kmVar == null ? 0 : kmVar.hashCode())) * 31;
        jj0 jj0Var = this.c;
        int iHashCode3 = (iHashCode2 + (jj0Var == null ? 0 : jj0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public ms(Object obj, km kmVar, jj0 jj0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kmVar;
        this.c = jj0Var;
        this.d = obj2;
        this.e = th;
    }
}
