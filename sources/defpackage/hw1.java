package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hw1 implements gw1 {
    public final ej0 e;
    public final w91 f;
    public w91 g;

    public hw1(Map map, ej0 ej0Var) {
        w91 w91Var;
        this.e = ej0Var;
        if (map == null || map.isEmpty()) {
            w91Var = null;
        } else {
            w91Var = new w91(map.size());
            for (Map.Entry entry : map.entrySet()) {
                w91Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f = w91Var;
    }

    @Override // defpackage.gw1
    public final ud a(String str, ti0 ti0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!j20.x(str.charAt(i))) {
                w91 w91Var = this.g;
                if (w91Var == null) {
                    long[] jArr = jx1.a;
                    w91Var = new w91();
                    this.g = w91Var;
                }
                Object objG = w91Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    w91Var.m(str, objG);
                }
                ((List) objG).add(ti0Var);
                return new ud(w91Var, str, ti0Var, 14);
            }
        }
        qj.r("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.gw1
    public final boolean d(Object obj) {
        return ((Boolean) this.e.h(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    @Override // defpackage.gw1
    public final Map e() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        w91 w91Var = this.f;
        if (w91Var == null && this.g == null) {
            return db0.e;
        }
        int i3 = 0;
        int i4 = w91Var != null ? w91Var.e : 0;
        w91 w91Var2 = this.g;
        HashMap map = new HashMap(i4 + (w91Var2 != null ? w91Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (w91Var != null) {
            Object[] objArr = w91Var.b;
            Object[] objArr2 = w91Var.c;
            long[] jArr3 = w91Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        w91 w91Var3 = this.g;
        if (w91Var3 != null) {
            Object[] objArr3 = w91Var3.b;
            Object[] objArr4 = w91Var3.c;
            long[] jArr4 = w91Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objA = ((ti0) list.get(i3)).a();
                                    if (objA != null) {
                                        if (!d(objA)) {
                                            throw new IllegalStateException(ex.s(objA).toString());
                                        }
                                        map.put(str, vs0.g(objA));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objA2 = ((ti0) list.get(i3)).a();
                                        if (objA2 != null && !d(objA2)) {
                                            throw new IllegalStateException(ex.s(objA2).toString());
                                        }
                                        arrayList.add(objA2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.gw1
    public final Object f(String str) {
        w91 w91Var = this.f;
        List list = w91Var != null ? (List) w91Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && w91Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = w91Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = w91Var.c;
            Object obj = objArr[iF];
            w91Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
