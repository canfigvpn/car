package defpackage;

import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b5 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b5(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                e5 e5Var = (e5) obj;
                e5Var.removeCallbacks(this);
                MotionEvent motionEvent = e5Var.z0;
                if (motionEvent != null && (actionMasked = motionEvent.getActionMasked()) != 10 && actionMasked != 1) {
                    e5Var.I(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, e5Var.A0, false);
                    break;
                }
                break;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((ao2) obj).f;
                int i2 = bottomSheetBehavior.m;
                if (i2 == 2 && i2 != 0) {
                    bottomSheetBehavior.m = 0;
                    break;
                }
                break;
            default:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) obj;
                if (searchView$SearchAutoComplete.j) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.j = false;
                }
                break;
        }
    }
}
