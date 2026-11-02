package defpackage;

import android.view.View;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vq2 {
    public static final w91 a;

    static {
        long[] jArr = jx1.a;
        a = new w91();
    }

    public static final lv a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof lv) {
            return (lv) tag;
        }
        return null;
    }
}
