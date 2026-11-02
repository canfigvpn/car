package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends tl1 implements uv {
    public static final sl1 h = new sl1(wi2.e, 0);

    public final sl1 b(tq1 tq1Var, cm2 cm2Var) {
        qs qsVarU = this.e.u(tq1Var, tq1Var.hashCode(), cm2Var, 0);
        return qsVarU == null ? this : new sl1((wi2) qsVarU.c, this.f + qsVarU.b);
    }

    @Override // defpackage.tl1, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof tq1) {
            return super.containsKey((tq1) obj);
        }
        return false;
    }

    @Override // defpackage.tl1, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof cm2) {
            return super.containsValue((cm2) obj);
        }
        return false;
    }

    @Override // defpackage.tl1, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof tq1) {
            return (cm2) super.get((tq1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof tq1) ? obj2 : (cm2) super.getOrDefault((tq1) obj, (cm2) obj2);
    }
}
