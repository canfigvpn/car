package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class rl2 implements rx0, Serializable {
    public ti0 e;
    public Object f;

    @Override // defpackage.rx0
    public final Object getValue() {
        Object obj = this.f;
        if (obj != is1.t) {
            return obj;
        }
        ti0 ti0Var = this.e;
        ti0Var.getClass();
        Object objA = ti0Var.a();
        this.f = objA;
        this.e = null;
        return objA;
    }

    public final String toString() {
        return this.f != is1.t ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
