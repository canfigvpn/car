package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fm2 extends am2 {
    public final nl0 b;
    public String c;
    public boolean d;
    public final h80 e;
    public ti0 f;
    public final dk1 g;
    public yi h;
    public final dk1 i;
    public long j;
    public float k;
    public float l;
    public final em2 m;

    public fm2(nl0 nl0Var) {
        this.b = nl0Var;
        nl0Var.i = new em2(this, 0);
        this.c = "";
        this.d = true;
        this.e = new h80();
        this.f = wv.s;
        this.g = y12.s(null);
        this.i = y12.s(new d52(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new em2(this, 1);
    }

    @Override // defpackage.am2
    public final void a(l80 l80Var) {
        e(l80Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x010b  */
    public final void e(l80 l80Var, float f, yi yiVar) {
        int i;
        yi yiVar2;
        g7 g7VarA;
        char c;
        long j;
        long jB;
        yi yiVar3;
        int i2;
        int i3;
        nl0 nl0Var = this.b;
        boolean z = nl0Var.d;
        dk1 dk1Var = this.g;
        if (!z || nl0Var.e == 16) {
            i = 0;
        } else {
            yi yiVar4 = (yi) dk1Var.getValue();
            int i4 = jm2.a;
            if (!(yiVar4 instanceof yi) ? yiVar4 == null : (i3 = yiVar4.c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(yiVar instanceof yi) ? yiVar == null : (i2 = yiVar.c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        h80 h80Var = this.e;
        if (z2 || !d52.a(this.j, l80Var.d())) {
            if (i == 1) {
                jB = nl0Var.e;
                int i5 = jm2.a;
                if (dr.c(jB) != 1.0f) {
                    jB = dr.b(1.0f, jB);
                }
                yiVar2 = new yi(5, jB);
            } else {
                yiVar2 = null;
            }
            this.h = yiVar2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (l80Var.d() >> 32));
            dk1 dk1Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((d52) dk1Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (l80Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((d52) dk1Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (l80Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (l80Var.d() & 4294967295L))))) & 4294967295L);
            kw0 layoutDirection = l80Var.getLayoutDirection();
            g7VarA = h80Var.a;
            j4 j4Var = h80Var.b;
            if (g7VarA != null || j4Var == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = g7VarA.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || h80Var.d != i) {
                }
                h80Var.c = jCeil;
                um umVar = h80Var.e;
                tm tmVar = umVar.e;
                long jM = ux.M(jCeil);
                m40 m40Var = tmVar.a;
                kw0 kw0Var = tmVar.b;
                sm smVar = tmVar.c;
                j4 j4Var2 = j4Var;
                long j2 = tmVar.d;
                tmVar.a = l80Var;
                tmVar.b = layoutDirection;
                tmVar.c = j4Var2;
                tmVar.d = jM;
                j4Var2.l();
                l80.c0(umVar, dr.b, 0L, 0L, 62);
                this.m.h(umVar);
                j4Var2.i();
                tmVar.a = m40Var;
                tmVar.b = kw0Var;
                tmVar.c = smVar;
                tmVar.d = j2;
                g7VarA.a.prepareToDraw();
                this.d = false;
                this.j = l80Var.d();
            }
            g7VarA = ux.a((int) (jCeil >> c), (int) (jCeil & j), i);
            Canvas canvas = k4.a;
            j4Var = new j4();
            j4Var.a = new Canvas(ir2.d(g7VarA));
            h80Var.a = g7VarA;
            h80Var.b = j4Var;
            h80Var.d = i;
            h80Var.c = jCeil;
            um umVar2 = h80Var.e;
            tm tmVar2 = umVar2.e;
            long jM2 = ux.M(jCeil);
            m40 m40Var2 = tmVar2.a;
            kw0 kw0Var2 = tmVar2.b;
            sm smVar2 = tmVar2.c;
            j4 j4Var3 = j4Var;
            long j3 = tmVar2.d;
            tmVar2.a = l80Var;
            tmVar2.b = layoutDirection;
            tmVar2.c = j4Var3;
            tmVar2.d = jM2;
            j4Var3.l();
            l80.c0(umVar2, dr.b, 0L, 0L, 62);
            this.m.h(umVar2);
            j4Var3.i();
            tmVar2.a = m40Var2;
            tmVar2.b = kw0Var2;
            tmVar2.c = smVar2;
            tmVar2.d = j3;
            g7VarA.a.prepareToDraw();
            this.d = false;
            this.j = l80Var.d();
        } else {
            g7 g7Var = h80Var.a;
            if (i != (g7Var != null ? g7Var.a() : 0)) {
                if (i == 1) {
                    jB = nl0Var.e;
                    int i7 = jm2.a;
                    if (dr.c(jB) != 1.0f) {
                        jB = dr.b(1.0f, jB);
                    }
                    yiVar2 = new yi(5, jB);
                } else {
                    yiVar2 = null;
                }
                this.h = yiVar2;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (l80Var.d() >> 32));
                dk1 dk1Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((d52) dk1Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (l80Var.d() & 4294967295L)) / Float.intBitsToFloat((int) (((d52) dk1Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (l80Var.d() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (l80Var.d() & 4294967295L))))) & 4294967295L);
                kw0 layoutDirection2 = l80Var.getLayoutDirection();
                g7VarA = h80Var.a;
                j4 j4Var4 = h80Var.b;
                if (g7VarA != null) {
                    c = ' ';
                    j = 4294967295L;
                    g7VarA = ux.a((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas2 = k4.a;
                    j4Var4 = new j4();
                    j4Var4.a = new Canvas(ir2.d(g7VarA));
                    h80Var.a = g7VarA;
                    h80Var.b = j4Var4;
                    h80Var.d = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    g7VarA = ux.a((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    Canvas canvas3 = k4.a;
                    j4Var4 = new j4();
                    j4Var4.a = new Canvas(ir2.d(g7VarA));
                    h80Var.a = g7VarA;
                    h80Var.b = j4Var4;
                    h80Var.d = i;
                }
                h80Var.c = jCeil2;
                um umVar3 = h80Var.e;
                tm tmVar3 = umVar3.e;
                long jM3 = ux.M(jCeil2);
                m40 m40Var3 = tmVar3.a;
                kw0 kw0Var3 = tmVar3.b;
                sm smVar3 = tmVar3.c;
                j4 j4Var5 = j4Var4;
                long j4 = tmVar3.d;
                tmVar3.a = l80Var;
                tmVar3.b = layoutDirection2;
                tmVar3.c = j4Var5;
                tmVar3.d = jM3;
                j4Var5.l();
                l80.c0(umVar3, dr.b, 0L, 0L, 62);
                this.m.h(umVar3);
                j4Var5.i();
                tmVar3.a = m40Var3;
                tmVar3.b = kw0Var3;
                tmVar3.c = smVar3;
                tmVar3.d = j4;
                g7VarA.a.prepareToDraw();
                this.d = false;
                this.j = l80Var.d();
            }
        }
        if (yiVar != null) {
            yiVar3 = yiVar;
        } else {
            yiVar3 = ((yi) dk1Var.getValue()) != null ? (yi) dk1Var.getValue() : this.h;
        }
        g7 g7Var2 = h80Var.a;
        if (g7Var2 == null) {
            vp0.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        l80.Q(l80Var, g7Var2, h80Var.c, 0L, f, yiVar3, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        dk1 dk1Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((d52) dk1Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((d52) dk1Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
