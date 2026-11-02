package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k61 extends n {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ k61(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.n
    public final int a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((Matcher) ((ud) obj).b).groupCount() + 1;
            default:
                return ((tl1) obj).f;
        }
    }

    public j61 b(int i) {
        Matcher matcher = (Matcher) ((ud) this.f).b;
        lr0 lr0VarS = ex.S(matcher.start(i), matcher.end(i));
        if (lr0VarS.e < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new j61(strGroup, lr0VarS);
    }

    @Override // defpackage.n, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                if (obj == null ? true : obj instanceof j61) {
                    return super.contains((j61) obj);
                }
                return false;
            default:
                return ((tl1) this.f).containsValue(obj);
        }
    }

    @Override // defpackage.n, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new ci2(new tb2(new cr(0, new lr0(0, size() - 1, 1)), new m(20, this), 1));
            default:
                wi2 wi2Var = ((tl1) this.f).e;
                xi2[] xi2VarArr = new xi2[8];
                for (int i = 0; i < 8; i++) {
                    xi2VarArr[i] = new yi2(2);
                }
                return new am1(wi2Var, xi2VarArr);
        }
    }
}
