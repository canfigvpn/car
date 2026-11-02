package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class dv {
    public boolean a;
    public Object b;

    public /* synthetic */ dv(Object obj) {
        this.b = obj;
        this.a = true;
    }

    public void a() {
        this.a = true;
    }

    public void b() {
        this.a = false;
    }

    public void c() {
        this.a = false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(long j, long j2, tx txVar) {
        iy1 iy1Var;
        long jD;
        if (txVar instanceof iy1) {
            iy1Var = (iy1) txVar;
            int i = iy1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iy1Var.k = i - Integer.MIN_VALUE;
            } else {
                iy1Var = new iy1(this, txVar);
            }
        } else {
            iy1Var = new iy1(this, txVar);
        }
        Object objA = iy1Var.i;
        int i2 = iy1Var.k;
        if (i2 == 0) {
            ix.Q(objA);
            jD = 0;
            if (this.a) {
                uy1 uy1Var = (uy1) this.b;
                if (!uy1Var.i) {
                    iy1Var.h = j2;
                    iy1Var.k = 1;
                    objA = uy1Var.a(j2, iy1Var);
                    fz fzVar = fz.e;
                    if (objA == fzVar) {
                        return fzVar;
                    }
                }
                jD = sm2.d(j2, jD);
            }
            return new sm2(jD);
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = iy1Var.h;
        ix.Q(objA);
        jD = ((sm2) objA).a;
        jD = sm2.d(j2, jD);
        return new sm2(jD);
    }

    public void e(byte b) {
        ((qs) this.b).m(String.valueOf(b));
    }

    public void f(char c) {
        qs qsVar = (qs) this.b;
        qsVar.e(qsVar.b, 1);
        char[] cArr = (char[]) qsVar.c;
        int i = qsVar.b;
        qsVar.b = i + 1;
        cArr[i] = c;
    }

    public void g(int i) {
        ((qs) this.b).m(String.valueOf(i));
    }

    public void h(long j) {
        ((qs) this.b).m(String.valueOf(j));
    }

    public void i(short s) {
        ((qs) this.b).m(String.valueOf(s));
    }

    public void j(String str) {
        byte b;
        str.getClass();
        qs qsVar = (qs) this.b;
        qsVar.e(qsVar.b, str.length() + 2);
        char[] cArr = (char[]) qsVar.c;
        int i = qsVar.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = f92.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    qsVar.e(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = f92.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) qsVar.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = f92.a[cCharAt];
                        str2.getClass();
                        qsVar.e(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) qsVar.c, i4);
                        int length3 = str2.length() + i4;
                        qsVar.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) qsVar.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        qsVar.b = i4;
                    }
                }
                qsVar.e(i4, 1);
                ((char[]) qsVar.c)[i4] = '\"';
                qsVar.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        qsVar.b = i3 + 1;
    }

    public dv(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public void k() {
    }

    public void l() {
    }
}
