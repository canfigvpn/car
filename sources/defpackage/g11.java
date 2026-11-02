package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g11 {
    public final View a;
    public final dq0 b;
    public f11 e;
    public me2 f;
    public on2 g;
    public Rect l;
    public final b11 m;
    public ej0 c = new o01(2);
    public ej0 d = new o01(3);
    public te2 h = new te2("", of2.b, 4);
    public oo0 i = oo0.g;
    public final ArrayList j = new ArrayList();
    public final rx0 k = vv.F(v01.f, new w8(14, this));

    public g11(View view, l7 l7Var, dq0 dq0Var) {
        this.a = view;
        this.b = dq0Var;
        this.m = new b11(l7Var, dq0Var);
    }

    public final vr1 a(EditorInfo editorInfo) {
        int i;
        int i2;
        te2 te2Var = this.h;
        String str = te2Var.a.f;
        long j = te2Var.b;
        oo0 oo0Var = this.i;
        int i3 = oo0Var.e;
        int i4 = oo0Var.d;
        boolean z = oo0Var.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                fu1.h("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        q31 q31Var = oo0Var.f;
        if (ws0.j(q31Var, q31.g)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(wq.G(q31Var, 10));
            Iterator it = q31Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((p31) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                fu1.h("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (oo0Var.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 1) == 1) {
            int i5 = oo0Var.b;
            if (i5 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i5 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i5 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (oo0Var.c) {
                editorInfo.inputType = 32768 | i2;
            }
        }
        int i6 = of2.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        sv.T(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!t92.a || i4 == 7 || i4 == 8) {
            if (Build.VERSION.SDK_INT >= 35) {
                t90.b(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                t90.b(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(vs0.v(i7.l(), i7.y(), i7.u(), i7.w(), i7.z(), i7.A(), i7.B()));
            editorInfo.setSupportedHandwritingGesturePreviews(ve.O0(new Class[]{i7.l(), i7.y(), i7.u(), i7.w()}));
        }
        c11 c11Var = d11.a;
        if (ca0.d()) {
            ca0.a().i(editorInfo);
        }
        vr1 vr1Var = new vr1(this.h, new ao2(25, this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(vr1Var));
        return vr1Var;
    }
}
