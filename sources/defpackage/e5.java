package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ir.alirezaivaz.mygarage.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 extends ViewGroup implements aj1, fv1, e30, fi1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, rf0 {
    public static Class Q0;
    public static Method R0;
    public static Method S0;
    public static final p91 T0 = new p91();
    public static p4 U0;
    public static Method V0;
    public final d91 A;
    public long A0;
    public final as1 B;
    public final ru1 B0;
    public final t02 C;
    public final p91 C0;
    public final k5 D;
    public float D0;
    public a6 E;
    public float E0;
    public final d4 F;
    public final b5 F0;
    public final f7 G;
    public final n4 G0;
    public final rf H;
    public boolean H0;
    public final p91 I;
    public final op0 I0;
    public p91 J;
    public final u4 J0;
    public boolean K;
    public final wl K0;
    public final d81 L;
    public boolean L0;
    public final jp M;
    public boolean M0;
    public final dk1 N;
    public final px1 N0;
    public final v40 O;
    public View O0;
    public final e4 P;
    public final z4 P0;
    public final h4 Q;
    public boolean R;
    public final m4 S;
    public final l4 T;
    public final cj1 U;
    public boolean V;
    public ea W;
    public sw a0;
    public boolean b0;
    public final t61 c0;
    public long d0;
    public final dk1 e;
    public final int[] e0;
    public long f;
    public final float[] f0;
    public final boolean g;
    public final float[] g0;
    public cp0 h;
    public final float[] h0;
    public final cx0 i;
    public long i0;
    public c21 j;
    public boolean j0;
    public d21 k;
    public long k0;
    public zt1 l;
    public final dk1 l0;
    public final le m;
    public final v40 m0;
    public final n4 n;
    public ej0 n0;
    public final dk1 o;
    public af2 o0;
    public final View p;
    public ye2 p0;
    public final vf0 q;
    public final AtomicReference q0;
    public uy r;
    public e40 r0;
    public final r6 s;
    public final ig0 s0;
    public final x01 t;
    public final da1 t0;
    public final dk1 u;
    public final dk1 u0;
    public final v40 v;
    public final yl0 v0;
    public final vm w;
    public final hq0 w0;
    public final ca x;
    public final v71 x0;
    public final nq0 y;
    public final u9 y0;
    public final ax0 z;
    public MotionEvent z0;

    public e5(Context context, av avVar) {
        e4 e4Var;
        h4 h4Var;
        kw0 kw0Var;
        super(context);
        this.e = y12.s(avVar);
        this.f = 9205357640488583168L;
        int i = 1;
        this.g = true;
        this.i = avVar.r;
        this.l = q90.M;
        this.m = new le();
        int i2 = 0;
        this.n = new n4(this, i2);
        this.o = new dk1(sv0.F(context), is1.f);
        this.q = new vf0(this, this);
        this.r = avVar.b.j();
        this.s = new r6();
        this.t = new x01();
        this.u = y12.s(Boolean.FALSE);
        this.v = e72.b(new u4(this, i2));
        this.w = avVar.t;
        this.x = avVar.q;
        this.y = new nq0();
        int i3 = 3;
        ax0 ax0Var = new ax0(3);
        ax0Var.c0(gv1.c);
        ax0Var.Z(getDensity());
        ax0Var.e0(getViewConfiguration());
        ax0Var.d0(new c5(this).c(((vf0) getFocusOwner()).e).c(getDragAndDropManager().c));
        this.z = ax0Var;
        d91 d91Var = hr0.a;
        this.A = new d91();
        m7getLayoutNodes();
        this.B = new as1(this);
        this.C = new t02(getRoot(), new eb0(), m7getLayoutNodes());
        k5 k5Var = new k5(this);
        this.D = k5Var;
        this.E = new a6(this, new t4(0, this, s5.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        this.F = avVar.j;
        this.G = new f7(this);
        this.H = new rf();
        this.I = new p91();
        this.L = new d81();
        ax0 root = getRoot();
        jp jpVar = new jp();
        jpVar.b = root;
        jpVar.c = new sm0(root.I.c);
        jpVar.d = new qk1(3);
        jpVar.e = new vm0();
        this.M = jpVar;
        this.N = y12.s(new Configuration(context.getResources().getConfiguration()));
        this.O = e72.b(new u4(this, i));
        if (f()) {
            rf autofillTree = getAutofillTree();
            e4Var = new e4();
            e4Var.e = this;
            e4Var.f = autofillTree;
            AutofillManager autofillManagerF = a1.f(getContext().getSystemService(a1.k()));
            if (autofillManagerF == null) {
                fu1.h("Autofill service could not be located.");
                throw null;
            }
            e4Var.g = autofillManagerF;
            setImportantForAutofill(1);
            pf pfVarI = c12.i(this);
            AutofillId autofillIdB = pfVarI != null ? of.b(pfVarI.a) : null;
            if (autofillIdB == null) {
                throw k3.g("Required value was null.");
            }
            e4Var.h = autofillIdB;
        } else {
            e4Var = null;
        }
        this.P = e4Var;
        if (f()) {
            AutofillManager autofillManagerF2 = a1.f(context.getSystemService(a1.k()));
            if (autofillManagerF2 == null) {
                throw k3.g("Autofill service could not be located.");
            }
            h4Var = new h4(new qk1(i, autofillManagerF2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            h4Var = null;
        }
        this.Q = h4Var;
        this.S = avVar.l;
        this.T = avVar.m;
        this.U = new cj1(new y4(this, i));
        this.c0 = new t61(getRoot());
        this.d0 = 9223372034707292159L;
        this.e0 = new int[]{0, 0};
        float[] fArrA = q61.a();
        this.f0 = fArrA;
        this.g0 = q61.a();
        this.h0 = q61.a();
        this.i0 = -1L;
        this.k0 = 9187343241974906880L;
        this.l0 = y12.s(null);
        this.m0 = e72.b(new u4(this, i3));
        this.q0 = new AtomicReference(null);
        this.s0 = avVar.n;
        this.t0 = avVar.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = pf0.a;
        kw0 kw0Var2 = kw0.e;
        if (layoutDirection != 0) {
            kw0Var = layoutDirection != 1 ? null : kw0.f;
        } else {
            kw0Var = kw0Var2;
        }
        this.u0 = y12.s(kw0Var != null ? kw0Var : kw0Var2);
        this.v0 = avVar.p;
        int i4 = 2;
        this.w0 = new hq0(isInTouchMode() ? 1 : 2);
        v71 v71Var = new v71();
        new fa1(new rh[16]);
        new fa1(new ux[16]);
        new fa1(new ax0[16]);
        new fa1(new ux[16]);
        this.x0 = v71Var;
        u9 u9Var = new u9();
        new iq1(new h8(i, u9Var));
        this.y0 = u9Var;
        this.B0 = new ru1(10);
        this.C0 = new p91();
        this.F0 = new b5(i2, this);
        this.G0 = new n4(this, i);
        this.I0 = new op0(context, new y4(this, i2));
        this.J0 = new u4(this, i4);
        int i5 = Build.VERSION.SDK_INT;
        this.K0 = i5 < 29 ? new xl(fArrA) : new yl();
        addOnAttachStateChangeListener(this.E);
        setWillNotDraw(false);
        setFocusable(true);
        if (i5 >= 26) {
            r5.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ln2.c(this, k5Var);
        setOnDragListener(getDragAndDropManager());
        getRoot().d(this);
        if (i5 >= 29) {
            m5.a.a(this);
        }
        if (p()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.p = view;
            addView(view, -1);
        }
        this.N0 = i5 >= 31 ? new px1() : null;
        this.P0 = new z4(this);
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof e5) {
                ((e5) childAt).x();
            } else if (childAt instanceof ViewGroup) {
                g((ViewGroup) childAt);
            }
        }
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    private final af2 getLegacyTextInputServiceAndroid() {
        af2 af2Var = this.o0;
        if (af2Var != null) {
            return af2Var;
        }
        af2 af2Var2 = new af2(getView(), this);
        this.o0 = af2Var2;
        return af2Var2;
    }

    private final av get_composeViewContext() {
        return (av) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s4 get_viewTreeOwners() {
        k3.v(this.l0.getValue());
        return null;
    }

    public static long i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    public static View k(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (ws0.j(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewK = k(viewGroup.getChildAt(i2), i);
                    if (viewK != null) {
                        return viewK;
                    }
                }
            }
        }
        return null;
    }

    public static void n(ax0 ax0Var) {
        ax0Var.D();
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            n((ax0) objArr[i2]);
        }
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean q(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !e81.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.u.setValue(Boolean.valueOf(z));
    }

    private void setDensity(m40 m40Var) {
        this.o.setValue(m40Var);
    }

    private void setFontFamilyResolver(jg0 jg0Var) {
        this.t0.setValue(jg0Var);
    }

    private void setLayoutDirection(kw0 kw0Var) {
        this.u0.setValue(kw0Var);
    }

    private final void set_composeViewContext(av avVar) {
        this.e.setValue(avVar);
    }

    private final void set_viewTreeOwners(s4 s4Var) {
        this.l0.setValue(s4Var);
    }

    public final void A(ax0 ax0Var, boolean z, boolean z2) {
        ex0 ex0Var = ax0Var.J;
        dt0 dt0Var = dt0.h;
        t61 t61Var = this.c0;
        if (!z) {
            t61Var.getClass();
            int iOrdinal = ex0Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                qj.p();
                return;
            }
            ax0 ax0VarU = ax0Var.u();
            boolean z3 = ax0VarU == null || ax0VarU.I();
            if (!z2) {
                if (ax0Var.q()) {
                    return;
                }
                if (ax0Var.p() && ax0Var.I() == z3 && ax0Var.I() == ex0Var.p.x) {
                    return;
                }
            }
            v61 v61Var = ex0Var.p;
            v61Var.z = true;
            v61Var.A = true;
            if (!ax0Var.R && v61Var.x && z3) {
                if ((ax0VarU == null || !ax0VarU.p()) && (ax0VarU == null || !ax0VarU.q())) {
                    ((ud) t61Var.d).a(ax0Var, dt0Var);
                }
                if (t61Var.b) {
                    return;
                }
                F(null);
                return;
            }
            return;
        }
        ud udVar = (ud) t61Var.d;
        int iOrdinal2 = ex0Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    qj.p();
                    return;
                }
            }
        }
        if ((ex0Var.e || ex0Var.f) && !z2) {
            return;
        }
        ex0Var.f = true;
        ex0Var.g = true;
        v61 v61Var2 = ex0Var.p;
        v61Var2.z = true;
        v61Var2.A = true;
        if (ax0Var.R) {
            return;
        }
        ax0 ax0VarU2 = ax0Var.u();
        if (ws0.j(ax0Var.J(), Boolean.TRUE) && ((ax0VarU2 == null || !ax0VarU2.J.e) && (ax0VarU2 == null || !ax0VarU2.J.f))) {
            udVar.a(ax0Var, dt0.f);
        } else if (ax0Var.I() && ((ax0VarU2 == null || !ax0VarU2.p()) && (ax0VarU2 == null || !ax0VarU2.q()))) {
            udVar.a(ax0Var, dt0Var);
        }
        if (t61Var.b) {
            return;
        }
        F(null);
    }

    public final void B() {
        k5 k5Var = this.D;
        k5Var.B = true;
        Handler handler = k5Var.h.getHandler();
        if (k5Var.q() && !k5Var.M && handler != null) {
            k5Var.M = true;
            handler.post(k5Var.O);
        }
        a6 a6Var = this.E;
        a6Var.j = true;
        Handler handler2 = a6Var.e.getHandler();
        if (!a6Var.f() || a6Var.p || handler2 == null) {
            return;
        }
        a6Var.p = true;
        handler2.post(a6Var.q);
    }

    public final void C() {
        if (this.j0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.i0) {
            this.i0 = jCurrentAnimationTimeMillis;
            wl wlVar = this.K0;
            float[] fArr = this.g0;
            wlVar.a(this, fArr);
            ix.G(fArr, this.h0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.e0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.k0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.i0 = AnimationUtils.currentAnimationTimeMillis();
        wl wlVar = this.K0;
        float[] fArr = this.g0;
        wlVar.a(this, fArr);
        ix.G(fArr, this.h0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = q61.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.k0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean E() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void F(ax0 ax0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (ax0Var != null) {
            while (ax0Var != null && ax0Var.r() == yw0.e) {
                if (!this.b0) {
                    ax0 ax0VarU = ax0Var.u();
                    if (ax0VarU == null) {
                        break;
                    }
                    long j = ax0VarU.I.c.h;
                    if (sw.f(j) && sw.e(j)) {
                        break;
                    }
                }
                ax0Var = ax0Var.u();
            }
            if (ax0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long G(long j) {
        C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.k0 >> 32));
        return q61.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.k0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.h0);
    }

    public final int H(MotionEvent motionEvent) {
        Object obj;
        if (this.L0) {
            this.L0 = false;
            x01 x01Var = getComposeViewContext().s;
            to2.a.setValue(new bo1(motionEvent.getMetaState()));
        }
        d81 d81Var = this.L;
        dq0 dq0VarC = d81Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        jp jpVar = this.M;
        if (dq0VarC == null) {
            if (!jpVar.a) {
                t41 t41Var = (t41) ((qk1) jpVar.d).f;
                int i = t41Var.h;
                Object[] objArr = t41Var.g;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                t41Var.h = 0;
                t41Var.e = false;
                ((sm0) jpVar.c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) dq0VarC.f;
        int size = arrayList.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i3 = size - 1;
            obj = arrayList.get(size);
            if (((yn1) obj).e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i3 < 0) {
                obj = null;
                break;
            }
            size = i3;
        }
        yn1 yn1Var = (yn1) obj;
        if (yn1Var != null) {
            this.f = yn1Var.d;
        }
        int iD = jpVar.d(dq0VarC, this, r(motionEvent));
        dq0VarC.g = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iD & 1) != 0) {
            return iD;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        d81Var.c.delete(pointerId);
        d81Var.b.delete(pointerId);
        return iD;
    }

    public final void I(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jU = u((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jU >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jU & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        dq0 dq0VarC = this.L.c(motionEventObtain, this);
        dq0VarC.getClass();
        this.M.d(dq0VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void J(ij0 ij0Var, tx txVar) {
        d5 d5Var;
        if (txVar instanceof d5) {
            d5Var = (d5) txVar;
            int i = d5Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                d5Var.j = i - Integer.MIN_VALUE;
            } else {
                d5Var = new d5(this, txVar);
            }
        } else {
            d5Var = new d5(this, txVar);
        }
        Object obj = d5Var.h;
        int i2 = d5Var.j;
        if (i2 == 0) {
            ix.Q(obj);
            y4 y4Var = new y4(this, 2);
            d5Var.j = 1;
            if (qx.w(new n7(y4Var, this.q0, ij0Var, (sx) null, 12), d5Var) == fz.e) {
                return;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            ix.Q(obj);
        }
        qj.e();
    }

    public final void K(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (ws0.j(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(sv0.F(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.t.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void L() {
        boolean z;
        int i;
        int[] iArr = this.e0;
        getLocationOnScreen(iArr);
        long j = this.d0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.i0 >= 0) {
            z = false;
        } else {
            this.d0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                fa1 fa1VarZ = getRoot().z();
                Object[] objArr = fa1VarZ.e;
                int i5 = fa1VarZ.g;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((ax0) objArr[i6]).J.p.z0();
                }
                z = true;
            }
        }
        C();
        View rootView = this.O0;
        if (rootView == null) {
            rootView = getRootView();
            this.O0 = rootView;
        }
        as1 rectManager = getRectManager();
        long j2 = this.d0;
        long jN = mx.N(this.k0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.g0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        pg2 pg2Var = rectManager.c;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f = pg2Var.b(j2, jN, fArr, width, height) || rectManager.f;
        this.c0.c(z);
        getRectManager().a();
    }

    public final void M(float f) {
        if (p()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.D0) || f > this.D0) {
                    this.D0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.E0) || f < this.E0) {
                    this.E0 = f;
                }
            }
        }
    }

    @Override // defpackage.rf0
    public final void a(cg0 cg0Var, cg0 cg0Var2) {
        he1 he1Var;
        boolean z;
        he1 he1Var2;
        boolean z2;
        if (cg0Var != null) {
            cg0 cg0Var3 = cg0Var;
            if (!cg0Var3.e.r) {
                vp0.b("visitAncestors called on an unattached node");
            }
            t71 t71Var = cg0Var3.e;
            ax0 ax0VarV = qx.V(cg0Var);
            x91 x91Var = null;
            ArrayList arrayList = null;
            while (ax0VarV != null) {
                if ((ax0VarV.I.f.h & 2097152) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & 2097152) != 0) {
                            t71 t71VarP = t71Var;
                            fa1 fa1Var = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof mp0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(t71VarP);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (t71VarP.g & 2097152) != 0 && (t71VarP instanceof c40)) {
                                    int i = 0;
                                    for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                        if ((t71Var2.g & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                t71VarP = t71Var2;
                                            } else {
                                                if (fa1Var == null) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var.b(t71Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var);
                            }
                        }
                        t71Var = t71Var.i;
                    }
                }
                ax0VarV = ax0VarV.u();
                t71Var = (ax0VarV == null || (he1Var2 = ax0VarV.I) == null) ? null : he1Var2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (cg0Var2 != null) {
                if (!cg0Var2.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71 t71Var3 = cg0Var2.e;
                ax0 ax0VarV2 = qx.V(cg0Var2);
                x91 x91Var2 = null;
                while (ax0VarV2 != null) {
                    if ((ax0VarV2.I.f.h & 2097152) != 0) {
                        while (t71Var3 != null) {
                            if ((t71Var3.g & 2097152) != 0) {
                                t71 t71VarP2 = t71Var3;
                                fa1 fa1Var2 = null;
                                while (t71VarP2 != null) {
                                    if (t71VarP2 instanceof mp0) {
                                        if (x91Var2 == null) {
                                            x91 x91Var3 = kx1.a;
                                            x91Var2 = new x91();
                                        }
                                        x91Var2.a(t71VarP2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (t71VarP2.g & 2097152) != 0 && (t71VarP2 instanceof c40)) {
                                        int i2 = 0;
                                        for (t71 t71Var4 = ((c40) t71VarP2).t; t71Var4 != null; t71Var4 = t71Var4.j) {
                                            if ((t71Var4.g & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    t71VarP2 = t71Var4;
                                                } else {
                                                    if (fa1Var2 == null) {
                                                        fa1Var2 = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP2 != null) {
                                                        fa1Var2.b(t71VarP2);
                                                        t71VarP2 = null;
                                                    }
                                                    fa1Var2.b(t71Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    t71VarP2 = qx.P(fa1Var2);
                                }
                            }
                            t71Var3 = t71Var3.i;
                        }
                    }
                    ax0VarV2 = ax0VarV2.u();
                    t71Var3 = (ax0VarV2 == null || (he1Var = ax0VarV2.I) == null) ? null : he1Var.e;
                }
                x91Var = x91Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                mp0 mp0Var = (mp0) arrayList.get(i3);
                if (!(x91Var != null ? x91Var.c(mp0Var) : false)) {
                    mp0Var.z();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        cg0 cg0Var = ((vf0) getFocusOwner()).c;
        if (!cg0Var.r) {
            return;
        }
        if (!cg0Var.e.r) {
            vp0.b("visitSubtreeIf called on an unattached node");
        }
        fa1 fa1Var = new fa1(new t71[16]);
        t71 t71Var = cg0Var.e;
        t71 t71Var2 = t71Var.j;
        if (t71Var2 == null) {
            qx.j(fa1Var, t71Var);
        } else {
            fa1Var.b(t71Var2);
        }
        while (true) {
            int i3 = fa1Var.g;
            if (i3 == 0) {
                return;
            }
            t71 t71Var3 = (t71) fa1Var.k(i3 - 1);
            if ((t71Var3.h & 1024) != 0) {
                for (t71 t71Var4 = t71Var3; t71Var4 != null && t71Var4.r; t71Var4 = t71Var4.j) {
                    if ((t71Var4.g & 1024) != 0) {
                        t71 t71VarP = t71Var4;
                        fa1 fa1Var2 = null;
                        while (t71VarP != null) {
                            int i4 = 0;
                            if (t71VarP instanceof cg0) {
                                cg0 cg0Var2 = (cg0) t71VarP;
                                if (cg0Var2.r && cg0Var2.H0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    cg0 cg0Var3 = ((vf0) getFocusOwner()).c;
                                    if (cg0Var3.r) {
                                        if (!cg0Var3.e.r) {
                                            vp0.b("visitSubtreeIf called on an unattached node");
                                        }
                                        fa1 fa1Var3 = new fa1(new t71[16]);
                                        t71 t71Var5 = cg0Var3.e;
                                        t71 t71Var6 = t71Var5.j;
                                        if (t71Var6 == null) {
                                            qx.j(fa1Var3, t71Var5);
                                        } else {
                                            fa1Var3.b(t71Var6);
                                        }
                                        while (true) {
                                            int i5 = fa1Var3.g;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            t71 t71Var7 = (t71) fa1Var3.k(i5 - 1);
                                            if ((t71Var7.h & 1024) != 0) {
                                                for (t71 t71Var8 = t71Var7; t71Var8 != null && t71Var8.r; t71Var8 = t71Var8.j) {
                                                    if ((t71Var8.g & 1024) != 0) {
                                                        t71 t71VarP2 = t71Var8;
                                                        fa1 fa1Var4 = null;
                                                        while (t71VarP2 != null) {
                                                            if (t71VarP2 instanceof cg0) {
                                                                cg0 cg0Var4 = (cg0) t71VarP2;
                                                                if (cg0Var4.r) {
                                                                    wf0 wf0VarH0 = cg0Var4.H0();
                                                                    if (cg0Var4.r && wf0VarH0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((t71VarP2.g & 1024) != 0 && (t71VarP2 instanceof c40)) {
                                                                int i6 = 0;
                                                                for (t71 t71Var9 = ((c40) t71VarP2).t; t71Var9 != null; t71Var9 = t71Var9.j) {
                                                                    if ((t71Var9.g & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            t71VarP2 = t71Var9;
                                                                        } else {
                                                                            if (fa1Var4 == null) {
                                                                                fa1Var4 = new fa1(new t71[16]);
                                                                            }
                                                                            if (t71VarP2 != null) {
                                                                                fa1Var4.b(t71VarP2);
                                                                                t71VarP2 = null;
                                                                            }
                                                                            fa1Var4.b(t71Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            t71VarP2 = qx.P(fa1Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            qx.j(fa1Var3, t71Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                for (t71 t71Var10 = ((c40) t71VarP).t; t71Var10 != null; t71Var10 = t71Var10.j) {
                                    if ((t71Var10.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            t71VarP = t71Var10;
                                        } else {
                                            if (fa1Var2 == null) {
                                                fa1Var2 = new fa1(new t71[16]);
                                            }
                                            if (t71VarP != null) {
                                                fa1Var2.b(t71VarP);
                                                t71VarP = null;
                                            }
                                            fa1Var2.b(t71Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            t71VarP = qx.P(fa1Var2);
                        }
                    }
                }
            }
            qx.j(fa1Var, t71Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        i02 i02VarW;
        ej0 ej0Var;
        ej0 ej0Var2;
        if (f()) {
            h4 h4Var = this.Q;
            if (h4Var != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueG = a1.g(sparseArray.get(iKeyAt));
                    ax0 ax0Var = (ax0) h4Var.f.c.b(iKeyAt);
                    if (ax0Var != null && (i02VarW = ax0Var.w()) != null) {
                        w91 w91Var = i02VarW.e;
                        Object objG = w91Var.g(h02.g);
                        if (objG == null) {
                            objG = null;
                        }
                        p0 p0Var = (p0) objG;
                        if (p0Var != null && (ej0Var2 = (ej0) p0Var.b) != null) {
                        }
                        Object objG2 = w91Var.g(h02.h);
                        p0 p0Var2 = (p0) (objG2 != null ? objG2 : null);
                        if (p0Var2 != null && (ej0Var = (ej0) p0Var2.b) != null) {
                        }
                    }
                }
            }
            e4 e4Var = this.P;
            if (e4Var != null) {
                rf rfVar = (rf) e4Var.f;
                if (rfVar.a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int iKeyAt2 = sparseArray.keyAt(i2);
                    AutofillValue autofillValueG2 = a1.g(sparseArray.get(iKeyAt2));
                    if (autofillValueG2.isText()) {
                        autofillValueG2.getTextValue().toString();
                        if (rfVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                            fu1.c();
                            return;
                        }
                    } else {
                        if (autofillValueG2.isDate()) {
                            throw new we1("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueG2.isList()) {
                            throw new we1("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueG2.isToggle()) {
                            throw new we1("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.e30
    public final void b(y11 y11Var) {
        d21 d21Var = this.k;
        if (d21Var != null) {
            t51 t51Var = (t51) d21Var.a.f;
            if (t51Var.e && !t51Var.g) {
                pm pmVar = d21Var.d;
                if (pmVar != null) {
                    pmVar.cancel();
                }
                d21Var.d = null;
                return;
            }
            if (t51Var.f) {
                return;
            }
            if (!t51Var.g) {
                dp1.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!t51Var.h.i()) {
                dp1.a("Attempted to start retaining exited values with pending exited values");
            }
            t51Var.g = false;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.D.h(false, i, this.f);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.D.h(true, i, this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        p91 p91Var = this.I;
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        v(true);
        x62.h().m();
        this.K = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            vm vmVar = this.w;
            j4 j4Var = vmVar.a;
            Canvas canvas2 = j4Var.a;
            j4Var.a = canvas;
            getRoot().i(j4Var, null);
            vmVar.a.a = canvas2;
            if (p91Var.i()) {
                int i = p91Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((dl0) ((zi1) p91Var.f(i2))).g();
                }
            }
            int i3 = rn2.e;
            p91Var.d();
            this.K = false;
            Trace.endSection();
            p91 p91Var2 = this.J;
            if (p91Var2 != null) {
                p91Var.b(p91Var2);
                p91Var2.d();
            }
            if (p()) {
                ic.a(this, this.D0);
                View view = this.p;
                if (view != null) {
                    ic.a(view, this.E0);
                    if (!Float.isNaN(this.E0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.D0 = Float.NaN;
                this.E0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e5.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.H0;
        n4 n4Var = this.G0;
        if (z) {
            removeCallbacks(n4Var);
            n4Var.run();
        }
        if (!q(motionEvent) && isAttachedToWindow()) {
            k5 k5Var = this.D;
            e5 e5Var = k5Var.h;
            AccessibilityManager accessibilityManager = k5Var.k;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    e5Var.v(true);
                    vm0 vm0Var = new vm0();
                    ax0 root = e5Var.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    he1 he1Var = root.I;
                    me1 me1Var = he1Var.d;
                    bu1 bu1Var = me1.Q;
                    he1Var.d.X0(me1.U, me1Var.P0(jFloatToRawIntBits), vm0Var, 1, true);
                    p91 p91Var = vm0Var.e;
                    int i2 = p91Var.b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                        Object objF = p91Var.f(i2);
                        objF.getClass();
                        ax0 ax0VarV = qx.V((t71) objF);
                        if (e5Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(ax0VarV) != null) {
                            fu1.c();
                            return false;
                        }
                        if (ax0VarV.I.c(8)) {
                            int iV = k5Var.v(ax0VarV.f);
                            p02 p02VarA = r02.a(ax0VarV, false);
                            if (j20.w(p02VarA)) {
                                if (!p02VarA.k().e.c(u02.B)) {
                                    i = iV;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2--;
                    }
                    e5Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = k5Var.i;
                    if (i3 != i) {
                        k5Var.i = i;
                        k5.z(k5Var, i, 128, null, 12);
                        k5.z(k5Var, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = k5Var.i;
                    if (i4 == Integer.MIN_VALUE) {
                        e5Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        k5Var.i = Integer.MIN_VALUE;
                        k5.z(k5Var, Integer.MIN_VALUE, 128, null, 12);
                        k5.z(k5Var, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && r(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.z0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.z0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.H0 = true;
                        postDelayed(n4Var, 8L);
                        return false;
                    }
                } else if ((m(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (s(motionEvent)) {
                if ((m(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((vf0) getFocusOwner()).d(keyEvent, new v4(i, this, keyEvent));
        }
        x01 x01Var = getComposeViewContext().s;
        to2.a.setValue(new bo1(keyEvent.getMetaState()));
        return ((vf0) getFocusOwner()).d(keyEvent, wv.m) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        he1 he1Var;
        if (isFocused()) {
            vf0 vf0Var = (vf0) getFocusOwner();
            if (vf0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                cg0 cg0VarO = ux.o(vf0Var.c);
                if (cg0VarO != null) {
                    if (!cg0VarO.e.r) {
                        vp0.b("visitAncestors called on an unattached node");
                    }
                    t71 t71Var = cg0VarO.e;
                    ax0 ax0VarV = qx.V(cg0VarO);
                    while (ax0VarV != null) {
                        if ((ax0VarV.I.f.h & 131072) != 0) {
                            while (t71Var != null) {
                                if ((t71Var.g & 131072) != 0) {
                                    t71 t71VarP = t71Var;
                                    fa1 fa1Var = null;
                                    while (t71VarP != null) {
                                        if ((t71VarP.g & 131072) != 0 && (t71VarP instanceof c40)) {
                                            int i = 0;
                                            for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                                if ((t71Var2.g & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        t71VarP = t71Var2;
                                                    } else {
                                                        if (fa1Var == null) {
                                                            fa1Var = new fa1(new t71[16]);
                                                        }
                                                        if (t71VarP != null) {
                                                            fa1Var.b(t71VarP);
                                                            t71VarP = null;
                                                        }
                                                        fa1Var.b(t71Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        t71VarP = qx.P(fa1Var);
                                    }
                                }
                                t71Var = t71Var.i;
                            }
                        }
                        ax0VarV = ax0VarV.u();
                        t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            l5.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object gfVar;
        cg0 cg0VarF;
        if (this.H0) {
            n4 n4Var = this.G0;
            removeCallbacks(n4Var);
            MotionEvent motionEvent2 = this.z0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.H0 = false;
            } else {
                n4Var.run();
            }
        }
        if (!q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || s(motionEvent))) {
            int iM = m(motionEvent);
            if ((iM & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (gfVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    gfVar = new gf(1);
                }
                if (gfVar.equals(new gf(1)) && (cg0VarF = ((vf0) getFocusOwner()).f()) != null) {
                    me1 me1VarU = qx.U(cg0VarF);
                    if (!sv.A(me1VarU).K(me1VarU, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((vf0) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iM & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return k(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        yr1 yr1VarA;
        if (view == null || this.c0.a) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus != null && !viewFindNextFocus.equals(this)) {
            ViewParent parent = viewFindNextFocus.getParent();
            while (true) {
                if (parent == null) {
                    viewFindNextFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        } else {
            viewFindNextFocus = null;
            break;
        }
        if (view == this) {
            cg0 cg0VarO = ux.o(((vf0) getFocusOwner()).c);
            yr1VarA = cg0VarO != null ? ux.p(cg0VarO) : null;
            if (yr1VarA == null) {
                yr1VarA = pf0.a(view, this);
            }
        } else {
            yr1VarA = pf0.a(view, this);
        }
        lf0 lf0VarB = pf0.b(i);
        int i2 = lf0VarB != null ? lf0VarB.a : 6;
        gs1 gs1Var = new gs1();
        if (((vf0) getFocusOwner()).e(i2, yr1VarA, new w4(gs1Var, 0)) == null) {
            return view;
        }
        Object obj = gs1Var.e;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || y12.p(ux.p((cg0) obj), pf0.a(viewFindNextFocus, this), yr1VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final ea getAndroidViewsHandler$ui() {
        if (this.W == null) {
            ea eaVar = new ea(getContext());
            this.W = eaVar;
            addView(eaVar, -1);
            requestLayout();
        }
        ea eaVar2 = this.W;
        eaVar2.getClass();
        return eaVar2;
    }

    public jf getAutofill() {
        return this.P;
    }

    public qf getAutofillManager() {
        return this.Q;
    }

    public rf getAutofillTree() {
        return this.H;
    }

    public final av getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.M0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.N.getValue();
    }

    public final a6 getContentCaptureManager$ui() {
        return this.E;
    }

    public uy getCoroutineContext() {
        return this.r;
    }

    public m40 getDensity() {
        return (m40) this.o.getValue();
    }

    public yr1 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            cg0 cg0VarO = ux.o(((vf0) getFocusOwner()).c);
            if (cg0VarO != null) {
                return ux.p(cg0VarO);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return pf0.a(viewFindFocus, this);
        }
        return null;
    }

    public sf0 getFocusOwner() {
        return this.q;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        yr1 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (ws0.j(((vf0) getFocusOwner()).e(6, null, x4.g), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public jg0 getFontFamilyResolver() {
        return (jg0) this.t0.getValue();
    }

    public ig0 getFontLoader() {
        return this.s0;
    }

    public final c21 getFrameEndScheduler$ui() {
        return this.j;
    }

    public zk0 getGraphicsContext() {
        return this.G;
    }

    public yl0 getHapticFeedBack() {
        return this.v0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((ud) this.c0.d).p() || !this.m.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public gq0 getInputModeManager() {
        return this.w0;
    }

    public final nq0 getInsetsListener() {
        return this.y;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.i0;
    }

    @Override // android.view.View, android.view.ViewParent
    public kw0 getLayoutDirection() {
        return (kw0) this.u0.getValue();
    }

    public q31 getLocaleList() {
        return (q31) this.O.getValue();
    }

    public long getMeasureIteration() {
        if (this.c0.a) {
            return 1L;
        }
        vp0.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public v71 getModifierLocalManager() {
        return this.x0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public e5 m8getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public im1 getPlacementScope() {
        int i = km1.b;
        return new y41(1, this);
    }

    public vn1 getPointerIconService() {
        return this.P0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final cp0 m1getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.h;
    }

    public as1 getRectManager() {
        return this.B;
    }

    public zt1 getRetainedValuesStore() {
        return this.l;
    }

    public ax0 getRoot() {
        return this.z;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        px1 px1Var;
        if (Build.VERSION.SDK_INT < 31 || (px1Var = this.N0) == null) {
            return false;
        }
        return ((Boolean) px1Var.a.getValue()).booleanValue();
    }

    public t02 getSemanticsOwner() {
        return this.C;
    }

    public cx0 getSharedDrawScope() {
        return this.i;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? ec.a.a(this) : this.V;
    }

    public cj1 getSnapshotObserver() {
        return this.U;
    }

    public l72 getSoftwareKeyboardController() {
        e40 e40Var = this.r0;
        if (e40Var != null) {
            return e40Var;
        }
        e40 e40Var2 = new e40(getTextInputService());
        this.r0 = e40Var2;
        return e40Var2;
    }

    public ye2 getTextInputService() {
        ye2 ye2Var = this.p0;
        if (ye2Var != null) {
            return ye2Var;
        }
        ye2 ye2Var2 = new ye2(getLegacyTextInputServiceAndroid());
        this.p0 = ye2Var2;
        return ye2Var2;
    }

    public wf2 getTextToolbar() {
        return this.y0;
    }

    public final ev1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public on2 getViewConfiguration() {
        return this.x;
    }

    public final s4 getViewTreeOwners() {
        k3.v(this.m0.getValue());
        return null;
    }

    public so2 getWindowInfo() {
        return getComposeViewContext().s;
    }

    public final h4 get_autofillManager$ui() {
        return this.Q;
    }

    @Override // defpackage.e30
    public final void h(y11 y11Var) {
        pm pmVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(j20.t());
        }
        d21 d21Var = this.k;
        if (d21Var != null) {
            c21 c21Var = this.j;
            c21Var.getClass();
            t51 t51Var = (t51) d21Var.a.f;
            if (!t51Var.e || t51Var.g) {
                return;
            }
            try {
                pmVarS = ((dr2) c21Var).a.s(new h8(8, d21Var));
            } catch (CancellationException unused) {
                if (!t51Var.f) {
                    if (t51Var.g) {
                        dp1.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    t51Var.a();
                    t51Var.g = true;
                }
                pmVarS = null;
            }
            pm pmVar = d21Var.d;
            if (pmVar != null) {
                pmVar.cancel();
            }
            d21Var.d = pmVarS;
        }
    }

    public final void l(ax0 ax0Var, boolean z) {
        this.c0.h(ax0Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    public final int m(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        e5 e5Var;
        removeCallbacks(this.F0);
        try {
            D(motionEvent);
            this.j0 = true;
            v(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.z0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                jp jpVar = this.M;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!jpVar.a) {
                                t41 t41Var = (t41) ((qk1) jpVar.d).f;
                                int i = t41Var.h;
                                Object[] objArr = t41Var.g;
                                for (int i2 = 0; i2 < i; i2++) {
                                    objArr[i2] = null;
                                }
                                t41Var.h = 0;
                                t41Var.e = false;
                                ((sm0) jpVar.c).c();
                            }
                        } else if (motionEvent3.getActionMasked() == 10 || !z) {
                            motionEvent2 = motionEvent3;
                        } else {
                            I(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    motionEvent2 = motionEvent3;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !r(motionEvent)) {
                    e5Var = this;
                } else {
                    e5Var = this;
                    e5Var.I(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = e5Var.z0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = e5Var.z0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    d81 d81Var = e5Var.L;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            d81Var.c.delete(pointerId);
                            d81Var.b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = e5Var.z0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = e5Var.z0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = e5Var.z0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                d81Var.c.delete(pointerId);
                                d81Var.b.delete(pointerId);
                            }
                            sm0 sm0Var = (sm0) jpVar.c;
                            if (sm0Var.d) {
                                sm0Var.d = true;
                            } else {
                                sm0Var.g.a.g();
                            }
                        }
                    }
                }
                e5Var.z0 = MotionEvent.obtainNoHistory(motionEvent);
                int iH = H(motionEvent);
                Trace.endSection();
                e5Var.j0 = false;
                return iH;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.j0 = false;
            throw th3;
        }
    }

    public final void o(ax0 ax0Var) {
        this.c0.w(ax0Var, false);
        fa1 fa1VarZ = ax0Var.z();
        Object[] objArr = fa1VarZ.e;
        int i = fa1VarZ.g;
        for (int i2 = 0; i2 < i; i2++) {
            o((ax0) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        zt1 zt1Var;
        Object obj;
        e4 e4Var;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(j20.t());
        }
        this.y.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (U0 == null) {
                p4 p4Var = new p4();
                U0 = p4Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (Q0 == null) {
                        Q0 = Class.forName("android.os.SystemProperties");
                    }
                    Method declaredMethod = S0;
                    if (declaredMethod == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = Q0;
                        declaredMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        S0 = declaredMethod;
                    }
                    if (declaredMethod != null) {
                        declaredMethod.invoke(null, p4Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            p91 p91Var = T0;
            synchronized (p91Var) {
                p91Var.a(this);
            }
        }
        if (!this.M0) {
            getComposeViewContext().c();
        }
        this.M0 = false;
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().a.d();
        if (f() && (e4Var = this.P) != null) {
            lf lfVar = lf.a;
            lfVar.getClass();
            ((AutofillManager) e4Var.g).registerCallback(a1.e(lfVar));
        }
        y11 y11Var = getComposeViewContext().c;
        co2 co2Var = getComposeViewContext().e;
        c21 c21Var = this.j;
        if (y11Var == null || co2Var == null || c21Var == null) {
            zt1Var = null;
        } else {
            bo2 bo2VarG = co2Var.g();
            zn2 zn2Var = new zn2();
            jz jzVar = jz.b;
            jzVar.getClass();
            e4 e4Var2 = new e4(bo2VarG, zn2Var, jzVar);
            aq aqVarA = js1.a(e21.class);
            String strB = aqVarA.b();
            if (strB == null) {
                qj.r("Local and anonymous classes can not be ViewModels");
                return;
            }
            e21 e21Var = (e21) e4Var2.j(aqVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            d91 d91Var = e21Var.b;
            Object objB = d91Var.b(id);
            if (objB == null) {
                objB = new p91(1);
                d91Var.h(id, objB);
            }
            p91 p91Var2 = (p91) objB;
            Object[] objArr = p91Var2.a;
            int i3 = p91Var2.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((d21) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            d21 d21Var = (d21) obj;
            if (d21Var == null) {
                d21Var = new d21();
                p91Var2.a(d21Var);
            }
            d21Var.c = true;
            this.k = d21Var;
            zt1Var = d21Var.b;
        }
        if (zt1Var == null) {
            zt1Var = q90.M;
        }
        this.l = zt1Var;
        ej0 ej0Var = this.n0;
        if (ej0Var != null) {
            ej0Var.h(getComposeViewContext());
            this.n0 = null;
        }
        b21 b21VarH = getComposeViewContext().c.h();
        b21VarH.a(this);
        b21VarH.a(this.E);
        this.w0.a.setValue(new fq0(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            p5.a.b(this);
        }
        h4 h4Var = this.Q;
        if (h4Var != null) {
            ((vf0) getFocusOwner()).g.a(h4Var);
            getSemanticsOwner().d.a(h4Var);
        }
        ((vf0) getFocusOwner()).g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        y22 y22Var = (y22) this.q0.get();
        j8 j8Var = (j8) (y22Var != null ? y22Var.b : null);
        if (j8Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        y22 y22Var2 = (y22) j8Var.h.get();
        eq0 eq0Var = (eq0) (y22Var2 != null ? y22Var2.b : null);
        return eq0Var != null && (eq0Var.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        K(configuration);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fe  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection af1Var;
        int i;
        int i2;
        int i3;
        int i4;
        y22 y22Var = (y22) this.q0.get();
        j8 j8Var = (j8) (y22Var != null ? y22Var.b : null);
        if (j8Var != null) {
            y22 y22Var2 = (y22) j8Var.h.get();
            eq0 eq0Var = (eq0) (y22Var2 != null ? y22Var2.b : null);
            if (eq0Var == null) {
                return null;
            }
            synchronized (eq0Var.c) {
                if (eq0Var.e) {
                    return null;
                }
                vr1 vr1VarA = eq0Var.a.a(editorInfo);
                y3 y3Var = new y3(15, eq0Var);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 34) {
                    af1Var = new bf1(vr1VarA, y3Var);
                } else {
                    af1Var = i5 >= 25 ? new af1(vr1VarA, y3Var) : new ze1(vr1VarA, y3Var);
                }
                eq0Var.d.b(new lo2(af1Var));
                return af1Var;
            }
        }
        af2 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        oo0 oo0Var = legacyTextInputServiceAndroid.h;
        te2 te2Var = legacyTextInputServiceAndroid.g;
        int i6 = oo0Var.e;
        boolean z = oo0Var.a;
        if (i6 == 1) {
            i = z ? 6 : 0;
        } else if (i6 == 0) {
            i = 1;
        } else if (i6 == 2) {
            i = 2;
        } else if (i6 == 6) {
            i = 5;
        } else if (i6 == 5) {
            i = 7;
        } else if (i6 == 3) {
            i = 3;
        } else if (i6 == 4) {
            i = 4;
        } else {
            if (i6 != 7) {
                fu1.h("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i7 = oo0Var.d;
        int i8 = 17;
        if (i7 != 1) {
            if (i7 == 2) {
                editorInfo.inputType = 1;
                i |= Integer.MIN_VALUE;
                editorInfo.imeOptions = i;
            } else if (i7 == 3) {
                editorInfo.inputType = 2;
                i2 = 2;
            } else if (i7 == 4) {
                editorInfo.inputType = 3;
                i2 = 3;
            } else if (i7 == 5) {
                editorInfo.inputType = 17;
                i2 = 17;
            } else if (i7 == 6) {
                i2 = 33;
                editorInfo.inputType = 33;
            } else if (i7 == 7) {
                i2 = 129;
                editorInfo.inputType = 129;
            } else if (i7 == 8) {
                i2 = 18;
                editorInfo.inputType = 18;
            } else {
                if (i7 != 9) {
                    fu1.h("Invalid Keyboard Type");
                    return null;
                }
                i2 = 8194;
                editorInfo.inputType = 8194;
            }
            i3 = i2;
            if (!z && (i2 & 1) == 1) {
                i3 |= 131072;
                editorInfo.inputType = i3;
                if (i6 == 1) {
                    editorInfo.imeOptions = 1073741824 | i;
                }
            }
            if ((i3 & 1) == 1) {
                i4 = oo0Var.b;
                if (i4 == 1) {
                    i3 |= 4096;
                    editorInfo.inputType = i3;
                } else if (i4 == 2) {
                    i3 |= 8192;
                    editorInfo.inputType = i3;
                } else if (i4 == 3) {
                    i3 |= 16384;
                    editorInfo.inputType = i3;
                }
                if (oo0Var.c) {
                    editorInfo.inputType = 32768 | i3;
                }
            }
            long j = te2Var.b;
            int i9 = of2.c;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            sv.T(editorInfo, te2Var.a.f);
            editorInfo.imeOptions |= 33554432;
            if (ca0.d()) {
                ca0.a().i(editorInfo);
            }
            ur1 ur1Var = new ur1(legacyTextInputServiceAndroid.g, new qk1(i8, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
            legacyTextInputServiceAndroid.i.add(new WeakReference(ur1Var));
            return ur1Var;
        }
        editorInfo.inputType = 1;
        i2 = 1;
        i3 = i2;
        if (!z) {
            i3 |= 131072;
            editorInfo.inputType = i3;
            if (i6 == 1) {
                editorInfo.imeOptions = 1073741824 | i;
            }
        }
        if ((i3 & 1) == 1) {
            i4 = oo0Var.b;
            if (i4 == 1) {
                i3 |= 4096;
                editorInfo.inputType = i3;
            } else if (i4 == 2) {
                i3 |= 8192;
                editorInfo.inputType = i3;
            } else if (i4 == 3) {
                i3 |= 16384;
                editorInfo.inputType = i3;
            }
            if (oo0Var.c) {
                editorInfo.inputType = 32768 | i3;
            }
        }
        long j2 = te2Var.b;
        int i10 = of2.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        sv.T(editorInfo, te2Var.a.f);
        editorInfo.imeOptions |= 33554432;
        if (ca0.d()) {
            ca0.a().i(editorInfo);
        }
        ur1 ur1Var2 = new ur1(legacyTextInputServiceAndroid.g, new qk1(i8, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(ur1Var2));
        return ur1Var2;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        a6 a6Var = this.E;
        a6Var.getClass();
        x5.e(a6Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e4 e4Var;
        super.onDetachedFromWindow();
        setAttached(false);
        this.y.onViewDetachedFromWindow(this);
        View view = this.p;
        if (p() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            p91 p91Var = T0;
            synchronized (p91Var) {
                p91Var.j(this);
            }
        }
        getComposeViewContext().b();
        k72 k72Var = getSnapshotObserver().a;
        p2 p2Var = k72Var.h;
        if (p2Var != null) {
            p2Var.a();
        }
        k72Var.a();
        b21 b21VarH = getComposeViewContext().c.h();
        b21VarH.f(this.E);
        b21VarH.f(this);
        if (f() && (e4Var = this.P) != null) {
            lf lfVar = lf.a;
            lfVar.getClass();
            ((AutofillManager) e4Var.g).unregisterCallback(a1.e(lfVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        d21 d21Var = this.k;
        if (d21Var != null) {
            d21Var.c = false;
        }
        this.k = null;
        if (i >= 31) {
            p5.a.a(this);
        }
        h4 h4Var = this.Q;
        if (h4Var != null) {
            getSemanticsOwner().d.j(h4Var);
            ((vf0) getFocusOwner()).g.j(h4Var);
        }
        as1 rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        as1 rectManager2 = getRectManager();
        o4 o4Var = rectManager2.h;
        if (o4Var != null) {
            rectManager2.a.removeCallbacks(o4Var);
            rectManager2.h = null;
        }
        ((vf0) getFocusOwner()).g.j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        vf0 vf0Var = (vf0) getFocusOwner();
        qx.q(vf0Var.c, true);
        if (vf0Var.f() != null) {
            cg0 cg0VarF = vf0Var.f();
            vf0Var.i(null);
            if (cg0VarF != null) {
                cg0VarF.G0(bg0.e, bg0.g);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.i0 = 0L;
        L();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        K(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.i0 = 0L;
            this.c0.m(this.J0);
            this.a0 = null;
            L();
            if (this.W != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        t61 t61Var = this.c0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long jI = i(i);
            long jI2 = i(i2);
            long jV = rw.v((int) (jI >>> 32), (int) (jI & 4294967295L), (int) (jI2 >>> 32), (int) (4294967295L & jI2));
            sw swVar = this.a0;
            if (swVar == null) {
                this.a0 = new sw(jV);
                this.b0 = false;
            } else if (!sw.b(swVar.a, jV)) {
                this.b0 = true;
            }
            t61Var.y(jV);
            t61Var.o();
            setMeasuredDimension(getRoot().J.p.e, getRoot().J.p.f);
            if (this.W != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().J.p.e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().J.p.f, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!f() || viewStructure == null) {
            return;
        }
        h4 h4Var = this.Q;
        if (h4Var != null) {
            ax0 ax0Var = h4Var.f.a;
            AutofillId autofillId = h4Var.k;
            String str = h4Var.i;
            as1 as1Var = h4Var.h;
            ei1.F(viewStructure, ax0Var, autofillId, str, as1Var);
            Object[] objArr = ff1.a;
            p91 p91Var = new p91(2);
            p91Var.a(ax0Var);
            p91Var.a(viewStructure);
            while (p91Var.i()) {
                Object objK = p91Var.k(p91Var.b - 1);
                objK.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objK;
                Object objK2 = p91Var.k(p91Var.b - 1);
                objK2.getClass();
                n91 n91Var = (n91) ((ax0) objK2).n();
                int i2 = ((fa1) n91Var.f).g;
                for (int i3 = 0; i3 < i2; i3++) {
                    ax0 ax0Var2 = (ax0) n91Var.get(i3);
                    if (!ax0Var2.R && ax0Var2.H() && ax0Var2.I()) {
                        i02 i02VarW = ax0Var2.w();
                        if (i02VarW != null) {
                            w91 w91Var = i02VarW.e;
                            if (w91Var.b(h02.g) || w91Var.b(h02.h) || w91Var.b(u02.r) || w91Var.b(u02.s)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                ei1.F(viewStructureNewChild, ax0Var2, h4Var.k, str, as1Var);
                                p91Var.a(ax0Var2);
                                p91Var.a(viewStructureNewChild);
                            } else {
                                p91Var.a(ax0Var2);
                                p91Var.a(viewStructure2);
                            }
                        } else {
                            p91Var.a(ax0Var2);
                            p91Var.a(viewStructure2);
                        }
                    }
                }
            }
        }
        e4 e4Var = this.P;
        if (e4Var != null) {
            rf rfVar = (rf) e4Var.f;
            LinkedHashMap linkedHashMap = rfVar.a;
            LinkedHashMap linkedHashMap2 = rfVar.a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    fu1.c();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId((AutofillId) e4Var.h, iIntValue);
                viewStructureNewChild2.setId(iIntValue, ((e5) e4Var.e).getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        un1 un1Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (un1Var = ((z4) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return un1Var instanceof k8 ? PointerIcon.getSystemIcon(context, ((k8) un1Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        kw0 kw0Var;
        if (this.g) {
            int[] iArr = pf0.a;
            kw0 kw0Var2 = kw0.e;
            if (i != 0) {
                kw0Var = i != 1 ? null : kw0.f;
            } else {
                kw0Var = kw0Var2;
            }
            if (kw0Var != null) {
                kw0Var2 = kw0Var;
            }
            setLayoutDirection(kw0Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        px1 px1Var;
        if (Build.VERSION.SDK_INT < 31 || (px1Var = this.N0) == null) {
            return;
        }
        px1Var.a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        L();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.w0.a.setValue(new fq0(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        a6 a6Var = this.E;
        a6Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (ws0.j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            x5.b(a6Var, longSparseArray);
        } else {
            a6Var.e.post(new w5(0, a6Var, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zT;
        this.L0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zT = j20.t())) {
            return;
        }
        setShowLayoutBounds(zT);
        n(getRoot());
    }

    public final boolean r(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            lf0 lf0VarB = pf0.b(i);
            int i3 = lf0VarB != null ? lf0VarB.a : 7;
            Boolean boolE = ((vf0) getFocusOwner()).e(i3, rect != null ? new yr1(rect.left, rect.top, rect.right, rect.bottom) : null, new a5(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!ws0.j(boolE, bool)) {
                if (!ws0.j(((vf0) getFocusOwner()).e(i3, null, new a5(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((vf0) getFocusOwner()).h(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.z0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.D.l = j;
    }

    public final void setComposeViewContext(av avVar) {
        if (getCoroutineContext() != avVar.b.j() && !((n91) getRoot().n()).isEmpty()) {
            vp0.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        o62 o62VarJ = c12.j();
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            av avVar2 = get_composeViewContext();
            c12.s(o62VarJ, o62VarP, ej0VarE);
            if (avVar != avVar2) {
                if (isAttachedToWindow()) {
                    avVar2.b();
                    avVar.c();
                }
                set_composeViewContext(avVar);
                setCoroutineContext(avVar.b.j());
            }
        } catch (Throwable th) {
            c12.s(o62VarJ, o62VarP, ej0VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.M0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.N.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(a6 a6Var) {
        this.E = a6Var;
    }

    public void setCoroutineContext(uy uyVar) {
        this.r = uyVar;
    }

    public final void setFrameEndScheduler$ui(c21 c21Var) {
        this.j = c21Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.i0 = j;
    }

    public final void setOnReadyForComposition(ej0 ej0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.M0) {
            ej0Var.h(getComposeViewContext());
        } else {
            this.n0 = ej0Var;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m2setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(cp0 cp0Var) {
        this.h = cp0Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.V = z;
    }

    public void setUncaughtExceptionHandler(ev1 ev1Var) {
        this.c0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(float[] fArr) {
        C();
        q61.e(fArr, this.g0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.k0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.k0 & 4294967295L));
        float[] fArr2 = this.f0;
        q61.d(fArr2);
        q61.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        s5.K(fArr, fArr2);
    }

    public final long u(long j) {
        C();
        long jB = q61.b(j, this.g0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.k0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.k0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public final void v(boolean z) {
        u4 u4Var;
        t61 t61Var = this.c0;
        if (((ud) t61Var.d).p() || ((fa1) ((dq0) t61Var.e).f).g != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    u4Var = this.J0;
                } finally {
                    Trace.endSection();
                }
            } else {
                u4Var = null;
            }
            if (t61Var.m(u4Var)) {
                requestLayout();
            }
            t61Var.c(false);
            getRectManager().a();
        }
    }

    public final void w(ax0 ax0Var, long j) {
        t61 t61Var = this.c0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            t61Var.n(ax0Var, j);
            if (!((ud) t61Var.d).p()) {
                t61Var.c(false);
                getRectManager().a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void x() {
        p91 p91Var;
        h4 h4Var;
        Object[] objArr;
        if (this.R) {
            k72 k72Var = getSnapshotObserver().a;
            synchronized (k72Var.g) {
                try {
                    fa1 fa1Var = k72Var.f;
                    int i = fa1Var.g;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = fa1Var.e;
                        if (i2 >= i) {
                            break;
                        }
                        j72 j72Var = (j72) objArr[i2];
                        j72Var.d();
                        if (!j72Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = fa1Var.e;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    fa1Var.g = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.R = false;
        }
        ea eaVar = this.W;
        if (eaVar != null) {
            g(eaVar);
        }
        if (f() && (h4Var = this.Q) != null) {
            e91 e91Var = h4Var.l;
            if (e91Var.d == 0 && h4Var.m) {
                ((AutofillManager) h4Var.e.f).commit();
                h4Var.m = false;
            }
            if (e91Var.d != 0) {
                h4Var.m = true;
            }
        }
        while (this.C0.i() && this.C0.f(0) != null) {
            int i5 = this.C0.b;
            int i6 = 0;
            while (true) {
                p91Var = this.C0;
                if (i6 < i5) {
                    ti0 ti0Var = (ti0) p91Var.f(i6);
                    p91 p91Var2 = this.C0;
                    if (i6 < 0 || i6 >= p91Var2.b) {
                        p91Var2.n(i6);
                        throw null;
                    }
                    Object[] objArr3 = p91Var2.a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (ti0Var != null) {
                        ti0Var.a();
                    }
                    i6++;
                }
            }
            p91Var.l(0, i5);
        }
    }

    public final void y(ax0 ax0Var) {
        k5 k5Var = this.D;
        k5Var.B = true;
        if (k5Var.q()) {
            k5Var.r(ax0Var);
        }
        a6 a6Var = this.E;
        a6Var.j = true;
        if (a6Var.f()) {
            a6Var.k.c(ll2.a);
        }
    }

    public final void z(ax0 ax0Var, boolean z, boolean z2, boolean z3) {
        ax0 ax0VarU;
        ax0 ax0VarU2;
        t61 t61Var = this.c0;
        if (!z) {
            if (t61Var.w(ax0Var, z2) && z3) {
                F(ax0Var);
                return;
            }
            return;
        }
        ud udVar = (ud) t61Var.d;
        ax0 ax0Var2 = ax0Var.l;
        ex0 ex0Var = ax0Var.J;
        if (ax0Var2 == null) {
            vp0.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = ex0Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    qj.p();
                    return;
                }
                if (!ex0Var.e || z2) {
                    ex0Var.e = true;
                    ex0Var.p.y = true;
                    if (ax0Var.R) {
                        return;
                    }
                    if ((ws0.j(ax0Var.J(), Boolean.TRUE) || t61.j(ax0Var)) && ((ax0VarU = ax0Var.u()) == null || !ax0VarU.J.e)) {
                        udVar.a(ax0Var, dt0.e);
                    } else if ((ax0Var.I() || t61.k(ax0Var)) && ((ax0VarU2 = ax0Var.u()) == null || !ax0VarU2.q())) {
                        udVar.a(ax0Var, dt0.g);
                    }
                    if (t61Var.b || !z3) {
                        return;
                    }
                    F(ax0Var);
                    return;
                }
                return;
            }
        }
        ((fa1) t61Var.g).b(new s61(ax0Var, true, z2));
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public d4 m3getAccessibilityManager() {
        return this.F;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public l4 m4getClipboard() {
        return this.T;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public m4 m5getClipboardManager() {
        return this.S;
    }

    public r6 getDragAndDropManager() {
        return this.s;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public d91 m7getLayoutNodes() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @r40
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m0getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @r40
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public fv1 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(ev1 ev1Var) {
    }
}
