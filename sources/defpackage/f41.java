package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f41 extends un2 {
    public final q22 b;
    public final vn c;
    public final a41 d;
    public final long e;
    public List f;
    public final s82 g;
    public final jr1 h;

    public f41(q22 q22Var, vn vnVar, jb2 jb2Var, kw1 kw1Var) {
        q22Var.getClass();
        vnVar.getClass();
        jb2Var.getClass();
        kw1Var.getClass();
        this.b = q22Var;
        this.c = vnVar;
        a41 a41Var = (a41) sv.X(kw1Var, js1.a(a41.class));
        this.d = a41Var;
        this.e = a41Var.a;
        cb0 cb0Var = cb0.e;
        this.f = cb0Var;
        s82 s82VarF = j20.f(new d41(a41Var.b, cb0Var, a41Var.c, jb2.a(), "", null, "", "", "", d22.e, cb0Var, false, false));
        this.g = s82VarF;
        this.h = new jr1(s82VarF);
        nj2.y(s5.H(this), null, new g(13, null, this), 3);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    public final List e(long j) {
        Object next;
        List<String> list;
        Object next2;
        Object next3;
        js jsVar;
        d41 d41Var = (d41) this.g.getValue();
        Iterator it = d41Var.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((u22) next).a != j);
        u22 u22Var = (u22) next;
        cb0 cb0Var = cb0.e;
        if (u22Var == null || (list = (List) e22.c.get(u22Var.b)) == null) {
            return cb0Var;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Iterator it2 = d41Var.b.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!ws0.j(((u22) next2).b, str));
            u22 u22Var2 = (u22) next2;
            if (u22Var2 == null) {
                jsVar = null;
            } else {
                Iterator it3 = this.f.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (((r22) next3).b != u22Var2.a);
                r22 r22Var = (r22) next3;
                if (r22Var == null) {
                    jsVar = null;
                } else {
                    if (!r22Var.e) {
                        r22Var = null;
                    }
                    if (r22Var == null) {
                        jsVar = null;
                    } else {
                        jsVar = new js(u22Var2, is.e, "");
                    }
                }
            }
            if (jsVar != null) {
                arrayList.add(jsVar);
            }
        }
        return arrayList;
    }

    public final void f(d22 d22Var) {
        s82 s82Var;
        Object value;
        do {
            s82Var = this.g;
            value = s82Var.getValue();
        } while (!s82Var.h(value, d41.a((d41) value, null, 0L, 0, null, null, null, null, null, d22Var, null, false, 7679)));
    }
}
