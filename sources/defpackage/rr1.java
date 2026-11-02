package defpackage;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rr1 extends lv {
    public final aa a;
    public final ud b;
    public final Object c;
    public ot0 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public x91 h;
    public final fa1 i;
    public final ArrayList j;
    public final ArrayList k;
    public final w91 l;
    public final dq0 m;
    public final w91 n;
    public final w91 o;
    public ArrayList p;
    public x91 q;
    public om r;
    public final s82 s;
    public boolean t;
    public final s82 u;
    public final ud v;
    public final qt0 w;
    public final uy x;
    public final iq1 y;
    public static final s82 z = j20.f(bm1.h);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public rr1(uy uyVar) {
        aa aaVar = new aa(new mr1(this, 0));
        this.a = aaVar;
        this.b = new ud(new mr1(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new x91();
        this.i = new fa1(new qv[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new w91();
        this.m = new dq0(25);
        this.n = new w91();
        this.o = new w91();
        this.s = j20.f(null);
        this.u = j20.f(or1.g);
        this.v = new ud(15);
        qt0 qt0Var = new qt0((ot0) uyVar.p(q90.P));
        qt0Var.t(new m(29, this));
        this.w = qt0Var;
        this.x = uyVar.k(aaVar).k(qt0Var);
        this.y = new iq1(3);
    }

    public static final void G(ArrayList arrayList, rr1 rr1Var, qv qvVar) {
        arrayList.clear();
        synchronized (rr1Var.c) {
            Iterator it = rr1Var.k.iterator();
            if (it.hasNext()) {
                ((p81) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(ba1 ba1Var) {
        try {
            if (ba1Var.w() instanceof q62) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            ba1Var.c();
        } catch (Throwable th) {
            ba1Var.c();
            throw th;
        }
    }

    public final boolean A() {
        return this.i.g != 0 || z() || B() || this.l.j();
    }

    public final boolean B() {
        return !this.t && (((ff) ((xf) this.b.c).g).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.h.h() || this.i.g != 0 || z() || B();
        }
        return z2;
    }

    public final List D() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? cb0.e : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        nm nmVarY;
        synchronized (this.c) {
            nmVarY = y();
            if (((or1) this.u.getValue()).compareTo(or1.f) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (nmVarY != null) {
            ((om) nmVarY).i(ll2.a);
        }
    }

    public final void F(qv qvVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((p81) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    public final List H(List list, x91 x91Var) {
        ba1 ba1VarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ((p81) obj).getClass();
            Object arrayList2 = map.get(null);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(null, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            qv qvVar = (qv) entry.getKey();
            List list2 = (List) entry.getValue();
            if (qvVar.z.F) {
                hv.a("Check failed");
            }
            m mVar = new m(28, qvVar);
            kc1 kc1Var = new kc1(7, qvVar, x91Var);
            o62 o62VarH = x62.h();
            ba1 ba1Var = o62VarH instanceof ba1 ? (ba1) o62VarH : null;
            if (ba1Var == null || (ba1VarC = ba1Var.C(mVar, kc1Var)) == null) {
                fu1.h("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                o62 o62VarJ = ba1VarC.j();
                try {
                    synchronized (this.c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                p81 p81Var = (p81) list2.get(i2);
                                w91 w91Var = this.l;
                                p81Var.getClass();
                                Object objA = z81.a(w91Var);
                                arrayList.add(new qj1(p81Var, objA));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                qj1 qj1Var = (qj1) arrayList.get(i3);
                                if (qj1Var.f == null) {
                                    dq0 dq0Var = this.m;
                                    ((p81) qj1Var.e).getClass();
                                    if (((w91) dq0Var.f).b(null)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i4 = 0; i4 < size4; i4++) {
                                            qj1 qj1Var2 = (qj1) arrayList.get(i4);
                                            if (qj1Var2.f == null) {
                                                dq0 dq0Var2 = this.m;
                                                ((p81) qj1Var2.e).getClass();
                                                w91 w91Var2 = (w91) dq0Var2.f;
                                                if (w91Var2.i()) {
                                                    ((w91) dq0Var2.g).a();
                                                }
                                            }
                                            arrayList3.add(qj1Var2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (((qj1) arrayList.get(i5)).f != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (((qj1) arrayList.get(i6)).f == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        qj1 qj1Var3 = (qj1) arrayList.get(i7);
                                        if (qj1Var3.f == null) {
                                        }
                                    }
                                    synchronized (this.c) {
                                        ar.I(arrayList4, this.k);
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Object obj2 = arrayList.get(i8);
                                        if (((qj1) obj2).f != null) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    qvVar.r(arrayList);
                    o62.q(o62VarJ);
                    w(ba1VarC);
                } catch (Throwable th2) {
                    o62.q(o62VarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                w(ba1VarC);
                throw th3;
            }
        }
        return vq.h0(map.keySet());
    }

    public final qv I(qv qvVar, x91 x91Var) {
        ba1 ba1VarC;
        if (qvVar.z.F || qvVar.A == 3) {
            return null;
        }
        x91 x91Var2 = this.q;
        int i = 1;
        if (x91Var2 == null || !x91Var2.c(qvVar)) {
            m mVar = new m(28, qvVar);
            kc1 kc1Var = new kc1(7, qvVar, x91Var);
            o62 o62VarH = x62.h();
            ba1 ba1Var = o62VarH instanceof ba1 ? (ba1) o62VarH : null;
            if (ba1Var == null || (ba1VarC = ba1Var.C(mVar, kc1Var)) == null) {
                fu1.h("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    o62 o62VarJ = ba1VarC.j();
                    if (x91Var != null) {
                        try {
                            if (x91Var.h()) {
                                gp1 gp1Var = new gp1(i, x91Var, qvVar);
                                ak0 ak0Var = qvVar.z;
                                if (ak0Var.F) {
                                    hv.a("Preparing a composition while composing is not supported");
                                }
                                ak0Var.F = true;
                                try {
                                    gp1Var.a();
                                    ak0Var.F = false;
                                } catch (Throwable th) {
                                    ak0Var.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            o62.q(o62VarJ);
                            throw th2;
                        }
                    }
                    boolean zW = qvVar.w();
                    o62.q(o62VarJ);
                    w(ba1VarC);
                    if (zW) {
                        return qvVar;
                    }
                } catch (Throwable th3) {
                    w(ba1VarC);
                    throw th3;
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, qv qvVar) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof ou)) {
            synchronized (this.c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                nr1 nr1Var = (nr1) this.s.getValue();
                if (nr1Var != null) {
                    throw nr1Var.a;
                }
                s82 s82Var = this.s;
                nr1 nr1Var2 = new nr1(th);
                s82Var.getClass();
                s82Var.j(null, nr1Var2);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.j.clear();
                this.i.g();
                this.h = new x91();
                this.k.clear();
                this.l.a();
                this.n.a();
                s82 s82Var2 = this.s;
                nr1 nr1Var3 = new nr1(th);
                s82Var2.getClass();
                s82Var2.j(null, nr1Var3);
                if (qvVar != null) {
                    L(qvVar);
                }
                if (y() != null) {
                    hv.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean zA;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List listD = D();
            lx1 lx1Var = new lx1(this.h);
            this.h = new x91();
            try {
                int size = listD.size();
                for (int i = 0; i < size; i++) {
                    ((qv) listD.get(i)).x(lx1Var);
                    if (((or1) this.u.getValue()).compareTo(or1.f) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zA = A();
                }
                return zA;
            } catch (Throwable th) {
                synchronized (this.c) {
                    x91 x91Var = this.h;
                    int i2 = x91Var.d;
                    Iterator<E> it = lx1Var.iterator();
                    while (it.hasNext()) {
                        x91Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(qv qvVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(qvVar)) {
            arrayList.add(qvVar);
        }
        if (this.f.remove(qvVar)) {
            this.g = null;
        }
    }

    @Override // defpackage.lv
    public final void a(qv qvVar, ij0 ij0Var) throws Throwable {
        or1 or1Var;
        boolean zContains;
        ba1 ba1VarC;
        boolean z2 = qvVar.z.F;
        synchronized (this.c) {
            or1 or1Var2 = (or1) this.u.getValue();
            or1Var = or1.f;
            zContains = or1Var2.compareTo(or1Var) > 0 ? true ^ D().contains(qvVar) : true;
        }
        try {
            m mVar = new m(28, qvVar);
            kc1 kc1Var = new kc1(7, qvVar, (Object) null);
            o62 o62VarH = x62.h();
            ba1 ba1Var = o62VarH instanceof ba1 ? (ba1) o62VarH : null;
            if (ba1Var == null || (ba1VarC = ba1Var.C(mVar, kc1Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                o62 o62VarJ = ba1VarC.j();
                try {
                    qvVar.j(ij0Var);
                    o62.q(o62VarJ);
                    w(ba1VarC);
                    synchronized (this.c) {
                        if (((or1) this.u.getValue()).compareTo(or1Var) > 0 && !D().contains(qvVar)) {
                            this.f.add(qvVar);
                            this.g = null;
                        }
                    }
                    if (!z2) {
                        x62.h().m();
                    }
                    try {
                        F(qvVar);
                        try {
                            qvVar.d();
                            qvVar.f();
                            if (z2) {
                                return;
                            }
                            x62.h().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, qvVar);
                    }
                } catch (Throwable th3) {
                    o62.q(o62VarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                w(ba1VarC);
                throw th4;
            }
        } catch (Throwable th5) {
            if (zContains) {
                synchronized (this.c) {
                }
            }
            J(th5, qvVar);
        }
    }

    @Override // defpackage.lv
    public final x91 b(qv qvVar, v42 v42Var, ij0 ij0Var) {
        ud udVar = this.v;
        try {
            v42 v42Var2 = qvVar.t;
            qvVar.t = v42Var;
            try {
                a(qvVar, ij0Var);
                x91 x91Var = (x91) udVar.f();
                if (x91Var == null) {
                    x91Var = kx1.a;
                    x91Var.getClass();
                }
                qvVar.t = v42Var2;
                udVar.v(null);
                return x91Var;
            } catch (Throwable th) {
                qvVar.t = v42Var2;
                throw th;
            }
        } catch (Throwable th2) {
            udVar.v(null);
            throw th2;
        }
    }

    @Override // defpackage.lv
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.lv
    public final boolean e() {
        return false;
    }

    @Override // defpackage.lv
    public final boolean f() {
        return false;
    }

    @Override // defpackage.lv
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.lv
    public final kv h() {
        return null;
    }

    @Override // defpackage.lv
    public final uy j() {
        return this.x;
    }

    @Override // defpackage.lv
    public final boolean k() {
        return false;
    }

    @Override // defpackage.lv
    public final void l(qv qvVar) throws IllegalAccessException, InvocationTargetException {
        nm nmVarY;
        synchronized (this.c) {
            if (this.i.h(qvVar)) {
                nmVarY = null;
            } else {
                this.i.b(qvVar);
                nmVarY = y();
            }
        }
        if (nmVarY != null) {
            ((om) nmVarY).i(ll2.a);
        }
    }

    @Override // defpackage.lv
    public final o81 m(p81 p81Var) {
        o81 o81Var;
        synchronized (this.c) {
            o81Var = (o81) this.n.k(p81Var);
        }
        return o81Var;
    }

    @Override // defpackage.lv
    public final x91 n(qv qvVar, v42 v42Var, x91 x91Var) {
        ud udVar = this.v;
        try {
            K();
            qvVar.x(new lx1(x91Var));
            v42 v42Var2 = qvVar.t;
            qvVar.t = v42Var;
            try {
                qv qvVarI = I(qvVar, null);
                if (qvVarI != null) {
                    F(qvVar);
                    qvVarI.d();
                    qvVarI.f();
                }
                x91 x91Var2 = (x91) udVar.f();
                if (x91Var2 == null) {
                    x91Var2 = kx1.a;
                    x91Var2.getClass();
                }
                qvVar.t = v42Var2;
                udVar.v(null);
                return x91Var2;
            } catch (Throwable th) {
                qvVar.t = v42Var2;
                throw th;
            }
        } catch (Throwable th2) {
            udVar.v(null);
            throw th2;
        }
    }

    @Override // defpackage.lv
    public final void q(lr1 lr1Var) {
        ud udVar = this.v;
        x91 x91Var = (x91) udVar.f();
        if (x91Var == null) {
            x91 x91Var2 = kx1.a;
            x91Var = new x91();
            udVar.v(x91Var);
        }
        x91Var.a(lr1Var);
    }

    @Override // defpackage.lv
    public final void r(qv qvVar) {
        synchronized (this.c) {
            try {
                x91 x91Var = this.q;
                if (x91Var == null) {
                    x91 x91Var2 = kx1.a;
                    x91Var = new x91();
                    this.q = x91Var;
                }
                x91Var.a(qvVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.lv
    public final pm s(h8 h8Var) {
        ud udVar = this.b;
        xf xfVar = (xf) udVar.c;
        de1 de1Var = new de1();
        de1Var.a = h8Var;
        return xfVar.d(de1Var, (n1) udVar.d);
    }

    @Override // defpackage.lv
    public final void v(qv qvVar) {
        synchronized (this.c) {
            if (this.f.remove(qvVar)) {
                this.g = null;
            }
            this.i.j(qvVar);
            this.j.remove(qvVar);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((or1) this.u.getValue()).compareTo(or1.i) >= 0) {
                s82 s82Var = this.u;
                or1 or1Var = or1.f;
                s82Var.getClass();
                s82Var.j(null, or1Var);
            }
        }
        this.w.d(null);
    }

    public final nm y() {
        s82 s82Var = this.u;
        int iCompareTo = ((or1) s82Var.getValue()).compareTo(or1.f);
        s82 s82Var2 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        fa1 fa1Var = this.i;
        if (iCompareTo > 0) {
            Object value = s82Var2.getValue();
            or1 or1Var = or1.j;
            or1 or1Var2 = or1.g;
            if (value == null) {
                if (this.d == null) {
                    this.h = new x91();
                    fa1Var.g();
                    if (z() || B()) {
                        or1Var2 = or1.h;
                    }
                } else {
                    or1Var2 = (fa1Var.g != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? or1Var : or1.i;
                }
            }
            s82Var.j(null, or1Var2);
            if (or1Var2 != or1Var) {
                return null;
            }
            om omVar = this.r;
            this.r = null;
            return omVar;
        }
        List listD = D();
        int size = listD.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = cb0.e;
        this.h = new x91();
        fa1Var.g();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        om omVar2 = this.r;
        if (omVar2 != null) {
            omVar2.o(null);
        }
        this.r = null;
        s82Var2.i(null);
        return null;
    }

    public final boolean z() {
        return !this.t && (((ff) ((xf) this.a.g).g).get() & 134217727) > 0;
    }

    @Override // defpackage.lv
    public final void o(Set set) {
    }
}
