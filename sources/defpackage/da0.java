package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class da0 implements e30 {
    public final /* synthetic */ b21 e;

    public da0(EmojiCompatInitializer emojiCompatInitializer, b21 b21Var) {
        this.e = b21Var;
    }

    @Override // defpackage.e30
    public final void h(y11 y11Var) {
        (Build.VERSION.SDK_INT >= 28 ? cw.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new fa0(), 500L);
        this.e.f(this);
    }
}
