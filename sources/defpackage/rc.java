package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rc {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static rc c;
    public nt1 a;

    public static synchronized void b() {
        if (c == null) {
            rc rcVar = new rc();
            c = rcVar;
            rcVar.a = nt1.c();
            nt1 nt1Var = c.a;
            qc qcVar = new qc();
            synchronized (nt1Var) {
                nt1Var.e = qcVar;
            }
        }
    }

    public final synchronized Drawable a(Context context, int i) {
        return this.a.d(context, i);
    }
}
