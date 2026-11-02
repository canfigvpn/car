package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xn2 extends zn2 {
    public static xn2 c;
    public static final iq1 d = new iq1(26);
    public final Application b;

    public xn2(Application application) {
        this.b = application;
    }

    @Override // defpackage.zn2, defpackage.yn2
    public final un2 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.zn2, defpackage.yn2
    public final un2 b(Class cls, a91 a91Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) a91Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!da.class.isAssignableFrom(cls)) {
            return rw.q(cls);
        }
        qj.r("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final un2 d(Class cls, Application application) {
        if (!da.class.isAssignableFrom(cls)) {
            return rw.q(cls);
        }
        try {
            un2 un2Var = (un2) cls.getConstructor(Application.class).newInstance(application);
            un2Var.getClass();
            return un2Var;
        } catch (IllegalAccessException e) {
            qj.m("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            qj.m("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            qj.m("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            qj.m("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
