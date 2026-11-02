package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m61 extends Drawable.ConstantState {
    public v32 a;
    public w90 b;
    public ColorStateList c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public Rect f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public Paint.Style l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        n61 n61Var = new n61(this);
        n61Var.f = true;
        n61Var.g = true;
        return n61Var;
    }
}
