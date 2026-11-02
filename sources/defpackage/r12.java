package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ir.alirezaivaz.mygarage.MainActivity;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r12 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r12(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f2 A[Catch: all -> 0x00e8, LOOP:2: B:35:0x00b3->B:49:0x00f2, LOOP_END, TryCatch #2 {all -> 0x00e8, blocks: (B:43:0x00e2, B:46:0x00ea, B:51:0x00fa, B:49:0x00f2), top: B:94:0x00e2 }] */
    @Override // defpackage.ti0
    public final Object a() throws Throwable {
        Object obj;
        int i = this.e;
        boolean z = true;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return obj2;
            case 1:
                u12 u12Var = (u12) obj2;
                return Integer.valueOf(ux.w(u12Var, u12Var.k));
            case 2:
                return ((nv0) ((ArrayList) obj2).get(0)).a.a.b();
            case 3:
                p32 p32Var = (p32) obj2;
                dk1 dk1Var = p32Var.g;
                if (((d52) dk1Var.getValue()).a == 9205357640488583168L || d52.c(((d52) dk1Var.getValue()).a)) {
                    return null;
                }
                sk skVar = p32Var.e;
                long j = ((d52) dk1Var.getValue()).a;
                return skVar.c;
            case 4:
                om omVar = ((u52) obj2).b;
                if (omVar.u() instanceof ve1) {
                    omVar.i(e62.e);
                }
                return Boolean.TRUE;
            case 5:
                k72 k72Var = (k72) obj2;
                while (true) {
                    Object obj3 = k72Var.g;
                    synchronized (obj3) {
                        try {
                            if (k72Var.c) {
                                obj = obj3;
                            } else {
                                k72Var.c = z;
                                try {
                                    fa1 fa1Var = k72Var.f;
                                    Object[] objArr = fa1Var.e;
                                    int i2 = fa1Var.g;
                                    int i3 = 0;
                                    while (i3 < i2) {
                                        j72 j72Var = (j72) objArr[i3];
                                        x91 x91Var = j72Var.g;
                                        ej0 ej0Var = j72Var.a;
                                        Object[] objArr2 = x91Var.b;
                                        long[] jArr = x91Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i4 = 0;
                                            while (true) {
                                                long j2 = jArr[i4];
                                                obj = obj3;
                                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                    for (int i6 = 0; i6 < i5; i6++) {
                                                        if ((j2 & 255) < 128) {
                                                            try {
                                                                ej0Var.h(objArr2[(i4 << 3) + i6]);
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                k72Var.c = false;
                                                                throw th;
                                                            }
                                                        }
                                                        j2 >>= 8;
                                                    }
                                                    if (i5 == 8) {
                                                        if (i4 != length) {
                                                            i4++;
                                                            obj3 = obj;
                                                        }
                                                    }
                                                } else if (i4 != length) {
                                                    i4++;
                                                    obj3 = obj;
                                                }
                                            }
                                        } else {
                                            obj = obj3;
                                        }
                                        x91Var.b();
                                        i3++;
                                        obj3 = obj;
                                    }
                                    obj = obj3;
                                    try {
                                        k72Var.c = false;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = obj3;
                                }
                            }
                            if (!k72Var.b()) {
                                return ll2.a;
                            }
                            z = true;
                        } catch (Throwable th4) {
                            th = th4;
                            obj = obj3;
                        }
                    }
                }
                break;
            case 6:
                View viewInflate = View.inflate((MainActivity) ((ru1) obj2).b, R.layout.splash_screen_view, null);
                viewInflate.getClass();
                return (ViewGroup) viewInflate;
            case 7:
                PendingIntent actionIntent = ((RemoteAction) obj2).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return ll2.a;
            case 8:
                dd2 dd2Var = (dd2) obj2;
                return dd2Var.r ? c22.a(dd2Var) : mc2.b;
            case 9:
                uf2 uf2Var = (uf2) obj2;
                uf2Var.C = null;
                n02.l(uf2Var);
                rw.z(uf2Var);
                vv.B(uf2Var);
                return Boolean.TRUE;
            default:
                bh2 bh2Var = (bh2) obj2;
                bh2Var.R.h(Boolean.valueOf(!bh2Var.Q));
                return ll2.a;
        }
    }
}
