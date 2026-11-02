package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xc1 {
    public static final ej b;
    public static final dj c;
    public static final dj d;
    public static final ej e;
    public static final dj f;
    public static final dj g;
    public static final ej h;
    public static final dj i;
    public static final dj j;
    public static final ej k;
    public static final dj l;
    public static final dj m;
    public static final ej n;
    public static final dj o;
    public static final dj p;
    public final boolean a;

    static {
        boolean z = false;
        b = new ej(2, z);
        boolean z2 = true;
        c = new dj(4, z2);
        d = new dj(5, z2);
        e = new ej(3, z);
        f = new dj(6, z2);
        g = new dj(7, z2);
        h = new ej(1, z);
        i = new dj(2, z2);
        j = new dj(3, z2);
        int i2 = 0;
        k = new ej(i2, z);
        l = new dj(i2, z2);
        m = new dj(1, z2);
        n = new ej(4, z2);
        o = new dj(8, z2);
        p = new dj(9, z2);
    }

    public xc1(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
