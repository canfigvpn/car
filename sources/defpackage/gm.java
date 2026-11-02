package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gm implements ev0, Serializable {
    public transient ev0 e;
    public final Object f;
    public final Class g;
    public final String h;
    public final String i;
    public final boolean j;

    public gm(Object obj, Class cls, String str, String str2, boolean z) {
        this.f = obj;
        this.g = cls;
        this.h = str;
        this.i = str2;
        this.j = z;
    }

    public abstract ev0 e();

    public final yp f() {
        boolean z = this.j;
        Class cls = this.g;
        if (!z) {
            return js1.a(cls);
        }
        js1.a.getClass();
        return new dj1(cls);
    }
}
