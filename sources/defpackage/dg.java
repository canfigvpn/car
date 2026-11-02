package defpackage;

import android.content.res.Resources;
import ir.alirezaivaz.mygarage.MainActivity;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ dg(boolean z, ti0 ti0Var) {
        this.e = 2;
        this.f = z;
        this.g = ti0Var;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        final int i2 = 1;
        final int i3 = 0;
        final boolean z = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                cu cuVar = (cu) obj2;
                ((ag) cuVar.a).d(z);
                ((zf) cuVar.b).f(z);
                return new fg((f21) obj, cuVar, 0);
            case 1:
                int i4 = MainActivity.D;
                ((c60) obj).getClass();
                i90.a((MainActivity) obj2, new ib2(0, 0, new ej0() { // from class: j51
                    @Override // defpackage.ej0
                    public final Object h(Object obj3) {
                        int i5 = i3;
                        boolean z2 = z;
                        Resources resources = (Resources) obj3;
                        switch (i5) {
                            case 0:
                                int i6 = MainActivity.D;
                                resources.getClass();
                                break;
                            default:
                                int i7 = MainActivity.D;
                                resources.getClass();
                                break;
                        }
                        return Boolean.valueOf(z2);
                    }
                }), new ib2(m51.a, m51.b, new ej0() { // from class: j51
                    @Override // defpackage.ej0
                    public final Object h(Object obj3) {
                        int i5 = i2;
                        boolean z2 = z;
                        Resources resources = (Resources) obj3;
                        switch (i5) {
                            case 0:
                                int i6 = MainActivity.D;
                                resources.getClass();
                                break;
                            default:
                                int i7 = MainActivity.D;
                                resources.getClass();
                                break;
                        }
                        return Boolean.valueOf(z2);
                    }
                }));
                return new n8(2);
            case 2:
                ((bu1) obj).c(z ? 1.0f : ((Number) ((ti0) obj2).a()).floatValue());
                return ll2.a;
            default:
                nu nuVar = (nu) obj2;
                nuVar.j(z);
                return new fg((f21) obj, nuVar, 1);
        }
    }

    public /* synthetic */ dg(Object obj, boolean z, int i) {
        this.e = i;
        this.g = obj;
        this.f = z;
    }
}
