package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class c72 extends x82 {
    public Object c;

    public c72(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.x82
    public final void a(x82 x82Var) {
        x82Var.getClass();
        this.c = ((c72) x82Var).c;
    }

    @Override // defpackage.x82
    public final x82 b(long j) {
        return new c72(x62.h().g(), this.c);
    }
}
