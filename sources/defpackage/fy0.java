package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fy0 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ da1 f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ List h;

    public /* synthetic */ fy0(da1 da1Var, ArrayList arrayList, List list, boolean z, int i) {
        this.e = i;
        this.f = da1Var;
        this.g = arrayList;
        this.h = list;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        List list = this.h;
        ArrayList arrayList = this.g;
        da1 da1Var = this.f;
        ll2 ll2Var = ll2.a;
        im1 im1Var = (im1) obj;
        switch (i) {
            case 0:
                im1Var.e = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((hy0) arrayList.get(i2)).a(im1Var);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((hy0) list.get(i3)).a(im1Var);
                }
                im1Var.e = false;
                da1Var.getValue();
                break;
            default:
                im1Var.e = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((l01) arrayList.get(i4)).a(im1Var);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((l01) list.get(i5)).a(im1Var);
                }
                im1Var.e = false;
                da1Var.getValue();
                break;
        }
        return ll2Var;
    }
}
