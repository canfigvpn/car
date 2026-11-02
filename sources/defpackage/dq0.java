package defpackage;

import android.database.SQLException;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dq0 implements wv1, na0, zq0, da2, pm, ai1 {
    public final /* synthetic */ int e;
    public Object f;
    public Object g;

    public dq0(int i) {
        this.e = i;
        switch (i) {
            case 23:
                this.f = new um2(0);
                this.g = new um2(0);
                break;
            case 24:
            default:
                mj2 mj2Var = ir2.V;
                Float fValueOf = Float.valueOf(0.0f);
                this.g = new ob(mj2Var, fValueOf, (tb) mj2Var.a.h(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 25:
                this.f = new w91();
                this.g = new w91();
                break;
            case 26:
                this.f = new fa1(new ax0[16]);
                break;
        }
    }

    public static void l(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!h92.C(message, "unique", true) && !h92.C(message, "2067", false) && !h92.C(message, "1555", false)) {
            throw sQLException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t71] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [t71] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void n(ax0 ax0Var) {
        if (ax0Var.Q > 0) {
            if (ax0Var.J.d == ww0.i && !ax0Var.p() && !ax0Var.q() && !ax0Var.R && ax0Var.I()) {
                t71 t71Var = ax0Var.I.f;
                if ((t71Var.h & 256) != 0) {
                    while (t71Var != null) {
                        if ((t71Var.g & 256) != 0) {
                            ?? P = t71Var;
                            ?? fa1Var = 0;
                            while (P != 0) {
                                if (P instanceof pk0) {
                                    pk0 pk0Var = (pk0) P;
                                    pk0Var.t(qx.T(pk0Var, 256));
                                } else if ((P.g & 256) != 0 && (P instanceof c40)) {
                                    t71 t71Var2 = ((c40) P).t;
                                    int i = 0;
                                    P = P;
                                    fa1Var = fa1Var;
                                    while (t71Var2 != null) {
                                        if ((t71Var2.g & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                fa1Var = fa1Var;
                                                P = t71Var2;
                                            } else {
                                                if (fa1Var == 0) {
                                                    fa1Var = new fa1(new t71[16]);
                                                }
                                                if (P != 0) {
                                                    fa1Var.b(P);
                                                    P = 0;
                                                }
                                                fa1Var.b(t71Var2);
                                            }
                                        }
                                        t71Var2 = t71Var2.j;
                                        P = P;
                                        fa1Var = fa1Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                P = qx.P(fa1Var);
                            }
                        }
                        if ((t71Var.h & 256) == 0) {
                            break;
                        } else {
                            t71Var = t71Var.j;
                        }
                    }
                }
            }
            ax0Var.P = false;
            fa1 fa1VarZ = ax0Var.z();
            Object[] objArr = fa1VarZ.e;
            int i2 = fa1VarZ.g;
            for (int i3 = 0; i3 < i2; i3++) {
                n((ax0) objArr[i3]);
            }
        }
    }

    @Override // defpackage.na0
    public Object a() {
        return (pl2) this.f;
    }

    @Override // defpackage.na0
    public boolean b(CharSequence charSequence, int i, int i2, zj2 zj2Var) {
        if ((zj2Var.c & 4) > 0) {
            return true;
        }
        if (((pl2) this.f) == null) {
            this.f = new pl2(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((w40) this.g).getClass();
        ((pl2) this.f).setSpan(new ak2(zj2Var), i, i2, 33);
        return true;
    }

    @Override // defpackage.ai1
    public List c(Integer num) {
        List listC = ((ai1) this.f).c(null);
        o52 o52Var = (o52) this.g;
        int i = o52Var.v;
        return i < 0 ? listC : vq.a0(sv0.O(o52Var, num, i, Integer.valueOf(o52Var.D(o52Var.b, i))), listC);
    }

    @Override // defpackage.pm
    public void cancel() {
        if (((ff) this.g).compareAndSet(1, 1)) {
            return;
        }
        ((vf) this.f).a();
    }

    @Override // defpackage.wv1
    public vv1 d(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        t61 t61Var = (t61) this.g;
        if (!str.equals(":memory:")) {
            str = ((c00) t61Var.c).a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        hc0 hc0Var = new hc0(str, (t61Var.a || t61Var.b || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = hc0Var.a;
        reentrantLock.lock();
        dq0 dq0Var = hc0Var.b;
        if (dq0Var != null) {
            try {
                dq0Var.s();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (t61Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                vv1 vv1VarD = ((wv1) this.f).d(str);
                if (t61Var.a) {
                    if (((c00) t61Var.c).g == av1.f) {
                        ix.t(vv1VarD, "PRAGMA synchronous = NORMAL");
                    } else {
                        ix.t(vv1VarD, "PRAGMA synchronous = FULL");
                    }
                    t61.a(vv1VarD);
                    ((z90) t61Var.d).d(vv1VarD);
                } else {
                    try {
                        t61Var.b = true;
                        t61Var.b(vv1VarD);
                        t61Var.b = false;
                    } catch (Throwable th2) {
                        t61Var.b = false;
                        throw th2;
                    }
                }
                if (dq0Var != null && (fileChannel2 = (FileChannel) dq0Var.g) != null) {
                    try {
                        fileChannel2.close();
                        dq0Var.g = null;
                    } catch (Throwable th3) {
                        dq0Var.g = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return vv1VarD;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            if (dq0Var != null && (fileChannel = (FileChannel) dq0Var.g) != null) {
                try {
                    fileChannel.close();
                } finally {
                    dq0Var.g = null;
                }
            }
            throw th5;
        }
        th = th4;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // defpackage.da2
    public void e(ca2 ca2Var) {
        l91 l91Var = (l91) this.g;
        l91Var.a();
        q91 q91Var = (q91) ca2Var.f;
        Object[] objArr = q91Var.b;
        long[] jArr = q91Var.c;
        int i = q91Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((iz0) this.f).b(obj);
            int iD = l91Var.d(objB);
            int i3 = iD >= 0 ? l91Var.c[iD] : 0;
            if (i3 == 7) {
                ca2Var.remove(obj);
            } else {
                l91Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // defpackage.ai1
    public boolean f() {
        return ((ai1) this.f).f();
    }

    @Override // defpackage.da2
    public boolean g(Object obj, Object obj2) {
        iz0 iz0Var = (iz0) this.f;
        return ws0.j(iz0Var.b(obj), iz0Var.b(obj2));
    }

    public boolean h(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((dq0) this.g).f;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (vv.j(((yn1) obj).a, j)) {
                break;
            }
            i++;
        }
        yn1 yn1Var = (yn1) obj;
        if (yn1Var != null) {
            return yn1Var.h;
        }
        return false;
    }

    public te2 i(List list) {
        r90 r90Var;
        Exception e;
        try {
            int size = list.size();
            int i = 0;
            r90Var = null;
            while (i < size) {
                try {
                    r90 r90Var2 = (r90) list.get(i);
                    try {
                        r90Var2.a((s90) this.g);
                        i++;
                        r90Var = r90Var2;
                    } catch (Exception e2) {
                        e = e2;
                        r90Var = r90Var2;
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb2.append(((s90) this.g).a.c());
                        sb2.append(", composition=");
                        sb2.append(((s90) this.g).c());
                        sb2.append(", selection=");
                        s90 s90Var = (s90) this.g;
                        sb2.append((Object) of2.h(j02.c(s90Var.b, s90Var.c)));
                        sb2.append("):");
                        sb.append(sb2.toString());
                        sb.append('\n');
                        vq.U(list, sb, new m(10, r90Var, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            s90 s90Var2 = (s90) this.g;
            s90Var2.getClass();
            yb ybVar = new yb(s90Var2.a.toString());
            s90 s90Var3 = (s90) this.g;
            long jC = j02.c(s90Var3.b, s90Var3.c);
            of2 of2Var = of2.g(((te2) this.f).b) ? null : new of2(jC);
            te2 te2Var = new te2(ybVar, of2Var != null ? of2Var.a : j02.c(of2.e(jC), of2.f(jC)), ((s90) this.g).c());
            this.f = te2Var;
            return te2Var;
        } catch (Exception e4) {
            r90Var = null;
            e = e4;
        }
    }

    @Override // defpackage.wv1
    public boolean j() {
        return ((wv1) this.f).j();
    }

    public boolean k() {
        synchronized (this) {
            if (((AtomicBoolean) this.g).get()) {
                return false;
            }
            ((AtomicInteger) this.f).incrementAndGet();
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void m() {
        Object[] objArr;
        fa1 fa1Var = (fa1) this.f;
        Arrays.sort(fa1Var.e, 0, fa1Var.g, dg0.d);
        int i = fa1Var.g;
        ax0[] ax0VarArr = (ax0[]) this.g;
        if (ax0VarArr == null || ax0VarArr.length < i) {
            objArr = ax0VarArr;
            objArr = new ax0[Math.max(16, i)];
        }
        objArr = ax0VarArr;
        this.g = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = fa1Var.e[i2];
        }
        fa1Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.g = objArr;
                return;
            }
            ax0 ax0Var = objArr[i];
            ax0Var.getClass();
            if (ax0Var.P) {
                n(ax0Var);
            }
            objArr[i] = 0;
        }
    }

    public mv0 o(aq aqVar) {
        Object objPutIfAbsent;
        switch (this.e) {
            case 5:
                Object obj = ((cq) this.g).get(vv.q(aqVar));
                obj.getClass();
                ca1 ca1Var = (ca1) obj;
                Object tlVar = ca1Var.a.get();
                if (tlVar == null) {
                    synchronized (ca1Var) {
                        tlVar = ca1Var.a.get();
                        if (tlVar == null) {
                            tlVar = new tl((mv0) ((ej0) this.f).h(aqVar));
                            ca1Var.a = new SoftReference(tlVar);
                        }
                    }
                }
                return ((tl) tlVar).a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
                Class clsQ = vv.q(aqVar);
                Object tlVar2 = concurrentHashMap.get(clsQ);
                if (tlVar2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsQ, (tlVar2 = new tl((mv0) ((ej0) this.f).h(aqVar))))) != null) {
                    tlVar2 = objPutIfAbsent;
                }
                return ((tl) tlVar2).a;
        }
    }

    public Object p(aq aqVar, ArrayList arrayList) {
        Object ut1Var;
        Object ut1Var2;
        Object objPutIfAbsent;
        int i = 0;
        switch (this.e) {
            case 6:
                Object obj = ((cq) this.g).get(vv.q(aqVar));
                obj.getClass();
                ca1 ca1Var = (ca1) obj;
                Object yj1Var = ca1Var.a.get();
                if (yj1Var == null) {
                    synchronized (ca1Var) {
                        yj1Var = ca1Var.a.get();
                        if (yj1Var == null) {
                            yj1Var = new yj1();
                            ca1Var.a = new SoftReference(yj1Var);
                        }
                    }
                }
                yj1 yj1Var2 = (yj1) yj1Var;
                ArrayList arrayList2 = new ArrayList(wq.G(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new nv0((nv0) obj2));
                }
                ConcurrentHashMap concurrentHashMap = yj1Var2.a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        ut1Var = (mv0) ((ij0) this.f).g(aqVar, arrayList);
                    } catch (Throwable th) {
                        ut1Var = new ut1(th);
                    }
                    vt1 vt1Var = new vt1(ut1Var);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, vt1Var);
                    obj3 = objPutIfAbsent2 == null ? vt1Var : objPutIfAbsent2;
                    break;
                }
                return ((vt1) obj3).e;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.g;
                Class clsQ = vv.q(aqVar);
                Object yj1Var3 = concurrentHashMap2.get(clsQ);
                if (yj1Var3 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsQ, (yj1Var3 = new yj1()))) != null) {
                    yj1Var3 = objPutIfAbsent;
                }
                yj1 yj1Var4 = (yj1) yj1Var3;
                ArrayList arrayList3 = new ArrayList(wq.G(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    arrayList3.add(new nv0((nv0) obj4));
                }
                ConcurrentHashMap concurrentHashMap3 = yj1Var4.a;
                Object obj5 = concurrentHashMap3.get(arrayList3);
                if (obj5 == null) {
                    try {
                        ut1Var2 = (mv0) ((ij0) this.f).g(aqVar, arrayList);
                    } catch (Throwable th2) {
                        ut1Var2 = new ut1(th2);
                    }
                    vt1 vt1Var2 = new vt1(ut1Var2);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, vt1Var2);
                    obj5 = objPutIfAbsent3 == null ? vt1Var2 : objPutIfAbsent3;
                    break;
                }
                return ((vt1) obj5).e;
        }
    }

    public InputMethodManager q() {
        return (InputMethodManager) ((rx0) this.g).getValue();
    }

    public w61 r() {
        return (w61) ((dk1) this.g).getValue();
    }

    public void s() throws IOException {
        String str = (String) this.f;
        if (((FileChannel) this.g) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.g = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.g;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.g = null;
            throw new IllegalStateException(k3.j("Unable to lock file: '", str, "'."), th);
        }
    }

    public AutofillId t(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionF = i4.f(this.g);
        pf pfVarI = c12.i((View) this.f);
        Objects.requireNonNull(pfVarI);
        return cc.c(contentCaptureSessionF, of.b(pfVarI.a), j);
    }

    @Override // defpackage.zq0
    public wq0 toInstant() {
        throw new xq0(((String) this.f) + " when parsing an Instant from \"" + ws0.W((String) this.g, 64) + '\"');
    }

    public void u(yg0 yg0Var) {
        ft1 ft1Var = (ft1) this.g;
        qk1 qk1Var = (qk1) this.f;
        int i = yg0Var.b;
        if (i != 0) {
            ft1Var.execute(new im(qk1Var, i));
        } else {
            ft1Var.execute(new hm(0, qk1Var, yg0Var.a));
        }
    }

    public void v() {
        if (((dp0) this.g) != null) {
            this.g = null;
            ((jq) this.f).K0(true);
        }
    }

    public void w() {
        synchronized (this) {
            ((AtomicInteger) this.f).decrementAndGet();
            if (((AtomicInteger) this.f).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void x(float f, m40 m40Var, ez ezVar) {
        if (f <= m40Var.x(1.0f)) {
            return;
        }
        o62 o62VarJ = c12.j();
        sx sxVar = null;
        byte b = 0;
        ej0 ej0VarE = o62VarJ != null ? o62VarJ.e() : null;
        o62 o62VarP = c12.p(o62VarJ);
        try {
            float fFloatValue = ((Number) ((ob) this.g).f.getValue()).floatValue();
            j82 j82Var = (j82) this.f;
            if (j82Var != null) {
                j82Var.d(null);
            }
            ob obVar = (ob) this.g;
            if (obVar.j) {
                this.g = j20.k(obVar, fFloatValue - f, 0.0f, 30);
            } else {
                this.g = new ob(ir2.V, Float.valueOf(-f), b == true ? 1 : 0, 60);
            }
            this.f = nj2.y(ezVar, null, new ln(7, sxVar, this), 3);
        } finally {
            c12.s(o62VarJ, o62VarP, ej0VarE);
        }
    }

    public /* synthetic */ dq0(int i, boolean z) {
        this.e = i;
    }

    public dq0(ax0 ax0Var, w61 w61Var) {
        this.e = 18;
        this.f = ax0Var;
        this.g = y12.s(w61Var);
    }

    public dq0(String str) {
        this.e = 15;
        this.f = str.concat(".lck");
    }

    public dq0(t4 t4Var) {
        this.e = 7;
        this.f = new AtomicInteger(0);
        this.g = new AtomicBoolean(false);
    }

    public dq0(vf vfVar) {
        this.e = 27;
        this.f = vfVar;
        this.g = new ff(0);
    }

    public /* synthetic */ dq0(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public dq0(ej0 ej0Var, int i) {
        this.e = i;
        switch (i) {
            case 8:
                this.f = ej0Var;
                this.g = new ConcurrentHashMap();
                break;
            default:
                this.f = ej0Var;
                this.g = new cq();
                break;
        }
    }

    public dq0(View view) {
        this.e = 0;
        this.f = view;
        this.g = vv.F(v01.f, new w8(12, this));
    }

    public dq0(t61 t61Var, wv1 wv1Var) {
        this.e = 3;
        wv1Var.getClass();
        this.g = t61Var;
        this.f = wv1Var;
    }

    public dq0(ContentCaptureSession contentCaptureSession, View view) {
        this.e = 10;
        this.g = contentCaptureSession;
        this.f = view;
    }

    public dq0(int i, ij0 ij0Var) {
        this.e = i;
        switch (i) {
            case 9:
                this.f = ij0Var;
                this.g = new ConcurrentHashMap();
                break;
            default:
                this.f = ij0Var;
                this.g = new cq();
                break;
        }
    }

    public dq0(iz0 iz0Var) {
        this.e = 20;
        this.f = iz0Var;
        l91 l91Var = ef1.a;
        this.g = new l91();
    }

    public dq0(oc ocVar) {
        this.e = 12;
        this.f = ocVar;
        va0 va0Var = new va0(ocVar);
        this.g = va0Var;
        ocVar.addTextChangedListener(va0Var);
        if (ha0.b == null) {
            synchronized (ha0.a) {
                try {
                    if (ha0.b == null) {
                        ha0 ha0Var = new ha0();
                        try {
                            ha0.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ha0.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        ha0.b = ha0Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ocVar.setEditableFactory(ha0.b);
    }

    public dq0(jq jqVar) {
        this.e = 1;
        this.f = jqVar;
    }
}
