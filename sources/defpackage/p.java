package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ir.alirezaivaz.mygarage.MainActivity;
import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x025d  */
    /* JADX WARN: Code duplicated, block: B:165:0x026e A[Catch: all -> 0x029d, LOOP:1: B:150:0x020e->B:165:0x026e, LOOP_END, TryCatch #10 {all -> 0x029d, blocks: (B:147:0x0200, B:150:0x020e, B:152:0x021e, B:154:0x022a, B:156:0x0233, B:158:0x0242, B:160:0x025f, B:165:0x026e, B:166:0x0272, B:168:0x0284, B:172:0x0299, B:173:0x029c, B:167:0x0277), top: B:209:0x0200, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x0272 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        View viewFindFocus;
        int i = this.e;
        Boolean bool = null;
        int i2 = 0;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((r) obj).c();
                return;
            case 1:
                k5 k5Var = (k5) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    k5Var.h.v(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        k5Var.i();
                        Trace.endSection();
                        k5Var.M = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                a6 a6Var = (a6) obj;
                boolean zF = a6Var.f();
                e5 e5Var = a6Var.e;
                if (zF) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        e5Var.v(true);
                        d91 d91Var = a6Var.n;
                        int[] iArr = d91Var.b;
                        long[] jArr = d91Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = i2;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (!a6Var.e().a(i6)) {
                                                a6Var.h.add(new ww(i6, a6Var.m, xw.f, null));
                                                a6Var.k.c(ll2.a);
                                            }
                                        }
                                        j >>= 8;
                                        i5++;
                                        length = length;
                                    }
                                    int i7 = length;
                                    if (i4 == 8) {
                                        length = i7;
                                        if (i3 != length) {
                                            i3++;
                                            i2 = 0;
                                        }
                                    }
                                } else if (i3 != length) {
                                    i3++;
                                    i2 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            a6Var.i(e5Var.getSemanticsOwner().a(), a6Var.o);
                            Trace.endSection();
                            a6Var.c(a6Var.e());
                            a6Var.n();
                            a6Var.p = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                return;
            case 3:
                ActionMode actionMode = ((p9) obj).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                bt.j((MainActivity) obj);
                return;
            case 5:
                xs xsVar = (xs) obj;
                Runnable runnable = xsVar.f;
                if (runnable != null) {
                    runnable.run();
                    xsVar.f = null;
                    return;
                }
                return;
            case 6:
                k50.g((k50) obj);
                return;
            case 7:
                ug0 ug0Var = (ug0) obj;
                synchronized (ug0Var.c) {
                    try {
                        if (ug0Var.g == null) {
                            return;
                        }
                        try {
                            oh0 oh0VarC = ug0Var.c();
                            int i8 = oh0VarC.f;
                            if (i8 == 2) {
                                synchronized (ug0Var.c) {
                                }
                            }
                            if (i8 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i8 + ")");
                            }
                            try {
                                int i9 = uh2.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Context context = ug0Var.a;
                                oh0[] oh0VarArr = {oh0VarC};
                                j02 j02Var = rj2.a;
                                r02.g("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceI = rj2.a.i(context, oh0VarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM = n02.m(ug0Var.a, oh0VarC.a);
                                    if (mappedByteBufferM == null || typefaceI == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        e4 e4Var = new e4(typefaceI, ei1.G(mappedByteBufferM));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (ug0Var.c) {
                                            try {
                                                vv vvVar = ug0Var.g;
                                                if (vvVar != null) {
                                                    vvVar.J(e4Var);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                            break;
                                        }
                                        ug0Var.b();
                                        return;
                                    } catch (Throwable th5) {
                                        int i10 = uh2.a;
                                        Trace.endSection();
                                        throw th5;
                                    }
                                } catch (Throwable th6) {
                                    Trace.endSection();
                                    throw th6;
                                }
                            } catch (Throwable th7) {
                                int i11 = uh2.a;
                                Trace.endSection();
                                throw th7;
                            }
                            break;
                        } catch (Throwable th8) {
                            synchronized (ug0Var.c) {
                                try {
                                    vv vvVar2 = ug0Var.g;
                                    if (vvVar2 != null) {
                                        vvVar2.I(th8);
                                    }
                                    ug0Var.b();
                                    return;
                                } catch (Throwable th9) {
                                    throw th9;
                                }
                            }
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
            case 8:
                cq1 cq1Var = (cq1) obj;
                b21 b21Var = cq1Var.j;
                if (cq1Var.f == 0) {
                    cq1Var.g = true;
                    b21Var.d(q11.ON_PAUSE);
                }
                if (cq1Var.e == 0 && cq1Var.g) {
                    b21Var.d(q11.ON_STOP);
                    cq1Var.h = true;
                    return;
                }
                return;
            case 9:
                su1.setRippleState$lambda$1((su1) obj);
                return;
            case 10:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((qk1) obj).f;
                int i12 = sideSheetBehavior.e;
                if (i12 != 2 || i12 == 0) {
                    return;
                }
                sideSheetBehavior.e = 0;
                return;
            case 11:
                View view = (View) obj;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                af2 af2Var = (af2) obj;
                ud udVar = af2Var.b;
                af2Var.n = null;
                fa1 fa1Var = af2Var.m;
                View view2 = af2Var.a;
                if (!view2.isFocused() && (viewFindFocus = view2.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    fa1Var.g();
                    return;
                }
                Object[] objArr = fa1Var.e;
                int i13 = fa1Var.g;
                Boolean boolValueOf = null;
                for (int i14 = 0; i14 < i13; i14++) {
                    ze2 ze2Var = (ze2) objArr[i14];
                    int iOrdinal = ze2Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            bool = Boolean.FALSE;
                        } else if (iOrdinal != 2 && iOrdinal != 3) {
                            qj.p();
                            return;
                        } else if (!ws0.j(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(ze2Var == ze2.g);
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    boolValueOf = bool;
                }
                fa1Var.g();
                if (ws0.j(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((rx0) udVar.c).getValue()).restartInput((View) udVar.b);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((qk1) ((qk1) udVar.d).f).G();
                    } else {
                        ((qk1) ((qk1) udVar.d).f).v();
                    }
                }
                if (ws0.j(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((rx0) udVar.c).getValue()).restartInput((View) udVar.b);
                    return;
                }
                return;
        }
    }
}
