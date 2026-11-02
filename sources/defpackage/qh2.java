package defpackage;

import ir.alirezaivaz.mygarage.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 qh2[], still in use, count: 1, list:
  (r0v1 qh2[]) from 0x0068: CONSTRUCTOR (r0v1 qh2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:105) call: yb0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qh2 {
    HOME(wm0.INSTANCE, js1.a(wm0.class), R.drawable.ic_nav_home, R.string.nav_home, false),
    /* JADX INFO: Fake field, exist only in values array */
    HISTORY(mm0.INSTANCE, js1.a(mm0.class), R.drawable.ic_nav_history, R.string.nav_history, true),
    FUEL(fi0.INSTANCE, js1.a(fi0.class), R.drawable.ic_nav_fuel, R.string.nav_fuel, true),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS(e32.INSTANCE, js1.a(e32.class), R.drawable.ic_nav_settings, R.string.nav_settings, false);

    public static final /* synthetic */ yb0 m;
    public final Object e;
    public final aq f;
    public final int g;
    public final int h;
    public final boolean i;

    static {
        m = new yb0(qh2VarArr);
    }

    public qh2(Object obj, aq aqVar, int i, int i2, boolean z) {
        super(str, i);
        this.e = obj;
        this.f = aqVar;
        this.g = i;
        this.h = i2;
        this.i = z;
    }

    public static qh2 valueOf(String str) {
        return (qh2) Enum.valueOf(qh2.class, str);
    }

    public static qh2[] values() {
        return (qh2[]) l.clone();
    }
}
