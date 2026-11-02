package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b81 implements a81 {
    public final Context e;
    public rx f;
    public final zj1 g = new zj1(1.0f);
    public j82 h;

    public b81(Context context) {
        this.e = context;
    }

    @Override // defpackage.uy
    public final uy k(uy uyVar) {
        return ex.F(this, uyVar);
    }

    @Override // defpackage.uy
    public final sy p(ty tyVar) {
        return ex.t(this, tyVar);
    }

    @Override // defpackage.uy
    public final Object s(ij0 ij0Var, Object obj) {
        return ij0Var.g(obj, this);
    }

    @Override // defpackage.uy
    public final uy u(ty tyVar) {
        return ex.E(this, tyVar);
    }

    @Override // defpackage.a81
    public final float v() {
        sx sxVar;
        q82 q82Var;
        if (this.h == null) {
            Context context = this.e;
            w91 w91Var = vq2.a;
            synchronized (w91Var) {
                try {
                    Object objG = w91Var.g(context);
                    sxVar = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        zk zkVarD = s5.d(-1, 6, null);
                        ue0 ue0Var = new ue0(2, new na1(contentResolver, uriFor, new uq2(zkVarD, ei1.m(Looper.getMainLooper())), zkVarD, context, null));
                        ga2 ga2Var = new ga2(null);
                        j30 j30Var = u50.a;
                        objG = ix.N(ue0Var, new rx(ex.F(ga2Var, o51.a)), new o82(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        w91Var.m(context, objG);
                    }
                    q82Var = (q82) objG;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.g.i(((Number) q82Var.getValue()).floatValue());
            rx rxVar = this.f;
            if (rxVar == null) {
                fu1.h("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.h = nj2.y(rxVar, null, new e(22, sxVar, q82Var, this), 3);
        }
        return this.g.h();
    }
}
