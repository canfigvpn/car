package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vg1 extends zh1 {
    public static final vg1 c = new vg1(0, 2, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) throws IllegalAccessException, InvocationTargetException {
        nr0 nr0Var = (nr0) vpVar.e(1);
        int i = nr0Var != null ? nr0Var.a : 0;
        io ioVar = (io) vpVar.e(0);
        if (i > 0) {
            aeVar = new vf1(aeVar, i);
        }
        ioVar.U(aeVar, o52Var, rs1Var, ai1Var != null ? new dq0(28, ai1Var, o52Var) : null);
    }
}
