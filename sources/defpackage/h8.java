package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h8 extends dw0 implements ti0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8(int i, Object obj) {
        super(0);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x007a A[LOOP:0: B:13:0x0045->B:23:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x007d A[SYNTHETIC] */
    @Override // defpackage.ti0
    public final Object a() {
        qv qvVar;
        int i = this.f;
        jw0 jw0Var = null;
        boolean z = false;
        ll2 ll2Var = ll2.a;
        Object obj = this.g;
        switch (i) {
            case 0:
                qx.o(((j8) obj).g, null);
                return ll2Var;
            case 1:
                return ll2Var;
            case 2:
                ki2 ki2Var = (ki2) obj;
                Object objF = ki2Var.a.f();
                hb0 hb0Var = hb0.g;
                if (objF == hb0Var && ki2Var.d.getValue() == hb0Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                boolean zA = qr0.a(0L, 0L);
                View view = ((av) obj).a;
                return zA ? ir2.f(view) : new s40(0L, sv0.F(view.getContext()).w(ux.M(0L)));
            case 4:
                ((cg0) obj).H0();
                return ll2Var;
            case 5:
                Object systemService = ((View) ((ud) obj).b).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 6:
                ex0 ex0Var = ((ax0) obj).J;
                ex0Var.p.D = true;
                d51 d51Var = ex0Var.q;
                if (d51Var != null) {
                    d51Var.x = true;
                }
                return ll2Var;
            case 7:
                gx0 gx0Var = (gx0) obj;
                if (!((Boolean) gx0Var.g.getValue()).booleanValue() && (qvVar = gx0Var.c) != null) {
                    qvVar.l();
                }
                return ll2Var;
            case 8:
                t51 t51Var = (t51) ((d21) obj).a.f;
                if (!t51Var.f) {
                    if (t51Var.g) {
                        dp1.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    t51Var.a();
                    t51Var.g = true;
                }
                return ll2Var;
            case 9:
                return (ez) ((e4) obj).h;
            case 10:
                return ((zd1) obj).F0();
            case 11:
                uo1 uo1Var = (uo1) obj;
                jw0 parentLayoutCoordinates = uo1Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.A()) {
                    jw0Var = parentLayoutCoordinates;
                }
                if (jw0Var != null && uo1Var.m11getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                as1 as1Var = (as1) obj;
                as1Var.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    as1Var.a();
                    return ll2Var;
                } finally {
                    Trace.endSection();
                }
            case 13:
                ox0 ox0VarA = ((aa2) obj).a();
                ax0 ax0Var = ox0VarA.e;
                if (ox0VarA.r != ((fa1) ((n91) ax0Var.o()).f).g) {
                    w91 w91Var = ox0VarA.j;
                    Object[] objArr = w91Var.c;
                    long[] jArr = w91Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((gx0) objArr[(i2 << 3) + i4]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            } else if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (ax0Var.l != null) {
                        if (!ax0Var.J.e) {
                            ax0.T(ax0Var, false, 7);
                        }
                    } else if (!ax0Var.q()) {
                        ax0.V(ax0Var, false, 7);
                    }
                }
                return ll2Var;
            case 14:
                return new BaseInputConnection(((af2) obj).a, false);
            default:
                ((lm2) obj).h.setValue(ll2Var);
                return ll2Var;
        }
    }
}
