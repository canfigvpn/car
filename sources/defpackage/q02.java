package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q02 {
    public final i02 a;
    public final e91 b;

    public q02(p02 p02Var, gr0 gr0Var) {
        this.a = p02Var.d;
        List listJ = p02.j(4, p02Var);
        this.b = new e91(listJ.size());
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            p02 p02Var2 = (p02) listJ.get(i);
            if (gr0Var.a(p02Var2.f)) {
                this.b.a(p02Var2.f);
            }
        }
    }
}
