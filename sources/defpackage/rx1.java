package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rx1 implements sx1 {
    public final ScrollFeedbackProvider e;

    public rx1(NestedScrollView nestedScrollView) {
        this.e = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.sx1
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.e.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.sx1
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.e.onScrollProgress(i, i2, i3, i4);
    }
}
