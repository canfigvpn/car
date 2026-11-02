package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n02 {
    public static final void a(final gt gtVar, ij0 ij0Var, ij0 ij0Var2, vf2 vf2Var, final long j, long j2, ak0 ak0Var, final int i) {
        ij0 ij0Var3;
        long j3;
        vf2 vf2Var2;
        ij0 ij0Var4;
        boolean z;
        int i2;
        boolean z2;
        ak0Var.X(-931325388);
        int i3 = i | (ak0Var.h(gtVar) ? 4 : 2) | (ak0Var.h(ij0Var) ? 32 : 16) | (ak0Var.h(ij0Var2) ? 256 : 128) | (ak0Var.f(vf2Var) ? 2048 : 1024) | (ak0Var.e(j) ? 16384 : 8192) | (ak0Var.e(j2) ? 131072 : 65536);
        if (ak0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            float f = ij0Var2 == null ? 8.0f : 0.0f;
            r71 r71Var = r71.a;
            u71 u71VarF0 = p61.f0(r71Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new n6(6);
                ak0Var.g0(objL);
            }
            w61 w61Var = (w61) objL;
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = nj2.B(ak0Var, u71VarF0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            ra raVar = vu.f;
            p12.l(raVar, ak0Var, w61Var);
            ra raVar2 = vu.e;
            p12.l(raVar2, ak0Var, sl1VarL);
            ra raVar3 = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar3);
            }
            ra raVar4 = vu.d;
            p12.l(raVar4, ak0Var, u71VarB);
            u71 u71VarE0 = p61.e0(vs0.s(r71Var, "text"), 0.0f, 6.0f, 1);
            wi wiVar = q90.f;
            w61 w61VarC = xj.c(wiVar, false);
            int iX2 = ws0.x(ak0Var);
            sl1 sl1VarL2 = ak0Var.l();
            u71 u71VarB2 = nj2.B(ak0Var, u71VarE0);
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(wvVar);
            } else {
                ak0Var.j0();
            }
            p12.l(raVar, ak0Var, w61VarC);
            p12.l(raVar2, ak0Var, sl1VarL2);
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX2))) {
                k3.p(iX2, ak0Var, iX2, raVar3);
            }
            p12.l(raVar4, ak0Var, u71VarB2);
            k3.o(i3 & 14, gtVar, ak0Var, true);
            if (ij0Var != null) {
                ak0Var.W(-1014168049);
                u71 u71VarS = vs0.s(r71Var, "action");
                w61 w61VarC2 = xj.c(wiVar, false);
                int iX3 = ws0.x(ak0Var);
                sl1 sl1VarL3 = ak0Var.l();
                u71 u71VarB3 = nj2.B(ak0Var, u71VarS);
                ak0Var.Z();
                i2 = 8;
                if (ak0Var.S) {
                    ak0Var.k(wvVar);
                } else {
                    ak0Var.j0();
                }
                p12.l(raVar, ak0Var, w61VarC2);
                p12.l(raVar2, ak0Var, sl1VarL3);
                if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX3))) {
                    k3.p(iX3, ak0Var, iX3, raVar3);
                }
                p12.l(raVar4, ak0Var, u71VarB3);
                vf2Var2 = vf2Var;
                ij0Var3 = ij0Var;
                sv.b(new vq1[]{yw.a.a(new dr(j)), ef2.a.a(vf2Var2)}, ij0Var3, ak0Var, 8 | (i3 & 112));
                ak0Var.p(true);
                z = false;
                ak0Var.p(false);
            } else {
                ij0Var3 = ij0Var;
                vf2Var2 = vf2Var;
                z = false;
                i2 = 8;
                ak0Var.W(-1013852841);
                ak0Var.p(false);
            }
            if (ij0Var2 != null) {
                ak0Var.W(-1013804481);
                u71 u71VarS2 = vs0.s(r71Var, "dismissAction");
                w61 w61VarC3 = xj.c(wiVar, z);
                int iX4 = ws0.x(ak0Var);
                sl1 sl1VarL4 = ak0Var.l();
                u71 u71VarB4 = nj2.B(ak0Var, u71VarS2);
                ak0Var.Z();
                if (ak0Var.S) {
                    ak0Var.k(wvVar);
                } else {
                    ak0Var.j0();
                }
                p12.l(raVar, ak0Var, w61VarC3);
                p12.l(raVar2, ak0Var, sl1VarL4);
                if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX4))) {
                    k3.p(iX4, ak0Var, iX4, raVar3);
                }
                p12.l(raVar4, ak0Var, u71VarB4);
                j3 = j2;
                ij0Var4 = ij0Var2;
                sv.a(yw.a.a(new dr(j3)), ij0Var4, ak0Var, i2 | ((i3 >> 3) & 112));
                z2 = true;
                ak0Var.p(true);
                ak0Var.p(false);
            } else {
                ij0Var4 = ij0Var2;
                j3 = j2;
                z2 = true;
                ak0Var.W(-1013535401);
                ak0Var.p(z);
            }
            ak0Var.p(z2);
        } else {
            ij0Var3 = ij0Var;
            j3 = j2;
            vf2Var2 = vf2Var;
            ij0Var4 = ij0Var2;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            final ij0 ij0Var5 = ij0Var4;
            final vf2 vf2Var3 = vf2Var2;
            final long j4 = j3;
            final ij0 ij0Var6 = ij0Var3;
            lr1VarR.d = new ij0(ij0Var6, ij0Var5, vf2Var3, j, j4, i) { // from class: a62
                public final /* synthetic */ ij0 f;
                public final /* synthetic */ ij0 g;
                public final /* synthetic */ vf2 h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;

                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(1);
                    n02.a(this.e, this.f, this.g, this.h, this.i, this.j, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void b(final u71 u71Var, final ij0 ij0Var, final ij0 ij0Var2, final u32 u32Var, final long j, final long j2, final long j3, final long j4, final gt gtVar, ak0 ak0Var, final int i) {
        int i2;
        ij0 ij0Var3;
        ij0 ij0Var4;
        u32 u32Var2;
        long j5;
        gt gtVar2;
        ak0Var.X(-1218779924);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ij0Var3 = ij0Var;
            i2 |= ak0Var.h(ij0Var3) ? 32 : 16;
        } else {
            ij0Var3 = ij0Var;
        }
        if ((i & 384) == 0) {
            ij0Var4 = ij0Var2;
            i2 |= ak0Var.h(ij0Var4) ? 256 : 128;
        } else {
            ij0Var4 = ij0Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= ak0Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            u32Var2 = u32Var;
            i2 |= ak0Var.f(u32Var2) ? 16384 : 8192;
        } else {
            u32Var2 = u32Var;
        }
        if ((196608 & i) == 0) {
            i2 |= ak0Var.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ak0Var.e(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= ak0Var.e(j5) ? 8388608 : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= ak0Var.e(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            gtVar2 = gtVar;
            i2 |= ak0Var.h(gtVar2) ? 536870912 : 268435456;
        } else {
            gtVar2 = gtVar;
        }
        if (ak0Var.O(i2 & 1, (306783379 & i2) != 306783378)) {
            ak0Var.T();
            if ((i & 1) != 0 && !ak0Var.y()) {
                ak0Var.R();
            }
            ak0Var.q();
            float f = dv1.A;
            gt gtVarC = vs0.C(-1343524879, new d62(ij0Var3, gtVar2, ij0Var4, j5, j4), ak0Var);
            int i3 = (i2 & 14) | 12779520;
            int i4 = i2 >> 9;
            ra2.a(u71Var, u32Var2, j, j2, f, gtVarC, ak0Var, (i4 & 7168) | i3 | (i4 & 112) | (i4 & 896), 80);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: z52
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i | 1);
                    n02.b(u71Var, ij0Var, ij0Var2, u32Var, j, j2, j3, j4, gtVar, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final void c(final u52 u52Var, u71 u71Var, u32 u32Var, long j, long j2, long j3, long j4, long j5, ak0 ak0Var, final int i) {
        int i2;
        final u71 u71Var2;
        final u32 u32Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long jE;
        long jE2;
        u32 u32Var3;
        u71 u71Var3;
        int i3;
        long j11;
        long j12;
        long j13;
        ak0Var.X(274621471);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(u52Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (ak0Var.O(i4 & 1, (38347923 & i4) != 38347922)) {
            ak0Var.T();
            if ((i & 1) == 0 || ak0Var.y()) {
                u32 u32VarA = j42.a(dv1.B, ak0Var);
                jE = lr.e(dv1.z, ak0Var);
                jE2 = lr.e(dv1.D, ak0Var);
                kr krVar = dv1.x;
                long jE3 = lr.e(krVar, ak0Var);
                long jE4 = lr.e(krVar, ak0Var);
                long jE5 = lr.e(dv1.C, ak0Var);
                int i5 = i4 & (-268434433);
                u32Var3 = u32VarA;
                u71Var3 = r71.a;
                i3 = i5;
                j11 = jE3;
                j12 = jE4;
                j13 = jE5;
            } else {
                ak0Var.R();
                int i6 = i4 & (-268434433);
                u32Var3 = u32Var;
                jE = j;
                jE2 = j2;
                j11 = j3;
                j12 = j4;
                j13 = j5;
                i3 = i6;
                u71Var3 = u71Var;
            }
            ak0Var.q();
            u52Var.a.getClass();
            ak0Var.W(-663517017);
            ak0Var.p(false);
            u52Var.a.getClass();
            ak0Var.W(-662974393);
            ak0Var.p(false);
            u32 u32Var4 = u32Var3;
            long j14 = jE;
            long j15 = jE2;
            j9 = j12;
            j10 = j13;
            b(p61.c0(u71Var3, 12.0f), null, null, u32Var4, j14, j15, j9, j10, vs0.C(-1266389126, new s52(u52Var, 1), ak0Var), ak0Var, ((i3 << 3) & 7168) | 805306368);
            u71Var2 = u71Var3;
            u32Var2 = u32Var4;
            j6 = j14;
            j7 = j15;
            j8 = j11;
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            u32Var2 = u32Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: y52
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i | 1);
                    n02.c(u52Var, u71Var2, u32Var2, j6, j7, j8, j9, j10, (ak0) obj, iP);
                    return ll2.a;
                }
            };
        }
    }

    public static final long d(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static void e(StringBuilder sb, Object obj, ej0 ej0Var) {
        if (ej0Var != null) {
            sb.append((CharSequence) ej0Var.h(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static z22 f(z22 z22Var) {
        x51 x51Var = z22Var.e;
        x51Var.b();
        return x51Var.m > 0 ? z22Var : z22.f;
    }

    public static boolean g(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zH = h(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zH;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean h(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static final yr1 i(t71 t71Var, boolean z, boolean z2) {
        if (!t71Var.e.r) {
            return yr1.e;
        }
        if (z) {
            return qx.T(t71Var, 8).o1();
        }
        me1 me1VarT = qx.T(t71Var, 8);
        return sv.A(me1VarT).K(me1VarT, z2);
    }

    public static final co2 j(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            co2 co2Var = tag instanceof co2 ? (co2) tag : null;
            if (co2Var != null) {
                return co2Var;
            }
            Object objL = y12.l(view);
            view = objL instanceof View ? (View) objL : null;
        }
        return null;
    }

    public static File k(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, k3.i(str, i));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final void l(m02 m02Var) {
        qx.V(m02Var).F();
    }

    public static MappedByteBuffer m(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final long n(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : dr.b(dr.c(j) * f, j);
    }

    public static long o(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    public static final vf2 p(vf2 vf2Var, kw0 kw0Var) {
        long j;
        xe2 xe2Var;
        int i;
        int i2;
        mf2 mf2Var;
        r72 r72Var = vf2Var.a;
        ve2 ve2Var = s72.d;
        ve2 ve2Var2 = r72Var.a;
        if (ve2Var2.equals(ue2.a)) {
            ve2Var2 = s72.d;
        }
        ve2 ve2Var3 = ve2Var2;
        long j2 = r72Var.b;
        zf2[] zf2VarArr = yf2.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = s72.a;
        }
        long j3 = j2;
        lh0 lh0Var = r72Var.c;
        if (lh0Var == null) {
            lh0Var = lh0.i;
        }
        lh0 lh0Var2 = lh0Var;
        hh0 hh0Var = r72Var.d;
        hh0 hh0Var2 = new hh0(hh0Var != null ? hh0Var.a : 0);
        ih0 ih0Var = r72Var.e;
        ih0 ih0Var2 = new ih0(ih0Var != null ? ih0Var.a : 65535);
        kg0 kg0Var = r72Var.f;
        if (kg0Var == null) {
            kg0Var = kg0.e;
        }
        kg0 kg0Var2 = kg0Var;
        String str = r72Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = r72Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = s72.b;
        }
        long j5 = j4;
        th thVar = r72Var.i;
        float f = thVar != null ? thVar.a : 0.0f;
        th thVar2 = new th(Float.isNaN(f) ? 0.0f : f);
        we2 we2Var = r72Var.j;
        if (we2Var == null) {
            we2Var = we2.c;
        }
        we2 we2Var2 = we2Var;
        q31 q31VarH = r72Var.k;
        if (q31VarH == null) {
            q31 q31Var = q31.g;
            q31VarH = qm1.a.h();
        }
        q31 q31Var2 = q31VarH;
        long j6 = r72Var.l;
        if (j6 == 16) {
            j6 = s72.c;
        }
        long j7 = j6;
        ed2 ed2Var = r72Var.m;
        if (ed2Var == null) {
            ed2Var = ed2.b;
        }
        ed2 ed2Var2 = ed2Var;
        q32 q32Var = r72Var.n;
        if (q32Var == null) {
            q32Var = q32.d;
        }
        q32 q32Var2 = q32Var;
        gn1 gn1Var = r72Var.o;
        m80 m80Var = r72Var.p;
        if (m80Var == null) {
            m80Var = fd0.a;
        }
        r72 r72Var2 = new r72(ve2Var3, j3, lh0Var2, hh0Var2, ih0Var2, kg0Var2, str2, j5, thVar2, we2Var2, q31Var2, j7, ed2Var2, q32Var2, gn1Var, m80Var);
        wj1 wj1Var = vf2Var.b;
        int i3 = xj1.b;
        int i4 = wj1Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = wj1Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = kw0Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        qj.p();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = wj1Var.c;
            if ((j & 1095216660480L) == 0) {
                j = xj1.a;
            }
            xe2Var = wj1Var.d;
            if (xe2Var == null) {
                xe2Var = xe2.c;
            }
            ym1 ym1Var = wj1Var.e;
            o21 o21Var = wj1Var.f;
            i = wj1Var.g;
            if (i == 0) {
                i = j21.b;
            }
            i2 = wj1Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            mf2Var = wj1Var.i;
            if (mf2Var == null) {
                mf2Var = mf2.c;
            }
            return new vf2(r72Var2, new wj1(i4, i6, j, xe2Var, ym1Var, o21Var, i, i2, mf2Var), vf2Var.c);
        }
        int iOrdinal2 = kw0Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            qj.p();
            return null;
        }
        i6 = i5;
        j = wj1Var.c;
        if ((j & 1095216660480L) == 0) {
            j = xj1.a;
        }
        xe2Var = wj1Var.d;
        if (xe2Var == null) {
            xe2Var = xe2.c;
        }
        ym1 ym1Var2 = wj1Var.e;
        o21 o21Var2 = wj1Var.f;
        i = wj1Var.g;
        if (i == 0) {
            i = j21.b;
        }
        i2 = wj1Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        mf2Var = wj1Var.i;
        if (mf2Var == null) {
            mf2Var = mf2.c;
        }
        return new vf2(r72Var2, new wj1(i4, i6, j, xe2Var, ym1Var2, o21Var2, i, i2, mf2Var), vf2Var.c);
    }

    public static final Object q(tx txVar) {
        Object obj;
        uy uyVarF = txVar.f();
        mx.u(uyVarF);
        sx sxVarY = ex.y(txVar);
        p50 p50Var = sxVarY instanceof p50 ? (p50) sxVarY : null;
        fz fzVar = fz.e;
        ll2 ll2Var = ll2.a;
        if (p50Var == null) {
            obj = ll2Var;
        } else {
            xy xyVar = p50Var.h;
            if (xyVar.G(uyVarF)) {
                p50Var.j = ll2Var;
                p50Var.g = 1;
                xyVar.F(uyVarF, p50Var);
            } else {
                uy uyVarK = uyVarF.k(new hr2(hr2.f));
                p50Var.j = ll2Var;
                p50Var.g = 1;
                xyVar.F(uyVarK, p50Var);
            }
            obj = fzVar;
        }
        return obj == fzVar ? obj : ll2Var;
    }
}
