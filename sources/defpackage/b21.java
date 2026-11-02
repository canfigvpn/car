package defpackage;

import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b21 {
    public final boolean a;
    public ud b;
    public final mo2 c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public r11 h;
    public final s82 i;

    public b21(y11 y11Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new ud(6);
        this.c = new mo2(y11Var);
        this.g = new ArrayList();
        r11 r11Var = r11.f;
        this.h = r11Var;
        this.i = j20.f(r11Var);
    }

    public final void a(x11 x11Var) {
        w11 g30Var;
        a21 a21Var;
        y11 y11Var;
        q11 q11Var;
        x11Var.getClass();
        c("addObserver");
        r11 r11Var = this.h;
        r11 r11Var2 = r11.e;
        if (r11Var != r11Var2) {
            r11Var2 = r11.f;
        }
        a21 a21Var2 = new a21();
        a21Var2.a = r11Var2;
        HashMap map = g21.a;
        boolean z = x11Var instanceof w11;
        boolean z2 = x11Var instanceof e30;
        int i = 2;
        Object obj = null;
        int i2 = 0;
        if (z && z2) {
            g30Var = new g30(i2, (e30) x11Var, (w11) x11Var);
        } else if (z2) {
            g30Var = new g30(i2, (e30) x11Var, obj);
        } else if (z) {
            g30Var = (w11) x11Var;
        } else {
            Class<?> cls = x11Var.getClass();
            if (g21.b(cls) == 2) {
                Object obj2 = g21.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    g21.a((Constructor) list.get(0), x11Var);
                    throw null;
                }
                int size = list.size();
                jk0[] jk0VarArr = new jk0[size];
                if (size > 0) {
                    g21.a((Constructor) list.get(0), x11Var);
                    throw null;
                }
                g30Var = new xr1(i, jk0VarArr);
            } else {
                g30Var = new g30(x11Var);
            }
        }
        a21Var2.b = g30Var;
        ud udVar = this.b;
        udVar.getClass();
        w91 w91Var = (w91) udVar.b;
        ed0 ed0Var = (ed0) w91Var.g(x11Var);
        if (ed0Var != null) {
            a21Var = ed0Var.f;
        } else {
            ed0 ed0Var2 = new ed0(x11Var, a21Var2);
            w91Var.m(x11Var, ed0Var2);
            ed0 ed0Var3 = (ed0) udVar.d;
            if (ed0Var3 == null) {
                udVar.c = ed0Var2;
                udVar.d = ed0Var2;
            } else {
                ed0Var3.g = ed0Var2;
                ed0Var2.h = ed0Var3;
                udVar.d = ed0Var2;
            }
            a21Var = null;
        }
        if (a21Var == null && (y11Var = (y11) this.c.a.get()) != null) {
            i2 = (this.d != 0 || this.e) ? 1 : 0;
            r11 r11VarB = b(x11Var);
            this.d++;
            while (a21Var2.a.compareTo(r11VarB) < 0) {
                ud udVar2 = this.b;
                udVar2.getClass();
                if (!((w91) udVar2.b).c(x11Var)) {
                    break;
                }
                r11 r11Var3 = a21Var2.a;
                ArrayList arrayList = this.g;
                arrayList.add(r11Var3);
                o11 o11Var = q11.Companion;
                r11 r11Var4 = a21Var2.a;
                o11Var.getClass();
                r11Var4.getClass();
                int iOrdinal = r11Var4.ordinal();
                if (iOrdinal == 1) {
                    q11Var = q11.ON_CREATE;
                } else if (iOrdinal != 2) {
                    q11Var = iOrdinal != 3 ? null : q11.ON_RESUME;
                } else {
                    q11Var = q11.ON_START;
                }
                if (q11Var == null) {
                    qj.q(a21Var2.a, "no event up from ");
                    return;
                } else {
                    a21Var2.a(y11Var, q11Var);
                    ar.M(arrayList);
                    r11VarB = b(x11Var);
                }
            }
            if (i2 == 0) {
                g();
            }
            this.d--;
        }
    }

    public final r11 b(x11 x11Var) {
        ud udVar = this.b;
        udVar.getClass();
        x11Var.getClass();
        ed0 ed0Var = (ed0) ((w91) udVar.b).g(x11Var);
        ed0 ed0Var2 = ed0Var != null ? ed0Var.h : null;
        r11 r11Var = ed0Var2 != null ? ed0Var2.f.a : null;
        ArrayList arrayList = this.g;
        r11 r11Var2 = arrayList.isEmpty() ? null : (r11) arrayList.get(arrayList.size() - 1);
        r11 r11Var3 = this.h;
        if (r11Var == null || r11Var.compareTo(r11Var3) >= 0) {
            r11Var = r11Var3;
        }
        return (r11Var2 == null || r11Var2.compareTo(r11Var) >= 0) ? r11Var : r11Var2;
    }

    public final void c(String str) {
        if (this.a) {
            de.y().getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(k3.j("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(q11 q11Var) {
        q11Var.getClass();
        c("handleLifecycleEvent");
        e(q11Var.a());
    }

    public final void e(r11 r11Var) {
        if (this.h == r11Var) {
            return;
        }
        y11 y11Var = (y11) this.c.a.get();
        r11 r11Var2 = this.h;
        r11 r11Var3 = r11.f;
        r11 r11Var4 = r11.e;
        if (r11Var2 == r11Var3 && r11Var == r11Var4) {
            throw new IllegalStateException(("State must be at least '" + r11.g + "' to be moved to '" + r11Var + "' in component " + y11Var).toString());
        }
        if (r11Var2 == r11Var4 && r11Var2 != r11Var) {
            throw new IllegalStateException(("State is '" + r11Var4 + "' and cannot be moved to `" + r11Var + "` in component " + y11Var).toString());
        }
        this.h = r11Var;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        g();
        this.e = false;
        if (this.h == r11Var4) {
            this.b = new ud(6);
        }
    }

    public final void f(x11 x11Var) {
        x11Var.getClass();
        c("removeObserver");
        ud udVar = this.b;
        udVar.getClass();
        ed0 ed0Var = (ed0) ((w91) udVar.b).k(x11Var);
        if (ed0Var == null) {
            return;
        }
        ed0 ed0Var2 = ed0Var.h;
        ed0 ed0Var3 = ed0Var.g;
        if (ed0Var2 == null) {
            udVar.c = ed0Var3;
        } else {
            ed0Var2.g = ed0Var3;
        }
        ed0 ed0Var4 = ed0Var.g;
        if (ed0Var4 == null) {
            udVar.d = ed0Var2;
        } else {
            ed0Var4.h = ed0Var2;
        }
        ed0Var.i = true;
    }

    public final void g() {
        Object obj = this.c.a.get();
        if (obj == null) {
            fu1.h("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final y11 y11Var = (y11) obj;
        while (true) {
            ud udVar = this.b;
            final int i = 0;
            if (((w91) udVar.b).e == 0) {
                break;
            }
            ed0 ed0Var = (ed0) udVar.c;
            if (ed0Var == null) {
                fu1.k("Collection is empty.");
                return;
            }
            r11 r11Var = ed0Var.f.a;
            ed0 ed0Var2 = (ed0) udVar.d;
            if (ed0Var2 == null) {
                fu1.k("Collection is empty.");
                return;
            }
            r11 r11Var2 = ed0Var2.f.a;
            if (r11Var == r11Var2 && this.h == r11Var2) {
                break;
            }
            this.f = false;
            r11 r11Var3 = this.h;
            if (ed0Var == null) {
                fu1.k("Collection is empty.");
                return;
            }
            if (r11Var3.compareTo(r11Var) < 0) {
                ud udVar2 = this.b;
                ej0 ej0Var = new ej0(this) { // from class: z11
                    public final /* synthetic */ b21 f;

                    {
                        this.f = this;
                    }

                    @Override // defpackage.ej0
                    public final Object h(Object obj2) {
                        q11 q11Var;
                        q11 q11Var2;
                        int i2 = i;
                        ll2 ll2Var = ll2.a;
                        y11 y11Var2 = y11Var;
                        b21 b21Var = this.f;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                x11 x11Var = (x11) entry.getKey();
                                a21 a21Var = (a21) entry.getValue();
                                while (true) {
                                    r11 r11Var4 = a21Var.a;
                                    r11 r11Var5 = b21Var.h;
                                    ArrayList arrayList = b21Var.g;
                                    if (r11Var4.compareTo(r11Var5) <= 0 || b21Var.f) {
                                        return ll2Var;
                                    }
                                    ud udVar3 = b21Var.b;
                                    udVar3.getClass();
                                    x11Var.getClass();
                                    if (!((w91) udVar3.b).c(x11Var)) {
                                        return ll2Var;
                                    }
                                    o11 o11Var = q11.Companion;
                                    r11 r11Var6 = a21Var.a;
                                    o11Var.getClass();
                                    r11Var6.getClass();
                                    int iOrdinal = r11Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        q11Var = q11.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        q11Var = iOrdinal != 4 ? null : q11.ON_PAUSE;
                                    } else {
                                        q11Var = q11.ON_STOP;
                                    }
                                    if (q11Var == null) {
                                        qj.u(a21Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(q11Var.a());
                                    a21Var.a(y11Var2, q11Var);
                                    ar.M(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                x11 x11Var2 = (x11) entry.getKey();
                                a21 a21Var2 = (a21) entry.getValue();
                                while (true) {
                                    r11 r11Var7 = a21Var2.a;
                                    r11 r11Var8 = b21Var.h;
                                    ArrayList arrayList2 = b21Var.g;
                                    if (r11Var7.compareTo(r11Var8) >= 0 || b21Var.f) {
                                        return ll2Var;
                                    }
                                    ud udVar4 = b21Var.b;
                                    udVar4.getClass();
                                    x11Var2.getClass();
                                    if (!((w91) udVar4.b).c(x11Var2)) {
                                        return ll2Var;
                                    }
                                    arrayList2.add(a21Var2.a);
                                    o11 o11Var2 = q11.Companion;
                                    r11 r11Var9 = a21Var2.a;
                                    o11Var2.getClass();
                                    r11Var9.getClass();
                                    int iOrdinal2 = r11Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        q11Var2 = q11.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        q11Var2 = iOrdinal2 != 3 ? null : q11.ON_RESUME;
                                    } else {
                                        q11Var2 = q11.ON_START;
                                    }
                                    if (q11Var2 == null) {
                                        qj.u(a21Var2.a, "no event up from ");
                                        return null;
                                    }
                                    a21Var2.a(y11Var2, q11Var2);
                                    ar.M(arrayList2);
                                }
                                break;
                        }
                    }
                };
                udVar2.getClass();
                for (ed0 ed0Var3 = (ed0) udVar2.d; ed0Var3 != null; ed0Var3 = ed0Var3.h) {
                    if (!ed0Var3.i) {
                        ej0Var.h(ed0Var3);
                    }
                }
            }
            ed0 ed0Var4 = (ed0) this.b.d;
            if (!this.f && ed0Var4 != null && this.h.compareTo(ed0Var4.f.a) > 0) {
                ud udVar3 = this.b;
                final int i2 = 1;
                ej0 ej0Var2 = new ej0(this) { // from class: z11
                    public final /* synthetic */ b21 f;

                    {
                        this.f = this;
                    }

                    @Override // defpackage.ej0
                    public final Object h(Object obj2) {
                        q11 q11Var;
                        q11 q11Var2;
                        int i3 = i2;
                        ll2 ll2Var = ll2.a;
                        y11 y11Var2 = y11Var;
                        b21 b21Var = this.f;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i3) {
                            case 0:
                                entry.getClass();
                                x11 x11Var = (x11) entry.getKey();
                                a21 a21Var = (a21) entry.getValue();
                                while (true) {
                                    r11 r11Var4 = a21Var.a;
                                    r11 r11Var5 = b21Var.h;
                                    ArrayList arrayList = b21Var.g;
                                    if (r11Var4.compareTo(r11Var5) <= 0 || b21Var.f) {
                                        return ll2Var;
                                    }
                                    ud udVar4 = b21Var.b;
                                    udVar4.getClass();
                                    x11Var.getClass();
                                    if (!((w91) udVar4.b).c(x11Var)) {
                                        return ll2Var;
                                    }
                                    o11 o11Var = q11.Companion;
                                    r11 r11Var6 = a21Var.a;
                                    o11Var.getClass();
                                    r11Var6.getClass();
                                    int iOrdinal = r11Var6.ordinal();
                                    if (iOrdinal == 2) {
                                        q11Var = q11.ON_DESTROY;
                                    } else if (iOrdinal != 3) {
                                        q11Var = iOrdinal != 4 ? null : q11.ON_PAUSE;
                                    } else {
                                        q11Var = q11.ON_STOP;
                                    }
                                    if (q11Var == null) {
                                        qj.u(a21Var.a, "no event down from ");
                                        return null;
                                    }
                                    arrayList.add(q11Var.a());
                                    a21Var.a(y11Var2, q11Var);
                                    ar.M(arrayList);
                                }
                                break;
                            default:
                                entry.getClass();
                                x11 x11Var2 = (x11) entry.getKey();
                                a21 a21Var2 = (a21) entry.getValue();
                                while (true) {
                                    r11 r11Var7 = a21Var2.a;
                                    r11 r11Var8 = b21Var.h;
                                    ArrayList arrayList2 = b21Var.g;
                                    if (r11Var7.compareTo(r11Var8) >= 0 || b21Var.f) {
                                        return ll2Var;
                                    }
                                    ud udVar5 = b21Var.b;
                                    udVar5.getClass();
                                    x11Var2.getClass();
                                    if (!((w91) udVar5.b).c(x11Var2)) {
                                        return ll2Var;
                                    }
                                    arrayList2.add(a21Var2.a);
                                    o11 o11Var2 = q11.Companion;
                                    r11 r11Var9 = a21Var2.a;
                                    o11Var2.getClass();
                                    r11Var9.getClass();
                                    int iOrdinal2 = r11Var9.ordinal();
                                    if (iOrdinal2 == 1) {
                                        q11Var2 = q11.ON_CREATE;
                                    } else if (iOrdinal2 != 2) {
                                        q11Var2 = iOrdinal2 != 3 ? null : q11.ON_RESUME;
                                    } else {
                                        q11Var2 = q11.ON_START;
                                    }
                                    if (q11Var2 == null) {
                                        qj.u(a21Var2.a, "no event up from ");
                                        return null;
                                    }
                                    a21Var2.a(y11Var2, q11Var2);
                                    ar.M(arrayList2);
                                }
                                break;
                        }
                    }
                };
                udVar3.getClass();
                for (ed0 ed0Var5 = (ed0) udVar3.c; ed0Var5 != null; ed0Var5 = ed0Var5.g) {
                    if (!ed0Var5.i) {
                        ej0Var2.h(ed0Var5);
                    }
                }
            }
        }
        this.f = false;
        this.i.i(this.h);
    }
}
