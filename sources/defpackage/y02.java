package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y02 {
    public final String a;
    public final ij0 b;
    public final boolean c;

    public y02(String str, ij0 ij0Var) {
        this.a = str;
        this.b = ij0Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ y02(String str) {
        this(str, x02.g);
    }

    public y02(String str, int i) {
        this(str);
        this.c = true;
    }

    public y02(String str, boolean z, ij0 ij0Var) {
        this(str, ij0Var);
        this.c = z;
    }
}
