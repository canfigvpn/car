package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v52 {
    public final String a;

    public v52(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && v52.class == obj.getClass() && ws0.j(this.a, ((v52) obj).a);
    }

    public final int hashCode() {
        return q52.e.hashCode() + k3.f(this.a.hashCode() * 961, 31, false);
    }
}
