package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class w40 implements kz, ke1, xf1, ty, an1, jq1 {
    public final /* synthetic */ int e;

    public /* synthetic */ w40(int i) {
        this.e = i;
    }

    public static kb1 g(b7 b7Var, zb1 zb1Var, Bundle bundle, r11 r11Var, sb1 sb1Var) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        zb1Var.getClass();
        r11Var.getClass();
        return new kb1(b7Var, zb1Var, bundle, r11Var, sb1Var, string, null);
    }

    public static Typeface j(String str, lh0 lh0Var, int i) {
        if (i == 0 && ws0.j(lh0Var, lh0.i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lh0Var.e, i == 1);
    }

    public static Typeface k(String str, lh0 lh0Var, int i) {
        if (i == 0 && ws0.j(lh0Var, lh0.i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iP = nj2.p(lh0Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iP) : Typeface.create(str, iP);
    }

    @Override // defpackage.ke1
    public boolean a(t71 t71Var) {
        return false;
    }

    @Override // defpackage.ke1
    public int b() {
        return 8;
    }

    @Override // defpackage.ke1
    public boolean c(t71 t71Var) {
        return j20.w(r02.a(qx.V(t71Var), false));
    }

    @Override // defpackage.ke1
    public void d(ax0 ax0Var, long j, vm0 vm0Var, int i, boolean z) {
        he1 he1Var = ax0Var.I;
        me1 me1Var = he1Var.d;
        bu1 bu1Var = me1.Q;
        he1Var.d.X0(me1.U, me1Var.P0(j), vm0Var, 1, z);
    }

    @Override // defpackage.ke1
    public boolean e(vm0 vm0Var, ax0 ax0Var) {
        return false;
    }

    @Override // defpackage.ke1
    public boolean f(ax0 ax0Var) {
        i02 i02VarW = ax0Var.w();
        boolean z = false;
        if (i02VarW != null && i02VarW.h) {
            z = true;
        }
        return !z;
    }

    public void l(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ad, code lost:
    
        if (defpackage.pv0.a(defpackage.ix.b(r9.getKeyCode()), defpackage.pv0.o) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0286, code lost:
    
        if (defpackage.pv0.a(r8, defpackage.pv0.x) != false) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.qv0 m(android.view.KeyEvent r9) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w40.m(android.view.KeyEvent):qv0");
    }

    @Override // defpackage.jq1
    public void h() {
    }

    @Override // defpackage.xf1
    public int n(int i) {
        return i;
    }

    @Override // defpackage.xf1
    public int r(int i) {
        return i;
    }

    @Override // defpackage.jq1
    public void i(int i, Object obj) {
    }

    public void o(uo1 uo1Var, int i, int i2) {
    }
}
