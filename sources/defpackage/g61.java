package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g61 implements ur0 {
    public final long a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final ze0 c;

    public g61(f91 f91Var, long j) {
        this.a = j;
        this.c = new ze0(4, f91Var.a, this);
    }

    @Override // defpackage.ur0
    public final pe0 a() {
        return this.c;
    }
}
