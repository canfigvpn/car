package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:244:0x0517  */
    /* JADX WARN: Code duplicated, block: B:316:0x0728  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ej0
    public final Object h(Object obj) throws Throwable {
        yi yiVar;
        int i;
        long j;
        um umVar;
        ud udVar;
        float f;
        float f2;
        long jM;
        boolean z;
        String strConcat;
        StringBuilder sb;
        int i2;
        gy0 gy0Var;
        gy0 gy0Var2;
        k01 k01Var;
        k01 k01Var2;
        Bundle bundle;
        Throwable th;
        int i3 = 5;
        float f3 = 0.0f;
        int i4 = 8;
        Throwable th2 = null;
        switch (this.e) {
            case 0:
                return obj == ((n) this.f) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                tl1 tl1Var = (tl1) this.f;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb2 = new StringBuilder(key == tl1Var ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != tl1Var ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 2:
                d3 d3Var = (d3) this.f;
                d3Var.u.g((kc2) obj, ir2.j(d3Var, u5.b));
                return ll2.a;
            case 3:
                ((z02) obj).a(e02.a, new d02(ql0.e, ((yf1) this.f).a(), c02.f, true));
                return ll2.a;
            case 4:
                return new r2(4, (xh) this.f);
            case 5:
                return new r2(i3, (mh2) this.f);
            case 6:
                boolean z2 = true;
                mj mjVar = (mj) this.f;
                sl slVar = (sl) obj;
                if (slVar.b() * mjVar.v < 0.0f || d52.b(slVar.e.d()) <= 0.0f) {
                    return slVar.a(new s1(i4));
                }
                final float fMin = Math.min(w60.b(mjVar.v, 0.0f) ? 1.0f : (float) Math.ceil(slVar.b() * mjVar.v), (float) Math.ceil(d52.b(slVar.e.d()) / 2.0f));
                final float f4 = fMin / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (slVar.e.d() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (slVar.e.d() & 4294967295L)) - fMin)) & 4294967295L);
                float f5 = fMin * 2.0f;
                final boolean z3 = f5 > d52.b(slVar.e.d());
                mx mxVarA = mjVar.x.a(slVar.e.d(), slVar.e.getLayoutDirection(), slVar);
                if (!(mxVarA instanceof gi1)) {
                    if (!(mxVarA instanceof ii1)) {
                        if (!(mxVarA instanceof hi1)) {
                            qj.p();
                            return null;
                        }
                        final o72 o72Var = mjVar.w;
                        if (z3) {
                            jFloatToRawIntBits = 0;
                        }
                        final long j2 = jFloatToRawIntBits;
                        if (z3) {
                            jFloatToRawIntBits2 = slVar.e.d();
                        }
                        final long j3 = jFloatToRawIntBits2;
                        final m80 p92Var = z3 ? fd0.a : new p92(fMin, 0.0f, 0, 0, 30);
                        return slVar.a(new ej0() { // from class: jj
                            @Override // defpackage.ej0
                            public final Object h(Object obj2) {
                                cx0 cx0Var = (cx0) obj2;
                                cx0Var.a();
                                l80.T(cx0Var, o72Var, j2, j3, 0.0f, p92Var, 104);
                                return ll2.a;
                            }
                        });
                    }
                    final o72 o72Var2 = mjVar.w;
                    hv1 hv1Var = ((ii1) mxVarA).i;
                    if (ux.A(hv1Var)) {
                        final long j4 = hv1Var.e;
                        final p92 p92Var2 = new p92(fMin, 0.0f, 0, 0, 30);
                        return slVar.a(new ej0() { // from class: kj
                            @Override // defpackage.ej0
                            public final Object h(Object obj2) throws Throwable {
                                long j5;
                                cx0 cx0Var = (cx0) obj2;
                                cx0Var.a();
                                um umVar2 = cx0Var.e;
                                boolean z4 = z3;
                                rk rkVar = o72Var2;
                                long j6 = j4;
                                if (z4) {
                                    l80.E(cx0Var, rkVar, 0L, 0L, j6, null, 246);
                                } else {
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                                    float f6 = f4;
                                    if (fIntBitsToFloat < f6) {
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (umVar2.d() >> 32));
                                        float f7 = fMin;
                                        float f8 = fIntBitsToFloat2 - f7;
                                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (umVar2.d() & 4294967295L)) - f7;
                                        ud udVar2 = umVar2.f;
                                        long jM2 = udVar2.m();
                                        udVar2.g().l();
                                        try {
                                            ((ud) ((ao2) udVar2.b).f).g().e(f7, f7, f8, fIntBitsToFloat3, 0);
                                            j5 = jM2;
                                            try {
                                                l80.E(cx0Var, rkVar, 0L, 0L, j6, null, 246);
                                                k3.s(udVar2, j5);
                                            } catch (Throwable th3) {
                                                th = th3;
                                                k3.s(udVar2, j5);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            j5 = jM2;
                                        }
                                    } else {
                                        l80.E(cx0Var, rkVar, jFloatToRawIntBits, jFloatToRawIntBits2, ws0.S(f6, j6), p92Var2, 208);
                                    }
                                }
                                return ll2.a;
                            }
                        });
                    }
                    ij ijVar = mjVar.u;
                    if (ijVar == null) {
                        ijVar = new ij();
                        mjVar.u = ijVar;
                    }
                    d8 d8VarA = ijVar.d;
                    if (d8VarA == null) {
                        d8VarA = f8.a();
                        ijVar.d = d8VarA;
                    }
                    d8VarA.e();
                    d8.b(d8VarA, hv1Var);
                    if (!z3) {
                        d8 d8VarA2 = f8.a();
                        d8.b(d8VarA2, new hv1(fMin, fMin, (hv1Var.c - hv1Var.a) - fMin, (hv1Var.d - hv1Var.b) - fMin, ws0.S(fMin, hv1Var.e), ws0.S(fMin, hv1Var.f), ws0.S(fMin, hv1Var.g), ws0.S(fMin, hv1Var.h)));
                        d8VarA.d(d8VarA, d8VarA2, 0);
                    }
                    return slVar.a(new d(7, d8VarA, o72Var2));
                }
                o72 o72Var3 = mjVar.w;
                gi1 gi1Var = (gi1) mxVarA;
                d8 d8Var = gi1Var.i;
                if (z3) {
                    return slVar.a(new d(i4, gi1Var, o72Var3));
                }
                if (o72Var3 != null) {
                    yiVar = new yi(5, dr.b(1.0f, o72Var3.a));
                    i = 1;
                } else {
                    yiVar = null;
                    i = 0;
                }
                yr1 yr1VarC = d8Var.c();
                float f6 = yr1VarC.b;
                float f7 = yr1VarC.a;
                ij ijVar2 = mjVar.u;
                if (ijVar2 == null) {
                    ijVar2 = new ij();
                    mjVar.u = ijVar2;
                }
                d8 d8VarA3 = ijVar2.d;
                if (d8VarA3 == null) {
                    d8VarA3 = f8.a();
                    ijVar2.d = d8VarA3;
                }
                d8VarA3.e();
                float f8 = yr1VarC.a;
                float f9 = yr1VarC.d;
                float f10 = yr1VarC.c;
                float f11 = yr1VarC.b;
                if (Float.isNaN(f8) || Float.isNaN(f11) || Float.isNaN(f10) || Float.isNaN(f9)) {
                    f8.b("Invalid rectangle, make sure no value is NaN");
                }
                RectF rectF = d8VarA3.b;
                if (rectF == null) {
                    rectF = new RectF();
                    d8VarA3.b = rectF;
                }
                rectF.set(f8, f11, f10, f9);
                Path path = d8VarA3.a;
                RectF rectF2 = d8VarA3.b;
                rectF2.getClass();
                path.addRect(rectF2, Path.Direction.CCW);
                d8VarA3.d(d8VarA3, d8Var, 0);
                gs1 gs1Var = new gs1();
                long jCeil = (((long) ((int) Math.ceil(yr1VarC.d - f6))) & 4294967295L) | (((long) ((int) Math.ceil(yr1VarC.c - f7))) << 32);
                ij ijVar3 = mjVar.u;
                ijVar3.getClass();
                g7 g7VarA = ijVar3.a;
                j4 j4Var = ijVar3.b;
                go0 go0Var = g7VarA != null ? new go0(g7VarA.a()) : null;
                if (go0Var == null || go0Var.a != 0) {
                    go0 go0Var2 = g7VarA != null ? new go0(g7VarA.a()) : null;
                    if (go0Var2 == null || i != go0Var2.a) {
                        z2 = false;
                    }
                }
                try {
                    try {
                        if (g7VarA != null && j4Var != null) {
                            j = jCeil;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (slVar.e.d() >> 32));
                            Bitmap bitmap = g7VarA.a;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (slVar.e.d() & 4294967295L)) > bitmap.getHeight() || !z2) {
                            }
                            umVar = ijVar3.c;
                            if (umVar == null) {
                                umVar = new um();
                                ijVar3.c = umVar;
                            }
                            udVar = umVar.f;
                            tm tmVar = umVar.e;
                            long jM2 = ux.M(j);
                            kw0 layoutDirection = slVar.e.getLayoutDirection();
                            m40 m40Var = tmVar.a;
                            um umVar2 = umVar;
                            kw0 kw0Var = tmVar.b;
                            sm smVar = tmVar.c;
                            long j5 = tmVar.d;
                            tmVar.a = slVar;
                            tmVar.b = layoutDirection;
                            tmVar.c = j4Var;
                            tmVar.d = jM2;
                            j4Var.l();
                            l80.c0(umVar2, dr.b, 0L, jM2, 58);
                            f = -f7;
                            f2 = -f6;
                            ((ao2) udVar.b).w(f, f2);
                            l80.s(umVar2, gi1Var.i, o72Var3, 0.0f, new p92(f5, 0.0f, 0, 0, 30), 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (umVar2.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (umVar2.d() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (umVar2.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (umVar2.d() & 4294967295L));
                            long jV = umVar2.V();
                            g7 g7Var = g7VarA;
                            j4 j4Var2 = j4Var;
                            jM = udVar.m();
                            udVar.g().l();
                            d8 d8Var2 = d8VarA3;
                            ((ao2) udVar.b).s(fIntBitsToFloat2, fIntBitsToFloat3, jV);
                            l80.s(umVar2, d8Var2, o72Var3, 0.0f, null, 28);
                            udVar.g().i();
                            udVar.z(jM);
                            ((ao2) udVar.b).w(-f, -f2);
                            j4Var2.i();
                            tmVar.a = m40Var;
                            tmVar.b = kw0Var;
                            tmVar.c = smVar;
                            tmVar.d = j5;
                            g7Var.a.prepareToDraw();
                            gs1Var.e = g7Var;
                            return slVar.a(new lj(yr1VarC, gs1Var, j, yiVar));
                        }
                        j = jCeil;
                        ((ao2) udVar.b).s(fIntBitsToFloat2, fIntBitsToFloat3, jV);
                        l80.s(umVar2, d8Var2, o72Var3, 0.0f, null, 28);
                        udVar.g().i();
                        udVar.z(jM);
                        ((ao2) udVar.b).w(-f, -f2);
                        j4Var2.i();
                        tmVar.a = m40Var;
                        tmVar.b = kw0Var;
                        tmVar.c = smVar;
                        tmVar.d = j5;
                        g7Var.a.prepareToDraw();
                        gs1Var.e = g7Var;
                        return slVar.a(new lj(yr1VarC, gs1Var, j, yiVar));
                    } catch (Throwable th3) {
                        udVar.g().i();
                        udVar.z(jM);
                        throw th3;
                    }
                    l80.s(umVar2, gi1Var.i, o72Var3, 0.0f, new p92(f5, 0.0f, 0, 0, 30), 52);
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (umVar2.d() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (umVar2.d() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (umVar2.d() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (umVar2.d() & 4294967295L));
                    long jV2 = umVar2.V();
                    g7 g7Var2 = g7VarA;
                    j4 j4Var3 = j4Var;
                    jM = udVar.m();
                    udVar.g().l();
                    d8 d8Var3 = d8VarA3;
                } catch (Throwable th4) {
                    ((ao2) udVar.b).w(-f, -f2);
                    throw th4;
                }
                g7VarA = ux.a((int) (j >> 32), (int) (j & 4294967295L), i);
                ijVar3.a = g7VarA;
                Canvas canvas = k4.a;
                j4Var = new j4();
                j4Var.a = new Canvas(ir2.d(g7VarA));
                ijVar3.b = j4Var;
                umVar = ijVar3.c;
                if (umVar == null) {
                    umVar = new um();
                    ijVar3.c = umVar;
                }
                udVar = umVar.f;
                tm tmVar2 = umVar.e;
                long jM3 = ux.M(j);
                kw0 layoutDirection2 = slVar.e.getLayoutDirection();
                m40 m40Var2 = tmVar2.a;
                um umVar3 = umVar;
                kw0 kw0Var2 = tmVar2.b;
                sm smVar2 = tmVar2.c;
                long j6 = tmVar2.d;
                tmVar2.a = slVar;
                tmVar2.b = layoutDirection2;
                tmVar2.c = j4Var;
                tmVar2.d = jM3;
                j4Var.l();
                l80.c0(umVar3, dr.b, 0L, jM3, 58);
                f = -f7;
                f2 = -f6;
                ((ao2) udVar.b).w(f, f2);
                break;
            case 7:
                cs1 cs1Var = (cs1) this.f;
                si2 si2Var = (si2) obj;
                if (cs1Var.e) {
                    z = true;
                } else {
                    si2Var.getClass();
                    if (((cy1) si2Var).s) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                cs1Var.e = z;
                return Boolean.valueOf(!z);
            case 8:
                w02.b((z02) obj, (String) ((qj1) this.f).e);
                return ll2.a;
            case 9:
                ((q41) this.f).a();
                return ll2.a;
            case 10:
                r90 r90Var = (r90) obj;
                String str = ((r90) this.f) == r90Var ? " > " : "   ";
                if (!(r90Var instanceof es)) {
                    if (r90Var instanceof b32) {
                        sb = new StringBuilder("SetComposingTextCommand(text.length=");
                        b32 b32Var = (b32) r90Var;
                        sb.append(b32Var.a.f.length());
                        sb.append(", newCursorPosition=");
                        i2 = b32Var.b;
                    } else if (r90Var instanceof a32) {
                        strConcat = ((a32) r90Var).toString();
                    } else if (r90Var instanceof j40) {
                        strConcat = ((j40) r90Var).toString();
                    } else if (r90Var instanceof k40) {
                        strConcat = ((k40) r90Var).toString();
                    } else if (r90Var instanceof c32) {
                        strConcat = ((c32) r90Var).toString();
                    } else if (r90Var instanceof kd0) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (r90Var instanceof i40) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strC = js1.a(r90Var.getClass()).c();
                        if (strC == null) {
                            strC = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strC);
                    }
                    return str.concat(strConcat);
                }
                sb = new StringBuilder("CommitTextCommand(text.length=");
                es esVar = (es) r90Var;
                sb.append(esVar.a.f.length());
                sb.append(", newCursorPosition=");
                i2 = esVar.b;
                strConcat = k3.l(sb, i2, ')');
                return str.concat(strConcat);
            case 11:
                bk2 bk2Var = (bk2) obj;
                return ((lg0) this.f).a(new bk2(null, bk2Var.b, bk2Var.c, bk2Var.d, bk2Var.e)).getValue();
            case 12:
                return Integer.valueOf(((ny0) this.f).c(((Integer) obj).intValue()));
            case 13:
                ry0 ry0Var = (ry0) this.f;
                float f12 = -((Float) obj).floatValue();
                if ((f12 >= 0.0f || ry0Var.c()) && (f12 <= 0.0f || ry0Var.a())) {
                    if (Math.abs(ry0Var.g) > 0.5f) {
                        yp0.c("entered drag with non-zero pending scroll");
                    }
                    float f13 = ry0Var.g + f12;
                    ry0Var.g = f13;
                    if (Math.abs(f13) > 0.5f) {
                        float f14 = ry0Var.g;
                        int iJ0 = p61.j0(f14);
                        gy0 gy0VarF = ((gy0) ry0Var.e.getValue()).f(iJ0, !ry0Var.b);
                        if (gy0VarF == null || (gy0Var2 = ry0Var.c) == null) {
                            gy0Var = gy0VarF;
                        } else {
                            gy0 gy0VarF2 = gy0Var2.f(iJ0, true);
                            if (gy0VarF2 != null) {
                                ry0Var.c = gy0VarF2;
                                gy0Var = gy0VarF;
                            } else {
                                gy0Var = null;
                            }
                        }
                        if (gy0Var != null) {
                            ry0Var.f(gy0Var, ry0Var.b, true);
                            ry0Var.r.setValue(ll2.a);
                            ry0Var.h(f14 - ry0Var.g, gy0Var);
                        } else {
                            ax0 ax0Var = ry0Var.j;
                            if (ax0Var != null) {
                                ax0Var.k();
                            }
                            ry0Var.h(f14 - ry0Var.g, ry0Var.g());
                        }
                    }
                    if (Math.abs(ry0Var.g) > 0.5f) {
                        f12 -= ry0Var.g;
                        ry0Var.g = 0.0f;
                    }
                    f3 = f12;
                }
                return Float.valueOf(-f3);
            case 14:
                return new r2(9, (hz0) this.f);
            case 15:
                return new r2(11, (pz0) this.f);
            case 16:
                Object obj2 = this.f;
                ((Integer) obj).getClass();
                return obj2;
            case 17:
                i01 i01Var = (i01) this.f;
                return i01Var.n(((Integer) obj).intValue(), i01Var.d);
            case 18:
                q01 q01Var = (q01) this.f;
                float f15 = -((Float) obj).floatValue();
                if ((f15 >= 0.0f || q01Var.c()) && (f15 <= 0.0f || q01Var.a())) {
                    if (Math.abs(q01Var.h) > 0.5f) {
                        yp0.c("entered drag with non-zero pending scroll");
                    }
                    q01Var.d = true;
                    float f16 = q01Var.h + f15;
                    q01Var.h = f16;
                    if (Math.abs(f16) > 0.5f) {
                        float f17 = q01Var.h;
                        int iRound = Math.round(f17);
                        k01 k01VarF = ((k01) q01Var.f.getValue()).f(iRound, !q01Var.b);
                        if (k01VarF == null || (k01Var2 = q01Var.c) == null) {
                            k01Var = k01VarF;
                        } else {
                            k01 k01VarF2 = k01Var2.f(iRound, true);
                            if (k01VarF2 != null) {
                                q01Var.c = k01VarF2;
                                k01Var = k01VarF;
                            } else {
                                k01Var = null;
                            }
                        }
                        if (k01Var != null) {
                            q01Var.g(k01Var, q01Var.b, true);
                            q01Var.v.setValue(ll2.a);
                            q01Var.k(f17 - q01Var.h, k01Var);
                        } else {
                            ax0 ax0Var2 = q01Var.k;
                            if (ax0Var2 != null) {
                                ax0Var2.k();
                            }
                            q01Var.k(f17 - q01Var.h, q01Var.j());
                        }
                    }
                    if (Math.abs(q01Var.h) > 0.5f) {
                        f15 -= q01Var.h;
                        q01Var.h = 0.0f;
                    }
                    f3 = f15;
                }
                return Float.valueOf(-f3);
            case 19:
                gw1 gw1Var = (gw1) this.f;
                return Boolean.valueOf(gw1Var != null ? gw1Var.d(obj) : true);
            case 20:
                return ((k61) this.f).b(((Integer) obj).intValue());
            case 21:
                ((ta1) this.f).b(null);
                return ll2.a;
            case 22:
                Bundle bundle2 = (Bundle) obj;
                ic1 ic1VarR = ix.r((Context) this.f);
                if (bundle2 != null) {
                    bundle2.setClassLoader(ic1VarR.a.getClassLoader());
                }
                rb1 rb1Var = ic1VarR.b;
                LinkedHashMap linkedHashMap = rb1Var.m;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            rw.C("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    rb1Var.d = bundle;
                    rb1Var.e = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) vv.v("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            rw.C("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            rw.C("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < length) {
                            int i7 = i6 + 1;
                            Throwable th5 = th2;
                            rb1Var.l.put(Integer.valueOf(intArray[i5]), !ws0.j(stringArrayList.get(i6), "") ? (String) stringArrayList.get(i6) : th5);
                            i5++;
                            i6 = i7;
                            th2 = th5;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            rw.C("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i8 = 0;
                        while (i8 < size) {
                            String str2 = stringArrayList2.get(i8);
                            i8++;
                            String str3 = str2;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                ArrayList arrayListV = vv.v("android-support-nav:controller:backStackStates:" + str3, bundle2);
                                le leVar = new le(arrayListV.size());
                                int size2 = arrayListV.size();
                                int i9 = 0;
                                while (i9 < size2) {
                                    Object obj3 = arrayListV.get(i9);
                                    i9++;
                                    leVar.addLast(new ob1((Bundle) obj3));
                                }
                                linkedHashMap.put(str3, leVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z4 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z4 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z4) : th;
                    ic1VarR.e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
                }
                return ic1VarR;
            case 23:
                ((ak1) this.f).i((int) (((qr0) obj).a >> 32));
                return ll2.a;
            case 24:
                qd1 qd1Var = (qd1) this.f;
                kb1 kb1Var = (kb1) obj;
                kb1Var.getClass();
                mb1 mb1Var = kb1Var.l;
                zb1 zb1Var = kb1Var.f;
                if (zb1Var == null) {
                    zb1Var = null;
                }
                if (zb1Var == null) {
                    return null;
                }
                mb1Var.a();
                zb1 zb1VarC = qd1Var.c(zb1Var);
                if (zb1VarC == null) {
                    return null;
                }
                return zb1VarC.equals(zb1Var) ? kb1Var : qd1Var.b().b(zb1VarC, zb1VarC.a(mb1Var.a()));
            case 25:
                hf1 hf1Var = (hf1) this.f;
                bq bqVar = (bq) obj;
                bqVar.getClass();
                List list = hf1Var.b;
                list.getClass();
                bqVar.b = list;
                return ll2.a;
            case 26:
                s12 s12Var = (s12) this.f;
                int iIntValue = ((Integer) obj).intValue();
                return s12Var.e(iIntValue) + ": " + s12Var.j(iIntValue).b();
            case 27:
                fo1 fo1Var = (fo1) this.f;
                bq bqVar2 = (bq) obj;
                bqVar2.getClass();
                bq.a(bqVar2, "type", g92.b);
                bq.a(bqVar2, "value", v12.e("kotlinx.serialization.Polymorphic<" + fo1Var.a.c() + '>', w12.b, new s12[0]));
                bqVar2.b = cb0.e;
                return ll2.a;
            case 28:
                ((qv) this.f).y(obj);
                return ll2.a;
            default:
                rr1 rr1Var = (rr1) this.f;
                Throwable th6 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th6);
                synchronized (rr1Var.c) {
                    try {
                        ot0 ot0Var = rr1Var.d;
                        if (ot0Var != null) {
                            s82 s82Var = rr1Var.u;
                            or1 or1Var = or1.f;
                            s82Var.getClass();
                            s82Var.j(null, or1Var);
                            ot0Var.d(cancellationException);
                            rr1Var.r = null;
                            ot0Var.t(new kc1(i4, rr1Var, th6));
                        } else {
                            rr1Var.e = cancellationException;
                            s82 s82Var2 = rr1Var.u;
                            or1 or1Var2 = or1.e;
                            s82Var2.getClass();
                            s82Var2.j(null, or1Var2);
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return ll2.a;
        }
    }

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
    }
}
