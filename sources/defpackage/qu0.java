package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qu0 extends av0 {
    public final boolean e;
    public final String f;

    public qu0(String str, boolean z) {
        str.getClass();
        this.e = z;
        this.f = str.toString();
    }

    @Override // defpackage.av0
    public final String a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qu0.class != obj.getClass()) {
            return false;
        }
        qu0 qu0Var = (qu0) obj;
        return this.e == qu0Var.e && ws0.j(this.f, qu0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (Boolean.hashCode(this.e) * 31);
    }

    @Override // defpackage.av0
    public final String toString() {
        boolean z = this.e;
        String str = this.f;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        f92.a(sb, str);
        return sb.toString();
    }
}
