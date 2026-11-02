package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qk implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qk(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((pm) obj2).cancel();
                return ll2Var;
            case 1:
                ((ArrayList) obj2).get(((Number) obj).intValue());
                return null;
            default:
                float[] fArr = ((q61) obj).a;
                jw0 jw0Var = (jw0) obj2;
                if (jw0Var.A()) {
                    sv.A(jw0Var).I(jw0Var, fArr);
                }
                return ll2Var;
        }
    }
}
