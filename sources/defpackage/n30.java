package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n30 implements ej0 {
    public final /* synthetic */ int e;

    public /* synthetic */ n30(int i) {
        this.e = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        boolean z = true;
        switch (this.e) {
            case 0:
                w02.g((z02) obj);
                return ll2.a;
            case 1:
                return ll2.a;
            case 2:
                w02.e((z02) obj, 0);
                return ll2.a;
            case 3:
                return ll2.a;
            case 4:
                di0 di0Var = (di0) obj;
                di0Var.getClass();
                return Long.valueOf(di0Var.a.a);
            case 5:
                g22 g22Var = (g22) obj;
                g22Var.getClass();
                return Integer.valueOf(g22Var.d);
            case 6:
                g22 g22Var2 = (g22) obj;
                g22Var2.getClass();
                return Long.valueOf(g22Var2.a);
            case 7:
                g22 g22Var3 = (g22) obj;
                g22Var3.getClass();
                return Integer.valueOf(g22Var3.d);
            case 8:
                g22 g22Var4 = (g22) obj;
                g22Var4.getClass();
                return Long.valueOf(g22Var4.a);
            case 9:
                synchronized (x62.c) {
                    List list = x62.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((ej0) list.get(i)).h(obj);
                    }
                }
                return ll2.a;
            case 10:
                u22 u22Var = (u22) obj;
                u22Var.getClass();
                return Long.valueOf(u22Var.a);
            case 11:
                lm0 lm0Var = (lm0) obj;
                lm0Var.getClass();
                return Long.valueOf(lm0Var.a.a);
            case 12:
                ((l80) obj).getClass();
                return ll2.a;
            case 13:
                List list2 = (List) obj;
                list2.getClass();
                return "health-" + ((ul2) vq.Q(list2)).a.a;
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 15:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 16:
                char cCharValue = ((Character) obj).charValue();
                if (cCharValue != 'T' && cCharValue != 't') {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 18:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 19:
                char cCharValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= cCharValue2 && cCharValue2 < ':');
            case 20:
                es0 es0Var = (es0) obj;
                es0Var.getClass();
                return Long.valueOf(es0Var.a.a);
            case 21:
                bq bqVar = (bq) obj;
                bqVar.getClass();
                bq.a(bqVar, "JsonPrimitive", new mu0(new vr0(3)));
                bq.a(bqVar, "JsonNull", new mu0(new vr0(4)));
                bq.a(bqVar, "JsonLiteral", new mu0(new vr0(5)));
                bq.a(bqVar, "JsonObject", new mu0(new vr0(6)));
                bq.a(bqVar, "JsonArray", new mu0(new vr0(7)));
                return ll2.a;
            case 22:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                iu0 iu0Var = (iu0) entry.getValue();
                StringBuilder sb = new StringBuilder();
                f92.a(sb, str);
                sb.append(':');
                sb.append(iu0Var);
                return sb.toString();
            case 23:
                return ll2.a;
            case 24:
                List list3 = (List) obj;
                return new ry0(((Number) list3.get(0)).intValue(), ((Number) list3.get(1)).intValue());
            case 25:
                ((Integer) obj).getClass();
                return cb0.e;
            case 26:
                ((Integer) obj).getClass();
                return -1;
            case 27:
                ((Integer) obj).getClass();
                return null;
            case 28:
                return ll2.a;
            default:
                List list4 = (List) obj;
                return new q01(((Number) list4.get(0)).intValue(), ((Number) list4.get(1)).intValue());
        }
    }
}
