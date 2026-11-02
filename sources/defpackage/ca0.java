package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ca0 {
    public static final Object j = new Object();
    public static volatile ca0 k;
    public final ReentrantReadWriteLock a;
    public final ue b;
    public volatile int c;
    public final Handler d;
    public final y90 e;
    public final ba0 f;
    public final w40 g;
    public final int h;
    public final y20 i;

    public ca0(vg0 vg0Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        ba0 ba0Var = (ba0) vg0Var.b;
        this.f = ba0Var;
        int i = vg0Var.a;
        this.h = i;
        this.i = (y20) vg0Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new ue();
        this.g = new w40(2);
        y90 y90Var = new y90(this);
        this.e = y90Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                ba0Var.a(new x90(y90Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static ca0 a() {
        ca0 ca0Var;
        synchronized (j) {
            try {
                ca0Var = k;
                if (!(ca0Var != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ca0Var;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            fu1.h("Not initialized yet");
            return 0;
        }
        mx.q(charSequence, "charSequence cannot be null");
        ud udVar = this.e.b;
        udVar.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ak2[] ak2VarArr = (ak2[]) spanned.getSpans(i, i + 1, ak2.class);
            if (ak2VarArr.length > 0) {
                return spanned.getSpanStart(ak2VarArr[0]);
            }
        }
        return ((oa0) udVar.s(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new oa0(i))).f;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            fu1.h("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            y90 y90Var = this.e;
            ca0 ca0Var = y90Var.a;
            try {
                ca0Var.f.a(new x90(y90Var));
            } catch (Throwable th) {
                ca0Var.f(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new im(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:112:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:38:0x0057, B:41:0x005c, B:43:0x0060, B:45:0x006d, B:52:0x008c, B:54:0x0096, B:56:0x0099, B:58:0x009c, B:60:0x00ac, B:61:0x00af), top: B:112:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    public final CharSequence g(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        ak2[] ak2VarArr;
        int spanStart;
        pl2 pl2Var = null;
        if (!(c() == 1)) {
            fu1.h("Not initialized yet");
            return null;
        }
        if (i < 0) {
            qj.r("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            qj.r("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            qj.r("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            qj.r("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            qj.r("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        ud udVar = this.e.b;
        udVar.getClass();
        boolean z2 = charSequence instanceof u72;
        if (z2) {
            ((u72) charSequence).a();
        }
        if (z2) {
            pl2Var = new pl2((Spannable) charSequence);
            if (pl2Var != null) {
                for (ak2 ak2Var : ak2VarArr) {
                    spanStart = pl2Var.f.getSpanStart(ak2Var);
                    int spanEnd = pl2Var.f.getSpanEnd(ak2Var);
                    if (spanStart != i2) {
                        pl2Var.removeSpan(ak2Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((u72) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    pl2Var = new pl2((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((u72) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, ak2.class) <= i2) {
                pl2Var = new pl2();
                pl2Var.e = false;
                pl2Var.f = new SpannableString(charSequence);
            }
            if (pl2Var != null && (ak2VarArr = (ak2[]) pl2Var.f.getSpans(i, i2, ak2.class)) != null && ak2VarArr.length > 0) {
                while (i < r0) {
                    spanStart = pl2Var.f.getSpanStart(ak2Var);
                    int spanEnd2 = pl2Var.f.getSpanEnd(ak2Var);
                    if (spanStart != i2) {
                        pl2Var.removeSpan(ak2Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        pl2 pl2Var2 = (pl2) udVar.s(charSequence2, i4, i5, Integer.MAX_VALUE, z, new dq0(13, pl2Var, (w40) udVar.b));
                        if (pl2Var2 != null) {
                            Spannable spannable = pl2Var2.f;
                            if (z2) {
                                ((u72) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z2) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z2) {
                            throw th;
                        }
                        ((u72) charSequence2).b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((u72) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((u72) charSequence2).b();
        throw th;
    }

    public final void h(aa0 aa0Var) {
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new im(Arrays.asList(aa0Var), this.c, null));
            } else {
                this.b.add(aa0Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        y90 y90Var = this.e;
        y90Var.getClass();
        Bundle bundle = editorInfo.extras;
        k71 k71Var = (k71) y90Var.c.e;
        int iA = k71Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) k71Var.h).getInt(iA + k71Var.e) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
