package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lg2 {
    public static final /* synthetic */ long b = we.a.objectFieldOffset(lg2.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public dc0[] a;

    public final void a(dc0 dc0Var) {
        dc0Var.d((ec0) this);
        dc0[] dc0VarArr = this.a;
        if (dc0VarArr == null) {
            dc0VarArr = new dc0[4];
            this.a = dc0VarArr;
        } else if (b() >= dc0VarArr.length) {
            dc0VarArr = (dc0[]) Arrays.copyOf(dc0VarArr, b() * 2);
            this.a = dc0VarArr;
        }
        int iB = b();
        we.a.putIntVolatile(this, b, iB + 1);
        dc0VarArr[iB] = dc0Var;
        dc0Var.f = iB;
        d(iB);
    }

    public final int b() {
        return we.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final dc0 c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        we.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                dc0 dc0Var = objArr2[i];
                dc0Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (dc0Var.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        dc0 dc0Var2 = objArr2[b()];
        dc0Var2.getClass();
        dc0Var2.d(null);
        dc0Var2.f = -1;
        objArr2[b()] = null;
        return dc0Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            dc0[] dc0VarArr = this.a;
            dc0VarArr.getClass();
            int i2 = (i - 1) / 2;
            dc0 dc0Var = dc0VarArr[i2];
            dc0Var.getClass();
            dc0 dc0Var2 = dc0VarArr[i];
            dc0Var2.getClass();
            if (dc0Var.compareTo(dc0Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        dc0[] dc0VarArr = this.a;
        dc0VarArr.getClass();
        dc0 dc0Var = dc0VarArr[i2];
        dc0Var.getClass();
        dc0 dc0Var2 = dc0VarArr[i];
        dc0Var2.getClass();
        dc0VarArr[i] = dc0Var;
        dc0VarArr[i2] = dc0Var2;
        dc0Var.f = i;
        dc0Var2.f = i2;
    }
}
