package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 implements m12 {
    public final /* synthetic */ int a;
    public final m12 b;
    public final ej0 c;

    public /* synthetic */ tb2(m12 m12Var, ej0 ej0Var, int i) {
        this.a = i;
        this.b = m12Var;
        this.c = ej0Var;
    }

    @Override // defpackage.m12
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new id0(this);
            default:
                return new ci2(this);
        }
    }
}
