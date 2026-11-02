package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ju0 {
    public static final rp0 a = ex.c(g92.a, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final av0 a(iu0 iu0Var) {
        av0 av0Var = iu0Var instanceof av0 ? (av0) iu0Var : null;
        if (av0Var != null) {
            return av0Var;
        }
        throw new IllegalArgumentException("Element " + js1.a(iu0Var.getClass()) + " is not a JsonPrimitive");
    }
}
