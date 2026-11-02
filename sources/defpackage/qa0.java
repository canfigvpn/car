package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class qa0 {
    public int a = 1;
    public final l71 b;
    public l71 c;
    public l71 d;
    public int e;
    public int f;

    public qa0(l71 l71Var) {
        this.b = l71Var;
        this.c = l71Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        j71 j71VarB = this.c.b.b();
        int iA = j71VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) j71VarB.h).get(iA + j71VarB.e) == 0) || this.e == 65039;
    }
}
