package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import defpackage.bs1;
import defpackage.ei1;
import defpackage.iq1;
import defpackage.qj;
import defpackage.vv;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends vv {
    public final int d;
    public final iq1[] e;
    public final ei1 f;
    public final ei1 g;
    public final int h;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.d = -1;
        new Rect();
        bs1 bs1VarS = vv.s(context, attributeSet, i, i2);
        int i3 = bs1VarS.a;
        if (i3 != 0 && i3 != 1) {
            qj.r("invalid orientation.");
            throw null;
        }
        if (i3 != this.h) {
            this.h = i3;
            ei1 ei1Var = this.f;
            this.f = this.g;
            this.g = ei1Var;
        }
        int i4 = bs1VarS.b;
        if (i4 != this.d) {
            this.d = i4;
            new BitSet(this.d);
            this.e = new iq1[this.d];
            for (int i5 = 0; i5 < this.d; i5++) {
                iq1[] iq1VarArr = this.e;
                iq1 iq1Var = new iq1(12);
                new ArrayList();
                iq1VarArr[i5] = iq1Var;
            }
        }
        this.f = ei1.o(this, this.h);
        this.g = ei1.o(this, 1 - this.h);
    }
}
