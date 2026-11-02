package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t91 extends u91 implements kv0, lv0 {
    public t91(String str, String str2) {
        super(fm.e, w02.class, str, str2, 1);
    }

    @Override // defpackage.gm
    public final ev0 e() {
        js1.a.getClass();
        return this;
    }

    @Override // defpackage.kv0
    public final Object get(Object obj) {
        throw null;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        k();
        throw null;
    }

    public final void k() {
        if (this.k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        ev0 ev0VarI = i();
        if (ev0VarI == this) {
            throw new iz("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((t91) ((lv0) ev0VarI)).k();
    }
}
