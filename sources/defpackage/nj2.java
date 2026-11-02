package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import ir.alirezaivaz.mygarage.R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nj2 {
    public static final Object A0;
    public static final v22 B0;
    public static final Object C0;
    public static jo0 D0;
    public static final y32 E;
    public static jo0 E0;
    public static final float F;
    public static final hk2 G;
    public static final kr H;
    public static final kr I;
    public static final kr J;
    public static final float K;
    public static final kr L;
    public static final kr M;
    public static final float N;
    public static final kr O;
    public static final hk2 P;
    public static final kr Q;
    public static final hk2 R;
    public static final kr S;
    public static final kr T;
    public static final kr U;
    public static final kr V;
    public static final hk2 W;
    public static final float X;
    public static final float Y;
    public static final hk2 Z;
    public static final kr a0;
    public static final gt b;
    public static final kr b0;
    public static final y32 c0;
    public static final kr d0;
    public static final gt e;
    public static final p40 e0;
    public static final gt f;
    public static final kr f0;
    public static final gt g;
    public static final kr g0;
    public static final gt h;
    public static final float h0;
    public static final gt i;
    public static final kr i0;
    public static final gt j;
    public static final float j0;
    public static final float k0;
    public static final kr l0;
    public static bu1 m0;
    public static final gt n;
    public static final pa0 n0;
    public static final pa0 o0;
    public static final pa0 p0;
    public static final pa0 q0;
    public static final pa0 r0;
    public static final gt s;
    public static final xa0 s0;
    public static final gt t;
    public static final xa0 t0;
    public static final pa0 u0;
    public static final kr v0;
    public static final y32 w0;
    public static final gt x;
    public static final kr x0;
    public static final gt y;
    public static final hk2 y0;
    public static final w40 z0;
    public static final hk2 a = hk2.l;
    public static final gt c = new gt(new qt(7), false, -109061290);
    public static final gt d = new gt(new ut(5), false, -1409832126);
    public static final gt k = new gt(new tt(10), false, 1592932492);
    public static final gt l = new gt(new tt(11), false, 253046715);
    public static final gt m = new gt(new tt(12), false, -718978434);
    public static final gt o = new gt(new tt(13), false, 1327130852);
    public static final gt p = new gt(new tt(14), false, 836299561);
    public static final gt q = new gt(new tt(15), false, 1707121160);
    public static final gt r = new gt(new tt(16), false, -2097014845);
    public static final gt u = new gt(new qt(22), false, 1439159197);
    public static final gt v = new gt(new tt(17), false, 2132880440);
    public static final gt w = new gt(new tt(18), false, -704237102);
    public static final kr z = kr.v;
    public static final float A = 568.0f;
    public static final y32 B = y32.e;
    public static final float C = 360.0f;
    public static final float D = 40.0f;

    static {
        int i2 = 6;
        b = new gt(new qt(i2), false, 1214117656);
        e = new gt(new ut(i2), false, -178059541);
        int i3 = 8;
        f = new gt(new qt(i3), false, 1469396652);
        int i4 = 9;
        g = new gt(new qt(i4), false, 340692949);
        h = new gt(new tt(i3), false, 2131142546);
        int i5 = 21;
        i = new gt(new tt(i5), false, 1331858912);
        j = new gt(new tt(i4), false, -586580701);
        int i6 = 19;
        n = new gt(new qt(i6), false, 577580623);
        int i7 = 20;
        s = new gt(new qt(i7), false, -694911397);
        t = new gt(new qt(i5), false, -1932640673);
        x = new gt(new tt(i6), false, -1522521195);
        y = new gt(new tt(i7), false, 1638872385);
        y32 y32Var = y32.g;
        E = y32Var;
        F = 40.0f;
        hk2 hk2Var = hk2.e;
        G = hk2Var;
        kr krVar = kr.p;
        H = krVar;
        kr krVar2 = kr.i;
        I = krVar2;
        J = krVar;
        K = 1.0f;
        L = krVar;
        kr krVar3 = kr.l;
        M = krVar3;
        N = 120.0f;
        kr krVar4 = kr.m;
        O = krVar4;
        P = hk2.h;
        Q = krVar4;
        R = hk2.j;
        S = kr.s;
        T = kr.k;
        U = krVar4;
        V = krVar3;
        W = hk2Var;
        X = 36.0f;
        Y = 72.0f;
        Z = hk2Var;
        a0 = krVar;
        b0 = krVar2;
        c0 = y32Var;
        d0 = krVar4;
        e0 = new p40(1.0f, 1.0f);
        f0 = krVar;
        g0 = krVar3;
        h0 = 0.1f;
        i0 = krVar4;
        j0 = 0.38f;
        k0 = 1.0f;
        l0 = krVar2;
        n0 = new pa0("COMPLETING_ALREADY", 1);
        o0 = new pa0("COMPLETING_WAITING_CHILDREN", 1);
        p0 = new pa0("COMPLETING_RETRY", 1);
        q0 = new pa0("TOO_LATE_TO_CANCEL", 1);
        r0 = new pa0("SEALED", 1);
        s0 = new xa0(false);
        t0 = new xa0(true);
        u0 = new pa0("NO_OWNER", 1);
        v0 = kr.h;
        w0 = y32.f;
        x0 = kr.f;
        y0 = hk2.g;
        z0 = new w40(29);
        A0 = new Object();
        B0 = new v22(i2);
        C0 = new Object();
    }

    public static final u71 A(ak0 ak0Var, u71 u71Var) {
        if (u71Var.b(x4.v)) {
            return u71Var;
        }
        ak0Var.S(null, 1219399079, null, 0);
        u71 u71Var2 = (u71) u71Var.a(new q(4, ak0Var), r71.a);
        ak0Var.p(false);
        return u71Var2;
    }

    public static final u71 B(ak0 ak0Var, u71 u71Var) {
        ak0Var.W(439770924);
        u71 u71VarA = A(ak0Var, u71Var);
        ak0Var.p(false);
        return u71VarA;
    }

    public static final boolean C(h72 h72Var, ej0 ej0Var) {
        int i2;
        d0 d0Var;
        Object objH;
        o62 o62VarH;
        boolean zH;
        do {
            synchronized (A0) {
                u82 u82Var = h72Var.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i2 = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            dm1 dm1VarE = d0Var.e();
            objH = ej0Var.h(dm1VarE);
            d0 d0VarC = dm1VarE.c();
            if (ws0.j(d0VarC, d0Var)) {
                break;
            }
            u82 u82Var3 = h72Var.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = h((u82) x62.w(u82Var3, h72Var, o62VarH), i2, d0VarC, true);
            }
            x62.l(o62VarH, h72Var);
        } while (!zH);
        return ((Boolean) objH).booleanValue();
    }

    public static void D(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static final zx1 E(ak0 ak0Var) {
        Object[] objArr = new Object[0];
        boolean zD = ak0Var.d(0);
        Object objL = ak0Var.L();
        if (zD || objL == cv.a) {
            objL = new vr0(24);
            ak0Var.g0(objL);
        }
        return (zx1) ex.I(objArr, zx1.j, (ti0) objL, ak0Var, 0);
    }

    public static void F(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(k3.j(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        ws0.P(classCastException, nj2.class.getName());
        throw classCastException;
    }

    public static final void G(String str, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static final Object H(Object obj) {
        to0 to0Var = obj instanceof to0 ? (to0) obj : null;
        return to0Var != null ? to0Var.a : obj;
    }

    public static final void I(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static u71 J(u71 u71Var, zx1 zx1Var) {
        return u71Var.c(k(r71.a, tn0.c)).c(new ay1(null, null, zx1Var.d, di1.e, zx1Var, true, true)).c(new py1(zx1Var));
    }

    public static final Object K(uy uyVar, ij0 ij0Var, sx sxVar) {
        Unsafe unsafe;
        long j2;
        uy uyVarF = sxVar.f();
        uy uyVarK = !((Boolean) uyVar.s(new vy(0), Boolean.FALSE)).booleanValue() ? uyVarF.k(uyVar) : ix.y(uyVarF, uyVar, false);
        mx.u(uyVarK);
        if (uyVarK == uyVarF) {
            mx1 mx1Var = new mx1(sxVar, uyVarK);
            return c12.A(mx1Var, mx1Var, ij0Var);
        }
        q90 q90Var = q90.A;
        if (ws0.j(uyVarK.p(q90Var), uyVarF.p(q90Var))) {
            il2 il2Var = new il2(sxVar, uyVarK);
            uy uyVar2 = il2Var.g;
            Object objS0 = p61.s0(uyVar2, null);
            try {
                return c12.A(il2Var, il2Var, ij0Var);
            } finally {
                p61.h0(uyVar2, objS0);
            }
        }
        q50 q50Var = new q50(sxVar, uyVarK);
        try {
            ws0.O(ex.y(ex.m(q50Var, q50Var, ij0Var)), ll2.a);
            do {
                unsafe = we.a;
                j2 = q50.i;
                int intVolatile = unsafe.getIntVolatile(q50Var, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        fu1.h("Already suspended");
                        return null;
                    }
                    Object objH = H(q50Var.O());
                    if (objH instanceof os) {
                        throw ((os) objH).a;
                    }
                    return objH;
                }
            } while (!unsafe.compareAndSwapInt(q50Var, j2, 0, 1));
            return fz.e;
        } catch (Throwable th) {
            q50Var.i(new ut1(th));
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0192 A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #30 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:283:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a3 A[Catch: IllegalStateException -> 0x0189, IOException -> 0x018b, FileNotFoundException -> 0x018d, TRY_LEAVE, TryCatch #34 {FileNotFoundException -> 0x018d, IOException -> 0x018b, IllegalStateException -> 0x0189, blocks: (B:92:0x0166, B:97:0x0184, B:115:0x01a3, B:113:0x01a0, B:112:0x019d), top: B:299:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e3 A[Catch: all -> 0x01f1, TRY_LEAVE, TryCatch #14 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:272:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f4 A[Catch: all -> 0x01f1, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x01f1, blocks: (B:130:0x01d7, B:132:0x01e3, B:141:0x01f4), top: B:272:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:156:0x021b  */
    /* JADX WARN: Code duplicated, block: B:157:0x021f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0241 A[Catch: all -> 0x027f, TryCatch #23 {all -> 0x027f, blocks: (B:164:0x023b, B:166:0x0241, B:167:0x0245, B:169:0x024b), top: B:277:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:169:0x024b A[Catch: all -> 0x027f, TRY_LEAVE, TryCatch #23 {all -> 0x027f, blocks: (B:164:0x023b, B:166:0x0241, B:167:0x0245, B:169:0x024b), top: B:277:0x023b }] */
    /* JADX WARN: Code duplicated, block: B:235:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:239:0x02da  */
    /* JADX WARN: Code duplicated, block: B:246:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:269:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x023b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0223 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0250 A[EDGE_INSN: B:300:0x0250->B:171:0x0250 BREAK  A[LOOP:0: B:167:0x0245->B:301:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_LEAVE, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:269:0x0107, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x012d A[Catch: all -> 0x0126, IllegalStateException -> 0x0129, IOException -> 0x012b, TRY_ENTER, TryCatch #11 {IOException -> 0x012b, blocks: (B:53:0x0107, B:55:0x0111, B:66:0x012d, B:67:0x0132), top: B:269:0x0107, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x017a A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #30 {all -> 0x018f, blocks: (B:94:0x016e, B:96:0x017a, B:107:0x0192, B:108:0x0197), top: B:283:0x016e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    public static void L(Context context, Executor executor, jq1 jq1Var, boolean z2) {
        boolean z3;
        ?? F2;
        y40[] y40VarArrB;
        y40[] y40VarArr;
        jq1 jq1Var2;
        y40[] y40VarArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z4;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i2;
        ?? r9;
        boolean z5;
        boolean z6;
        ?? r10;
        ByteArrayOutputStream byteArrayOutputStream;
        x40 x40Var;
        ?? r11;
        String str;
        FileInputStream fileInputStreamF;
        ?? r12;
        ?? r13;
        boolean z7;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z7 = j2 == packageInfo.lastUpdateTime;
                            if (z7) {
                                jq1Var.i(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (z7) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    nq1.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = ir2.Q;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            x40 x40Var2 = new x40(assets, executor, jq1Var, name, file2);
            byte[] bArr5 = (byte[]) x40Var2.d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            x40Var2.a = true;
                            F2 = x40Var2.f(assets, "dexopt/baseline.prof");
                            if (F2 != 0) {
                                if (Arrays.equals(bArr4, ix.J(F2, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                y40VarArrB = ir2.B(F2, ix.J(F2, 4), (String) x40Var2.g);
                                F2.close();
                                x40Var2.h = y40VarArrB;
                            }
                            y40VarArr = (y40[]) x40Var2.h;
                            if (y40VarArr != null) {
                                str = "dexopt/baseline.profm";
                                fileInputStreamF = x40Var2.f(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamF == null) {
                                    if (fileInputStreamF != null) {
                                        fileInputStreamF.close();
                                        r11 = str;
                                    }
                                    x40Var = null;
                                    F2 = r11;
                                } else {
                                    if (Arrays.equals(ir2.R, ix.J(fileInputStreamF, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrJ = ix.J(fileInputStreamF, 4);
                                    x40Var2.h = ir2.y(fileInputStreamF, bArrJ, bArr5, y40VarArr);
                                    fileInputStreamF.close();
                                    x40Var = x40Var2;
                                    F2 = bArrJ;
                                }
                                if (x40Var != null) {
                                    x40Var2 = x40Var;
                                }
                            }
                            jq1Var2 = (jq1) x40Var2.c;
                            y40VarArr2 = (y40[]) x40Var2.h;
                            bArr = (byte[]) x40Var2.d;
                            r7 = F2;
                            r7 = F2;
                            if (y40VarArr2 != null) {
                                z6 = x40Var2.a;
                                if (z6) {
                                    fu1.h("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (ir2.H(byteArrayOutputStream, bArr, y40VarArr2)) {
                                    x40Var2.e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    x40Var2.h = null;
                                    r7 = r10;
                                } else {
                                    jq1Var2.i(5, null);
                                    x40Var2.h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = (byte[]) x40Var2.e;
                            if (bArr2 != null) {
                                if (x40Var2.a) {
                                    fu1.h("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                fileOutputStream = new FileOutputStream((File) x40Var2.f);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i2 = byteArrayInputStream.read(bArr3);
                                            if (i2 > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr3, 0, i2);
                                        }
                                        r9 = 1;
                                        x40Var2.g(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        x40Var2.e = null;
                                        x40Var2.h = null;
                                        z4 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z4 = false;
                            r9 = 1;
                            if (z4) {
                                D(packageInfo, filesDir);
                            }
                            z5 = z4;
                            r12 = r9;
                        } else {
                            x40Var2.g(4, null);
                        }
                    } catch (IOException unused2) {
                        z3 = true;
                        x40Var2.g(4, null);
                    }
                } else if (file2.canWrite()) {
                    x40Var2.a = true;
                    try {
                        F2 = x40Var2.f(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        jq1Var.i(6, e2);
                        F2 = 0;
                    } catch (IOException e3) {
                        jq1Var.i(7, e3);
                        F2 = 0;
                    }
                    try {
                        if (F2 != 0) {
                            try {
                                try {
                                    if (Arrays.equals(bArr4, ix.J(F2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    y40VarArrB = ir2.B(F2, ix.J(F2, 4), (String) x40Var2.g);
                                    try {
                                        F2.close();
                                    } catch (IOException e4) {
                                        jq1Var.i(7, e4);
                                    }
                                    x40Var2.h = y40VarArrB;
                                } catch (IllegalStateException e5) {
                                    jq1Var.i(8, e5);
                                    try {
                                        F2.close();
                                    } catch (IOException e6) {
                                        jq1Var.i(7, e6);
                                    }
                                    y40VarArrB = null;
                                }
                            } catch (IOException e7) {
                                jq1Var.i(7, e7);
                                F2.close();
                                y40VarArrB = null;
                            }
                        }
                        y40VarArr = (y40[]) x40Var2.h;
                        if (y40VarArr != null && ((F2 = Build.VERSION.SDK_INT) >= 31 || F2 == 24 || F2 == 25)) {
                            try {
                                str = "dexopt/baseline.profm";
                                fileInputStreamF = x40Var2.f(assets, "dexopt/baseline.profm");
                                r11 = str;
                                if (fileInputStreamF == null) {
                                    try {
                                        if (Arrays.equals(ir2.R, ix.J(fileInputStreamF, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrJ2 = ix.J(fileInputStreamF, 4);
                                        x40Var2.h = ir2.y(fileInputStreamF, bArrJ2, bArr5, y40VarArr);
                                        fileInputStreamF.close();
                                        x40Var = x40Var2;
                                        F2 = bArrJ2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamF.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamF != null) {
                                        fileInputStreamF.close();
                                        r11 = str;
                                    }
                                    x40Var = null;
                                    F2 = r11;
                                }
                            } catch (FileNotFoundException e8) {
                                jq1Var.i(9, e8);
                                r11 = F2;
                            } catch (IOException e9) {
                                jq1Var.i(7, e9);
                                r11 = F2;
                            } catch (IllegalStateException e10) {
                                x40Var2.h = null;
                                jq1Var.i(8, e10);
                                r11 = F2;
                            }
                            if (x40Var != null) {
                                x40Var2 = x40Var;
                            }
                        }
                        jq1Var2 = (jq1) x40Var2.c;
                        y40VarArr2 = (y40[]) x40Var2.h;
                        bArr = (byte[]) x40Var2.d;
                        r7 = F2;
                        r7 = F2;
                        if (y40VarArr2 != null && bArr != null) {
                            z6 = x40Var2.a;
                            if (z6) {
                                fu1.h("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (ir2.H(byteArrayOutputStream, bArr, y40VarArr2)) {
                                        jq1Var2.i(5, null);
                                        x40Var2.h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        x40Var2.e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        x40Var2.h = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e11) {
                                jq1Var2.i(7, e11);
                                r10 = z6;
                            } catch (IllegalStateException e12) {
                                jq1Var2.i(8, e12);
                                r10 = z6;
                            }
                        }
                        bArr2 = (byte[]) x40Var2.e;
                        if (bArr2 != null) {
                            z4 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (x40Var2.a) {
                                    fu1.h("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream((File) x40Var2.f);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i2 = byteArrayInputStream.read(bArr3);
                                                                                    if (i2 > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr3, 0, i2);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                x40Var2.g(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                x40Var2.e = null;
                                                                                x40Var2.h = null;
                                                                                z4 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                Throwable th14 = th;
                                                                if (channel == null) {
                                                                    throw th14;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th14;
                                                                } catch (Throwable th15) {
                                                                    th14.addSuppressed(th15);
                                                                    throw th14;
                                                                }
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e13) {
                                        e = e13;
                                        x40Var2.g(6, e);
                                        r8 = r7;
                                        x40Var2.e = null;
                                        x40Var2.h = null;
                                        z4 = false;
                                        r9 = r8;
                                    } catch (IOException e14) {
                                        e = e14;
                                        x40Var2.g(7, e);
                                        r8 = r7;
                                        x40Var2.e = null;
                                        x40Var2.h = null;
                                        z4 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e15) {
                                    e = e15;
                                    r7 = 1;
                                    x40Var2.g(6, e);
                                    r8 = r7;
                                    x40Var2.e = null;
                                    x40Var2.h = null;
                                    z4 = false;
                                    r9 = r8;
                                } catch (IOException e16) {
                                    e = e16;
                                    r7 = 1;
                                    x40Var2.g(7, e);
                                    r8 = r7;
                                    x40Var2.e = null;
                                    x40Var2.h = null;
                                    z4 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                x40Var2.e = null;
                                x40Var2.h = null;
                                throw th23;
                            }
                        }
                        if (z4) {
                            D(packageInfo, filesDir);
                        }
                        z5 = z4;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            F2.close();
                            throw th24;
                        } catch (IOException e17) {
                            jq1Var.i(7, e17);
                            throw th24;
                        }
                    }
                } else {
                    x40Var2.g(4, null);
                }
                if (z5 || !z2) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                nq1.c(context, r13);
            }
            x40Var2.g(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z3 = true;
            z5 = false;
            r12 = z3;
            if (z5) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            nq1.c(context, r13);
        } catch (PackageManager.NameNotFoundException e18) {
            jq1Var.i(7, e18);
            nq1.c(context, false);
        }
    }

    public static final void a(xo1 xo1Var, gt gtVar, mh2 mh2Var, gt gtVar2, ak0 ak0Var, int i2) {
        xo1 xo1Var2;
        int i3;
        da1 da1Var;
        boolean z2;
        ak0Var.X(-1221877520);
        if ((i2 & 6) == 0) {
            xo1Var2 = xo1Var;
            i3 = (ak0Var.f(xo1Var2) ? 4 : 2) | i2;
        } else {
            xo1Var2 = xo1Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? ak0Var.f(mh2Var) : ak0Var.h(mh2Var) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        r71 r71Var = r71.a;
        if (i4 == 0) {
            i3 |= ak0Var.f(r71Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ak0Var.h(null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= ak0Var.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ak0Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= ak0Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= ak0Var.h(gtVar2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (ak0Var.O(i5 & 1, (38347923 & i5) != 38347922)) {
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = s5.E(ak0Var);
                ak0Var.g0(objL);
            }
            ez ezVar = (ez) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == obj) {
                objL2 = y12.s(Boolean.FALSE);
                ak0Var.g0(objL2);
            }
            da1 da1Var2 = (da1) objL2;
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = B(ak0Var, r71Var);
            wu.c.getClass();
            ti0 ti0Var = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            if (mh2Var.b()) {
                ak0Var.W(-1891243071);
                da1Var = da1Var2;
                e(xo1Var2, mh2Var, ezVar, false, da1Var, gtVar, ak0Var, (i5 & 14) | 196608 | ((i5 >> 3) & 112) | ((i5 >> 6) & 896) | ((i5 << 15) & 3670016));
                z2 = false;
                ak0Var.p(false);
            } else {
                da1Var = da1Var2;
                z2 = false;
                ak0Var.W(-1890863476);
                ak0Var.p(false);
            }
            f(mh2Var, da1Var, gtVar2, ak0Var, ((i5 >> 18) & 14) | 384 | ((i5 >> 3) & 112) | ((i5 >> 12) & 7168) | (57344 & (i5 << 3)) | ((i5 >> 9) & 458752));
            ak0Var.p(true);
            boolean z3 = ((i5 & 896) == 256 || ((i5 & 512) != 0 && ak0Var.h(mh2Var))) ? true : z2;
            Object objL3 = ak0Var.L();
            if (z3 || objL3 == obj) {
                objL3 = new m(5, mh2Var);
                ak0Var.g0(objL3);
            }
            s5.e(mh2Var, (ej0) objL3, ak0Var);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new i3(xo1Var, gtVar, mh2Var, gtVar2, i2);
        }
    }

    public static final void b(u71 u71Var, ej0 ej0Var, ak0 ak0Var, int i2) {
        ak0Var.X(-932836462);
        int i3 = (ak0Var.f(u71Var) ? 4 : 2) | i2 | (ak0Var.h(ej0Var) ? 32 : 16);
        int i4 = 1;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            r02.b(ak0Var, ir2.l(u71Var, ej0Var));
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new jd(u71Var, ej0Var, i2, i4);
        }
    }

    public static final void c(ti0 ti0Var, u71 u71Var, boolean z2, u32 u32Var, bo boVar, co coVar, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        gt gtVar2;
        boolean z3;
        u32 u32Var2;
        bo boVar2;
        co coVar2;
        u32 u32Var3;
        co coVarJ;
        int i4;
        bo boVar3;
        boolean z4;
        ak0Var.X(2136075085);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.h(ti0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 = i3 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i5 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= 65536;
        }
        int i6 = 14155776 | i5;
        if ((100663296 & i2) == 0) {
            i6 |= ak0Var.h(gtVar) ? 67108864 : 33554432;
        }
        if (ak0Var.O(i6 & 1, (38347923 & i6) != 38347922)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                u32 u32VarA = j42.a(ir2.w, ak0Var);
                bo boVarI = dv1.i(ak0Var);
                u32Var3 = u32VarA;
                coVarJ = dv1.j();
                i4 = i6 & (-523265);
                boVar3 = boVarI;
                z4 = true;
            } else {
                ak0Var.R();
                z4 = z2;
                u32Var3 = u32Var;
                coVarJ = coVar;
                i4 = i6 & (-523265);
                boVar3 = boVar;
            }
            ak0Var.q();
            ak0Var.W(1577885006);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = new f91();
                ak0Var.g0(objL);
            }
            f91 f91Var = (f91) objL;
            ak0Var.p(false);
            gtVar2 = gtVar;
            ra2.c(ti0Var, u71Var, z4, u32Var3, z4 ? boVar3.a : boVar3.c, z4 ? boVar3.b : boVar3.d, 0.0f, ((w60) coVarJ.a(z4, f91Var, ak0Var, (i4 >> 6) & 14).getValue()).e, f91Var, vs0.C(-1347531112, new go(gtVar2, 1), ak0Var), ak0Var, (i4 & 8190) | ((i4 << 6) & 234881024), 64);
            boVar2 = boVar3;
            coVar2 = coVarJ;
            z3 = z4;
            u32Var2 = u32Var3;
        } else {
            gtVar2 = gtVar;
            ak0Var.R();
            z3 = z2;
            u32Var2 = u32Var;
            boVar2 = boVar;
            coVar2 = coVar;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new fo(ti0Var, u71Var, z3, u32Var2, boVar2, coVar2, gtVar2, i2);
        }
    }

    public static final void d(u71 u71Var, u32 u32Var, bo boVar, co coVar, gt gtVar, ak0 ak0Var, int i2) {
        u71 u71Var2;
        int i3;
        u32 u32Var2;
        bo boVar2;
        co coVar2;
        u32 u32VarA;
        bo boVarI;
        int i4;
        co coVarJ;
        ak0Var.X(1359693790);
        if ((i2 & 6) == 0) {
            u71Var2 = u71Var;
            i3 = (ak0Var.f(u71Var2) ? 4 : 2) | i2;
        } else {
            u71Var2 = u71Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        int i5 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i5 |= ak0Var.h(gtVar) ? 131072 : 65536;
        }
        int i6 = 0;
        if (ak0Var.O(i5 & 1, (74899 & i5) != 74898)) {
            ak0Var.T();
            if ((i2 & 1) == 0 || ak0Var.y()) {
                u32VarA = j42.a(ir2.w, ak0Var);
                boVarI = dv1.i(ak0Var);
                i4 = i5 & (-8177);
                coVarJ = dv1.j();
            } else {
                ak0Var.R();
                u32VarA = u32Var;
                boVarI = boVar;
                i4 = i5 & (-8177);
                coVarJ = coVar;
            }
            ak0Var.q();
            int i7 = i4;
            u32 u32Var3 = u32VarA;
            ra2.a(u71Var2, u32Var3, boVarI.a, boVarI.b, ((w60) coVarJ.a(true, null, ak0Var, 54).getValue()).e, vs0.C(-97109725, new go(gtVar, i6), ak0Var), ak0Var, (i7 & 14) | 12582912 | ((i7 << 6) & 3670016), 16);
            boVar2 = boVarI;
            coVar2 = coVarJ;
            u32Var2 = u32Var3;
        } else {
            ak0Var.R();
            u32Var2 = u32Var;
            boVar2 = boVar;
            coVar2 = coVar;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eo(u71Var, u32Var2, boVar2, coVar2, gtVar, i2, 0);
        }
    }

    public static final void e(xo1 xo1Var, mh2 mh2Var, ez ezVar, boolean z2, da1 da1Var, gt gtVar, ak0 ak0Var, int i2) {
        xo1 xo1Var2;
        int i3;
        ak0Var.X(-1413720282);
        if ((i2 & 6) == 0) {
            xo1Var2 = xo1Var;
            i3 = (ak0Var.f(xo1Var2) ? 4 : 2) | i2;
        } else {
            xo1Var2 = xo1Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? ak0Var.f(mh2Var) : ak0Var.h(mh2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.h(ezVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ak0Var.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ak0Var.f(da1Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= ak0Var.h(gtVar) ? 1048576 : 524288;
        }
        int i4 = 0;
        int i5 = 1;
        if (ak0Var.O(i3 & 1, (599187 & i3) != 599186)) {
            String strR = j02.r(R.string.tooltip_description, ak0Var);
            boolean zH = ((i3 & 112) == 32 || ((i3 & 64) != 0 && ak0Var.h(mh2Var))) | ((i3 & 896) == 256) | ak0Var.h(ezVar) | ((458752 & i3) == 131072);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new vf(mh2Var, ezVar, da1Var, i5);
                ak0Var.g0(objL);
            }
            int i6 = (i3 & 14) | 3072;
            s8.a(xo1Var2, (ti0) objL, new yo1(z2), vs0.C(-1287705660, new ji(i4, strR, gtVar), ak0Var), ak0Var, i6, 0);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new gi(xo1Var, mh2Var, ezVar, z2, da1Var, gtVar, i2);
        }
    }

    public static final void f(mh2 mh2Var, da1 da1Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        ak0Var.X(1873232064);
        int i4 = 1;
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? ak0Var.f(mh2Var) : ak0Var.h(mh2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.f(da1Var) ? 256 : 128;
        }
        int i5 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.g(false) ? 2048 : 1024;
        }
        int i6 = i2 & 24576;
        r71 r71Var = r71.a;
        if (i6 == 0) {
            i3 |= ak0Var.f(r71Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ak0Var.h(gtVar) ? 131072 : 65536;
        }
        if (ak0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = s5.E(ak0Var);
                ak0Var.g0(objL);
            }
            ez ezVar = (ez) objL;
            u71 u71VarJ = s5.J(vs0.y(ya2.a(ya2.a(r71Var, mh2Var, new oi(mh2Var, i5)), mh2Var, new oi(mh2Var, i4)).c(new gk1(new o1(j02.r(R.string.tooltip_label, ak0Var), ezVar, mh2Var, 3))), new d(6, ezVar, mh2Var)), new qi(i5, mh2Var, da1Var));
            w61 w61VarC = xj.c(q90.f, false);
            int iX = ws0.x(ak0Var);
            sl1 sl1VarL = ak0Var.l();
            u71 u71VarB = B(ak0Var, u71VarJ);
            wu.c.getClass();
            ti0 ti0Var = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, w61VarC);
            p12.l(vu.e, ak0Var, sl1VarL);
            ra raVar = vu.g;
            if (ak0Var.S || !ws0.j(ak0Var.L(), Integer.valueOf(iX))) {
                k3.p(iX, ak0Var, iX, raVar);
            }
            p12.l(vu.d, ak0Var, u71VarB);
            k3.o((i3 >> 15) & 14, gtVar, ak0Var, true);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(mh2Var, da1Var, gtVar, i2);
        }
    }

    public static Map g(Object obj) {
        if ((obj instanceof fv0) && !(obj instanceof hv0)) {
            F(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            ws0.P(e2, nj2.class.getName());
            throw e2;
        }
    }

    public static final boolean h(u82 u82Var, int i2, d0 d0Var, boolean z2) {
        boolean z3;
        synchronized (A0) {
            try {
                int i3 = u82Var.d;
                if (i3 == i2) {
                    u82Var.c = d0Var;
                    z3 = true;
                    if (z2) {
                        u82Var.e++;
                    }
                    u82Var.d = i3 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static void i(int i2, Object obj) {
        if (obj == null || w(i2, obj)) {
            return;
        }
        F(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static void j(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            qj.r(k3.h(i2, i3, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static final u71 k(u71 u71Var, u32 u32Var) {
        return v(u71Var, 0.0f, 0.0f, u32Var, 518143);
    }

    public static final u71 l(u71 u71Var) {
        return v(u71Var, 0.0f, 0.0f, null, 520191);
    }

    public static final Object m(sx sxVar, qe0 qe0Var, jj0 jj0Var, pe0[] pe0VarArr) throws Throwable {
        bs bsVar = new bs(null, qe0Var, jj0Var, pe0VarArr);
        re0 re0Var = new re0(sxVar, sxVar.f());
        Object objA = c12.A(re0Var, re0Var, bsVar);
        return objA == fz.e ? objA : ll2.a;
    }

    public static u71 n(u71 u71Var, jj0 jj0Var) {
        return u71Var.c(new bv(jj0Var));
    }

    public static final jo0 o() {
        jo0 jo0Var = D0;
        if (jo0Var != null) {
            return jo0Var;
        }
        io0 io0Var = new io0("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = jm2.a;
        o72 o72Var = new o72(dr.b);
        qk1 qk1Var = new qk1(0);
        qk1Var.A(19.0f, 13.0f);
        qk1Var.x(-6.0f);
        qk1Var.I(6.0f);
        qk1Var.x(-2.0f);
        qk1Var.I(-6.0f);
        qk1Var.w(5.0f);
        qk1Var.I(-2.0f);
        qk1Var.x(6.0f);
        qk1Var.H(5.0f);
        qk1Var.x(2.0f);
        qk1Var.I(6.0f);
        qk1Var.x(6.0f);
        qk1Var.I(2.0f);
        qk1Var.s();
        io0.a(io0Var, (ArrayList) qk1Var.f, o72Var);
        jo0 jo0VarB = io0Var.b();
        D0 = jo0VarB;
        return jo0VarB;
    }

    public static final int p(lh0 lh0Var, int i2) {
        boolean z2 = lh0Var.compareTo(lh0.h) >= 0;
        boolean z3 = i2 == 1;
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final jo0 q() {
        jo0 jo0Var = E0;
        if (jo0Var != null) {
            return jo0Var;
        }
        io0 io0Var = new io0("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = jm2.a;
        o72 o72Var = new o72(dr.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new xk1(7.0f, 10.0f));
        arrayList.add(new el1(5.0f, 5.0f));
        arrayList.add(new el1(5.0f, -5.0f));
        arrayList.add(tk1.c);
        io0.a(io0Var, arrayList, o72Var);
        jo0 jo0VarB = io0Var.b();
        E0 = jo0VarB;
        return jo0VarB;
    }

    public static final u82 r(h72 h72Var) {
        u82 u82Var = h72Var.e;
        u82Var.getClass();
        return (u82) x62.s(u82Var, h72Var);
    }

    public static final int s(h72 h72Var) {
        u82 u82Var = h72Var.e;
        u82Var.getClass();
        return ((u82) x62.f(u82Var)).e;
    }

    public static final u71 t(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new zi(ej0Var));
    }

    public static u71 u(u71 u71Var, float f2, float f3, float f4, float f5, u32 u32Var, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        long j2 = ai2.b;
        u32 u32Var2 = (i2 & 2048) != 0 ? vs0.C : u32Var;
        long j3 = el0.a;
        return u71Var.c(new bl0(f6, f7, f8, f9, 0.0f, j2, u32Var2, false, j3, j3));
    }

    public static u71 v(u71 u71Var, float f2, float f3, u32 u32Var, int i2) {
        float f4 = (i2 & 4) != 0 ? 1.0f : f2;
        float f5 = (i2 & 256) != 0 ? 0.0f : f3;
        long j2 = ai2.b;
        u32 u32Var2 = (i2 & 2048) != 0 ? vs0.C : u32Var;
        boolean z2 = (i2 & 4096) == 0;
        long j3 = el0.a;
        return u71Var.c(new bl0(1.0f, 1.0f, f4, 0.0f, f5, j2, u32Var2, z2, j3, j3));
    }

    public static boolean w(int i2, Object obj) {
        int iC;
        if (obj instanceof qj0) {
            if (obj instanceof sj0) {
                iC = ((sj0) obj).c();
            } else if (obj instanceof ti0) {
                iC = 0;
            } else if (obj instanceof ej0) {
                iC = 1;
            } else if (obj instanceof ij0) {
                iC = 2;
            } else if (obj instanceof jj0) {
                iC = 3;
            } else if (obj instanceof kj0) {
                iC = 4;
            } else if (obj instanceof lj0) {
                iC = 5;
            } else if (obj instanceof mj0) {
                iC = 6;
            } else if (obj instanceof nj0) {
                iC = 7;
            } else if (obj instanceof oj0) {
                iC = 8;
            } else if (obj instanceof pj0) {
                iC = 9;
            } else if (obj instanceof ui0) {
                iC = 10;
            } else if (obj instanceof vi0) {
                iC = 11;
            } else if (obj instanceof xi0) {
                iC = 13;
            } else if (obj instanceof yi0) {
                iC = 14;
            } else if (obj instanceof zi0) {
                iC = 15;
            } else if (obj instanceof aj0) {
                iC = 16;
            } else if (obj instanceof bj0) {
                iC = 17;
            } else if (obj instanceof cj0) {
                iC = 18;
            } else if (obj instanceof dj0) {
                iC = 19;
            } else if (obj instanceof fj0) {
                iC = 20;
            } else {
                iC = obj instanceof gj0 ? 21 : -1;
            }
            if (iC == i2) {
                return true;
            }
        }
        return false;
    }

    public static final j82 x(ez ezVar, uy uyVar, hz hzVar, ij0 ij0Var) throws IllegalAccessException, InvocationTargetException {
        uy uyVarY = ix.y(ezVar.h(), uyVar, true);
        j30 j30Var = u50.a;
        if (uyVarY != j30Var && uyVarY.p(q90.A) == null) {
            uyVarY = uyVarY.k(j30Var);
        }
        hzVar.getClass();
        j82 u01Var = hzVar == hz.f ? new u01(uyVarY, ij0Var) : new j82(uyVarY, true);
        u01Var.j0(hzVar, u01Var, ij0Var);
        return u01Var;
    }

    public static j82 y(ez ezVar, uy uyVar, ij0 ij0Var, int i2) {
        if ((i2 & 1) != 0) {
            uyVar = ab0.e;
        }
        return x(ezVar, uyVar, (i2 & 2) != 0 ? hz.e : hz.h, ij0Var);
    }

    public static final u71 z(u71 u71Var, jv0 jv0Var, xz0 xz0Var, di1 di1Var, boolean z2) {
        return u71Var.c(new zz0(jv0Var, xz0Var, di1Var, z2));
    }
}
