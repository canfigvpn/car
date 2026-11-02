package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s21 extends ViewGroup {
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public float k;
    public boolean l;
    public int[] m;
    public int[] n;
    public Drawable o;
    public int p;
    public int q;
    public int r;
    public int s;

    public s21(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, 0);
        this.e = true;
        this.f = -1;
        this.g = 0;
        this.i = 8388659;
        int[] iArr = ar1.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        ln2.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.k = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.l = typedArrayObtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!typedArrayObtainStyledAttributes.hasValue(5) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(5) : ws0.y(context, resourceId));
        this.r = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i) {
        this.o.setBounds(getPaddingLeft() + this.s, i, (getWidth() - getPaddingRight()) - this.s, this.q + i);
        this.o.draw(canvas);
    }

    public final void b(Canvas canvas, int i) {
        this.o.setBounds(i, getPaddingTop() + this.s, this.p + i, (getHeight() - getPaddingBottom()) - this.s);
        this.o.draw(canvas);
    }

    public final boolean c(int i) {
        if (i == 0) {
            return (this.r & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.r;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r21;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int i = this.h;
        if (i == 0) {
            return new r21(-2, -2);
        }
        if (i == 1) {
            return new r21(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof r21) {
            return new r21((r21) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new r21((ViewGroup.MarginLayoutParams) layoutParams) : new r21(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.g;
        if (this.h == 1 && (i = this.i & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.j) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.j;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((r21) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f;
    }

    public Drawable getDividerDrawable() {
        return this.o;
    }

    public int getDividerPadding() {
        return this.s;
    }

    public int getDividerWidth() {
        return this.p;
    }

    public int getGravity() {
        return this.i;
    }

    public int getOrientation() {
        return this.h;
    }

    public int getShowDividers() {
        return this.r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.k;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.o == null) {
            return;
        }
        int i2 = 0;
        if (this.h == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && c(i2)) {
                    a(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((r21) childAt.getLayoutParams())).topMargin) - this.q);
                }
                i2++;
            }
            if (c(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.q;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((r21) childAt2.getLayoutParams())).bottomMargin;
                }
                a(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = fo2.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && c(i2)) {
                r21 r21Var = (r21) childAt3.getLayoutParams();
                b(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) r21Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) r21Var).leftMargin) - this.p);
            }
            i2++;
        }
        if (c(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                r21 r21Var2 = (r21) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) r21Var2).leftMargin;
                    i = this.p;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) r21Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.p;
                right = left - i;
            }
            b(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:231:0x04df  */
    /* JADX WARN: Code duplicated, block: B:234:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:238:0x0501  */
    /* JADX WARN: Code duplicated, block: B:240:0x0522  */
    /* JADX WARN: Code duplicated, block: B:246:0x0532  */
    /* JADX WARN: Code duplicated, block: B:249:0x0539 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x053c  */
    /* JADX WARN: Code duplicated, block: B:253:0x0543 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x0546  */
    /* JADX WARN: Code duplicated, block: B:370:0x0794  */
    /* JADX WARN: Code duplicated, block: B:64:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int baseline;
        int i7;
        int i8;
        int[] iArr2;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        r21 r21Var;
        View view;
        int i11;
        int[] iArr3;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int measuredHeight;
        boolean z4;
        boolean z5;
        int iMax2;
        int i15;
        int baseline2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        int i22;
        int i23;
        View view2;
        boolean z7;
        s21 s21Var = this;
        int i24 = -2;
        int iMax3 = 0;
        int i25 = 1073741824;
        int i26 = 8;
        if (s21Var.h == 1) {
            s21Var.j = 0;
            int virtualChildCount = s21Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i27 = s21Var.f;
            boolean z8 = s21Var.l;
            int i28 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z9 = false;
            int i29 = 0;
            boolean z10 = false;
            boolean z11 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i28 < virtualChildCount) {
                int i30 = mode;
                View childAt = s21Var.getChildAt(i28);
                if (childAt == null) {
                    s21Var.j = s21Var.j;
                } else {
                    if (childAt.getVisibility() != i26) {
                        if (s21Var.c(i28)) {
                            s21Var.j += s21Var.q;
                        }
                        r21 r21Var2 = (r21) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) r21Var2).weight;
                        f += f2;
                        if (mode2 == i25 && ((LinearLayout.LayoutParams) r21Var2).height == 0 && f2 > 0.0f) {
                            int i31 = s21Var.j;
                            s21Var.j = Math.max(i31, ((LinearLayout.LayoutParams) r21Var2).topMargin + i31 + ((LinearLayout.LayoutParams) r21Var2).bottomMargin);
                            view2 = childAt;
                            i20 = mode2;
                            i21 = i27;
                            z6 = z8;
                            i22 = i28;
                            z9 = true;
                            i23 = i30;
                        } else {
                            if (((LinearLayout.LayoutParams) r21Var2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) r21Var2).height = i24;
                                i19 = 0;
                            }
                            i20 = mode2;
                            z6 = z8;
                            i21 = i27;
                            i22 = i28;
                            i23 = i30;
                            s21Var.measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? s21Var.j : 0);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) r21Var2).height = i19;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i32 = s21Var.j;
                            view2 = childAt;
                            s21Var.j = Math.max(i32, i32 + measuredHeight2 + ((LinearLayout.LayoutParams) r21Var2).topMargin + ((LinearLayout.LayoutParams) r21Var2).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i21 >= 0 && i21 == i22 + 1) {
                            s21Var.g = s21Var.j;
                        }
                        if (i22 < i21 && ((LinearLayout.LayoutParams) r21Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i23 == 1073741824 || ((LinearLayout.LayoutParams) r21Var2).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i33 = ((LinearLayout.LayoutParams) r21Var2).leftMargin + ((LinearLayout.LayoutParams) r21Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i33;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i29, measuredState);
                        if (z11) {
                            i29 = iCombineMeasuredStates;
                            boolean z13 = ((LinearLayout.LayoutParams) r21Var2).width == -1;
                            if (((LinearLayout.LayoutParams) r21Var2).weight > 0.0f) {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i33);
                            } else {
                                if (!z12) {
                                    i33 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i33);
                            }
                            z11 = z13;
                        } else {
                            i29 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) r21Var2).weight > 0.0f) {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i33);
                        } else {
                            if (!z12) {
                                i33 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i33);
                        }
                        z11 = z13;
                    }
                    i28 = i22 + 1;
                    i27 = i21;
                    mode = i23;
                    z8 = z6;
                    mode2 = i20;
                    i24 = -2;
                    i25 = 1073741824;
                    i26 = 8;
                }
                i20 = mode2;
                i21 = i27;
                z6 = z8;
                i22 = i28;
                i23 = i30;
                i28 = i22 + 1;
                i27 = i21;
                mode = i23;
                z8 = z6;
                mode2 = i20;
                i24 = -2;
                i25 = 1073741824;
                i26 = 8;
            }
            int i34 = mode;
            int i35 = mode2;
            boolean z14 = z8;
            int i36 = i29;
            int i37 = i2;
            if (s21Var.j > 0 && s21Var.c(virtualChildCount)) {
                s21Var.j += s21Var.q;
            }
            if (z14 && (i35 == Integer.MIN_VALUE || i35 == 0)) {
                s21Var.j = 0;
                for (int i38 = 0; i38 < virtualChildCount; i38++) {
                    View childAt2 = s21Var.getChildAt(i38);
                    if (childAt2 == null) {
                        s21Var.j = s21Var.j;
                    } else if (childAt2.getVisibility() != 8) {
                        r21 r21Var3 = (r21) childAt2.getLayoutParams();
                        int i39 = s21Var.j;
                        s21Var.j = Math.max(i39, i39 + iMax6 + ((LinearLayout.LayoutParams) r21Var3).topMargin + ((LinearLayout.LayoutParams) r21Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = s21Var.getPaddingBottom() + s21Var.getPaddingTop() + s21Var.j;
            s21Var.j = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, s21Var.getSuggestedMinimumHeight()), i37, 0);
            int i40 = (iResolveSizeAndState & 16777215) - s21Var.j;
            if (z9 || (i40 != 0 && f > 0.0f)) {
                float f3 = s21Var.k;
                if (f3 > 0.0f) {
                    f = f3;
                }
                s21Var.j = 0;
                int iCombineMeasuredStates2 = i36;
                int i41 = 0;
                while (i41 < virtualChildCount) {
                    View childAt3 = s21Var.getChildAt(i41);
                    if (childAt3.getVisibility() == 8) {
                        i41 = i41;
                    } else {
                        r21 r21Var4 = (r21) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) r21Var4).weight;
                        if (f4 > 0.0f) {
                            int i42 = (int) ((i40 * f4) / f);
                            f -= f4;
                            i40 -= i42;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, s21Var.getPaddingRight() + s21Var.getPaddingLeft() + ((LinearLayout.LayoutParams) r21Var4).leftMargin + ((LinearLayout.LayoutParams) r21Var4).rightMargin, ((LinearLayout.LayoutParams) r21Var4).width);
                            if (((LinearLayout.LayoutParams) r21Var4).height == 0) {
                                i18 = 1073741824;
                                if (i35 == 1073741824) {
                                    if (i42 <= 0) {
                                        i42 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i18 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i42;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i18));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i43 = ((LinearLayout.LayoutParams) r21Var4).leftMargin + ((LinearLayout.LayoutParams) r21Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i43;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i34 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) r21Var4).width == -1) {
                                measuredWidth2 = i43;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((LinearLayout.LayoutParams) r21Var4).width == i17;
                        int i44 = s21Var.j;
                        s21Var.j = Math.max(i44, childAt3.getMeasuredHeight() + i44 + ((LinearLayout.LayoutParams) r21Var4).topMargin + ((LinearLayout.LayoutParams) r21Var4).bottomMargin);
                        z11 = z15;
                    }
                    i41++;
                }
                s21Var.j = s21Var.getPaddingBottom() + s21Var.getPaddingTop() + s21Var.j;
                i36 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i35 != 1073741824) {
                    for (int i45 = 0; i45 < virtualChildCount; i45++) {
                        View childAt4 = s21Var.getChildAt(i45);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((r21) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i34 == 1073741824) {
                iMax4 = iMax3;
            }
            s21Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(s21Var.getPaddingRight() + s21Var.getPaddingLeft() + iMax4, s21Var.getSuggestedMinimumWidth()), i, i36), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(s21Var.getMeasuredWidth(), 1073741824);
                int i46 = 0;
                while (i46 < virtualChildCount) {
                    View childAt5 = s21Var.getChildAt(i46);
                    if (childAt5.getVisibility() != 8) {
                        r21 r21Var5 = (r21) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) r21Var5).width == -1) {
                            int i47 = ((LinearLayout.LayoutParams) r21Var5).height;
                            ((LinearLayout.LayoutParams) r21Var5).height = childAt5.getMeasuredHeight();
                            s21Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i37, 0);
                            ((LinearLayout.LayoutParams) r21Var5).height = i47;
                        }
                    }
                    i46++;
                    i37 = i2;
                }
                return;
            }
            return;
        }
        int i48 = i;
        s21Var.j = 0;
        int virtualChildCount2 = s21Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i48);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = s21Var.m;
        if (iArr4 == null || (iArr = s21Var.n) == null) {
            iArr4 = new int[4];
            s21Var.m = iArr4;
            iArr = new int[4];
            s21Var.n = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z16 = s21Var.e;
        boolean z17 = s21Var.l;
        boolean z18 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z19 = true;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z20 = false;
        boolean z21 = false;
        while (i49 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = s21Var.getChildAt(i49);
            if (childAt6 == null) {
                s21Var.j = s21Var.j;
                i10 = i49;
                i15 = i51;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z = z16;
                z2 = z17;
            } else {
                int i52 = i50;
                if (childAt6.getVisibility() == 8) {
                    i48 = i;
                    i10 = i49;
                    i15 = i51;
                    iArr2 = iArr6;
                    z = z16;
                    z2 = z17;
                    i50 = i52;
                    iArr3 = iArr5;
                } else {
                    if (s21Var.c(i49)) {
                        s21Var.j += s21Var.p;
                    }
                    r21 r21Var6 = (r21) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) r21Var6).weight;
                    f5 += f6;
                    int i53 = i49;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) r21Var6).width == 0 && f6 > 0.0f) {
                        int i54 = s21Var.j;
                        int i55 = ((LinearLayout.LayoutParams) r21Var6).leftMargin;
                        if (z18) {
                            s21Var.j = i55 + ((LinearLayout.LayoutParams) r21Var6).rightMargin + i54;
                        } else {
                            s21Var.j = Math.max(i54, i54 + i55 + ((LinearLayout.LayoutParams) r21Var6).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            i11 = i52;
                            i10 = i53;
                            r21Var = r21Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        } else {
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            z21 = true;
                            i11 = i52;
                            i10 = i53;
                            i13 = 1073741824;
                            r21Var = r21Var6;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i48 = i;
                            i12 = i51;
                            i9 = iMax7;
                        }
                        if (mode4 == i13 && ((LinearLayout.LayoutParams) r21Var).height == -1) {
                            z3 = true;
                            z20 = true;
                        } else {
                            z3 = false;
                        }
                        i14 = ((LinearLayout.LayoutParams) r21Var).topMargin + ((LinearLayout.LayoutParams) r21Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i14;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                            baseline2 = view.getBaseline();
                            z4 = z3;
                            if (baseline2 != -1) {
                                i16 = ((LinearLayout.LayoutParams) r21Var).gravity;
                                if (i16 < 0) {
                                    i16 = s21Var.i;
                                }
                                int i56 = (((i16 & 112) >> 4) & (-2)) >> 1;
                                iArr3[i56] = Math.max(iArr3[i56], baseline2);
                                iArr2[i56] = Math.max(iArr2[i56], measuredHeight - baseline2);
                            }
                        } else {
                            z4 = z3;
                        }
                        int iMax9 = Math.max(i11, measuredHeight);
                        if (z19 || ((LinearLayout.LayoutParams) r21Var).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) r21Var).weight > 0.0f) {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax7 = Math.max(i9, i14);
                            iMax2 = i12;
                        } else {
                            if (!z4) {
                                i14 = measuredHeight;
                            }
                            iMax2 = Math.max(i12, i14);
                            iMax7 = i9;
                        }
                        int i57 = iMax2;
                        i50 = iMax9;
                        i15 = i57;
                        z19 = z5;
                    } else {
                        if (((LinearLayout.LayoutParams) r21Var6).width != 0 || f6 <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) r21Var6).width = -2;
                            i8 = 0;
                        }
                        iArr2 = iArr6;
                        i9 = iMax7;
                        i10 = i53;
                        z = z16;
                        z2 = z17;
                        int i58 = i8;
                        r21Var = r21Var6;
                        view = childAt6;
                        i11 = i52;
                        i48 = i;
                        iArr3 = iArr5;
                        i12 = i51;
                        s21Var.measureChildWithMargins(view, i48, f5 == 0.0f ? s21Var.j : 0, i2, 0);
                        if (i58 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) r21Var).width = i58;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        int i59 = s21Var.j;
                        int i60 = ((LinearLayout.LayoutParams) r21Var).leftMargin;
                        if (z18) {
                            s21Var.j = i60 + measuredWidth3 + ((LinearLayout.LayoutParams) r21Var).rightMargin + i59;
                        } else {
                            s21Var.j = Math.max(i59, i59 + measuredWidth3 + i60 + ((LinearLayout.LayoutParams) r21Var).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i13 = 1073741824;
                    if (mode4 == i13) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i14 = ((LinearLayout.LayoutParams) r21Var).topMargin + ((LinearLayout.LayoutParams) r21Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i14;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z) {
                        baseline2 = view.getBaseline();
                        z4 = z3;
                        if (baseline2 != -1) {
                            i16 = ((LinearLayout.LayoutParams) r21Var).gravity;
                            if (i16 < 0) {
                                i16 = s21Var.i;
                            }
                            int i510 = (((i16 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i510] = Math.max(iArr3[i510], baseline2);
                            iArr2[i510] = Math.max(iArr2[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z4 = z3;
                    }
                    int iMax10 = Math.max(i11, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) r21Var).weight > 0.0f) {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax7 = Math.max(i9, i14);
                        iMax2 = i12;
                    } else {
                        if (!z4) {
                            i14 = measuredHeight;
                        }
                        iMax2 = Math.max(i12, i14);
                        iMax7 = i9;
                    }
                    int i511 = iMax2;
                    i50 = iMax10;
                    i15 = i511;
                    z19 = z5;
                }
            }
            i51 = i15;
            i49 = i10 + 1;
            c = c2;
            iArr5 = iArr3;
            iArr6 = iArr2;
            z16 = z;
            z17 = z2;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z22 = z16;
        boolean z23 = z17;
        int i61 = i50;
        int i62 = i51;
        int i63 = iMax7;
        if (s21Var.j > 0 && s21Var.c(virtualChildCount2)) {
            s21Var.j += s21Var.p;
        }
        int i64 = iArr7[1];
        int iMax11 = (i64 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i61 : Math.max(i61, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i64, iArr7[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            s21Var.j = 0;
            for (int i65 = 0; i65 < virtualChildCount2; i65++) {
                View childAt7 = s21Var.getChildAt(i65);
                if (childAt7 == null) {
                    s21Var.j = s21Var.j;
                } else if (childAt7.getVisibility() != 8) {
                    r21 r21Var7 = (r21) childAt7.getLayoutParams();
                    int i66 = s21Var.j;
                    if (z18) {
                        s21Var.j = ((LinearLayout.LayoutParams) r21Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) r21Var7).rightMargin + i66;
                    } else {
                        s21Var.j = Math.max(i66, i66 + iMax8 + ((LinearLayout.LayoutParams) r21Var7).leftMargin + ((LinearLayout.LayoutParams) r21Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = s21Var.getPaddingRight() + s21Var.getPaddingLeft() + s21Var.j;
        s21Var.j = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, s21Var.getSuggestedMinimumWidth()), i48, 0);
        int i67 = (iResolveSizeAndState2 & 16777215) - s21Var.j;
        if (z21 || (i67 != 0 && f5 > 0.0f)) {
            float f7 = s21Var.k;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            s21Var.j = 0;
            iMax11 = -1;
            int i68 = 0;
            while (i68 < virtualChildCount2) {
                View childAt8 = s21Var.getChildAt(i68);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    r21 r21Var8 = (r21) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) r21Var8).weight;
                    if (f8 > 0.0f) {
                        int i69 = (int) ((i67 * f8) / f5);
                        f5 -= f8;
                        i67 -= i69;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, s21Var.getPaddingBottom() + s21Var.getPaddingTop() + ((LinearLayout.LayoutParams) r21Var8).topMargin + ((LinearLayout.LayoutParams) r21Var8).bottomMargin, ((LinearLayout.LayoutParams) r21Var8).height);
                        if (((LinearLayout.LayoutParams) r21Var8).width == 0) {
                            i7 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i69 <= 0) {
                                    i69 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i69, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i7 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i69;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i7), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    int i70 = s21Var.j;
                    if (z18) {
                        s21Var.j = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) r21Var8).leftMargin + ((LinearLayout.LayoutParams) r21Var8).rightMargin + i70;
                    } else {
                        s21Var.j = Math.max(i70, childAt8.getMeasuredWidth() + i70 + ((LinearLayout.LayoutParams) r21Var8).leftMargin + ((LinearLayout.LayoutParams) r21Var8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) r21Var8).height == -1;
                    int i71 = ((LinearLayout.LayoutParams) r21Var8).topMargin + ((LinearLayout.LayoutParams) r21Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i71;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z24) {
                        i71 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i62, i71);
                    if (z19) {
                        i6 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) r21Var8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i6) {
                            int i72 = ((LinearLayout.LayoutParams) r21Var8).gravity;
                            if (i72 < 0) {
                                i72 = s21Var.i;
                            }
                            int i73 = (((i72 & 112) >> 4) & (-2)) >> 1;
                            iArr7[i73] = Math.max(iArr7[i73], baseline);
                            iArr8[i73] = Math.max(iArr8[i73], measuredHeight4 - baseline);
                        }
                        z19 = z25;
                        i62 = iMax12;
                    } else {
                        i6 = -1;
                    }
                    if (!z22) {
                    }
                    z19 = z25;
                    i62 = iMax12;
                }
                i68++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            s21Var.j = s21Var.getPaddingRight() + s21Var.getPaddingLeft() + s21Var.j;
            int i74 = iArr7[1];
            if (i74 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i74, iArr7[c3]))));
            }
            iMax = i62;
        } else {
            iMax = Math.max(i62, i63);
            if (z23 && mode3 != 1073741824) {
                for (int i75 = 0; i75 < virtualChildCount2; i75++) {
                    View childAt9 = s21Var.getChildAt(i75);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((r21) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z19 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        s21Var.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(s21Var.getPaddingBottom() + s21Var.getPaddingTop() + iMax11, s21Var.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z20) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(s21Var.getMeasuredHeight(), 1073741824);
            int i76 = i5;
            while (i76 < virtualChildCount2) {
                View childAt10 = s21Var.getChildAt(i76);
                if (childAt10.getVisibility() != 8) {
                    r21 r21Var9 = (r21) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) r21Var9).height == -1) {
                        int i77 = ((LinearLayout.LayoutParams) r21Var9).width;
                        ((LinearLayout.LayoutParams) r21Var9).width = childAt10.getMeasuredWidth();
                        s21Var.measureChildWithMargins(childAt10, i48, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) r21Var9).width = i77;
                    }
                }
                i76++;
                s21Var = this;
                i48 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.e = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.o) {
            return;
        }
        this.o = drawable;
        if (drawable != null) {
            this.p = drawable.getIntrinsicWidth();
            this.q = drawable.getIntrinsicHeight();
        } else {
            this.p = 0;
            this.q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.s = i;
    }

    public void setGravity(int i) {
        if (this.i != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.i = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.i;
        if ((8388615 & i3) != i2) {
            this.i = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.l = z;
    }

    public void setOrientation(int i) {
        if (this.h != i) {
            this.h = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.r) {
            requestLayout();
        }
        this.r = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.i;
        if ((i3 & 112) != i2) {
            this.i = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.k = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new r21(getContext(), attributeSet);
    }
}
