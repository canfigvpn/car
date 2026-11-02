package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dj extends uq {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj(int i, boolean z) {
        super(z);
        this.q = i;
    }

    public static int[] i(String str) {
        return new int[]{((Number) xc1.b.d(str)).intValue()};
    }

    public static long[] j(String str) {
        return new long[]{((Number) xc1.e.d(str)).longValue()};
    }

    public static boolean[] k(String str) {
        return new boolean[]{((Boolean) xc1.k.d(str)).booleanValue()};
    }

    @Override // defpackage.xc1
    public final Object a(String str, Bundle bundle) {
        switch (this.q) {
            case 0:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                rw.C(str);
                throw null;
            case 1:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return ve.N0(booleanArray2);
                }
                rw.C(str);
                throw null;
            case 2:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                rw.C(str);
                throw null;
            case 3:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return ve.J0(floatArray2);
                }
                rw.C(str);
                throw null;
            case 4:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                rw.C(str);
                throw null;
            case 5:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return ve.K0(intArray2);
                }
                rw.C(str);
                throw null;
            case 6:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                rw.C(str);
                throw null;
            case 7:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return ve.L0(longArray2);
                }
                rw.C(str);
                throw null;
            case 8:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                return vv.y(str, bundle);
            default:
                if (!k3.w(bundle, str, str) || vv.D(str, bundle)) {
                    return null;
                }
                return ve.M0(vv.y(str, bundle));
        }
    }

    @Override // defpackage.xc1
    public final String b() {
        switch (this.q) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case 2:
                return "float[]";
            case 3:
                return "List<Float>";
            case 4:
                return "integer[]";
            case 5:
                return "List<Int>";
            case 6:
                return "long[]";
            case 7:
                return "List<Long>";
            case 8:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // defpackage.xc1
    public final Object c(Object obj, String str) {
        switch (this.q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return k(str);
                }
                boolean[] zArrK = k(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrK, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 1:
                List list = (List) obj;
                ej ejVar = xc1.k;
                return list != null ? vq.a0(list, vs0.u(ejVar.d(str))) : vs0.u(ejVar.d(str));
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case 3:
                List list2 = (List) obj;
                return list2 != null ? vq.a0(list2, vs0.u(Float.valueOf(Float.parseFloat(str)))) : vs0.u(Float.valueOf(Float.parseFloat(str)));
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return i(str);
                }
                int[] iArrI = i(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrI, 0, iArrCopyOf, length3, 1);
                return iArrCopyOf;
            case 5:
                List list3 = (List) obj;
                ej ejVar2 = xc1.b;
                return list3 != null ? vq.a0(list3, vs0.u(ejVar2.d(str))) : vs0.u(ejVar2.d(str));
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return j(str);
                }
                long[] jArrJ = j(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrJ, 0, jArrCopyOf, length4, 1);
                return jArrCopyOf;
            case 7:
                List list4 = (List) obj;
                ej ejVar3 = xc1.e;
                return list4 != null ? vq.a0(list4, vs0.u(ejVar3.d(str))) : vs0.u(ejVar3.d(str));
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, objArrCopyOf, length5, 1);
                return (String[]) objArrCopyOf;
            default:
                List list5 = (List) obj;
                return list5 != null ? vq.a0(list5, vs0.u(str)) : vs0.u(str);
        }
    }

    @Override // defpackage.xc1
    public final Object d(String str) {
        switch (this.q) {
            case 0:
                return k(str);
            case 1:
                return vs0.u(xc1.k.d(str));
            case 2:
                return new float[]{Float.parseFloat(str)};
            case 3:
                return vs0.u(Float.valueOf(Float.parseFloat(str)));
            case 4:
                return i(str);
            case 5:
                return vs0.u(xc1.b.d(str));
            case 6:
                return j(str);
            case 7:
                return vs0.u(xc1.e.d(str));
            case 8:
                return new String[]{str};
            default:
                return vs0.u(str);
        }
    }

    @Override // defpackage.xc1
    public final void e(Bundle bundle, String str, Object obj) {
        int i = 0;
        switch (this.q) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                List list = (List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, vq.e0(list));
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case 3:
                List list2 = (List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                } else {
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        fArr2[i] = ((Number) it.next()).floatValue();
                        i++;
                    }
                    bundle.putFloatArray(str, fArr2);
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case 5:
                List list3 = (List) obj;
                str.getClass();
                if (list3 != null) {
                    bundle.putIntArray(str, vq.g0(list3));
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            case 7:
                List list4 = (List) obj;
                str.getClass();
                if (list4 == null) {
                    bundle.putString(str, null);
                } else {
                    long[] jArr2 = new long[list4.size()];
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        jArr2[i] = ((Number) it2.next()).longValue();
                        i++;
                    }
                    bundle.putLongArray(str, jArr2);
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
            default:
                List list5 = (List) obj;
                str.getClass();
                if (list5 == null) {
                    bundle.putString(str, null);
                } else {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
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
                return new boolean[0];
            case 1:
                return cb0Var;
            case 2:
                return new float[0];
            case 3:
                return cb0Var;
            case 4:
                return new int[0];
            case 5:
                return cb0Var;
            case 6:
                return new long[0];
            case 7:
                return cb0Var;
            case 8:
                return new String[0];
            default:
                return cb0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [cb0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
    @Override // defpackage.uq
    public final List h(Object obj) {
        int i = this.q;
        ?? arrayList = cb0.e;
        switch (i) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    List listN0 = ve.N0(zArr);
                    arrayList = new ArrayList(wq.G(listN0, 10));
                    Iterator it = listN0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
                    }
                }
                break;
            case 1:
                List list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(wq.G(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
                    }
                }
                break;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    List listJ0 = ve.J0(fArr);
                    arrayList = new ArrayList(wq.G(listJ0, 10));
                    Iterator it3 = listJ0.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it3.next()).floatValue()));
                    }
                }
                break;
            case 3:
                List list2 = (List) obj;
                if (list2 != null) {
                    arrayList = new ArrayList(wq.G(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it4.next()).floatValue()));
                    }
                }
                break;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    List listK0 = ve.K0(iArr);
                    arrayList = new ArrayList(wq.G(listK0, 10));
                    Iterator it5 = listK0.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it5.next()).intValue()));
                    }
                }
                break;
            case 5:
                List list3 = (List) obj;
                if (list3 != null) {
                    arrayList = new ArrayList(wq.G(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it6.next()).intValue()));
                    }
                }
                break;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    List listL0 = ve.L0(jArr);
                    arrayList = new ArrayList(wq.G(listL0, 10));
                    Iterator it7 = listL0.iterator();
                    while (it7.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it7.next()).longValue()));
                    }
                }
                break;
            case 7:
                List list4 = (List) obj;
                if (list4 != null) {
                    arrayList = new ArrayList(wq.G(list4, 10));
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(String.valueOf(((Number) it8.next()).longValue()));
                    }
                }
                break;
            case 8:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    arrayList = new ArrayList(strArr.length);
                    for (String str : strArr) {
                        str.getClass();
                        String strEncode = Uri.encode(str, null);
                        strEncode.getClass();
                        arrayList.add(strEncode);
                    }
                }
                break;
            default:
                List<String> list5 = (List) obj;
                if (list5 != null) {
                    arrayList = new ArrayList(wq.G(list5, 10));
                    for (String str2 : list5) {
                        str2.getClass();
                        String strEncode2 = Uri.encode(str2, null);
                        strEncode2.getClass();
                        arrayList.add(strEncode2);
                    }
                }
                break;
        }
        return arrayList;
    }
}
