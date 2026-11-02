package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr1 implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tr1(tr1 tr1Var, f fVar) {
        this.e = 14;
        this.f = tr1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        f11 f11Var;
        int i = this.e;
        boolean z = true;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((vr1) obj2).a((r90) obj);
                return ll2.a;
            case 1:
                vh0 vh0Var = (vh0) obj;
                vh0Var.getClass();
                ((t61) obj2).h = vh0Var;
                return ll2.a;
            case 2:
                gw1 gw1Var = ((fw1) obj2).g;
                return Boolean.valueOf(gw1Var != null ? gw1Var.d(obj) : true);
            case 3:
                zx1 zx1Var = (zx1) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                ak1 ak1Var = zx1Var.a;
                float fH = ak1Var.h() + fFloatValue + zx1Var.f;
                float fG = ex.g(fH, 0.0f, zx1Var.e.h());
                z = fH == fG;
                float fH2 = fG - ak1Var.h();
                int iRound = Math.round(fH2);
                ak1Var.i(ak1Var.h() + iRound);
                zx1Var.f = fH2 - iRound;
                if (!z) {
                    fFloatValue = fH2;
                }
                return Float.valueOf(fFloatValue);
            case 4:
                uy1 uy1Var = (uy1) obj2;
                return new uf1(uy1Var.c(uy1Var.k, ((uf1) obj).a, uy1Var.j));
            case 5:
                a52 a52Var = (a52) obj2;
                wn1 wn1Var = (wn1) obj;
                long j = wn1Var.c;
                me2 me2Var = (me2) a52Var.d;
                if (!me2Var.i() || me2Var.l().a.f.length() == 0 || (f11Var = me2Var.d) == null || f11Var.d() == null) {
                    z = false;
                } else {
                    a52Var.c(me2Var.l(), j, false, is1.j);
                }
                if (z) {
                    wn1Var.a();
                }
                return ll2.a;
            case 6:
                obj.getClass();
                return ((m2) obj2).a();
            case 7:
                ArrayList arrayList = (ArrayList) obj2;
                im1 im1Var = (im1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    im1Var.h((jm1) arrayList.get(i2), 0, 0, 0.0f);
                }
                return ll2.a;
            case 8:
                b52 b52Var = (b52) obj2;
                k12 k12Var = b52Var.f;
                k12Var.getClass();
                if (!ws0.j(b52Var.f, k12Var)) {
                    cp1.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                x91 x91Var = b52Var.e;
                Object obj3 = b52Var.c;
                if (x91Var != null) {
                    if (obj3 != null) {
                        cp1.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    x91Var.a(obj);
                } else if (obj3 == null) {
                    b52Var.c = obj;
                } else {
                    x91 x91Var2 = kx1.a;
                    x91 x91Var3 = new x91();
                    x91Var3.a(obj3);
                    x91Var3.a(obj);
                    b52Var.e = x91Var3;
                    b52Var.c = null;
                }
                return ll2.a;
            case 9:
                return Boolean.valueOf(ws0.j(((ad0) obj).a, (u52) obj2));
            case 10:
                k72 k72Var = (k72) obj2;
                synchronized (k72Var.g) {
                    j72 j72Var = k72Var.i;
                    j72Var.getClass();
                    Object obj4 = j72Var.b;
                    obj4.getClass();
                    int i3 = j72Var.d;
                    l91 l91Var = j72Var.c;
                    if (l91Var == null) {
                        l91Var = new l91();
                        j72Var.c = l91Var;
                        j72Var.f.m(obj4, l91Var);
                    }
                    j72Var.b(obj, i3, obj4, l91Var);
                }
                return ll2.a;
            case 11:
                mb mbVar = (mb) obj;
                ((ij0) obj2).g(mbVar.e.getValue(), ir2.V.b.h(mbVar.f));
                return ll2.a;
            case 12:
                Drawable drawable = (Drawable) obj2;
                l80 l80Var = (l80) obj;
                sm smVarG = l80Var.B().g();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (l80Var.d() >> 32)), (int) Float.intBitsToFloat((int) (l80Var.d() & 4294967295L)));
                drawable.draw(k4.a(smVarG));
                return ll2.a;
            case 13:
                ((ej0) obj).h((kc2) obj2);
                return ll2.a;
            case 14:
                tr1 tr1Var = (tr1) obj2;
                si2 si2Var = (si2) obj;
                if (si2Var instanceof b3) {
                    tr1Var.h(((b3) si2Var).s);
                    return Boolean.TRUE;
                }
                fu1.h("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 15:
                de2 de2Var = (de2) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                zj1 zj1Var = de2Var.a;
                float fH3 = zj1Var.h() + fFloatValue2;
                zj1 zj1Var2 = de2Var.b;
                if (fH3 > zj1Var2.h()) {
                    fFloatValue2 = zj1Var2.h() - zj1Var.h();
                } else if (fH3 < 0.0f) {
                    fFloatValue2 = -zj1Var.h();
                }
                zj1Var.i(zj1Var.h() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            default:
                kj2 kj2Var = (kj2) obj2;
                bq bqVar = (bq) obj;
                bqVar.getClass();
                bq.a(bqVar, "first", kj2Var.a.c());
                bq.a(bqVar, "second", kj2Var.b.c());
                bq.a(bqVar, "third", kj2Var.c.c());
                return ll2.a;
        }
    }

    public /* synthetic */ tr1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }
}
