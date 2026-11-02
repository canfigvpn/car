package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends u0 {
    public static x0 c;

    @Override // defpackage.u0
    public final int[] a(int i) {
        int length = c().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && c().charAt(i) == '\n' && (c().charAt(i) == '\n' || (i != 0 && c().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !j(i2)) {
            i2++;
        }
        return b(i, i2);
    }

    @Override // defpackage.u0
    public final int[] i(int i) {
        int length = c().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && c().charAt(i - 1) == '\n' && !j(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (c().charAt(i2) == '\n' || (i2 != 0 && c().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return b(i2, i);
    }

    public final boolean j(int i) {
        if (i <= 0 || c().charAt(i - 1) == '\n') {
            return false;
        }
        return i == c().length() || c().charAt(i) == '\n';
    }
}
