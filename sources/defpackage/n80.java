package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class n80 extends CharacterStyle implements UpdateAppearance {
    public final m80 e;

    public n80(m80 m80Var) {
        this.e = m80Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            fd0 fd0Var = fd0.a;
            m80 m80Var = this.e;
            if (ws0.j(m80Var, fd0Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(m80Var instanceof p92)) {
                qj.p();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            p92 p92Var = (p92) m80Var;
            textPaint.setStrokeWidth(p92Var.a);
            textPaint.setStrokeMiter(p92Var.b);
            int i = p92Var.d;
            if (i == 0) {
                join = Paint.Join.MITER;
            } else if (i == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i2 = p92Var.c;
            if (i2 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i2 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            textPaint.setPathEffect(null);
        }
    }
}
