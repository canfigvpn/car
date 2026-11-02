package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 extends dw0 implements ti0 {
    public static final t5 A;
    public static final t5 B;
    public static final t5 C;
    public static final t5 D;
    public static final t5 E;
    public static final t5 F;
    public static final t5 G;
    public static final t5 H;
    public static final t5 I;
    public static final t5 J;
    public static final t5 g;
    public static final t5 h;
    public static final t5 i;
    public static final t5 j;
    public static final t5 k;
    public static final t5 l;
    public static final t5 m;
    public static final t5 n;
    public static final t5 o;
    public static final t5 p;
    public static final t5 q;
    public static final t5 r;
    public static final t5 s;
    public static final t5 t;
    public static final t5 u;
    public static final t5 v;
    public static final t5 w;
    public static final t5 x;
    public static final t5 y;
    public static final t5 z;
    public final /* synthetic */ int f;

    static {
        int i2 = 0;
        g = new t5(i2, 0);
        h = new t5(i2, 1);
        i = new t5(i2, 2);
        j = new t5(i2, 3);
        k = new t5(i2, 4);
        l = new t5(i2, 5);
        m = new t5(i2, 6);
        n = new t5(i2, 7);
        o = new t5(i2, 8);
        p = new t5(i2, 9);
        q = new t5(i2, 10);
        r = new t5(i2, 11);
        s = new t5(i2, 12);
        t = new t5(i2, 13);
        u = new t5(i2, 14);
        v = new t5(i2, 15);
        w = new t5(i2, 16);
        x = new t5(i2, 17);
        y = new t5(i2, 18);
        z = new t5(i2, 19);
        A = new t5(i2, 20);
        B = new t5(i2, 21);
        C = new t5(i2, 22);
        D = new t5(i2, 23);
        E = new t5(i2, 24);
        F = new t5(i2, 25);
        G = new t5(i2, 26);
        H = new t5(i2, 27);
        I = new t5(i2, 28);
        J = new t5(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.ti0
    public final Object a() {
        Choreographer choreographer;
        int i2 = 2;
        sx sxVar = null;
        switch (this.f) {
            case 0:
                u5.a("LocalConfiguration");
                throw null;
            case 1:
                u5.a("LocalContext");
                throw null;
            case 2:
                u5.a("LocalImageVectorCache");
                throw null;
            case 3:
                u5.a("LocalResourceIdCache");
                throw null;
            case 4:
                u5.a("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    j30 j30Var = u50.a;
                    choreographer = (Choreographer) dv1.J(o51.a, new v9(i2, sxVar, 0));
                }
                y9 y9Var = new y9(choreographer, ei1.m(Looper.getMainLooper()));
                return ex.F(y9Var, y9Var.p);
            case 10:
                return new ax0(2);
            case 11:
            case 12:
                return null;
            case 13:
                yv.b("LocalAutofillManager");
                throw null;
            case 14:
                yv.b("LocalAutofillTree");
                throw null;
            case 15:
                yv.b("LocalClipboard");
                throw null;
            case 16:
                yv.b("LocalClipboardManager");
                throw null;
            case 17:
                return Boolean.TRUE;
            case 18:
                yv.b("LocalDensity");
                throw null;
            case 19:
                yv.b("LocalFocusManager");
                throw null;
            case 20:
                yv.b("LocalFontFamilyResolver");
                throw null;
            case 21:
                yv.b("LocalFontLoader");
                throw null;
            case 22:
                yv.b("LocalGraphicsContext");
                throw null;
            case 23:
                yv.b("LocalHapticFeedback");
                throw null;
            case 24:
                yv.b("LocalInputManager");
                throw null;
            case 25:
                yv.b("LocalLayoutDirection");
                throw null;
            case 26:
                return null;
            case 27:
                yv.b("LocalProvidableLocaleList");
                throw null;
            case 28:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
