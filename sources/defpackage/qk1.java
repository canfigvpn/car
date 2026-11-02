package defpackage;

import android.R;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ir.alirezaivaz.mygarage.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class qk1 implements jq1, yd0, wv1, be, qm2 {
    public final /* synthetic */ int e;
    public Object f;

    public qk1(int i) {
        this.e = i;
        switch (i) {
            case 2:
                this.f = Build.VERSION.SDK_INT >= 28 ? new w40(26) : new w40(27);
                break;
            case 3:
                this.f = new t41();
                break;
            case 6:
                this.f = new Region();
                break;
            case 24:
                this.f = new w30();
                break;
            default:
                this.f = new ArrayList(32);
                break;
        }
    }

    public void A(float f, float f2) {
        ((ArrayList) this.f).add(new xk1(f, f2));
    }

    public void B(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public dq0 C(dq0 dq0Var, e5 e5Var) {
        long j;
        boolean z;
        long jG;
        t41 t41Var = (t41) this.f;
        ArrayList arrayList = (ArrayList) dq0Var.f;
        t41 t41Var2 = new t41(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            yn1 yn1Var = (yn1) arrayList.get(i);
            long j2 = yn1Var.a;
            xn1 xn1Var = (xn1) t41Var.a(j2);
            if (xn1Var == null) {
                j = yn1Var.b;
                jG = yn1Var.d;
                z = false;
            } else {
                long j3 = xn1Var.a;
                j = j3;
                z = xn1Var.c;
                jG = e5Var.G(xn1Var.b);
            }
            long j4 = yn1Var.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            t41Var2.c(j4, new wn1(j4, yn1Var.b, yn1Var.d, yn1Var.e, yn1Var.f, j, jG, z, yn1Var.g, yn1Var.i, yn1Var.j, yn1Var.k, yn1Var.l, yn1Var.m));
            boolean z2 = yn1Var.e;
            if (z2) {
                t41Var.c(j2, new xn1(yn1Var.b, yn1Var.c, z2));
            } else {
                t41Var.d(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new dq0(17, t41Var2, dq0Var);
    }

    public void D(float f, float f2, float f3, float f4) {
        ((ArrayList) this.f).add(new hl1(f, f2, f3, f4));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096 A[LOOP:0: B:22:0x0051->B:34:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[EDGE_INSN: B:53:0x0099->B:35:0x0099 BREAK  A[LOOP:0: B:22:0x0051->B:34:0x0096], SYNTHETIC] */
    public Object E(lo loVar, ti0 ti0Var) {
        b52 b52Var;
        k12 k12Var;
        if (((tu) this.f) == null) {
            cp1.b("Called runAndWatch on a manager that has been disposed of");
        }
        tu tuVar = (tu) this.f;
        if ((tuVar instanceof b52) && (k12Var = (b52Var = (b52) tuVar).f) != null && !k12Var.equals(loVar)) {
            y81 y81Var = new y81();
            k12 k12Var2 = b52Var.f;
            if (k12Var2 == null) {
                cp1.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            x91 x91Var = b52Var.d;
            ArrayList arrayList = y81Var.c;
            if (x91Var != null) {
                Object[] objArr = x91Var.b;
                long[] jArr = x91Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new v81(objArr[(i << 3) + i4], k12Var2));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = b52Var.b;
                obj.getClass();
                arrayList.add(new v81(obj, k12Var2));
            }
            y81Var.d();
            b52Var.e();
            this.f = y81Var;
        }
        tu tuVar2 = (tu) this.f;
        tuVar2.getClass();
        o62 o62VarU = x62.h().u(tuVar2.j(loVar));
        tuVar2.c(loVar);
        try {
            o62 o62VarJ = o62VarU.j();
            try {
                Object objA = ti0Var.a();
                o62.q(o62VarJ);
                o62VarU.c();
                tuVar2.d();
                return objA;
            } catch (Throwable th) {
                o62.q(o62VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            o62VarU.c();
            throw th2;
        }
    }

    public void F(mr0 mr0Var) {
        ((Region) this.f).set(mr0Var.a, mr0Var.b, mr0Var.c, mr0Var.d);
    }

    public void G() {
        View viewFindViewById;
        View view = (View) this.f;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new p(11, viewFindViewById));
    }

    public void H(float f) {
        ((ArrayList) this.f).add(new kl1(f));
    }

    public void I(float f) {
        ((ArrayList) this.f).add(new jl1(f));
    }

    @Override // defpackage.qm2, defpackage.nm2
    public boolean a() {
        return false;
    }

    @Override // defpackage.nm2
    public long b(tb tbVar, tb tbVar2, tb tbVar3) {
        return ((e4) this.f).b(tbVar, tbVar2, tbVar3);
    }

    @Override // defpackage.be
    public Object c(xx1 xx1Var, Float f, Float f2, ej0 ej0Var, i62 i62Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objF = r02.f(xx1Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, j20.a(0.0f, fFloatValue2, 28), (g82) this.f, ej0Var, i62Var);
        return objF == fz.e ? objF : (kb) objF;
    }

    @Override // defpackage.wv1
    public vv1 d(String str) {
        str.getClass();
        ia2 ia2Var = (ia2) this.f;
        String databaseName = ia2Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                qj.f(k3.j("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !h92.O(databaseName).equals(h92.O(str))) {
            qj.l("This driver is configured to open a database named '", ia2Var.getDatabaseName(), "' but '", str, "' was requested.");
            return null;
        }
        return new ha2(ia2Var.z());
    }

    @Override // defpackage.yd0
    public long e(float f) {
        return ((long) (Math.exp(((rd0) this.f).b(f) / (((double) sd0.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.yd0
    public float f() {
        return 0.0f;
    }

    @Override // defpackage.yd0
    public float g(float f, float f2) {
        rd0 rd0Var = (rd0) this.f;
        double dB = rd0Var.b(f2);
        double d = sd0.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (rd0Var.e * rd0Var.f))))) + f;
    }

    @Override // defpackage.jq1
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.jq1
    public void i(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f).setResultCode(i);
    }

    @Override // defpackage.wv1
    public boolean j() {
        return true;
    }

    @Override // defpackage.nm2
    public tb l(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        return ((e4) this.f).l(j, tbVar, tbVar2, tbVar3);
    }

    @Override // defpackage.yd0
    public float m(float f, long j) {
        long j2 = j / 1000000;
        qd0 qd0VarA = ((rd0) this.f).a(f);
        long j3 = qd0VarA.c;
        return (((Math.signum(qd0VarA.a) * a7.a(j3 > 0 ? j2 / j3 : 1.0f).b) * qd0VarA.b) / j3) * 1000.0f;
    }

    @Override // defpackage.yd0
    public float n(float f, float f2, long j) {
        long j2 = j / 1000000;
        qd0 qd0VarA = ((rd0) this.f).a(f2);
        long j3 = qd0VarA.c;
        return (Math.signum(qd0VarA.a) * qd0VarA.b * a7.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.nm2
    public tb p(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        return ((e4) this.f).p(j, tbVar, tbVar2, tbVar3);
    }

    @Override // defpackage.nm2
    public tb q(tb tbVar, tb tbVar2, tb tbVar3) {
        return ((e4) this.f).q(tbVar, tbVar2, tbVar3);
    }

    public long r(long j) {
        w30 w30Var = (w30) this.f;
        if (sm2.b(j) <= 0.0f || sm2.c(j) <= 0.0f) {
            vp0.b("maximumVelocity should be a positive value. You specified=" + ((Object) sm2.f(j)));
        }
        return n02.d(w30Var.a.b(sm2.b(j)), w30Var.b.b(sm2.c(j)));
    }

    public void s() {
        ((ArrayList) this.f).add(tk1.c);
    }

    public void t(float f, float f2, float f3, float f4, float f5, float f6) {
        ((ArrayList) this.f).add(new cl1(f, f2, f3, f4, f5, f6));
    }

    public vd0 u(int i) {
        switch (this.e) {
            case 20:
                return ((ce0[]) this.f)[i];
            case 21:
                return (ce0) this.f;
            default:
                return (vd0) this.f;
        }
    }

    public void v() {
        View view = (View) this.f;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void w(float f) {
        ((ArrayList) this.f).add(new vk1(f));
    }

    public void x(float f) {
        ((ArrayList) this.f).add(new dl1(f));
    }

    public void y(float f, float f2) {
        ((ArrayList) this.f).add(new wk1(f, f2));
    }

    public void z(float f, float f2) {
        ((ArrayList) this.f).add(new el1(f, f2));
    }

    public /* synthetic */ qk1(int i, boolean z) {
        this.e = i;
    }

    public qk1(float f, float f2, tb tbVar) {
        qk1 qk1Var;
        this.e = 23;
        int i = om2.a;
        if (tbVar != null) {
            qk1Var = new qk1(tbVar, f, f2);
        } else {
            qk1Var = new qk1(f, f2);
        }
        this.f = new e4(qk1Var);
    }

    public /* synthetic */ qk1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public qk1(m40 m40Var) {
        this.e = 13;
        this.f = new rd0(e82.a, m40Var);
    }

    public qk1(ia2 ia2Var) {
        this.e = 14;
        ia2Var.getClass();
        this.f = ia2Var;
    }

    public qk1(MainActivity mainActivity) {
        ru1 ru1Var;
        this.e = 12;
        if (Build.VERSION.SDK_INT >= 31) {
            ru1Var = new d82(mainActivity);
        } else {
            ru1Var = new ru1(mainActivity);
        }
        ru1Var.h();
        this.f = ru1Var;
    }

    public qk1(View view) {
        this.e = 11;
        if (Build.VERSION.SDK_INT >= 30) {
            n72 n72Var = new n72(10, view);
            n72Var.g = view;
            this.f = n72Var;
            return;
        }
        this.f = new qk1(10, view);
    }

    public qk1(long[] jArr) {
        g91 g91Var;
        this.e = 9;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            g91Var = new g91(jArrCopyOf.length);
            int i = g91Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArrCopyOf2 = g91Var.a;
                    if (jArrCopyOf2.length < length) {
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, Math.max(length, (jArrCopyOf2.length * 3) / 2));
                        g91Var.a = jArrCopyOf2;
                    }
                    int i2 = g91Var.b;
                    if (i != i2) {
                        ve.v0(jArrCopyOf2, jArrCopyOf2, jArrCopyOf.length + i, i, i2);
                    }
                    ve.v0(jArrCopyOf, jArrCopyOf2, i, 0, jArrCopyOf.length);
                    g91Var.b += jArrCopyOf.length;
                }
            } else {
                qj.j("");
                throw null;
            }
        } else {
            g91Var = new g91(16);
        }
        this.f = g91Var;
    }

    public qk1(tb tbVar, float f, float f2) {
        this.e = 20;
        int iB = tbVar.b();
        ce0[] ce0VarArr = new ce0[iB];
        for (int i = 0; i < iB; i++) {
            ce0VarArr[i] = new ce0(f, f2, tbVar.a(i));
        }
        this.f = ce0VarArr;
    }

    public qk1(float f, float f2) {
        this.e = 21;
        this.f = new ce0(f, f2, 0.01f);
    }

    public qk1(SideSheetBehavior sideSheetBehavior) {
        this.e = 7;
        this.f = sideSheetBehavior;
        new p(10, this);
    }
}
