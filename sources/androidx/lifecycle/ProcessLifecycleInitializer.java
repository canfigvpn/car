package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.bq1;
import defpackage.cb0;
import defpackage.cq1;
import defpackage.fu1;
import defpackage.pp0;
import defpackage.q11;
import defpackage.s11;
import defpackage.t11;
import defpackage.ud;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements pp0 {
    @Override // defpackage.pp0
    public final List a() {
        return cb0.e;
    }

    @Override // defpackage.pp0
    public final Object b(Context context) {
        context.getClass();
        ud udVarJ = ud.j(context);
        udVarJ.getClass();
        if (!((HashSet) udVarJ.c).contains(ProcessLifecycleInitializer.class)) {
            fu1.h("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!t11.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new s11());
        }
        cq1 cq1Var = cq1.m;
        cq1Var.getClass();
        cq1Var.i = new Handler();
        cq1Var.j.d(q11.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new bq1(cq1Var));
        return cq1Var;
    }
}
