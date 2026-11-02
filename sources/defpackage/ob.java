package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ob implements p82 {
    public final mj2 e;
    public final dk1 f;
    public tb g;
    public long h;
    public long i;
    public boolean j;

    public ob(mj2 mj2Var, Object obj, tb tbVar, long j, long j2, boolean z) {
        tb tbVarK;
        this.e = mj2Var;
        this.f = y12.s(obj);
        if (tbVar != null) {
            tbVarK = vs0.k(tbVar);
        } else {
            tbVarK = (tb) mj2Var.a.h(obj);
            tbVarK.d();
        }
        this.g = tbVarK;
        this.h = j;
        this.i = j2;
        this.j = z;
    }

    public final Object a() {
        return this.e.b.h(this.g);
    }

    @Override // defpackage.p82
    public final Object getValue() {
        return this.f.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f.getValue() + ", velocity=" + a() + ", isRunning=" + this.j + ", lastFrameTimeNanos=" + this.h + ", finishedTimeNanos=" + this.i + ')';
    }

    public /* synthetic */ ob(mj2 mj2Var, Object obj, tb tbVar, int i) {
        this(mj2Var, obj, (i & 4) != 0 ? null : tbVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
