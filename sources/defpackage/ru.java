package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ru implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ru(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((j82) obj).d(null);
                break;
            default:
                me2 me2Var = (me2) obj;
                if (me2Var != null) {
                    f11 f11Var = me2Var.d;
                    if (f11Var != null) {
                        f11Var.e(of2.b);
                    }
                    f11 f11Var2 = me2Var.d;
                    if (f11Var2 != null) {
                        f11Var2.f(of2.b);
                    }
                }
                break;
        }
    }
}
