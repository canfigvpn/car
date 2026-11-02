package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class op0 {
    public final y4 a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public op0(Context context, y4 y4Var) {
        this.a = y4Var;
        this.d = new GestureDetector(context, new np0(this));
    }
}
