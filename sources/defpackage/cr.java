package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cr implements m12 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.m12
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((Iterable) this.b).iterator();
            default:
                return (Iterator) this.b;
        }
    }
}
