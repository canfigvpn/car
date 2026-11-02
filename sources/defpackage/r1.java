package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements b60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public r1(y11 y11Var, u11 u11Var, gs1 gs1Var) {
        this.a = 3;
        this.c = y11Var;
        this.b = u11Var;
        this.d = gs1Var;
    }

    @Override // defpackage.b60
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((ti0) obj3).a();
                ((y11) obj2).h().f((q1) obj);
                break;
            case 1:
                ((h72) obj3).remove(obj2);
                ((ab) obj).d.k(obj2);
                break;
            case 2:
                kb1 kb1Var = (kb1) obj2;
                ((h50) obj3).b().c(kb1Var);
                ((h72) obj).remove(kb1Var);
                break;
            case 3:
                ((y11) obj2).h().f((u11) obj3);
                fg fgVar = (fg) ((gs1) obj).e;
                if (fgVar != null) {
                    fgVar.a();
                }
                break;
            default:
                fw1 fw1Var = (fw1) obj3;
                jw1 jw1Var = (jw1) obj;
                if (fw1Var.f.k(obj2) == jw1Var) {
                    Map map = fw1Var.e;
                    Map mapE = jw1Var.e();
                    if (!mapE.isEmpty()) {
                        map.put(obj2, mapE);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
