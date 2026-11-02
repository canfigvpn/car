package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kb0 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ sb0 g;
    public final /* synthetic */ kc0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kb0(sb0 sb0Var, kc0 kc0Var, int i) {
        super(1);
        this.f = i;
        this.g = sb0Var;
        this.h = kc0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        ld0 ld0Var;
        ld0 ld0Var2;
        int i = this.f;
        hb0 hb0Var = hb0.g;
        hb0 hb0Var2 = hb0.f;
        hb0 hb0Var3 = hb0.e;
        float f = 1.0f;
        sb0 sb0Var = this.g;
        kc0 kc0Var = this.h;
        switch (i) {
            case 0:
                gi2 gi2Var = (gi2) obj;
                if (gi2Var.b(hb0Var3, hb0Var2)) {
                    zc0 zc0Var = sb0Var.a.a;
                    return (zc0Var == null || (ld0Var2 = zc0Var.b) == null) ? nb0.b : ld0Var2;
                }
                if (!gi2Var.b(hb0Var2, hb0Var)) {
                    return nb0.b;
                }
                zc0 zc0Var2 = kc0Var.a.a;
                return (zc0Var2 == null || (ld0Var = zc0Var2.b) == null) ? nb0.b : ld0Var;
            case 1:
                int iOrdinal = ((hb0) obj).ordinal();
                if (iOrdinal == 0) {
                    zc0 zc0Var3 = sb0Var.a.a;
                    if (zc0Var3 != null) {
                        f = zc0Var3.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        qj.p();
                        return null;
                    }
                    zc0 zc0Var4 = kc0Var.a.a;
                    if (zc0Var4 != null) {
                        f = zc0Var4.a;
                    }
                }
                return Float.valueOf(f);
            case 2:
                gi2 gi2Var2 = (gi2) obj;
                if (gi2Var2.b(hb0Var3, hb0Var2)) {
                    hx1 hx1Var = sb0Var.a.d;
                    return hx1Var != null ? hx1Var.c : nb0.b;
                }
                if (!gi2Var2.b(hb0Var2, hb0Var)) {
                    return nb0.b;
                }
                hx1 hx1Var2 = kc0Var.a.d;
                return hx1Var2 != null ? hx1Var2.c : nb0.b;
            default:
                int iOrdinal2 = ((hb0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    hx1 hx1Var3 = sb0Var.a.d;
                    if (hx1Var3 != null) {
                        f = hx1Var3.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        qj.p();
                        return null;
                    }
                    hx1 hx1Var4 = kc0Var.a.d;
                    if (hx1Var4 != null) {
                        f = hx1Var4.a;
                    }
                }
                return Float.valueOf(f);
        }
    }
}
