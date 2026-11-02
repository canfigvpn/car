package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wg1 extends zh1 {
    public static final wg1 c = new wg1(0, 2, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        int i = ((nr0) vpVar.e(0)).a;
        List list = (List) vpVar.e(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            aeVar.c(i3, obj);
            aeVar.f(i3, obj);
        }
    }
}
