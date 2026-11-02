package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 implements m12 {
    public final /* synthetic */ int a;
    public final Object b;
    public final ej0 c;

    public /* synthetic */ jd0(Object obj, ej0 ej0Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = ej0Var;
    }

    @Override // defpackage.m12
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new id0(this);
            default:
                return new nk0(this);
        }
    }
}
