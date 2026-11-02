package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kd2 implements hr, rj0 {
    public final /* synthetic */ ay0 a;

    public kd2(ay0 ay0Var) {
        this.a = ay0Var;
    }

    @Override // defpackage.rj0
    public final qj0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hr) || !(obj instanceof rj0)) {
            return false;
        }
        return this.a.equals(((rj0) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
