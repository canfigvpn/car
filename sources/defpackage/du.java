package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class du extends ClickableSpan {
    public final w21 e;

    public du(w21 w21Var) {
        this.e = w21Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.e.getClass();
    }
}
