package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oy0 implements ej0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ oy0(int i, Collection collection) {
        this.f = i;
        this.g = collection;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        Object obj2 = this.g;
        int i2 = this.f;
        switch (i) {
            case 0:
                rz0 rz0Var = (rz0) obj;
                c30 c30Var = ((ry0) obj2).a;
                o62 o62VarJ = c12.j();
                c12.s(o62VarJ, c12.p(o62VarJ), o62VarJ != null ? o62VarJ.e() : null);
                c30Var.getClass();
                int i3 = rz0Var.a;
                if (i3 == -1) {
                    i3 = 2;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    rz0Var.a(i2 + i4);
                }
                return ll2.a;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ oy0(ry0 ry0Var, int i) {
        this.g = ry0Var;
        this.f = i;
    }
}
