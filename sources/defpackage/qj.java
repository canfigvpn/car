package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import ir.alirezaivaz.mygarage.MainActivity;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj implements pm, s60, c90, v42, io2 {
    public final /* synthetic */ int e;

    public /* synthetic */ qj(int i) {
        this.e = i;
    }

    public static /* synthetic */ void e() {
        throw new ps();
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void n(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void p() {
        throw new ps();
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void t() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static void v(qk1 qk1Var) {
        int i = MainActivity.D;
        qk1Var.getClass();
        ru1 ru1Var = (ru1) qk1Var.f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(ru1Var.l(), (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(ru1Var.j(), (Property<View, Float>) View.SCALE_X, 1.0f, 1.3f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(ru1Var.j(), (Property<View, Float>) View.SCALE_Y, 1.0f, 1.3f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.addListener(new k51(qk1Var));
        animatorSet.start();
    }

    @Override // defpackage.io2
    public bi2 a(yb ybVar) {
        ybVar.getClass();
        return new bi2(new yb(dv1.N(ybVar.f)), wf1.a);
    }

    @Override // defpackage.v42
    public boolean b() {
        return false;
    }

    @Override // defpackage.s60
    public double d(double d) {
        switch (this.e) {
            case 2:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 3:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 4:
                float[] fArr = qr.a;
                return qr.b(qr.c, d);
            case 5:
                float[] fArr2 = qr.a;
                return qr.a(qr.c, d);
            case 6:
                float[] fArr3 = qr.a;
                return qr.d(qr.d, d);
            default:
                float[] fArr4 = qr.a;
                return qr.c(qr.d, d);
        }
    }

    @Override // defpackage.pm
    public void cancel() {
    }

    @Override // defpackage.c90
    public float c(float f) {
        return f;
    }
}
