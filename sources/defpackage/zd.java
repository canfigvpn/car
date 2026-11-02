package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zd implements wq1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ zd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0295 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0298 A[LOOP:7: B:97:0x0286->B:102:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:103:0x029a  */
    /* JADX WARN: Code duplicated, block: B:105:0x029d A[LOOP:6: B:93:0x0273->B:105:0x029d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:8: B:109:0x02c7->B:113:0x02d0, LOOP_START, PHI: r2
  0x02c7: PHI (r2v37 int) = (r2v25 int), (r2v39 int) binds: [B:108:0x02c5, B:113:0x02d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x02cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02d0 A[LOOP:8: B:109:0x02c7->B:113:0x02d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0300  */
    /* JADX WARN: Code duplicated, block: B:120:0x031a  */
    /* JADX WARN: Code duplicated, block: B:122:0x032f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0335  */
    /* JADX WARN: Code duplicated, block: B:125:0x0337 A[LOOP:10: B:125:0x0337->B:130:0x0340, LOOP_START, PHI: r1
  0x0337: PHI (r1v14 ia2) = (r1v13 ia2), (r1v16 ia2) binds: [B:123:0x0333, B:130:0x0340] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x033c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0340 A[LOOP:10: B:125:0x0337->B:130:0x0340, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x034d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0353  */
    /* JADX WARN: Code duplicated, block: B:136:0x0355 A[LOOP:9: B:136:0x0355->B:141:0x035e, LOOP_START, PHI: r1
  0x0355: PHI (r1v22 ia2) = (r1v21 ia2), (r1v24 ia2) binds: [B:134:0x0351, B:141:0x035e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x035a  */
    /* JADX WARN: Code duplicated, block: B:141:0x035e A[LOOP:9: B:136:0x0355->B:141:0x035e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x036c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0370  */
    /* JADX WARN: Code duplicated, block: B:147:0x0374  */
    /* JADX WARN: Code duplicated, block: B:149:0x037a  */
    /* JADX WARN: Code duplicated, block: B:183:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0353 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    /* JADX WARN: Code duplicated, block: B:87:0x0217  */
    /* JADX WARN: Code duplicated, block: B:92:0x025d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0279  */
    /* JADX WARN: Code duplicated, block: B:97:0x0286 A[LOOP:7: B:97:0x0286->B:102:0x0298, LOOP_START, PHI: r11
  0x0286: PHI (r11v8 int) = (r11v4 int), (r11v9 int) binds: [B:96:0x0284, B:102:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x0217, please report this as an issue */
    @Override // defpackage.wq1
    public final Object get() {
        Object obj;
        String name;
        z90 z90VarD;
        List list;
        boolean[] zArr;
        int size;
        Executor executor;
        uy uyVar;
        wh2 wh2Var;
        t61 t61Var;
        ia2 ia2VarB;
        t61 t61Var2;
        ia2 ia2VarB2;
        int i;
        aq aqVar;
        int size2;
        int i2;
        int i3;
        int i4;
        LinkedHashMap linkedHashMap;
        boolean zContainsKey;
        Integer numValueOf;
        Object treeMap;
        TreeMap treeMap2;
        Map map;
        int i5 = this.a;
        Object obj2 = this.b;
        switch (i5) {
            case 0:
                return ((b7) obj2).a;
            case 1:
                Context context = ((b7) ((zd) obj2).b).a;
                if (!h92.I("mygarage.db")) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    qp0 qp0Var = new qp0(2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    ArrayList arrayList3 = new ArrayList();
                    aq aqVarA = js1.a(MyGarageDatabase.class);
                    arrayList.add(MyGarageDatabase.l);
                    if (!linkedHashSet2.isEmpty()) {
                        Iterator it = linkedHashSet2.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                qj.f(k3.i("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", iIntValue));
                                return null;
                            }
                        }
                    }
                    w40 w40Var = new w40(9);
                    obj = null;
                    Object systemService = context.getSystemService("activity");
                    ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                    av1 av1Var = (activityManager == null || activityManager.isLowRamDevice()) ? av1.e : av1.f;
                    ce ceVar = de.d;
                    c00 c00Var = new c00(context, "mygarage.db", w40Var, qp0Var, arrayList, false, av1Var, ceVar, ceVar, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
                    Class clsQ = vv.q(aqVarA);
                    Package r3 = clsQ.getPackage();
                    if (r3 == null || (name = r3.getName()) == null) {
                        name = "";
                    }
                    String canonicalName = clsQ.getCanonicalName();
                    canonicalName.getClass();
                    if (name.length() != 0) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    String strReplace = canonicalName.replace('.', '_');
                    strReplace.getClass();
                    String strConcat = strReplace.concat("_Impl");
                    try {
                        Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsQ.getClassLoader());
                        cls.getClass();
                        bv1 bv1Var = (bv1) cls.getDeclaredConstructor(null).newInstance(null);
                        bv1Var.getClass();
                        bv1Var.k = true;
                        try {
                            z90VarD = bv1Var.d();
                            z90VarD.getClass();
                        } catch (we1 unused) {
                            z90VarD = null;
                        }
                        if (z90VarD == null) {
                            new t61(c00Var, new xi1(4, bv1Var), new fg0(2, bv1Var, dv1.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 2));
                            throw null;
                        }
                        bv1Var.e = new t61(c00Var, z90VarD, new fg0(2, bv1Var, dv1.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 3));
                        bv1Var.f = bv1Var.c();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Set setG = bv1Var.g();
                        List list2 = c00Var.n;
                        int size3 = list2.size();
                        boolean[] zArr2 = new boolean[size3];
                        Iterator it2 = setG.iterator();
                        while (true) {
                            int i6 = -1;
                            if (!it2.hasNext()) {
                                int size4 = list2.size() - 1;
                                if (size4 < 0) {
                                    for (wa1 wa1Var : bv1Var.b(linkedHashMap2)) {
                                        i3 = wa1Var.a;
                                        i4 = wa1Var.b;
                                        linkedHashMap = c00Var.d.a;
                                        if (linkedHashMap.containsKey(Integer.valueOf(i3))) {
                                            map = (Map) linkedHashMap.get(Integer.valueOf(i3));
                                            if (map == null) {
                                                map = db0.e;
                                            }
                                            zContainsKey = map.containsKey(Integer.valueOf(i4));
                                        } else {
                                            zContainsKey = false;
                                        }
                                        if (zContainsKey) {
                                            numValueOf = Integer.valueOf(wa1Var.a);
                                            treeMap = linkedHashMap.get(numValueOf);
                                            if (treeMap == null) {
                                                treeMap = new TreeMap();
                                                linkedHashMap.put(numValueOf, treeMap);
                                            }
                                            treeMap2 = (TreeMap) treeMap;
                                            if (treeMap2.containsKey(Integer.valueOf(i4))) {
                                                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i4)) + " with " + wa1Var);
                                            }
                                            treeMap2.put(Integer.valueOf(i4), wa1Var);
                                        }
                                    }
                                    LinkedHashMap linkedHashMapH = bv1Var.h();
                                    list = c00Var.m;
                                    zArr = new boolean[list.size()];
                                    for (Map.Entry entry : linkedHashMapH.entrySet()) {
                                        aqVar = (aq) entry.getKey();
                                        for (aq aqVar2 : (List) entry.getValue()) {
                                            size2 = list.size() - 1;
                                            if (size2 >= 0) {
                                                while (true) {
                                                    i2 = size2 - 1;
                                                    if (aqVar2.d(list.get(size2))) {
                                                        zArr[size2] = true;
                                                    } else if (i2 < 0) {
                                                        size2 = -1;
                                                    } else {
                                                        size2 = i2;
                                                    }
                                                }
                                            } else {
                                                size2 = -1;
                                            }
                                            if (size2 >= 0) {
                                                Object obj3 = list.get(size2);
                                                aqVar2.getClass();
                                                obj3.getClass();
                                                bv1Var.j.put(aqVar2, obj3);
                                            } else {
                                                qj.l("A required type converter (", aqVar2.b(), ") for ", aqVar.b(), " is missing in the database configuration.");
                                            }
                                        }
                                    }
                                    size = list.size() - 1;
                                    if (size >= 0) {
                                        while (true) {
                                            i = size - 1;
                                            if (zArr[size]) {
                                                throw new IllegalArgumentException("Unexpected type converter " + list.get(size) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i < 0) {
                                                size = i;
                                            }
                                        }
                                    }
                                    bv1Var.c = c00Var.h;
                                    bv1Var.d = new wh2(c00Var.i);
                                    executor = bv1Var.c;
                                    if (executor != null) {
                                        ws0.U("internalQueryExecutor");
                                        throw null;
                                    }
                                    rx rxVarB = qx.b(ex.F(new jc0(executor), new ga2(null)));
                                    bv1Var.a = rxVarB;
                                    uyVar = rxVarB.e;
                                    wh2Var = bv1Var.d;
                                    if (wh2Var != null) {
                                        ws0.U("internalTransactionExecutor");
                                        throw null;
                                    }
                                    bv1Var.b = uyVar.k(new jc0(wh2Var));
                                    bv1Var.h = c00Var.f;
                                    t61Var = bv1Var.e;
                                    if (t61Var != null) {
                                        ws0.U("connectionManager");
                                        throw null;
                                    }
                                    ia2VarB = (ia2) t61Var.g;
                                    if (ia2VarB == null) {
                                        ia2VarB = null;
                                    } else {
                                        while (!(ia2VarB instanceof zo1)) {
                                            if (ia2VarB instanceof d40) {
                                                ia2VarB = ((d40) ia2VarB).b();
                                            } else {
                                                ia2VarB = null;
                                            }
                                        }
                                    }
                                    t61Var2 = bv1Var.e;
                                    if (t61Var2 != null) {
                                        ws0.U("connectionManager");
                                        throw null;
                                    }
                                    ia2VarB2 = (ia2) t61Var2.g;
                                    if (ia2VarB2 == null) {
                                        ia2VarB2 = null;
                                    } else {
                                        while (!(ia2VarB2 instanceof hf)) {
                                            if (ia2VarB2 instanceof d40) {
                                                ia2VarB2 = ((d40) ia2VarB2).b();
                                            } else {
                                                ia2VarB2 = null;
                                            }
                                        }
                                    }
                                    return (MyGarageDatabase) bv1Var;
                                }
                                while (true) {
                                    int i7 = size4 - 1;
                                    if (size4 >= size3 || !zArr2[size4]) {
                                        qj.r("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    } else if (i7 >= 0) {
                                        size4 = i7;
                                    }
                                }
                                while (r2.hasNext()) {
                                    i3 = wa1Var.a;
                                    i4 = wa1Var.b;
                                    linkedHashMap = c00Var.d.a;
                                    if (linkedHashMap.containsKey(Integer.valueOf(i3))) {
                                        map = (Map) linkedHashMap.get(Integer.valueOf(i3));
                                        if (map == null) {
                                            map = db0.e;
                                        }
                                        zContainsKey = map.containsKey(Integer.valueOf(i4));
                                    } else {
                                        zContainsKey = false;
                                    }
                                    if (zContainsKey) {
                                        numValueOf = Integer.valueOf(wa1Var.a);
                                        treeMap = linkedHashMap.get(numValueOf);
                                        if (treeMap == null) {
                                            treeMap = new TreeMap();
                                            linkedHashMap.put(numValueOf, treeMap);
                                        }
                                        treeMap2 = (TreeMap) treeMap;
                                        if (treeMap2.containsKey(Integer.valueOf(i4))) {
                                            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i4)) + " with " + wa1Var);
                                        }
                                        treeMap2.put(Integer.valueOf(i4), wa1Var);
                                    }
                                }
                                LinkedHashMap linkedHashMapH2 = bv1Var.h();
                                list = c00Var.m;
                                zArr = new boolean[list.size()];
                                while (r2.hasNext()) {
                                    aqVar = (aq) entry.getKey();
                                    while (r5.hasNext()) {
                                        size2 = list.size() - 1;
                                        if (size2 >= 0) {
                                            while (true) {
                                                i2 = size2 - 1;
                                                if (aqVar2.d(list.get(size2))) {
                                                    zArr[size2] = true;
                                                } else if (i2 < 0) {
                                                    size2 = -1;
                                                } else {
                                                    size2 = i2;
                                                }
                                            }
                                        } else {
                                            size2 = -1;
                                        }
                                        if (size2 >= 0) {
                                            Object obj4 = list.get(size2);
                                            aqVar2.getClass();
                                            obj4.getClass();
                                            bv1Var.j.put(aqVar2, obj4);
                                        } else {
                                            qj.l("A required type converter (", aqVar2.b(), ") for ", aqVar.b(), " is missing in the database configuration.");
                                        }
                                    }
                                }
                                size = list.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        i = size - 1;
                                        if (zArr[size]) {
                                            throw new IllegalArgumentException("Unexpected type converter " + list.get(size) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        }
                                        if (i < 0) {
                                            size = i;
                                        }
                                    }
                                }
                                bv1Var.c = c00Var.h;
                                bv1Var.d = new wh2(c00Var.i);
                                executor = bv1Var.c;
                                if (executor != null) {
                                    ws0.U("internalQueryExecutor");
                                    throw null;
                                }
                                rx rxVarB2 = qx.b(ex.F(new jc0(executor), new ga2(null)));
                                bv1Var.a = rxVarB2;
                                uyVar = rxVarB2.e;
                                wh2Var = bv1Var.d;
                                if (wh2Var != null) {
                                    ws0.U("internalTransactionExecutor");
                                    throw null;
                                }
                                bv1Var.b = uyVar.k(new jc0(wh2Var));
                                bv1Var.h = c00Var.f;
                                t61Var = bv1Var.e;
                                if (t61Var != null) {
                                    ws0.U("connectionManager");
                                    throw null;
                                }
                                ia2VarB = (ia2) t61Var.g;
                                if (ia2VarB == null) {
                                    ia2VarB = null;
                                } else {
                                    while (!(ia2VarB instanceof zo1)) {
                                        if (ia2VarB instanceof d40) {
                                            ia2VarB = ((d40) ia2VarB).b();
                                        } else {
                                            ia2VarB = null;
                                        }
                                    }
                                }
                                t61Var2 = bv1Var.e;
                                if (t61Var2 != null) {
                                    ws0.U("connectionManager");
                                    throw null;
                                }
                                ia2VarB2 = (ia2) t61Var2.g;
                                if (ia2VarB2 == null) {
                                    ia2VarB2 = null;
                                } else {
                                    while (!(ia2VarB2 instanceof hf)) {
                                        if (ia2VarB2 instanceof d40) {
                                            ia2VarB2 = ((d40) ia2VarB2).b();
                                        } else {
                                            ia2VarB2 = null;
                                        }
                                    }
                                }
                                return (MyGarageDatabase) bv1Var;
                            }
                            aq aqVar3 = (aq) it2.next();
                            int size5 = list2.size() - 1;
                            if (size5 >= 0) {
                                while (true) {
                                    int i8 = size5 - 1;
                                    if (aqVar3.d(list2.get(size5))) {
                                        zArr2[size5] = true;
                                        i6 = size5;
                                    } else if (i8 >= 0) {
                                        size5 = i8;
                                    }
                                }
                            }
                            if (i6 >= 0) {
                                linkedHashMap2.put(aqVar3, list2.get(i6));
                            } else {
                                fu1.f(aqVar3.b(), ") is missing in the database configuration.", "A required auto migration spec (");
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        throw new RuntimeException("Cannot find implementation for " + clsQ.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException("Cannot access the constructor " + clsQ.getCanonicalName(), e2);
                    } catch (InstantiationException e3) {
                        throw new RuntimeException("Failed to create an instance of " + clsQ.getCanonicalName(), e3);
                    }
                    break;
                } else {
                    obj = null;
                    qj.r("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                }
                return obj;
            default:
                return obj2;
        }
    }
}
