package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class h72 implements Parcelable, v82, List, RandomAccess, gv0 {
    public static final Parcelable.Creator<h72> CREATOR = new g72();
    public u82 e;

    public h72(d0 d0Var) {
        o62 o62VarH = x62.h();
        u82 u82Var = new u82(o62VarH.g(), d0Var);
        if (!(o62VarH instanceof tk0)) {
            u82Var.b = new u82(1L, d0Var);
        }
        this.e = u82Var;
    }

    @Override // defpackage.v82
    public final x82 a() {
        return this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            d0 d0VarC = d0Var.c(obj);
            if (d0VarC.equals(d0Var)) {
                return false;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i, d0VarC, true);
            }
            x62.l(o62VarH, this);
        } while (!zH);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            d0 d0VarD = d0Var.d(collection);
            if (ws0.j(d0VarD, d0Var)) {
                return false;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i, d0VarD, true);
            }
            x62.l(o62VarH, this);
        } while (!zH);
        return true;
    }

    public final void c(int i, int i2) {
        int i3;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i3 = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            dm1 dm1VarE = d0Var.e();
            dm1VarE.subList(i, i2).clear();
            d0 d0VarC = dm1VarE.c();
            if (ws0.j(d0VarC, d0Var)) {
                return;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i3, d0VarC, true);
            }
            x62.l(o62VarH, this);
        } while (!zH);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        o62 o62VarH;
        u82 u82Var = this.e;
        u82Var.getClass();
        synchronized (x62.c) {
            o62VarH = x62.h();
            u82 u82Var2 = (u82) x62.w(u82Var, this, o62VarH);
            synchronized (nj2.A0) {
                u82Var2.c = p52.f;
                u82Var2.d++;
                u82Var2.e++;
            }
        }
        x62.l(o62VarH, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return nj2.r(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return nj2.r(this).c.containsAll(collection);
    }

    @Override // defpackage.v82
    public final void d(x82 x82Var) {
        x82Var.b = this.e;
        this.e = (u82) x82Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return nj2.r(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return nj2.r(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return nj2.r(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return nj2.r(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new tm0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            int iIndexOf = d0Var.indexOf(obj);
            d0 d0VarG = iIndexOf != -1 ? d0Var.g(iIndexOf) : d0Var;
            if (d0VarG.equals(d0Var)) {
                return false;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i, d0VarG, true);
            }
            x62.l(o62VarH, this);
        } while (!zH);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            d0 d0VarF = d0Var.f(new c0(0, collection));
            if (ws0.j(d0VarF, d0Var)) {
                return false;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i, d0VarF, true);
            }
            x62.l(o62VarH, this);
        } while (!zH);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return nj2.C(this, new c0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        Object obj2 = get(i);
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i2 = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            d0 d0VarH = d0Var.h(i, obj);
            if (d0VarH.equals(d0Var)) {
                break;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i2, d0VarH, false);
            }
            x62.l(o62VarH, this);
        } while (!zH);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return nj2.r(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            cp1.a("fromIndex or toIndex are out of bounds");
        }
        return new w92(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return p61.n0(this);
    }

    public final String toString() {
        u82 u82Var = this.e;
        u82Var.getClass();
        return "SnapshotStateList(value=" + ((u82) x62.f(u82Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        d0 d0Var = nj2.r(this).c;
        int iA = d0Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(d0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return p61.o0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new tm0(this, i);
    }

    public h72() {
        this(p52.f);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i2 = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            d0 d0VarB = d0Var.b(i, obj);
            if (d0VarB.equals(d0Var)) {
                return;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i2, d0VarB, true);
            }
            x62.l(o62VarH, this);
        } while (!zH);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return nj2.C(this, new oy0(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        d0 d0Var;
        o62 o62VarH;
        boolean zH;
        Object obj = get(i);
        do {
            synchronized (nj2.A0) {
                u82 u82Var = this.e;
                u82Var.getClass();
                u82 u82Var2 = (u82) x62.f(u82Var);
                i2 = u82Var2.d;
                d0Var = u82Var2.c;
            }
            d0Var.getClass();
            d0 d0VarG = d0Var.g(i);
            if (d0VarG.equals(d0Var)) {
                break;
            }
            u82 u82Var3 = this.e;
            u82Var3.getClass();
            synchronized (x62.c) {
                o62VarH = x62.h();
                zH = nj2.h((u82) x62.w(u82Var3, this, o62VarH), i2, d0VarG, true);
            }
            x62.l(o62VarH, this);
        } while (!zH);
        return obj;
    }
}
