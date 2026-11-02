package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class st0 extends om {
    public final ls m;

    public st0(sx sxVar, ls lsVar) {
        super(1, sxVar);
        this.m = lsVar;
    }

    @Override // defpackage.om
    public final String C() {
        return "AwaitContinuation";
    }

    @Override // defpackage.om
    public final Throwable s(vt0 vt0Var) {
        Throwable thC;
        Object objO = this.m.O();
        if (!(objO instanceof ut0) || (thC = ((ut0) objO).c()) == null) {
            return objO instanceof os ? ((os) objO).a : vt0Var.r();
        }
        return thC;
    }
}
