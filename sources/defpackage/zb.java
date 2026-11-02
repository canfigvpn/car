package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zb {
    public static final yb a = new yb("");

    public static final List a(yb ybVar, int i, int i2, s1 s1Var) {
        List list;
        if (i == i2 || (list = ybVar.e) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= ybVar.f.length()) {
            if (s1Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) s1Var.h(((xb) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            xb xbVar = (xb) list.get(i3);
            if (s1Var != null ? ((Boolean) s1Var.h(xbVar.a)).booleanValue() : true) {
                int i4 = xbVar.b;
                int i5 = xbVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new xb(ex.h(xbVar.b, i, i2) - i, ex.h(i5, i, i2) - i, (ub) xbVar.a, xbVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
