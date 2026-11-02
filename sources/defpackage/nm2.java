package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface nm2 {
    boolean a();

    long b(tb tbVar, tb tbVar2, tb tbVar3);

    tb l(long j, tb tbVar, tb tbVar2, tb tbVar3);

    tb p(long j, tb tbVar, tb tbVar2, tb tbVar3);

    default tb q(tb tbVar, tb tbVar2, tb tbVar3) {
        return l(b(tbVar, tbVar2, tbVar3), tbVar, tbVar2, tbVar3);
    }
}
