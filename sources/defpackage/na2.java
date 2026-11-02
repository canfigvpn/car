package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class na2 implements xv1 {
    public final vh0 e;
    public final String f;
    public boolean g;

    public na2(vh0 vh0Var, String str) {
        this.e = vh0Var;
        this.f = str;
    }

    @Override // defpackage.xv1
    public void D() {
        b();
    }

    public final void b() {
        if (this.g) {
            ix.R("statement is closed", 21);
            throw null;
        }
    }
}
