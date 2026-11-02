package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p50 extends r50 implements gz, sx {
    public static final /* synthetic */ long l = we.a.objectFieldOffset(p50.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final xy h;
    public final tx i;
    public Object j;
    public final Object k;

    public p50(xy xyVar, tx txVar) {
        super(-1);
        this.h = xyVar;
        this.i = txVar;
        this.j = ws0.p;
        this.k = p61.m0(txVar.f());
    }

    @Override // defpackage.gz
    public final gz e() {
        return this.i;
    }

    @Override // defpackage.sx
    public final uy f() {
        return this.i.f();
    }

    @Override // defpackage.sx
    public final void i(Object obj) {
        Throwable thA = vt1.a(obj);
        Object osVar = thA == null ? obj : new os(thA, false);
        tx txVar = this.i;
        uy uyVarF = txVar.f();
        xy xyVar = this.h;
        if (xyVar.G(uyVarF)) {
            this.j = osVar;
            this.g = 0;
            xyVar.E(txVar.f(), this);
            return;
        }
        ac0 ac0VarA = ig2.a();
        if (ac0VarA.g >= 4294967296L) {
            this.j = osVar;
            this.g = 0;
            ac0VarA.J(this);
            return;
        }
        ac0VarA.K(true);
        try {
            uy uyVarF2 = txVar.f();
            Object objS0 = p61.s0(uyVarF2, this.k);
            try {
                txVar.i(obj);
                p61.h0(uyVarF2, objS0);
                while (ac0VarA.M()) {
                }
            } catch (Throwable th) {
                p61.h0(uyVarF2, objS0);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2);
            } finally {
                ac0VarA.I(true);
            }
        }
    }

    @Override // defpackage.r50
    public final Object j() {
        Object obj = this.j;
        this.j = ws0.p;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.h + ", " + j20.D(this.i) + ']';
    }

    @Override // defpackage.r50
    public final sx c() {
        return this;
    }
}
