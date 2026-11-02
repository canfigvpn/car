package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Collection f;

    public /* synthetic */ c0(int i, Collection collection) {
        this.e = i;
        this.f = collection;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        boolean zContains;
        int i = this.e;
        Collection<?> collection = this.f;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
