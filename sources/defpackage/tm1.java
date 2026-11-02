package defpackage;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class tm1 implements rm1 {
    public final Magnifier a;

    public tm1(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.rm1
    public void a(long j, long j2, float f) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return (((long) this.a.getWidth()) << 32) | (((long) this.a.getHeight()) & 4294967295L);
    }

    public final void d() {
        this.a.update();
    }
}
