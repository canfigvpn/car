package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vp {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public vp(int i, int i2, int i3, hf2 hf2Var) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = hf2Var;
    }

    public void a(Object obj) {
        Object[] objArr = (Object[]) this.e;
        int i = this.c;
        objArr[i] = obj;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i5];
            ve.w0(objArr, objArr2, 0, i3, length);
            ve.w0((Object[]) this.e, objArr2, i4, 0, this.b);
            this.e = objArr2;
            this.b = 0;
            this.c = length;
            this.d = i5 - 1;
        }
    }

    public uz1 b(int i) {
        return new uz1(qx.E((hf2) this.e, i), i, 1L);
    }

    public int c() {
        return this.d - this.c;
    }

    public int d(int i) {
        return ((bi1) this.e).g[this.c + i];
    }

    public Object e(int i) {
        return ((bi1) this.e).i[this.d + i];
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "";
            case 2:
            default:
                return super.toString();
            case 3:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                hf2 hf2Var = (hf2) this.e;
                sb.append(qx.E(hf2Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(qx.E(hf2Var, i2));
                sb.append("), prevOffset=");
                return k3.l(sb, this.d, ')');
        }
    }

    public vp(bi1 bi1Var) {
        this.a = 2;
        this.e = bi1Var;
    }

    public /* synthetic */ vp(int i) {
        this.a = i;
    }
}
