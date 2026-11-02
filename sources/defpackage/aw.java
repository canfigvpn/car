package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class aw implements cm2 {
    public final ej0 a;

    public aw(ej0 ej0Var) {
        this.a = ej0Var;
    }

    @Override // defpackage.cm2
    public final Object a(sl1 sl1Var) {
        return this.a.h(sl1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aw) && this.a.equals(((aw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
