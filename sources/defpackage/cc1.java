package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class cc1 extends zb1 implements Iterable, fv0 {
    public static final /* synthetic */ int k = 0;
    public final fc1 j;

    public cc1(hc1 hc1Var) {
        super(hc1Var);
        this.j = new fc1(this);
    }

    @Override // defpackage.zb1
    public final yb1 c(ud udVar) {
        yb1 yb1VarC = super.c(udVar);
        fc1 fc1Var = this.j;
        fc1Var.getClass();
        return fc1Var.q(yb1VarC, udVar, false, (cc1) fc1Var.e);
    }

    public final yb1 d(ud udVar, zb1 zb1Var) {
        return this.j.q(super.c(udVar), udVar, true, zb1Var);
    }

    public final yb1 e(String str, boolean z, zb1 zb1Var) {
        yb1 yb1VarE;
        fc1 fc1Var = this.j;
        fc1Var.getClass();
        cc1 cc1Var = (cc1) fc1Var.e;
        yb1 yb1VarC = cc1Var.f.c(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = cc1Var.iterator();
        while (true) {
            ec1 ec1Var = (ec1) it;
            yb1VarE = null;
            if (!ec1Var.hasNext()) {
                break;
            }
            zb1 zb1Var2 = (zb1) ec1Var.next();
            if (!ws0.j(zb1Var2, zb1Var)) {
                if (zb1Var2 instanceof cc1) {
                    yb1VarE = ((cc1) zb1Var2).e(str, false, cc1Var);
                } else {
                    zb1Var2.getClass();
                    yb1VarE = zb1Var2.f.c(str);
                }
            }
            if (yb1VarE != null) {
                arrayList.add(yb1VarE);
            }
        }
        yb1 yb1Var = (yb1) vq.Y(arrayList);
        cc1 cc1Var2 = cc1Var.g;
        if (cc1Var2 != null && z && !cc1Var2.equals(zb1Var)) {
            yb1VarE = cc1Var2.e(str, true, cc1Var);
        }
        return (yb1) vq.Y(ve.D0(new yb1[]{yb1VarC, yb1Var, yb1VarE}));
    }

    @Override // defpackage.zb1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cc1) || !super.equals(obj)) {
            return false;
        }
        fc1 fc1Var = this.j;
        int iD = ((v72) fc1Var.f).d();
        fc1 fc1Var2 = ((cc1) obj).j;
        if (iD != ((v72) fc1Var2.f).d() || fc1Var.b != fc1Var2.b) {
            return false;
        }
        for (zb1 zb1Var : (qw) o12.s(new v(4, (v72) fc1Var.f))) {
            if (!zb1Var.equals(s5.B((v72) fc1Var2.f, zb1Var.f.a))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.zb1
    public final int hashCode() {
        fc1 fc1Var = this.j;
        int iB = fc1Var.b;
        v72 v72Var = (v72) fc1Var.f;
        int iD = v72Var.d();
        for (int i = 0; i < iD; i++) {
            iB = (((iB * 31) + v72Var.b(i)) * 31) + ((zb1) v72Var.e(i)).hashCode();
        }
        return iB;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        fc1 fc1Var = this.j;
        fc1Var.getClass();
        return new ec1(fc1Var);
    }

    @Override // defpackage.zb1
    public final String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        fc1 fc1Var = this.j;
        String str = fc1Var.d;
        fc1Var.getClass();
        zb1 zb1VarN = (str == null || h92.I(str)) ? null : fc1Var.n(str, true);
        if (zb1VarN == null) {
            zb1VarN = fc1Var.m(fc1Var.b);
        }
        sb.append(" startDestination=");
        if (zb1VarN == null) {
            String str2 = fc1Var.d;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = fc1Var.c;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(fc1Var.b));
                }
            }
        } else {
            sb.append("{");
            sb.append(zb1VarN.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
