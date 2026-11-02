package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 extends dw0 implements ej0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rb0 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb0(rb0 rb0Var, long j, int i) {
        super(1);
        this.f = i;
        this.g = rb0Var;
        this.h = j;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        ej0 ej0Var;
        ej0 ej0Var2;
        int iOrdinal;
        int i = this.f;
        long jB = 0;
        long j = this.h;
        rb0 rb0Var = this.g;
        switch (i) {
            case 0:
                int iOrdinal2 = ((hb0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    jo joVar = rb0Var.x.a.c;
                    if (joVar != null && (ej0Var = joVar.b) != null) {
                        j = ((qr0) ej0Var.h(new qr0(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        qj.p();
                        return null;
                    }
                    jo joVar2 = rb0Var.y.a.c;
                    if (joVar2 != null && (ej0Var2 = joVar2.b) != null) {
                        j = ((qr0) ej0Var2.h(new qr0(j))).a;
                    }
                }
                return new qr0(j);
            case 1:
                hb0 hb0Var = (hb0) obj;
                if (rb0Var.C != null && rb0Var.H0() != null && !ws0.j(rb0Var.C, rb0Var.H0()) && (iOrdinal = hb0Var.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        qj.p();
                        return null;
                    }
                    jo joVar3 = rb0Var.y.a.c;
                    if (joVar3 != null) {
                        ej0 ej0Var3 = joVar3.b;
                        long j2 = this.h;
                        long j3 = ((qr0) ej0Var3.h(new qr0(j2))).a;
                        t3 t3VarH0 = rb0Var.H0();
                        t3VarH0.getClass();
                        kw0 kw0Var = kw0.e;
                        long jA = t3VarH0.a(j2, j3, kw0Var);
                        t3 t3Var = rb0Var.C;
                        t3Var.getClass();
                        jB = ir0.b(jA, t3Var.a(j2, j3, kw0Var));
                    }
                }
                return new ir0(jB);
            default:
                hb0 hb0Var2 = (hb0) obj;
                i52 i52Var = rb0Var.x.a.b;
                long j4 = i52Var != null ? ((ir0) i52Var.a.h(new qr0(j))).a : 0L;
                i52 i52Var2 = rb0Var.y.a.b;
                long j5 = i52Var2 != null ? ((ir0) i52Var2.a.h(new qr0(j))).a : 0L;
                int iOrdinal3 = hb0Var2.ordinal();
                if (iOrdinal3 == 0) {
                    jB = j4;
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        qj.p();
                        return null;
                    }
                    jB = j5;
                }
                return new ir0(jB);
        }
    }
}
