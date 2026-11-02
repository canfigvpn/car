package defpackage;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jp {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public boolean a(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentC;
        int i4;
        int i5;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (!this.a || (viewParentC = c(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            int[] iArr4 = (int[]) this.e;
            if (iArr4 == null) {
                iArr4 = new int[2];
                this.e = iArr4;
            }
            iArr3 = iArr4;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentC instanceof NestedScrollView) {
            ((NestedScrollView) viewParentC).D.a(i, i2, i3, iArr3, null);
        } else if (i3 == 0) {
            try {
                viewParentC.onNestedPreScroll(nestedScrollView, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentC;
        int i6;
        int i7;
        int[] iArr3;
        NestedScrollView nestedScrollView = (NestedScrollView) this.d;
        if (this.a && (viewParentC = c(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    iArr3 = (int[]) this.e;
                    if (iArr3 == null) {
                        iArr3 = new int[2];
                        this.e = iArr3;
                    }
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentC instanceof NestedScrollView) {
                    ((NestedScrollView) viewParentC).g(i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentC instanceof NestedScrollView) {
                        ((NestedScrollView) viewParentC).g(i4, i5, null);
                    } else if (i5 == 0) {
                        try {
                            viewParentC.onNestedScroll(nestedScrollView, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public ViewParent c(int i) {
        if (i == 0) {
            return (ViewParent) this.b;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int d(dq0 dq0Var, e5 e5Var, boolean z) {
        int i;
        byte b;
        int i2;
        int i3;
        sm0 sm0Var = (sm0) this.c;
        vm0 vm0Var = (vm0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            dq0 dq0VarC = ((qk1) this.d).C(dq0Var, e5Var);
            t41 t41Var = (t41) dq0VarC.f;
            int iE = t41Var.e();
            while (true) {
                if (i >= iE) {
                    b = true;
                    break;
                }
                wn1 wn1Var = (wn1) t41Var.f(i);
                i = (wn1Var.d || wn1Var.h) ? 0 : i + 1;
                b = false;
                break;
            }
            int iE2 = t41Var.e();
            for (int i4 = 0; i4 < iE2; i4++) {
                wn1 wn1Var2 = (wn1) t41Var.f(i4);
                if (b != false || sv.o(wn1Var2)) {
                    ((ax0) this.b).A(wn1Var2.c, vm0Var, wn1Var2.i, true);
                    if (!vm0Var.e.h()) {
                        sm0Var.a(wn1Var2.a, vm0Var, sv.o(wn1Var2));
                        vm0Var.clear();
                    }
                }
            }
            boolean zB = sm0Var.b(dq0VarC, z);
            int iE3 = t41Var.e();
            int i5 = 0;
            while (true) {
                if (i5 >= iE3) {
                    i2 = 0;
                    break;
                }
                wn1 wn1Var3 = (wn1) t41Var.f(i5);
                if (!uf1.b(sv.S(wn1Var3, true), 0L) && wn1Var3.b()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iE4 = t41Var.e();
            for (int i6 = 0; i6 < iE4; i6++) {
                if (((wn1) t41Var.f(i6)).b()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.a = false;
        }
    }
}
