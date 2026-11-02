package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 {
    public final jw0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final p91 f = new p91();
    public final re1 g = new re1();
    public final h91 h = new h91(10);

    public sm0(jw0 jw0Var) {
        this.a = jw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public final void a(long j, List list, boolean z) {
        h91 h91Var;
        long[] jArr;
        ee1 ee1Var;
        Object objD;
        Object obj;
        int size = list.size();
        re1 re1Var = this.g;
        re1 re1Var2 = re1Var;
        boolean z2 = true;
        int i = 0;
        while (true) {
            h91Var = this.h;
            if (i >= size) {
                break;
            }
            t71 t71Var = (t71) list.get(i);
            if (t71Var.r) {
                t71Var.q = new v4(5, this, t71Var);
                if (z2) {
                    fa1 fa1Var = re1Var2.a;
                    Object[] objArr = fa1Var.e;
                    int i2 = fa1Var.g;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj = null;
                            break;
                        }
                        obj = objArr[i3];
                        if (((ee1) obj).c.equals(t71Var)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    ee1Var = (ee1) obj;
                    if (ee1Var != null) {
                        ee1Var.i = true;
                        ee1Var.d.a(j);
                        if (z) {
                            Object objD2 = h91Var.d(j);
                            if (objD2 == null) {
                                objD2 = new p91();
                                h91Var.f(j, objD2);
                            }
                            ((p91) objD2).a(ee1Var);
                        }
                    } else {
                        z2 = false;
                        ee1Var = new ee1(t71Var);
                        ee1Var.d.a(j);
                        if (z) {
                            objD = h91Var.d(j);
                            if (objD == null) {
                                objD = new p91();
                                h91Var.f(j, objD);
                            }
                            ((p91) objD).a(ee1Var);
                        }
                        re1Var2.a.b(ee1Var);
                    }
                } else {
                    ee1Var = new ee1(t71Var);
                    ee1Var.d.a(j);
                    if (z) {
                        objD = h91Var.d(j);
                        if (objD == null) {
                            objD = new p91();
                            h91Var.f(j, objD);
                        }
                        ((p91) objD).a(ee1Var);
                    }
                    re1Var2.a.b(ee1Var);
                }
                re1Var2 = ee1Var;
            }
            i++;
        }
        if (z) {
            long[] jArr2 = h91Var.b;
            Object[] objArr2 = h91Var.c;
            long[] jArr3 = h91Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j2 = jArr3[i4];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((255 & j2) < 128) {
                                int i8 = (i4 << 3) + i7;
                                long j3 = jArr2[i8];
                                p91 p91Var = (p91) objArr2[i8];
                                fa1 fa1Var2 = re1Var.a;
                                Object[] objArr3 = fa1Var2.e;
                                int i9 = fa1Var2.g;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    ((ee1) objArr3[i10]).f(j3, p91Var);
                                }
                            }
                            j2 >>= i5;
                            i7++;
                            i5 = i5;
                            jArr2 = jArr2;
                        }
                        jArr = jArr2;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr2;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr2 = jArr;
                }
            }
        }
        h91Var.a();
    }

    public final boolean b(dq0 dq0Var, boolean z) {
        re1 re1Var = this.g;
        fa1 fa1Var = re1Var.a;
        if (!re1Var.a((t41) dq0Var.f, this.a, dq0Var, z)) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = ((ee1) objArr[i2]).e(dq0Var, z) || z3;
        }
        Object[] objArr2 = fa1Var.e;
        int i3 = fa1Var.g;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = ((ee1) objArr2[i4]).d(dq0Var) || z4;
        }
        re1Var.b(dq0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            p91 p91Var = this.f;
            int i5 = p91Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((t71) p91Var.f(i6));
            }
            p91Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            re1Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        re1 re1Var = this.g;
        fa1 fa1Var = re1Var.a;
        Object[] objArr = fa1Var.e;
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((ee1) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            re1Var.a.g();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(t71 t71Var) {
        if (this.b) {
            this.e = true;
            this.f.a(t71Var);
            return;
        }
        re1 re1Var = this.g;
        p91 p91Var = re1Var.b;
        p91Var.d();
        p91Var.a(re1Var);
        while (p91Var.i()) {
            re1 re1Var2 = (re1) p91Var.k(p91Var.b - 1);
            int i = 0;
            while (true) {
                fa1 fa1Var = re1Var2.a;
                if (i < fa1Var.g) {
                    ee1 ee1Var = (ee1) fa1Var.e[i];
                    if (ee1Var.c.equals(t71Var)) {
                        re1Var2.a.j(ee1Var);
                        ee1Var.c();
                    } else {
                        p91Var.a(ee1Var);
                        i++;
                    }
                }
            }
        }
    }
}
