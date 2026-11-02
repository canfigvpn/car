package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zb0 implements mv0 {
    public final Enum[] a;
    public final hb2 b;

    public zb0(String str, Enum[] enumArr) {
        this.a = enumArr;
        this.b = new hb2(new n1(15, this, str));
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        int iB = n20Var.B(c());
        Enum[] enumArr = this.a;
        if (iB >= 0 && iB < enumArr.length) {
            return enumArr[iB];
        }
        throw new a22(iB + " is not among valid " + c().b() + " enum values, values size is " + enumArr.length);
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return (s12) this.b.getValue();
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.a;
        int iG0 = ve.G0(enumArr, r5);
        if (iG0 != -1) {
            p61Var.D(c(), iG0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strB = c().b();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strB);
        sb.append(", must be one of ");
        sb.append(string);
        throw new a22(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + c().b() + '>';
    }
}
