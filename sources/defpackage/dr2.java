package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dr2 implements c21, rj0 {
    public final /* synthetic */ lv a;

    public dr2(lv lvVar) {
        this.a = lvVar;
    }

    @Override // defpackage.rj0
    public final qj0 b() {
        return new tj0(1, 0, lv.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c21) && (obj instanceof rj0)) {
            return b().equals(((rj0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
