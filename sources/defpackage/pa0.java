package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pa0 implements na0 {
    public final /* synthetic */ int e;
    public final String f;

    public /* synthetic */ pa0(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.na0
    public boolean b(CharSequence charSequence, int i, int i2, zj2 zj2Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f)) {
            return true;
        }
        zj2Var.c = (zj2Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "<" + this.f + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.na0
    public Object a() {
        return this;
    }
}
