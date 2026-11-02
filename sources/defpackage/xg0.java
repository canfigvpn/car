package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xg0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                yg0 yg0Var = (yg0) obj;
                if (yg0Var == null) {
                    yg0Var = new yg0(-3);
                }
                ((dq0) this.b).u(yg0Var);
                return;
            default:
                yg0 yg0Var2 = (yg0) obj;
                synchronized (zg0.c) {
                    try {
                        w42 w42Var = zg0.d;
                        ArrayList arrayList = (ArrayList) w42Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        w42Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((xg0) arrayList.get(i)).a(yg0Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
