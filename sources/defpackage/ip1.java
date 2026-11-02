package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ip1 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ jp1 f;

    public ip1(jp1 jp1Var, List list) {
        this.f = jp1Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            yp0.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
