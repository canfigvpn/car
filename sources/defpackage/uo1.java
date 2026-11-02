package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import ir.alirezaivaz.mygarage.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uo1 extends r {
    public final v40 A;
    public final Rect B;
    public final k72 C;
    public fc D;
    public final dk1 E;
    public boolean F;
    public final int[] G;
    public ti0 n;
    public yo1 o;
    public String p;
    public final View q;
    public final boolean r;
    public final w40 s;
    public final WindowManager t;
    public final WindowManager.LayoutParams u;
    public xo1 v;
    public kw0 w;
    public final dk1 x;
    public final dk1 y;
    public mr0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo1(ti0 ti0Var, yo1 yo1Var, String str, View view, m40 m40Var, xo1 xo1Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 28;
        w40 wo1Var = i >= 30 ? new wo1(i2) : i >= 29 ? new vo1(i2) : new w40(i2);
        this.n = ti0Var;
        this.o = yo1Var;
        this.p = str;
        this.q = view;
        this.r = z;
        this.s = wo1Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.t = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        yo1 yo1Var2 = this.o;
        boolean zB = s8.b(view);
        boolean z2 = yo1Var2.b;
        int i3 = yo1Var2.a;
        if (z2 && zB) {
            i3 |= 8192;
        } else if (z2 && !zB) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.o.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.u = layoutParams;
        this.v = xo1Var;
        this.w = kw0.e;
        this.x = y12.s(null);
        this.y = y12.s(null);
        this.A = e72.b(new h8(11, this));
        this.B = new Rect();
        this.C = new k72(new o8(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, c22.e(view));
        setTag(R.id.view_tree_view_model_store_owner, n02.j(view));
        setTag(R.id.view_tree_saved_state_registry_owner, j02.n(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(m40Var.x(8.0f));
        setOutlineProvider(new j50(1));
        this.E = y12.s(jt.a);
        this.G = new int[2];
    }

    private final ij0 getContent() {
        return (ij0) this.E.getValue();
    }

    private final mr0 getDisplayBounds() {
        int i = this.o.a & 512;
        View view = this.q;
        Rect rect = this.B;
        w40 w40Var = this.s;
        if (i == 0) {
            w40Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            w40Var.l(view, rect);
        }
        return new mr0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jw0 getParentLayoutCoordinates() {
        return (jw0) this.y.getValue();
    }

    private final void setContent(ij0 ij0Var) {
        this.E.setValue(ij0Var);
    }

    private final void setParentLayoutCoordinates(jw0 jw0Var) {
        this.y.setValue(jw0Var);
    }

    @Override // defpackage.r
    public final void b(int i, ak0 ak0Var) {
        ak0Var.X(-857613600);
        int i2 = (ak0Var.h(this) ? 4 : 2) | i;
        if (ak0Var.O(i2 & 1, (i2 & 3) != 2)) {
            getContent().g(ak0Var, 0);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q(this, i, 7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.o.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                ti0 ti0Var = this.n;
                if (ti0Var != null) {
                    ti0Var.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.A.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.u;
    }

    public final kw0 getParentLayoutDirection() {
        return this.w;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final qr0 m11getPopupContentSizebOM6tXw() {
        return (qr0) this.x.getValue();
    }

    public final xo1 getPositionProvider() {
        return this.v;
    }

    @Override // defpackage.r
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.F;
    }

    public final String getTestTag() {
        return this.p;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.r
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        super.h(z, i, i2, i3, i4);
        this.o.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.s.getClass();
        this.t.updateViewLayout(this, layoutParams);
    }

    @Override // defpackage.r
    public final void i(int i, int i2) {
        this.o.getClass();
        mr0 displayBounds = getDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(displayBounds.c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void n(lv lvVar, ij0 ij0Var) {
        setParentCompositionContext(lvVar);
        setContent(ij0Var);
        this.F = true;
    }

    public final void o(ti0 ti0Var, yo1 yo1Var, String str, kw0 kw0Var) {
        int i;
        this.n = ti0Var;
        this.p = str;
        if (!ws0.j(this.o, yo1Var)) {
            yo1Var.getClass();
            this.o = yo1Var;
            boolean zB = s8.b(this.q);
            boolean z = yo1Var.b;
            int i2 = yo1Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.u;
            layoutParams.flags = i2;
            this.s.getClass();
            this.t.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = kw0Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                qj.p();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.r, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C.d();
        if (!this.o.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        fc fcVar = this.D;
        if (fcVar == null) {
            fc fcVar2 = new fc(0, this.n);
            this.D = fcVar2;
            fcVar = fcVar2;
        }
        h1.g(this, fcVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k72 k72Var = this.C;
        p2 p2Var = k72Var.h;
        if (p2Var != null) {
            p2Var.a();
        }
        k72Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            h1.h(this, this.D);
        }
        this.D = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.o.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            ti0 ti0Var = this.n;
            if (ti0Var != null) {
                ti0Var.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            ti0 ti0Var2 = this.n;
            if (ti0Var2 != null) {
                ti0Var2.a();
            }
        }
        return true;
    }

    public final void p() {
        jw0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.A()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jP = parentLayoutCoordinates.P();
            long jC = this.r ? parentLayoutCoordinates.c(0L) : parentLayoutCoordinates.i(0L);
            mr0 mr0VarC = qx.c((((long) Math.round(Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jC & 4294967295L))))), jP);
            if (mr0VarC.equals(this.z)) {
                return;
            }
            this.z = mr0VarC;
            r();
        }
    }

    public final void q(jw0 jw0Var) {
        setParentLayoutCoordinates(jw0Var);
        p();
    }

    public final void r() {
        qr0 qr0VarM11getPopupContentSizebOM6tXw;
        mr0 mr0Var = this.z;
        if (mr0Var == null || (qr0VarM11getPopupContentSizebOM6tXw = m11getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = qr0VarM11getPopupContentSizebOM6tXw.a;
        mr0 displayBounds = getDisplayBounds();
        long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.c()) << 32);
        fs1 fs1Var = new fs1();
        fs1Var.e = 0L;
        this.C.c(this, je1.r, new to1(fs1Var, this, mr0Var, jB, j));
        long j2 = fs1Var.e;
        WindowManager.LayoutParams layoutParams = this.u;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.o.e;
        w40 w40Var = this.s;
        if (z) {
            w40Var.o(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        w40Var.getClass();
        this.t.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(kw0 kw0Var) {
        this.w = kw0Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m12setPopupContentSizefhxjrPA(qr0 qr0Var) {
        this.x.setValue(qr0Var);
    }

    public final void setPositionProvider(xo1 xo1Var) {
        this.v = xo1Var;
    }

    public final void setTestTag(String str) {
        this.p = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public r getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
