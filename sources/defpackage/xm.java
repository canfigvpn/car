package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xm implements ej0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    public /* synthetic */ xm(int i, int i2, long j) {
        this.e = i;
        this.f = i2;
        this.g = j;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) throws Exception {
        int i = this.e;
        int i2 = this.f;
        long j = this.g;
        vv1 vv1Var = (vv1) obj;
        vv1Var.getClass();
        xv1 xv1VarC = vv1Var.C("UPDATE cars SET currentOdometerKm = ?, odometerUpdatedEpochDay = ? WHERE id = ?");
        try {
            xv1VarC.c(1, i);
            xv1VarC.c(2, i2);
            xv1VarC.c(3, j);
            xv1VarC.y();
            return ll2.a;
        } finally {
            xv1VarC.close();
        }
    }
}
