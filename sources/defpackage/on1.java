package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class on1 implements s12, ul {
    public final String a;
    public final mk0 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final rx0 i;
    public final rx0 j;
    public final rx0 k;

    public on1(String str, mk0 mk0Var, int i) {
        this.a = str;
        this.b = mk0Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = db0.e;
        ti0 ti0Var = new ti0(this) { // from class: nn1
            public final /* synthetic */ on1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i5 = i2;
                on1 on1Var = this.f;
                switch (i5) {
                    case 0:
                        mk0 mk0Var2 = on1Var.b;
                        return mk0Var2 != null ? mk0Var2.b() : sv0.d0;
                    case 1:
                        return ws0.m(on1Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(ux.w(on1Var, (s12[]) on1Var.j.getValue()));
                }
            }
        };
        v01 v01Var = v01.e;
        this.i = vv.F(v01Var, ti0Var);
        final int i5 = 1;
        this.j = vv.F(v01Var, new ti0(this) { // from class: nn1
            public final /* synthetic */ on1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i6 = i5;
                on1 on1Var = this.f;
                switch (i6) {
                    case 0:
                        mk0 mk0Var2 = on1Var.b;
                        return mk0Var2 != null ? mk0Var2.b() : sv0.d0;
                    case 1:
                        return ws0.m(on1Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(ux.w(on1Var, (s12[]) on1Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = vv.F(v01Var, new ti0(this) { // from class: nn1
            public final /* synthetic */ on1 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i7 = i6;
                on1 on1Var = this.f;
                switch (i7) {
                    case 0:
                        mk0 mk0Var2 = on1Var.b;
                        return mk0Var2 != null ? mk0Var2.b() : sv0.d0;
                    case 1:
                        return ws0.m(on1Var.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(ux.w(on1Var, (s12[]) on1Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
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
    public y12 c() {
        return q92.b;
    }

    @Override // defpackage.s12
    public final int d() {
        return this.c;
    }

    @Override // defpackage.s12
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof on1) {
            s12 s12Var = (s12) obj;
            if (this.a.equals(s12Var.b()) && Arrays.equals((s12[]) this.j.getValue(), (s12[]) ((on1) obj).j.getValue())) {
                int iD = s12Var.d();
                int i = this.c;
                if (i == iD) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (ws0.j(j(i2).b(), s12Var.j(i2).b()) && ws0.j(j(i2).c(), s12Var.j(i2).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.s12
    public boolean f() {
        return false;
    }

    @Override // defpackage.ul
    public final Set g() {
        return this.h.keySet();
    }

    @Override // defpackage.s12
    public final List getAnnotations() {
        return cb0.e;
    }

    @Override // defpackage.s12
    public final boolean h() {
        return false;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.s12
    public final List i(int i) {
        List list = this.f[i];
        return list == null ? cb0.e : list;
    }

    @Override // defpackage.s12
    public s12 j(int i) {
        return ((mv0[]) this.i.getValue())[i].c();
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        return this.g[i];
    }

    public final void l(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return ux.N(this);
    }
}
