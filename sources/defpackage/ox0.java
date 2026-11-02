package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ox0 implements ju {
    public final ax0 e;
    public lv f;
    public da2 g;
    public int h;
    public int i;
    public final w91 j;
    public final w91 k;
    public final ix0 l;
    public final fx0 m;
    public final w91 n;
    public final ca2 o;
    public final w91 p;
    public final fa1 q;
    public int r;
    public int s;
    public final String t;

    public ox0(ax0 ax0Var, da2 da2Var) {
        this.e = ax0Var;
        this.g = da2Var;
        long[] jArr = jx1.a;
        this.j = new w91();
        this.k = new w91();
        this.l = new ix0(this);
        this.m = new fx0(this);
        this.n = new w91();
        this.o = new ca2();
        this.p = new w91();
        this.q = new fa1(new Object[16]);
        this.t = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(gx0 gx0Var) {
        x91 x91Var;
        nl1 nl1Var = gx0Var.f;
        if (nl1Var != null) {
            nl1Var.h.set(pl1.f);
            rs1 rs1Var = nl1Var.k;
            if (((x91) rs1Var.g).h()) {
                x91Var = (x91) rs1Var.g;
                x91 x91Var2 = kx1.a;
                rs1Var.g = new x91();
                ((fa1) rs1Var.c).g();
            } else {
                x91Var = null;
            }
            rs1Var.c();
            qv qvVar = nl1Var.a;
            qvVar.u = null;
            if (x91Var != null) {
                qvVar.y.i = x91Var;
                qvVar.A = 2;
            }
            gx0Var.f = null;
            qv qvVar2 = gx0Var.c;
            if (qvVar2 != null) {
                qvVar2.m();
            }
            gx0Var.c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // defpackage.ju
    public final void a() {
        qv qvVar;
        ax0 ax0Var = this.e;
        ax0Var.t = true;
        w91 w91Var = this.j;
        Object[] objArr = w91Var.c;
        long[] jArr = w91Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (qvVar = ((gx0) objArr[(i << 3) + i3]).c) != null) {
                            qvVar.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        ax0Var.P();
        ax0Var.t = false;
        w91Var.a();
        this.k.a();
        this.s = 0;
        this.r = 0;
        this.n.a();
        h();
    }

    @Override // defpackage.ju
    public final void b() {
        i(true);
    }

    public final void c(gx0 gx0Var, boolean z) {
        nl1 nl1Var = gx0Var.f;
        if (nl1Var != null) {
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            try {
                ax0 ax0Var = this.e;
                ax0Var.t = true;
                if (z) {
                    while (!nl1Var.c()) {
                        try {
                            nl1Var.e(new qj(16));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                nl1Var.a();
                gx0Var.f = null;
                ax0Var.t = false;
                c12.s(o62VarJ, o62VarP, ej0VarE);
            } catch (Throwable th2) {
                c12.s(o62VarJ, o62VarP, ej0VarE);
                throw th2;
            }
        }
    }

    public final y92 e(Object obj) {
        return !this.e.H() ? new lx0() : new mx0(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.r = 0;
        List listO = this.e.o();
        n91 n91Var = (n91) listO;
        int i2 = (((fa1) n91Var.f).g - this.s) - 1;
        if (i <= i2) {
            this.o.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object objG = this.j.g((ax0) n91Var.get(i3));
                    objG.getClass();
                    ((q91) this.o.f).a(((gx0) objG).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.g.e(this.o);
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            z = false;
            while (i2 >= i) {
                try {
                    ax0 ax0Var = (ax0) ((n91) listO).get(i2);
                    Object objG2 = this.j.g(ax0Var);
                    objG2.getClass();
                    gx0 gx0Var = (gx0) objG2;
                    Object obj = gx0Var.a;
                    if (((q91) this.o.f).c(obj)) {
                        this.r++;
                        if (((Boolean) gx0Var.g.getValue()).booleanValue()) {
                            ex0 ex0Var = ax0Var.J;
                            v61 v61Var = ex0Var.p;
                            yw0 yw0Var = yw0.g;
                            v61Var.p = yw0Var;
                            d51 d51Var = ex0Var.q;
                            if (d51Var != null) {
                                d51Var.n = yw0Var;
                            }
                            l(gx0Var, false);
                            if (gx0Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        ax0 ax0Var2 = this.e;
                        ax0Var2.t = true;
                        this.j.k(ax0Var);
                        qv qvVar = gx0Var.c;
                        if (qvVar != null) {
                            qvVar.m();
                        }
                        this.e.Q(i2, 1);
                        ax0Var2.t = false;
                    }
                    this.k.k(obj);
                    i2--;
                } catch (Throwable th) {
                    c12.s(o62VarJ, o62VarP, ej0VarE);
                    throw th;
                }
            }
            c12.s(o62VarJ, o62VarP, ej0VarE);
        } else {
            z = false;
        }
        if (z) {
            synchronized (x62.c) {
                x91 x91Var = x62.j.h;
                if (x91Var != null && x91Var.h()) {
                    z2 = true;
                }
            }
            if (z2) {
                x62.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        ax0 ax0Var = (ax0) this.n.k(obj);
        ax0 ax0Var2 = this.e;
        if (ax0Var != null) {
            if (this.s <= 0) {
                vp0.b("No pre-composed items to dispose");
            }
            int i = ((fa1) ((n91) ax0Var2.o()).f).i(ax0Var);
            if (i < ((fa1) ((n91) ax0Var2.o()).f).g - this.s) {
                vp0.b("Item is not in pre-composed item range");
            }
            this.r++;
            this.s--;
            gx0 gx0Var = (gx0) this.j.g(ax0Var);
            if (gx0Var != null) {
                d(gx0Var);
            }
            int i2 = (((fa1) ((n91) ax0Var2.o()).f).g - this.s) - this.r;
            j(i, i2);
            f(i2);
        }
        if (this.q.h(obj)) {
            ax0.V(ax0Var2, true, 6);
        }
    }

    public final void h() {
        int i = ((fa1) ((n91) this.e.o()).f).g;
        w91 w91Var = this.j;
        if (w91Var.e != i) {
            vp0.a("Inconsistency between the count of nodes tracked by the state (" + w91Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.r) - this.s < 0) {
            StringBuilder sbM = k3.m(i, "Incorrect state. Total children ", ". Reusable children ");
            sbM.append(this.r);
            sbM.append(". Precomposed children ");
            sbM.append(this.s);
            vp0.a(sbM.toString());
        }
        w91 w91Var2 = this.n;
        if (w91Var2.e == this.s) {
            return;
        }
        vp0.a("Incorrect state. Precomposed children " + this.s + ". Map size " + w91Var2.e);
    }

    public final void i(boolean z) {
        this.s = 0;
        this.n.a();
        List listO = this.e.o();
        int i = ((fa1) ((n91) listO).f).g;
        if (this.r != i) {
            this.r = i;
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    ax0 ax0Var = (ax0) ((n91) listO).get(i2);
                    gx0 gx0Var = (gx0) this.j.g(ax0Var);
                    if (gx0Var != null && ((Boolean) gx0Var.g.getValue()).booleanValue()) {
                        ex0 ex0Var = ax0Var.J;
                        v61 v61Var = ex0Var.p;
                        yw0 yw0Var = yw0.g;
                        v61Var.p = yw0Var;
                        d51 d51Var = ex0Var.q;
                        if (d51Var != null) {
                            d51Var.n = yw0Var;
                        }
                        l(gx0Var, z);
                        gx0Var.a = ws0.N;
                    }
                } catch (Throwable th) {
                    c12.s(o62VarJ, o62VarP, ej0VarE);
                    throw th;
                }
            }
            c12.s(o62VarJ, o62VarP, ej0VarE);
            this.k.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        ax0 ax0Var = this.e;
        ax0Var.t = true;
        ax0Var.L(i, i2, 1);
        ax0Var.t = false;
    }

    public final void k(Object obj, ij0 ij0Var, boolean z) {
        ax0 ax0Var = this.e;
        if (ax0Var.H()) {
            h();
            if (this.k.c(obj)) {
                return;
            }
            this.p.k(obj);
            w91 w91Var = this.n;
            Object objG = w91Var.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((fa1) ((n91) ax0Var.o()).f).i(objG), ((fa1) ((n91) ax0Var.o()).f).g);
                    this.s++;
                } else {
                    int i = ((fa1) ((n91) ax0Var.o()).f).g;
                    ax0 ax0Var2 = new ax0(2);
                    ax0Var.t = true;
                    ax0Var.B(i, ax0Var2);
                    ax0Var.t = false;
                    this.s++;
                    objG = ax0Var2;
                }
                w91Var.m(obj, objG);
            }
            m((ax0) objG, obj, z, ij0Var);
        }
    }

    public final void l(gx0 gx0Var, boolean z) {
        qv qvVar;
        if (z || !gx0Var.h) {
            gx0Var.g = y12.s(Boolean.FALSE);
        } else {
            gx0Var.g.setValue(Boolean.FALSE);
        }
        if (gx0Var.f != null) {
            d(gx0Var);
            return;
        }
        if (z) {
            qv qvVar2 = gx0Var.c;
            if (qvVar2 != null) {
                qvVar2.l();
                return;
            }
            return;
        }
        fi1 fi1VarM8getOutOfFrameExecutor = ((e5) dx0.a(this.e)).m8getOutOfFrameExecutor();
        if (fi1VarM8getOutOfFrameExecutor == null) {
            if (gx0Var.h || (qvVar = gx0Var.c) == null) {
                return;
            }
            qvVar.l();
            return;
        }
        h8 h8Var = new h8(7, gx0Var);
        e5 e5Var = (e5) fi1VarM8getOutOfFrameExecutor;
        le leVar = e5Var.m;
        boolean zIsEmpty = leVar.isEmpty();
        leVar.addLast(h8Var);
        if (zIsEmpty) {
            Handler handler = e5Var.getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(e5Var.n);
            } else {
                qj.r("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(ax0 ax0Var, Object obj, boolean z, ij0 ij0Var) {
        boolean z2;
        qv qvVar;
        w91 w91Var = this.j;
        Object objG = w91Var.g(ax0Var);
        Object obj2 = objG;
        if (objG == null) {
            gt gtVar = au.a;
            gx0 gx0Var = new gx0();
            gx0Var.a = obj;
            gx0Var.b = gtVar;
            gx0Var.c = null;
            gx0Var.g = y12.s(Boolean.TRUE);
            w91Var.m(ax0Var, gx0Var);
            obj2 = gx0Var;
        }
        gx0 gx0Var2 = (gx0) obj2;
        int i = 1;
        boolean z3 = gx0Var2.b != ij0Var;
        if (gx0Var2.f != null) {
            if (z3) {
                d(gx0Var2);
            } else if (z) {
                return;
            } else {
                c(gx0Var2, true);
            }
        }
        qv qvVar2 = gx0Var2.c;
        if (qvVar2 != null) {
            synchronized (qvVar2.h) {
                z2 = qvVar2.r.e > 0;
            }
        } else {
            z2 = true;
        }
        if (z3 || z2 || gx0Var2.d) {
            gx0Var2.b = ij0Var;
            if (gx0Var2.f != null) {
                vp0.a("new subcompose call while paused composition is still active");
            }
            o62 o62VarJ = c12.j();
            ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
            o62 o62VarP = c12.p(o62VarJ);
            try {
                ax0 ax0Var2 = this.e;
                ax0Var2.t = true;
                qv qvVar3 = gx0Var2.c;
                lv lvVar = this.f;
                if (lvVar == null) {
                    vp0.c("parent composition reference not set");
                    throw new ps();
                }
                if (qvVar3 == null) {
                    if (z) {
                        ViewGroup.LayoutParams layoutParams = er2.a;
                        qvVar = new qv(lvVar, new gl2(ax0Var));
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = er2.a;
                        qvVar = new qv(lvVar, new gl2(ax0Var));
                    }
                    qvVar3 = qvVar;
                } else {
                    if (qvVar3.A == 3) {
                        if (z) {
                            ViewGroup.LayoutParams layoutParams3 = er2.a;
                            qvVar = new qv(lvVar, new gl2(ax0Var));
                        } else {
                            ViewGroup.LayoutParams layoutParams4 = er2.a;
                            qvVar = new qv(lvVar, new gl2(ax0Var));
                        }
                        qvVar3 = qvVar;
                    }
                }
                gx0Var2.c = qvVar3;
                ij0 gtVar2 = gx0Var2.b;
                if (((e5) dx0.a(this.e)).m8getOutOfFrameExecutor() != null) {
                    gx0Var2.h = false;
                } else {
                    gx0Var2.h = true;
                    gtVar2 = new gt(new z5(i, gx0Var2, gtVar2), true, 1524156494);
                }
                if (z) {
                    if (gx0Var2.e) {
                        qvVar3.i();
                        qvVar3.q();
                        gx0Var2.f = qvVar3.k(true, gtVar2);
                    } else {
                        gx0Var2.f = qvVar3.k(qvVar3.i(), gtVar2);
                    }
                } else if (gx0Var2.e) {
                    qvVar3.i();
                    qvVar3.q();
                    ak0 ak0Var = qvVar3.z;
                    ak0Var.z = 0;
                    ak0Var.y = true;
                    qvVar3.e.a(qvVar3, gtVar2);
                    ak0Var.s();
                } else {
                    qvVar3.A(gtVar2);
                }
                gx0Var2.e = false;
                ax0Var2.t = false;
                c12.s(o62VarJ, o62VarP, ej0VarE);
                gx0Var2.d = false;
            } catch (Throwable th) {
                c12.s(o62VarJ, o62VarP, ej0VarE);
                throw th;
            }
        }
    }

    public final ax0 n(Object obj) {
        w91 w91Var;
        int i;
        if (this.r == 0) {
            return null;
        }
        n91 n91Var = (n91) this.e.o();
        int i2 = ((fa1) n91Var.f).g - this.s;
        int i3 = i2 - this.r;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            w91Var = this.j;
            if (i5 < i3) {
                i = -1;
                break;
            }
            Object objG = w91Var.g((ax0) n91Var.get(i5));
            objG.getClass();
            if (ws0.j(((gx0) objG).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                Object objG2 = w91Var.g((ax0) n91Var.get(i4));
                objG2.getClass();
                gx0 gx0Var = (gx0) objG2;
                Object obj2 = gx0Var.a;
                if (obj2 == ws0.N || this.g.g(obj, obj2)) {
                    gx0Var.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.r--;
        ax0 ax0Var = (ax0) n91Var.get(i3);
        Object objG3 = w91Var.g(ax0Var);
        objG3.getClass();
        gx0 gx0Var2 = (gx0) objG3;
        gx0Var2.g = y12.s(Boolean.TRUE);
        gx0Var2.e = true;
        gx0Var2.d = true;
        return ax0Var;
    }
}
