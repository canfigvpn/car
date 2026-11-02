package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class sj2 extends j02 {
    public static Class b = null;
    public static Constructor c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static boolean u(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        v();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void v() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    @Override // defpackage.j02
    public Typeface h(Context context, bh0 bh0Var, Resources resources, int i) throws NoSuchMethodException {
        v();
        try {
            Object objNewInstance = c.newInstance(null);
            for (ch0 ch0Var : bh0Var.a) {
                File fileK = n02.k(context);
                if (fileK == null) {
                    return null;
                }
                try {
                    if (!n02.g(fileK, resources, ch0Var.f)) {
                        return null;
                    }
                    if (!u(objNewInstance, fileK.getPath(), ch0Var.b, ch0Var.c)) {
                        return null;
                    }
                    fileK.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileK.delete();
                }
            }
            v();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.j02
    public Typeface i(Context context, oh0[] oh0VarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (oh0VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(j02.m(oh0VarArr, i).a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (ErrnoException unused) {
                        }
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile2;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            File fileK = n02.k(context);
                            if (fileK == null) {
                                typefaceCreateFromFile = null;
                            } else {
                                try {
                                    if (n02.h(fileK, fileInputStream)) {
                                        typefaceCreateFromFile = Typeface.createFromFile(fileK.getPath());
                                        fileK.delete();
                                    } else {
                                        fileK.delete();
                                        typefaceCreateFromFile = null;
                                    }
                                } catch (RuntimeException unused2) {
                                } catch (Throwable th) {
                                    fileK.delete();
                                    throw th;
                                }
                            }
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        } catch (Throwable th2) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
