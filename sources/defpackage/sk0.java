package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ej0 f;

    public /* synthetic */ sk0(ej0 ej0Var, int i) {
        this.e = i;
        this.f = ej0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                u62 u62Var = (u62) obj;
                synchronized (x62.c) {
                    j = x62.e;
                    x62.e = 1 + j;
                }
                return new ir1(j, u62Var, this.f);
            default:
                return this.f.h(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
