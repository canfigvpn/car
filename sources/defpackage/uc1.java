package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class uc1 extends wc1 {
    public final Class r;

    public uc1(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            qj.g(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.wc1, defpackage.xc1
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.wc1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i];
            if (o92.v(((Enum) obj).name(), str, true)) {
                break;
            }
            i++;
        }
        Enum r3 = (Enum) obj;
        if (r3 != null) {
            return r3;
        }
        throw new IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }
}
