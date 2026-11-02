package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yq0 implements zq0 {
    public final long e;
    public final int f;

    public yq0(int i, long j) {
        this.e = j;
        this.f = i;
    }

    @Override // defpackage.zq0
    public final wq0 toInstant() {
        wq0 wq0Var = wq0.g;
        wq0 wq0Var2 = wq0.g;
        long j = wq0Var2.e;
        long j2 = this.e;
        if (j2 >= j) {
            wq0 wq0Var3 = wq0.h;
            if (j2 <= wq0Var3.e) {
                long j3 = this.f;
                long j4 = j3 / 1000000000;
                if ((j3 ^ 1000000000) < 0 && j4 * 1000000000 != j3) {
                    j4--;
                }
                long j5 = j2 + j4;
                if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
                    return j2 > 0 ? wq0Var3 : wq0Var2;
                }
                if (j5 >= -31557014167219200L) {
                    if (j5 <= 31556889864403199L) {
                        long j6 = j3 % 1000000000;
                        return new wq0((int) (j6 + ((((j6 ^ 1000000000) & ((-j6) | j6)) >> 63) & 1000000000)), j5);
                    }
                }
            }
        }
        throw new xq0("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
