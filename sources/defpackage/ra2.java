package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ra2 {
    public static final a90 a = new a90(0, new vr0(28));

    public static final void a(u71 u71Var, u32 u32Var, long j, long j2, float f, gt gtVar, ak0 ak0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            u71Var = r71.a;
        }
        u71 u71Var2 = u71Var;
        if ((i2 & 2) != 0) {
            u32Var = vs0.C;
        }
        u32 u32Var2 = u32Var;
        if ((i2 & 4) != 0) {
            j = ((jr) ak0Var.j(lr.a)).p;
        }
        long j3 = j;
        long jB = (i2 & 8) != 0 ? lr.b(j3, ak0Var) : j2;
        float f2 = (i2 & 32) != 0 ? 0.0f : f;
        a90 a90Var = a;
        float f3 = ((w60) ak0Var.j(a90Var)).e + 0.0f;
        sv.b(new vq1[]{yw.a.a(new dr(jB)), a90Var.a(new w60(f3))}, vs0.C(421772006, new oa2(u71Var2, u32Var2, j3, f3, null, f2, gtVar), ak0Var), ak0Var, 56);
    }

    public static final void b(boolean z, ti0 ti0Var, u71 u71Var, boolean z2, u32 u32Var, long j, long j2, float f, oj ojVar, f91 f91Var, gt gtVar, ak0 ak0Var, int i, int i2) {
        long jB = (i2 & 64) != 0 ? lr.b(j, ak0Var) : j2;
        float f2 = (i2 & 256) != 0 ? 0.0f : f;
        f91 f91Var2 = (i2 & 1024) != 0 ? null : f91Var;
        if (f91Var2 == null) {
            ak0Var.W(1528143336);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91Var2 = (f91) objL;
        } else {
            ak0Var.W(-227800369);
        }
        ak0Var.p(false);
        f91 f91Var3 = f91Var2;
        a90 a90Var = a;
        float f3 = ((w60) ak0Var.j(a90Var)).e + 0.0f;
        sv.b(new vq1[]{yw.a.a(new dr(jB)), a90Var.a(new w60(f3))}, vs0.C(1508735219, new qa2(u71Var, u32Var, j, f3, ojVar, z, f91Var3, z2, ti0Var, f2, gtVar), ak0Var), ak0Var, 56);
    }

    public static final void c(ti0 ti0Var, u71 u71Var, boolean z, u32 u32Var, long j, long j2, float f, float f2, f91 f91Var, gt gtVar, ak0 ak0Var, int i, int i2) {
        f91 f91Var2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        if (f91Var == null) {
            ak0Var.W(-1701037204);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            ak0Var.p(false);
            f91Var2 = (f91) objL;
        } else {
            ak0Var.W(2023337163);
            ak0Var.p(false);
            f91Var2 = f91Var;
        }
        a90 a90Var = a;
        float f4 = ((w60) ak0Var.j(a90Var)).e + f3;
        sv.b(new vq1[]{yw.a.a(new dr(j2)), a90Var.a(new w60(f4))}, vs0.C(849208527, new pa2(u71Var, u32Var, j, f4, null, f91Var2, z2, ti0Var, f2, gtVar), ak0Var), ak0Var, 56);
    }

    public static final u71 d(u71 u71Var, u32 u32Var, long j, oj ojVar, float f) {
        u32 u32Var2;
        u71 u71VarU;
        u71 njVar = r71.a;
        if (f > 0.0f) {
            u32Var2 = u32Var;
            u71VarU = nj2.u(njVar, 0.0f, 0.0f, 0.0f, f, u32Var2, 124895);
        } else {
            u32Var2 = u32Var;
            u71VarU = njVar;
        }
        u71 u71VarC = u71Var.c(u71VarU);
        if (ojVar != null) {
            njVar = new nj(ojVar.a, ojVar.b, u32Var2);
        }
        return nj2.k(p61.s(u71VarC.c(njVar), j, u32Var2), u32Var2);
    }

    public static final long e(long j, float f, ak0 ak0Var) {
        jr jrVar = (jr) ak0Var.j(lr.a);
        boolean zBooleanValue = ((Boolean) ak0Var.j(lr.b)).booleanValue();
        long j2 = jrVar.p;
        int i = dr.h;
        if (vk2.a(j, j2) && zBooleanValue) {
            return w60.b(f, 0.0f) ? j2 : ws0.p(dr.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, jrVar.t), j2);
        }
        return j;
    }
}
