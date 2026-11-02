package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public enum vc2 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(j20.S, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(j20.T, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(j20.U, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(j20.V, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(j20.W, Build.VERSION.SDK_INT <= 26 ? ir.alirezaivaz.mygarage.R.string.androidx_compose_foundation_autofill : R.string.autofill, 0);

    public final Object e;
    public final int f;
    public final int g;

    vc2(Object obj, int i2, int i3) {
        this.e = obj;
        this.f = i2;
        this.g = i3;
    }
}
