package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mm1 extends ReplacementSpan {
    public Paint.FontMetricsInt e;
    public boolean f;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.e;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        ws0.U("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f) {
            return 0;
        }
        wp0.b("PlaceholderSpan is not laid out yet.");
        return 0;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.f = true;
        paint.getTextSize();
        this.e = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            wp0.a("Invalid fontMetrics: line height can not be negative.");
        }
        throw null;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
