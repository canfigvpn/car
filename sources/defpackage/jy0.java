package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jy0 implements ej0 {
    public static final jy0 f = new jy0(0);
    public static final jy0 g = new jy0(1);
    public static final jy0 h = new jy0(2);
    public final /* synthetic */ int e;

    public /* synthetic */ jy0(int i) {
        this.e = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        switch (this.e) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            default:
                if (ws0.j(obj, Boolean.FALSE)) {
                    return new dr(dr.g);
                }
                obj.getClass();
                return new dr(ws0.c(((Integer) obj).intValue()));
        }
    }
}
