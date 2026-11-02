package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rf2 extends y71 {
    public final String a;
    public final vf2 b;
    public final jg0 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public rf2(String str, vf2 vf2Var, jg0 jg0Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = vf2Var;
        this.c = jg0Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf2)) {
            return false;
        }
        rf2 rf2Var = (rf2) obj;
        return ws0.j(this.a, rf2Var.a) && ws0.j(this.b, rf2Var.b) && ws0.j(this.c, rf2Var.c) && this.d == rf2Var.d && this.e == rf2Var.e && this.f == rf2Var.f && this.g == rf2Var.g;
    }

    @Override // defpackage.y71
    public final t71 f() {
        uf2 uf2Var = new uf2();
        uf2Var.s = this.a;
        uf2Var.t = this.b;
        uf2Var.u = this.c;
        uf2Var.v = this.d;
        uf2Var.w = this.e;
        uf2Var.x = this.f;
        uf2Var.y = this.g;
        return uf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        jg0 jg0Var;
        jg0 jg0Var2;
        int i5;
        int i6;
        uf2 uf2Var = (uf2) t71Var;
        uf2Var.getClass();
        vf2 vf2Var = uf2Var.t;
        boolean z5 = false;
        boolean z6 = true;
        vf2 vf2Var2 = this.b;
        if (vf2Var2 != vf2Var) {
            if (!vf2Var2.a.b(vf2Var.a)) {
                z = true;
            }
            str = uf2Var.s;
            str2 = this.a;
            if (!ws0.j(str, str2)) {
                uf2Var.s = str2;
                uf2Var.C = null;
                z5 = true;
            }
            z2 = !uf2Var.t.c(vf2Var2);
            uf2Var.t = vf2Var2;
            i = uf2Var.y;
            i2 = this.g;
            if (i != i2) {
                uf2Var.y = i2;
                z2 = true;
            }
            i3 = uf2Var.x;
            i4 = this.f;
            if (i3 != i4) {
                uf2Var.x = i4;
                z2 = true;
            }
            z3 = uf2Var.w;
            z4 = this.e;
            if (z3 != z4) {
                uf2Var.w = z4;
                z2 = true;
            }
            jg0Var = uf2Var.u;
            jg0Var2 = this.c;
            if (!ws0.j(jg0Var, jg0Var2)) {
                uf2Var.u = jg0Var2;
                z2 = true;
            }
            i5 = uf2Var.v;
            i6 = this.d;
            if (i5 == i6) {
                z6 = z2;
            } else {
                uf2Var.v = i6;
            }
            if (z5 || z6) {
                vj1 vj1VarF0 = uf2Var.F0();
                String str3 = uf2Var.s;
                vf2 vf2Var3 = uf2Var.t;
                jg0 jg0Var3 = uf2Var.u;
                int i7 = uf2Var.v;
                boolean z7 = uf2Var.w;
                int i8 = uf2Var.x;
                int i9 = uf2Var.y;
                vj1VarF0.a = str3;
                vj1VarF0.b = vf2Var3;
                vj1VarF0.c = jg0Var3;
                vj1VarF0.d = i7;
                vj1VarF0.e = z7;
                vj1VarF0.f = i8;
                vj1VarF0.g = i9;
                vj1VarF0.s = (vj1VarF0.s << 2) | 2;
                vj1VarF0.c();
            }
            if (uf2Var.r) {
                if (z5 || (z && uf2Var.B != null)) {
                    n02.l(uf2Var);
                }
                if (z5 || z6) {
                    rw.z(uf2Var);
                    vv.B(uf2Var);
                }
                if (z) {
                    vv.B(uf2Var);
                }
            }
            return;
        }
        vf2Var2.getClass();
        z = false;
        str = uf2Var.s;
        str2 = this.a;
        if (!ws0.j(str, str2)) {
            uf2Var.s = str2;
            uf2Var.C = null;
            z5 = true;
        }
        z2 = !uf2Var.t.c(vf2Var2);
        uf2Var.t = vf2Var2;
        i = uf2Var.y;
        i2 = this.g;
        if (i != i2) {
            uf2Var.y = i2;
            z2 = true;
        }
        i3 = uf2Var.x;
        i4 = this.f;
        if (i3 != i4) {
            uf2Var.x = i4;
            z2 = true;
        }
        z3 = uf2Var.w;
        z4 = this.e;
        if (z3 != z4) {
            uf2Var.w = z4;
            z2 = true;
        }
        jg0Var = uf2Var.u;
        jg0Var2 = this.c;
        if (!ws0.j(jg0Var, jg0Var2)) {
            uf2Var.u = jg0Var2;
            z2 = true;
        }
        i5 = uf2Var.v;
        i6 = this.d;
        if (i5 == i6) {
            z6 = z2;
        } else {
            uf2Var.v = i6;
        }
        if (z5) {
            vj1 vj1VarF1 = uf2Var.F0();
            String str4 = uf2Var.s;
            vf2 vf2Var4 = uf2Var.t;
            jg0 jg0Var4 = uf2Var.u;
            int i10 = uf2Var.v;
            boolean z8 = uf2Var.w;
            int i11 = uf2Var.x;
            int i12 = uf2Var.y;
            vj1VarF1.a = str4;
            vj1VarF1.b = vf2Var4;
            vj1VarF1.c = jg0Var4;
            vj1VarF1.d = i10;
            vj1VarF1.e = z8;
            vj1VarF1.f = i11;
            vj1VarF1.g = i12;
            vj1VarF1.s = (vj1VarF1.s << 2) | 2;
            vj1VarF1.c();
        } else {
            vj1 vj1VarF2 = uf2Var.F0();
            String str5 = uf2Var.s;
            vf2 vf2Var5 = uf2Var.t;
            jg0 jg0Var5 = uf2Var.u;
            int i13 = uf2Var.v;
            boolean z9 = uf2Var.w;
            int i14 = uf2Var.x;
            int i15 = uf2Var.y;
            vj1VarF2.a = str5;
            vj1VarF2.b = vf2Var5;
            vj1VarF2.c = jg0Var5;
            vj1VarF2.d = i13;
            vj1VarF2.e = z9;
            vj1VarF2.f = i14;
            vj1VarF2.g = i15;
            vj1VarF2.s = (vj1VarF2.s << 2) | 2;
            vj1VarF2.c();
        }
        if (uf2Var.r) {
            return;
        }
        if (z5) {
            n02.l(uf2Var);
        } else {
            n02.l(uf2Var);
        }
        if (z5) {
            rw.z(uf2Var);
            vv.B(uf2Var);
        } else {
            rw.z(uf2Var);
            vv.B(uf2Var);
        }
        if (z) {
            vv.B(uf2Var);
        }
    }

    public final int hashCode() {
        return (((k3.f(k3.b(this.d, (this.c.hashCode() + k3.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
