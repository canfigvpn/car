package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zr0 extends uq {
    public final uc1 q;

    public zr0(Class cls) {
        super(true);
        this.q = new uc1(cls);
    }

    @Override // defpackage.xc1
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // defpackage.xc1
    public final String b() {
        return "List<" + this.q.r.getName() + "}>";
    }

    @Override // defpackage.xc1
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        uc1 uc1Var = this.q;
        return list != null ? vq.a0(list, vs0.u(uc1Var.d(str))) : vs0.u(uc1Var.d(str));
    }

    @Override // defpackage.xc1
    public final Object d(String str) {
        return vs0.u(this.q.d(str));
    }

    @Override // defpackage.xc1
    public final void e(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new ArrayList(list) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr0)) {
            return false;
        }
        return this.q.equals(((zr0) obj).q);
    }

    @Override // defpackage.uq
    public final Object g() {
        return cb0.e;
    }

    @Override // defpackage.uq
    public final List h(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return cb0.e;
        }
        ArrayList arrayList = new ArrayList(wq.G(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).toString());
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.q.q.hashCode();
    }
}
