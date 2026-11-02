package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bi1 extends ix {
    public int f;
    public int h;
    public int j;
    public zh1[] e = new zh1[16];
    public int[] g = new int[16];
    public Object[] i = new Object[16];

    public final void W() {
        this.f = 0;
        this.h = 0;
        Arrays.fill(this.i, 0, this.j, (Object) null);
        this.j = 0;
    }

    public final void X(ae aeVar, o52 o52Var, rs1 rs1Var, ai1 ai1Var) throws IllegalAccessException, InvocationTargetException {
        if (this.f != 0) {
            vp vpVar = new vp(this);
            bi1 bi1Var = (bi1) vpVar.e;
            while (true) {
                zh1 zh1Var = bi1Var.e[vpVar.b];
                vj0 vj0VarB = zh1Var.b(vpVar);
                ae aeVar2 = aeVar;
                o52 o52Var2 = o52Var;
                rs1 rs1Var2 = rs1Var;
                ai1 ai1Var2 = ai1Var;
                try {
                    zh1Var.a(vpVar, aeVar2, o52Var2, rs1Var2, ai1Var2);
                    int i = vpVar.b;
                    int i2 = bi1Var.f;
                    if (i < i2) {
                        zh1 zh1Var2 = bi1Var.e[i];
                        vpVar.c += zh1Var2.a;
                        vpVar.d += zh1Var2.b;
                        int i3 = i + 1;
                        vpVar.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        aeVar = aeVar2;
                        o52Var = o52Var2;
                        rs1Var = rs1Var2;
                        ai1Var = ai1Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (ai1Var2 == null) {
                        throw th;
                    }
                    p61.r0(th, new vf(vj0VarB, o52Var2, ai1Var2, 10));
                    throw th;
                }
            }
        }
        W();
    }

    public final boolean Y() {
        return this.f == 0;
    }

    public final void Z(zh1 zh1Var) {
        int i = this.f;
        zh1[] zh1VarArr = this.e;
        if (i == zh1VarArr.length) {
            zh1[] zh1VarArr2 = new zh1[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(zh1VarArr, 0, zh1VarArr2, 0, i);
            this.e = zh1VarArr2;
        }
        int i2 = this.h;
        int i3 = zh1Var.a;
        int i4 = zh1Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.g;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            ve.u0(0, 0, length, iArr, iArr2);
            this.g = iArr2;
        }
        int i7 = this.j + i4;
        Object[] objArr = this.i;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.i = objArr2;
        }
        zh1[] zh1VarArr3 = this.e;
        int i9 = this.f;
        this.f = i9 + 1;
        zh1VarArr3[i9] = zh1Var;
        this.h += zh1Var.a;
        this.j += i4;
    }
}
