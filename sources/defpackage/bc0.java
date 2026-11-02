package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class bc0 extends dc0 {
    public final om g;
    public final /* synthetic */ fc0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc0(fc0 fc0Var, long j, om omVar) {
        super(j);
        this.h = fc0Var;
        this.g = omVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        this.g.F(this.h);
    }

    @Override // defpackage.dc0
    public final String toString() {
        return super.toString() + this.g;
    }
}
