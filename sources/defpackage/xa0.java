package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xa0 implements so0 {
    public final boolean e;

    public xa0(boolean z) {
        this.e = z;
    }

    @Override // defpackage.so0
    public final boolean b() {
        return this.e;
    }

    @Override // defpackage.so0
    public final oe1 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.e ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
