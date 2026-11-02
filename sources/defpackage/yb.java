package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yb implements CharSequence {
    public final List e;
    public final String f;
    public final ArrayList g;
    public final ArrayList h;

    static {
        ru1 ru1Var = ax1.a;
    }

    public yb(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.e = list;
        this.f = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                xb xbVar = (xb) list.get(i);
                Object obj = xbVar.a;
                if (obj instanceof r72) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(xbVar);
                } else if (obj instanceof wj1) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(xbVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.g = arrayList;
        this.h = arrayList2;
        List listD0 = arrayList2 != null ? vq.d0(arrayList2, new dg0(5)) : null;
        if (listD0 == null || listD0.isEmpty()) {
            return;
        }
        int i2 = ((xb) vq.Q(listD0)).c;
        c91 c91Var = fr0.a;
        c91 c91Var2 = new c91(1);
        c91Var2.a(i2);
        int size2 = listD0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            xb xbVar2 = (xb) listD0.get(i3);
            while (true) {
                int i4 = c91Var2.b;
                if (i4 == 0) {
                    break;
                }
                if (i4 == 0) {
                    fu1.k("IntList is empty.");
                    throw null;
                }
                int i5 = c91Var2.a[i4 - 1];
                int i6 = xbVar2.b;
                int i7 = xbVar2.c;
                if (i6 < i5) {
                    if (i7 > i5) {
                        wp0.a("Paragraph overlap not allowed, end " + i7 + " should be less than or equal to " + i5);
                        break;
                    }
                    break;
                }
                c91Var2.c(i4 - 1);
            }
            c91Var2.a(xbVar2.c);
        }
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yb subSequence(int i, int i2) {
        if (!(i <= i2)) {
            wp0.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.f;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        yb ybVar = zb.a;
        if (i > i2) {
            wp0.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.e;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                xb xbVar = (xb) list.get(i3);
                int i4 = xbVar.b;
                int i5 = xbVar.c;
                if (zb.b(i, i2, i4, i5)) {
                    arrayList2.add(new xb(Math.max(i, xbVar.b) - i, Math.min(i2, i5) - i, xbVar.a, xbVar.d));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new yb(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb)) {
            return false;
        }
        yb ybVar = (yb) obj;
        return ws0.j(this.f, ybVar.f) && ws0.j(this.e, ybVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f;
    }

    public /* synthetic */ yb(String str) {
        this(str, cb0.e);
    }

    public yb(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
