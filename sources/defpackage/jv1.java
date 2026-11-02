package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jv1 implements u32 {
    public final ry a;
    public final ry b;
    public final ry c;
    public final ry d;

    public jv1(ry ryVar, ry ryVar2, ry ryVar3, ry ryVar4) {
        this.a = ryVar;
        this.b = ryVar2;
        this.c = ryVar3;
        this.d = ryVar4;
    }

    public static jv1 b(jv1 jv1Var, ry ryVar, ry ryVar2, ry ryVar3, ry ryVar4, int i) {
        if ((i & 1) != 0) {
            ryVar = jv1Var.a;
        }
        if ((i & 2) != 0) {
            ryVar2 = jv1Var.b;
        }
        if ((i & 4) != 0) {
            ryVar3 = jv1Var.c;
        }
        if ((i & 8) != 0) {
            ryVar4 = jv1Var.d;
        }
        jv1Var.getClass();
        return new jv1(ryVar, ryVar2, ryVar3, ryVar4);
    }

    @Override // defpackage.u32
    public final mx a(long j, kw0 kw0Var, m40 m40Var) {
        float fA = this.a.a(j, m40Var);
        float fA2 = this.b.a(j, m40Var);
        float fA3 = this.c.a(j, m40Var);
        float fA4 = this.d.a(j, m40Var);
        float fB = d52.b(j);
        float f = fA + fA4;
        if (f > fB) {
            float f2 = fB / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fB) {
            float f4 = fB / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            yp0.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new hi1(sv.e(0L, j));
        }
        yr1 yr1VarE = sv.e(0L, j);
        kw0 kw0Var2 = kw0.e;
        float f5 = kw0Var == kw0Var2 ? fA : fA2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (kw0Var == kw0Var2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
        float f6 = kw0Var == kw0Var2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (kw0Var != kw0Var2) {
            fA4 = fA3;
        }
        return new ii1(new hv1(yr1VarE.a, yr1VarE.b, yr1VarE.c, yr1VarE.d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fA4)) << 32) | (((long) Float.floatToRawIntBits(fA4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv1)) {
            return false;
        }
        jv1 jv1Var = (jv1) obj;
        return ws0.j(this.a, jv1Var.a) && ws0.j(this.b, jv1Var.b) && ws0.j(this.c, jv1Var.c) && ws0.j(this.d, jv1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
