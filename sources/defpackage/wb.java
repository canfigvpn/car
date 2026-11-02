package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wb implements Appendable {
    public final StringBuilder e = new StringBuilder(16);
    public final ArrayList f;

    public wb(yb ybVar) {
        new ArrayList();
        this.f = new ArrayList();
        new ArrayList();
        a(ybVar);
    }

    public final void a(yb ybVar) {
        StringBuilder sb = this.e;
        int length = sb.length();
        sb.append(ybVar.f);
        List list = ybVar.e;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                xb xbVar = (xb) list.get(i);
                this.f.add(new vb(xbVar.b + length, xbVar.c + length, xbVar.a, xbVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof yb;
        StringBuilder sb = this.e;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        yb ybVar = (yb) charSequence;
        int length = sb.length();
        sb.append((CharSequence) ybVar.f, i, i2);
        List listA = zb.a(ybVar, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                xb xbVar = (xb) listA.get(i3);
                this.f.add(new vb(xbVar.b + length, xbVar.c + length, xbVar.a, xbVar.d));
            }
        }
        return this;
    }

    public final yb b() {
        StringBuilder sb = this.e;
        String string = sb.toString();
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vb vbVar = (vb) arrayList.get(i);
            int length = sb.length();
            int i2 = vbVar.c;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                wp0.b("Item.end should be set first");
            }
            arrayList2.add(new xb(vbVar.b, length, vbVar.a, vbVar.d));
        }
        return new yb(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof yb) {
            a((yb) charSequence);
            return this;
        }
        this.e.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.e.append(c);
        return this;
    }
}
