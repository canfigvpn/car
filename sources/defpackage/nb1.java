package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb1 implements ij0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nb1(me2 me2Var, ez ezVar) {
        this.e = 6;
        this.f = me2Var;
        this.g = ezVar;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        of2 of2Var;
        int i = this.e;
        ll2 ll2Var = ll2.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qx.h((ew1) obj4, (gt) obj3, (ak0) obj, ei1.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                l32.f((o32) obj4, (ph) obj3, (ak0) obj, ei1.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                l32.d((dh) obj4, (ti0) obj3, (ak0) obj, ei1.P(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                l32.e((ti0) obj4, (ti0) obj3, (ak0) obj, ei1.P(7));
                break;
            case 4:
                ((Integer) obj2).getClass();
                v12.a((u71) obj4, (gt) obj3, (ak0) obj, ei1.P(49));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((is1) obj4).f((Drawable) obj3, (ak0) obj, ei1.P(49));
                break;
            default:
                me2 me2Var = (me2) obj4;
                ez ezVar = (ez) obj3;
                kc2 kc2Var = (kc2) obj;
                Context context = (Context) obj2;
                boolean zH = me2Var.h();
                yb ybVarK = me2Var.k();
                TextClassification textClassification = null;
                String str = ybVarK != null ? ybVarK.f : null;
                of2 of2Var2 = me2Var.v;
                if (of2Var2 != null) {
                    long j = of2Var2.a;
                    xf1 xf1Var = me2Var.b;
                    of2Var = new of2(j02.c(xf1Var.r((int) (j >> 32)), xf1Var.r((int) (j & 4294967295L))));
                } else {
                    of2Var = null;
                }
                bn1 bn1Var = me2Var.i;
                o1 o1Var = new o1(me2Var, ezVar, context, 15);
                a90 a90Var = fn1.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || of2Var == null || bn1Var == null || !(bn1Var instanceof en1)) {
                    o1Var.h(kc2Var);
                    if (str != null && of2Var != null) {
                        sv.h(kc2Var, context, zH, str, of2Var.a);
                    }
                } else {
                    en1 en1Var = (en1) bn1Var;
                    long j2 = of2Var.a;
                    Object obj5 = en1Var.h;
                    ta1 ta1Var = en1Var.e;
                    if (ta1Var.f()) {
                        jc2 jc2Var = (jc2) en1Var.g.getValue();
                        TextClassification textClassification2 = (jc2Var != null && of2.b(j2, jc2Var.b) && ws0.j(str, jc2Var.a)) ? jc2Var.c : null;
                        ta1Var.b(null);
                        textClassification = textClassification2;
                    }
                    if (textClassification == null) {
                        o1Var.h(kc2Var);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            kc2Var.a.a(new bd2(obj5, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            kc2Var.a.a(new bd2(obj5, textClassification, -1));
                        }
                        o1Var.h(kc2Var);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            nr.v(actions.get(i2));
                            if (i2 > 0) {
                                kc2Var.a.a(new bd2(obj5, textClassification, i2));
                            }
                        }
                    }
                    sv.h(kc2Var, context, zH, str, of2Var.a);
                }
                break;
        }
        return ll2Var;
    }

    public /* synthetic */ nb1(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }
}
