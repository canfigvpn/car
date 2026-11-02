package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hb2 implements rx0, Serializable {
    public ti0 e;
    public volatile Object f;
    public final Object g;

    public hb2(ti0 ti0Var) {
        ti0Var.getClass();
        this.e = ti0Var;
        this.f = is1.t;
        this.g = this;
    }

    @Override // defpackage.rx0
    public final Object getValue() {
        Object objA;
        Object obj = this.f;
        is1 is1Var = is1.t;
        if (obj != is1Var) {
            return obj;
        }
        synchronized (this.g) {
            objA = this.f;
            if (objA == is1Var) {
                ti0 ti0Var = this.e;
                ti0Var.getClass();
                objA = ti0Var.a();
                this.f = objA;
                this.e = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.f != is1.t ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
