package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a90 extends tq1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a90(int i, ti0 ti0Var) {
        super(ti0Var);
        this.b = i;
    }

    @Override // defpackage.tq1
    public final vq1 a(Object obj) {
        switch (this.b) {
            case 0:
                return new vq1(this, obj, obj == null, is1.o, true);
            default:
                return new vq1(this, obj, obj == null, null, false);
        }
    }
}
