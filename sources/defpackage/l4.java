package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class l4 implements mq {
    public final m4 a;

    public l4(m4 m4Var) {
        this.a = m4Var;
    }

    public final void a(lq lqVar) {
        m4 m4Var = this.a;
        if (lqVar != null) {
            m4Var.a().setPrimaryClip(lqVar.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            m4Var.a().clearPrimaryClip();
        } else {
            m4Var.a().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
