package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.ae1;
import defpackage.ao2;
import defpackage.be1;
import defpackage.ce1;
import defpackage.e90;
import defpackage.ei1;
import defpackage.fu1;
import defpackage.jp;
import defpackage.l50;
import defpackage.ln2;
import defpackage.pn2;
import defpackage.t0;
import defpackage.t90;
import defpackage.tx1;
import defpackage.vm2;
import defpackage.wm2;
import defpackage.yc0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout {
    public static final float G = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final ae1 H = new ae1();
    public static final int[] I = {R.attr.fillViewport};
    public int A;
    public ce1 B;
    public final yc0 C;
    public final jp D;
    public float E;
    public final l50 F;
    public final float e;
    public long f;
    public final Rect g;
    public final OverScroller h;
    public final EdgeEffect i;
    public final EdgeEffect j;
    public tx1 k;
    public int l;
    public boolean m;
    public boolean n;
    public View o;
    public boolean p;
    public VelocityTracker q;
    public boolean r;
    public boolean s;
    public final int t;
    public final int u;
    public final int v;
    public int w;
    public final int[] x;
    public final int[] y;
    public int z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ir.alirezaivaz.mygarage.R.attr.nestedScrollViewStyle);
        this.g = new Rect();
        this.m = true;
        this.n = false;
        this.o = null;
        this.p = false;
        this.s = true;
        this.w = -1;
        this.x = new int[2];
        this.y = new int[2];
        this.F = new l50(getContext(), new ao2(28, this));
        int i = Build.VERSION.SDK_INT;
        this.i = i >= 31 ? e90.a(context, attributeSet) : new EdgeEffect(context);
        this.j = i >= 31 ? e90.a(context, attributeSet) : new EdgeEffect(context);
        this.e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.t = viewConfiguration.getScaledTouchSlop();
        this.u = viewConfiguration.getScaledMinimumFlingVelocity();
        this.v = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I, ir.alirezaivaz.mygarage.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.C = new yc0();
        jp jpVar = new jp();
        jpVar.d = this;
        this.D = jpVar;
        setNestedScrollingEnabled(true);
        ln2.c(this, H);
    }

    public static boolean e(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && e((View) parent, nestedScrollView);
    }

    private tx1 getScrollFeedbackProvider() {
        tx1 tx1Var = this.k;
        if (tx1Var != null) {
            return tx1Var;
        }
        tx1 tx1Var2 = new tx1(this);
        this.k = tx1Var2;
        return tx1Var2;
    }

    public final boolean a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !f(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            l(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.g;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            l(b(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !f(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            fu1.h("ScrollView can host only one direct child");
        }
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    public final void c(int i) {
        if (getChildCount() > 0) {
            this.h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            o(2, 1);
            this.A = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                t90.a(this, Math.abs(this.h.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        OverScroller overScroller = this.h;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.A;
        int height = getHeight();
        EdgeEffect edgeEffect = this.i;
        EdgeEffect edgeEffect2 = this.j;
        if (i2 <= 0 || ei1.t(edgeEffect) == 0.0f) {
            if (i2 < 0 && ei1.t(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(ei1.E(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.A = currY;
            iArr = this.y;
            iArr[1] = 0;
            this.D.a(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                t90.a(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                i(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.D.b(0, scrollY2, 0, i4, this.x, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                q(1);
            }
            if (overScroller.isFinished()) {
                q(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(ei1.E(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        int i5 = i2;
        this.A = currY;
        iArr = this.y;
        iArr[1] = 0;
        this.D.a(0, i5, 1, iArr, null);
        i = i5 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            t90.a(this, Math.abs(overScroller.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            i(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i6 = i - scrollY4;
            iArr[1] = 0;
            this.D.b(0, scrollY4, 0, i6, this.x, 1, iArr);
            i = i6 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            q(1);
        }
        if (overScroller.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            q(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final boolean d(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return k(i, rect.top, rect.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zD;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.g.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() != 0) {
                        zD = false;
                    } else {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            zD = keyEvent.isAltPressed() ? d(33) : a(33);
                        } else if (keyCode != 20) {
                            if (keyCode == 62) {
                                j(keyEvent.isShiftPressed() ? 33 : 130);
                            } else if (keyCode == 92) {
                                zD = d(33);
                            } else if (keyCode == 93) {
                                zD = d(130);
                            } else if (keyCode == 122) {
                                j(33);
                            } else if (keyCode == 123) {
                                j(130);
                            }
                            zD = false;
                        } else {
                            zD = keyEvent.isAltPressed() ? d(130) : a(130);
                        }
                    }
                } else if (isFocused() || keyEvent.getKeyCode() == 4) {
                    zD = false;
                } else {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                        zD = false;
                    } else {
                        zD = true;
                    }
                }
            } else if (isFocused()) {
                zD = false;
            } else {
                zD = false;
            }
            if (!zD) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParentC;
        jp jpVar = this.D;
        if (jpVar.a && (viewParentC = jpVar.c(0)) != null) {
            try {
                return viewParentC.onNestedFling((NestedScrollView) jpVar.d, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParentC;
        jp jpVar = this.D;
        if (jpVar.a && (viewParentC = jpVar.c(0)) != null) {
            try {
                return viewParentC.onNestedPreFling((NestedScrollView) jpVar.d, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.D.a(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.D.b(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.i;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.j;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean f(View view, int i, int i2) {
        Rect rect = this.g;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void g(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.D.b(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        yc0 yc0Var = this.C;
        return yc0Var.b | yc0Var.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        float f = this.E;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            fu1.h("Expected theme to define listPreferredItemHeight.");
            return 0.0f;
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.E = dimension;
        return dimension;
    }

    public final void h(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.w) {
            int i = actionIndex == 0 ? 1 : 0;
            this.l = (int) motionEvent.getY(i);
            this.w = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.q;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.D.c(0) != null;
    }

    public final boolean i(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            i5 = 0;
            z = true;
        }
        if (i7 <= i4) {
            if (i7 < 0) {
                i6 = 0;
            } else {
                i6 = i7;
                z2 = false;
            }
            if (z2 && this.D.c(1) == null) {
                this.h.springBack(i5, i6, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i5, i6);
            return !z || z2;
        }
        i6 = i4;
        z2 = true;
        if (z2) {
            this.h.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        if (z) {
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.D.a;
    }

    public final void j(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.g;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        k(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean k(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            l(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    public final int l(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            o(2, i4);
        }
        boolean zA = this.D.a(0, i, i4, this.y, this.x);
        int[] iArr = this.x;
        int[] iArr2 = this.y;
        if (zA) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z5 = i(i5, 0, scrollY, scrollRange) && this.D.c(i4) == null;
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.D.b(0, scrollY2, 0, i5 - scrollY2, this.x, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.j;
        EdgeEffect edgeEffect2 = this.i;
        if (i9 >= 0) {
            if (i9 > scrollRange && z4) {
                ei1.E(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    z2 = false;
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                } else {
                    z2 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z3 = z2;
            } else {
                z3 = z5;
            }
            if (z3 && i4 == 0 && (velocityTracker = this.q) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                q(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z4) {
            ei1.E(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z2 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z3 = z2;
        } else {
            postInvalidateOnAnimation();
            z3 = z2;
        }
        if (z3) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            q(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    public final boolean m(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fT = ei1.t(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.e * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = G;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fT;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.h.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                o(2, 1);
            } else {
                q(1);
            }
            this.A = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.h;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                q(1);
            }
            scrollBy(i, i2);
        }
        this.f = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    public final boolean o(int i, int i2) {
        boolean zOnStartNestedScroll;
        jp jpVar = this.D;
        View view = (NestedScrollView) jpVar.d;
        if (jpVar.c(i2) != null) {
            return true;
        }
        if (jpVar.a) {
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof NestedScrollView;
                if (z) {
                    if ((i & 2) != 0) {
                        zOnStartNestedScroll = true;
                    } else {
                        zOnStartNestedScroll = false;
                    }
                } else if (i2 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        zOnStartNestedScroll = false;
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        jpVar.b = parent;
                    } else if (i2 == 1) {
                        jpVar.c = parent;
                    }
                    if (z) {
                        NestedScrollView nestedScrollView = (NestedScrollView) parent;
                        yc0 yc0Var = nestedScrollView.C;
                        if (i2 == 1) {
                            yc0Var.b = i;
                        } else {
                            yc0Var.a = i;
                        }
                        nestedScrollView.o(2, i2);
                        return true;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view2, view, i);
                        return true;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = false;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x029e  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i;
        int width;
        boolean z;
        int i2;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        float yVelocity;
        float f2;
        long j;
        float f3;
        int i3;
        float fSqrt;
        float f4;
        if (motionEvent.getAction() != 8 || this.p) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i = 9;
            f = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f = axisValue2;
            i = 26;
        } else {
            f = 0.0f;
            i = 0;
            width = 0;
        }
        if (f == 0.0f) {
            return false;
        }
        l(-((int) (getVerticalScrollFactorCompat() * f)), i, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i != 0) {
            l50 l50Var = this.F;
            NestedScrollView nestedScrollView = (NestedScrollView) l50Var.b.f;
            int[] iArr = l50Var.h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            if (l50Var.f == source && l50Var.g == deviceId && l50Var.e == i) {
                z2 = false;
                z = true;
                i2 = 0;
            } else {
                Context context = l50Var.a;
                z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                int source2 = motionEvent.getSource();
                i2 = 0;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    Method method = pn2.a;
                    scaledMinimumFlingVelocity = t0.g(viewConfiguration, deviceId2, i, source2);
                } else {
                    Method method2 = pn2.a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i4 >= 34) {
                    scaledMaximumFlingVelocity = t0.f(viewConfiguration, deviceId3, i, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                l50Var.f = source;
                l50Var.g = deviceId;
                l50Var.e = i;
                z2 = true;
            }
            int i5 = iArr[i2];
            VelocityTracker velocityTrackerObtain = l50Var.c;
            if (i5 == Integer.MAX_VALUE) {
                if (velocityTrackerObtain == null) {
                    return z;
                }
                velocityTrackerObtain.recycle();
                l50Var.c = null;
                return z;
            }
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = VelocityTracker.obtain();
                l50Var.c = velocityTrackerObtain;
            }
            Map map = vm2.a;
            velocityTrackerObtain.addMovement(motionEvent);
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = vm2.a;
                if (!map2.containsKey(velocityTrackerObtain)) {
                    map2.put(velocityTrackerObtain, new wm2());
                }
                wm2 wm2Var = (wm2) map2.get(velocityTrackerObtain);
                long[] jArr = wm2Var.b;
                long eventTime = motionEvent.getEventTime();
                int i6 = wm2Var.d;
                if (i6 != 0 && eventTime - jArr[wm2Var.e] > 40) {
                    wm2Var.d = i2;
                    wm2Var.c = 0.0f;
                    i6 = 0;
                }
                int i7 = (wm2Var.e + 1) % 20;
                wm2Var.e = i7;
                if (i6 != 20) {
                    wm2Var.d = i6 + 1;
                }
                wm2Var.a[i7] = motionEvent.getAxisValue(26);
                jArr[wm2Var.e] = eventTime;
            }
            float f5 = Float.MAX_VALUE;
            velocityTrackerObtain.computeCurrentVelocity(1000, Float.MAX_VALUE);
            wm2 wm2Var2 = (wm2) vm2.a.get(velocityTrackerObtain);
            if (wm2Var2 != null) {
                float[] fArr = wm2Var2.a;
                long[] jArr2 = wm2Var2.b;
                int i8 = wm2Var2.d;
                if (i8 < 2) {
                    f3 = Float.MAX_VALUE;
                } else {
                    int i9 = wm2Var2.e;
                    int i10 = ((i9 + 20) - (i8 - 1)) % 20;
                    long j2 = jArr2[i9];
                    while (true) {
                        j = jArr2[i10];
                        long j3 = j2 - j;
                        f3 = f5;
                        i3 = wm2Var2.d;
                        if (j3 <= 100) {
                            break;
                        }
                        wm2Var2.d = i3 - 1;
                        i10 = (i10 + 1) % 20;
                        f5 = f3;
                    }
                    if (i3 >= 2) {
                        if (i3 == 2) {
                            int i11 = (i10 + 1) % 20;
                            long j4 = jArr2[i11];
                            if (j != j4) {
                                iArr = iArr;
                                fSqrt = fArr[i11] / (j4 - j);
                            }
                        } else {
                            float f6 = 0.0f;
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                if (i12 >= wm2Var2.d - 1) {
                                    break;
                                }
                                int i14 = i12 + i10;
                                long j5 = jArr2[i14 % 20];
                                int i15 = (i14 + 1) % 20;
                                if (jArr2[i15] != j5) {
                                    i13++;
                                    float fSqrt2 = (f6 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(2.0f * Math.abs(f6)));
                                    float f7 = fArr[i15] / (jArr2[i15] - j5);
                                    float fAbs = (Math.abs(f7) * (f7 - fSqrt2)) + f6;
                                    if (i13 == z) {
                                        fAbs *= 0.5f;
                                    }
                                    f6 = fAbs;
                                }
                                i12++;
                                iArr = iArr;
                                z = true;
                            }
                            iArr = iArr;
                            float f8 = f6;
                            fSqrt = ((float) Math.sqrt(Math.abs(f8) * 2.0f)) * (f8 < 0.0f ? -1.0f : 1.0f);
                        }
                        f4 = fSqrt * 1000.0f;
                        wm2Var2.c = f4;
                        if (f4 < (-Math.abs(f3))) {
                            wm2Var2.c = -Math.abs(f3);
                        } else if (wm2Var2.c > Math.abs(f3)) {
                            wm2Var2.c = Math.abs(f3);
                        }
                    }
                }
                fSqrt = 0.0f;
                f4 = fSqrt * 1000.0f;
                wm2Var2.c = f4;
                if (f4 < (-Math.abs(f3))) {
                    wm2Var2.c = -Math.abs(f3);
                } else if (wm2Var2.c > Math.abs(f3)) {
                    wm2Var2.c = Math.abs(f3);
                }
            } else {
                iArr = iArr;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = t0.b(velocityTrackerObtain, i);
            } else if (i == 0) {
                yVelocity = velocityTrackerObtain.getXVelocity();
            } else if (i == 1) {
                yVelocity = velocityTrackerObtain.getYVelocity();
            } else {
                wm2 wm2Var3 = (wm2) vm2.a.get(velocityTrackerObtain);
                yVelocity = (wm2Var3 == null || i != 26) ? 0.0f : wm2Var3.c;
            }
            float f9 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f9);
            if (z2 || (fSignum != Math.signum(l50Var.d) && fSignum != 0.0f)) {
                nestedScrollView.h.abortAnimation();
            }
            if (Math.abs(f9) >= iArr[0]) {
                int i16 = iArr[1];
                float fMax = Math.max(-i16, Math.min(f9, i16));
                if (fMax == 0.0f) {
                    f2 = 0.0f;
                } else {
                    nestedScrollView.h.abortAnimation();
                    nestedScrollView.c((int) fMax);
                    f2 = fMax;
                }
                l50Var.d = f2;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.p) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.h;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!p(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.p = z;
                    velocityTracker = this.q;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.q = null;
                    }
                } else {
                    this.l = y;
                    this.w = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.q;
                    if (velocityTracker3 == null) {
                        this.q = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.q.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!p(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.p = z;
                    o(2, 0);
                }
            } else {
                if (!p(motionEvent)) {
                    z = false;
                }
                this.p = z;
                velocityTracker = this.q;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.q = null;
                }
            }
        } else if (i == 1) {
            this.p = false;
            this.w = -1;
            velocityTracker2 = this.q;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.q = null;
            }
            if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            q(0);
        } else if (i == 2) {
            int i2 = this.w;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.l) > this.t && (2 & getNestedScrollAxes()) == 0) {
                        this.p = true;
                        this.l = y2;
                        VelocityTracker velocityTrackerObtain = this.q;
                        if (velocityTrackerObtain == null) {
                            velocityTrackerObtain = VelocityTracker.obtain();
                            this.q = velocityTrackerObtain;
                        }
                        velocityTrackerObtain.addMovement(motionEvent);
                        this.z = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.p = false;
            this.w = -1;
            velocityTracker2 = this.q;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.q = null;
            }
            if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            q(0);
        } else if (i == 6) {
            h(motionEvent);
        }
        return this.p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.m = false;
        View view = this.o;
        if (view != null && e(view, this)) {
            View view2 = this.o;
            Rect rect = this.g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        this.o = null;
        if (!this.n) {
            if (this.B != null) {
                scrollTo(getScrollX(), this.B.e);
                this.B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.n = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.r && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        c((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.D.a(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        g(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.C.a = i;
        o(2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && f(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ce1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ce1 ce1Var = (ce1) parcelable;
        super.onRestoreInstanceState(ce1Var.getSuperState());
        this.B = ce1Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ce1 ce1Var = new ce1(super.onSaveInstanceState());
        ce1Var.e = getScrollY();
        return ce1Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !f(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.g;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.s) {
                n(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.C.a = 0;
        q(0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x013c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0141  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fE;
        int iRound;
        int i;
        int iAbs;
        int i2;
        ViewParent parent2;
        if (this.q == null) {
            this.q = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.z = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.z);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.i;
            EdgeEffect edgeEffect2 = this.j;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.q;
                velocityTracker.computeCurrentVelocity(1000, this.v);
                int yVelocity = (int) velocityTracker.getYVelocity(this.w);
                if (Math.abs(yVelocity) >= this.u) {
                    if (ei1.t(edgeEffect) != 0.0f) {
                        if (m(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            c(-yVelocity);
                        }
                    } else if (ei1.t(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (m(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            c(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f2 = i4;
                        if (!dispatchNestedPreFling(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            c(i4);
                        }
                    }
                } else if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.w = -1;
                this.p = false;
                VelocityTracker velocityTracker2 = this.q;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.q = null;
                }
                q(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.w);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.w + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.l - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (ei1.t(edgeEffect) != 0.0f) {
                        fE = -ei1.E(edgeEffect, -height, x);
                        if (ei1.t(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (ei1.t(edgeEffect2) != 0.0f) {
                        fE = ei1.E(edgeEffect2, height, 1.0f - x);
                        if (ei1.t(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.p) {
                            iAbs = Math.abs(i);
                            i2 = this.t;
                            if (iAbs > i2) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.p = true;
                                if (i > 0) {
                                    i -= i2;
                                } else {
                                    i += i2;
                                }
                            }
                        }
                        if (this.p) {
                            int iL = l(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.l = y - iL;
                            this.z += iL;
                        }
                    }
                    f = fE;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.p) {
                        iAbs = Math.abs(i);
                        i2 = this.t;
                        if (iAbs > i2) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.p = true;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                    }
                    if (this.p) {
                        int iL2 = l(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.l = y - iL2;
                        this.z += iL2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.p && getChildCount() > 0) {
                    if (this.h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.w = -1;
                this.p = false;
                VelocityTracker velocityTracker3 = this.q;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.q = null;
                }
                q(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.l = (int) motionEvent.getY(actionIndex);
                this.w = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                h(motionEvent);
                this.l = (int) motionEvent.getY(motionEvent.findPointerIndex(this.w));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.p && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.h;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                q(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.l = y2;
            this.w = pointerId;
            o(2, 0);
        }
        VelocityTracker velocityTracker4 = this.q;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.i;
        if (ei1.t(edgeEffect) != 0.0f) {
            ei1.E(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.j;
        if (ei1.t(edgeEffect2) == 0.0f) {
            return z;
        }
        ei1.E(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void q(int i) {
        jp jpVar = this.D;
        ViewParent viewParentC = jpVar.c(i);
        if (viewParentC != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) jpVar.d;
            if (viewParentC instanceof NestedScrollView) {
                NestedScrollView nestedScrollView2 = (NestedScrollView) viewParentC;
                yc0 yc0Var = nestedScrollView2.C;
                if (i == 1) {
                    yc0Var.b = 0;
                } else {
                    yc0Var.a = 0;
                }
                nestedScrollView2.q(i);
            } else if (i == 0) {
                try {
                    viewParentC.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                jpVar.b = null;
            } else {
                if (i != 1) {
                    return;
                }
                jpVar.c = null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.m) {
            this.o = view2;
        } else {
            Rect rect = this.g;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iB = b(rect);
            if (iB != 0) {
                scrollBy(0, iB);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z2 = iB != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iB);
                return z2;
            }
            n(0, iB, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.q) != null) {
            velocityTracker.recycle();
            this.q = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.m = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.r) {
            this.r = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        jp jpVar = this.D;
        if (jpVar.a) {
            NestedScrollView nestedScrollView = (NestedScrollView) jpVar.d;
            Field field = ln2.a;
            nestedScrollView.stopNestedScroll();
        }
        jpVar.a = z;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.s = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return o(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        q(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            fu1.h("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            fu1.h("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            fu1.h("ScrollView can host only one direct child");
        }
    }

    public void setOnScrollChangeListener(be1 be1Var) {
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
