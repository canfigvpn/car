package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ia {
    public final mj2 a;
    public final Object b;
    public final ob c;
    public final dk1 d;
    public final dk1 e;
    public final qa1 f;
    public final tb g;
    public final tb h;
    public final tb i;
    public final tb j;

    public ia(Object obj, mj2 mj2Var, Object obj2) {
        this.a = mj2Var;
        this.b = obj2;
        ob obVar = new ob(mj2Var, obj, null, 60);
        this.c = obVar;
        this.d = y12.s(Boolean.FALSE);
        this.e = y12.s(obj);
        this.f = new qa1();
        new g82(obj2);
        tb tbVar = obVar.g;
        boolean z = tbVar instanceof pb;
        tb tbVar2 = z ? sv0.e : tbVar instanceof qb ? sv0.f : tbVar instanceof rb ? sv0.g : sv0.h;
        this.g = tbVar2;
        tb tbVar3 = z ? sv0.a : tbVar instanceof qb ? sv0.b : tbVar instanceof rb ? sv0.c : sv0.d;
        this.h = tbVar3;
        this.i = tbVar2;
        this.j = tbVar3;
    }

    public static Object a(ia iaVar, Object obj, nb nbVar, tx txVar) {
        Object objH = iaVar.a.b.h(iaVar.c.g);
        Object objD = iaVar.d();
        mj2 mj2Var = iaVar.a;
        return qa1.a(iaVar.f, new ga(iaVar, objH, new cc2(nbVar, mj2Var, objD, obj, (tb) mj2Var.a.h(objH)), iaVar.c.h, null), txVar);
    }

    public final Object b(Object obj) {
        tb tbVar = this.g;
        tb tbVar2 = this.i;
        boolean zJ = ws0.j(tbVar2, tbVar);
        tb tbVar3 = this.j;
        if (!zJ || !ws0.j(tbVar3, this.h)) {
            mj2 mj2Var = this.a;
            tb tbVar4 = (tb) mj2Var.a.h(obj);
            int iB = tbVar4.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (tbVar4.a(i) < tbVar2.a(i) || tbVar4.a(i) > tbVar3.a(i)) {
                    tbVar4.e(i, ex.g(tbVar4.a(i), tbVar2.a(i), tbVar3.a(i)));
                    z = true;
                }
            }
            if (z) {
                return mj2Var.b.h(tbVar4);
            }
        }
        return obj;
    }

    public final void c() {
        ob obVar = this.c;
        obVar.g.d();
        obVar.h = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object d() {
        return this.c.f.getValue();
    }

    public final Object e(sx sxVar, Object obj) {
        Object objA = qa1.a(this.f, new ha(this, obj, null), sxVar);
        return objA == fz.e ? objA : ll2.a;
    }

    public /* synthetic */ ia(Object obj, mj2 mj2Var, Object obj2, int i) {
        this(obj, mj2Var, (i & 4) != 0 ? null : obj2);
    }
}
