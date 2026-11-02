package defpackage;

import android.text.Editable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile ha0 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new u72(cls, charSequence) : super.newEditable(charSequence);
    }
}
