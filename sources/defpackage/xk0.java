package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 extends rw {
    public final CharSequence e;
    public final TextPaint f;

    public xk0(CharSequence charSequence, TextPaint textPaint) {
        this.e = charSequence;
        this.f = textPaint;
    }

    @Override // defpackage.rw
    public final int G(int i) {
        CharSequence charSequence = this.e;
        return this.f.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.rw
    public final int K(int i) {
        CharSequence charSequence = this.e;
        return this.f.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
