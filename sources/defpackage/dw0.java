package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dw0 implements sj0, Serializable {
    public final int e;

    public dw0(int i) {
        this.e = i;
    }

    @Override // defpackage.sj0
    public final int c() {
        return this.e;
    }

    public final String toString() {
        js1.a.getClass();
        return ks1.a(this);
    }
}
