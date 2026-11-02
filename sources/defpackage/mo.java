package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class mo extends no {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(mo.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final lo h;
    public final boolean i;

    public /* synthetic */ mo(lo loVar, boolean z) {
        this(loVar, z, ab0.e, -3, vk.e);
    }

    @Override // defpackage.no, defpackage.pe0
    public final Object a(qe0 qe0Var, sx sxVar) throws Throwable {
        int i = this.f;
        fz fzVar = fz.e;
        if (i == -3) {
            boolean z = this.i;
            if (z && j.getAndSet(this, 1) != 0) {
                fu1.h("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objN = ux.n(qe0Var, this.h, z, sxVar);
            if (objN == fzVar) {
                return objN;
            }
        } else {
            Object objA = super.a(qe0Var, sxVar);
            if (objA == fzVar) {
                return objA;
            }
        }
        return ll2.a;
    }

    @Override // defpackage.no
    public final String c() {
        return "channel=" + this.h;
    }

    @Override // defpackage.no
    public final Object d(hq1 hq1Var, sx sxVar) throws Throwable {
        Object objN = ux.n(new l12(hq1Var), this.h, this.i, sxVar);
        return objN == fz.e ? objN : ll2.a;
    }

    @Override // defpackage.no
    public final no e(uy uyVar, int i, vk vkVar) {
        return new mo(this.h, this.i, uyVar, i, vkVar);
    }

    @Override // defpackage.no
    public final pe0 f() {
        return new mo(this.h, this.i);
    }

    @Override // defpackage.no
    public final lo g(ez ezVar) {
        if (!this.i || j.getAndSet(this, 1) == 0) {
            return this.f == -3 ? this.h : super.g(ezVar);
        }
        fu1.h("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public mo(lo loVar, boolean z, uy uyVar, int i, vk vkVar) {
        super(uyVar, i, vkVar);
        this.h = loVar;
        this.i = z;
        this.consumed$volatile = 0;
    }
}
