package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jg2 implements ty {
    public final ThreadLocal e;

    public jg2(ThreadLocal threadLocal) {
        this.e = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg2) && ws0.j(this.e, ((jg2) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.e + ')';
    }
}
