package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q00 {
    public static final kj1 a = p61.l(0.0f, 0.0f, 6.0f, 8.0f, 3);
    public static final float b = 8.0f;
    public static final float c = 12.0f;

    public static final void a(ti0 ti0Var, gt gtVar, u71 u71Var, ij0 ij0Var, u32 u32Var, l00 l00Var, i50 i50Var, gt gtVar2, ak0 ak0Var, int i) {
        ti0 ti0Var2;
        int i2;
        u71 u71Var2;
        u32 u32Var2;
        l00 l00Var2;
        i50 i50Var2;
        int i3;
        u71 u71Var3;
        u32 u32Var3;
        i50 i50Var3;
        l00 l00Var3;
        ak0Var.X(219718641);
        if ((i & 6) == 0) {
            ti0Var2 = ti0Var;
            i2 = (ak0Var.h(ti0Var2) ? 4 : 2) | i;
        } else {
            ti0Var2 = ti0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= ak0Var.h(ij0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        int i6 = 12582912 | i5;
        if ((100663296 & i) == 0) {
            i6 |= ak0Var.h(gtVar2) ? 67108864 : 33554432;
        }
        if (ak0Var.O(i6 & 1, (38347923 & i6) != 38347922)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                o00 o00Var = o00.a;
                u32 u32VarA = j42.a(nj2.B, ak0Var);
                o00 o00Var2 = o00.a;
                l00 l00VarC = o00.c(ak0Var);
                i3 = i6 & (-3727361);
                i50 i50Var4 = new i50(3);
                u71Var3 = r71.a;
                u32Var3 = u32VarA;
                i50Var3 = i50Var4;
                l00Var3 = l00VarC;
            } else {
                ak0Var.R();
                i3 = i6 & (-3727361);
                u71Var3 = u71Var;
                u32Var3 = u32Var;
                l00Var3 = l00Var;
                i50Var3 = i50Var;
            }
            ak0Var.q();
            int i7 = i3;
            r3.d(ti0Var2, f52.o(u71Var3), i50Var3, vs0.C(1108953335, new j10(u32Var3, l00Var3, gtVar2, ij0Var, gtVar), ak0Var), ak0Var, ((i7 >> 15) & 896) | (i7 & 14) | 3072);
            i50Var2 = i50Var3;
            u71Var2 = u71Var3;
            u32Var2 = u32Var3;
            l00Var2 = l00Var3;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            u32Var2 = u32Var;
            l00Var2 = l00Var;
            i50Var2 = i50Var;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new mc1(ti0Var, gtVar, u71Var2, ij0Var, u32Var2, l00Var2, i50Var2, gtVar2, i, 3);
        }
    }
}
