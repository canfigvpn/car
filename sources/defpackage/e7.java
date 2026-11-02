package defpackage;

import android.content.Context;
import android.view.View;
import ir.alirezaivaz.mygarage.R;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e7(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
                f7 f7Var = (f7) this.f;
                Context context = view.getContext();
                if (!f7Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(f7Var.e);
                    f7Var.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                f7 f7Var = (f7) obj;
                Context context = view.getContext();
                if (f7Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(f7Var.e);
                    f7Var.d = false;
                }
                break;
            case 1:
                r rVar = (r) obj;
                for (Object obj2 : o12.t(rVar.getParent(), qn2.l)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                rVar.f();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((j82) obj).d(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
