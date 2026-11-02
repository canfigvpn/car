package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ve extends p61 {
    public static List A0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length - 2;
        if (length < 0) {
            length = 0;
        }
        if (length < 0) {
            fu1.i("Requested element count ", length, " is less than zero.");
            return null;
        }
        if (length == 0) {
            return cb0.e;
        }
        int length2 = objArr.length;
        if (length >= length2) {
            return M0(objArr);
        }
        if (length == 1) {
            return vs0.u(objArr[length2 - 1]);
        }
        List listAsList = Arrays.asList(z0(objArr, length2 - length, length2));
        listAsList.getClass();
        return listAsList;
    }

    public static void B0(int i, int i2, Object obj, Object[] objArr) {
        objArr.getClass();
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void C0(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j);
    }

    public static ArrayList D0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static lr0 E0(int[] iArr) {
        return new lr0(0, iArr.length - 1, 1);
    }

    public static int F0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int G0(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static char H0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            fu1.k("Array is empty.");
            return (char) 0;
        }
        if (length == 1) {
            return cArr[0];
        }
        qj.r("Array has more than one element.");
        return (char) 0;
    }

    public static List I0(double[] dArr) {
        int length = dArr.length;
        if (length == 0) {
            return cb0.e;
        }
        if (length == 1) {
            return vs0.u(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static List J0(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return cb0.e;
        }
        if (length == 1) {
            return vs0.u(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static List K0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return cb0.e;
        }
        if (length == 1) {
            return vs0.u(Integer.valueOf(iArr[0]));
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static List L0(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return cb0.e;
        }
        if (length == 1) {
            return vs0.u(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List M0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return cb0.e;
        }
        if (length == 1) {
            return vs0.u(objArr[0]);
        }
        List listAsList = Arrays.asList(Arrays.copyOf(objArr, objArr.length));
        listAsList.getClass();
        return listAsList;
    }

    public static List N0(boolean[] zArr) {
        int length = zArr.length;
        if (length == 0) {
            return cb0.e;
        }
        if (length == 1) {
            return vs0.u(Boolean.valueOf(zArr[0]));
        }
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static Set O0(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return gb0.e;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            setSingleton.getClass();
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(h61.e0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean t0(int[] iArr, int i) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    public static void u0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void v0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void w0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void x0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        u0(i, 0, i2, iArr, iArr2);
    }

    public static /* synthetic */ void y0(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        w0(objArr, objArr2, 0, i, i2);
    }

    public static Object[] z0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 > length) {
            fu1.e(i2, length, ") is greater than size (", "toIndex (");
            return null;
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }
}
