package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jh1 extends zh1 {
    public static final jh1 c = new jh1(0, 3, 1);

    @Override // defpackage.zh1
    public final void a(vp vpVar, ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) {
        dq0 dq0Var;
        l52 l52Var = (l52) vpVar.e(1);
        vj0 vj0Var = (vj0) vpVar.e(0);
        od0 od0Var = (od0) vpVar.e(2);
        o52 o52VarD = l52Var.d();
        if (ai1Var != null) {
            try {
                dq0Var = new dq0(28, ai1Var, o52Var);
            } catch (Throwable th) {
                o52VarD.e(false);
                throw th;
            }
        } else {
            dq0Var = null;
        }
        if (!od0Var.f.Y()) {
            hv.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        od0Var.e.X(aeVar, o52VarD, rs1Var, dq0Var);
        o52VarD.e(true);
        o52Var.d();
        vj0Var.getClass();
        o52Var.z(l52Var, l52Var.a(vj0Var));
        o52Var.j();
    }
}
