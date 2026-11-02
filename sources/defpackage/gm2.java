package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm2 implements ej0 {
    public final /* synthetic */ int e;

    public /* synthetic */ gm2(int i) {
        this.e = i;
    }

    @Override // defpackage.ej0
    public final Object h(Object obj) {
        switch (this.e) {
            case 0:
                qb qbVar = (qb) obj;
                return new uf1((((long) Float.floatToRawIntBits(qbVar.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(qbVar.a)) << 32));
            case 1:
                long j = ((ir0) obj).a;
                return new qb((int) (j >> 32), (int) (4294967295L & j));
            case 2:
                qb qbVar2 = (qb) obj;
                return new ir0((((long) Math.round(qbVar2.b)) & 4294967295L) | (((long) Math.round(qbVar2.a)) << 32));
            case 3:
                long j2 = ((qr0) obj).a;
                return new qb((int) (j2 >> 32), (int) (4294967295L & j2));
            case 4:
                qb qbVar3 = (qb) obj;
                int iRound = Math.round(qbVar3.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(qbVar3.b);
                return new qr0((((long) iRound) << 32) | (4294967295L & ((long) (iRound2 >= 0 ? iRound2 : 0))));
            case 5:
                yr1 yr1Var = (yr1) obj;
                return new sb(yr1Var.a, yr1Var.b, yr1Var.c, yr1Var.d);
            case 6:
                sb sbVar = (sb) obj;
                return new yr1(sbVar.a, sbVar.b, sbVar.c, sbVar.d);
            case 7:
                return Float.valueOf(((pb) obj).a);
            case 8:
                return ((fq2) obj).c;
            default:
                mq2 mq2Var = (mq2) obj;
                mq2Var.getClass();
                return mq2Var;
        }
    }
}
