package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi1 implements ej0 {
    public final /* synthetic */ int e;

    public /* synthetic */ xi1(int i) {
        this.e = i;
    }

    /* JADX WARN: Code duplicated, block: B:201:0x04e1  */
    @Override // defpackage.ej0
    public final Object h(Object obj) {
        String str;
        dr drVar;
        Object objH = null;
        kf2Var = null;
        kf2 kf2Var = null;
        kf2Var = null;
        kf2 kf2Var2 = null;
        r72Var = null;
        r72 r72Var = null;
        int i = 0;
        switch (this.e) {
            case 0:
                sl1 sl1Var = (sl1) obj;
                int i2 = u7.a;
                a90 a90Var = u5.b;
                sl1Var.getClass();
                Context context = (Context) vv.N(sl1Var, a90Var);
                m40 m40Var = (m40) vv.N(sl1Var, yv.h);
                vi1 vi1Var = (vi1) vv.N(sl1Var, wi1.a);
                if (vi1Var == null) {
                    return null;
                }
                return new w6(context, m40Var, vi1Var.a, vi1Var.b);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            case 2:
                Context context2 = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                while (i < size) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context2.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                    i++;
                }
                return arrayList;
            case 3:
                da1 da1Var = (da1) obj;
                if (!(da1Var instanceof b72)) {
                    qj.r("Failed requirement.");
                    return null;
                }
                b72 b72Var = (b72) da1Var;
                if (b72Var.getValue() != null) {
                    Object value = b72Var.getValue();
                    value.getClass();
                    objH = ((ej0) te2.d.c).h(value);
                }
                d72 d72VarE = b72Var.e();
                d72VarE.getClass();
                return new dk1(objH, d72VarE);
            case 4:
                ((c00) obj).getClass();
                throw new we1(0);
            case 5:
                return new fw1((Map) obj);
            case 6:
                return obj;
            case 7:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                ej0 ej0Var = (ej0) ax1.i.c;
                Boolean bool = Boolean.FALSE;
                r72 r72Var2 = (ws0.j(obj2, bool) || obj2 == null) ? null : (r72) ej0Var.h(obj2);
                Object obj3 = list.get(1);
                r72 r72Var3 = (ws0.j(obj3, bool) || obj3 == null) ? null : (r72) ej0Var.h(obj3);
                Object obj4 = list.get(2);
                r72 r72Var4 = (ws0.j(obj4, bool) || obj4 == null) ? null : (r72) ej0Var.h(obj4);
                Object obj5 = list.get(3);
                if (!ws0.j(obj5, bool) && obj5 != null) {
                    r72Var = (r72) ej0Var.h(obj5);
                }
                return new kf2(r72Var2, r72Var3, r72Var4, r72Var);
            case 8:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (ws0.j(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((ej0) ax1.b.c).h(obj6);
                Object obj7 = list2.get(0);
                String str2 = obj7 != null ? (String) obj7 : null;
                str2.getClass();
                return new yb(list3, str2);
            case 9:
                obj.getClass();
                return new ed2(((Integer) obj).intValue());
            case 10:
                obj.getClass();
                List list4 = (List) obj;
                return new we2(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 11:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                zf2[] zf2VarArr = yf2.b;
                ej0 ej0Var2 = ax1.x.b;
                Boolean bool2 = Boolean.FALSE;
                ws0.j(obj8, bool2);
                yf2 yf2Var = obj8 != null ? (yf2) ej0Var2.h(obj8) : null;
                yf2Var.getClass();
                long j = yf2Var.a;
                Object obj9 = list5.get(1);
                ws0.j(obj9, bool2);
                yf2 yf2Var2 = obj9 != null ? (yf2) ej0Var2.h(obj9) : null;
                yf2Var2.getClass();
                return new xe2(j, yf2Var2.a);
            case 12:
                obj.getClass();
                return new lh0(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                return new th(((Float) obj).floatValue());
            case 14:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new of2(j02.c(iIntValue, num2.intValue()));
            case 15:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i3 = dr.h;
                Boolean bool3 = Boolean.FALSE;
                ws0.j(obj12, bool3);
                if (obj12 != null) {
                    drVar = ws0.j(obj12, Boolean.FALSE) ? new dr(dr.g) : new dr(ws0.c(((Integer) obj12).intValue()));
                } else {
                    drVar = null;
                }
                drVar.getClass();
                long j2 = drVar.a;
                Object obj13 = list7.get(1);
                zw1 zw1Var = ax1.z;
                ws0.j(obj13, bool3);
                uf1 uf1Var = obj13 != null ? (uf1) zw1Var.b.h(obj13) : null;
                uf1Var.getClass();
                long j3 = uf1Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new q32(j2, j3, f.floatValue());
            case 16:
                obj.getClass();
                return new gc2(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str3 = obj15 != null ? (String) obj15 : null;
                str3.getClass();
                Object obj16 = list8.get(1);
                ru1 ru1Var = ax1.j;
                if (!ws0.j(obj16, Boolean.FALSE) && obj16 != null) {
                    kf2Var2 = (kf2) ((ej0) ru1Var.c).h(obj16);
                }
                return new v21(str3, kf2Var2);
            case 18:
                obj.getClass();
                return new hd2(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                return new yn0(((Integer) obj).intValue());
            case 20:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    Object obj17 = list9.get(i);
                    xb xbVar = (ws0.j(obj17, Boolean.FALSE) || obj17 == null) ? null : (xb) ((ej0) ax1.c.c).h(obj17);
                    xbVar.getClass();
                    arrayList2.add(xbVar);
                    i++;
                }
                return arrayList2;
            case 21:
                obj.getClass();
                return new hh0(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                return new ih0(((Integer) obj).intValue());
            case 23:
                Boolean bool4 = Boolean.FALSE;
                if (ws0.j(obj, bool4)) {
                    return new yf2(yf2.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                zw1 zw1Var2 = ax1.y;
                ws0.j(obj19, bool4);
                zf2 zf2Var = obj19 != null ? (zf2) zw1Var2.b.h(obj19) : null;
                zf2Var.getClass();
                return new yf2(r02.o(fFloatValue, zf2Var.a));
            case 24:
                if (ws0.j(obj, 0)) {
                    return new zf2(8589934592L);
                }
                return ws0.j(obj, 1) ? new zf2(4294967296L) : new zf2(0L);
            case 25:
                if (ws0.j(obj, Boolean.FALSE)) {
                    return new uf1(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new uf1((((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
            case 26:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList3 = new ArrayList(list12.size());
                int size3 = list12.size();
                while (i < size3) {
                    Object obj22 = list12.get(i);
                    p31 p31Var = (ws0.j(obj22, Boolean.FALSE) || obj22 == null) ? null : (p31) ((ej0) ax1.B.c).h(obj22);
                    p31Var.getClass();
                    arrayList3.add(p31Var);
                    i++;
                }
                return new q31(arrayList3);
            case 27:
                obj.getClass();
                String str4 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str4);
                if (ws0.j(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str4 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new p31(localeForLanguageTag);
            case 28:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str5 = obj23 != null ? (String) obj23 : null;
                str5.getClass();
                Object obj24 = list13.get(1);
                ru1 ru1Var2 = ax1.j;
                if (!ws0.j(obj24, Boolean.FALSE) && obj24 != null) {
                    kf2Var = (kf2) ((ej0) ru1Var2.c).h(obj24);
                }
                return new u21(str5, kf2Var);
            default:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = l21.b;
                zw1 zw1Var3 = ax1.D;
                Boolean bool5 = Boolean.FALSE;
                ws0.j(obj25, bool5);
                l21 l21Var = obj25 != null ? (l21) zw1Var3.b.h(obj25) : null;
                l21Var.getClass();
                float f6 = l21Var.a;
                Object obj26 = list14.get(1);
                zw1 zw1Var4 = ax1.E;
                ws0.j(obj26, bool5);
                n21 n21Var = obj26 != null ? (n21) zw1Var4.b.h(obj26) : null;
                n21Var.getClass();
                int i4 = n21Var.a;
                Object obj27 = list14.get(2);
                zw1 zw1Var5 = ax1.F;
                ws0.j(obj27, bool5);
                m21 m21Var = obj27 != null ? (m21) zw1Var5.b.h(obj27) : null;
                m21Var.getClass();
                return new o21(f6, i4, m21Var.a);
        }
    }

    public /* synthetic */ xi1(int i, Object obj) {
        this.e = i;
    }
}
