package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 implements Iterable, fv0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ xo0(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return new v((Iterator) ((ti0) obj).a());
            default:
                return new v((wb0) obj);
        }
    }
}
