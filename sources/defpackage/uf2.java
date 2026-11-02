package defpackage;

import android.os.Trace;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uf2 extends t71 implements sw0, k80, m02 {
    public vj1 A;
    public sf2 B;
    public tf2 C;
    public String s;
    public vf2 t;
    public jg0 u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public HashMap z;

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.sw0
    public final int A(x41 x41Var, r61 r61Var, int i) {
        vj1 vj1VarF0;
        tf2 tf2Var = this.C;
        if (tf2Var == null) {
            vj1VarF0 = F0();
        } else {
            if (!tf2Var.c) {
                tf2Var = null;
            }
            if (tf2Var == null || (vj1VarF0 = tf2Var.d) == null) {
                vj1VarF0 = F0();
            }
        }
        vj1VarF0.d(x41Var);
        return vj1VarF0.a(i, x41Var.getLayoutDirection());
    }

    public final vj1 F0() {
        vj1 vj1Var = this.A;
        if (vj1Var != null) {
            return vj1Var;
        }
        vj1 vj1Var2 = new vj1(this.s, this.t, this.u, this.v, this.w, this.x, this.y);
        this.A = vj1Var2;
        return vj1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        vj1 vj1VarF0;
        if (this.r) {
            tf2 tf2Var = this.C;
            if (tf2Var == null) {
                vj1VarF0 = F0();
            } else {
                if (!tf2Var.c) {
                    tf2Var = null;
                }
                if (tf2Var == null || (vj1VarF0 = tf2Var.d) == null) {
                    vj1VarF0 = F0();
                }
            }
            y7 y7Var = vj1VarF0.j;
            if (y7Var == null) {
                yp0.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.A + ", textSubstitution=" + this.C + ')');
                qj.e();
                return;
            }
            sm smVarG = cx0Var.e.f.g();
            boolean z = vj1VarF0.k;
            if (z) {
                long j = vj1VarF0.l;
                smVarG.l();
                smVarG.e(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                r72 r72Var = this.t.a;
                ed2 ed2Var = r72Var.m;
                if (ed2Var == null) {
                    ed2Var = ed2.b;
                }
                ed2 ed2Var2 = ed2Var;
                q32 q32Var = r72Var.n;
                if (q32Var == null) {
                    q32Var = q32.d;
                }
                q32 q32Var2 = q32Var;
                m80 m80Var = r72Var.p;
                if (m80Var == null) {
                    m80Var = fd0.a;
                }
                m80 m80Var2 = m80Var;
                rk rkVarC = r72Var.a.c();
                if (rkVarC != null) {
                    y7Var.g(smVarG, rkVarC, this.t.a.a.a(), q32Var2, ed2Var2, m80Var2);
                } else {
                    long jB = dr.g;
                    if (jB == 16) {
                        jB = this.t.b() != 16 ? this.t.b() : dr.b;
                    }
                    y7Var.f(smVarG, jB, q32Var2, ed2Var2, m80Var2);
                }
            } finally {
                if (z) {
                    smVarG.i();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.sw0
    public final int P(x41 x41Var, r61 r61Var, int i) {
        vj1 vj1VarF0;
        tf2 tf2Var = this.C;
        if (tf2Var == null) {
            vj1VarF0 = F0();
        } else {
            if (!tf2Var.c) {
                tf2Var = null;
            }
            if (tf2Var == null || (vj1VarF0 = tf2Var.d) == null) {
                vj1VarF0 = F0();
            }
        }
        vj1VarF0.d(x41Var);
        return j02.e(vj1VarF0.e(x41Var.getLayoutDirection()).a());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x0070, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        vj1 vj1VarF0;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            tf2 tf2Var = this.C;
            if (tf2Var == null) {
                vj1VarF0 = F0();
            } else {
                if (!tf2Var.c) {
                    tf2Var = null;
                }
                if (tf2Var == null || (vj1VarF0 = tf2Var.d) == null) {
                    vj1VarF0 = F0();
                }
            }
            vj1VarF0.d(y61Var);
            boolean zB = vj1VarF0.b(j, y61Var.getLayoutDirection());
            uj1 uj1Var = vj1VarF0.n;
            if (uj1Var != null) {
                uj1Var.b();
            }
            y7 y7Var = vj1VarF0.j;
            y7Var.getClass();
            ff2 ff2Var = y7Var.d;
            long j2 = vj1VarF0.l;
            if (zB) {
                qx.T(this, 2).Z0();
                HashMap map = this.z;
                if (map == null) {
                    map = new HashMap(2);
                    this.z = map;
                }
                map.put(x3.a, Integer.valueOf(Math.round(ff2Var.d(0))));
                map.put(x3.b, Integer.valueOf(Math.round(ff2Var.d(ff2Var.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            jm1 jm1VarE = r61Var.e(rw.w(i, i, i2, i2));
            HashMap map2 = this.z;
            map2.getClass();
            return y61Var.d0(i, i2, map2, new ye(jm1VarE, 10));
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [ej0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [sf2] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        sf2 sf2Var = this.B;
        ?? r0 = sf2Var;
        if (sf2Var == null) {
            final int i = 0;
            ?? r1 = new ej0(this) { // from class: sf2
                public final /* synthetic */ uf2 f;

                {
                    this.f = this;
                }

                /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
                @Override // defpackage.ej0
                public final Object h(Object obj) {
                    m40 m40Var;
                    hf2 hf2Var;
                    int i2 = i;
                    boolean z = true;
                    uf2 uf2Var = this.f;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            vj1 vj1VarF0 = uf2Var.F0();
                            vf2 vf2VarE = vf2.e(uf2Var.t, dr.g, 0L, 0L, 0, 0L, 16777214);
                            kw0 kw0Var = vj1VarF0.o;
                            hf2 hf2Var2 = null;
                            if (kw0Var == null || (m40Var = vj1VarF0.i) == null) {
                                hf2Var = null;
                            } else {
                                yb ybVar = new yb(vj1VarF0.a);
                                if (vj1VarF0.j == null || vj1VarF0.n == null) {
                                    hf2Var = null;
                                } else {
                                    long j = vj1VarF0.p & (-8589934589L);
                                    int i3 = vj1VarF0.f;
                                    boolean z2 = vj1VarF0.e;
                                    int i4 = vj1VarF0.d;
                                    jg0 jg0Var = vj1VarF0.c;
                                    cb0 cb0Var = cb0.e;
                                    hf2Var = new hf2(new gf2(ybVar, vf2VarE, cb0Var, i3, z2, i4, m40Var, kw0Var, jg0Var, j), new t81(new xf(ybVar, vf2VarE, cb0Var, m40Var, jg0Var), j, vj1VarF0.f, vj1VarF0.d), vj1VarF0.l);
                                }
                            }
                            if (hf2Var != null) {
                                list.add(hf2Var);
                                hf2Var2 = hf2Var;
                            }
                            return Boolean.valueOf(hf2Var2 != null);
                        case 1:
                            String str = ((yb) obj).f;
                            tf2 tf2Var = uf2Var.C;
                            if (tf2Var == null) {
                                tf2 tf2Var2 = new tf2(uf2Var.s, str);
                                vj1 vj1Var = new vj1(str, uf2Var.t, uf2Var.u, uf2Var.v, uf2Var.w, uf2Var.x, uf2Var.y);
                                vj1Var.d(uf2Var.F0().i);
                                tf2Var2.d = vj1Var;
                                uf2Var.C = tf2Var2;
                            } else if (!ws0.j(str, tf2Var.b)) {
                                tf2Var.b = str;
                                vj1 vj1Var2 = tf2Var.d;
                                if (vj1Var2 != null) {
                                    vf2 vf2Var = uf2Var.t;
                                    jg0 jg0Var2 = uf2Var.u;
                                    int i5 = uf2Var.v;
                                    boolean z3 = uf2Var.w;
                                    int i6 = uf2Var.x;
                                    int i7 = uf2Var.y;
                                    vj1Var2.a = str;
                                    vj1Var2.b = vf2Var;
                                    vj1Var2.c = jg0Var2;
                                    vj1Var2.d = i5;
                                    vj1Var2.e = z3;
                                    vj1Var2.f = i6;
                                    vj1Var2.g = i7;
                                    vj1Var2.s = (vj1Var2.s << 2) | 2;
                                    vj1Var2.c();
                                }
                            }
                            n02.l(uf2Var);
                            rw.z(uf2Var);
                            vv.B(uf2Var);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            tf2 tf2Var3 = uf2Var.C;
                            if (tf2Var3 == null) {
                                z = false;
                            } else {
                                tf2Var3.c = zBooleanValue;
                                n02.l(uf2Var);
                                rw.z(uf2Var);
                                vv.B(uf2Var);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.B = r1;
            r0 = r1;
        }
        yb ybVar = new yb(this.s);
        lv0[] lv0VarArr = w02.a;
        z02Var.a(u02.C, vs0.u(ybVar));
        tf2 tf2Var = this.C;
        if (tf2Var != null) {
            boolean z = tf2Var.c;
            y02 y02Var = u02.E;
            lv0[] lv0VarArr2 = w02.a;
            lv0 lv0Var = lv0VarArr2[17];
            z02Var.a(y02Var, Boolean.valueOf(z));
            yb ybVar2 = new yb(tf2Var.b);
            y02 y02Var2 = u02.D;
            lv0 lv0Var2 = lv0VarArr2[16];
            z02Var.a(y02Var2, ybVar2);
        }
        final int i2 = 1;
        z02Var.a(h02.l, new p0(null, new ej0(this) { // from class: sf2
            public final /* synthetic */ uf2 f;

            {
                this.f = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
            @Override // defpackage.ej0
            public final Object h(Object obj) {
                m40 m40Var;
                hf2 hf2Var;
                int i3 = i2;
                boolean z2 = true;
                uf2 uf2Var = this.f;
                switch (i3) {
                    case 0:
                        List list = (List) obj;
                        vj1 vj1VarF0 = uf2Var.F0();
                        vf2 vf2VarE = vf2.e(uf2Var.t, dr.g, 0L, 0L, 0, 0L, 16777214);
                        kw0 kw0Var = vj1VarF0.o;
                        hf2 hf2Var2 = null;
                        if (kw0Var == null || (m40Var = vj1VarF0.i) == null) {
                            hf2Var = null;
                        } else {
                            yb ybVar3 = new yb(vj1VarF0.a);
                            if (vj1VarF0.j == null || vj1VarF0.n == null) {
                                hf2Var = null;
                            } else {
                                long j = vj1VarF0.p & (-8589934589L);
                                int i4 = vj1VarF0.f;
                                boolean z3 = vj1VarF0.e;
                                int i5 = vj1VarF0.d;
                                jg0 jg0Var = vj1VarF0.c;
                                cb0 cb0Var = cb0.e;
                                hf2Var = new hf2(new gf2(ybVar3, vf2VarE, cb0Var, i4, z3, i5, m40Var, kw0Var, jg0Var, j), new t81(new xf(ybVar3, vf2VarE, cb0Var, m40Var, jg0Var), j, vj1VarF0.f, vj1VarF0.d), vj1VarF0.l);
                            }
                        }
                        if (hf2Var != null) {
                            list.add(hf2Var);
                            hf2Var2 = hf2Var;
                        }
                        return Boolean.valueOf(hf2Var2 != null);
                    case 1:
                        String str = ((yb) obj).f;
                        tf2 tf2Var2 = uf2Var.C;
                        if (tf2Var2 == null) {
                            tf2 tf2Var3 = new tf2(uf2Var.s, str);
                            vj1 vj1Var = new vj1(str, uf2Var.t, uf2Var.u, uf2Var.v, uf2Var.w, uf2Var.x, uf2Var.y);
                            vj1Var.d(uf2Var.F0().i);
                            tf2Var3.d = vj1Var;
                            uf2Var.C = tf2Var3;
                        } else if (!ws0.j(str, tf2Var2.b)) {
                            tf2Var2.b = str;
                            vj1 vj1Var2 = tf2Var2.d;
                            if (vj1Var2 != null) {
                                vf2 vf2Var = uf2Var.t;
                                jg0 jg0Var2 = uf2Var.u;
                                int i6 = uf2Var.v;
                                boolean z4 = uf2Var.w;
                                int i7 = uf2Var.x;
                                int i8 = uf2Var.y;
                                vj1Var2.a = str;
                                vj1Var2.b = vf2Var;
                                vj1Var2.c = jg0Var2;
                                vj1Var2.d = i6;
                                vj1Var2.e = z4;
                                vj1Var2.f = i7;
                                vj1Var2.g = i8;
                                vj1Var2.s = (vj1Var2.s << 2) | 2;
                                vj1Var2.c();
                            }
                        }
                        n02.l(uf2Var);
                        rw.z(uf2Var);
                        vv.B(uf2Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        tf2 tf2Var4 = uf2Var.C;
                        if (tf2Var4 == null) {
                            z2 = false;
                        } else {
                            tf2Var4.c = zBooleanValue;
                            n02.l(uf2Var);
                            rw.z(uf2Var);
                            vv.B(uf2Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final int i3 = 2;
        z02Var.a(h02.m, new p0(null, new ej0(this) { // from class: sf2
            public final /* synthetic */ uf2 f;

            {
                this.f = this;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
            @Override // defpackage.ej0
            public final Object h(Object obj) {
                m40 m40Var;
                hf2 hf2Var;
                int i4 = i3;
                boolean z2 = true;
                uf2 uf2Var = this.f;
                switch (i4) {
                    case 0:
                        List list = (List) obj;
                        vj1 vj1VarF0 = uf2Var.F0();
                        vf2 vf2VarE = vf2.e(uf2Var.t, dr.g, 0L, 0L, 0, 0L, 16777214);
                        kw0 kw0Var = vj1VarF0.o;
                        hf2 hf2Var2 = null;
                        if (kw0Var == null || (m40Var = vj1VarF0.i) == null) {
                            hf2Var = null;
                        } else {
                            yb ybVar3 = new yb(vj1VarF0.a);
                            if (vj1VarF0.j == null || vj1VarF0.n == null) {
                                hf2Var = null;
                            } else {
                                long j = vj1VarF0.p & (-8589934589L);
                                int i5 = vj1VarF0.f;
                                boolean z3 = vj1VarF0.e;
                                int i6 = vj1VarF0.d;
                                jg0 jg0Var = vj1VarF0.c;
                                cb0 cb0Var = cb0.e;
                                hf2Var = new hf2(new gf2(ybVar3, vf2VarE, cb0Var, i5, z3, i6, m40Var, kw0Var, jg0Var, j), new t81(new xf(ybVar3, vf2VarE, cb0Var, m40Var, jg0Var), j, vj1VarF0.f, vj1VarF0.d), vj1VarF0.l);
                            }
                        }
                        if (hf2Var != null) {
                            list.add(hf2Var);
                            hf2Var2 = hf2Var;
                        }
                        return Boolean.valueOf(hf2Var2 != null);
                    case 1:
                        String str = ((yb) obj).f;
                        tf2 tf2Var2 = uf2Var.C;
                        if (tf2Var2 == null) {
                            tf2 tf2Var3 = new tf2(uf2Var.s, str);
                            vj1 vj1Var = new vj1(str, uf2Var.t, uf2Var.u, uf2Var.v, uf2Var.w, uf2Var.x, uf2Var.y);
                            vj1Var.d(uf2Var.F0().i);
                            tf2Var3.d = vj1Var;
                            uf2Var.C = tf2Var3;
                        } else if (!ws0.j(str, tf2Var2.b)) {
                            tf2Var2.b = str;
                            vj1 vj1Var2 = tf2Var2.d;
                            if (vj1Var2 != null) {
                                vf2 vf2Var = uf2Var.t;
                                jg0 jg0Var2 = uf2Var.u;
                                int i7 = uf2Var.v;
                                boolean z4 = uf2Var.w;
                                int i8 = uf2Var.x;
                                int i9 = uf2Var.y;
                                vj1Var2.a = str;
                                vj1Var2.b = vf2Var;
                                vj1Var2.c = jg0Var2;
                                vj1Var2.d = i7;
                                vj1Var2.e = z4;
                                vj1Var2.f = i8;
                                vj1Var2.g = i9;
                                vj1Var2.s = (vj1Var2.s << 2) | 2;
                                vj1Var2.c();
                            }
                        }
                        n02.l(uf2Var);
                        rw.z(uf2Var);
                        vv.B(uf2Var);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        tf2 tf2Var4 = uf2Var.C;
                        if (tf2Var4 == null) {
                            z2 = false;
                        } else {
                            tf2Var4.c = zBooleanValue;
                            n02.l(uf2Var);
                            rw.z(uf2Var);
                            vv.B(uf2Var);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        z02Var.a(h02.n, new p0(null, new r12(9, this)));
        w02.a(z02Var, r0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.sw0
    public final int f(x41 x41Var, r61 r61Var, int i) {
        vj1 vj1VarF0;
        tf2 tf2Var = this.C;
        if (tf2Var == null) {
            vj1VarF0 = F0();
        } else {
            if (!tf2Var.c) {
                tf2Var = null;
            }
            if (tf2Var == null || (vj1VarF0 = tf2Var.d) == null) {
                vj1VarF0 = F0();
            }
        }
        vj1VarF0.d(x41Var);
        return j02.e(vj1VarF0.e(x41Var.getLayoutDirection()).c());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.sw0
    public final int n(x41 x41Var, r61 r61Var, int i) {
        vj1 vj1VarF0;
        tf2 tf2Var = this.C;
        if (tf2Var == null) {
            vj1VarF0 = F0();
        } else {
            if (!tf2Var.c) {
                tf2Var = null;
            }
            if (tf2Var == null || (vj1VarF0 = tf2Var.d) == null) {
                vj1VarF0 = F0();
            }
        }
        vj1VarF0.d(x41Var);
        return vj1VarF0.a(i, x41Var.getLayoutDirection());
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }
}
