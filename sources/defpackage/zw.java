package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zw {
    public final hk a;
    public final om b;

    public zw(hk hkVar, om omVar) {
        this.a = hkVar;
        this.b = omVar;
    }

    public final String toString() {
        om omVar = this.b;
        String str = ((az) omVar.i.p(az.f)) != null ? "Room Invalidation Tracker Refresh" : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        j20.j(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? k3.j("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.a.a());
        sb.append(", continuation=");
        sb.append(omVar);
        sb.append(')');
        return sb.toString();
    }
}
