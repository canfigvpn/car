package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class a82 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ b82 a;
    public final /* synthetic */ MainActivity b;

    public a82(b82 b82Var, MainActivity mainActivity) {
        this.a = b82Var;
        this.b = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (o5.x(view2)) {
            this.a.j = b82.m(o5.n(view2));
            View decorView = this.b.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
