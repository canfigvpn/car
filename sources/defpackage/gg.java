package defpackage;

import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gg implements b60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b60
    public final void a() throws Exception {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((bg) obj2).b((cu) obj);
                break;
            case 1:
                ((kb1) obj2).l.j.f((b50) obj);
                break;
            case 2:
                ((s01) obj2).g.k(obj);
                break;
            case 3:
                Iterator it = ((List) ((p82) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((hu) obj).b().c((kb1) it.next());
                }
                break;
            case 4:
                ((bg) obj2).b((nu) obj);
                break;
            case 5:
                da1 da1Var = (da1) obj2;
                rp1 rp1Var = (rp1) da1Var.getValue();
                if (rp1Var != null) {
                    qp1 qp1Var = new qp1(rp1Var);
                    f91 f91Var = (f91) obj;
                    if (f91Var != null) {
                        f91Var.c(qp1Var);
                    }
                    da1Var.setValue(null);
                }
                break;
            case 6:
                ((ki2) obj2).j.remove((ki2) obj);
                break;
            case 7:
                ki2 ki2Var = (ki2) obj2;
                ki2Var.getClass();
                ei2 ei2Var = (ei2) ((fi2) obj).b.getValue();
                if (ei2Var != null) {
                    ki2Var.i.remove(ei2Var.e);
                }
                break;
            case 8:
                ((ki2) obj2).i.remove((ii2) obj);
                break;
            default:
                fq2 fq2Var = (fq2) obj2;
                View view = (View) obj;
                int i2 = fq2Var.t - 1;
                fq2Var.t = i2;
                if (i2 == 0) {
                    Field field = ln2.a;
                    fn2.b(view, null);
                    fp2.a(view, null);
                    view.removeOnAttachStateChangeListener(fq2Var.u);
                }
                break;
        }
    }
}
