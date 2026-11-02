package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b8 implements kj0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b8(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.kj0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                c8 c8Var = (c8) obj5;
                ek2 ek2VarB = ((lg0) c8Var.i).b((kg0) obj, (lh0) obj2, ((hh0) obj3).a, ((ih0) obj4).a);
                if (ek2VarB instanceof dk2) {
                    Object obj6 = ((dk2) ek2VarB).e;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                ud udVar = new ud(ek2VarB, c8Var.n);
                c8Var.n = udVar;
                Object obj7 = udVar.d;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                bi0 bi0Var = new bi0(sQLiteQuery);
                ma2 ma2Var = (ma2) ((qk1) obj5).f;
                int length = ma2Var.h.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = ma2Var.h[i2];
                    if (i3 == 1) {
                        bi0Var.c(i2, ma2Var.i[i2]);
                    } else if (i3 == 2) {
                        bi0Var.g(ma2Var.j[i2], i2);
                    } else if (i3 == 3) {
                        String str2 = ma2Var.k[i2];
                        str2.getClass();
                        bi0Var.x(str2, i2);
                    } else if (i3 == 4) {
                        byte[] bArr = ma2Var.l[i2];
                        bArr.getClass();
                        bi0Var.w(i2, bArr);
                    } else if (i3 == 5) {
                        bi0Var.a(i2);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            default:
                gt gtVar = (gt) obj5;
                vy0 vy0Var = (vy0) obj;
                ((Integer) obj2).getClass();
                ak0 ak0Var = (ak0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ak0Var.f(vy0Var) ? 4 : 2;
                }
                if (ak0Var.O(iIntValue & 1, (iIntValue & 131) != 130)) {
                    gtVar.d(vy0Var, ak0Var, Integer.valueOf(iIntValue & 14));
                } else {
                    ak0Var.R();
                }
                return ll2.a;
        }
    }
}
