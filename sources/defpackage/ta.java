package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ta implements w61 {
    public final ab a;

    public ta(ab abVar) {
        this.a = abVar;
    }

    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r61) list.get(0)).f(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r61) list.get(i2)).f(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r61) list.get(0)).a0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r61) list.get(i2)).a0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.w61
    public final x61 g(y61 y61Var, List list, long j) {
        jm1 jm1Var;
        int i;
        jm1 jm1Var2;
        int i2;
        int i3;
        int size = list.size();
        jm1[] jm1VarArr = new jm1[size];
        int size2 = list.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            jm1Var = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            r61 r61Var = (r61) list.get(i4);
            Object objJ = r61Var.j();
            va vaVar = objJ instanceof va ? (va) objJ : null;
            if (vaVar != null && ((Boolean) vaVar.a.getValue()).booleanValue()) {
                jm1 jm1VarE = r61Var.e(j);
                long j3 = (((long) jm1VarE.f) & 4294967295L) | (((long) jm1VarE.e) << 32);
                jm1VarArr[i4] = jm1VarE;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list.size();
        for (int i5 = 0; i5 < size3; i5++) {
            r61 r61Var2 = (r61) list.get(i5);
            if (jm1VarArr[i5] == null) {
                jm1VarArr[i5] = r61Var2.e(j);
            }
        }
        if (y61Var.r()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size != 0) {
                jm1Var2 = jm1VarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = jm1Var2 != null ? jm1Var2.e : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            jm1 jm1Var3 = jm1VarArr[i8];
                            int i9 = jm1Var3 != null ? jm1Var3.e : 0;
                            if (i7 < i9) {
                                jm1Var2 = jm1Var3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else {
                jm1Var2 = null;
            }
            i2 = jm1Var2 != null ? jm1Var2.e : 0;
        }
        if (y61Var.r()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                jm1Var = jm1VarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = jm1Var != null ? jm1Var.f : 0;
                    if (1 <= i10) {
                        while (true) {
                            jm1 jm1Var4 = jm1VarArr[i];
                            int i12 = jm1Var4 != null ? jm1Var4.f : 0;
                            if (i11 < i12) {
                                jm1Var = jm1Var4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = jm1Var != null ? jm1Var.f : 0;
        }
        if (!y61Var.r()) {
            this.a.c.setValue(new qr0((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return y61Var.d0(i2, i3, db0.e, new sa(jm1VarArr, this, i2, i3));
    }

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r61) list.get(0)).e0(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r61) list.get(i2)).e0(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.w61
    public final int j(os0 os0Var, List list, int i) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((r61) list.get(0)).U(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((r61) list.get(i2)).U(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
