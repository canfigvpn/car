package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface gi2 {
    Object a();

    default boolean b(Object obj, Object obj2) {
        return obj.equals(a()) && obj2.equals(c());
    }

    Object c();
}
