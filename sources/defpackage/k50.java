package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import ir.alirezaivaz.mygarage.R;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k50 extends Dialog implements y11, jg1, id1, tw1 {
    public b21 e;
    public final ru1 f;
    public final hb2 g;
    public final hb2 h;
    public ti0 i;
    public i50 j;
    public final View k;
    public final f50 l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(ti0 ti0Var, i50 i50Var, View view, kw0 kw0Var, m40 m40Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        final int i = 0;
        this.f = new ru1(new sw1(this, new w8(27, this)), 3);
        this.g = new hb2(new ti0(this) { // from class: dt
            public final /* synthetic */ k50 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i2 = i;
                k50 k50Var = this.f;
                switch (i2) {
                    case 0:
                        m50 m50Var = new m50();
                        k50Var.a().d(m50Var);
                        return m50Var;
                    default:
                        return new ig1(new p(6, k50Var));
                }
            }
        });
        final int i2 = 1;
        this.h = new hb2(new ti0(this) { // from class: dt
            public final /* synthetic */ k50 f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i3 = i2;
                k50 k50Var = this.f;
                switch (i3) {
                    case 0:
                        m50 m50Var = new m50();
                        k50Var.a().d(m50Var);
                        return m50Var;
                    default:
                        return new ig1(new p(6, k50Var));
                }
            }
        });
        this.i = ti0Var;
        this.j = i50Var;
        this.k = view;
        Window window = getWindow();
        if (window == null) {
            fu1.h("Dialog has no window");
            throw null;
        }
        i50 i50Var2 = this.j;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            i50Var2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.j.getClass();
        r02.q(window, true);
        window.setGravity(17);
        this.j.getClass();
        f50 f50Var = new f50(getContext(), window);
        this.j.getClass();
        setTitle("");
        f50Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        f50Var.setClipChildren(false);
        f50Var.setElevation(m40Var.x(8.0f));
        f50Var.setOutlineProvider(new j50(0));
        this.l = f50Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(f50Var);
        f50Var.setTag(R.id.view_tree_lifecycle_owner, c22.e(view));
        f50Var.setTag(R.id.view_tree_view_model_store_owner, n02.j(view));
        f50Var.setTag(R.id.view_tree_saved_state_registry_owner, j02.n(view));
        i(this.i, this.j, kw0Var);
        ig1 ig1VarB = b();
        j6 j6Var = new j6(this, 1);
        ig1VarB.getClass();
        ag agVar = new ag(j6Var);
        final b21 b21VarE = e();
        if (b21VarE.h == r11.e) {
            return;
        }
        dg1 dg1Var = new dg1(agVar, new eg1(agVar, this));
        agVar.a.add(dg1Var);
        dg1Var.g(false);
        e4.c(ig1VarB.a(), dg1Var);
        final g30 g30Var = new g30(dg1Var, ig1VarB, b21VarE);
        b21VarE.a(g30Var);
        agVar.c.add(new AutoCloseable() { // from class: fg1
            @Override // java.lang.AutoCloseable
            public final void close() {
                b21VarE.f(g30Var);
            }
        });
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof f50) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public static final void g(k50 k50Var) {
        super.onBackPressed();
    }

    @Override // defpackage.id1
    public final e4 a() {
        return b().a();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.jg1
    public final ig1 b() {
        return (ig1) this.h.getValue();
    }

    @Override // defpackage.tw1
    public final ru1 c() {
        return (ru1) this.f.c;
    }

    public final b21 e() {
        b21 b21Var = this.e;
        if (b21Var != null) {
            return b21Var;
        }
        b21 b21Var2 = new b21(this, true);
        this.e = b21Var2;
        return b21Var2;
    }

    public final void f() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.y11
    public final b21 h() {
        return e();
    }

    public final void i(ti0 ti0Var, i50 i50Var, kw0 kw0Var) {
        int i;
        this.i = ti0Var;
        this.j = i50Var;
        wy1 wy1Var = i50Var.a;
        boolean zB = s8.b(this.k);
        int iOrdinal = wy1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    qj.p();
                    return;
                }
                zB = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = kw0Var.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                qj.p();
                return;
            }
            i = 1;
        }
        f50 f50Var = this.l;
        f50Var.setLayoutDirection(i);
        boolean z = i50Var.b;
        Window window2 = f50Var.n;
        boolean z2 = (f50Var.r && z == f50Var.p && true == f50Var.q) ? false : true;
        f50Var.p = z;
        f50Var.q = true;
        if (z2) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z ? -2 : -1;
            if (i2 != attributes.width || !f50Var.r) {
                window2.setLayout(i2, -2);
                f50Var.r = true;
            }
        }
        setCanceledOnTouchOutside(true);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((m50) this.g.getValue()).a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ig1 ig1VarB = b();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            ig1VarB.b(onBackInvokedDispatcher);
        }
        this.f.m(bundle);
        e().d(q11.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.j.getClass();
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.i.a();
        return true;
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f.n(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        e().d(q11.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        e().d(q11.ON_DESTROY);
        this.e = null;
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iJ0;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        this.j.getClass();
        f50 f50Var = this.l;
        f50Var.getClass();
        if (Math.abs(motionEvent.getX()) > Float.MAX_VALUE || Math.abs(motionEvent.getY()) > Float.MAX_VALUE || (childAt = f50Var.getChildAt(0)) == null) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                this.m = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.m = false;
                    return zOnTouchEvent;
                }
            } else if (this.m) {
                this.i.a();
                this.m = false;
                return true;
            }
        } else {
            int left = childAt.getLeft() + f50Var.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + f50Var.getTop();
            int height = childAt.getHeight() + top;
            int iJ1 = p61.j0(motionEvent.getX());
            if (left > iJ1 || iJ1 > width || top > (iJ0 = p61.j0(motionEvent.getY())) || iJ0 > height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    this.m = true;
                    return true;
                }
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.m = false;
                        return zOnTouchEvent;
                    }
                } else if (this.m) {
                    this.i.a();
                    this.m = false;
                    return true;
                }
            } else {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
                    this.m = false;
                    return zOnTouchEvent;
                }
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        view.getClass();
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
