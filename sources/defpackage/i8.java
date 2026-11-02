package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class i8 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i8(int i, Object obj, Object obj2) {
        super(1);
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        vr1 vr1Var;
        switch (this.f) {
            case 0:
                return new eq0((g11) this.h, new h8(0, (j8) this.g));
            case 1:
                eq0 eq0Var = (eq0) this.h;
                synchronized (eq0Var.c) {
                    try {
                        eq0Var.e = true;
                        fa1 fa1Var = eq0Var.d;
                        Object[] objArr = fa1Var.e;
                        int i = fa1Var.g;
                        for (int i2 = 0; i2 < i; i2++) {
                            ze1 ze1Var = (ze1) ((lo2) objArr[i2]).get();
                            if (ze1Var != null && (vr1Var = ze1Var.b) != null) {
                                vr1Var.closeConnection();
                                ze1Var.b = null;
                            }
                        }
                        eq0Var.d.g();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ye2 ye2Var = ((j8) this.g).f;
                ye2Var.b.set(null);
                ye2Var.a.f();
                return ll2.a;
            case 2:
                uo1 uo1Var = (uo1) this.h;
                uo1Var.setPositionProvider((xo1) this.g);
                uo1Var.r();
                return new n8(0);
            case 3:
                y9 y9Var = (y9) this.h;
                z9 z9Var = (z9) this.g;
                synchronized (y9Var.i) {
                    y9Var.k.remove(z9Var);
                }
                return ll2.a;
            case 4:
                ((Choreographer) ((aa) this.h).f).removeFrameCallback((z9) this.g);
                return ll2.a;
            case 5:
                ((im1) obj).h((jm1) this.h, 0, 0, ((fx) this.g).c.h());
                return ll2.a;
            case 6:
                im1.n((im1) obj, (jm1) this.h, ((aj) this.g).s);
                return ll2.a;
            case 7:
                im1.n((im1) obj, (jm1) this.h, ((x42) this.g).E);
                return ll2.a;
            default:
                av avVar = (av) obj;
                gt gtVar = (gt) this.g;
                cr2 cr2Var = (cr2) this.h;
                if (!cr2Var.g) {
                    y11 y11Var = avVar.c;
                    View view = avVar.a;
                    b21 b21VarH = y11Var.h();
                    cr2Var.i = gtVar;
                    if (cr2Var.h == null) {
                        if (ws0.j(Looper.myLooper(), view.getHandler().getLooper())) {
                            cr2Var.h = b21VarH;
                            b21VarH.a(cr2Var);
                        } else {
                            view.post(new w5(5, cr2Var, b21VarH));
                        }
                    } else if (b21VarH.h.compareTo(r11.g) >= 0) {
                        cr2Var.f.A(new gt(new xv(cr2Var, avVar, gtVar), true, -1723985096));
                    }
                }
                return ll2.a;
        }
    }
}
