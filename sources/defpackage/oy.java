package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oy implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ py f;

    public /* synthetic */ oy(py pyVar, z02 z02Var) {
        this.e = 3;
        this.f = pyVar;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        int i = this.e;
        StringBuilder sb = null;
        boolean z = true;
        py pyVar = this.f;
        switch (i) {
            case 0:
                y6 y6Var = (y6) obj;
                dk1 dk1Var = pyVar.w.t;
                Boolean bool = Boolean.TRUE;
                dk1Var.setValue(bool);
                pyVar.w.s.setValue(bool);
                f11 f11Var = pyVar.w;
                CharSequence textValue = y6Var.a.isText() ? y6Var.a.getTextValue() : null;
                textValue.getClass();
                py.I0(f11Var, (String) textValue, pyVar.x, pyVar.y);
                return bool;
            case 1:
                List list = (List) obj;
                if (pyVar.w.d() != null) {
                    if2 if2VarD = pyVar.w.d();
                    if2VarD.getClass();
                    list.add(if2VarD.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                py.I0(pyVar.w, ((yb) obj).f, pyVar.x, pyVar.y);
                return Boolean.TRUE;
            default:
                yb ybVar = (yb) obj;
                if (pyVar.x || !pyVar.y) {
                    z = false;
                } else {
                    cf2 cf2Var = pyVar.w.e;
                    if (cf2Var != null) {
                        List listV = vs0.v(new kd0(), new es(ybVar, 1));
                        f11 f11Var2 = pyVar.w;
                        dq0 dq0Var = f11Var2.d;
                        ey eyVar = f11Var2.v;
                        te2 te2VarI = dq0Var.i(listV);
                        cf2Var.a(null, te2VarI);
                        eyVar.h(te2VarI);
                    } else {
                        te2 te2Var = pyVar.v;
                        String str = te2Var.a.f;
                        long j = te2Var.b;
                        int i2 = of2.c;
                        int i3 = (int) (j >> 32);
                        int i4 = (int) (j & 4294967295L);
                        str.getClass();
                        ybVar.getClass();
                        if (i4 >= i3) {
                            sb = new StringBuilder();
                            sb.append((CharSequence) str, 0, i3);
                            sb.append((CharSequence) ybVar);
                            sb.append((CharSequence) str, i4, str.length());
                        } else {
                            fu1.e(i4, i3, ") is less than start index (", "End index (");
                        }
                        String string = sb.toString();
                        int length = ybVar.f.length() + ((int) (pyVar.v.b >> 32));
                        pyVar.w.v.h(new te2(string, j02.c(length, length), 4));
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ oy(py pyVar, int i) {
        this.e = i;
        this.f = pyVar;
    }
}
