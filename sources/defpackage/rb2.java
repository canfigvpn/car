package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rb2 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public rb2(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb2)) {
            return false;
        }
        rb2 rb2Var = (rb2) obj;
        if (!this.a.equals(rb2Var.a) || !this.b.equals(rb2Var.b) || !this.c.equals(rb2Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = rb2Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(v12.i(vq.d0(this.b.values(), new dg0(10))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(v12.i(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(v12.i(set != null ? vq.d0(set, new dg0(11)) : cb0.e));
        sb.append("\n            |}\n        ");
        return i92.t(sb.toString());
    }
}
