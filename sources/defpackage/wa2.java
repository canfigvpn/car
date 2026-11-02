package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wa2 extends tx implements sj0 {
    public final int h;

    public wa2(int i, sx sxVar) {
        super(sxVar);
        this.h = i;
    }

    @Override // defpackage.sj0
    public final int c() {
        return this.h;
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
