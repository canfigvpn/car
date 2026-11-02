package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bq {
    public final String a;
    public List b = cb0.e;
    public final ArrayList c = new ArrayList();
    public final HashSet d = new HashSet();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public bq(String str) {
        this.a = str;
    }

    public static void a(bq bqVar, String str, s12 s12Var) {
        s12Var.getClass();
        if (!bqVar.d.add(str)) {
            qj.k("Element with name '", str, "' is already registered in ", bqVar.a);
            return;
        }
        bqVar.c.add(str);
        bqVar.e.add(s12Var);
        bqVar.f.add(cb0.e);
        bqVar.g.add(false);
    }
}
