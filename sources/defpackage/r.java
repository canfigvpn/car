package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ir.alirezaivaz.mygarage.R;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r extends ViewGroup {
    public WeakReference e;
    public IBinder f;
    public cr2 g;
    public lv h;
    public av i;
    public mn2 j;
    public boolean k;
    public boolean l;
    public boolean m;

    public r(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        e7 e7Var = new e7(1, this);
        addOnAttachStateChangeListener(e7Var);
        fu1 fu1Var = new fu1(16);
        ix.D(this).a.add(fu1Var);
        this.j = new mn2(this, e7Var, fu1Var);
    }

    private final void setParentContext(lv lvVar) {
        if (this.h != lvVar) {
            this.h = lvVar;
            if (lvVar != null) {
                this.e = null;
            }
            cr2 cr2Var = this.g;
            if (cr2Var != null) {
                cr2Var.a();
                this.g = null;
                if (isAttachedToWindow()) {
                    g();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f != iBinder) {
            this.f = iBinder;
            this.e = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        d();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(int i, ak0 ak0Var);

    public final void c() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.i == null) {
                e5 e5Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof e5) {
                        e5Var = (e5) childAt;
                    }
                }
                if (e5Var != null) {
                    e5Var.setComposeViewContext(l(dv1.t(this), e5Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                g();
            }
        }
    }

    public final void d() {
        if (this.l) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void e() {
        av avVar;
        if (this.h != null || isAttachedToWindow() || ((avVar = this.i) != null && avVar.a.isAttachedToWindow())) {
            g();
        } else {
            fu1.h("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void f() {
        View childAt = getChildAt(0);
        e5 e5Var = childAt instanceof e5 ? (e5) childAt : null;
        if (e5Var != null && e5Var.M0) {
            e5Var.getComposeViewContext().b();
            e5Var.M0 = false;
        }
        cr2 cr2Var = this.g;
        if (cr2Var != null) {
            cr2Var.a();
        }
        this.g = null;
        requestLayout();
    }

    public final void g() {
        if (this.g == null) {
            int i = 0;
            try {
                this.l = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    av avVarJ = this.i;
                    if (avVarJ == null) {
                        avVarJ = j();
                    }
                    this.g = er2.a(this, avVarJ, new gt(new q(i, this), true, 1003123809));
                    Trace.endSection();
                    this.l = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.l = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m9getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        gf gfVar = tag instanceof gf ? (gf) tag : null;
        if (gfVar != null) {
            return gfVar.a;
        }
        return 1;
    }

    public final av getComposeViewContext$ui() {
        return this.i;
    }

    public final boolean getHasComposition() {
        return this.g != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.k;
    }

    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void i(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.m || super.isTransitionGroup();
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final av j() {
        av composeViewContext;
        co2 co2Var;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            e5 e5Var = childAt instanceof e5 ? (e5) childAt : null;
            if (e5Var != null) {
                composeViewContext = e5Var.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewT = dv1.t(this);
        av avVarV = dv1.v(viewT);
        if (avVarV != null) {
            return l(viewT, avVarV);
        }
        lv lvVarK = k();
        y11 y11VarE = c22.e(viewT);
        if (y11VarE == null) {
            y11VarE = composeViewContext != null ? composeViewContext.c : null;
            if (y11VarE == null) {
                fu1.h("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        y11 y11Var = y11VarE;
        tw1 tw1VarN = j02.n(viewT);
        if (tw1VarN == null) {
            tw1VarN = composeViewContext != null ? composeViewContext.d : null;
            if (tw1VarN == null) {
                fu1.h("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        tw1 tw1Var = tw1VarN;
        co2 co2VarJ = n02.j(viewT);
        if (co2VarJ == null) {
            co2Var = composeViewContext != null ? composeViewContext.e : null;
        } else {
            co2Var = co2VarJ;
        }
        av avVar = new av(dv1.v(dv1.t(viewT)), viewT, lvVarK, y11Var, tw1Var, co2Var);
        viewT.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(avVar));
        return avVar;
    }

    public final lv k() {
        rr1 rr1Var;
        uy uyVar;
        aa aaVar;
        Object objL;
        lv lvVarA = this.h;
        if (lvVarA == null) {
            lvVarA = vq2.a(this);
            if (lvVarA == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (lvVarA != null || !(objL instanceof View)) {
                        objL = parent;
                        break;
                    }
                    objL = parent;
                    View view = (View) objL;
                    lvVarA = vq2.a(view);
                    objL = y12.l(view);
                }
            }
            boolean z = false;
            if (lvVarA != null) {
                lv lvVar = (!(lvVarA instanceof rr1) || ((or1) ((rr1) lvVarA).u.getValue()).compareTo(or1.f) > 0) ? lvVarA : null;
                if (lvVar != null) {
                    this.e = new WeakReference(lvVar);
                }
            } else {
                lvVarA = null;
            }
            if (lvVarA == null) {
                WeakReference weakReference = this.e;
                if (weakReference == null || (lvVarA = (lv) weakReference.get()) == null || ((lvVarA instanceof rr1) && ((or1) ((rr1) lvVarA).u.getValue()).compareTo(or1.f) <= 0)) {
                    lvVarA = null;
                }
                if (lvVarA == null) {
                    if (!isAttachedToWindow()) {
                        vp0.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = y12.l(this);
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    lv lvVarA2 = vq2.a(view2);
                    if (lvVarA2 == null) {
                        ((pq2) qq2.a.get()).getClass();
                        uy uyVar2 = ab0.e;
                        hb2 hb2Var = y9.q;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            uyVar = (uy) y9.q.getValue();
                        } else {
                            uyVar = (uy) y9.r.get();
                            if (uyVar == null) {
                                fu1.h("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        uy uyVarK = uyVar.k(uyVar2);
                        aa aaVar2 = (aa) uyVarK.p(q90.R);
                        if (aaVar2 != null) {
                            aaVar = new aa(aaVar2);
                            ew0 ew0Var = (ew0) aaVar.g;
                            synchronized (ew0Var.b) {
                                ew0Var.a = false;
                            }
                        } else {
                            aaVar = null;
                        }
                        gs1 gs1Var = new gs1();
                        uy b81Var = (a81) uyVarK.p(q90.S);
                        if (b81Var == null) {
                            b81Var = new b81(view2.getContext().getApplicationContext());
                            gs1Var.e = b81Var;
                        }
                        if (aaVar != null) {
                            uyVar2 = aaVar;
                        }
                        uy uyVarK2 = uyVarK.k(uyVar2).k(b81Var);
                        rr1Var = new rr1(uyVarK2);
                        synchronized (rr1Var.c) {
                            rr1Var.t = true;
                        }
                        rx rxVarB = qx.b(uyVarK2);
                        y11 y11VarE = c22.e(view2);
                        b21 b21VarH = y11VarE != null ? y11VarE.h() : null;
                        if (b21VarH == null) {
                            vp0.c("ViewTreeLifecycleOwner not found from " + view2);
                            qj.e();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new rq2(view2, rr1Var));
                        b21VarH.a(new tq2(rxVarB, aaVar, rr1Var, gs1Var));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, rr1Var);
                        rk0 rk0Var = rk0.e;
                        Handler handler = view2.getHandler();
                        int i = vl0.a;
                        view2.addOnAttachStateChangeListener(new e7(2, nj2.y(rk0Var, new ul0(handler, "windowRecomposer cleanup", false).j, new cv1(9, z ? 1 : 0, rr1Var, view2), 2)));
                    } else {
                        if (!(lvVarA2 instanceof rr1)) {
                            fu1.h("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        rr1Var = (rr1) lvVarA2;
                    }
                    rr1 rr1Var2 = ((or1) rr1Var.u.getValue()).compareTo(or1.f) > 0 ? rr1Var : null;
                    if (rr1Var2 != null) {
                        this.e = new WeakReference(rr1Var2);
                    }
                    return rr1Var;
                }
            }
        }
        return lvVarA;
    }

    public final av l(View view, av avVar) {
        lv lvVarK = k();
        y11 y11VarE = c22.e(view);
        co2 co2VarJ = n02.j(view);
        tw1 tw1VarN = j02.n(view);
        lv lvVar = avVar.b;
        tw1 tw1Var = avVar.d;
        y11 y11Var = avVar.c;
        if (lvVarK == lvVar && y11VarE == y11Var && co2VarJ == avVar.e && tw1VarN == tw1Var) {
            return avVar;
        }
        if (lvVarK.j() != avVar.b.j()) {
            f();
        }
        if (y11VarE == null) {
            y11VarE = y11Var;
        }
        av avVar2 = new av(avVar, view, lvVarK, y11VarE, tw1VarN == null ? tw1Var : tw1VarN, co2VarJ);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(avVar2));
        return avVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w91 w91Var = vq2.a;
        Object objL = y12.l(this);
        View view = this;
        while (objL instanceof View) {
            View view2 = (View) objL;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objL = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new p(0, this));
        } else {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        g();
        i(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m10setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new gf(i));
    }

    public final void setComposeViewContext$ui(av avVar) {
        if (this.i != avVar) {
            if (avVar == null) {
                f();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                e5 e5Var = childAt instanceof e5 ? (e5) childAt : null;
                if (e5Var != null) {
                    if (e5Var.getCoroutineContext() != avVar.b.j()) {
                        f();
                    }
                    e5Var.setComposeViewContext(avVar);
                }
            }
            this.i = avVar;
        }
    }

    public final void setParentCompositionContext(lv lvVar) {
        setParentContext(lvVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.k = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((e5) ((aj1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.m = true;
    }

    public final void setViewCompositionStrategy(nn2 nn2Var) {
        mn2 mn2Var = this.j;
        if (mn2Var != null) {
            mn2Var.a();
        }
        ((j12) nn2Var).getClass();
        e7 e7Var = new e7(1, this);
        addOnAttachStateChangeListener(e7Var);
        fu1 fu1Var = new fu1(16);
        ix.D(this).a.add(fu1Var);
        this.j = new mn2(this, e7Var, fu1Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        d();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        d();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        d();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        d();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
