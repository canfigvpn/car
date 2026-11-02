package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@pd1("navigation")
public class hc1 extends qd1 {
    public final rd1 c;

    public hc1(rd1 rd1Var) {
        rd1Var.getClass();
        this.c = rd1Var;
    }

    @Override // defpackage.qd1
    public final void d(List list, sc1 sc1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kb1 kb1Var = (kb1) it.next();
            zb1 zb1Var = kb1Var.f;
            zb1Var.getClass();
            cc1 cc1Var = (cc1) zb1Var;
            pc pcVar = cc1Var.f;
            gs1 gs1Var = new gs1();
            gs1Var.e = kb1Var.l.a();
            fc1 fc1Var = cc1Var.j;
            int i = fc1Var.b;
            String str = fc1Var.d;
            if (i == 0 && str == null) {
                pcVar.getClass();
                String strValueOf = String.valueOf(pcVar.a);
                strValueOf.getClass();
                if (((cc1) fc1Var.e).f.a == 0) {
                    strValueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(strValueOf).toString());
            }
            int i2 = 0;
            zb1 zb1VarN = str != null ? fc1Var.n(str, false) : (zb1) s5.B((v72) fc1Var.f, i);
            if (zb1VarN == null) {
                String strValueOf2 = fc1Var.c;
                if (strValueOf2 == null) {
                    strValueOf2 = fc1Var.d;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(fc1Var.b);
                    }
                    fc1Var.c = strValueOf2;
                }
                strValueOf2.getClass();
                qj.r(k3.j("navigation destination ", strValueOf2, " is not a direct child of this NavGraph"));
                return;
            }
            pc pcVar2 = zb1VarN.f;
            if (str != null) {
                if (!str.equals((String) pcVar2.e)) {
                    yb1 yb1VarC = pcVar2.c(str);
                    Bundle bundle = yb1VarC != null ? yb1VarC.f : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                        bundleW.putAll(bundle);
                        Bundle bundle2 = (Bundle) gs1Var.e;
                        if (bundle2 != null) {
                            bundleW.putAll(bundle2);
                        }
                        gs1Var.e = bundleW;
                    }
                }
                if (zb1VarN.b().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListF = mx.F(zb1VarN.b(), new gc1(gs1Var, i2));
                    if (!arrayListF.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + zb1VarN + ". Missing required arguments [" + arrayListF + ']').toString());
                    }
                }
            }
            this.c.b(zb1VarN.e).d(vs0.u(b().b(zb1VarN, zb1VarN.a((Bundle) gs1Var.e))), sc1Var);
        }
    }

    @Override // defpackage.qd1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public cc1 a() {
        return new cc1(this);
    }
}
