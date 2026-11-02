package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qu1 extends ViewGroup {
    public final int e;
    public final ArrayList f;
    public final ArrayList g;
    public final ru1 h;
    public int i;

    public qu1(Context context) {
        super(context);
        this.e = 5;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.g = arrayList2;
        this.h = new ru1(0);
        setClipChildren(false);
        su1 su1Var = new su1(context);
        addView(su1Var);
        arrayList.add(su1Var);
        arrayList2.add(su1Var);
        this.i = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
