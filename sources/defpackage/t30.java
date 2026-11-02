package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t30 extends y12 {
    public final Object b;
    public final ExecutorService c;

    public t30() {
        super(4);
        this.c = Executors.newFixedThreadPool(4, new s30());
    }
}
