package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends xc1 {
    public final Class q;

    public vc1(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            qj.g(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // defpackage.xc1
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.xc1
    public final String b() {
        return this.q.getName();
    }

    @Override // defpackage.xc1
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.xc1
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.q.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !vc1.class.equals(obj.getClass())) {
            return false;
        }
        return this.q.equals(((vc1) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
