package defpackage;

import android.content.Context;
import android.util.TypedValue;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w90 {
    public final boolean a;
    public final int b;
    public final int c;

    static {
        Math.round(5.1000000000000005d);
    }

    public w90(Context context) {
        TypedValue typedValue = new TypedValue();
        typedValue = context.getTheme().resolveAttribute(R.attr.elevationOverlayEnabled, typedValue, true) ? typedValue : null;
        boolean z = (typedValue == null || typedValue.type != 18 || typedValue.data == 0) ? false : true;
        int iT = ux.t(context, R.attr.elevationOverlayColor);
        ux.t(context, R.attr.elevationOverlayAccentColor);
        int iT2 = ux.t(context, R.attr.colorSurface);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = z;
        this.b = iT;
        this.c = iT2;
    }
}
