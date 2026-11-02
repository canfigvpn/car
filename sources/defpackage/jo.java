package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jo {
    public final t3 a;
    public final ej0 b;
    public final ld0 c;

    public jo(t3 t3Var, ld0 ld0Var, ej0 ej0Var) {
        this.a = t3Var;
        this.b = ej0Var;
        this.c = ld0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return ws0.j(this.a, joVar.a) && ws0.j(this.b, joVar.b) && ws0.j(this.c, joVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
