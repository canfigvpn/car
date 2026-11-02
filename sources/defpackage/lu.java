package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lu extends RuntimeException {
    public final p91 e;
    public final p91 f;
    public final c91 g;
    public final int h;

    public lu(p91 p91Var, p91 p91Var2, c91 c91Var, int i, Exception exc) {
        super(exc);
        this.e = p91Var;
        this.f = p91Var2;
        this.g = c91Var;
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listU;
        List listH0;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.h);
        sb.append(":\n            |");
        n12 n12VarI = p12.i(new ku(this, null));
        if (n12VarI.hasNext()) {
            Object next = n12VarI.next();
            if (n12VarI.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (n12VarI.hasNext()) {
                    arrayList.add(n12VarI.next());
                }
                listU = arrayList;
            } else {
                listU = vs0.u(next);
            }
        } else {
            listU = cb0.e;
        }
        int size = listU.size();
        if (50 >= size) {
            listH0 = vq.h0(listU);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listU instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listU.get(i));
                }
            } else {
                ListIterator listIterator = listU.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listH0 = arrayList2;
        }
        sb.append(vq.V(listH0, "\n", null, null, null, 62));
        sb.append("\n            ");
        return i92.t(sb.toString());
    }
}
