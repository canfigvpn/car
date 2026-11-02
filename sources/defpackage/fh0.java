package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fh0 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile v72 b = new v72();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.c(115, new gh0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.c(130, new gh0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.c(150, new gh0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.c(180, new gh0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.c(200, new gh0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.b(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        xp0.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static eh0 a(float f) {
        float fB;
        eh0 gh0Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        v72 v72Var = b;
        int i = (int) (f * 100.0f);
        v72Var.getClass();
        eh0 eh0Var = (eh0) s5.B(v72Var, i);
        if (eh0Var != null) {
            return eh0Var;
        }
        v72 v72Var2 = b;
        if (v72Var2.e) {
            s5.G(v72Var2);
        }
        int iM = sv0.M(v72Var2.h, i, v72Var2.f);
        if (iM >= 0) {
            return (eh0) b.e(iM);
        }
        int i2 = -(iM + 1);
        int i3 = i2 - 1;
        if (i2 >= b.d()) {
            gh0 gh0Var2 = new gh0(new float[]{1.0f}, new float[]{f});
            b(f, gh0Var2);
            return gh0Var2;
        }
        if (i3 < 0) {
            gh0Var = new gh0(fArr, fArr);
            fB = 1.0f;
        } else {
            fB = b.b(i3) / 100.0f;
            gh0Var = (eh0) b.e(i3);
        }
        float fB2 = b.b(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fB == fB2 ? 0.0f : (f - fB) / (fB2 - fB))) * 1.0f) + 0.0f;
        eh0 eh0Var2 = (eh0) b.e(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB3 = gh0Var.b(f2);
            fArr2[i4] = ((eh0Var2.b(f2) - fB3) * fMax) + fB3;
        }
        gh0 gh0Var3 = new gh0(fArr, fArr2);
        b(f, gh0Var3);
        return gh0Var3;
    }

    public static void b(float f, gh0 gh0Var) {
        synchronized (c) {
            v72 v72VarClone = b.clone();
            v72VarClone.c((int) (f * 100.0f), gh0Var);
            b = v72VarClone;
        }
    }
}
