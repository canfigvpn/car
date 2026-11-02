package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class no implements uj0 {
    public final uy e;
    public final int f;
    public final vk g;

    public no(uy uyVar, int i, vk vkVar) {
        this.e = uyVar;
        this.f = i;
        this.g = vkVar;
    }

    @Override // defpackage.pe0
    public Object a(qe0 qe0Var, sx sxVar) {
        Object objW = qx.w(new g(6, null, qe0Var, this), sxVar);
        return objW == fz.e ? objW : ll2.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.uj0
    public final pe0 b(uy uyVar, int i, vk vkVar) {
        uy uyVar2 = this.e;
        uy uyVarK = uyVar.k(uyVar2);
        vk vkVar2 = vk.e;
        vk vkVar3 = this.g;
        int i2 = this.f;
        if (vkVar == vkVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            vkVar = vkVar3;
        }
        return (ws0.j(uyVarK, uyVar2) && i == i2 && vkVar == vkVar3) ? this : e(uyVarK, i, vkVar);
    }

    public String c() {
        return null;
    }

    public abstract Object d(hq1 hq1Var, sx sxVar);

    public abstract no e(uy uyVar, int i, vk vkVar);

    public pe0 f() {
        return null;
    }

    public lo g(ez ezVar) throws IllegalAccessException, InvocationTargetException {
        int i = this.f;
        if (i == -3) {
            i = -2;
        }
        ij0 eVar = new e(7, null, this);
        zk zkVarD = s5.d(i, 4, this.g);
        uy uyVarY = ix.y(ezVar.h(), this.e, true);
        j30 j30Var = u50.a;
        if (uyVarY != j30Var && uyVarY.p(q90.A) == null) {
            uyVarY = uyVarY.k(j30Var);
        }
        hq1 hq1Var = new hq1(uyVarY, zkVarD);
        hq1Var.j0(hz.g, hq1Var, eVar);
        return hq1Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        ab0 ab0Var = ab0.e;
        uy uyVar = this.e;
        if (uyVar != ab0Var) {
            arrayList.add("context=" + uyVar);
        }
        int i = this.f;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        vk vkVar = vk.e;
        vk vkVar2 = this.g;
        if (vkVar2 != vkVar) {
            arrayList.add("onBufferOverflow=" + vkVar2);
        }
        return getClass().getSimpleName() + '[' + vq.V(arrayList, ", ", null, null, null, 62) + ']';
    }
}
