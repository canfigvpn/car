package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yv {
    public static final a90 a = new a90(1, t5.r);
    public static final a90 b = new a90(1, t5.s);
    public static final a90 c = new a90(1, t5.u);
    public static final a90 d = new a90(1, t5.t);
    public static final a90 e = new a90(1, t5.w);
    public static final a90 f = new a90(1, t5.v);
    public static final a90 g = new a90(1, t5.C);
    public static final a90 h = new a90(1, t5.y);
    public static final a90 i = new a90(1, t5.z);
    public static final a90 j = new a90(1, t5.B);
    public static final a90 k = new a90(1, t5.A);
    public static final a90 l = new a90(1, t5.D);
    public static final a90 m = new a90(1, t5.E);
    public static final a90 n = new a90(1, t5.F);
    public static final a90 o = new a90(1, t5.H);
    public static final a90 p;
    public static final a90 q;
    public static final a90 r;
    public static final a90 s;
    public static final a90 t;
    public static final a90 u;
    public static final a90 v;
    public static final a90 w;
    public static final a90 x;

    static {
        vv.G(new m2(13));
        p = new a90(1, wv.g);
        q = new a90(1, t5.J);
        r = new a90(1, wv.h);
        s = new a90(1, wv.i);
        t = new a90(1, wv.j);
        u = new a90(1, wv.k);
        v = new a90(1, t5.G);
        w = new a90(0, t5.I);
        x = new a90(1, t5.x);
    }

    public static final void a(aj1 aj1Var, is1 is1Var, gt gtVar, ak0 ak0Var, int i2) {
        ak0Var.X(1925803616);
        int i3 = (ak0Var.f(aj1Var) ? 4 : 2) | i2 | (ak0Var.f(is1Var) ? 32 : 16) | (ak0Var.h(gtVar) ? 256 : 128);
        if (ak0Var.O(i3 & 1, (i3 & 147) != 146)) {
            e5 e5Var = (e5) aj1Var;
            vq1 vq1VarA = a.a(e5Var.m3getAccessibilityManager());
            vq1 vq1VarA2 = b.a(e5Var.getAutofill());
            vq1 vq1VarA3 = d.a(e5Var.getAutofillManager());
            vq1 vq1VarA4 = c.a(e5Var.getAutofillTree());
            vq1 vq1VarA5 = e.a(e5Var.m5getClipboardManager());
            vq1 vq1VarA6 = f.a(e5Var.m4getClipboard());
            vq1 vq1VarA7 = h.a(e5Var.getDensity());
            vq1 vq1VarA8 = i.a(e5Var.getFocusOwner());
            vq1 vq1VarA9 = j.a(e5Var.getFontLoader());
            vq1VarA9.f = false;
            vq1 vq1VarA10 = k.a(e5Var.getFontFamilyResolver());
            vq1VarA10.f = false;
            sv.b(new vq1[]{vq1VarA, vq1VarA2, vq1VarA3, vq1VarA4, vq1VarA5, vq1VarA6, vq1VarA7, vq1VarA8, vq1VarA9, vq1VarA10, l.a(e5Var.getHapticFeedBack()), m.a(e5Var.getInputModeManager()), n.a(e5Var.getLayoutDirection()), p.a(e5Var.getTextInputService()), q.a(e5Var.getSoftwareKeyboardController()), r.a(e5Var.getTextToolbar()), s.a(is1Var), t.a(e5Var.getViewConfiguration()), u.a(e5Var.getWindowInfo()), v.a(e5Var.getPointerIconService()), g.a(e5Var.getGraphicsContext()), m31.a.a(e5Var.getRetainedValuesStore()), o.a(e5Var.getLocaleList())}, gtVar, ak0Var, ((i3 >> 3) & 112) | 8);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new xv(aj1Var, is1Var, gtVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
