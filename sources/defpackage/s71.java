package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface s71 extends u71 {
    @Override // defpackage.u71
    default Object a(ij0 ij0Var, Object obj) {
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.u71
    default boolean b(ej0 ej0Var) {
        return ((Boolean) ej0Var.h(this)).booleanValue();
    }
}
