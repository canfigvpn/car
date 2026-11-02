package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface u71 {
    Object a(ij0 ij0Var, Object obj);

    boolean b(ej0 ej0Var);

    default u71 c(u71 u71Var) {
        return u71Var == r71.a ? this : new ds(this, u71Var);
    }
}
