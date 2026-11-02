package defpackage;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class as0 extends xc1 {
    public final Class q;
    public final Class r;

    public as0(Class cls) {
        super(true);
        this.q = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            qj.g(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            qj.g(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.xc1
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // defpackage.xc1
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.xc1
    public final Object d(String str) {
        Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        for (Object obj2 : enumConstants) {
            Enum r5 = (Enum) obj2;
            r5.getClass();
            if (o92.v(r5.name(), str, true)) {
                obj = obj2;
                break;
            }
        }
        Enum r1 = (Enum) obj;
        if (r1 != null) {
            return r1;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }

    @Override // defpackage.xc1
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as0)) {
            return false;
        }
        return this.q.equals(((as0) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
