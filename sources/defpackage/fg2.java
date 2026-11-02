package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fg2 implements io2 {
    public final char e;

    public fg2(char c) {
        this.e = c;
    }

    @Override // defpackage.io2
    public final bi2 a(yb ybVar) {
        ybVar.getClass();
        String str = ybVar.f;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i2 + 1;
            sb.append(str.charAt(i));
            int i4 = (length - 1) - i2;
            if (i4 > 0 && i4 % 3 == 0) {
                sb.append(this.e);
            }
            i++;
            i2 = i3;
        }
        String string = sb.toString();
        return new bi2(new yb(string), new h7(length, string, this));
    }
}
