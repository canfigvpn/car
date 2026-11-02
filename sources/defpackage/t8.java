package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t8 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ t8(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ws0.n(((aq1) obj2).a, ((aq1) obj).a);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 2:
                return ws0.n(((et0) obj).b, ((et0) obj2).b);
            case 3:
                lr0 lr0Var = (lr0) obj;
                lr0 lr0Var2 = (lr0) obj2;
                return (lr0Var.f - lr0Var.e) - (lr0Var2.f - lr0Var2.e);
            case 4:
                ax0 ax0Var = (ax0) obj;
                ax0 ax0Var2 = (ax0) obj2;
                float f = ax0Var.J.p.I;
                float f2 = ax0Var2.J.p.I;
                return f == f2 ? ws0.n(ax0Var.v(), ax0Var2.v()) : Float.compare(f, f2);
            default:
                return ws0.n(((nz0) obj).getIndex(), ((nz0) obj2).getIndex());
        }
    }
}
