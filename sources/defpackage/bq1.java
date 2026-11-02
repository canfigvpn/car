package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bq1 extends ya0 {
    final /* synthetic */ cq1 this$0;

    /* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
    public static final class a extends ya0 {
        final /* synthetic */ cq1 this$0;

        public a(cq1 cq1Var) {
            this.this$0 = cq1Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            cq1 cq1Var = this.this$0;
            int i = cq1Var.e + 1;
            cq1Var.e = i;
            if (i == 1 && cq1Var.h) {
                cq1Var.j.d(q11.ON_START);
                cq1Var.h = false;
            }
        }
    }

    public bq1(cq1 cq1Var) {
        this.this$0 = cq1Var;
    }

    @Override // defpackage.ya0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = ct1.f;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((ct1) fragmentFindFragmentByTag).e = this.this$0.l;
        }
    }

    @Override // defpackage.ya0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        cq1 cq1Var = this.this$0;
        int i = cq1Var.f - 1;
        cq1Var.f = i;
        if (i == 0) {
            Handler handler = cq1Var.i;
            handler.getClass();
            handler.postDelayed(cq1Var.k, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        cc.j(activity, new a(this.this$0));
    }

    @Override // defpackage.ya0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        cq1 cq1Var = this.this$0;
        int i = cq1Var.e - 1;
        cq1Var.e = i;
        if (i == 0 && cq1Var.g) {
            cq1Var.j.d(q11.ON_STOP);
            cq1Var.h = true;
        }
    }
}
