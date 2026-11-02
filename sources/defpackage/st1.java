package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class st1 extends sh {
    public st1(sx sxVar) {
        super(sxVar);
        if (sxVar == null || sxVar.f() == ab0.e) {
            return;
        }
        qj.r("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.sx
    public final uy f() {
        return ab0.e;
    }
}
