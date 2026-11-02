package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r60 implements wq1 {
    public static final Object c = new Object();
    public volatile wq1 a;
    public volatile Object b;

    public static wq1 a(wq1 wq1Var) {
        if (wq1Var instanceof r60) {
            return wq1Var;
        }
        r60 r60Var = new r60();
        r60Var.b = c;
        r60Var.a = wq1Var;
        return r60Var;
    }

    @Override // defpackage.wq1
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
