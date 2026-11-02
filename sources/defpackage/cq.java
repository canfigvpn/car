package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cq extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        cls.getClass();
        ca1 ca1Var = new ca1();
        ca1Var.a = new SoftReference(null);
        return ca1Var;
    }
}
