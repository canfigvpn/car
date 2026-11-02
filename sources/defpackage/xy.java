package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xy extends t implements sy {
    public static final wy f = new wy(q90.A, new s1(22));

    public xy() {
        super(q90.A);
    }

    public abstract void E(uy uyVar, Runnable runnable);

    public void F(uy uyVar, Runnable runnable) {
        E(uyVar, runnable);
    }

    public boolean G(uy uyVar) {
        return !(this instanceof hl2);
    }

    public xy H(int i) {
        qx.p(i);
        return new i21(this, i);
    }

    @Override // defpackage.t, defpackage.uy
    public final sy p(ty tyVar) {
        sy syVar;
        tyVar.getClass();
        if (tyVar instanceof wy) {
            wy wyVar = (wy) tyVar;
            ty tyVar2 = this.e;
            if ((tyVar2 == wyVar || wyVar.f == tyVar2) && (syVar = (sy) wyVar.e.h(this)) != null) {
                return syVar;
            }
        } else if (q90.A == tyVar) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + j20.s(this);
    }

    @Override // defpackage.t, defpackage.uy
    public final uy u(ty tyVar) {
        tyVar.getClass();
        if (tyVar instanceof wy) {
            wy wyVar = (wy) tyVar;
            ty tyVar2 = this.e;
            if ((tyVar2 != wyVar && wyVar.f != tyVar2) || ((sy) wyVar.e.h(this)) == null) {
                return this;
            }
        } else if (q90.A != tyVar) {
            return this;
        }
        return ab0.e;
    }
}
