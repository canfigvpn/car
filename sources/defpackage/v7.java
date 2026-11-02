package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class v7 {
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public v7(Bundle bundle) {
        bundle.getClass();
        this.b = vv.x("nav-entry-state:id", bundle);
        this.a = vv.p("nav-entry-state:destination-id", bundle);
        this.c = vv.u("nav-entry-state:args", bundle);
        this.d = vv.u("nav-entry-state:saved-state", bundle);
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : w7.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : w7.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void d(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(s5.U(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(s5.V(i)));
        }
    }

    public void e(long j) {
        ((Paint) this.b).setColor(ws0.V(j));
    }

    public void f(yi yiVar) {
        this.d = yiVar;
        ((Paint) this.b).setColorFilter(yiVar != null ? yiVar.a : null);
    }

    public void g(int i) {
        ((Paint) this.b).setFilterBitmap(!(i == 0));
    }

    public void h(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void i(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.b;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public void j(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.b;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public void k(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public void l(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public v7(kb1 kb1Var, int i) {
        this.b = kb1Var.j;
        this.a = i;
        mb1 mb1Var = kb1Var.l;
        this.c = mb1Var.a();
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        this.d = bundleW;
        mb1Var.h.n(bundleW);
    }

    public v7(Paint paint) {
        this.b = paint;
        this.a = 3;
    }
}
