package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u41 implements m40 {
    public boolean e;
    public long f = 9223372034707292159L;
    public long g = 0;
    public final /* synthetic */ x41 h;

    public u41(x41 x41Var) {
        this.h = x41Var;
    }

    public final jw0 a() {
        this.e = true;
        x41 x41Var = this.h;
        jw0 jw0VarX0 = x41Var.x0();
        if (ir0.a(this.f, 9223372034707292159L)) {
            this.f = mx.N(jw0VarX0.c(0L));
            this.g = jw0VarX0.P();
        }
        x41Var.z0().J.b();
        return jw0VarX0;
    }

    @Override // defpackage.m40
    public final float b() {
        return this.h.b();
    }

    public final void c(rn0 rn0Var, float f) {
        x41 x41Var = this.h;
        pc pcVar = x41Var.q;
        if (pcVar == null) {
            pcVar = new pc();
            x41Var.q = pcVar;
        }
        int iG0 = ve.G0((rn0[]) pcVar.b, rn0Var);
        if (iG0 >= 0) {
            float[] fArr = (float[]) pcVar.c;
            if (fArr[iG0] != f) {
                fArr[iG0] = f;
                ((byte[]) pcVar.d)[iG0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) pcVar.d;
                if (bArr[iG0] == 2) {
                    bArr[iG0] = 0;
                    return;
                }
                return;
            }
        }
        int i = pcVar.a;
        rn0[] rn0VarArr = (rn0[]) pcVar.b;
        if (i == rn0VarArr.length) {
            int i2 = i * 2;
            pcVar.b = (rn0[]) Arrays.copyOf(rn0VarArr, i2);
            pcVar.c = Arrays.copyOf((float[]) pcVar.c, i2);
            pcVar.d = Arrays.copyOf((byte[]) pcVar.d, i2);
        }
        ((rn0[]) pcVar.b)[i] = rn0Var;
        ((byte[]) pcVar.d)[i] = 3;
        ((float[]) pcVar.c)[i] = f;
        pcVar.a++;
    }

    @Override // defpackage.m40
    public final float l() {
        return this.h.l();
    }
}
