package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qb2 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public qb2(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb2)) {
            return false;
        }
        qb2 qb2Var = (qb2) obj;
        String str = qb2Var.a;
        if (this.b != qb2Var.b || !this.c.equals(qb2Var.c) || !ws0.j(this.d, qb2Var.d)) {
            return false;
        }
        String str2 = this.a;
        return o92.z(str2, "index_") ? o92.z(str, "index_") : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((o92.z(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        i92.r(vq.V(this.c, ",", null, null, null, 62));
        i92.r("},");
        ll2 ll2Var = ll2.a;
        sb.append(ll2Var);
        sb.append("\n            |   orders = {");
        i92.r(vq.V(this.d, ",", null, null, null, 62));
        i92.r(" }");
        sb.append(ll2Var);
        sb.append("\n            |}\n        ");
        return i92.r(i92.t(sb.toString()));
    }
}
