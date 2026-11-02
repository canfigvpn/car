package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class w72 extends er0 {
    public int e;
    public final /* synthetic */ v72 f;

    public w72(v72 v72Var) {
        this.f = v72Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.f.d();
    }

    @Override // defpackage.er0
    public final int nextInt() {
        int i = this.e;
        this.e = i + 1;
        return this.f.b(i);
    }
}
