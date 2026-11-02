package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class br implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;

    public /* synthetic */ br(int i, List list) {
        this.e = i;
        this.f = list;
    }

    @Override // defpackage.ti0
    public final Object a() {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                return list.iterator();
            case 1:
                return ((nv0) list.get(0)).a.a.b();
            default:
                return ((nv0) list.get(0)).a.a.b();
        }
    }
}
