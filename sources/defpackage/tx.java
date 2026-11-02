package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tx extends sh {
    public final uy f;
    public transient sx g;

    public tx(sx sxVar) {
        this(sxVar, sxVar != null ? sxVar.f() : null);
    }

    @Override // defpackage.sx
    public uy f() {
        uy uyVar = this.f;
        uyVar.getClass();
        return uyVar;
    }

    @Override // defpackage.sh
    public void s() {
        Unsafe unsafe;
        long j;
        sx sxVar = this.g;
        if (sxVar != null && sxVar != this) {
            sy syVarP = f().p(q90.A);
            syVarP.getClass();
            p50 p50Var = (p50) sxVar;
            do {
                unsafe = we.a;
                j = p50.l;
            } while (unsafe.getObjectVolatile(p50Var, j) == ws0.q);
            Object objectVolatile = unsafe.getObjectVolatile(p50Var, j);
            om omVar = objectVolatile instanceof om ? (om) objectVolatile : null;
            if (omVar != null) {
                omVar.q();
            }
        }
        this.g = ns.f;
    }

    public tx(sx sxVar, uy uyVar) {
        super(sxVar);
        this.f = uyVar;
    }
}
