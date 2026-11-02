package defpackage;

import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class he1 {
    public final ax0 a;
    public final ge1 b;
    public final bq0 c;
    public me1 d;
    public final sb2 e;
    public t71 f;
    public fa1 g;
    public fa1 h;
    public final fa1 i;
    public fe1 j;

    public he1(ax0 ax0Var) {
        this.a = ax0Var;
        ge1 ge1Var = new ge1();
        ge1Var.h = -1;
        this.b = ge1Var;
        bq0 bq0Var = new bq0(ax0Var);
        this.c = bq0Var;
        this.d = bq0Var;
        sb2 sb2Var = bq0Var.V;
        this.e = sb2Var;
        this.f = sb2Var;
        this.i = new fa1(new u71[16]);
    }

    public static t71 a(s71 s71Var, t71 t71Var) {
        t71 t71VarF;
        if (s71Var instanceof y71) {
            t71VarF = ((y71) s71Var).f();
            t71VarF.g = ne1.f(t71VarF);
        } else {
            rh rhVar = new rh();
            rhVar.g = ne1.d(s71Var);
            rhVar.s = s71Var;
            new HashSet();
            t71VarF = rhVar;
        }
        if (t71VarF.r) {
            vp0.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        t71VarF.m = true;
        t71 t71Var2 = t71Var.j;
        if (t71Var2 != null) {
            t71Var2.i = t71VarF;
            t71VarF.j = t71Var2;
        }
        t71Var.j = t71VarF;
        t71VarF.i = t71Var;
        return t71VarF;
    }

    public static t71 b(t71 t71Var) {
        boolean z = t71Var.r;
        if (z) {
            l91 l91Var = ne1.a;
            if (!z) {
                vp0.b("autoInvalidateRemovedNode called on unattached node");
            }
            ne1.a(t71Var, -1, 2);
            t71Var.C0();
            t71Var.w0();
        }
        t71 t71Var2 = t71Var.j;
        t71 t71Var3 = t71Var.i;
        if (t71Var2 != null) {
            t71Var2.i = t71Var3;
            t71Var.j = null;
        }
        if (t71Var3 != null) {
            t71Var3.j = t71Var2;
            t71Var.i = null;
        }
        t71Var3.getClass();
        return t71Var3;
    }

    public static void h(s71 s71Var, s71 s71Var2, t71 t71Var) {
        if ((s71Var instanceof y71) && (s71Var2 instanceof y71)) {
            t71Var.getClass();
            ((y71) s71Var2).g(t71Var);
            if (t71Var.r) {
                ne1.c(t71Var);
                return;
            } else {
                t71Var.n = true;
                return;
            }
        }
        if (!(t71Var instanceof rh)) {
            vp0.b("Unknown Modifier.Node type");
            return;
        }
        rh rhVar = (rh) t71Var;
        boolean z = rhVar.r;
        if (z) {
            if (!z) {
                vp0.b("unInitializeModifier called on unattached node");
            }
            if ((rhVar.g & 8) != 0) {
                ((e5) qx.W(rhVar)).B();
            }
        }
        rhVar.s = s71Var2;
        rhVar.g = ne1.d(s71Var2);
        if (rhVar.r) {
            rhVar.F0(false);
        }
        if (t71Var.r) {
            ne1.c(t71Var);
        } else {
            t71Var.n = true;
        }
    }

    public final boolean c(int i) {
        return (this.f.h & i) != 0;
    }

    public final void d(t71 t71Var, me1 me1Var) {
        for (t71 t71Var2 = t71Var.i; t71Var2 != null; t71Var2 = t71Var2.i) {
            if (t71Var2 == this.b) {
                ax0 ax0VarU = this.a.u();
                me1Var.u = ax0VarU != null ? ax0VarU.I.c : null;
                this.d = me1Var;
                return;
            } else {
                if ((t71Var2.g & 2) != 0) {
                    return;
                }
                t71Var2.E0(me1Var);
            }
        }
    }

    public final void e() {
        for (t71 t71Var = this.f; t71Var != null; t71Var = t71Var.j) {
            t71Var.B0();
            if (t71Var.m) {
                l91 l91Var = ne1.a;
                if (!t71Var.r) {
                    vp0.b("autoInvalidateInsertedNode called on unattached node");
                }
                ne1.a(t71Var, -1, 1);
            }
            if (t71Var.n) {
                ne1.c(t71Var);
            }
            t71Var.m = false;
            t71Var.n = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x019e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, defpackage.fa1 r33, defpackage.fa1 r34, defpackage.t71 r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he1.f(int, fa1, fa1, t71, boolean):void");
    }

    public final void g() {
        ax0 ax0Var;
        uw0 uw0Var;
        zi1 zi1Var;
        t71 t71Var = this.e.i;
        me1 me1Var = this.c;
        while (true) {
            ax0Var = this.a;
            if (t71Var == null) {
                break;
            }
            sw0 sw0VarM = qx.m(t71Var);
            if (sw0VarM != null) {
                me1 me1Var2 = t71Var.l;
                if (me1Var2 != null) {
                    uw0Var = (uw0) me1Var2;
                    sw0 sw0Var = uw0Var.V;
                    uw0Var.u1(sw0VarM);
                    if (sw0Var != t71Var && (zi1Var = uw0Var.P) != null) {
                        ((dl0) zi1Var).c();
                    }
                } else {
                    uw0Var = new uw0(ax0Var, sw0VarM);
                    t71Var.E0(uw0Var);
                }
                me1Var.u = uw0Var;
                uw0Var.t = me1Var;
                me1Var = uw0Var;
            } else {
                t71Var.E0(me1Var);
            }
            t71Var = t71Var.i;
        }
        ax0 ax0VarU = ax0Var.u();
        me1Var.u = ax0VarU != null ? ax0VarU.I.c : null;
        this.d = me1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        t71 t71Var = this.f;
        sb2 sb2Var = this.e;
        if (t71Var == sb2Var) {
            sb.append("]");
        } else {
            while (t71Var != null && t71Var != sb2Var) {
                sb.append(String.valueOf(t71Var));
                if (t71Var.j == sb2Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                t71Var = t71Var.j;
            }
        }
        return sb.toString();
    }
}
