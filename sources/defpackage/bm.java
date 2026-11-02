package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bm {
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();

    public bm(Locale locale) {
        this.a = locale;
    }

    public abstract String a(long j, String str, Locale locale);

    public abstract zl b(long j);

    public abstract d00 c(Locale locale);

    public abstract int d();

    public abstract em e(int i, int i2);

    public abstract em f(long j);

    public abstract em g(zl zlVar);

    public abstract zl h();

    public abstract List i();

    public abstract zl j(String str, String str2, Locale locale);

    public abstract em k(em emVar, int i);
}
