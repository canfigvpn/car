package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface yn2 {
    default un2 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default un2 b(Class cls, a91 a91Var) {
        return a(cls);
    }

    default un2 c(aq aqVar, a91 a91Var) {
        return b(vv.q(aqVar), a91Var);
    }
}
