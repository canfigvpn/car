package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class p71 extends t71 implements rv, sw0 {
    public LinkedHashMap s;

    @Override // defpackage.sw0
    public final x61 e(y61 y61Var, r61 r61Var, long j) {
        float f = ((w60) ir2.j(this, yr0.c)).e;
        if (f < 0.0f) {
            f = 0.0f;
        }
        jm1 jm1VarE = r61Var.e(j);
        boolean z = this.r && !Float.isNaN(f) && w60.a(f, 0.0f) > 0;
        int iO = !Float.isNaN(f) ? y61Var.O(f) : 0;
        int iMax = jm1VarE.e;
        if (z) {
            iMax = Math.max(iMax, iO);
        }
        int iMax2 = jm1VarE.f;
        if (z) {
            iMax2 = Math.max(iMax2, iO);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.s;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.s = linkedHashMap;
            }
            bn2 bn2Var = yr0.b;
            int iRound = Math.round((iO - jm1VarE.e) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(bn2Var, Integer.valueOf(iRound));
            on0 on0Var = yr0.a;
            int iRound2 = Math.round((iO - jm1VarE.f) / 2.0f);
            linkedHashMap.put(on0Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.s;
        if (map == null) {
            map = db0.e;
        }
        return y61Var.d0(iMax, iMax2, map, new qq0(iMax, iMax2, jm1VarE));
    }
}
