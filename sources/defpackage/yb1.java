package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yb1 implements Comparable {
    public final zb1 e;
    public final Bundle f;
    public final boolean g;
    public final int h;
    public final boolean i;

    public yb1(zb1 zb1Var, Bundle bundle, boolean z, int i, boolean z2) {
        this.e = zb1Var;
        this.f = bundle;
        this.g = z;
        this.h = i;
        this.i = z2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(yb1 yb1Var) {
        yb1Var.getClass();
        boolean z = yb1Var.i;
        boolean z2 = yb1Var.g;
        Bundle bundle = yb1Var.f;
        boolean z3 = this.g;
        if (z3 && !z2) {
            return 1;
        }
        if (!z3 && z2) {
            return -1;
        }
        int i = this.h - yb1Var.h;
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            bundle.getClass();
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z4 = this.i;
        if (!z4 || z) {
            return (z4 || !z) ? 0 : -1;
        }
        return 1;
    }
}
