package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qi implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public qi(tc0 tc0Var, boolean z, da1 da1Var) {
        this.e = 2;
        this.f = tc0Var;
        this.g = da1Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        long j;
        boolean zG = false;
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((rv0) obj).a;
                da1 da1Var = (da1) this.g;
                if (!((mh2) this.f).b()) {
                    da1Var.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 1:
                KeyEvent keyEvent2 = ((rv0) obj).a;
                if (((f11) this.f).a() == sl0.f && keyEvent2.getKeyCode() == 4 && sv0.g0(keyEvent2) == 1) {
                    ((me2) this.g).d(null);
                    zG = true;
                }
                return Boolean.valueOf(zG);
            case 2:
                KeyEvent keyEvent3 = ((rv0) obj).a;
                da1 da1Var2 = (da1) this.g;
                tc0 tc0Var = (tc0) this.f;
                if (sv0.g0(keyEvent3) == 1) {
                    long jD0 = sv0.d0(keyEvent3);
                    int i = pv0.F;
                    if ((pv0.a(jD0, pv0.h) || pv0.a(jD0, pv0.r) || pv0.a(jD0, pv0.E)) || pv0.a(ix.b(keyEvent3.getKeyCode()), pv0.q)) {
                        tc0Var.a();
                    }
                }
                Boolean bool = Boolean.FALSE;
                da1Var2.setValue(bool);
                return bool;
            case 3:
                return ((n30) this.f).h(((List) this.g).get(((Number) obj).intValue()));
            case 4:
                u62 u62Var = (u62) obj;
                synchronized (x62.c) {
                    j = x62.e;
                    x62.e = 1 + j;
                }
                return new ba1(j, u62Var, (ej0) this.f, (ej0) this.g);
            case 5:
                return ((n30) this.f).h(((List) this.g).get(((Number) obj).intValue()));
            case 6:
                return ((n30) this.f).h(((List) this.g).get(((Number) obj).intValue()));
            case 7:
                return ((n30) this.f).h(((ArrayList) this.g).get(((Number) obj).intValue()));
            case 8:
                return ((n30) this.f).h(((List) this.g).get(((Number) obj).intValue()));
            case 9:
                ew0 ew0Var = (ew0) this.f;
                Object obj2 = ew0Var.b;
                om omVar = (om) this.g;
                synchronized (obj2) {
                    ((ArrayList) ew0Var.c).remove(omVar);
                }
                return ll2.a;
            default:
                KeyEvent keyEvent4 = ((rv0) obj).a;
                sf0 sf0Var = (sf0) this.f;
                InputDevice device = keyEvent4.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent4.getSource() == 33554433) && sv0.g0(keyEvent4) == 2 && keyEvent4.getSource() != 257)) {
                    if (c12.o(19, keyEvent4)) {
                        zG = ((vf0) sf0Var).g(5, true);
                    } else if (c12.o(20, keyEvent4)) {
                        zG = ((vf0) sf0Var).g(6, true);
                    } else if (c12.o(21, keyEvent4)) {
                        zG = ((vf0) sf0Var).g(3, true);
                    } else if (c12.o(22, keyEvent4)) {
                        zG = ((vf0) sf0Var).g(4, true);
                    } else if (c12.o(23, keyEvent4)) {
                        l72 l72Var = ((f11) this.g).c;
                        if (l72Var != null) {
                            ((e40) l72Var).b();
                        }
                        zG = true;
                    }
                }
                return Boolean.valueOf(zG);
        }
    }

    public /* synthetic */ qi(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
