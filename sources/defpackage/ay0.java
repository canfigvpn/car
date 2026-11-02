package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ay0 extends sq1 implements jv0 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay0(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.l = i2;
    }

    @Override // defpackage.ti0
    public final Object a() {
        return get();
    }

    @Override // defpackage.gm
    public final ev0 e() {
        js1.a.getClass();
        return this;
    }

    @Override // defpackage.jv0
    public final Object get() {
        int i = this.l;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((p82) obj).getValue();
            case 1:
                return ((p82) obj).getValue();
            case 2:
                return obj.getClass().getSimpleName();
            case 3:
                return ((p82) obj).getValue();
            default:
                return ((p82) obj).getValue();
        }
    }
}
