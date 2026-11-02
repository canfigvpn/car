package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 extends lc2 {
    public final String b;
    public final int c;
    public final ej0 d;

    public uc2(Object obj, String str, int i, ej0 ej0Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = ej0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return k3.l(sb, this.c, ')');
    }
}
