package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ir.alirezaivaz.mygarage.MainActivity;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bt extends at implements co2, zl0, tw1, jg1, id1, s2 {
    public final jx f;
    public final ao2 g;
    public final ru1 h;
    public bo2 i;
    public final xs j;
    public final hb2 k;
    public final zs l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public final CopyOnWriteArrayList q;
    public final CopyOnWriteArrayList r;
    public final CopyOnWriteArrayList s;
    public boolean t;
    public boolean u;
    public final hb2 v;
    public final hb2 w;
    public final hb2 x;

    public bt() {
        jx jxVar = new jx();
        this.f = jxVar;
        final MainActivity mainActivity = (MainActivity) this;
        final int i = 0;
        this.g = new ao2(27, (byte) 0);
        sw1 sw1Var = new sw1(this, new w8(27, this));
        int i2 = 3;
        ru1 ru1Var = new ru1(sw1Var, 3);
        this.h = ru1Var;
        this.j = new xs(mainActivity);
        final int i3 = 1;
        this.k = new hb2(new rs(mainActivity, i3));
        new AtomicInteger();
        this.l = new zs(mainActivity);
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new CopyOnWriteArrayList();
        this.r = new CopyOnWriteArrayList();
        this.s = new CopyOnWriteArrayList();
        this.v = new hb2(new rs(mainActivity, 2));
        b21 b21Var = this.e;
        if (b21Var == null) {
            fu1.h("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        b21Var.a(new w11() { // from class: ts
            @Override // defpackage.w11
            public final void j(y11 y11Var, q11 q11Var) {
                Window window;
                View viewPeekDecorView;
                int i4 = i;
                MainActivity mainActivity2 = mainActivity;
                switch (i4) {
                    case 0:
                        if (q11Var == q11.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (q11Var == q11.ON_DESTROY) {
                            mainActivity2.f.b = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.g().a();
                            }
                            xs xsVar = mainActivity2.j;
                            MainActivity mainActivity3 = xsVar.h;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(xsVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xsVar);
                        }
                        break;
                }
            }
        });
        this.e.a(new w11() { // from class: ts
            @Override // defpackage.w11
            public final void j(y11 y11Var, q11 q11Var) {
                Window window;
                View viewPeekDecorView;
                int i4 = i3;
                MainActivity mainActivity2 = mainActivity;
                switch (i4) {
                    case 0:
                        if (q11Var == q11.ON_STOP && (window = mainActivity2.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (q11Var == q11.ON_DESTROY) {
                            mainActivity2.f.b = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.g().a();
                            }
                            xs xsVar = mainActivity2.j;
                            MainActivity mainActivity3 = xsVar.h;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(xsVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xsVar);
                        }
                        break;
                }
            }
        });
        this.e.a(new xr1(i3, mainActivity));
        sw1Var.a();
        sv0.Y(this);
        ((ru1) ru1Var.c).o("android:support:activity-result", new us(i, mainActivity));
        kg1 kg1Var = new kg1() { // from class: vs
            @Override // defpackage.kg1
            public final void a(bt btVar) {
                btVar.getClass();
                MainActivity mainActivity2 = mainActivity;
                Bundle bundleG = ((ru1) mainActivity2.h.c).g("android:support:activity-result");
                if (bundleG != null) {
                    zs zsVar = mainActivity2.l;
                    LinkedHashMap linkedHashMap = zsVar.b;
                    LinkedHashMap linkedHashMap2 = zsVar.a;
                    Bundle bundle = zsVar.g;
                    ArrayList<Integer> integerArrayList = bundleG.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleG.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleG.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        zsVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleG.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        String str = stringArrayList.get(i4);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle.containsKey(str)) {
                                nj2.g(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i4);
                        num2.getClass();
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i4);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        zsVar.b.put(str3, Integer.valueOf(iIntValue));
                    }
                }
            }
        };
        bt btVar = jxVar.b;
        if (btVar != null) {
            kg1Var.a(btVar);
        }
        jxVar.a.add(kg1Var);
        this.w = new hb2(new rs(mainActivity, i2));
        this.x = new hb2(new rs(mainActivity, 4));
    }

    public static final void j(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!ws0.j(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!ws0.j(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.id1
    public final e4 a() {
        return b().a();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.jg1
    public final ig1 b() {
        return (ig1) this.x.getValue();
    }

    @Override // defpackage.tw1
    public final ru1 c() {
        return (ru1) this.h.c;
    }

    @Override // defpackage.zl0
    public final a91 f() {
        a91 a91Var = new a91();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = a91Var.a;
        if (application != null) {
            linkedHashMap.put(xn2.d, getApplication());
        }
        linkedHashMap.put(sv0.e0, this);
        linkedHashMap.put(sv0.f0, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(sv0.g0, extras);
        }
        return a91Var;
    }

    @Override // defpackage.co2
    public final bo2 g() {
        if (getApplication() == null) {
            fu1.h("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        bo2 bo2Var = this.i;
        if (bo2Var == null) {
            ws wsVar = (ws) getLastNonConfigurationInstance();
            if (wsVar != null) {
                this.i = wsVar.a;
            }
            bo2Var = this.i;
            if (bo2Var == null) {
                bo2Var = new bo2();
                this.i = bo2Var;
            }
        }
        bo2Var.getClass();
        return bo2Var;
    }

    @Override // defpackage.y11
    public final b21 h() {
        return this.e;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.l.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((m50) this.v.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.m.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xg0) it.next()).a(configuration);
        }
    }

    @Override // defpackage.at, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.h.m(bundle);
        jx jxVar = this.f;
        jxVar.getClass();
        jxVar.b = this;
        Iterator it = jxVar.a.iterator();
        while (it.hasNext()) {
            ((kg1) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ct1.f;
        at1.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        fu1.c();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                fu1.c();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.t = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.t = false;
            Iterator it = this.p.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((xg0) it.next()).a(new w40(16));
            }
        } catch (Throwable th) {
            this.t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xg0) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            fu1.c();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.u = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.u = false;
            Iterator it = this.q.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((xg0) it.next()).a(new w40(23));
            }
        } catch (Throwable th) {
            this.u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        w40 w40Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 24;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            w40Var = new w40(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            w40Var = new w40(i2);
        } else {
            w40Var = new w40(i2);
        }
        Iterator it = this.r.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xg0) it.next()).a(w40Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.g.f).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        fu1.c();
        return false;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.l.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ws wsVar;
        bo2 bo2Var = this.i;
        if (bo2Var == null && (wsVar = (ws) getLastNonConfigurationInstance()) != null) {
            bo2Var = wsVar.a;
        }
        if (bo2Var == null) {
            return null;
        }
        ws wsVar2 = new ws();
        wsVar2.a = bo2Var;
        return wsVar2;
    }

    @Override // defpackage.at, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        b21 b21Var = this.e;
        if (b21Var != null) {
            b21Var.c("setCurrentState");
            b21Var.e(r11.g);
        }
        super.onSaveInstanceState(bundle);
        this.h.n(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xg0) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.s.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (r02.m()) {
                r02.g("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            si0 si0Var = (si0) this.k.getValue();
            synchronized (si0Var.a) {
                try {
                    si0Var.b = true;
                    ArrayList arrayList = si0Var.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ti0) obj).a();
                    }
                    si0Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.j.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.t) {
            return;
        }
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xg0) it.next()).a(new w40(16));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.u) {
            return;
        }
        Iterator it = this.q.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((xg0) it.next()).a(new w40(23));
        }
    }
}
