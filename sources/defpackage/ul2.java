package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ul2 {
    public final u22 a;
    public final r22 b;
    public final g22 c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Double h;
    public final t22 i;

    public ul2(u22 u22Var, r22 r22Var, g22 g22Var, Integer num, Integer num2, Integer num3, Integer num4, Double d, t22 t22Var) {
        this.a = u22Var;
        this.b = r22Var;
        this.c = g22Var;
        this.d = num;
        this.e = num2;
        this.f = num3;
        this.g = num4;
        this.h = d;
        this.i = t22Var;
    }

    public final Double a() {
        Double d = this.h;
        if (d != null) {
            if (d.doubleValue() <= 0.0d) {
                d = null;
            }
            if (d != null) {
                double dDoubleValue = d.doubleValue();
                Integer num = this.f;
                if (num != null) {
                    return Double.valueOf(((double) num.intValue()) / dDoubleValue);
                }
            }
        }
        return null;
    }

    public final Float b() {
        Integer num = this.b.c;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = this.f;
            if (num2 != null) {
                return Float.valueOf((iIntValue - num2.intValue()) / iIntValue);
            }
        }
        return null;
    }

    public final Double c() {
        Double dA = a();
        Integer num = this.g;
        Iterator it = ve.D0(new Double[]{dA, num != null ? Double.valueOf(num.intValue()) : null}).iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public final boolean d() {
        Float fB = b();
        if (fB == null) {
            return false;
        }
        float fFloatValue = fB.floatValue();
        Float fE = e();
        if (fE == null) {
            return true;
        }
        float fFloatValue2 = fE.floatValue();
        Double dA = a();
        Integer num = this.g;
        Double dValueOf = num != null ? Double.valueOf(num.intValue()) : null;
        if (dA == null || dValueOf == null) {
            return fFloatValue >= fFloatValue2;
        }
        return dA.doubleValue() <= dValueOf.doubleValue();
    }

    public final Float e() {
        Integer num = this.e;
        if (num != null) {
            int iIntValue = num.intValue();
            g22 g22Var = this.c;
            if (g22Var != null) {
                int i = g22Var.d;
                Integer num2 = this.g;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    int i2 = iIntValue - i;
                    if (i2 <= 0) {
                        return null;
                    }
                    return Float.valueOf((i2 - iIntValue2) / i2);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul2)) {
            return false;
        }
        ul2 ul2Var = (ul2) obj;
        return ws0.j(this.a, ul2Var.a) && ws0.j(this.b, ul2Var.b) && ws0.j(this.c, ul2Var.c) && ws0.j(this.d, ul2Var.d) && ws0.j(this.e, ul2Var.e) && ws0.j(this.f, ul2Var.f) && ws0.j(this.g, ul2Var.g) && ws0.j(this.h, ul2Var.h) && this.i == ul2Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        g22 g22Var = this.c;
        int iHashCode2 = (iHashCode + (g22Var == null ? 0 : g22Var.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.g;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d = this.h;
        return this.i.hashCode() + ((iHashCode6 + (d != null ? d.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UpcomingService(serviceType=" + this.a + ", schedule=" + this.b + ", lastRecord=" + this.c + ", dueAtKm=" + this.d + ", dueAtEpochDay=" + this.e + ", remainingKm=" + this.f + ", remainingDays=" + this.g + ", kmPerDay=" + this.h + ", status=" + this.i + ")";
    }
}
