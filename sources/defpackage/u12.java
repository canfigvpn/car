package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class u12 implements s12, ul {
    public final String a;
    public final y12 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final s12[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final s12[] k;
    public final hb2 l;

    public u12(String str, y12 y12Var, int i, List list, bq bqVar) {
        this.a = str;
        this.b = y12Var;
        this.c = i;
        this.d = bqVar.b;
        ArrayList arrayList = bqVar.c;
        HashSet hashSet = new HashSet(h61.e0(wq.G(arrayList, 12)));
        vq.f0(arrayList, hashSet);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = ws0.m(bqVar.e);
        this.h = (List[]) bqVar.f.toArray(new List[0]);
        this.i = vq.e0(bqVar.g);
        strArr.getClass();
        xo0 xo0Var = new xo0(0, new w8(3, strArr));
        ArrayList arrayList2 = new ArrayList(wq.G(xo0Var, 10));
        Iterator it = xo0Var.iterator();
        while (true) {
            v vVar = (v) it;
            if (!((Iterator) vVar.g).hasNext()) {
                this.j = h61.g0(arrayList2);
                this.k = ws0.m(list);
                this.l = new hb2(new r12(1, this));
                return;
            }
            wo0 wo0Var = (wo0) vVar.next();
            arrayList2.add(new qj1(wo0Var.b, Integer.valueOf(wo0Var.a)));
        }
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.s12
    public final String b() {
        return this.a;
    }

    @Override // defpackage.s12
    public final y12 c() {
        return this.b;
    }

    @Override // defpackage.s12
    public final int d() {
        return this.c;
    }

    @Override // defpackage.s12
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u12) {
            s12 s12Var = (s12) obj;
            if (this.a.equals(s12Var.b()) && Arrays.equals(this.k, ((u12) obj).k)) {
                int iD = s12Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        s12[] s12VarArr = this.g;
                        if (ws0.j(s12VarArr[i2].b(), s12Var.j(i2).b()) && ws0.j(s12VarArr[i2].c(), s12Var.j(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.s12
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ul
    public final Set g() {
        return this.e;
    }

    @Override // defpackage.s12
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.s12
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.s12
    public final List i(int i) {
        return this.h[i];
    }

    @Override // defpackage.s12
    public final s12 j(int i) {
        return this.g[i];
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        return this.i[i];
    }

    public final String toString() {
        return ux.N(this);
    }
}
