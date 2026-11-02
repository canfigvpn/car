package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 {
    public final /* synthetic */ int a;
    public final rn0 b;
    public final rn0 c;
    public final rn0 d;
    public final rn0 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public cq0(cq0[] cq0VarArr) {
        int i = 0;
        this.a = 0;
        this.f = cq0VarArr;
        int length = cq0VarArr.length;
        rn0[] rn0VarArr = new rn0[length];
        for (int i2 = 0; i2 < length; i2++) {
            rn0VarArr[i2] = ((cq0[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new rn0(1, new cn2(rn0VarArr, i));
        int length2 = ((cq0[]) this.f).length;
        rn0[] rn0VarArr2 = new rn0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            rn0VarArr2[i4] = ((cq0[]) this.f)[i4].d();
        }
        this.c = new rn0(0, new qn0(rn0VarArr2, i));
        int length3 = ((cq0[]) this.f).length;
        rn0[] rn0VarArr3 = new rn0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            rn0VarArr3[i5] = ((cq0[]) this.f)[i5].c();
        }
        this.d = new rn0(1, new cn2(rn0VarArr3, i3));
        int length4 = ((cq0[]) this.f).length;
        rn0[] rn0VarArr4 = new rn0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            rn0VarArr4[i6] = ((cq0[]) this.f)[i6].a();
        }
        this.e = new rn0(0, new qn0(rn0VarArr4, i3));
    }

    public final rn0 a() {
        int i = this.a;
        return this.e;
    }

    public final rn0 b() {
        int i = this.a;
        return this.b;
    }

    public final rn0 c() {
        int i = this.a;
        return this.d;
    }

    public final rn0 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i2 = 0;
                for (cq0 cq0Var : (cq0[]) obj) {
                    i2++;
                    if (i2 > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    n02.e(sb, cq0Var, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public cq0(String str) {
        this.a = 1;
        this.f = str;
        this.b = new rn0(1, null);
        this.c = new rn0(0, null);
        this.d = new rn0(1, null);
        this.e = new rn0(0, null);
    }
}
