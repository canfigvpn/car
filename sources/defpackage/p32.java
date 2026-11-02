package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p32 extends CharacterStyle implements UpdateAppearance {
    public final sk e;
    public final float f;
    public final dk1 g = y12.s(new d52(9205357640488583168L));
    public final v40 h = e72.b(new r12(3, this));

    public p32(sk skVar, float f) {
        this.e = skVar;
        this.f = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        dv1.K(textPaint, this.f);
        textPaint.setShader((Shader) this.h.getValue());
    }
}
