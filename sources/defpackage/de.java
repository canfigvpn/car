package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class de extends y12 {
    public static volatile de c;
    public static final ce d = new ce(0);
    public final t30 b;

    public de() {
        super(4);
        this.b = new t30();
    }

    public static de y() {
        if (c != null) {
            return c;
        }
        synchronized (de.class) {
            try {
                if (c == null) {
                    c = new de();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }
}
