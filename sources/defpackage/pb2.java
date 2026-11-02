package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pb2 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public pb2(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb2)) {
            return false;
        }
        pb2 pb2Var = (pb2) obj;
        if (ws0.j(this.a, pb2Var.a) && ws0.j(this.b, pb2Var.b) && ws0.j(this.c, pb2Var.c) && this.d.equals(pb2Var.d)) {
            return this.e.equals(pb2Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k3.e(k3.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        i92.r(vq.V(vq.c0(this.d), ",", null, null, null, 62));
        i92.r("},");
        ll2 ll2Var = ll2.a;
        sb.append(ll2Var);
        sb.append("\n            |   referenceColumnNames = {");
        i92.r(vq.V(vq.c0(this.e), ",", null, null, null, 62));
        i92.r(" }");
        sb.append(ll2Var);
        sb.append("\n            |}\n        ");
        return i92.r(i92.t(sb.toString()));
    }
}
