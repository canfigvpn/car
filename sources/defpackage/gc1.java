package defpackage;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc1 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ gs1 f;

    public /* synthetic */ gc1(gs1 gs1Var, int i) {
        this.e = i;
        this.f = gs1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        gs1 gs1Var = this.f;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = gs1Var.e;
                boolean z = true;
                if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                si2 si2Var = (si2) obj;
                si2Var.getClass();
                tz0 tz0Var = ((ui2) si2Var).s;
                List listW = (List) gs1Var.e;
                if (listW != null) {
                    listW.add(tz0Var);
                } else {
                    listW = vs0.w(tz0Var);
                }
                gs1Var.e = listW;
                return ri2.f;
        }
    }
}
