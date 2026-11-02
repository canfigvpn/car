package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class en1 implements bn1 {
    public final uy a;
    public final Context b;
    public final tz1 c;
    public final q31 d;
    public TextClassifier f;
    public final ta1 e = new ta1();
    public final dk1 g = y12.s(null);
    public final Object h = new Object();

    public en1(uy uyVar, Context context, tz1 tz1Var, q31 q31Var) {
        this.a = uyVar;
        this.b = context;
        this.c = tz1Var;
        this.d = q31Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(CharSequence charSequence, long j, TextClassifier textClassifier, tx txVar) throws Throwable {
        cn1 cn1Var;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        ta1 ta1Var;
        Object obj;
        Object obj2;
        TextClassification textClassificationClassifyText;
        ta1 ta1Var2;
        long j3;
        CharSequence charSequence3;
        if (txVar instanceof cn1) {
            cn1Var = (cn1) txVar;
            int i = cn1Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn1Var.n = i - Integer.MIN_VALUE;
            } else {
                cn1Var = new cn1(this, txVar);
            }
        } else {
            cn1Var = new cn1(this, txVar);
        }
        Object obj3 = cn1Var.l;
        int i2 = cn1Var.n;
        dk1 dk1Var = this.g;
        ll2 ll2Var = ll2.a;
        ta1 ta1Var3 = this.e;
        fz fzVar = fz.e;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    j2 = cn1Var.k;
                    ta1Var = cn1Var.j;
                    textClassifier2 = (TextClassifier) cn1Var.i;
                    charSequence2 = cn1Var.h;
                    ix.Q(obj3);
                } else {
                    if (i2 != 2) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j3 = cn1Var.k;
                    ta1 ta1Var4 = cn1Var.j;
                    textClassificationClassifyText = (TextClassification) cn1Var.i;
                    charSequence3 = cn1Var.h;
                    ix.Q(obj3);
                    ta1Var2 = ta1Var4;
                }
                try {
                    dk1Var.setValue(new jc2(charSequence3, j3, textClassificationClassifyText));
                    return ll2Var;
                } finally {
                    ta1Var2.b(null);
                }
            }
            ix.Q(obj3);
            cn1Var.h = charSequence;
            cn1Var.i = textClassifier;
            cn1Var.j = ta1Var3;
            j2 = j;
            cn1Var.k = j2;
            cn1Var.n = 1;
            if (ta1Var3.d(cn1Var) == fzVar) {
                return fzVar;
            }
            charSequence2 = charSequence;
            textClassifier2 = textClassifier;
            ta1Var = ta1Var3;
            jc2 jc2Var = (jc2) dk1Var.getValue();
            if (jc2Var != null) {
                try {
                    if (of2.b(j2, jc2Var.b) && ws0.j(charSequence2, jc2Var.a)) {
                        ta1Var.b(null);
                        return ll2Var;
                    }
                    obj2 = null;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    ta1Var.b(obj);
                    throw th;
                }
            } else {
                obj2 = null;
            }
            ta1Var.b(obj2);
            textClassificationClassifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, of2.f(j2), of2.e(j2)).setDefaultLocales(b()).build());
            cn1Var.h = charSequence2;
            cn1Var.i = textClassificationClassifyText;
            cn1Var.j = ta1Var3;
            cn1Var.k = j2;
            cn1Var.n = 2;
            if (ta1Var3.d(cn1Var) == fzVar) {
                return fzVar;
            }
            ta1Var2 = ta1Var3;
            j3 = j2;
            charSequence3 = charSequence2;
            dk1Var.setValue(new jc2(charSequence3, j3, textClassificationClassifyText));
            return ll2Var;
        } catch (Throwable th2) {
            th = th2;
            obj = null;
        }
    }

    public final LocaleList b() {
        q31 q31Var = this.d;
        if (q31Var == null) {
            return new LocaleList(((p31) qm1.a.h().e.get(0)).a);
        }
        ArrayList arrayList = new ArrayList(wq.G(q31Var, 10));
        Iterator it = q31Var.e.iterator();
        while (it.hasNext()) {
            arrayList.add(((p31) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
