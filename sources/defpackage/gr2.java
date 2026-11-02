package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 gr2[], still in use, count: 1, list:
  (r0v1 gr2[]) from 0x0038: CONSTRUCTOR (r0v1 gr2[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: yb0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gr2 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final /* synthetic */ yb0 l;
    public final char e;
    public final char f;

    static {
        l = new yb0(gr2VarArr);
    }

    public gr2(char c, char c2) {
        super(str, i);
        this.e = c;
        this.f = c2;
    }

    public static gr2 valueOf(String str) {
        return (gr2) Enum.valueOf(gr2.class, str);
    }

    public static gr2[] values() {
        return (gr2[]) k.clone();
    }
}
