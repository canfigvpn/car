package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bs0 extends uq {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs0(int i, boolean z) {
        super(z);
        this.q = i;
    }

    @Override // defpackage.xc1
    public final Object a(String str, Bundle bundle) {
        int i = this.q;
        ej ejVar = xc1.n;
        ArrayList arrayList = null;
        switch (i) {
            case 0:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                rw.C(str);
                throw null;
            case 1:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return ve.I0(doubleArray2);
                }
                rw.C(str);
                throw null;
            case 2:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                String[] strArrY = vv.y(str, bundle);
                ArrayList arrayList2 = new ArrayList(strArrY.length);
                for (String str2 : strArrY) {
                    arrayList2.add((String) ejVar.d(str2));
                }
                return (String[]) arrayList2.toArray(new String[0]);
            default:
                if (k3.w(bundle, str, str) && !vv.D(str, bundle)) {
                    List listM0 = ve.M0(vv.y(str, bundle));
                    arrayList = new ArrayList(wq.G(listM0, 10));
                    Iterator it = listM0.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ejVar.d((String) it.next()));
                    }
                }
                return arrayList;
        }
    }

    @Override // defpackage.xc1
    public final String b() {
        switch (this.q) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xc1
    public final Object c(Object obj, String str) {
        int i = this.q;
        ej ejVar = xc1.n;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null) {
                    return new double[]{Double.parseDouble(str)};
                }
                double[] dArr2 = {Double.parseDouble(str)};
                int length = dArr.length;
                double[] dArrCopyOf = Arrays.copyOf(dArr, length + 1);
                System.arraycopy(dArr2, 0, dArrCopyOf, length, 1);
                return dArrCopyOf;
            case 1:
                List list = (List) obj;
                return list != null ? vq.a0(list, vs0.u(Double.valueOf(Double.parseDouble(str)))) : vs0.u(Double.valueOf(Double.parseDouble(str)));
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{ejVar.d(str)};
                }
                String[] strArr2 = {ejVar.d(str)};
                int length2 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length2 + 1);
                System.arraycopy(strArr2, 0, objArrCopyOf, length2, 1);
                return (String[]) objArrCopyOf;
            default:
                List list2 = (List) obj;
                return list2 != null ? vq.a0(list2, vs0.u(ejVar.d(str))) : vs0.u(ejVar.d(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xc1
    public final Object d(String str) {
        int i = this.q;
        ej ejVar = xc1.n;
        switch (i) {
            case 0:
                return new double[]{Double.parseDouble(str)};
            case 1:
                return vs0.u(Double.valueOf(Double.parseDouble(str)));
            case 2:
                return new String[]{ejVar.d(str)};
            default:
                return vs0.u(ejVar.d(str));
        }
    }

    @Override // defpackage.xc1
    public final void e(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.q) {
            case 0:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putDoubleArray(str, dArr);
                }
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                } else {
                    double[] dArr2 = new double[list.size()];
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dArr2[i] = ((Number) it.next()).doubleValue();
                        i++;
                    }
                    bundle.putDoubleArray(str, dArr2);
                }
                break;
            case 2:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    ArrayList arrayList = new ArrayList(strArr.length);
                    for (String str2 : strArr) {
                        if (str2 == null) {
                            str2 = "null";
                        }
                        arrayList.add(str2);
                    }
                    String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                }
                break;
            default:
                List<String> list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    ArrayList arrayList2 = new ArrayList(wq.G(list2, 10));
                    for (String str3 : list2) {
                        if (str3 == null) {
                            str3 = "null";
                        }
                        arrayList2.add(str3);
                    }
                    String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                    strArr3.getClass();
                    bundle.putStringArray(str, strArr3);
                }
                break;
        }
    }

    @Override // defpackage.uq
    public final Object g() {
        int i = this.q;
        cb0 cb0Var = cb0.e;
        switch (i) {
            case 0:
                return new double[0];
            case 1:
                return cb0Var;
            case 2:
                return new String[0];
            default:
                return cb0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [cb0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // defpackage.uq
    public final List h(Object obj) {
        String strEncode;
        String strEncode2;
        int i = this.q;
        ?? arrayList = cb0.e;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    List listI0 = ve.I0(dArr);
                    arrayList = new ArrayList(wq.G(listI0, 10));
                    Iterator it = listI0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it.next()).doubleValue()));
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(wq.G(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it2.next()).doubleValue()));
                    }
                }
                break;
            case 2:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        if (str != null) {
                            strEncode = Uri.encode(str, null);
                            strEncode.getClass();
                        } else {
                            strEncode = "null";
                        }
                        arrayList.add(strEncode);
                    }
                }
                break;
            default:
                List<String> list2 = (List) obj;
                if (list2 != null) {
                    arrayList = new ArrayList(wq.G(list2, 10));
                    for (String str2 : list2) {
                        if (str2 != null) {
                            strEncode2 = Uri.encode(str2, null);
                            strEncode2.getClass();
                        } else {
                            strEncode2 = "null";
                        }
                        arrayList.add(strEncode2);
                    }
                }
                break;
        }
        return arrayList;
    }
}
