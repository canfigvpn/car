package defpackage;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i72 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i72(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        Collection collectionA0;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                k72 k72Var = (k72) obj3;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = k72Var.b;
                while (true) {
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        collectionA0 = collection;
                    } else if (obj4 instanceof Set) {
                        collectionA0 = vs0.v(obj4, collection);
                    } else {
                        if (!(obj4 instanceof List)) {
                            hv.b("Unexpected notification");
                            qj.e();
                            return null;
                        }
                        collectionA0 = vq.a0((Collection) obj4, vs0.u(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj4, collectionA0)) {
                            if (!k72Var.b()) {
                                return ll2Var;
                            }
                            k72Var.a.h(new r12(5, k72Var));
                            return ll2Var;
                        }
                    } while (atomicReference.get() == obj4);
                }
                break;
            case 1:
                ak0 ak0Var = (ak0) obj;
                ((Integer) obj2).getClass();
                ak0Var.W(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                ak0Var.p(false);
                return strValueOf;
            case 2:
                ak0 ak0Var2 = (ak0) obj;
                ((Integer) obj2).getClass();
                ak0Var2.W(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                ak0Var2.p(false);
                return string;
            case 3:
                ((ej0) obj3).h(obj);
                return ll2Var;
            case 4:
                return new ir0(((long) ((vi) obj3).a(0, (int) (((qr0) obj).a & 4294967295L))) & 4294967295L);
            default:
                return new ir0(((t3) obj3).a(0L, ((qr0) obj).a, (kw0) obj2));
        }
    }
}
