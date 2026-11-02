package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wx implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ me2 f;

    public /* synthetic */ wx(me2 me2Var, int i) {
        this.e = i;
        this.f = me2Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0120  */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        yr1 yr1Var;
        jw0 jw0VarC;
        char c;
        float fIntBitsToFloat;
        jw0 jw0VarC2;
        jw0 jw0VarC3;
        jw0 jw0VarC4;
        jw0 jw0VarC5;
        int i = this.e;
        me2 me2Var = this.f;
        switch (i) {
            case 0:
                return new r2(7, me2Var);
            case 1:
                me2Var.s();
                return ll2.a;
            default:
                jw0 jw0Var = (jw0) obj;
                f11 f11Var = me2Var.d;
                yr1 yr1Var2 = yr1.e;
                if (f11Var == null) {
                    yr1Var = yr1Var2;
                } else {
                    if (f11Var.p) {
                        f11Var = null;
                    }
                    if (f11Var != null) {
                        xf1 xf1Var = me2Var.b;
                        long j = me2Var.l().b;
                        int i2 = of2.c;
                        int iR = xf1Var.r((int) (j >> 32));
                        int iR2 = me2Var.b.r((int) (me2Var.l().b & 4294967295L));
                        f11 f11Var2 = me2Var.d;
                        long jR = 0;
                        long jR2 = (f11Var2 == null || (jw0VarC5 = f11Var2.c()) == null) ? 0L : jw0VarC5.R(me2Var.j(true));
                        f11 f11Var3 = me2Var.d;
                        if (f11Var3 != null && (jw0VarC4 = f11Var3.c()) != null) {
                            jR = jw0VarC4.R(me2Var.j(false));
                        }
                        f11 f11Var4 = me2Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (f11Var4 == null || (jw0VarC3 = f11Var4.c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            if2 if2VarD = f11Var.d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (jw0VarC3.R((((long) Float.floatToRawIntBits(if2VarD != null ? if2VarD.a.c(iR).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        f11 f11Var5 = me2Var.d;
                        if (f11Var5 != null && (jw0VarC2 = f11Var5.c()) != null) {
                            if2 if2VarD2 = f11Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jw0VarC2.R((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(if2VarD2 != null ? if2VarD2.a.c(iR2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jR2 >> c);
                        int i4 = (int) (jR >> c);
                        yr1Var = new yr1(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (f11Var.a.g.b() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jR2 & 4294967295L)), Float.intBitsToFloat((int) (jR & 4294967295L))));
                    } else {
                        yr1Var = yr1Var2;
                    }
                }
                f11 f11Var6 = me2Var.d;
                if (f11Var6 == null || (jw0VarC = f11Var6.c()) == null) {
                    return null;
                }
                return (jw0VarC.A() && jw0Var.A()) ? sv.e(jw0Var.t(sv.A(jw0VarC), yr1Var.d()), yr1Var.c()) : yr1Var2;
        }
    }
}
