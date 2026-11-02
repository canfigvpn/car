package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w41 implements x61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ ej0 d;
    public final /* synthetic */ ej0 e;
    public final /* synthetic */ x41 f;

    public w41(int i, int i2, Map map, ej0 ej0Var, ej0 ej0Var2, x41 x41Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = ej0Var;
        this.e = ej0Var2;
        this.f = x41Var;
    }

    @Override // defpackage.x61
    public final Map a() {
        return this.c;
    }

    @Override // defpackage.x61
    public final void b() {
        this.e.h(this.f.p);
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
