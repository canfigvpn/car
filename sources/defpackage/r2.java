package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements b60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.b60
    public final void a() {
        Integer num;
        int i = this.a;
        Object objC = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                o2 o2Var = ((l2) obj).a;
                if (o2Var == null) {
                    fu1.h("Launcher has not been initialized");
                    break;
                } else {
                    zs zsVar = o2Var.o0;
                    String str = o2Var.p0;
                    Bundle bundle = zsVar.g;
                    LinkedHashMap linkedHashMap = zsVar.f;
                    str.getClass();
                    if (!zsVar.d.contains(str) && (num = (Integer) zsVar.b.remove(str)) != null) {
                        zsVar.a.remove(num);
                    }
                    zsVar.e.remove(str);
                    if (linkedHashMap.containsKey(str)) {
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
                        linkedHashMap.remove(str);
                    }
                    if (bundle.containsKey(str)) {
                        if (Build.VERSION.SDK_INT >= 34) {
                            objC = h1.c(str, bundle);
                        } else {
                            Parcelable parcelable = bundle.getParcelable(str);
                            if (j2.class.isInstance(parcelable)) {
                                objC = parcelable;
                            }
                        }
                        Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((j2) objC));
                        bundle.remove(str);
                    }
                    if (zsVar.c.get(str) != null) {
                        fu1.c();
                        break;
                    }
                }
                break;
            case 1:
                k50 k50Var = (k50) obj;
                k50Var.dismiss();
                k50Var.l.f();
                break;
            case 2:
                uo1 uo1Var = (uo1) obj;
                uo1Var.f();
                uo1Var.setTag(R.id.view_tree_lifecycle_owner, null);
                uo1Var.t.removeViewImmediate(uo1Var);
                break;
            case 3:
                p9 p9Var = (p9) obj;
                k72 k72Var = p9Var.e;
                p2 p2Var = k72Var.h;
                if (p2Var != null) {
                    p2Var.a();
                }
                k72Var.a();
                ActionMode actionMode = p9Var.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                p9Var.h = null;
                break;
            case 4:
                wh whVar = (wh) ((xh) obj).c.getValue();
                if (whVar != null) {
                    whVar.close();
                }
                break;
            case 5:
                om omVar = ((mh2) obj).c;
                if (omVar != null) {
                    omVar.o(null);
                }
                break;
            case 6:
                ((f60) obj).f.a();
                break;
            case 7:
                ((me2) obj).m();
                break;
            case 8:
                xc0 xc0Var = (xc0) obj;
                View view = xc0Var.f;
                if (xc0Var.e) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(xc0Var);
                    xc0Var.e = false;
                }
                view.removeOnAttachStateChangeListener(xc0Var);
                break;
            case 9:
                ((hz0) obj).d = null;
                break;
            case 10:
                tz0 tz0Var = (tz0) obj;
                ew0 ew0Var = tz0Var.c;
                if (ew0Var != null) {
                    ew0Var.a = false;
                }
                tz0Var.c = null;
                break;
            default:
                ((pz0) obj).f = true;
                break;
        }
    }
}
