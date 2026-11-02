package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ym2 {
    public final se a;
    public final se b;
    public final se c;

    public ym2(se seVar, se seVar2, se seVar3) {
        this.a = seVar;
        this.b = seVar2;
        this.c = seVar3;
    }

    public abstract zm2 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        se seVar = this.c;
        Class cls2 = (Class) seVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        seVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        se seVar = this.a;
        Method method = (Method) seVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ym2.class.getClassLoader()).getDeclaredMethod("read", ym2.class);
        seVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        se seVar = this.b;
        Method method = (Method) seVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, ym2.class);
        seVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((zm2) this).e.readParcelable(zm2.class.getClassLoader());
    }

    public final an2 g() {
        String string = ((zm2) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (an2) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void h(int i);

    public final void i(an2 an2Var) {
        if (an2Var == null) {
            ((zm2) this).e.writeString(null);
            return;
        }
        try {
            ((zm2) this).e.writeString(b(an2Var.getClass()).getName());
            zm2 zm2VarA = a();
            try {
                d(an2Var.getClass()).invoke(null, an2Var, zm2VarA);
                Parcel parcel = zm2VarA.e;
                int i = zm2VarA.i;
                if (i >= 0) {
                    int i2 = zm2VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(an2Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
