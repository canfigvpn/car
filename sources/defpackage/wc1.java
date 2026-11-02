package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class wc1 extends xc1 {
    public final Class q;

    public wc1(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            qj.g(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            qj.g(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.q = cls;
    }

    @Override // defpackage.xc1
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.xc1
    public String b() {
        return this.q.getName();
    }

    @Override // defpackage.xc1
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc1)) {
            return false;
        }
        return this.q.equals(((wc1) obj).q);
    }

    @Override // defpackage.xc1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public wc1(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            qj.g(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
