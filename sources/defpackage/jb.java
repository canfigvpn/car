package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jb {
    public static final jb e;
    public static final jb f;
    public static final /* synthetic */ jb[] g;

    static {
        jb jbVar = new jb("BoundReached", 0);
        e = jbVar;
        jb jbVar2 = new jb("Finished", 1);
        f = jbVar2;
        g = new jb[]{jbVar, jbVar2};
    }

    public static jb valueOf(String str) {
        return (jb) Enum.valueOf(jb.class, str);
    }

    public static jb[] values() {
        return (jb[]) g.clone();
    }
}
