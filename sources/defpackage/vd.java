package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vd[], still in use, count: 1, list:
  (r0v1 vd[]) from 0x0027: CONSTRUCTOR (r0v1 vd[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:40) call: yb0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vd {
    f(null),
    /* JADX INFO: Fake field, exist only in values array */
    EF18("en"),
    /* JADX INFO: Fake field, exist only in values array */
    EF28("fa");

    public static final /* synthetic */ yb0 h;
    public final String e;

    static {
        h = new yb0(vdVarArr);
    }

    public vd(String str) {
        super(str, i);
        this.e = str;
    }

    public static vd valueOf(String str) {
        return (vd) Enum.valueOf(vd.class, str);
    }

    public static vd[] values() {
        return (vd[]) g.clone();
    }
}
