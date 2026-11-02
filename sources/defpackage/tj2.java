package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class tj2 extends j02 {
    public static final Class b;
    public static final Constructor c;
    public static final Method d;
    public static final Method e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    public static boolean u(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface v(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.j02
    public final Typeface h(Context context, bh0 bh0Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (ch0 ch0Var : bh0Var.a) {
                int i2 = ch0Var.f;
                File fileK = n02.k(context);
                if (fileK != null) {
                    try {
                        if (n02.g(fileK, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileK);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            fileK.delete();
                        } else {
                            fileK.delete();
                        }
                        if (map != null && u(objNewInstance, map, ch0Var.e, ch0Var.b, ch0Var.c)) {
                        }
                    } catch (Throwable th3) {
                        fileK.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return v(objNewInstance);
        }
        return null;
    }

    @Override // defpackage.j02
    public final Typeface i(Context context, oh0[] oh0VarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            w42 w42Var = new w42();
            for (oh0 oh0Var : oh0VarArr) {
                Uri uri = oh0Var.a;
                ByteBuffer byteBufferM = (ByteBuffer) w42Var.get(uri);
                if (byteBufferM == null) {
                    byteBufferM = n02.m(context, uri);
                    w42Var.put(uri, byteBufferM);
                }
                if (byteBufferM != null && u(objNewInstance, byteBufferM, oh0Var.b, oh0Var.c, oh0Var.d)) {
                }
            }
            Typeface typefaceV = v(objNewInstance);
            if (typefaceV != null) {
                return Typeface.create(typefaceV, i);
            }
        }
        return null;
    }
}
