package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class me extends tq {
    public final /* synthetic */ int b;
    public final b31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(mv0 mv0Var, int i) {
        super(mv0Var);
        this.b = i;
        mv0Var.getClass();
        switch (i) {
            case 1:
                super(mv0Var);
                s12 s12VarC = mv0Var.c();
                s12VarC.getClass();
                this.c = new ke(s12VarC, 2);
                break;
            case 2:
                super(mv0Var);
                s12 s12VarC2 = mv0Var.c();
                s12VarC2.getClass();
                this.c = new ke(s12VarC2, 3);
                break;
            default:
                s12 s12VarC3 = mv0Var.c();
                s12VarC3.getClass();
                this.c = new ke(s12VarC3, 1);
                break;
        }
    }

    @Override // defpackage.mv0
    public final s12 c() {
        int i = this.b;
        b31 b31Var = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return (ke) b31Var;
    }

    @Override // defpackage.o
    public final Object e() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.o
    public final int f(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.o
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.o
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.o
    public final Object k(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // defpackage.o
    public final Object l(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.tq
    public final void m(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }
}
