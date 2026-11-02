package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c12 {
    public static final /* synthetic */ int a = 0;

    public static final Object A(mx1 mx1Var, mx1 mx1Var2, ij0 ij0Var) throws Throwable {
        Object osVar;
        Object objV;
        try {
            nj2.i(2, ij0Var);
            osVar = ij0Var.g(mx1Var2, mx1Var);
        } catch (Throwable th) {
            osVar = new os(th, false);
        }
        fz fzVar = fz.e;
        if (osVar == fzVar || (objV = mx1Var.V(osVar)) == nj2.o0) {
            return fzVar;
        }
        if (objV instanceof os) {
            throw ((os) objV).a;
        }
        return nj2.H(objV);
    }

    public static final String B(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void C(mb mbVar, ob obVar) {
        obVar.f.setValue(mbVar.e.getValue());
        tb tbVar = obVar.g;
        tb tbVar2 = mbVar.f;
        int iB = tbVar.b();
        for (int i = 0; i < iB; i++) {
            tbVar.e(i, tbVar2.a(i));
        }
        obVar.i = mbVar.h;
        obVar.h = mbVar.g;
        obVar.j = ((Boolean) mbVar.i.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ea A[Catch: CancellationException -> 0x0125, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0125, blocks: (B:42:0x00d5, B:44:0x00ea), top: B:80:0x00d5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (f(r3, r5, r8) == r12) goto L50;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011c -> B:31:0x0091). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ob r23, defpackage.ib r24, long r25, final defpackage.ej0 r27, defpackage.tx r28) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c12.a(ob, ib, long, ej0, tx):java.lang.Object");
    }

    public static Object b(float f, float f2, lj2 lj2Var, ij0 ij0Var, wa2 wa2Var, int i) {
        nb nbVarT = lj2Var;
        if ((i & 8) != 0) {
            nbVarT = s5.T(0.0f, 0.0f, null, 7);
        }
        nb nbVar = nbVarT;
        mj2 mj2Var = ir2.V;
        Float f3 = new Float(f);
        Float f4 = new Float(f2);
        Float f5 = new Float(0.0f);
        ej0 ej0Var = mj2Var.a;
        tb tbVarC = (tb) ej0Var.h(f5);
        if (tbVarC == null) {
            tbVarC = ((tb) ej0Var.h(f3)).c();
        }
        tb tbVar = tbVarC;
        Object objA = a(new ob(mj2Var, f3, tbVar, 56), new cc2(nbVar, mj2Var, f3, f4, tbVar), Long.MIN_VALUE, new tr1(11, ij0Var), wa2Var);
        ll2 ll2Var = ll2.a;
        fz fzVar = fz.e;
        if (objA != fzVar) {
            objA = ll2Var;
        }
        return objA == fzVar ? objA : ll2Var;
    }

    public static final Object c(ob obVar, l20 l20Var, boolean z, ej0 ej0Var, tx txVar) {
        Object objA = a(obVar, new k20(l20Var, obVar.e, obVar.f.getValue(), obVar.g), z ? obVar.h : Long.MIN_VALUE, ej0Var, txVar);
        return objA == fz.e ? objA : ll2.a;
    }

    public static final Object d(ob obVar, Float f, nb nbVar, boolean z, ej0 ej0Var, tx txVar) {
        Object objA = a(obVar, new cc2(nbVar, obVar.e, obVar.f.getValue(), f, obVar.g), z ? obVar.h : Long.MIN_VALUE, ej0Var, txVar);
        return objA == fz.e ? objA : ll2.a;
    }

    public static /* synthetic */ Object e(ob obVar, Float f, g82 g82Var, boolean z, ej0 ej0Var, tx txVar, int i) {
        if ((i & 2) != 0) {
            g82Var = s5.T(0.0f, 0.0f, null, 7);
        }
        g82 g82Var2 = g82Var;
        if ((i & 8) != 0) {
            ej0Var = new v22(4);
        }
        return d(obVar, f, g82Var2, z, ej0Var, txVar);
    }

    public static final Object f(ib ibVar, ej0 ej0Var, va2 va2Var) {
        uy uyVar = va2Var.f;
        if (!ibVar.a()) {
            return sv.K(va2Var.f()).a(va2Var, new w62(ej0Var, 1));
        }
        uyVar.getClass();
        if (uyVar.p(q90.O) == null) {
            uyVar.getClass();
            return sv.K(uyVar).a(va2Var, ej0Var);
        }
        fu1.c();
        return null;
    }

    public static final void g(mb mbVar, long j, float f, ib ibVar, ob obVar, ej0 ej0Var) {
        long jC = f == 0.0f ? ibVar.c() : (long) ((j - mbVar.c) / f);
        mbVar.g = j;
        mbVar.e.setValue(ibVar.b(jC));
        mbVar.f = ibVar.f(jC);
        if (ibVar.g(jC)) {
            mbVar.h = mbVar.g;
            mbVar.i.setValue(Boolean.FALSE);
        }
        C(mbVar, obVar);
        ej0Var.h(mbVar);
    }

    public static final Object h(jo1 jo1Var, String str, tx txVar) {
        Object objD = jo1Var.d(str, new v22(16), txVar);
        return objD == fz.e ? objD : ll2.a;
    }

    public static pf i(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new pf(pr.b(view));
        }
        return null;
    }

    public static o62 j() {
        return (o62) x62.b.f();
    }

    public static final float k(uy uyVar) {
        a81 a81Var = (a81) uyVar.p(q90.S);
        float fV = a81Var != null ? a81Var.v() : 1.0f;
        if (fV >= 0.0f) {
            return fV;
        }
        ep1.b("negative scale factor");
        return fV;
    }

    public static final hf2 l(i02 i02Var) {
        ej0 ej0Var;
        ArrayList arrayList = new ArrayList();
        Object objG = i02Var.e.g(h02.a);
        if (objG == null) {
            objG = null;
        }
        p0 p0Var = (p0) objG;
        if (p0Var == null || (ej0Var = (ej0) p0Var.b) == null || !((Boolean) ej0Var.h(arrayList)).booleanValue()) {
            return null;
        }
        return (hf2) arrayList.get(0);
    }

    public static ap1 m(dd ddVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new ap1(v50.j(ddVar));
        }
        TextPaint textPaint = new TextPaint(ddVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = ddVar.getBreakStrategy();
        int hyphenationFrequency = ddVar.getHyphenationFrequency();
        if (ddVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (ddVar.getInputType() & 15) != 3) {
            boolean z = ddVar.getLayoutDirection() == 1;
            switch (ddVar.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(v50.d(DecimalFormatSymbols.getInstance(ddVar.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new ap1(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int n(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        qj.r(k3.i("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final boolean o(int i, KeyEvent keyEvent) {
        return ((int) (sv0.d0(keyEvent) >> 32)) == i;
    }

    public static o62 p(o62 o62Var) {
        if (o62Var instanceof pi2) {
            pi2 pi2Var = (pi2) o62Var;
            if (pi2Var.t == y12.d()) {
                pi2Var.r = null;
                return o62Var;
            }
        }
        if (o62Var instanceof qi2) {
            qi2 qi2Var = (qi2) o62Var;
            if (qi2Var.i == y12.d()) {
                qi2Var.h = null;
                return o62Var;
            }
        }
        o62 o62VarE = x62.e(o62Var, null, false);
        o62VarE.j();
        return o62VarE;
    }

    public static Object q(t40 t40Var, ti0 ti0Var) {
        o62 pi2Var;
        o62 o62Var = (o62) x62.b.f();
        if (o62Var instanceof pi2) {
            pi2 pi2Var2 = (pi2) o62Var;
            if (pi2Var2.t == y12.d()) {
                ej0 ej0Var = pi2Var2.r;
                ej0 ej0Var2 = pi2Var2.s;
                try {
                    ((pi2) o62Var).r = x62.i(t40Var, ej0Var, true);
                    ((pi2) o62Var).s = ej0Var2;
                    return ti0Var.a();
                } finally {
                    pi2Var2.r = ej0Var;
                    pi2Var2.s = ej0Var2;
                }
            }
        }
        if (o62Var == null || (o62Var instanceof ba1)) {
            pi2Var = new pi2(o62Var instanceof ba1 ? (ba1) o62Var : null, t40Var, null, true, false);
        } else {
            pi2Var = o62Var.u(t40Var);
        }
        try {
            o62 o62VarJ = pi2Var.j();
            try {
                Object objA = ti0Var.a();
                o62.q(o62VarJ);
                pi2Var.c();
                return objA;
            } catch (Throwable th) {
                o62.q(o62VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            pi2Var.c();
            throw th2;
        }
    }

    public static final float r(long j, float f, m40 m40Var) {
        float fC;
        long jB = yf2.b(j);
        if (zf2.a(jB, 4294967296L)) {
            if (m40Var.l() <= 1.05d) {
                return m40Var.b0(j);
            }
            fC = yf2.c(j) / yf2.c(m40Var.j0(f));
        } else {
            if (!zf2.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = yf2.c(j);
        }
        return fC * f;
    }

    public static void s(o62 o62Var, o62 o62Var2, ej0 ej0Var) {
        if (o62Var != o62Var2) {
            o62Var2.getClass();
            o62.q(o62Var);
            o62Var2.c();
        } else if (o62Var instanceof pi2) {
            ((pi2) o62Var).r = ej0Var;
        } else if (o62Var instanceof qi2) {
            ((qi2) o62Var).h = ej0Var;
        } else {
            qj.i(o62Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final void t(ea eaVar, int i) {
        Object next;
        Iterator<T> it = eaVar.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ax0) ((Map.Entry) next).getKey()).f != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        fu1.c();
    }

    public static final void u(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(ws0.V(j)), i, i2, 33);
        }
    }

    public static void v(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            v50.k(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final void w(Spannable spannable, long j, m40 m40Var, int i, int i2) {
        long jB = yf2.b(j);
        if (zf2.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(p61.j0(m40Var.b0(j)), false), i, i2, 33);
        } else if (zf2.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(yf2.c(j)), i, i2, 33);
        }
    }

    public static void x(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void y(TextView textView, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static final void z(Spannable spannable, q31 q31Var, int i, int i2) {
        if (q31Var != null) {
            ArrayList arrayList = new ArrayList(wq.G(q31Var, 10));
            Iterator it = q31Var.e.iterator();
            while (it.hasNext()) {
                arrayList.add(((p31) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }
}
