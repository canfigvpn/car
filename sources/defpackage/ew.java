package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ew extends zk {
    public final vk t;

    public ew(int i, vk vkVar) {
        super(i);
        this.t = vkVar;
        if (vkVar == vk.e) {
            fu1.f(js1.a(zk.class).c(), " instead", "This implementation does not support suspension for senders, use ");
            throw null;
        }
        if (i >= 1) {
            return;
        }
        fu1.i("Buffered channel capacity must be at least 1, but ", i, " was specified");
        throw null;
    }

    public final Object M(Object obj, boolean z) throws IllegalAccessException, InvocationTargetException {
        vk vkVar = this.t;
        vk vkVar2 = vk.g;
        ll2 ll2Var = ll2.a;
        if (vkVar == vkVar2) {
            Object objC = super.c(obj);
            return (!(objC instanceof vo) || (objC instanceof uo)) ? objC : ll2Var;
        }
        Object obj2 = bl.d;
        xo xoVar = (xo) we.a.getObjectVolatile(this, zk.r);
        while (true) {
            long andIncrement = zk.f.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zU = u(andIncrement, false);
            int i = bl.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (xoVar.d != j3) {
                xo xoVarK = k(j3, xoVar);
                if (xoVarK != null) {
                    xoVar = xoVarK;
                } else if (zU) {
                    return new uo(q());
                }
            }
            int iJ = J(xoVar, i2, obj, j, obj2, zU);
            if (iJ == 0) {
                xoVar.a();
                return ll2Var;
            }
            if (iJ != 1) {
                if (iJ != 2) {
                    if (iJ == 3) {
                        fu1.h("unexpected");
                        return null;
                    }
                    if (iJ == 4) {
                        if (j < p()) {
                            xoVar.a();
                        }
                        return new uo(q());
                    }
                    if (iJ == 5) {
                        xoVar.a();
                    }
                } else {
                    if (zU) {
                        xoVar.h();
                        return new uo(q());
                    }
                    jo2 jo2Var = obj2 instanceof jo2 ? (jo2) obj2 : null;
                    if (jo2Var != null) {
                        jo2Var.a(xoVar, i2 + i);
                    }
                    h((xoVar.d * j2) + ((long) i2));
                }
            }
            return ll2Var;
        }
    }

    @Override // defpackage.zk, defpackage.k12
    public final Object a(sx sxVar, Object obj) throws Throwable {
        if (M(obj, true) instanceof uo) {
            throw q();
        }
        return ll2.a;
    }

    @Override // defpackage.zk, defpackage.k12
    public final Object c(Object obj) {
        return M(obj, false);
    }

    @Override // defpackage.zk
    public final boolean y() {
        return this.t == vk.f;
    }
}
