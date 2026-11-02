package defpackage;

import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase_Impl;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 {
    public final MyGarageDatabase_Impl a;
    public final ij2 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final vr0 e;
    public final vr0 f;
    public final Object g;

    public gt0(MyGarageDatabase_Impl myGarageDatabase_Impl, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = myGarageDatabase_Impl;
        ij2 ij2Var = new ij2(myGarageDatabase_Impl, linkedHashMap, linkedHashMap2, strArr, myGarageDatabase_Impl.k, new f(1, this, gt0.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 13));
        this.b = ij2Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new vr0(this, 1);
        this.f = new vr0(this, 2);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        ij2Var.k = new w8(13, this);
    }
}
