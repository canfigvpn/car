package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q30 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q30(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, tv0] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [p91] */
    /* JADX WARN: Type inference failed for: r9v2, types: [p91] */
    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                nh2 nh2Var = ((z42) obj).i;
                return new dr(ws0.G(nh2Var.a, nh2Var.b, d90.b.c(0.0f)));
            default:
                ArrayList arrayList = ((dk0) obj).a;
                w91 w91Var = new w91(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r4 = (tv0) arrayList.get(i2);
                    Object obj2 = r4.b;
                    int i3 = r4.a;
                    Object wt0Var = obj2 != null ? new wt0(Integer.valueOf(i3), r4.b) : Integer.valueOf(i3);
                    int iF = w91Var.f(wt0Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : w91Var.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof p91) {
                            ?? r8 = (p91) obj3;
                            r8.a(r4);
                            r4 = r8;
                        } else {
                            Object[] objArr = ff1.a;
                            ?? p91Var = new p91(2);
                            p91Var.a(obj3);
                            p91Var.a(r4);
                            r4 = p91Var;
                        }
                    }
                    if (z) {
                        int i4 = ~iF;
                        w91Var.b[i4] = wt0Var;
                        w91Var.c[i4] = r4;
                    } else {
                        w91Var.c[iF] = r4;
                    }
                }
                return new z81(w91Var);
        }
    }
}
