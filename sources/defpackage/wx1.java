package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wx1 implements bj1 {
    public final int e;
    public final List f;
    public Float g = null;
    public Float h = null;
    public nx1 i = null;
    public nx1 j = null;

    public wx1(int i, ArrayList arrayList) {
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.bj1
    public final boolean y() {
        return this.f.contains(this);
    }
}
