package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ui1 implements w61 {
    public final ej0 a;
    public final boolean b;
    public final xd2 c;
    public final ud2 d;
    public final gj1 e;
    public final float f;

    public ui1(ej0 ej0Var, boolean z, xd2 xd2Var, ud2 ud2Var, gj1 gj1Var, float f) {
        this.a = ej0Var;
        this.b = z;
        this.c = xd2Var;
        this.d = ud2Var;
        this.e = gj1Var;
        this.f = f;
    }

    public static final int i(int i, ui1 ui1Var, int i2, int i3, jm1 jm1Var, jm1 jm1Var2) {
        if (ui1Var.b) {
            i3 = Math.round(((i2 - jm1Var2.f) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (jm1Var != null ? jm1Var.f : 0) / 2);
    }

    public final int a(m40 m40Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, rw.E(f, i6, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        gj1 gj1Var = this.e;
        float fX = m40Var.x(gj1Var.d());
        return tw.f(Math.max(i, Math.max(i2, p61.j0(rw.D(fX, Math.max(fX, i6 / 2.0f), f) + i5 + m40Var.x(gj1Var.c())))) + i8, j);
    }

    @Override // defpackage.w61
    public final int b(os0 os0Var, List list, int i) {
        return e(os0Var, list, i, new vy(10));
    }

    @Override // defpackage.w61
    public final int c(os0 os0Var, List list, int i) {
        return f(os0Var, list, i, new vy(9));
    }

    public final int d(m40 m40Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, rw.E(f, i6, 0))) + i + i2;
        gj1 gj1Var = this.e;
        kw0 kw0Var = kw0.e;
        return tw.g(Math.max(iMax, p61.j0((i6 + m40Var.x(gj1Var.b(kw0Var) + gj1Var.a(kw0Var))) * f)), j);
    }

    public final int e(os0 os0Var, List list, int i, ij0 ij0Var) {
        Object obj;
        int iO;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        ui1 ui1Var = this;
        float fA = ui1Var.d.a();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (ws0.j(ix.B((r61) obj), "Leading")) {
                break;
            }
            i2++;
        }
        r61 r61Var = (r61) obj;
        if (r61Var != null) {
            iO = ix.O(i, r61Var.a0(Integer.MAX_VALUE));
            iIntValue = ((Number) ij0Var.g(r61Var, Integer.valueOf(i))).intValue();
        } else {
            iO = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (ws0.j(ix.B((r61) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        r61 r61Var2 = (r61) obj2;
        if (r61Var2 != null) {
            iO = ix.O(iO, r61Var2.a0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) ij0Var.g(r61Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (ws0.j(ix.B((r61) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (r61) obj3;
        int iIntValue5 = obj8 != null ? ((Number) ij0Var.g(obj8, Integer.valueOf(rw.E(fA, iO, i)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (ws0.j(ix.B((r61) obj4), "Prefix")) {
                break;
            }
            i5++;
        }
        r61 r61Var3 = (r61) obj4;
        if (r61Var3 != null) {
            iIntValue3 = ((Number) ij0Var.g(r61Var3, Integer.valueOf(iO))).intValue();
            iO = ix.O(iO, r61Var3.a0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (ws0.j(ix.B((r61) obj5), "Suffix")) {
                break;
            }
            i6++;
        }
        r61 r61Var4 = (r61) obj5;
        if (r61Var4 != null) {
            iIntValue4 = ((Number) ij0Var.g(r61Var4, Integer.valueOf(iO))).intValue();
            iO = ix.O(iO, r61Var4.a0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (ws0.j(ix.B((r61) obj9), "TextField")) {
                int iIntValue6 = ((Number) ij0Var.g(obj9, Integer.valueOf(iO))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (ws0.j(ix.B((r61) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (r61) obj6;
                int iIntValue7 = obj10 != null ? ((Number) ij0Var.g(obj10, Integer.valueOf(iO))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (ws0.j(ix.B((r61) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (r61) obj7;
                return ui1Var.a(os0Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) ij0Var.g(obj11, Integer.valueOf(i))).intValue() : 0, tw.b(0, 0, 15), fA);
            }
            i7++;
            iIntValue4 = iIntValue4;
            ui1Var = this;
            iIntValue3 = iIntValue3;
        }
        c31.b("Collection contains no element matching the predicate.");
        qj.e();
        return 0;
    }

    public final int f(os0 os0Var, List list, int i, ij0 ij0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (ws0.j(ix.B((r61) obj7), "TextField")) {
                int iIntValue = ((Number) ij0Var.g(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (ws0.j(ix.B((r61) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                r61 r61Var = (r61) obj2;
                int iIntValue2 = r61Var != null ? ((Number) ij0Var.g(r61Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (ws0.j(ix.B((r61) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                r61 r61Var2 = (r61) obj3;
                int iIntValue3 = r61Var2 != null ? ((Number) ij0Var.g(r61Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (ws0.j(ix.B((r61) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                r61 r61Var3 = (r61) obj4;
                int iIntValue4 = r61Var3 != null ? ((Number) ij0Var.g(r61Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (ws0.j(ix.B((r61) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                r61 r61Var4 = (r61) obj5;
                int iIntValue5 = r61Var4 != null ? ((Number) ij0Var.g(r61Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (ws0.j(ix.B((r61) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                r61 r61Var5 = (r61) obj6;
                int iIntValue6 = r61Var5 != null ? ((Number) ij0Var.g(r61Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (ws0.j(ix.B((r61) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                r61 r61Var6 = (r61) obj;
                return d(os0Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, r61Var6 != null ? ((Number) ij0Var.g(r61Var6, Integer.valueOf(i))).intValue() : 0, tw.b(0, 0, 15), this.d.a());
            }
        }
        c31.b("Collection contains no element matching the predicate.");
        qj.e();
        return 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.w61
    public final defpackage.x61 g(defpackage.y61 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui1.g(y61, java.util.List, long):x61");
    }

    @Override // defpackage.w61
    public final int h(os0 os0Var, List list, int i) {
        return e(os0Var, list, i, new vy(8));
    }

    @Override // defpackage.w61
    public final int j(os0 os0Var, List list, int i) {
        return f(os0Var, list, i, new vy(11));
    }
}
