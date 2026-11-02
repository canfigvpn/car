package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hc extends SegmentFinder {
    public final /* synthetic */ ru1 a;

    public hc(ru1 ru1Var) {
        this.a = ru1Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.b(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.d(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.a(i);
    }
}
