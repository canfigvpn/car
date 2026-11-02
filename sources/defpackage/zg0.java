package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zg0 {
    public static final e51 a = new e51(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final w42 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new et1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new w42();
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((tg0) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static yg0 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceI;
        e51 e51Var = a;
        r02.g("getFontSync");
        try {
            Typeface typeface = (Typeface) e51Var.a(str);
            if (typeface != null) {
                yg0 yg0Var = new yg0(typeface);
                Trace.endSection();
                return yg0Var;
            }
            try {
                nh0 nh0VarA = sg0.a(context, list);
                List list2 = nh0VarA.b;
                int i3 = nh0VarA.a;
                if (i3 == 0) {
                    oh0[] oh0VarArr = (oh0[]) list2.get(0);
                    if (oh0VarArr == null || oh0VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = oh0VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = oh0VarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    yg0 yg0Var2 = new yg0(i2);
                    Trace.endSection();
                    return yg0Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    oh0[] oh0VarArr2 = (oh0[]) list2.get(0);
                    j02 j02Var = rj2.a;
                    r02.g("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceI = rj2.a.i(context, oh0VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    j02 j02Var2 = rj2.a;
                    r02.g("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceI = rj2.a.j(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceI == null) {
                    yg0 yg0Var3 = new yg0(-3);
                    Trace.endSection();
                    return yg0Var3;
                }
                e51Var.b(str, typefaceI);
                yg0 yg0Var4 = new yg0(typefaceI);
                Trace.endSection();
                return yg0Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                yg0 yg0Var5 = new yg0(-1);
                Trace.endSection();
                return yg0Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
