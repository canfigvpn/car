package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu1 implements s60, c82, io2 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ int e;

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void e(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void i(String str, int i, Object obj) {
        throw new IllegalArgumentException((str + i + obj).toString());
    }

    public static /* synthetic */ void j(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void k(String str) {
        throw new NoSuchElementException(str);
    }

    @Override // defpackage.io2
    public bi2 a(yb ybVar) {
        return new bi2(ybVar, wf1.a);
    }

    @Override // defpackage.c82
    public boolean b() {
        return false;
    }

    @Override // defpackage.s60
    public double d(double d) {
        return d;
    }
}
