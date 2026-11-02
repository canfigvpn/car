package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ns implements sx {
    public static final ns f = new ns(0);
    public static final ns g = new ns(1);
    public final /* synthetic */ int e;

    public /* synthetic */ ns(int i) {
        this.e = i;
    }

    @Override // defpackage.sx
    public final uy f() {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return ab0.e;
        }
    }

    @Override // defpackage.sx
    public final void i(Object obj) {
        switch (this.e) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.e) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
