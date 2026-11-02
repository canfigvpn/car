package defpackage;

import android.view.textclassifier.TextClassification;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jc2 {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;

    public jc2(CharSequence charSequence, long j, TextClassification textClassification) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc2)) {
            return false;
        }
        jc2 jc2Var = (jc2) obj;
        return ws0.j(this.a, jc2Var.a) && of2.b(this.b, jc2Var.b) && ws0.j(this.c, jc2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = of2.c;
        return this.c.hashCode() + k3.c(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + ((Object) of2.h(this.b)) + ", textClassification=" + this.c + ')';
    }
}
