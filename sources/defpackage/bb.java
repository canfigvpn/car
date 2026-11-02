package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bb implements w61 {
    public final hb a;
    public boolean b;

    public bb(hb hbVar) {
        this.a = hbVar;
    }

    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((r61) list.get(0)).f(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iF2 = ((r61) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = ((r61) list.get(0)).a0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA1 = ((r61) list.get(i2)).a0(i);
                if (iA1 > iA0) {
                    iA0 = iA1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iA0;
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            jm1 jm1VarE = ((r61) list.get(i)).e(j);
            iMax = Math.max(iMax, jm1VarE.e);
            iMax2 = Math.max(iMax2, jm1VarE.f);
            arrayList.add(jm1VarE);
        }
        boolean zR = y61Var.r();
        hb hbVar = this.a;
        if (zR) {
            this.b = true;
            hbVar.a.setValue(new qr0((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        } else if (!this.b) {
            hbVar.a.setValue(new qr0((((long) iMax2) & 4294967295L) | (((long) iMax) << 32)));
        }
        return y61Var.d0(iMax, iMax2, db0.e, new m6(2, arrayList));
    }

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE0 = ((r61) list.get(0)).e0(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iE1 = ((r61) list.get(i2)).e0(i);
                if (iE1 > iE0) {
                    iE0 = iE1;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iE0;
    }

    @Override // defpackage.w61
    public final int j(os0 os0Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iU = ((r61) list.get(0)).U(i);
        int i2 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iU2 = ((r61) list.get(i2)).U(i);
                if (iU2 > iU) {
                    iU = iU2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return iU;
    }
}
