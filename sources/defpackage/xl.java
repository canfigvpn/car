package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xl implements wl {
    public final int[] a;
    public final float[] b;

    public xl(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.wl
    public void a(View view, float[] fArr) {
        q61.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            float f = -view.getScrollX();
            float f2 = -view.getScrollY();
            q61.d(fArr2);
            q61.f(fArr2, f, f2);
            s5.K(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            q61.d(fArr2);
            q61.f(fArr2, left, top);
            s5.K(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            float f3 = -view.getScrollX();
            float f4 = -view.getScrollY();
            q61.d(fArr2);
            q61.f(fArr2, f3, f4);
            s5.K(fArr, fArr2);
            float f5 = iArr[0];
            float f6 = iArr[1];
            q61.d(fArr2);
            q61.f(fArr2, f5, f6);
            s5.K(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        s5.R(matrix, fArr2);
        s5.K(fArr, fArr2);
    }

    public xl(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public xl(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public xl(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
