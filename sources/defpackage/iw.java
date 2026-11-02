package defpackage;

import android.database.SQLException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ iw(Object obj, boolean z, int i) {
        this.e = i;
        this.g = obj;
        this.f = z;
    }

    @Override // defpackage.ti0
    public final Object a() {
        aa1 aa1VarI;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        boolean z = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                kw kwVar = (kw) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                kwVar.f.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                kwVar.e.d(sb);
                try {
                    ix.R(sb.toString(), 5);
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return ll2Var;
                }
            case 1:
                ti0 ti0Var = (ti0) obj;
                if (z) {
                    ti0Var.a();
                }
                return ll2Var;
            case 2:
                o7 o7Var = (o7) obj;
                if (z && (aa1VarI = o7Var.i()) != null) {
                    ((n42) aa1VarI).q(ll2Var);
                }
                return ll2Var;
            case 3:
                xf0 xf0Var = (xf0) obj;
                if (z) {
                    xf0.a(xf0Var);
                }
                return ll2Var;
            default:
                ((ej0) obj).h(Boolean.valueOf(!z));
                return ll2Var;
        }
    }

    public /* synthetic */ iw(boolean z, Object obj, int i) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }
}
