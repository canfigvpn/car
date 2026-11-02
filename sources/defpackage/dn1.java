package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends wa2 implements ij0 {
    public ta1 i;
    public en1 j;
    public CharSequence k;
    public long l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ CharSequence o;
    public final /* synthetic */ long p;
    public final /* synthetic */ en1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn1(long j, sx sxVar, en1 en1Var, CharSequence charSequence) {
        super(2, sxVar);
        this.o = charSequence;
        this.p = j;
        this.q = en1Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        return ((dn1) p((sx) obj2, nr.i(obj))).r(ll2.a);
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        dn1 dn1Var = new dn1(this.p, sxVar, this.q, this.o);
        dn1Var.n = obj;
        return dn1Var;
    }

    @Override // defpackage.sh
    public final Object r(Object obj) {
        long j;
        en1 en1Var;
        TextSelection textSelection;
        CharSequence charSequence;
        ta1 ta1Var;
        int i = this.m;
        if (i == 0) {
            ix.Q(obj);
            TextClassifier textClassifier = (TextClassifier) this.n;
            long j2 = this.p;
            int iF = of2.f(j2);
            int iE = of2.e(j2);
            CharSequence charSequence2 = this.o;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, iF, iE);
            en1 en1Var2 = this.q;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(en1Var2.b());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jC = j02.c(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            fz fzVar = fz.e;
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.l = jC;
                this.m = 2;
                if (this.q.a(this.o, jC, textClassifier, this) != fzVar) {
                    j = jC;
                }
            } else {
                ta1 ta1Var2 = en1Var2.e;
                this.n = textSelectionSuggestSelection;
                this.i = ta1Var2;
                this.j = en1Var2;
                this.k = charSequence2;
                this.l = jC;
                this.m = 1;
                if (ta1Var2.d(this) != fzVar) {
                    en1Var = en1Var2;
                    textSelection = textSelectionSuggestSelection;
                    charSequence = charSequence2;
                    ta1Var = ta1Var2;
                    j = jC;
                    TextClassification textClassification = textSelection.getTextClassification();
                    textClassification.getClass();
                    en1Var.g.setValue(new jc2(charSequence, j, textClassification));
                }
            }
            return fzVar;
        }
        if (i == 1) {
            j = this.l;
            charSequence = this.k;
            en1Var = this.j;
            ta1Var = this.i;
            textSelection = (TextSelection) this.n;
            ix.Q(obj);
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                textClassification2.getClass();
                en1Var.g.setValue(new jc2(charSequence, j, textClassification2));
            } finally {
                ta1Var.b(null);
            }
        } else {
            if (i != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.l;
            ix.Q(obj);
        }
        return new of2(j);
    }
}
