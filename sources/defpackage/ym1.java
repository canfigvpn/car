package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ym1 {
    public static final ym1 c = new ym1(0, false);
    public final boolean a;
    public final int b;

    public ym1() {
        this.a = false;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym1)) {
            return false;
        }
        ym1 ym1Var = (ym1) obj;
        return this.a == ym1Var.a && this.b == ym1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.a + ", emojiSupportMatch=" + ((Object) ra0.a(this.b)) + ')';
    }

    public ym1(int i, boolean z) {
        this.a = z;
        this.b = i;
    }
}
