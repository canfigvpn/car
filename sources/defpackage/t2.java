package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import ir.alirezaivaz.mygarage.MainActivity;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements yn2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ t2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yn2
    public final un2 b(Class cls, a91 a91Var) {
        Application application;
        un2 un2Var;
        un2 un2Var2;
        wn2 wn2Var;
        ej0 ej0Var;
        int i = 0;
        switch (this.a) {
            case 0:
                dv dvVar = new dv(a91Var);
                Context applicationContext = ((MainActivity) this.b).getApplicationContext();
                if (!(applicationContext instanceof Application)) {
                    Context baseContext = applicationContext;
                    while (baseContext instanceof ContextWrapper) {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        if (baseContext instanceof Application) {
                            application = (Application) baseContext;
                        }
                    }
                    throw new IllegalStateException("Could not find an Application in the given context: " + applicationContext);
                }
                application = (Application) applicationContext;
                return new v2(new yz(((zz) ((u2) ux.q(application, u2.class))).a), dvVar);
            case 1:
                final yt1 yt1Var = new yt1();
                ao2 ao2Var = (ao2) this.b;
                kw1 kw1VarW = sv0.W(a91Var);
                zz zzVar = (zz) ao2Var.f;
                a00 a00Var = new a00();
                a00Var.a = new qh(zzVar.g, i);
                int i2 = 2;
                zd zdVar = new zd(i2, kw1VarW);
                wq1 wq1Var = zzVar.h;
                wq1 wq1Var2 = zzVar.e;
                a00Var.b = new ri0(wq1Var, wq1Var2, zdVar, i2);
                int i3 = 1;
                a00Var.c = new wn(wq1Var, wq1Var2, i3);
                wq1 wq1Var3 = zzVar.i;
                a00Var.d = new ri0(wq1Var, wq1Var3, wq1Var2, i);
                a00Var.e = new ri0(wq1Var, wq1Var3, wq1Var2, i3);
                wq1 wq1Var4 = zzVar.d;
                wq1 wq1Var5 = zzVar.f;
                a00Var.f = new yg(wq1Var, wq1Var3, wq1Var2, wq1Var4, wq1Var5, 1);
                a00Var.g = new wn(wq1Var3, zdVar, 3);
                a00Var.h = new g41(wq1Var3, wq1Var, wq1Var5, zdVar);
                a00Var.i = new qh(wq1Var, i3);
                a00Var.j = new qh(wq1Var4, 4);
                a00 a00Var2 = (a00) ((gm0) ux.q(a00Var, gm0.class));
                a00Var2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(14);
                linkedHashMap.put("ph", a00Var2.a);
                linkedHashMap.put("mn", a00Var2.b);
                linkedHashMap.put("ao", a00Var2.c);
                linkedHashMap.put("qi0", a00Var2.d);
                linkedHashMap.put("rm0", a00Var2.e);
                linkedHashMap.put("ln0", a00Var2.f);
                linkedHashMap.put("ls0", a00Var2.g);
                linkedHashMap.put("f41", a00Var2.h);
                linkedHashMap.put("q51", a00Var2.i);
                linkedHashMap.put("o32", a00Var2.j);
                wq1 wq1Var6 = (wq1) (linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap)).get(cls.getName());
                ej0 ej0Var2 = (ej0) a91Var.a.get(hm0.d);
                ((a00) ((gm0) ux.q(a00Var, gm0.class))).getClass();
                Object obj = Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (ej0Var2 != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (wq1Var6 == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    un2Var = (un2) wq1Var6.get();
                } else {
                    if (wq1Var6 != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (ej0Var2 == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    un2Var = (un2) ej0Var2.h(obj);
                }
                Closeable closeable = new Closeable() { // from class: em0
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        yt1Var.a();
                    }
                };
                un2Var.getClass();
                vn2 vn2Var = un2Var.a;
                if (vn2Var.d) {
                    vn2.a(closeable);
                } else {
                    synchronized (vn2Var.a) {
                        vn2Var.c.add(closeable);
                    }
                }
                return un2Var;
            default:
                aq aqVarA = js1.a(cls);
                wn2[] wn2VarArr = (wn2[]) this.b;
                wn2[] wn2VarArr2 = (wn2[]) Arrays.copyOf(wn2VarArr, wn2VarArr.length);
                int length = wn2VarArr2.length;
                while (true) {
                    un2Var2 = null;
                    if (i < length) {
                        wn2Var = wn2VarArr2[i];
                        if (!wn2Var.a.equals(aqVarA)) {
                            i++;
                        }
                    } else {
                        wn2Var = null;
                    }
                }
                if (wn2Var != null && (ej0Var = wn2Var.b) != null) {
                    un2Var2 = (un2) ej0Var.h(a91Var);
                }
                if (un2Var2 != null) {
                    return un2Var2;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + aqVarA.b()).toString());
        }
    }
}
