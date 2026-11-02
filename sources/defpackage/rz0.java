package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rz0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ tz0 c;

    public rz0(tz0 tz0Var, int i) {
        this.c = tz0Var;
        this.a = i;
    }

    public final void a(int i) {
        tz0 tz0Var = this.c;
        ew0 ew0Var = tz0Var.c;
        if (ew0Var == null) {
            return;
        }
        this.b.add(new jp1(ew0Var, i, tz0Var.b, null));
    }
}
