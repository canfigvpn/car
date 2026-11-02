package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hm0 implements yn2 {
    public static final w40 d = new w40(10);
    public final sx0 a;
    public final yn2 b;
    public final t2 c;

    public hm0(sx0 sx0Var, yn2 yn2Var, ao2 ao2Var) {
        this.a = sx0Var;
        this.b = yn2Var;
        this.c = new t2(1, ao2Var);
    }

    @Override // defpackage.yn2
    public final un2 a(Class cls) {
        if (this.a.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.b.a(cls);
    }

    @Override // defpackage.yn2
    public final un2 b(Class cls, a91 a91Var) {
        return this.a.containsKey(cls) ? this.c.b(cls, a91Var) : this.b.b(cls, a91Var);
    }
}
