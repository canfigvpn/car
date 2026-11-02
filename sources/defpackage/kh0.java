package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class kh0 {
    public final List a;

    public kh0(jh0... jh0VarArr) {
        if (jh0VarArr.length <= 0) {
            this.a = ve.M0(jh0VarArr);
        } else {
            jh0 jh0Var = jh0VarArr[0];
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kh0) {
            return this.a.equals(((kh0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
