package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rh0 implements Comparable {
    public final int e;
    public final int f;
    public final String g;
    public final String h;

    public rh0(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.e = i;
        this.f = i2;
        this.g = str;
        this.h = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rh0 rh0Var = (rh0) obj;
        rh0Var.getClass();
        int i = this.e - rh0Var.e;
        return i == 0 ? this.f - rh0Var.f : i;
    }
}
