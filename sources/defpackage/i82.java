package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i82 {
    public static final /* synthetic */ int a = 0;

    static {
        Object ut1Var;
        Object ut1Var2;
        Exception exc = new Exception();
        String simpleName = ir2.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            ut1Var = sh.class.getCanonicalName();
        } catch (Throwable th) {
            ut1Var = new ut1(th);
        }
        if (vt1.a(ut1Var) != null) {
            ut1Var = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            ut1Var2 = i82.class.getCanonicalName();
        } catch (Throwable th2) {
            ut1Var2 = new ut1(th2);
        }
        if (vt1.a(ut1Var2) != null) {
            ut1Var2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
