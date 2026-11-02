package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class hs1 extends tq {
    public final aq b;
    public final ke c;

    public hs1(aq aqVar, mv0 mv0Var) {
        super(mv0Var);
        this.b = aqVar;
        s12 s12VarC = mv0Var.c();
        s12VarC.getClass();
        this.c = new ke(s12VarC, 0);
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return this.c;
    }

    @Override // defpackage.o
    public final Object e() {
        return new ArrayList();
    }

    @Override // defpackage.o
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.o
    public final Iterator g(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new v(1, objArr);
    }

    @Override // defpackage.o
    public final int h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        throw null;
    }

    @Override // defpackage.o
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object objNewInstance = Array.newInstance((Class<?>) vv.q(this.b), arrayList.size());
        objNewInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.tq
    public final void m(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
