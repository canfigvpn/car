package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class nq2 implements mq2 {
    public final n40 b;

    public nq2() {
        this.b = Build.VERSION.SDK_INT >= 34 ? o40.e : q90.D;
        vs0.g(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
