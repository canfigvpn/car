package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vc implements Runnable {
    public final /* synthetic */ TextView e;
    public final /* synthetic */ Typeface f;
    public final /* synthetic */ int g;

    public vc(TextView textView, Typeface typeface, int i) {
        this.e = textView;
        this.f = typeface;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.setTypeface(this.f, this.g);
    }
}
