package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v22 implements ej0 {
    public final /* synthetic */ int e;

    public /* synthetic */ v22(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0282  */
    @Override // defpackage.ej0
    public final Object h(Object obj) throws Exception {
        int iOffsetByCodePoints;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                vv1 vv1Var = (vv1) obj;
                vv1Var.getClass();
                xv1 xv1VarC = vv1Var.C("SELECT * FROM service_types ORDER BY sortOrder, id");
                try {
                    int iX = mx.x(xv1VarC, "id");
                    int iX2 = mx.x(xv1VarC, "key");
                    int iX3 = mx.x(xv1VarC, "customName");
                    int iX4 = mx.x(xv1VarC, "icon");
                    int iX5 = mx.x(xv1VarC, "defaultIntervalKm");
                    int iX6 = mx.x(xv1VarC, "defaultIntervalMonths");
                    int iX7 = mx.x(xv1VarC, "tracksQuantity");
                    int iX8 = mx.x(xv1VarC, "isBuiltIn");
                    int iX9 = mx.x(xv1VarC, "sortOrder");
                    ArrayList arrayList = new ArrayList();
                    while (xv1VarC.y()) {
                        arrayList.add(new x22(xv1VarC.getLong(iX), xv1VarC.f(iX2), xv1VarC.isNull(iX3) ? null : xv1VarC.f(iX3), xv1VarC.f(iX4), xv1VarC.isNull(iX5) ? null : Integer.valueOf((int) xv1VarC.getLong(iX5)), xv1VarC.isNull(iX6) ? null : Integer.valueOf((int) xv1VarC.getLong(iX6)), ((int) xv1VarC.getLong(iX7)) != 0, ((int) xv1VarC.getLong(iX8)) != 0, (int) xv1VarC.getLong(iX9)));
                        break;
                    }
                    return arrayList;
                } finally {
                    xv1VarC.close();
                }
            case 1:
                return ll2Var;
            case 2:
                return ll2Var;
            case 3:
                lv0[] lv0VarArr = w02.a;
                y02 y02Var = u02.m;
                lv0 lv0Var = w02.a[5];
                ((z02) obj).a(y02Var, Boolean.TRUE);
                return ll2Var;
            case 4:
                return ll2Var;
            case 5:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 6:
                ((Float) obj).getClass();
                return ll2Var;
            case 7:
                yd2 yd2Var = (yd2) obj;
                String str = yd2Var.g.f;
                long j = yd2Var.f;
                int i2 = of2.c;
                int i3 = (int) (j & 4294967295L);
                if (i3 > 0) {
                    ca0 ca0VarG = c22.g();
                    if (ca0VarG != null) {
                        int iB = ca0VarG.b(str, i3 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i3 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                        }
                    } else if (i3 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new j40(((int) (yd2Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case 8:
                yd2 yd2Var2 = (yd2) obj;
                String str2 = yd2Var2.g.f;
                long j2 = yd2Var2.f;
                int i4 = of2.c;
                int iC = c22.c(str2, (int) (j2 & 4294967295L));
                if (iC != -1) {
                    return new j40(0, iC - ((int) (yd2Var2.f & 4294967295L)));
                }
                return null;
            case 9:
                yd2 yd2Var3 = (yd2) obj;
                Integer numE = yd2Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = yd2Var3.f;
                int i5 = of2.c;
                return new j40(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 10:
                yd2 yd2Var4 = (yd2) obj;
                Integer numD = yd2Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = yd2Var4.f;
                int i6 = of2.c;
                return new j40(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case 11:
                yd2 yd2Var5 = (yd2) obj;
                Integer numC = yd2Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = yd2Var5.f;
                int i7 = of2.c;
                return new j40(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case 12:
                yd2 yd2Var6 = (yd2) obj;
                Integer numB = yd2Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = yd2Var6.f;
                int i8 = of2.c;
                return new j40(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 13:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                di1 di1Var = ((Boolean) obj2).booleanValue() ? di1.e : di1.f;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new de2(di1Var, ((Float) obj3).floatValue());
            case 14:
                return ll2Var;
            case 15:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                ru1 ru1Var = ax1.a;
                Boolean bool = Boolean.FALSE;
                yb ybVar = (ws0.j(obj4, bool) || obj4 == null) ? null : (yb) ((ej0) ru1Var.c).h(obj4);
                ybVar.getClass();
                Object obj5 = list2.get(1);
                int i9 = of2.c;
                of2 of2Var = (ws0.j(obj5, bool) || obj5 == null) ? null : (of2) ((ej0) ax1.p.c).h(obj5);
                of2Var.getClass();
                return new te2(ybVar, of2Var.a, (of2) null);
            case 16:
                xv1 xv1Var = (xv1) obj;
                xv1Var.getClass();
                return Boolean.valueOf(xv1Var.y());
            case 17:
                fz1 fz1Var = (fz1) obj;
                long j7 = fz1Var.f;
                ((k72) oi2.b.getValue()).c(fz1Var, oi2.a, fz1Var.g);
                long j8 = fz1Var.f;
                if (j7 != j8) {
                    yy1 yy1Var = fz1Var.n;
                    if (yy1Var != null) {
                        if (yy1Var.a > j8) {
                            fz1Var.o();
                        } else {
                            yy1Var.g = j8;
                            if (yy1Var.b == null) {
                                yy1Var.h = p61.k0((1.0d - ((double) yy1Var.e.a(0))) * fz1Var.f);
                            }
                        }
                    } else if (j8 != 0) {
                        fz1Var.t();
                    }
                }
                return ll2Var;
            case 18:
                ((ti0) obj).a();
                return ll2Var;
            case 19:
                xv1 xv1Var2 = (xv1) obj;
                xv1Var2.getClass();
                z22 z22Var = new z22();
                while (xv1Var2.y()) {
                    z22Var.add(Integer.valueOf((int) xv1Var2.getLong(0)));
                }
                return n02.f(z22Var);
            case 20:
                return new pb(((Float) obj).floatValue());
            case 21:
                return new pb(((Integer) obj).intValue());
            case 22:
                return Integer.valueOf((int) ((pb) obj).a);
            case 23:
                return new pb(((w60) obj).e);
            case 24:
                return new w60(((pb) obj).a);
            case 25:
                y60 y60Var = (y60) obj;
                return new qb(Float.intBitsToFloat((int) (y60Var.a >> 32)), Float.intBitsToFloat((int) (y60Var.a & 4294967295L)));
            case 26:
                qb qbVar = (qb) obj;
                return new y60((((long) Float.floatToRawIntBits(qbVar.a)) << 32) | (((long) Float.floatToRawIntBits(qbVar.b)) & 4294967295L));
            case 27:
                d52 d52Var = (d52) obj;
                return new qb(Float.intBitsToFloat((int) (d52Var.a >> 32)), Float.intBitsToFloat((int) (d52Var.a & 4294967295L)));
            case 28:
                qb qbVar2 = (qb) obj;
                return new d52((((long) Float.floatToRawIntBits(qbVar2.a)) << 32) | (((long) Float.floatToRawIntBits(qbVar2.b)) & 4294967295L));
            default:
                uf1 uf1Var = (uf1) obj;
                return new qb(Float.intBitsToFloat((int) (uf1Var.a >> 32)), Float.intBitsToFloat((int) (uf1Var.a & 4294967295L)));
        }
    }
}
