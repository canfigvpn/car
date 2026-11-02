package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cs implements uy, Serializable {
    public final uy e;
    public final sy f;

    public cs(sy syVar, uy uyVar) {
        uyVar.getClass();
        this.e = uyVar;
        this.f = syVar;
    }

    public final boolean equals(Object obj) {
        boolean zJ;
        if (this == obj) {
            return true;
        }
        if (obj instanceof cs) {
            cs csVar = (cs) obj;
            int i = 2;
            cs csVar2 = csVar;
            int i2 = 2;
            while (true) {
                uy uyVar = csVar2.e;
                csVar2 = uyVar instanceof cs ? (cs) uyVar : null;
                if (csVar2 == null) {
                    break;
                }
                i2++;
            }
            cs csVar3 = this;
            while (true) {
                uy uyVar2 = csVar3.e;
                csVar3 = uyVar2 instanceof cs ? (cs) uyVar2 : null;
                if (csVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    sy syVar = this.f;
                    if (!ws0.j(csVar.p(syVar.getKey()), syVar)) {
                        zJ = false;
                        break;
                    }
                    uy uyVar3 = this.e;
                    if (!(uyVar3 instanceof cs)) {
                        uyVar3.getClass();
                        sy syVar2 = (sy) uyVar3;
                        zJ = ws0.j(csVar.p(syVar2.getKey()), syVar2);
                        break;
                    }
                    this = (cs) uyVar3;
                }
                if (zJ) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + this.e.hashCode();
    }

    @Override // defpackage.uy
    public final uy k(uy uyVar) {
        uyVar.getClass();
        return uyVar == ab0.e ? this : (uy) uyVar.s(new tt(27), this);
    }

    @Override // defpackage.uy
    public final sy p(ty tyVar) {
        tyVar.getClass();
        while (true) {
            sy syVarP = this.f.p(tyVar);
            if (syVarP != null) {
                return syVarP;
            }
            uy uyVar = this.e;
            if (!(uyVar instanceof cs)) {
                return uyVar.p(tyVar);
            }
            this = (cs) uyVar;
        }
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        return ij0Var.g(this.e.s(ij0Var, obj), this.f);
    }

    public final String toString() {
        return "[" + ((String) s(new ut(4), "")) + ']';
    }

    @Override // defpackage.uy
    public final uy u(ty tyVar) {
        tyVar.getClass();
        sy syVar = this.f;
        sy syVarP = syVar.p(tyVar);
        uy uyVar = this.e;
        if (syVarP != null) {
            return uyVar;
        }
        uy uyVarU = uyVar.u(tyVar);
        if (uyVarU == uyVar) {
            return this;
        }
        return uyVarU == ab0.e ? syVar : new cs(syVar, uyVarU);
    }
}
