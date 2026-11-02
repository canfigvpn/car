package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ jq f;

    public /* synthetic */ c(jq jqVar, int i) {
        this.e = i;
        this.f = jqVar;
    }

    @Override // defpackage.ti0
    public final Object a() {
        b40 b40Var;
        int i = this.e;
        jq jqVar = this.f;
        switch (i) {
            case 0:
                bp0 bp0Var = (bp0) ir2.j(jqVar, yo0.a);
                if (bp0Var == null) {
                    yp0.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + bp0Var);
                }
                bp0 bp0Var2 = jqVar.C;
                jqVar.C = bp0Var;
                if (bp0Var2 != null && !ws0.j(bp0Var, bp0Var2) && ((b40Var = jqVar.D) != null || !jqVar.K)) {
                    if (b40Var != null) {
                        jqVar.G0(b40Var);
                    }
                    jqVar.D = null;
                    jqVar.N0();
                }
                return ll2.a;
            default:
                jqVar.A.a();
                return Boolean.TRUE;
        }
    }
}
