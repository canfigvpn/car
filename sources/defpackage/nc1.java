package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc1 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ p82 f;

    public /* synthetic */ nc1(p82 p82Var, int i) {
        this.e = i;
        this.f = p82Var;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        p82 p82Var = this.f;
        switch (i) {
            case 0:
                List list = (List) p82Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (ws0.j(((kb1) obj).f.e, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 1:
                return Float.valueOf(((Number) p82Var.getValue()).floatValue());
            case 2:
                return Float.valueOf(((Number) p82Var.getValue()).floatValue());
            case 3:
                uf1 uf1Var = (uf1) p82Var.getValue();
                long j = uf1Var.a;
                return uf1Var;
            case 4:
                qb qbVar = f02.a;
                uf1 uf1Var2 = (uf1) p82Var.getValue();
                long j2 = uf1Var2.a;
                return uf1Var2;
            case 5:
                return Boolean.valueOf(((Number) p82Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) p82Var.getValue()).floatValue() > 0.0f);
        }
    }
}
