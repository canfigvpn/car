package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k3 {
    public static int a(float f, int i, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int d(int i, int i2, vf2 vf2Var) {
        return (vf2Var.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int f(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static ps g(String str) {
        vp0.c(str);
        return new ps();
    }

    public static String h(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String i(String str, int i) {
        return str + i;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String l(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void n(int i, int i2, int i3, int i4, int i5) {
        ix.b(i);
        ix.b(i2);
        ix.b(i3);
        ix.b(i4);
        ix.b(i5);
    }

    public static void o(int i, gt gtVar, ak0 ak0Var, boolean z) {
        gtVar.g(ak0Var, Integer.valueOf(i));
        ak0Var.p(z);
    }

    public static void p(int i, ak0 ak0Var, int i2, ra raVar) {
        ak0Var.g0(Integer.valueOf(i));
        ak0Var.b(raVar, Integer.valueOf(i2));
    }

    public static void q(int i, ak0 ak0Var, ra raVar, ak0 ak0Var2, x4 x4Var) {
        p12.f(ak0Var, Integer.valueOf(i), raVar);
        p12.k(ak0Var2, x4Var);
    }

    public static void r(long j, StringBuilder sb, String str) {
        sb.append((Object) dr.h(j));
        sb.append(str);
    }

    public static void s(ud udVar, long j) {
        udVar.g().i();
        udVar.z(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(xv1 xv1Var) throws Exception {
        boolean zIsTerminated;
        if (xv1Var instanceof AutoCloseable) {
            xv1Var.close();
            return;
        }
        if (!(xv1Var instanceof ExecutorService)) {
            if (xv1Var instanceof TypedArray) {
                ((TypedArray) xv1Var).recycle();
                return;
            } else if (xv1Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) xv1Var).release();
                return;
            } else {
                if (!(xv1Var instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) xv1Var).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) xv1Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void u(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void v(Object obj) {
        if (obj == null) {
            return;
        }
        fu1.c();
    }

    public static boolean w(Bundle bundle, String str, String str2) {
        bundle.getClass();
        str.getClass();
        return bundle.containsKey(str2);
    }
}
