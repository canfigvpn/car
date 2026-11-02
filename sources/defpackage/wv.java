package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class wv extends dw0 implements ti0 {
    public static final wv g;
    public static final wv h;
    public static final wv i;
    public static final wv j;
    public static final wv k;
    public static final wv l;
    public static final wv m;
    public static final wv n;
    public static final wv o;
    public static final wv p;
    public static final wv q;
    public static final wv r;
    public static final wv s;
    public final /* synthetic */ int f;

    static {
        int i2 = 0;
        g = new wv(i2, 0);
        h = new wv(i2, 1);
        i = new wv(i2, 2);
        j = new wv(i2, 3);
        k = new wv(i2, 4);
        l = new wv(i2, 5);
        m = new wv(i2, 6);
        n = new wv(i2, 7);
        o = new wv(i2, 8);
        p = new wv(i2, 9);
        q = new wv(i2, 10);
        r = new wv(i2, 11);
        s = new wv(i2, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv(int i2, int i3) {
        super(i2);
        this.f = i3;
    }

    @Override // defpackage.ti0
    public final Object a() {
        switch (this.f) {
            case 0:
                return null;
            case 1:
                yv.b("LocalTextToolbar");
                throw null;
            case 2:
                yv.b("LocalUriHandler");
                throw null;
            case 3:
                yv.b("LocalViewConfiguration");
                throw null;
            case 4:
                yv.b("LocalWindowInfo");
                throw null;
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.FALSE;
            case 7:
                return Boolean.FALSE;
            case 8:
                return new ax0(3);
            case 9:
                return new e8(new PathMeasure());
            case 10:
            case 11:
                return null;
            default:
                return ll2.a;
        }
    }
}
