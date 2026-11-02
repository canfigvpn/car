package defpackage;

import android.os.Bundle;
import ir.alirezaivaz.mygarage.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us implements rw1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ us(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rw1
    public final Bundle a() {
        qj1[] qj1VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                zs zsVar = ((MainActivity) obj).l;
                zsVar.getClass();
                LinkedHashMap linkedHashMap = zsVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(zsVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(zsVar.g));
                return bundle;
            case 1:
                Map mapE = ((hw1) obj).e();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapE.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                xf xfVar = (xf) obj;
                for (Map.Entry entry2 : h61.h0((LinkedHashMap) xfVar.h).entrySet()) {
                    xfVar.l(((s82) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : h61.h0((LinkedHashMap) xfVar.f).entrySet()) {
                    xfVar.l(((rw1) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) xfVar.e;
                if (linkedHashMap2.isEmpty()) {
                    qj1VarArr = new qj1[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new qj1((String) entry4.getKey(), entry4.getValue()));
                    }
                    qj1VarArr = (qj1[]) arrayList.toArray(new qj1[0]);
                }
                return s5.w((qj1[]) Arrays.copyOf(qj1VarArr, qj1VarArr.length));
        }
    }
}
