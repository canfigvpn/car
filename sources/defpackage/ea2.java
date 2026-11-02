package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 extends n42 implements q82 {
    @Override // defpackage.q82
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.m + ((long) ((int) ((o() + ((long) this.o)) - this.m)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.m + ((long) ((int) ((o() + ((long) this.o)) - this.m)))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
