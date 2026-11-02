package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class d61 implements mv0 {
    public final mv0 a;
    public final mv0 b;
    public final /* synthetic */ int c;
    public final u12 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d61(final mv0 mv0Var, final mv0 mv0Var2, int i) {
        this(mv0Var, mv0Var2, (byte) 0);
        this.c = i;
        final int i2 = 0;
        switch (i) {
            case 1:
                this(mv0Var, mv0Var2, (byte) 0);
                final int i3 = 1;
                this.d = v12.c("kotlin.Pair", new s12[0], new ej0() { // from class: b61
                    @Override // defpackage.ej0
                    public final Object h(Object obj) {
                        int i4 = i3;
                        ll2 ll2Var = ll2.a;
                        mv0 mv0Var3 = mv0Var2;
                        mv0 mv0Var4 = mv0Var;
                        bq bqVar = (bq) obj;
                        switch (i4) {
                            case 0:
                                bqVar.getClass();
                                bq.a(bqVar, "key", mv0Var4.c());
                                bq.a(bqVar, "value", mv0Var3.c());
                                break;
                            default:
                                bqVar.getClass();
                                bq.a(bqVar, "first", mv0Var4.c());
                                bq.a(bqVar, "second", mv0Var3.c());
                                break;
                        }
                        return ll2Var;
                    }
                });
                break;
            default:
                this.d = v12.d("kotlin.collections.Map.Entry", q92.d, new s12[0], new ej0() { // from class: b61
                    @Override // defpackage.ej0
                    public final Object h(Object obj) {
                        int i4 = i2;
                        ll2 ll2Var = ll2.a;
                        mv0 mv0Var3 = mv0Var2;
                        mv0 mv0Var4 = mv0Var;
                        bq bqVar = (bq) obj;
                        switch (i4) {
                            case 0:
                                bqVar.getClass();
                                bq.a(bqVar, "key", mv0Var4.c());
                                bq.a(bqVar, "value", mv0Var3.c());
                                break;
                            default:
                                bqVar.getClass();
                                bq.a(bqVar, "first", mv0Var4.c());
                                bq.a(bqVar, "second", mv0Var3.c());
                                break;
                        }
                        return ll2Var;
                    }
                });
                break;
        }
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        Object c61Var;
        Object obj = nj2.C0;
        s12 s12VarC = c();
        jv jvVarA = n20Var.A(s12VarC);
        Object objU = obj;
        Object objU2 = objU;
        while (true) {
            int iH = jvVarA.h(c());
            if (iH == -1) {
                if (objU == obj) {
                    throw new a22("Element 'key' is missing");
                }
                if (objU2 == obj) {
                    throw new a22("Element 'value' is missing");
                }
                switch (this.c) {
                    case 0:
                        c61Var = new c61(objU, objU2);
                        break;
                    default:
                        c61Var = new qj1(objU, objU2);
                        break;
                }
                jvVarA.p(s12VarC);
                return c61Var;
            }
            if (iH == 0) {
                objU = jvVarA.u(c(), 0, this.a, null);
            } else {
                if (iH != 1) {
                    throw new a22(k3.i("Invalid index: ", iH));
                }
                objU2 = jvVarA.u(c(), 1, this.b, null);
            }
        }
    }

    @Override // defpackage.mv0
    public final s12 c() {
        int i = this.c;
        return this.d;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        Object key;
        Object value;
        p61 p61VarU = p61Var.u(c());
        s12 s12VarC = c();
        mv0 mv0Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                qj1 qj1Var = (qj1) obj;
                qj1Var.getClass();
                key = qj1Var.e;
                break;
        }
        p61VarU.N(s12VarC, 0, mv0Var, key);
        s12 s12VarC2 = c();
        mv0 mv0Var2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                qj1 qj1Var2 = (qj1) obj;
                qj1Var2.getClass();
                value = qj1Var2.f;
                break;
        }
        p61VarU.N(s12VarC2, 1, mv0Var2, value);
        p61VarU.T(c());
    }

    public d61(mv0 mv0Var, mv0 mv0Var2, byte b) {
        this.a = mv0Var;
        this.b = mv0Var2;
    }
}
