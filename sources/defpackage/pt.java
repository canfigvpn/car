package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt implements oj0 {
    @Override // defpackage.oj0
    public final Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, ak0 ak0Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        lx lxVar = (lx) obj2;
        jj0 jj0Var = (jj0) obj3;
        ti0 ti0Var = (ti0) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        r71 r71Var = r71.a;
        if (i2 == 0) {
            i = (ak0Var.f(r71Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= ak0Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= ak0Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= ak0Var.f(lxVar) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ak0Var.h(jj0Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= ak0Var.h(ti0Var) ? 131072 : 65536;
        }
        if (ak0Var.O(i & 1, (599187 & i) != 599186)) {
            px.c(str, zBooleanValue, lxVar, r71Var, jj0Var, ti0Var, ak0Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            ak0Var.R();
        }
        return ll2.a;
    }
}
