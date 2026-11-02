package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class lw implements vv1, ra1 {
    public final vv1 e;
    public final ra1 f;
    public uy g;
    public Throwable h;

    public lw(vv1 vv1Var) {
        ta1 ta1Var = new ta1();
        vv1Var.getClass();
        this.e = vv1Var;
        this.f = ta1Var;
    }

    @Override // defpackage.vv1
    public final xv1 C(String str) {
        str.getClass();
        return this.e.C(str);
    }

    @Override // defpackage.ra1
    public final void b(Object obj) {
        this.f.b(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.e.close();
    }

    @Override // defpackage.ra1
    public final Object d(tx txVar) {
        return this.f.d(txVar);
    }

    public final void h(StringBuilder sb) {
        if (this.g == null && this.h == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        uy uyVar = this.g;
        if (uyVar != null) {
            sb.append("\t\tCoroutine: " + uyVar);
            sb.append('\n');
        }
        Throwable th = this.h;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            string.getClass();
            Iterator it = vq.P(h92.K(string)).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    @Override // defpackage.vv1
    public final boolean l() {
        return this.e.l();
    }

    public final String toString() {
        return this.e.toString();
    }
}
