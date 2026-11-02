package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l7 extends tj0 implements ej0 {
    public final /* synthetic */ z01 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(z01 z01Var) {
        super(1, vs0.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.l = z01Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        float[] fArr = ((q61) obj).a;
        jw0 jw0Var = (jw0) this.l.v.getValue();
        if (jw0Var != null) {
            if (!jw0Var.A()) {
                jw0Var = null;
            }
            if (jw0Var != null) {
                jw0Var.D(fArr);
            }
        }
        return ll2.a;
    }
}
