package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hx0 implements x61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ej0 d;
    public final /* synthetic */ ix0 e;
    public final /* synthetic */ ox0 f;
    public final /* synthetic */ ej0 g;

    public hx0(int i, int i2, Map map, ej0 ej0Var, ix0 ix0Var, ox0 ox0Var, ej0 ej0Var2) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = ej0Var;
        this.e = ix0Var;
        this.f = ox0Var;
        this.g = ej0Var2;
    }

    @Override // defpackage.x61
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.x61
    public final void b() {
        aq0 aq0Var;
        ax0 ax0Var = this.f.e;
        boolean zR = this.e.r();
        ej0 ej0Var = this.g;
        if (!zR || (aq0Var = ax0Var.I.c.W) == null) {
            ej0Var.h(ax0Var.I.c.p);
        } else {
            ej0Var.h(aq0Var.p);
        }
    }

    @Override // defpackage.x61
    public final int c() {
        return this.b;
    }

    @Override // defpackage.x61
    public final ej0 d() {
        return this.d;
    }

    @Override // defpackage.x61
    public final int e() {
        return this.a;
    }
}
