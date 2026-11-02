package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pl extends wp1 {
    public static final pl c = new pl(ql.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        ol olVar = (ol) obj;
        olVar.getClass();
        byte bL = jvVar.l(this.b, i);
        olVar.b(olVar.d() + 1);
        byte[] bArr = olVar.a;
        int i2 = olVar.b;
        olVar.b = i2 + 1;
        bArr[i2] = bL;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ol olVar = new ol();
        olVar.a = bArr;
        olVar.b = bArr.length;
        olVar.b(10);
        return olVar;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new byte[0];
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        p61Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            p61Var.C(this.b, i2);
            p61Var.z(b);
        }
    }
}
