package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gv extends dv {
    public final boolean c;

    public gv(qs qsVar, boolean z) {
        super(qsVar);
        this.c = z;
    }

    @Override // defpackage.dv
    public final void e(byte b) {
        if (this.c) {
            j(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((qs) this.b).m(strValueOf);
    }

    @Override // defpackage.dv
    public final void g(int i) {
        if (this.c) {
            j(Long.toString(((long) i) & 4294967295L, 10));
            return;
        }
        String string = Long.toString(((long) i) & 4294967295L, 10);
        string.getClass();
        ((qs) this.b).m(string);
    }

    @Override // defpackage.dv
    public final void h(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            j(str);
            return;
        }
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((qs) this.b).m(str);
    }

    @Override // defpackage.dv
    public final void i(short s) {
        if (this.c) {
            j(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((qs) this.b).m(strValueOf);
    }
}
