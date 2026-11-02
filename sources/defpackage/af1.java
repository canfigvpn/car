package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class af1 extends ze1 {
    @Override // defpackage.ze1, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        vr1 vr1Var = this.b;
        if (vr1Var != null) {
            return vr1Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
