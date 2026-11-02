package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ fz0(h7 h7Var, int i) {
        this.a = i;
        this.b = h7Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        h7 h7Var = this.b;
        switch (i) {
            case 0:
                return s5.D(Integer.valueOf(h7Var.c(((nz0) obj).getKey())), Integer.valueOf(h7Var.c(((nz0) obj2).getKey())));
            case 1:
                return s5.D(Integer.valueOf(h7Var.c(((nz0) obj).getKey())), Integer.valueOf(h7Var.c(((nz0) obj2).getKey())));
            case 2:
                return s5.D(Integer.valueOf(h7Var.c(((nz0) obj2).getKey())), Integer.valueOf(h7Var.c(((nz0) obj).getKey())));
            default:
                return s5.D(Integer.valueOf(h7Var.c(((nz0) obj2).getKey())), Integer.valueOf(h7Var.c(((nz0) obj).getKey())));
        }
    }
}
