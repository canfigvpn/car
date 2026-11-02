package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fo1 implements mv0 {
    public final aq a;
    public final rx0 b = vv.F(v01.e, new w8(22, this));

    public fo1(aq aqVar) {
        this.a = aqVar;
    }

    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        jv jvVarA = n20Var.A(c());
        String strM = null;
        while (true) {
            int iH = jvVarA.h(c());
            if (iH == -1) {
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + strM).toString());
            }
            if (iH != 0) {
                if (iH == 1) {
                    if (strM == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    ex.o(this, jvVarA, strM);
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (strM == null) {
                    strM = "unknown class";
                }
                sb.append(strM);
                sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb.append(iH);
                throw new a22(sb.toString());
            }
            strM = jvVarA.m(c(), iH);
        }
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return (s12) this.b.getValue();
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        obj.getClass();
        ex.p(this, p61Var, obj);
        throw null;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
