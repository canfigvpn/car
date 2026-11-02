package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ag {
    public final ArrayList a;
    public boolean b;
    public final CopyOnWriteArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public ag(boolean z) {
        this.a = new ArrayList();
        this.b = z;
        this.c = new CopyOnWriteArrayList();
    }

    public final void d(boolean z) {
        this.b = z;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dg1 dg1Var = (dg1) obj;
            dg1Var.f(dg1Var.e && z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag(int i, Object obj) {
        this(false);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ag(j6 j6Var) {
        this(true);
        this.d = 2;
        this.e = j6Var;
    }

    public final void a() {
    }

    public final void b(yf yfVar) {
    }

    public final void c(yf yfVar) {
    }
}
