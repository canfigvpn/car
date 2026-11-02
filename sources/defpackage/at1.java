package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class at1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, q11 q11Var) {
        q11Var.getClass();
        if (activity instanceof y11) {
            b21 b21VarH = ((y11) activity).h();
            if (b21VarH instanceof b21) {
                b21VarH.d(q11Var);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            ct1.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new ct1.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ct1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
