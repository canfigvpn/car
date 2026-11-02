package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nt0 {
    public static final int[] d = {-61, 9, 38, 199, 426, 686, 756, 818, 1111, 1181, 1210, 1635, 2060, 2097, 2192, 2262, 2324, 2394, 2456, 3178};
    public static final String[] e = {"فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن", "اسفند"};
    public static final String[] f = {"ش", "ی", "د", "س", "چ", "پ", "ج"};
    public final int a;
    public final int b;
    public final int c;

    public nt0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        mt0 mt0VarI = ei1.i(this.a);
        int iW = ei1.w(mt0VarI.b, mt0VarI.c);
        int i = this.b;
        return (((((i - 1) * 31) + iW) - ((i - 7) * (i / 7))) + this.c) - 2440589;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt0)) {
            return false;
        }
        nt0 nt0Var = (nt0) obj;
        return this.a == nt0Var.a && this.b == nt0Var.b && this.c == nt0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k3.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "JalaliDate(year=" + this.a + ", month=" + this.b + ", day=" + this.c + ")";
    }
}
