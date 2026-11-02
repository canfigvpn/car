package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 extends Drawable {
    public static final w40[] A;
    public static final Paint z;
    public final l61 a;
    public m61 b;
    public final f42[] c;
    public final f42[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final s32 q;
    public final l61 r;
    public final rs1 s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public final RectF v;
    public final boolean w;
    public v32 x;
    public float[] y;

    static {
        Paint paint = new Paint(1);
        z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A = new w40[4];
        int i = 0;
        while (true) {
            w40[] w40VarArr = A;
            if (i >= w40VarArr.length) {
                return;
            }
            w40VarArr[i] = new w40(15);
            i++;
        }
    }

    public n61(m61 m61Var) {
        this.a = new l61(this);
        this.c = new f42[4];
        this.d = new f42[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new s32();
        this.s = Looper.getMainLooper().getThread() == Thread.currentThread() ? w32.a : new rs1(1);
        this.v = new RectF();
        this.w = true;
        this.b = m61Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        j();
        i(getState());
        this.r = new l61(this);
    }

    public static float b(RectF rectF, v32 v32Var, float[] fArr) {
        if (fArr == null) {
            if (v32Var.e(rectF)) {
                return v32Var.f.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (v32Var.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        m61 m61Var = this.b;
        this.s.a(m61Var.a, null, m61Var.h, rectF, this.r, path);
        if (this.b.g != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.g;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.v, true);
    }

    public final int c(int i) {
        this.b.getClass();
        m61 m61Var = this.b;
        m61Var.getClass();
        w90 w90Var = m61Var.b;
        if (w90Var == null || !w90Var.a || tr.d(i, 255) != w90Var.c) {
            return i;
        }
        int iAlpha = Color.alpha(i);
        int iD = tr.d(i, 255);
        int i2 = w90Var.b;
        return tr.d(tr.b(tr.d(i2, Math.round(Color.alpha(i2) * 0.0f)), iD), iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w("n61", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.k;
        Path path = this.i;
        s32 s32Var = this.q;
        if (i != 0) {
            canvas.drawPath(path, s32Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            f42 f42Var = this.c[i2];
            int i3 = this.b.j;
            Matrix matrix = f42.b;
            f42Var.a(matrix, s32Var, i3, canvas);
            this.d[i2].a(matrix, s32Var, this.b.j, canvas);
        }
        if (this.w) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.b.k));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.k));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, z);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint2 = this.o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.b.i;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        Paint paint3 = this.p;
        paint3.setColorFilter(porterDuffColorFilter2);
        this.b.getClass();
        paint3.setStrokeWidth(0.0f);
        int alpha2 = paint3.getAlpha();
        int i2 = this.b.i;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.b.l;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f;
            Path path = this.i;
            if (z2) {
                a(e(), path);
                this.f = false;
            }
            m61 m61Var = this.b;
            m61Var.getClass();
            if (m61Var.j > 0 && !m61Var.a.e(e()) && !path.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                canvas.translate((int) (((double) this.b.k) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.k)));
                if (this.w) {
                    RectF rectF = this.v;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        fu1.h("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.b.j * 2) + ((int) rectF.width()) + iWidth, (this.b.j * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (getBounds().left - this.b.j) - iWidth;
                    float f2 = (getBounds().top - this.b.j) - iHeight;
                    canvas2.translate(-f, -f2);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
            v32 v32Var = this.b.a;
            RectF rectFE = e();
            float fB = b(rectFE, v32Var, null);
            if (fB >= 0.0f) {
                float f3 = fB * this.b.h;
                canvas.drawRoundRect(rectFE, f3, f3, paint2);
            } else {
                canvas.drawPath(path, paint2);
            }
        }
        if (g()) {
            boolean z3 = this.g;
            RectF rectF2 = this.l;
            Path path2 = this.j;
            if (z3) {
                v32 v32Var2 = this.b.a;
                rw rwVar = v32Var2.b;
                rw rwVar2 = v32Var2.c;
                rw rwVar3 = v32Var2.d;
                rw rwVar4 = v32Var2.e;
                qy qyVar = v32Var2.f;
                qy qyVar2 = v32Var2.g;
                qy qyVar3 = v32Var2.h;
                qy qyVar4 = v32Var2.i;
                q90 q90Var = v32Var2.j;
                q90 q90Var2 = v32Var2.k;
                q90 q90Var3 = v32Var2.l;
                q90 q90Var4 = v32Var2.m;
                l61 l61Var = this.a;
                qy qyVarA = l61Var.a(qyVar);
                qy qyVarA2 = l61Var.a(qyVar2);
                qy qyVarA3 = l61Var.a(qyVar4);
                qy qyVarA4 = l61Var.a(qyVar3);
                v32 v32Var3 = new v32(1);
                v32Var3.b = rwVar;
                v32Var3.c = rwVar2;
                v32Var3.d = rwVar3;
                v32Var3.e = rwVar4;
                v32Var3.f = qyVarA;
                v32Var3.g = qyVarA2;
                v32Var3.h = qyVarA4;
                v32Var3.i = qyVarA3;
                v32Var3.j = q90Var;
                v32Var3.k = q90Var2;
                v32Var3.l = q90Var3;
                v32Var3.m = q90Var4;
                this.x = v32Var3;
                this.y = null;
                float f4 = this.b.h;
                rectF2.set(e());
                float f5 = f();
                rectF2.inset(f5, f5);
                path2 = path2;
                this.s.a(v32Var3, null, f4, rectF2, null, path2);
                this.g = false;
            }
            v32 v32Var4 = this.x;
            float[] fArr = this.y;
            rectF2.set(e());
            float f6 = f();
            rectF2.inset(f6, f6);
            float fB2 = b(rectF2, v32Var4, fArr);
            if (fB2 >= 0) {
                float f7 = fB2 * this.b.h;
                paint = paint3;
                canvas.drawRoundRect(rectF2, f7, f7, paint);
            } else {
                paint = paint3;
                canvas.drawPath(path2, paint);
            }
        } else {
            alpha = alpha;
            paint = paint3;
            alpha2 = alpha2;
        }
        paint2.setAlpha(alpha);
        paint.setAlpha(alpha2);
    }

    public final RectF e() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    public final float f() {
        if (g()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean g() {
        Paint.Style style = this.b.l;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.b.getClass();
        RectF rectFE = e();
        if (rectFE.isEmpty()) {
            return;
        }
        float fB = b(rectFE, this.b.a, null);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.b.h);
            return;
        }
        boolean z2 = this.f;
        Path path = this.i;
        if (z2) {
            a(rectFE, path);
            this.f = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            s80.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                r80.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            r80.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.f;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF rectFE = e();
        Path path = this.i;
        a(rectFE, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.b.b = new w90(context);
        this.b.getClass();
        this.b.j = (int) Math.ceil(0.0d);
        this.b.k = (int) Math.ceil(0.0d);
        j();
        super.invalidateSelf();
    }

    public final boolean i(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        if (this.b.c == null || color == (colorForState = this.b.c.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            z2 = false;
        } else {
            paint.setColor(colorForState);
            z2 = true;
        }
        this.b.getClass();
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.d;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.b.getClass();
        this.b.getClass();
        ColorStateList colorStateList2 = this.b.c;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        this.b.getClass();
        return false;
    }

    public final boolean j() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        m61 m61Var = this.b;
        ColorStateList colorStateList = m61Var.d;
        PorterDuff.Mode mode = m61Var.e;
        if (colorStateList == null || mode == null) {
            int color = this.o.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.t = porterDuffColorFilter;
        this.b.getClass();
        this.u = null;
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.t) && Objects.equals(porterDuffColorFilter3, this.u)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        m61 m61Var = this.b;
        m61 m61Var2 = new m61();
        m61Var2.c = null;
        m61Var2.d = null;
        m61Var2.e = PorterDuff.Mode.SRC_IN;
        m61Var2.f = null;
        m61Var2.g = 1.0f;
        m61Var2.h = 1.0f;
        m61Var2.i = 255;
        m61Var2.j = 0;
        m61Var2.k = 0;
        m61Var2.l = Paint.Style.FILL_AND_STROKE;
        m61Var2.a = m61Var.a;
        m61Var2.b = m61Var.b;
        m61Var2.c = m61Var.c;
        m61Var2.e = m61Var.e;
        m61Var2.d = m61Var.d;
        m61Var2.i = m61Var.i;
        m61Var2.g = m61Var.g;
        m61Var2.k = m61Var.k;
        m61Var2.h = m61Var.h;
        m61Var2.j = m61Var.j;
        m61Var2.l = m61Var.l;
        Rect rect = m61Var.f;
        if (rect != null) {
            m61Var2.f = new Rect(rect);
        }
        this.b = m61Var2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        this.b.getClass();
        rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        this.b.getClass();
        boolean z2 = i(iArr) || j();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        m61 m61Var = this.b;
        if (m61Var.i != i) {
            m61Var.i = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b.d = colorStateList;
        j();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        m61 m61Var = this.b;
        if (m61Var.e != mode) {
            m61Var.e = mode;
            j();
            super.invalidateSelf();
        }
    }

    public n61(v32 v32Var) {
        m61 m61Var = new m61();
        m61Var.c = null;
        m61Var.d = null;
        m61Var.e = PorterDuff.Mode.SRC_IN;
        m61Var.f = null;
        m61Var.g = 1.0f;
        m61Var.h = 1.0f;
        m61Var.i = 255;
        m61Var.j = 0;
        m61Var.k = 0;
        m61Var.l = Paint.Style.FILL_AND_STROKE;
        m61Var.a = v32Var;
        m61Var.b = null;
        this(m61Var);
    }
}
