package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class q71 extends a22 {
    public final ArrayList e;

    /* JADX WARN: Illegal instructions before constructor call */
    public q71(ArrayList arrayList, String str) {
        String str2;
        str.getClass();
        if (arrayList.size() == 1) {
            str2 = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
        super(str2, null);
        this.e = arrayList;
    }

    public q71(ArrayList arrayList, String str, q71 q71Var) {
        super(str, q71Var);
        this.e = arrayList;
    }
}
