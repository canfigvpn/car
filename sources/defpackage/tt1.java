package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tt1 extends st1 implements sj0 {
    public final int f;

    public tt1(int i, sx sxVar) {
        super(sxVar);
        this.f = i;
    }

    @Override // defpackage.sj0
    public final int c() {
        return this.f;
    }

    @Override // defpackage.sh
    public final String toString() {
        if (this.e != null) {
            return super.toString();
        }
        js1.a.getClass();
        return ks1.a(this);
    }
}
