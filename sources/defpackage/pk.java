package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pk extends wf {
    public om a;
    public ej0 b;

    @Override // defpackage.wf
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.wf
    public final void b(Throwable th) throws IllegalAccessException, InvocationTargetException {
        om omVar = this.a;
        if (omVar != null) {
            omVar.i(ix.q(th));
        }
    }
}
