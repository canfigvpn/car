package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zb1 {
    public static final /* synthetic */ int i = 0;
    public final String e;
    public final pc f;
    public cc1 g;
    public final v72 h;

    static {
        new LinkedHashMap();
    }

    public zb1(qd1 qd1Var) {
        LinkedHashMap linkedHashMap = rd1.b;
        this.e = ix.C(qd1Var.getClass());
        pc pcVar = new pc();
        pcVar.b = this;
        pcVar.c = new ArrayList();
        pcVar.d = new LinkedHashMap();
        this.f = pcVar;
        this.h = new v72();
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((jb1) entry.getValue()).getClass();
            str.getClass();
        }
        if (bundle != null) {
            bundleW.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                jb1 jb1Var = (jb1) entry2.getValue();
                boolean z = jb1Var.d;
                xc1 xc1Var = jb1Var.a;
                if (!z) {
                    str2.getClass();
                    if (jb1Var.b || !bundleW.containsKey(str2) || !vv.D(str2, bundleW)) {
                        try {
                            xc1Var.a(str2, bundleW);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    qj.l("Wrong argument type for '", str2, "' in argument savedState. ", xc1Var.b(), " expected.");
                    return null;
                }
            }
        }
        return bundleW;
    }

    public final Map b() {
        return h61.h0((LinkedHashMap) this.f.d);
    }

    public yb1 c(ud udVar) {
        boolean zMatches;
        ls1 ls1Var;
        ud udVarA;
        pc pcVar = this.f;
        LinkedHashMap linkedHashMap = (LinkedHashMap) pcVar.d;
        Uri uri = (Uri) udVar.b;
        ArrayList arrayList = (ArrayList) pcVar.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        yb1 yb1Var = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xb1 xb1Var = (xb1) obj;
            xb1Var.getClass();
            hb2 hb2Var = xb1Var.d;
            if (((ls1) hb2Var.getValue()) == null) {
                zMatches = true;
            } else if (uri == null) {
                zMatches = false;
            } else {
                ls1 ls1Var2 = (ls1) hb2Var.getValue();
                ls1Var2.getClass();
                String string = uri.toString();
                string.getClass();
                zMatches = ls1Var2.e.matcher(string).matches();
            }
            if (zMatches) {
                Bundle bundleD = uri != null ? xb1Var.d(uri, linkedHashMap) : null;
                int iB = xb1Var.b(uri);
                String str = (String) udVar.c;
                boolean z = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z) {
                        Bundle bundleW = s5.w((qj1[]) Arrays.copyOf(new qj1[0], 0));
                        if (uri != null && (ls1Var = (ls1) hb2Var.getValue()) != null && (udVarA = ls1Var.a(uri.toString())) != null) {
                            xb1Var.e(udVarA, bundleW, linkedHashMap);
                            if (((Boolean) xb1Var.e.getValue()).booleanValue()) {
                                xb1Var.f(uri, bundleW, linkedHashMap);
                            }
                        }
                        if (mx.F(linkedHashMap, new vb1(bundleW, 1)).isEmpty()) {
                        }
                    }
                }
                yb1 yb1Var2 = new yb1((zb1) pcVar.b, bundleD, xb1Var.l, iB, z);
                if (yb1Var == null || yb1Var2.compareTo(yb1Var) > 0) {
                    yb1Var = yb1Var2;
                }
            }
        }
        return yb1Var;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof zb1)) {
                pc pcVar = this.f;
                ArrayList arrayList = (ArrayList) pcVar.c;
                zb1 zb1Var = (zb1) obj;
                v72 v72Var = zb1Var.h;
                pc pcVar2 = zb1Var.f;
                boolean zEquals = arrayList.equals((ArrayList) pcVar2.c);
                v72 v72Var2 = this.h;
                if (v72Var2.d() != v72Var.d()) {
                    z = false;
                    break;
                }
                Iterator it = ((qw) o12.s(new w72(v72Var2))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!ws0.j(s5.B(v72Var2, iIntValue), s5.B(v72Var, iIntValue))) {
                        z = false;
                        break;
                    }
                }
                if (b().size() != zb1Var.b().size()) {
                    z2 = false;
                    break;
                }
                Set setEntrySet = b().entrySet();
                setEntrySet.getClass();
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!zb1Var.b().containsKey(entry.getKey()) || !ws0.j(zb1Var.b().get(entry.getKey()), entry.getValue())) {
                        z2 = false;
                        break;
                    }
                }
                if (pcVar.a != pcVar2.a || !ws0.j((String) pcVar.e, (String) pcVar2.e) || !zEquals || !z || !z2) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        pc pcVar = this.f;
        int i2 = pcVar.a * 31;
        String str = (String) pcVar.e;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) pcVar.c;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            iHashCode = (((xb1) obj).a.hashCode() + (iHashCode * 31)) * 961;
        }
        v72 v72Var = this.h;
        v72Var.getClass();
        if (v72Var.d() > 0) {
            v72Var.e(0).getClass();
            fu1.c();
            return 0;
        }
        for (String str2 : b().keySet()) {
            int iE = k3.e(iHashCode * 31, 31, str2);
            Object obj2 = b().get(str2);
            iHashCode = iE + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(0x");
        pc pcVar = this.f;
        pcVar.getClass();
        sb.append(Integer.toHexString(pcVar.a));
        sb.append(")");
        String str = (String) pcVar.e;
        if (str != null && !h92.I(str)) {
            sb.append(" route=");
            sb.append((String) pcVar.e);
        }
        return sb.toString();
    }
}
