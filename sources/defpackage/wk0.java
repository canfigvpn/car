package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 extends c40 implements k80 {
    public final /* synthetic */ int u = 1;
    public final v6 v;
    public final g90 w;
    public Object x;

    public wk0(cb2 cb2Var, v6 v6Var, g90 g90Var, kj1 kj1Var) {
        this.v = v6Var;
        this.w = g90Var;
        this.x = kj1Var;
        F0(cb2Var);
    }

    public static boolean I0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean J0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.k80
    public final void K(cx0 cx0Var) {
        boolean zJ0;
        long j;
        char c;
        boolean z;
        boolean zI0;
        int i = this.u;
        v6 v6Var = this.v;
        g90 g90Var = this.w;
        switch (i) {
            case 0:
                kj1 kj1Var = (kj1) this.x;
                um umVar = cx0Var.e;
                v6Var.i(umVar.d());
                if (d52.c(umVar.d())) {
                    cx0Var.a();
                    return;
                }
                cx0Var.a();
                v6Var.d.getValue();
                Canvas canvasA = k4.a(umVar.f.g());
                if (g90.f(g90Var.f)) {
                    zJ0 = J0(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (umVar.d() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(cx0Var.x(kj1Var.a(cx0Var.getLayoutDirection())))) & 4294967295L), g90Var.c(), canvasA);
                } else {
                    zJ0 = false;
                }
                if (g90.f(g90Var.d)) {
                    EdgeEffect edgeEffectE = g90Var.e();
                    zJ0 = J0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(cx0Var.x(kj1Var.b))) & 4294967295L), edgeEffectE, canvasA) || zJ0;
                }
                if (g90.f(g90Var.g)) {
                    EdgeEffect edgeEffectD = g90Var.d();
                    zJ0 = J0(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(cx0Var.x(kj1Var.b(cx0Var.getLayoutDirection())) + (-((float) p61.j0(Float.intBitsToFloat((int) (umVar.d() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zJ0;
                }
                if (g90.f(g90Var.e)) {
                    EdgeEffect edgeEffectB = g90Var.b();
                    float fX = cx0Var.x(kj1Var.d);
                    zJ0 = J0(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (umVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (umVar.d() & 4294967295L))) + fX)) & 4294967295L), edgeEffectB, canvasA) || zJ0;
                }
                if (zJ0) {
                    v6Var.d();
                    return;
                }
                return;
            default:
                um umVar2 = cx0Var.e;
                v6Var.i(umVar2.d());
                Canvas canvasA2 = k4.a(umVar2.f.g());
                v6Var.d.getValue();
                if (d52.c(umVar2.d())) {
                    cx0Var.a();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = g90Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = g90Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = g90Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = g90Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = g90Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = g90Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = g90Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = g90Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    cx0Var.a();
                    return;
                }
                float fX2 = cx0Var.x(30.0f);
                boolean z2 = g90.f(g90Var.d) || g90.g(g90Var.h) || g90.f(g90Var.e) || g90.g(g90Var.i);
                boolean z3 = g90.f(g90Var.f) || g90.g(g90Var.j) || g90.f(g90Var.g) || g90.g(g90Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    K0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        K0().setPosition(0, 0, (p61.j0(fX2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            cx0Var.a();
                            return;
                        }
                        K0().setPosition(0, 0, canvasA2.getWidth(), (p61.j0(fX2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = K0().beginRecording();
                boolean zG = g90.g(g90Var.j);
                di1 di1Var = di1.f;
                if (zG) {
                    EdgeEffect edgeEffectA = g90Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = g90Var.a(di1Var);
                        g90Var.j = edgeEffectA;
                    }
                    I0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (g90.f(g90Var.f)) {
                    EdgeEffect edgeEffectC = g90Var.c();
                    zI0 = I0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (g90.g(g90Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (v6Var.c() & j));
                        EdgeEffect edgeEffectA2 = g90Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = g90Var.a(di1Var);
                            g90Var.j = edgeEffectA2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fD = i2 >= 31 ? x5.d(edgeEffectC) : 0.0f;
                        float f = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            x5.f(edgeEffectA2, fD, f);
                        } else {
                            edgeEffectA2.onPull(fD, f);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zI0 = false;
                }
                boolean zG2 = g90.g(g90Var.h);
                di1 di1Var2 = di1.e;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = g90Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = g90Var.a(di1Var2);
                        g90Var.h = edgeEffectA3;
                    }
                    I0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (g90.f(g90Var.d)) {
                    EdgeEffect edgeEffectE2 = g90Var.e();
                    zI0 = I0(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zI0;
                    if (g90.g(g90Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (v6Var.c() >> c));
                        EdgeEffect edgeEffectA4 = g90Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = g90Var.a(di1Var2);
                            g90Var.h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fD2 = i3 >= 31 ? x5.d(edgeEffectE2) : 0.0f;
                        if (i3 >= 31) {
                            x5.f(edgeEffectA4, fD2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fD2, fIntBitsToFloat2);
                        }
                    }
                }
                if (g90.g(g90Var.k)) {
                    EdgeEffect edgeEffectA5 = g90Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = g90Var.a(di1Var);
                        g90Var.k = edgeEffectA5;
                    }
                    I0(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (g90.f(g90Var.g)) {
                    EdgeEffect edgeEffectD2 = g90Var.d();
                    zI0 = I0(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zI0;
                    if (g90.g(g90Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (v6Var.c() & j));
                        EdgeEffect edgeEffectA6 = g90Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = g90Var.a(di1Var);
                            g90Var.k = edgeEffectA6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fD3 = i4 >= 31 ? x5.d(edgeEffectD2) : 0.0f;
                        if (i4 >= 31) {
                            x5.f(edgeEffectA6, fD3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fD3, fIntBitsToFloat3);
                        }
                    }
                }
                if (g90.g(g90Var.i)) {
                    EdgeEffect edgeEffectA7 = g90Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = g90Var.a(di1Var2);
                        g90Var.i = edgeEffectA7;
                    }
                    I0(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (g90.f(g90Var.e)) {
                    EdgeEffect edgeEffectB2 = g90Var.b();
                    boolean z4 = I0(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zI0;
                    if (g90.g(g90Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (v6Var.c() >> c));
                        EdgeEffect edgeEffectA8 = g90Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = g90Var.a(di1Var2);
                            g90Var.i = edgeEffectA8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fD4 = i5 >= 31 ? x5.d(edgeEffectB2) : 0.0f;
                        float f2 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            x5.f(edgeEffectA8, fD4, f2);
                        } else {
                            edgeEffectA8.onPull(fD4, f2);
                        }
                    }
                    zI0 = z4;
                }
                if (zI0) {
                    v6Var.d();
                }
                float f3 = z ? 0.0f : fX2;
                float f4 = z2 ? 0.0f : fX2;
                kw0 layoutDirection = cx0Var.getLayoutDirection();
                j4 j4Var = new j4();
                j4Var.a = recordingCanvasBeginRecording;
                long jD = umVar2.d();
                ud udVar = umVar2.f;
                tm tmVar = ((um) udVar.d).e;
                m40 m40Var = tmVar.a;
                kw0 kw0Var = tmVar.b;
                sm smVarG = udVar.g();
                long jM = umVar2.f.m();
                ud udVar2 = umVar2.f;
                al0 al0Var = (al0) udVar2.c;
                udVar2.x(cx0Var);
                udVar2.y(layoutDirection);
                udVar2.w(j4Var);
                udVar2.z(jD);
                udVar2.c = null;
                j4Var.l();
                try {
                    ((ao2) umVar2.f.b).w(f3, f4);
                    try {
                        cx0Var.a();
                        float f5 = -f3;
                        float f6 = -f4;
                        ((ao2) umVar2.f.b).w(f5, f6);
                        j4Var.i();
                        ud udVar3 = umVar2.f;
                        udVar3.x(m40Var);
                        udVar3.y(kw0Var);
                        udVar3.w(smVarG);
                        udVar3.z(jM);
                        udVar3.c = al0Var;
                        K0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f5, f6);
                        canvasA2.drawRenderNode(K0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((ao2) umVar2.f.b).w(-f3, -f4);
                        throw th;
                    }
                } catch (Throwable th2) {
                    j4Var.i();
                    ud udVar4 = umVar2.f;
                    udVar4.x(m40Var);
                    udVar4.y(kw0Var);
                    udVar4.w(smVarG);
                    udVar4.z(jM);
                    udVar4.c = al0Var;
                    throw th2;
                }
        }
    }

    public RenderNode K0() {
        RenderNode renderNode = (RenderNode) this.x;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeG = jq0.g();
        this.x = renderNodeG;
        return renderNodeG;
    }

    public wk0(cb2 cb2Var, v6 v6Var, g90 g90Var) {
        this.v = v6Var;
        this.w = g90Var;
        F0(cb2Var);
    }
}
