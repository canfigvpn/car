package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mp1 {
    public static final lp1 a;

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    static {
        lp1 lp1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                lp1Var = new lp1();
            } else {
                lp1Var = null;
            }
        } else {
            lp1Var = null;
        }
        a = lp1Var;
    }
}
