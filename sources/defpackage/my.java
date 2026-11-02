package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class my extends y71 {
    public final bi2 a;
    public final te2 b;
    public final f11 c;
    public final boolean d;
    public final boolean e;
    public final xf1 f;
    public final me2 g;
    public final oo0 h;
    public final xf0 i;

    public my(bi2 bi2Var, te2 te2Var, f11 f11Var, boolean z, boolean z2, xf1 xf1Var, me2 me2Var, oo0 oo0Var, xf0 xf0Var) {
        this.a = bi2Var;
        this.b = te2Var;
        this.c = f11Var;
        this.d = z;
        this.e = z2;
        this.f = xf1Var;
        this.g = me2Var;
        this.h = oo0Var;
        this.i = xf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof my) {
            my myVar = (my) obj;
            if (this.a.equals(myVar.a) && ws0.j(this.b, myVar.b) && this.c == myVar.c && this.d == myVar.d && this.e == myVar.e && this.f.equals(myVar.f) && this.g == myVar.g && ws0.j(this.h, myVar.h) && ws0.j(this.i, myVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.y71
    public final t71 f() {
        py pyVar = new py();
        pyVar.u = this.a;
        pyVar.v = this.b;
        pyVar.w = this.c;
        pyVar.x = this.d;
        pyVar.y = this.e;
        pyVar.z = this.f;
        me2 me2Var = this.g;
        pyVar.A = me2Var;
        pyVar.B = this.h;
        pyVar.C = this.i;
        me2Var.f = new ny(pyVar, 4);
        return pyVar;
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        py pyVar = (py) t71Var;
        boolean z = pyVar.y;
        int i = 0;
        boolean z2 = z && !pyVar.x;
        oo0 oo0Var = pyVar.B;
        me2 me2Var = pyVar.A;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = z4 && !z3;
        pyVar.u = this.a;
        te2 te2Var = this.b;
        pyVar.v = te2Var;
        pyVar.w = this.c;
        pyVar.x = z3;
        pyVar.y = z4;
        pyVar.z = this.f;
        me2 me2Var2 = this.g;
        pyVar.A = me2Var2;
        oo0 oo0Var2 = this.h;
        pyVar.B = oo0Var2;
        pyVar.C = this.i;
        if (z4 != z || z5 != z2 || !ws0.j(oo0Var2, oo0Var) || !of2.c(te2Var.b)) {
            n02.l(pyVar);
        }
        if (me2Var2 != me2Var) {
            me2Var2.f = new ny(pyVar, i);
        }
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + k3.f(k3.f(k3.f((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=" + this.d + ", enabled=" + this.e + ", isPassword=false, offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
