package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.b21;
import defpackage.b7;
import defpackage.ca0;
import defpackage.da0;
import defpackage.pp0;
import defpackage.ud;
import defpackage.vg0;
import defpackage.y11;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements pp0 {
    @Override // defpackage.pp0
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.pp0
    public final Object b(Context context) {
        Object objE;
        vg0 vg0Var = new vg0(new b7(context, 2));
        vg0Var.a = 1;
        if (ca0.k == null) {
            synchronized (ca0.j) {
                try {
                    if (ca0.k == null) {
                        ca0.k = new ca0(vg0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ud udVarJ = ud.j(context);
        udVarJ.getClass();
        synchronized (ud.f) {
            try {
                objE = ((HashMap) udVarJ.b).get(ProcessLifecycleInitializer.class);
                if (objE == null) {
                    objE = udVarJ.e(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b21 b21VarH = ((y11) objE).h();
        b21VarH.a(new da0(this, b21VarH));
        return Boolean.TRUE;
    }
}
