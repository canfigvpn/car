package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class qt0 extends vt0 {
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(ot0 ot0Var) {
        super(true);
        boolean z = true;
        R(ot0Var);
        Unsafe unsafe = we.a;
        long j = vt0.e;
        hp hpVar = (hp) unsafe.getObjectVolatile(this, j);
        ip ipVar = hpVar instanceof ip ? (ip) hpVar : null;
        if (ipVar == null) {
            z = false;
            break;
        }
        vt0 vt0VarL = ipVar.l();
        while (!vt0VarL.L()) {
            hp hpVar2 = (hp) we.a.getObjectVolatile(vt0VarL, j);
            ip ipVar2 = hpVar2 instanceof ip ? (ip) hpVar2 : null;
            if (ipVar2 == null) {
                z = false;
                break;
            }
            vt0VarL = ipVar2.l();
        }
        this.g = z;
    }

    @Override // defpackage.vt0
    public final boolean L() {
        return this.g;
    }

    @Override // defpackage.vt0
    public final boolean M() {
        return true;
    }
}
