package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 implements ti0 {
    public final /* synthetic */ int e;

    public /* synthetic */ m2(int i) {
        this.e = i;
    }

    @Override // defpackage.ti0
    public final Object a() {
        Class<?> returnType;
        switch (this.e) {
            case 0:
                e0 e0Var = er1.e;
                return Integer.valueOf(er1.e.a().nextInt(2147418112) + 65536);
            case 1:
                return UUID.randomUUID().toString();
            case 2:
                kj1 kj1Var = r3.a;
                return p20.a;
            case 3:
                a90 a90Var = nc.a;
                return r30.a;
            case 4:
                a90 a90Var2 = nc.a;
                return q90.C;
            case 5:
                return new o72(ws0.c(1308617531));
            case 6:
                return new me(eh.a, 0);
            case 7:
                return new me(qg.a, 0);
            case 8:
                return new me(ng.a, 0);
            case 9:
                return null;
            case 10:
                return lr.f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 11:
                return ll2.a;
            case 12:
                return null;
            case 13:
                hv.b("Unexpected call to default provider");
                throw new ps();
            case 14:
                return y12.s(new te2((String) null, 0L, 7));
            case 15:
                return y12.s(Boolean.FALSE);
            case 16:
                return Float.valueOf(0.0f);
            case 17:
                return Float.valueOf(0.0f);
            case 18:
                return Float.valueOf(1.0f);
            case 19:
                return Boolean.TRUE;
            case 20:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 21:
                try {
                    Method method = (Method) vh0.g.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 22:
                return new hf1("ir.alirezaivaz.mygarage.ui.navigation.FuelRoute", fi0.INSTANCE, new Annotation[0]);
            case 23:
                return new me(hh.a, 0);
            case 24:
                return new me(kg.a, 0);
            case 25:
                return new hf1("ir.alirezaivaz.mygarage.ui.navigation.HistoryRoute", mm0.INSTANCE, new Annotation[0]);
            case 26:
                return new hf1("ir.alirezaivaz.mygarage.ui.navigation.HomeRoute", wm0.INSTANCE, new Annotation[0]);
            case 27:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 28:
                a90 a90Var3 = yo0.a;
                return r20.a;
            default:
                return null;
        }
    }
}
