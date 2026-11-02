package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 implements y11 {
    public static final cq1 m = new cq1();
    public int e;
    public int f;
    public Handler i;
    public boolean g = true;
    public boolean h = true;
    public final b21 j = new b21(this, true);
    public final p k = new p(8, this);
    public final qk1 l = new qk1(4, this);

    public final void a() {
        int i = this.f + 1;
        this.f = i;
        if (i == 1) {
            if (this.g) {
                this.j.d(q11.ON_RESUME);
                this.g = false;
            } else {
                Handler handler = this.i;
                handler.getClass();
                handler.removeCallbacks(this.k);
            }
        }
    }

    @Override // defpackage.y11
    public final b21 h() {
        return this.j;
    }
}
