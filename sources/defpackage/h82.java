package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h82 implements sx, gz {
    public final sx e;
    public final uy f;

    public h82(sx sxVar, uy uyVar) {
        this.e = sxVar;
        this.f = uyVar;
    }

    @Override // defpackage.gz
    public final gz e() {
        sx sxVar = this.e;
        if (sxVar instanceof gz) {
            return (gz) sxVar;
        }
        return null;
    }

    @Override // defpackage.sx
    public final uy f() {
        return this.f;
    }

    @Override // defpackage.sx
    public final void i(Object obj) {
        this.e.i(obj);
    }
}
