package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ok2 extends wp1 {
    public static final ok2 c = new ok2(pk2.a);

    @Override // defpackage.o
    public final int h(Object obj) {
        return ((mk2) obj).e.length;
    }

    @Override // defpackage.tq, defpackage.o
    public final void j(jv jvVar, int i, Object obj) {
        nk2 nk2Var = (nk2) obj;
        nk2Var.getClass();
        byte bS = jvVar.b(this.b, i).s();
        nk2Var.b(nk2Var.d() + 1);
        byte[] bArr = nk2Var.a;
        int i2 = nk2Var.b;
        nk2Var.b = i2 + 1;
        bArr[i2] = bS;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        byte[] bArr = ((mk2) obj).e;
        nk2 nk2Var = new nk2();
        nk2Var.a = bArr;
        nk2Var.b = bArr.length;
        nk2Var.b(10);
        return nk2Var;
    }

    @Override // defpackage.wp1
    public final Object n() {
        return new mk2(new byte[0]);
    }

    @Override // defpackage.wp1
    public final void o(p61 p61Var, Object obj, int i) {
        byte[] bArr = ((mk2) obj).e;
        p61Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            p61Var.G(this.b, i2).z(bArr[i2]);
        }
    }
}
