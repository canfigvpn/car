package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vf0 implements sf0 {
    public final e5 a;
    public final e5 b;
    public final qf0 d;
    public i91 f;
    public cg0 h;
    public final cg0 c = new cg0(2, null, 14);
    public final tf0 e = new tf0(this);
    public final p91 g = new p91(1);

    public vf0(e5 e5Var, e5 e5Var2) {
        this.a = e5Var;
        this.b = e5Var2;
        this.d = new qf0(this, e5Var2);
    }

    public final boolean a(boolean z) {
        he1 he1Var;
        if (f() != null) {
            cg0 cg0VarF = f();
            i(null);
            if (cg0VarF != null) {
                bg0 bg0Var = bg0.e;
                bg0 bg0Var2 = bg0.g;
                cg0VarF.G0(bg0Var, bg0Var2);
                if (!cg0VarF.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71 t71Var = cg0VarF.e.i;
                ax0 ax0VarV = qx.V(cg0VarF);
                while (ax0VarV != null) {
                    if ((ax0VarV.I.f.h & 1024) != 0) {
                        while (t71Var != null) {
                            if ((t71Var.g & 1024) != 0) {
                                t71 t71VarP = t71Var;
                                fa1 fa1Var = null;
                                while (t71VarP != null) {
                                    if (t71VarP instanceof cg0) {
                                        ((cg0) t71VarP).G0(bg0.f, bg0Var2);
                                    } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                        int i = 0;
                                        for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                            if ((t71Var2.g & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    t71VarP = t71Var2;
                                                } else {
                                                    if (fa1Var == null) {
                                                        fa1Var = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP != null) {
                                                        fa1Var.b(t71VarP);
                                                        t71VarP = null;
                                                    }
                                                    fa1Var.b(t71Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    t71VarP = qx.P(fa1Var);
                                }
                            }
                            t71Var = t71Var.i;
                        }
                    }
                    ax0VarV = ax0VarV.u();
                    t71Var = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = qx.M(this.c).ordinal()) == 0) {
            a(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                qj.p();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        e5 e5Var = this.a;
        if (e5Var.isFocused() || e5Var.hasFocus()) {
            e5Var.clearFocus();
        } else if (e5Var.hasFocus()) {
            View viewFindFocus = e5Var.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            e5Var.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0151 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x015f A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0164  */
    /* JADX WARN: Code duplicated, block: B:316:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:323:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0158 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0143 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[ADDED_TO_REGION, LOOP:12: B:39:0x0076->B:67:0x00c2, LOOP_START, PHI: r6
  0x0076: PHI (r6v27 t71) = (r6v22 t71), (r6v28 t71) binds: [B:38:0x0074, B:67:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0078 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00df A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc A[ADDED_TO_REGION, LOOP:16: B:85:0x00fc->B:113:0x0148, LOOP_START, PHI: r12
  0x00fc: PHI (r12v13 t71) = (r12v8 t71), (r12v14 t71) binds: [B:84:0x00fa, B:113:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x010d A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0113 A[Catch: all -> 0x02e2, TryCatch #0 {all -> 0x02e2, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x0167, B:128:0x016d, B:129:0x0170, B:131:0x017b, B:134:0x0187, B:138:0x0191, B:141:0x0197, B:142:0x019c, B:145:0x01a4, B:147:0x01aa, B:149:0x01ae, B:151:0x01b6, B:153:0x01bc, B:157:0x01c4, B:159:0x01cd, B:160:0x01d1, B:161:0x01d4, B:164:0x01da, B:165:0x01df, B:166:0x01e2, B:168:0x01e8, B:170:0x01ec, B:173:0x01f3, B:175:0x01fb, B:182:0x0212, B:184:0x0217, B:186:0x021b, B:209:0x025d, B:190:0x0227, B:192:0x022d, B:194:0x0231, B:196:0x0239, B:198:0x023f, B:202:0x0247, B:204:0x0250, B:205:0x0254, B:206:0x0257, B:210:0x0262, B:214:0x0272, B:216:0x0277, B:218:0x027b, B:241:0x02bd, B:222:0x0287, B:224:0x028d, B:226:0x0291, B:228:0x0299, B:230:0x029f, B:234:0x02a7, B:236:0x02b0, B:237:0x02b4, B:238:0x02b7, B:243:0x02c4, B:245:0x02cb, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x0078, B:44:0x0082, B:75:0x00d5, B:77:0x00d9, B:47:0x0087, B:49:0x008d, B:51:0x0091, B:53:0x0099, B:55:0x009f, B:59:0x00a7, B:61:0x00b0, B:62:0x00b4, B:63:0x00b7, B:66:0x00bd, B:67:0x00c2, B:68:0x00c5, B:70:0x00cb, B:72:0x00cf, B:78:0x00df, B:80:0x00e5, B:81:0x00e8, B:83:0x00f2, B:86:0x00fe, B:90:0x0108, B:121:0x015b, B:123:0x015f, B:93:0x010d, B:95:0x0113, B:97:0x0117, B:99:0x011f, B:101:0x0125, B:105:0x012d, B:107:0x0136, B:108:0x013a, B:109:0x013d, B:112:0x0143, B:113:0x0148, B:114:0x014b, B:116:0x0151, B:118:0x0155), top: B:255:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [fa1] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [fa1] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [t71] */
    /* JADX WARN: Type inference failed for: r12v24, types: [t71] */
    /* JADX WARN: Type inference failed for: r12v28, types: [t71] */
    /* JADX WARN: Type inference failed for: r12v29, types: [t71] */
    /* JADX WARN: Type inference failed for: r12v33, types: [t71] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [t71] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [fa1] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [fa1] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v37 */
    public final boolean d(KeyEvent keyEvent, ti0 ti0Var) {
        t71 t71Var;
        ax0 ax0VarV;
        Object obj;
        Object obj2;
        t71 t71Var2;
        he1 he1Var;
        t71 t71VarP;
        fa1 fa1Var;
        t71 t71Var3;
        ax0 ax0VarV2;
        Object obj3;
        Object obj4;
        he1 he1Var2;
        fa1 fa1Var2;
        t71 t71VarP2;
        int size;
        he1 he1Var3;
        boolean z;
        cg0 cg0Var = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!j(keyEvent)) {
                Trace.endSection();
                return false;
            }
            cg0 cg0VarO = ux.o(cg0Var);
            if (cg0VarO != null) {
                if (!cg0VarO.e.r) {
                    vp0.b("visitLocalDescendants called on an unattached node");
                }
                t71 t71Var4 = cg0VarO.e;
                if ((t71Var4.h & 9216) != 0) {
                    t71Var2 = null;
                    for (t71 t71Var5 = t71Var4.j; t71Var5 != null; t71Var5 = t71Var5.j) {
                        int i = t71Var5.g;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            t71Var2 = t71Var5;
                        }
                    }
                } else {
                    t71Var2 = null;
                }
                if (t71Var2 == null) {
                    if (cg0VarO == null) {
                        if (!cg0Var.e.r) {
                            vp0.b("visitAncestors called on an unattached node");
                        }
                        t71Var = cg0Var.e.i;
                        ax0VarV = qx.V(cg0Var);
                        loop15: while (true) {
                            if (ax0VarV != null) {
                                obj = null;
                                break;
                            }
                            if ((ax0VarV.I.f.h & 8192) != 0) {
                                while (t71Var != null) {
                                    if ((t71Var.g & 8192) != 0) {
                                        t71VarP = t71Var;
                                        fa1Var = null;
                                        while (t71VarP != null) {
                                            if (t71VarP instanceof vv0) {
                                                obj = t71VarP;
                                                break loop15;
                                            }
                                            if ((t71VarP.g & 8192) == 0) {
                                            }
                                            t71VarP = qx.P(fa1Var);
                                        }
                                    }
                                    t71Var = t71Var.i;
                                }
                            }
                            ax0VarV = ax0VarV.u();
                            if (ax0VarV != null) {
                            }
                        }
                        obj2 = (vv0) obj;
                        if (obj2 != null) {
                            t71Var2 = ((t71) obj2).e;
                        } else {
                            t71Var2 = null;
                        }
                    } else {
                        if (!cg0VarO.e.r) {
                            vp0.b("visitAncestors called on an unattached node");
                        }
                        t71Var3 = cg0VarO.e;
                        ax0VarV2 = qx.V(cg0VarO);
                        loop11: while (true) {
                            if (ax0VarV2 != null) {
                                obj3 = null;
                                break;
                            }
                            if ((ax0VarV2.I.f.h & 8192) != 0) {
                                while (t71Var3 != null) {
                                    if ((t71Var3.g & 8192) != 0) {
                                        fa1Var2 = null;
                                        t71VarP2 = t71Var3;
                                        while (t71VarP2 != null) {
                                            if (t71VarP2 instanceof vv0) {
                                                obj3 = t71VarP2;
                                                break loop11;
                                            }
                                            if ((t71VarP2.g & 8192) == 0) {
                                            }
                                            t71VarP2 = qx.P(fa1Var2);
                                        }
                                    }
                                    t71Var3 = t71Var3.i;
                                }
                            }
                            ax0VarV2 = ax0VarV2.u();
                            if (ax0VarV2 != null) {
                            }
                        }
                        obj4 = (vv0) obj3;
                        if (obj4 != null) {
                            t71Var2 = ((t71) obj4).e;
                        } else {
                            if (!cg0Var.e.r) {
                                vp0.b("visitAncestors called on an unattached node");
                            }
                            t71Var = cg0Var.e.i;
                            ax0VarV = qx.V(cg0Var);
                            loop15: while (true) {
                                if (ax0VarV != null) {
                                    obj = null;
                                    break;
                                }
                                if ((ax0VarV.I.f.h & 8192) != 0) {
                                    while (t71Var != null) {
                                        if ((t71Var.g & 8192) != 0) {
                                            t71VarP = t71Var;
                                            fa1Var = null;
                                            while (t71VarP != null) {
                                                if (t71VarP instanceof vv0) {
                                                    obj = t71VarP;
                                                    break loop15;
                                                }
                                                if ((t71VarP.g & 8192) == 0) {
                                                }
                                                t71VarP = qx.P(fa1Var);
                                            }
                                        }
                                        t71Var = t71Var.i;
                                    }
                                }
                                ax0VarV = ax0VarV.u();
                                if (ax0VarV != null) {
                                }
                            }
                            obj2 = (vv0) obj;
                            if (obj2 != null) {
                                t71Var2 = ((t71) obj2).e;
                            } else {
                                t71Var2 = null;
                            }
                        }
                    }
                }
            } else if (cg0VarO == null) {
                if (!cg0Var.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71Var = cg0Var.e.i;
                ax0VarV = qx.V(cg0Var);
                loop15: while (true) {
                    if (ax0VarV != null) {
                        obj = null;
                        break;
                    }
                    if ((ax0VarV.I.f.h & 8192) != 0) {
                        while (t71Var != null) {
                            if ((t71Var.g & 8192) != 0) {
                                t71VarP = t71Var;
                                fa1Var = null;
                                while (t71VarP != null) {
                                    if (t71VarP instanceof vv0) {
                                        obj = t71VarP;
                                        break loop15;
                                    }
                                    if ((t71VarP.g & 8192) == 0 && (t71VarP instanceof c40)) {
                                        t71 t71Var6 = ((c40) t71VarP).t;
                                        int i2 = 0;
                                        while (t71Var6 != null) {
                                            if ((t71Var6.g & 8192) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    t71VarP = t71VarP;
                                                    fa1Var = fa1Var;
                                                    fa1Var = fa1Var;
                                                    t71VarP = t71Var6;
                                                } else {
                                                    if (fa1Var == null) {
                                                        fa1Var = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP != null) {
                                                        fa1Var.b(t71VarP);
                                                        t71VarP = null;
                                                    }
                                                    fa1Var.b(t71Var6);
                                                }
                                            } else {
                                                t71VarP = t71VarP;
                                                fa1Var = fa1Var;
                                            }
                                            t71Var6 = t71Var6.j;
                                            t71VarP = t71VarP;
                                            fa1Var = fa1Var;
                                        }
                                        if (i2 == 1) {
                                            t71VarP = t71VarP;
                                            fa1Var = fa1Var;
                                        } else {
                                            t71VarP = t71VarP;
                                            fa1Var = fa1Var;
                                        }
                                    }
                                    t71VarP = qx.P(fa1Var);
                                }
                            }
                            t71Var = t71Var.i;
                        }
                    }
                    ax0VarV = ax0VarV.u();
                    t71Var = (ax0VarV != null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
                }
                obj2 = (vv0) obj;
                if (obj2 != null) {
                    t71Var2 = ((t71) obj2).e;
                } else {
                    t71Var2 = null;
                }
            } else {
                if (!cg0VarO.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71Var3 = cg0VarO.e;
                ax0VarV2 = qx.V(cg0VarO);
                loop11: while (true) {
                    if (ax0VarV2 != null) {
                        obj3 = null;
                        break;
                    }
                    if ((ax0VarV2.I.f.h & 8192) != 0) {
                        while (t71Var3 != null) {
                            if ((t71Var3.g & 8192) != 0) {
                                fa1Var2 = null;
                                t71VarP2 = t71Var3;
                                while (t71VarP2 != null) {
                                    if (t71VarP2 instanceof vv0) {
                                        obj3 = t71VarP2;
                                        break loop11;
                                    }
                                    if ((t71VarP2.g & 8192) == 0 && (t71VarP2 instanceof c40)) {
                                        t71 t71Var7 = ((c40) t71VarP2).t;
                                        int i3 = 0;
                                        while (t71Var7 != null) {
                                            if ((t71Var7.g & 8192) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    t71VarP2 = t71VarP2;
                                                    fa1Var2 = fa1Var2;
                                                    fa1Var2 = fa1Var2;
                                                    t71VarP2 = t71Var7;
                                                } else {
                                                    if (fa1Var2 == null) {
                                                        fa1Var2 = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP2 != null) {
                                                        fa1Var2.b(t71VarP2);
                                                        t71VarP2 = null;
                                                    }
                                                    fa1Var2.b(t71Var7);
                                                }
                                            } else {
                                                t71VarP2 = t71VarP2;
                                                fa1Var2 = fa1Var2;
                                            }
                                            t71Var7 = t71Var7.j;
                                            t71VarP2 = t71VarP2;
                                            fa1Var2 = fa1Var2;
                                        }
                                        if (i3 == 1) {
                                            t71VarP2 = t71VarP2;
                                            fa1Var2 = fa1Var2;
                                        } else {
                                            t71VarP2 = t71VarP2;
                                            fa1Var2 = fa1Var2;
                                        }
                                    }
                                    t71VarP2 = qx.P(fa1Var2);
                                }
                            }
                            t71Var3 = t71Var3.i;
                        }
                    }
                    ax0VarV2 = ax0VarV2.u();
                    t71Var3 = (ax0VarV2 != null || (he1Var2 = ax0VarV2.I) == null) ? null : he1Var2.e;
                }
                obj4 = (vv0) obj3;
                if (obj4 != null) {
                    t71Var2 = ((t71) obj4).e;
                } else {
                    if (!cg0Var.e.r) {
                        vp0.b("visitAncestors called on an unattached node");
                    }
                    t71Var = cg0Var.e.i;
                    ax0VarV = qx.V(cg0Var);
                    loop15: while (true) {
                        if (ax0VarV != null) {
                            obj = null;
                            break;
                        }
                        if ((ax0VarV.I.f.h & 8192) != 0) {
                            while (t71Var != null) {
                                if ((t71Var.g & 8192) != 0) {
                                    t71VarP = t71Var;
                                    fa1Var = null;
                                    while (t71VarP != null) {
                                        if (t71VarP instanceof vv0) {
                                            obj = t71VarP;
                                            break loop15;
                                        }
                                        if ((t71VarP.g & 8192) == 0) {
                                        }
                                        t71VarP = qx.P(fa1Var);
                                    }
                                }
                                t71Var = t71Var.i;
                            }
                        }
                        ax0VarV = ax0VarV.u();
                        if (ax0VarV != null) {
                        }
                    }
                    obj2 = (vv0) obj;
                    if (obj2 != null) {
                        t71Var2 = ((t71) obj2).e;
                    } else {
                        t71Var2 = null;
                    }
                }
            }
            if (t71Var2 != null) {
                if (!t71Var2.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71 t71Var8 = t71Var2.e.i;
                ax0 ax0VarV3 = qx.V(t71Var2);
                ArrayList arrayList = null;
                while (ax0VarV3 != null) {
                    if ((ax0VarV3.I.f.h & 8192) != 0) {
                        while (t71Var8 != null) {
                            if ((t71Var8.g & 8192) != 0) {
                                t71 t71VarP3 = t71Var8;
                                fa1 fa1Var3 = null;
                                while (t71VarP3 != null) {
                                    if (t71VarP3 instanceof vv0) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(t71VarP3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (t71VarP3.g & 8192) != 0 && (t71VarP3 instanceof c40)) {
                                        int i4 = 0;
                                        for (t71 t71Var9 = ((c40) t71VarP3).t; t71Var9 != null; t71Var9 = t71Var9.j) {
                                            if ((t71Var9.g & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    t71VarP3 = t71Var9;
                                                } else {
                                                    if (fa1Var3 == null) {
                                                        fa1Var3 = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP3 != null) {
                                                        fa1Var3.b(t71VarP3);
                                                        t71VarP3 = null;
                                                    }
                                                    fa1Var3.b(t71Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    t71VarP3 = qx.P(fa1Var3);
                                }
                            }
                            t71Var8 = t71Var8.i;
                        }
                    }
                    ax0VarV3 = ax0VarV3.u();
                    t71Var8 = (ax0VarV3 == null || (he1Var3 = ax0VarV3.I) == null) ? null : he1Var3.e;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((vv0) arrayList.get(size)).k(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? P = t71Var2.e;
                ?? fa1Var4 = 0;
                while (P != 0) {
                    if (P instanceof vv0) {
                        if (((vv0) P).k(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((P.g & 8192) != 0 && (P instanceof c40)) {
                        t71 t71Var10 = ((c40) P).t;
                        int i6 = 0;
                        while (t71Var10 != null) {
                            if ((t71Var10.g & 8192) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    fa1Var4 = fa1Var4;
                                    P = P;
                                    fa1Var4 = fa1Var4;
                                    P = t71Var10;
                                } else {
                                    if (fa1Var4 == 0) {
                                        fa1Var4 = new fa1(new t71[16]);
                                    }
                                    if (P != 0) {
                                        fa1Var4.b(P);
                                        P = 0;
                                    }
                                    fa1Var4.b(t71Var10);
                                }
                            } else {
                                fa1Var4 = fa1Var4;
                                P = P;
                            }
                            t71Var10 = t71Var10.j;
                            fa1Var4 = fa1Var4;
                            P = P;
                        }
                        if (i6 == 1) {
                            fa1Var4 = fa1Var4;
                            P = P;
                        } else {
                            fa1Var4 = fa1Var4;
                            P = P;
                        }
                    }
                    P = qx.P(fa1Var4);
                }
                if (((Boolean) ti0Var.a()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? P2 = t71Var2.e;
                ?? fa1Var5 = 0;
                while (P2 != 0) {
                    if (P2 instanceof vv0) {
                        if (((vv0) P2).R(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((P2.g & 8192) != 0 && (P2 instanceof c40)) {
                        t71 t71Var11 = ((c40) P2).t;
                        int i7 = 0;
                        while (t71Var11 != null) {
                            if ((t71Var11.g & 8192) != 0) {
                                i7++;
                                if (i7 == 1) {
                                    P2 = P2;
                                    fa1Var5 = fa1Var5;
                                    fa1Var5 = fa1Var5;
                                    P2 = t71Var11;
                                } else {
                                    if (fa1Var5 == 0) {
                                        fa1Var5 = new fa1(new t71[16]);
                                    }
                                    if (P2 != 0) {
                                        fa1Var5.b(P2);
                                        P2 = 0;
                                    }
                                    fa1Var5.b(t71Var11);
                                }
                            } else {
                                P2 = P2;
                                fa1Var5 = fa1Var5;
                            }
                            t71Var11 = t71Var11.j;
                            P2 = P2;
                            fa1Var5 = fa1Var5;
                        }
                        if (i7 == 1) {
                            P2 = P2;
                            fa1Var5 = fa1Var5;
                        } else {
                            P2 = P2;
                            fa1Var5 = fa1Var5;
                        }
                    }
                    P2 = qx.P(fa1Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((vv0) arrayList.get(i8)).R(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean e(int i, yr1 yr1Var, ej0 ej0Var) {
        boolean zF;
        cg0 cg0Var;
        he1 he1Var;
        cg0 cg0Var2 = this.c;
        cg0 cg0VarO = ux.o(cg0Var2);
        int i2 = 4;
        e5 e5Var = this.b;
        boolean zBooleanValue = false;
        if (cg0VarO != null) {
            kw0 layoutDirection = e5Var.getLayoutDirection();
            wf0 wf0VarH0 = cg0VarO.H0();
            xf0 xf0Var = wf0VarH0.h;
            xf0 xf0Var2 = wf0VarH0.i;
            if (i == 1) {
                xf0Var = wf0VarH0.b;
            } else if (i == 2) {
                xf0Var = wf0VarH0.c;
            } else if (i == 5) {
                xf0Var = wf0VarH0.d;
            } else if (i == 6) {
                xf0Var = wf0VarH0.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        qj.p();
                        return null;
                    }
                    xf0Var = xf0Var2;
                }
                if (xf0Var == xf0.b) {
                    xf0Var = null;
                }
                if (xf0Var == null) {
                    xf0Var = wf0VarH0.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    xf0Var = xf0Var2;
                } else if (iOrdinal2 != 1) {
                    qj.p();
                    return null;
                }
                if (xf0Var == xf0.b) {
                    xf0Var = null;
                }
                if (xf0Var == null) {
                    xf0Var = wf0VarH0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    fu1.h("invalid FocusDirection");
                    return null;
                }
                vf0 vf0Var = (vf0) ((e5) qx.W(cg0VarO)).getFocusOwner();
                cg0 cg0VarF = vf0Var.f();
                if (i == 7) {
                    wf0VarH0.j.getClass();
                } else {
                    wf0VarH0.k.getClass();
                }
                xf0Var = cg0VarF != vf0Var.f() ? xf0.d : xf0.b;
            }
            xf0 xf0Var3 = xf0.c;
            if (!ws0.j(xf0Var, xf0Var3)) {
                if (ws0.j(xf0Var, xf0.d)) {
                    cg0 cg0VarO2 = ux.o(cg0Var2);
                    if (cg0VarO2 != null) {
                        return (Boolean) ej0Var.h(cg0VarO2);
                    }
                } else {
                    xf0 xf0Var4 = xf0.b;
                    if (!ws0.j(xf0Var, xf0Var4)) {
                        if (xf0Var == xf0Var4) {
                            fu1.h("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (xf0Var == xf0Var3) {
                            fu1.h("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        fa1 fa1Var = xf0Var.a;
                        int i3 = fa1Var.g;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = fa1Var.e;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                Object obj = (zf0) objArr[i4];
                                if (!((t71) obj).e.r) {
                                    vp0.b("visitChildren called on an unattached node");
                                }
                                fa1 fa1Var2 = new fa1(new t71[16]);
                                t71 t71Var = ((t71) obj).e;
                                t71 t71Var2 = t71Var.j;
                                if (t71Var2 == null) {
                                    qx.j(fa1Var2, t71Var);
                                } else {
                                    fa1Var2.b(t71Var2);
                                }
                                while (true) {
                                    int i5 = fa1Var2.g;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    t71 t71VarP = (t71) fa1Var2.k(i5 - 1);
                                    if ((t71VarP.h & 1024) == 0) {
                                        qx.j(fa1Var2, t71VarP);
                                    } else {
                                        while (t71VarP != null) {
                                            if ((t71VarP.g & 1024) != 0) {
                                                fa1 fa1Var3 = null;
                                                while (t71VarP != null) {
                                                    if (t71VarP instanceof cg0) {
                                                        if (((Boolean) ej0Var.h((cg0) t71VarP)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                                        int i6 = 0;
                                                        for (t71 t71Var3 = ((c40) t71VarP).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                                            if ((t71Var3.g & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    t71VarP = t71Var3;
                                                                } else {
                                                                    if (fa1Var3 == null) {
                                                                        fa1Var3 = new fa1(new t71[16]);
                                                                    }
                                                                    if (t71VarP != null) {
                                                                        fa1Var3.b(t71VarP);
                                                                        t71VarP = null;
                                                                    }
                                                                    fa1Var3.b(t71Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    t71VarP = qx.P(fa1Var3);
                                                }
                                                break;
                                            }
                                            t71VarP = t71VarP.j;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        cg0VarO = null;
        kw0 layoutDirection2 = e5Var.getLayoutDirection();
        na naVar = new na(cg0VarO, this, ej0Var, i2);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zF = vv.k(cg0Var2, naVar);
            } else {
                if (i != 2) {
                    fu1.h("This function should only be used for 1-D focus search");
                    return null;
                }
                zF = vv.f(cg0Var2, naVar);
            }
            return Boolean.valueOf(zF);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return y12.w(i, naVar, cg0Var2, yr1Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    qj.p();
                    return null;
                }
                i2 = 3;
            }
            cg0 cg0VarO3 = ux.o(cg0Var2);
            if (cg0VarO3 != null) {
                return y12.w(i2, naVar, cg0VarO3, yr1Var);
            }
            return null;
        }
        if (i != 8) {
            fu1.g(lf0.a(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        cg0 cg0VarO4 = ux.o(cg0Var2);
        if (cg0VarO4 == null) {
            cg0Var = null;
            break;
        }
        if (!cg0VarO4.e.r) {
            vp0.b("visitAncestors called on an unattached node");
        }
        t71 t71Var4 = cg0VarO4.e.i;
        ax0 ax0VarV = qx.V(cg0VarO4);
        loop5: while (true) {
            if (ax0VarV == null) {
                cg0Var = null;
                break;
            }
            if ((ax0VarV.I.f.h & 1024) != 0) {
                while (t71Var4 != null) {
                    if ((t71Var4.g & 1024) != 0) {
                        t71 t71VarP2 = t71Var4;
                        fa1 fa1Var4 = null;
                        while (t71VarP2 != null) {
                            if (t71VarP2 instanceof cg0) {
                                cg0 cg0Var3 = (cg0) t71VarP2;
                                if (cg0Var3.H0().a) {
                                    cg0Var = cg0Var3;
                                    break loop5;
                                }
                            } else if ((t71VarP2.g & 1024) != 0 && (t71VarP2 instanceof c40)) {
                                int i7 = 0;
                                for (t71 t71Var5 = ((c40) t71VarP2).t; t71Var5 != null; t71Var5 = t71Var5.j) {
                                    if ((t71Var5.g & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            t71VarP2 = t71Var5;
                                        } else {
                                            if (fa1Var4 == null) {
                                                fa1Var4 = new fa1(new t71[16]);
                                            }
                                            if (t71VarP2 != null) {
                                                fa1Var4.b(t71VarP2);
                                                t71VarP2 = null;
                                            }
                                            fa1Var4.b(t71Var5);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    t71VarP2 = qx.P(fa1Var4);
                                }
                            }
                            t71VarP2 = qx.P(fa1Var4);
                        }
                    }
                    t71Var4 = t71Var4.i;
                }
            }
            ax0VarV = ax0VarV.u();
            t71Var4 = (ax0VarV == null || (he1Var = ax0VarV.I) == null) ? null : he1Var.e;
        }
        if (cg0Var != null && cg0Var != cg0Var2) {
            zBooleanValue = ((Boolean) naVar.h(cg0Var)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final cg0 f() {
        cg0 cg0Var = this.h;
        if (cg0Var == null || !cg0Var.r) {
            return null;
        }
        return cg0Var;
    }

    public final boolean g(int i, boolean z) {
        gs1 gs1Var = new gs1();
        gs1Var.e = Boolean.FALSE;
        cg0 cg0VarF = f();
        Boolean boolE = e(i, this.a.getEmbeddedViewFocusRect(), new uf0(gs1Var, i));
        if (!ws0.j(boolE, Boolean.TRUE) || cg0VarF == f()) {
            if (boolE != null && gs1Var.e != null) {
                if (!boolE.booleanValue() || !((Boolean) gs1Var.e).booleanValue()) {
                    if ((i == 1 || i == 2) && z && b(i, false, false)) {
                        Boolean boolE2 = e(i, null, new a5(i, 3));
                        if (boolE2 != null ? boolE2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(int i) {
        if (!b(i, false, false)) {
            return false;
        }
        Boolean boolE = e(i, null, new a5(i, 2));
        boolean zBooleanValue = boolE != null ? boolE.booleanValue() : false;
        if (!zBooleanValue) {
            c();
        }
        return zBooleanValue;
    }

    public final void i(cg0 cg0Var) {
        cg0 cg0Var2 = this.h;
        this.h = cg0Var;
        p91 p91Var = this.g;
        Object[] objArr = p91Var.a;
        int i = p91Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((rf0) objArr[i2]).a(cg0Var2, cg0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        int i;
        long j;
        int iNumberOfTrailingZeros2;
        int i2;
        long[] jArr;
        int i3;
        boolean z;
        long jD0 = sv0.d0(keyEvent);
        int iG0 = sv0.g0(keyEvent);
        int i4 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i5 = 0;
        int i6 = 1;
        if (iG0 != 2) {
            if (iG0 != 1) {
                return true;
            }
            i91 i91Var = this.f;
            if (i91Var == null || !i91Var.a(jD0)) {
                return false;
            }
            i91 i91Var2 = this.f;
            if (i91Var2 != null) {
                int iHashCode = Long.hashCode(jD0) * (-862048943);
                int i7 = iHashCode ^ (iHashCode << 16);
                int i8 = i7 & 127;
                int i9 = i91Var2.c;
                int i10 = i7 >>> 7;
                loop5: while (true) {
                    int i11 = i10 & i9;
                    long[] jArr2 = i91Var2.a;
                    int i12 = i11 >> 3;
                    int i13 = (i11 & 7) << 3;
                    long j3 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
                    long j4 = (((long) i8) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i11) & i9;
                        if (i91Var2.b[iNumberOfTrailingZeros] == jD0) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i5 += 8;
                    i10 = i11 + i5;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    i91Var2.d--;
                    long[] jArr3 = i91Var2.a;
                    int i14 = i91Var2.c;
                    int i15 = iNumberOfTrailingZeros >> 3;
                    int i16 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr3[i15] & (~(255 << i16))) | (254 << i16);
                    jArr3[i15] = j6;
                    jArr3[(((iNumberOfTrailingZeros - 7) & i14) + (i14 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        i91 i91Var3 = this.f;
        if (i91Var3 == null) {
            i91Var3 = new i91(3);
            this.f = i91Var3;
        }
        i91 i91Var4 = i91Var3;
        int iHashCode2 = Long.hashCode(jD0) * (-862048943);
        int i17 = iHashCode2 ^ (iHashCode2 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = i91Var4.c;
        int i21 = i18 & i20;
        int i22 = 0;
        loop0: while (true) {
            long[] jArr4 = i91Var4.a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            long j7 = (jArr4[i23] >>> i24) | ((jArr4[i23 + 1] << (64 - i24)) & ((-i24) >> 63));
            int i25 = i4;
            long j8 = i19;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i21 + (Long.numberOfTrailingZeros(j10) >> 3)) & i20;
                long j11 = j2;
                if (i91Var4.b[iNumberOfTrailingZeros2] == jD0) {
                    z = 1;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB = i91Var4.b(i18);
                if (i91Var4.e != 0 || ((i91Var4.a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    i = 1;
                    j = 128;
                } else {
                    int i26 = i91Var4.c;
                    if (i26 <= 8 || Long.compare((((long) i91Var4.d) * 32) ^ Long.MIN_VALUE, (((long) i26) * 25) ^ Long.MIN_VALUE) > 0) {
                        i2 = 1;
                        j = 128;
                        int iB2 = jx1.b(i91Var4.c);
                        long[] jArr5 = i91Var4.a;
                        long[] jArr6 = i91Var4.b;
                        int i27 = i91Var4.c;
                        i91Var4.c(iB2);
                        long[] jArr7 = i91Var4.a;
                        long[] jArr8 = i91Var4.b;
                        int i28 = i91Var4.c;
                        int i29 = 0;
                        while (i29 < i27) {
                            if (((jArr5[i29 >> 3] >> ((i29 & 7) << 3)) & 255) < 128) {
                                long j13 = jArr6[i29];
                                int iHashCode3 = Long.hashCode(j13) * i25;
                                int i30 = iHashCode3 ^ (iHashCode3 << 16);
                                int iB3 = i91Var4.b(i30 >>> 7);
                                jArr = jArr7;
                                int i31 = iB3 >> 3;
                                int i32 = (iB3 & 7) << 3;
                                long j14 = (jArr[i31] & (~(255 << i32))) | (((long) (i30 & 127)) << i32);
                                jArr[i31] = j14;
                                jArr[(((iB3 - 7) & i28) + (i28 & 7)) >> 3] = j14;
                                jArr8[iB3] = j13;
                            } else {
                                jArr = jArr7;
                            }
                            i29++;
                            jArr5 = jArr5;
                            jArr7 = jArr;
                            jArr6 = jArr6;
                            i2 = i2;
                        }
                    } else {
                        long[] jArr9 = i91Var4.a;
                        int i33 = i91Var4.c;
                        long[] jArr10 = i91Var4.b;
                        int i34 = (i33 + 7) >> 3;
                        int i35 = 0;
                        while (i35 < i34) {
                            long j15 = jArr9[i35] & (-9187201950435737472L);
                            jArr9[i35] = ((~j15) + (j15 >>> 7)) & (-72340172838076674L);
                            i35++;
                            c = c;
                            i33 = i33;
                        }
                        char c2 = c;
                        int i36 = i33;
                        j = 128;
                        int iF0 = ve.F0(jArr9);
                        int i37 = iF0 - 1;
                        long j16 = 72057594037927935L;
                        jArr9[i37] = (jArr9[i37] & 72057594037927935L) | (-72057594037927936L);
                        jArr9[iF0] = jArr9[0];
                        int i38 = i36;
                        int i39 = 0;
                        while (i39 != i38) {
                            int i40 = i39 >> 3;
                            int i41 = (i39 & 7) << 3;
                            long j17 = (jArr9[i40] >> i41) & 255;
                            if (j17 != 128 && j17 == 254) {
                                int iHashCode4 = Long.hashCode(jArr10[i39]) * i25;
                                int i42 = iHashCode4 ^ (iHashCode4 << 16);
                                long j18 = j16;
                                int i43 = i42 >>> 7;
                                int iB4 = i91Var4.b(i43);
                                int i44 = i43 & i38;
                                char c3 = c2;
                                if (((iB4 - i44) & i38) / 8 == ((i39 - i44) & i38) / 8) {
                                    int i45 = i6;
                                    jArr9[i40] = (jArr9[i40] & (~(255 << i41))) | (((long) (i42 & 127)) << i41);
                                    jArr9[jArr9.length - i45] = (jArr9[0] & j18) | Long.MIN_VALUE;
                                    i39++;
                                    i6 = i45;
                                    j16 = j18;
                                    c2 = c3;
                                } else {
                                    int i46 = i6;
                                    int i47 = iB4 >> 3;
                                    long j19 = jArr9[i47];
                                    int i48 = (iB4 & 7) << 3;
                                    if (((j19 >> i48) & 255) == 128) {
                                        int i49 = i39;
                                        jArr9[i47] = (j19 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                        jArr9[i40] = (jArr9[i40] & (~(255 << i41))) | (128 << i41);
                                        jArr10[iB4] = jArr10[i49];
                                        jArr10[i49] = j12;
                                        i3 = i49;
                                    } else {
                                        int i50 = i39;
                                        jArr9[i47] = (j19 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                        long j20 = jArr10[iB4];
                                        jArr10[iB4] = jArr10[i50];
                                        jArr10[i50] = j20;
                                        i3 = i50 - 1;
                                    }
                                    jArr9[jArr9.length - i46] = (jArr9[0] & j18) | Long.MIN_VALUE;
                                    i39 = i3 + i46;
                                    i6 = i46;
                                    j16 = j18;
                                    c2 = c3;
                                    i38 = i38;
                                }
                            } else {
                                i39++;
                            }
                        }
                        i2 = i6;
                        i91Var4.e = jx1.a(i91Var4.c) - i91Var4.d;
                    }
                    i = i2;
                    iB = i91Var4.b(i18);
                }
                iNumberOfTrailingZeros2 = iB;
                i91Var4.d++;
                int i51 = i91Var4.e;
                long[] jArr11 = i91Var4.a;
                int i52 = iNumberOfTrailingZeros2 >> 3;
                long j21 = jArr11[i52];
                int i53 = (iNumberOfTrailingZeros2 & 7) << 3;
                i91Var4.e = i51 - (((j21 >> i53) & 255) == j ? i == true ? 1 : 0 : 0);
                int i54 = i91Var4.c;
                long j22 = (j21 & (~(255 << i53))) | (j8 << i53);
                jArr11[i52] = j22;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i54) + (i54 & 7)) >> 3] = j22;
                z = i;
                break;
            }
            i22 += 8;
            i21 = (i21 + i22) & i20;
            i4 = i25;
            j2 = j12;
        }
        i91Var4.b[iNumberOfTrailingZeros2] = jD0;
        return z;
    }
}
