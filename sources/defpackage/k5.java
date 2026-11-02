package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 extends s0 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final c91 R;
    public final zk A;
    public boolean B;
    public g5 C;
    public d91 D;
    public final e91 E;
    public final b91 F;
    public final b91 G;
    public final String H;
    public final String I;
    public final ud J;
    public final d91 K;
    public q02 L;
    public boolean M;
    public final b91 N;
    public final p O;
    public final ArrayList P;
    public final j5 Q;
    public final e5 h;
    public int i = Integer.MIN_VALUE;
    public final j5 j = new j5(this, 0);
    public final AccessibilityManager k;
    public long l;
    public List m;
    public final f5 n;
    public int o;
    public int p;
    public k1 q;
    public k1 r;
    public boolean s;
    public final d91 t;
    public final d91 u;
    public final v72 v;
    public final v72 w;
    public int x;
    public Integer y;
    public final ue z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        c91 c91Var = fr0.a;
        c91 c91Var2 = new c91(32);
        int i = c91Var2.b;
        if (i < 0) {
            qj.j("");
            return;
        }
        int i2 = i + 32;
        int[] iArrCopyOf = c91Var2.a;
        if (iArrCopyOf.length < i2) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i2, (iArrCopyOf.length * 3) / 2));
            c91Var2.a = iArrCopyOf;
        }
        int i3 = c91Var2.b;
        if (i != i3) {
            ve.u0(i2, i, i3, iArrCopyOf, iArrCopyOf);
        }
        ve.x0(i, 0, 12, iArr, iArrCopyOf);
        c91Var2.b += 32;
        R = c91Var2;
    }

    public k5(e5 e5Var) {
        this.h = e5Var;
        Object systemService = e5Var.getContext().getSystemService("accessibility");
        systemService.getClass();
        this.k = (AccessibilityManager) systemService;
        this.l = 100L;
        new Handler(Looper.getMainLooper());
        this.n = new f5(this);
        this.o = Integer.MIN_VALUE;
        this.p = Integer.MIN_VALUE;
        this.t = new d91();
        this.u = new d91();
        this.v = new v72();
        this.w = new v72();
        this.x = -1;
        this.z = new ue();
        int i = 1;
        this.A = s5.d(1, 6, null);
        this.B = true;
        d91 d91Var = hr0.a;
        d91Var.getClass();
        this.D = d91Var;
        this.E = new e91();
        this.F = new b91();
        this.G = new b91();
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.I = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.J = new ud(18);
        this.K = new d91();
        this.L = new q02(e5Var.getSemanticsOwner().a(), d91Var);
        int i2 = dr0.a;
        this.N = new b91();
        e5Var.addOnAttachStateChangeListener(this);
        this.O = new p(i, this);
        this.P = new ArrayList();
        this.Q = new j5(this, i);
    }

    public static Rect G(mx mxVar, float f, float f2) {
        if (!(mxVar instanceof hi1) && !(mxVar instanceof ii1)) {
            return null;
        }
        yr1 yr1VarW = mxVar.w();
        return new Rect((int) (yr1VarW.a + f), (int) (yr1VarW.b + f2), (int) (yr1VarW.c + f), (int) (yr1VarW.d + f2));
    }

    public static float[] I(mx mxVar) {
        if (!(mxVar instanceof ii1)) {
            return null;
        }
        hv1 hv1Var = ((ii1) mxVar).i;
        long j = hv1Var.h;
        long j2 = hv1Var.g;
        long j3 = hv1Var.f;
        long j4 = hv1Var.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region J(mx mxVar, float f, float f2) {
        if (!(mxVar instanceof gi1)) {
            return null;
        }
        gi1 gi1Var = (gi1) mxVar;
        yr1 yr1VarH = gi1Var.w().h(f, f2);
        Region region = new Region(new Rect((int) (yr1VarH.a + 0.0f), (int) (yr1VarH.b + 0.0f), (int) (yr1VarH.c + 0.0f), (int) (yr1VarH.d + 0.0f)));
        Region region2 = new Region();
        d8 d8Var = gi1Var.i;
        if (!(d8Var instanceof d8)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = d8Var.a;
        path.offset(f, f2);
        region2.setPath(path, region);
        return region2;
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
                charSequenceSubSequence.getClass();
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    public static String o(p02 p02Var) {
        yb ybVar;
        if (p02Var != null) {
            i02 i02Var = p02Var.d;
            w91 w91Var = i02Var.e;
            y02 y02Var = u02.a;
            if (w91Var.c(y02Var)) {
                return c31.a((List) i02Var.c(y02Var), ",", null, 62);
            }
            y02 y02Var2 = u02.G;
            if (w91Var.c(y02Var2)) {
                Object objG = w91Var.g(y02Var2);
                if (objG == null) {
                    objG = null;
                }
                yb ybVar2 = (yb) objG;
                if (ybVar2 != null) {
                    return ybVar2.f;
                }
            } else {
                Object objG2 = w91Var.g(u02.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (ybVar = (yb) vq.R(list)) != null) {
                    return ybVar.f;
                }
            }
        }
        return null;
    }

    public static final boolean s(nx1 nx1Var, float f) {
        ti0 ti0Var = nx1Var.a;
        if (f >= 0.0f || ((Number) ti0Var.a()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) ti0Var.a()).floatValue() < ((Number) nx1Var.b.a()).floatValue();
        }
        return true;
    }

    public static final boolean t(nx1 nx1Var) {
        ti0 ti0Var = nx1Var.a;
        if (((Number) ti0Var.a()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) ti0Var.a()).floatValue();
        ((Number) nx1Var.b.a()).floatValue();
        return false;
    }

    public static final boolean u(nx1 nx1Var) {
        ti0 ti0Var = nx1Var.a;
        if (((Number) ti0Var.a()).floatValue() < ((Number) nx1Var.b.a()).floatValue()) {
            return true;
        }
        ((Number) ti0Var.a()).floatValue();
        return false;
    }

    public static /* synthetic */ void z(k5 k5Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        k5Var.y(i, i2, num, null);
    }

    public final void A(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventJ = j(v(i), 32);
        accessibilityEventJ.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventJ.getText().add(str);
        }
        x(accessibilityEventJ);
    }

    public final void B(int i) {
        g5 g5Var = this.C;
        if (g5Var != null) {
            p02 p02Var = g5Var.a;
            if (i != p02Var.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - g5Var.f <= 1000) {
                AccessibilityEvent accessibilityEventJ = j(v(p02Var.f), 131072);
                accessibilityEventJ.setFromIndex(g5Var.d);
                accessibilityEventJ.setToIndex(g5Var.e);
                accessibilityEventJ.setAction(g5Var.b);
                accessibilityEventJ.setMovementGranularity(g5Var.c);
                accessibilityEventJ.getText().add(o(p02Var));
                x(accessibilityEventJ);
            }
        }
        this.C = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0251  */
    /* JADX WARN: Code duplicated, block: B:102:0x025e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0287  */
    /* JADX WARN: Code duplicated, block: B:109:0x0298  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:127:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:138:0x0303 A[LOOP:4: B:133:0x02f2->B:138:0x0303, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x0311  */
    /* JADX WARN: Code duplicated, block: B:146:0x0325 A[LOOP:5: B:141:0x030d->B:146:0x0325, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x034b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0355  */
    /* JADX WARN: Code duplicated, block: B:163:0x037d  */
    /* JADX WARN: Code duplicated, block: B:167:0x039e  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:172:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:174:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:182:0x0428  */
    /* JADX WARN: Code duplicated, block: B:186:0x0437  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:236:0x0504  */
    /* JADX WARN: Code duplicated, block: B:239:0x0515 A[LOOP:6: B:235:0x0502->B:239:0x0515, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0522  */
    /* JADX WARN: Code duplicated, block: B:246:0x052f  */
    /* JADX WARN: Code duplicated, block: B:249:0x053c A[PHI: r0 r7 r8 r13 r14 r15 r28 r38 r41 r53
  0x053c: PHI (r0v18 k5) = (r0v10 k5), (r0v10 k5), (r0v10 k5), (r0v10 k5), (r0v19 k5) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r7v31 int) = (r7v14 int), (r7v14 int), (r7v14 int), (r7v14 int), (r7v32 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r8v41 java.lang.Integer) = 
  (r8v25 java.lang.Integer)
  (r8v25 java.lang.Integer)
  (r8v25 java.lang.Integer)
  (r8v25 java.lang.Integer)
  (r8v42 java.lang.Integer)
 binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r13v54 int) = (r13v42 int), (r13v42 int), (r13v42 int), (r13v42 int), (r13v55 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r14v41 w91) = (r14v30 w91), (r14v30 w91), (r14v30 w91), (r14v30 w91), (r14v42 w91) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r15v37 ax0) = (r15v36 ax0), (r15v36 ax0), (r15v36 ax0), (r15v36 ax0), (r15v38 ax0) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r28v3 int) = (r28v2 int), (r28v2 int), (r28v2 int), (r28v2 int), (r28v4 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r38v12 int) = (r38v7 int), (r38v9 int), (r38v10 int), (r38v7 int), (r38v13 int) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r41v6 p02) = (r41v4 p02), (r41v4 p02), (r41v4 p02), (r41v4 p02), (r41v7 p02) binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]
  0x053c: PHI (r53v16 java.lang.Integer) = 
  (r53v12 java.lang.Integer)
  (r53v12 java.lang.Integer)
  (r53v12 java.lang.Integer)
  (r53v12 java.lang.Integer)
  (r53v17 java.lang.Integer)
 binds: [B:248:0x053a, B:233:0x04f7, B:212:0x04c2, B:211:0x04c0, B:106:0x0284] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:250:0x053e  */
    /* JADX WARN: Code duplicated, block: B:275:0x060e  */
    /* JADX WARN: Code duplicated, block: B:297:0x030a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x030c A[EDGE_INSN: B:298:0x030c->B:140:0x030c BREAK  A[LOOP:4: B:133:0x02f2->B:138:0x0303], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x032a A[EDGE_INSN: B:299:0x032a->B:148:0x032a BREAK  A[LOOP:5: B:141:0x030d->B:146:0x0325], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x050e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0178  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0219  */
    /* JADX WARN: Code duplicated, block: B:89:0x0227  */
    /* JADX WARN: Code duplicated, block: B:92:0x023a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0242  */
    /* JADX WARN: Code duplicated, block: B:96:0x0249  */
    /* JADX WARN: Code duplicated, block: B:98:0x024c  */
    public final void C(gr0 gr0Var) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        int i;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i4;
        int i5;
        int i6;
        Integer num4;
        int i7;
        i02 i02Var;
        p02 p02Var;
        int i8;
        int i9;
        int i10;
        int i11;
        w91 w91Var;
        ax0 ax0Var;
        int i12;
        i02 i02Var2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i13;
        ax0 ax0Var2;
        int i14;
        Integer num6;
        int i15;
        wx1 wx1Var;
        boolean z;
        y02 y02Var;
        int i16;
        y02 y02Var2;
        y02 y02Var3;
        String str;
        y02 y02Var4;
        int size;
        int i17;
        wx1 wx1Var2;
        Object objG;
        Object objG2;
        qj0 qj0Var;
        int i18;
        Object objG3;
        yb ybVar;
        String str2;
        Object objG4;
        yb ybVar2;
        Object objG5;
        CharSequence charSequence;
        CharSequence charSequenceK;
        int length;
        int length2;
        int i19;
        Integer num7;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean zC;
        boolean z2;
        boolean z3;
        AccessibilityEvent accessibilityEventK;
        Object objG6;
        wu1 wu1Var;
        Object objG7;
        AccessibilityEvent accessibilityEventJ;
        Object objG8;
        String strA;
        Object objG9;
        List list;
        String strA2;
        String str3;
        boolean zC2;
        int i24;
        k5 k5Var = this;
        gr0 gr0Var2 = gr0Var;
        Integer num8 = 64;
        ArrayList arrayList4 = k5Var.P;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = gr0Var2.b;
        long[] jArr3 = gr0Var2.a;
        int i25 = 2;
        int length3 = jArr3.length - 2;
        int i26 = 0;
        Integer num9 = 0;
        if (length3 < 0) {
            return;
        }
        int i27 = 0;
        while (true) {
            long j2 = jArr3[i27];
            int i28 = i25;
            int i29 = length3;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i30 = 8;
                int i31 = 8 - ((~(i27 - i29)) >>> 31);
                long j3 = j2;
                int i32 = i26;
                while (i32 < i31) {
                    if ((j3 & 255) < 128) {
                        int i33 = iArr3[(i27 << 3) + i32];
                        q02 q02Var = (q02) k5Var.K.b(i33);
                        if (q02Var == null) {
                            i3 = i32;
                            num3 = num8;
                            arrayList2 = arrayList5;
                            iArr2 = iArr3;
                            jArr2 = jArr3;
                            i4 = i31;
                            i5 = i26;
                            i6 = i27;
                            num4 = num9;
                            i7 = i30;
                        } else {
                            i02 i02Var3 = q02Var.a;
                            w91 w91Var2 = i02Var3.e;
                            s02 s02Var = (s02) gr0Var2.b(i33);
                            int i34 = i30;
                            p02 p02Var2 = s02Var != null ? s02Var.a : null;
                            if (p02Var2 == null) {
                                throw k3.g("no value for specified key");
                            }
                            ax0 ax0Var3 = p02Var2.c;
                            i02 i02Var4 = p02Var2.d;
                            iArr2 = iArr3;
                            int i35 = p02Var2.f;
                            jArr2 = jArr3;
                            w91 w91Var3 = i02Var4.e;
                            i6 = i27;
                            Object[] objArr = w91Var3.b;
                            Object[] objArr2 = w91Var3.c;
                            long[] jArr4 = w91Var3.a;
                            i3 = i32;
                            int length4 = jArr4.length - 2;
                            if (length4 >= 0) {
                                ax0 ax0Var4 = ax0Var3;
                                i4 = i31;
                                int i36 = 0;
                                i10 = 0;
                                while (true) {
                                    long j4 = jArr4[i36];
                                    p02Var = p02Var2;
                                    int i37 = i36;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length4)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j4 & 255) < 128) {
                                                int i40 = (i37 << 3) + i39;
                                                Object obj = objArr[i40];
                                                int i41 = length4;
                                                Object obj2 = objArr2[i40];
                                                i02Var2 = i02Var3;
                                                y02 y02Var5 = (y02) obj;
                                                j = j4;
                                                y02 y02Var6 = u02.v;
                                                if (ws0.j(y02Var5, y02Var6) || ws0.j(y02Var5, u02.w)) {
                                                    int size2 = arrayList5.size();
                                                    int i42 = 0;
                                                    while (true) {
                                                        if (i42 >= size2) {
                                                            wx1Var = null;
                                                            break;
                                                        }
                                                        int i43 = size2;
                                                        if (((wx1) arrayList5.get(i42)).e == i33) {
                                                            wx1Var = (wx1) arrayList5.get(i42);
                                                            break;
                                                        } else {
                                                            i42++;
                                                            size2 = i43;
                                                        }
                                                    }
                                                    if (wx1Var != null) {
                                                        z = false;
                                                    } else {
                                                        wx1Var = new wx1(i33, arrayList4);
                                                        z = true;
                                                    }
                                                    arrayList4.add(wx1Var);
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    y02Var = u02.d;
                                                    if (ws0.j(y02Var5, y02Var)) {
                                                        obj2.getClass();
                                                        str3 = (String) obj2;
                                                        zC2 = w91Var2.c(y02Var);
                                                        i24 = i34;
                                                        if (zC2) {
                                                            k5Var.A(i33, i24, str3);
                                                        }
                                                    } else {
                                                        i16 = i34;
                                                        if (ws0.j(y02Var5, u02.b)) {
                                                            z(k5Var, k5Var.v(i33), 2048, num8, i16);
                                                            z(k5Var, k5Var.v(i33), 2048, num9, i16);
                                                        } else if (ws0.j(y02Var5, u02.K)) {
                                                            z(k5Var, k5Var.v(i33), 2048, 8192, 8);
                                                            z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                        } else if (ws0.j(y02Var5, u02.M)) {
                                                            z(k5Var, k5Var.v(i33), 2048, 3072, 8);
                                                        } else if (ws0.j(y02Var5, u02.c)) {
                                                            z(k5Var, k5Var.v(i33), 2048, num8, 8);
                                                            z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                        } else {
                                                            y02Var2 = u02.J;
                                                            arrayList3 = arrayList5;
                                                            if (ws0.j(y02Var5, y02Var2)) {
                                                                objG6 = w91Var3.g(u02.z);
                                                                if (objG6 == null) {
                                                                    objG6 = null;
                                                                }
                                                                wu1Var = (wu1) objG6;
                                                                if (wu1Var == null && wu1Var.a == 4) {
                                                                    objG7 = w91Var3.g(y02Var2);
                                                                    if (objG7 == null) {
                                                                        objG7 = null;
                                                                    }
                                                                    if (ws0.j(objG7, Boolean.TRUE)) {
                                                                        accessibilityEventJ = k5Var.j(k5Var.v(i33), 4);
                                                                        p02 p02Var3 = p02Var;
                                                                        ax0Var2 = ax0Var4;
                                                                        p02 p02Var4 = new p02(p02Var3.a, true, ax0Var2, i02Var4);
                                                                        objG8 = p02Var4.k().e.g(u02.a);
                                                                        if (objG8 == null) {
                                                                            objG8 = null;
                                                                        }
                                                                        List list2 = (List) objG8;
                                                                        p02Var = p02Var3;
                                                                        strA = list2 != null ? c31.a(list2, ",", null, 62) : null;
                                                                        objG9 = p02Var4.k().e.g(u02.C);
                                                                        if (objG9 == null) {
                                                                            objG9 = null;
                                                                        }
                                                                        list = (List) objG9;
                                                                        i13 = i38;
                                                                        if (list != null) {
                                                                            strA2 = c31.a(list, ",", null, 62);
                                                                        } else {
                                                                            strA2 = null;
                                                                        }
                                                                        if (strA != null) {
                                                                            accessibilityEventJ.setContentDescription(strA);
                                                                        }
                                                                        if (strA2 != null) {
                                                                            accessibilityEventJ.getText().add(strA2);
                                                                        }
                                                                        k5Var.x(accessibilityEventJ);
                                                                    } else {
                                                                        i13 = i38;
                                                                        ax0Var2 = ax0Var4;
                                                                        z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    ax0Var2 = ax0Var4;
                                                                    z(k5Var, k5Var.v(i33), 2048, num8, 8);
                                                                    z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                                }
                                                            } else {
                                                                i13 = i38;
                                                                ax0Var2 = ax0Var4;
                                                                if (ws0.j(y02Var5, u02.a)) {
                                                                    int iV = k5Var.v(i33);
                                                                    obj2.getClass();
                                                                    k5Var.y(iV, 2048, 4, (List) obj2);
                                                                } else {
                                                                    y02Var3 = u02.G;
                                                                    str = "";
                                                                    if (ws0.j(y02Var5, y02Var3)) {
                                                                        if (w91Var3.c(h02.k)) {
                                                                            objG4 = w91Var2.g(y02Var3);
                                                                            if (objG4 == null) {
                                                                                objG4 = null;
                                                                            }
                                                                            ybVar2 = (yb) objG4;
                                                                            if (ybVar2 == null) {
                                                                                ybVar2 = "";
                                                                            }
                                                                            objG5 = w91Var3.g(y02Var3);
                                                                            if (objG5 == null) {
                                                                                objG5 = null;
                                                                            }
                                                                            charSequence = (yb) objG5;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            charSequenceK = K(charSequence);
                                                                            length = ybVar2.length();
                                                                            length2 = charSequence.length();
                                                                            if (length > length2) {
                                                                                i19 = length2;
                                                                            } else {
                                                                                i19 = length;
                                                                            }
                                                                            num7 = num9;
                                                                            i20 = 0;
                                                                            while (true) {
                                                                                num5 = num8;
                                                                                if (i20 < i19) {
                                                                                    i21 = length;
                                                                                    break;
                                                                                }
                                                                                i21 = length;
                                                                                if (ybVar2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                    break;
                                                                                }
                                                                                i20++;
                                                                                length = i21;
                                                                                num8 = num5;
                                                                            }
                                                                            i22 = 0;
                                                                            while (true) {
                                                                                if (i22 < i19 - i20) {
                                                                                    i23 = i22;
                                                                                    break;
                                                                                }
                                                                                i23 = i22;
                                                                                if (ybVar2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                    break;
                                                                                } else {
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                            }
                                                                            int i44 = (i21 - i23) - i20;
                                                                            int i45 = (length2 - i23) - i20;
                                                                            y02 y02Var7 = u02.L;
                                                                            boolean zC3 = w91Var2.c(y02Var7);
                                                                            boolean zC4 = w91Var3.c(y02Var7);
                                                                            zC = w91Var2.c(u02.G);
                                                                            if (zC || zC3 || !zC4) {
                                                                                z2 = false;
                                                                            } else {
                                                                                z2 = true;
                                                                            }
                                                                            if (zC || !zC3 || zC4) {
                                                                                z3 = false;
                                                                            } else {
                                                                                z3 = true;
                                                                            }
                                                                            if (!z2 || z3) {
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                                accessibilityEventK = k5Var.k(k5Var.v(i33), num9, num7, Integer.valueOf(length2), charSequenceK);
                                                                            } else {
                                                                                accessibilityEventK = k5Var.j(k5Var.v(i33), 16);
                                                                                accessibilityEventK.setFromIndex(i20);
                                                                                accessibilityEventK.setRemovedCount(i44);
                                                                                accessibilityEventK.setAddedCount(i45);
                                                                                accessibilityEventK.setBeforeText(ybVar2);
                                                                                accessibilityEventK.getText().add(charSequenceK);
                                                                                i15 = i33;
                                                                                num9 = num7;
                                                                            }
                                                                            accessibilityEventK.setClassName("android.widget.EditText");
                                                                            k5Var.x(accessibilityEventK);
                                                                            if (z2 || z3) {
                                                                                long j5 = ((of2) i02Var4.c(u02.H)).a;
                                                                                accessibilityEventK.setFromIndex((int) (j5 >> 32));
                                                                                accessibilityEventK.setToIndex((int) (j5 & 4294967295L));
                                                                                k5Var.x(accessibilityEventK);
                                                                            }
                                                                        } else {
                                                                            i15 = i33;
                                                                            w91Var2 = w91Var2;
                                                                            num5 = num8;
                                                                            z(k5Var, k5Var.v(i15), 2048, Integer.valueOf(i28), 8);
                                                                        }
                                                                        num6 = num9;
                                                                        i14 = i41;
                                                                    } else {
                                                                        i15 = i33;
                                                                        w91Var2 = w91Var2;
                                                                        num5 = num8;
                                                                        i14 = i41;
                                                                        y02Var4 = u02.H;
                                                                        if (ws0.j(y02Var5, y02Var4)) {
                                                                            objG3 = w91Var3.g(y02Var3);
                                                                            if (objG3 == null) {
                                                                                objG3 = null;
                                                                            }
                                                                            ybVar = (yb) objG3;
                                                                            if (ybVar != null && (str2 = ybVar.f) != null) {
                                                                                str = str2;
                                                                            }
                                                                            long j6 = ((of2) i02Var4.c(y02Var4)).a;
                                                                            num6 = num9;
                                                                            k5Var = this;
                                                                            k5Var.x(k5Var.k(k5Var.v(i15), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str.length()), K(str)));
                                                                            k5Var.B(i35);
                                                                        } else {
                                                                            num6 = num9;
                                                                            if (!ws0.j(y02Var5, y02Var6) || ws0.j(y02Var5, u02.w)) {
                                                                                k5Var.r(ax0Var2);
                                                                                size = arrayList4.size();
                                                                                i17 = 0;
                                                                                while (true) {
                                                                                    if (i17 >= size) {
                                                                                        wx1Var2 = null;
                                                                                        break;
                                                                                    } else {
                                                                                        if (((wx1) arrayList4.get(i17)).e == i15) {
                                                                                            wx1Var2 = (wx1) arrayList4.get(i17);
                                                                                            break;
                                                                                        }
                                                                                        i17++;
                                                                                    }
                                                                                }
                                                                                wx1Var2.getClass();
                                                                                objG = w91Var3.g(y02Var6);
                                                                                if (objG == null) {
                                                                                    objG = null;
                                                                                }
                                                                                wx1Var2.i = (nx1) objG;
                                                                                objG2 = w91Var3.g(u02.w);
                                                                                if (objG2 == null) {
                                                                                    objG2 = null;
                                                                                }
                                                                                wx1Var2.j = (nx1) objG2;
                                                                                if (wx1Var2.f.contains(wx1Var2)) {
                                                                                    k5Var.h.getSnapshotObserver().a.c(wx1Var2, k5Var.Q, new v4(1, wx1Var2, k5Var));
                                                                                }
                                                                            } else if (ws0.j(y02Var5, u02.l)) {
                                                                                obj2.getClass();
                                                                                if (((Boolean) obj2).booleanValue()) {
                                                                                    i18 = 8;
                                                                                    k5Var.x(k5Var.j(k5Var.v(i35), 8));
                                                                                } else {
                                                                                    i18 = 8;
                                                                                }
                                                                                z(k5Var, k5Var.v(i35), 2048, num6, i18);
                                                                            } else {
                                                                                y02 y02Var8 = h02.x;
                                                                                if (ws0.j(y02Var5, y02Var8)) {
                                                                                    List list3 = (List) i02Var4.c(y02Var8);
                                                                                    Object objG10 = w91Var2.g(y02Var8);
                                                                                    if (objG10 == null) {
                                                                                        objG10 = null;
                                                                                    }
                                                                                    List list4 = (List) objG10;
                                                                                    if (list4 != null) {
                                                                                        x91 x91Var = kx1.a;
                                                                                        x91 x91Var2 = new x91();
                                                                                        if (list3.size() > 0) {
                                                                                            list3.get(0).getClass();
                                                                                            fu1.c();
                                                                                            return;
                                                                                        }
                                                                                        x91 x91Var3 = new x91();
                                                                                        if (list4.size() > 0) {
                                                                                            list4.get(0).getClass();
                                                                                            fu1.c();
                                                                                            return;
                                                                                        }
                                                                                        i10 = !x91Var2.equals(x91Var3) ? 1 : 0;
                                                                                    } else if (!list3.isEmpty()) {
                                                                                        i10 = 1;
                                                                                    }
                                                                                } else if (obj2 instanceof p0) {
                                                                                    p0 p0Var = (p0) obj2;
                                                                                    Object objG11 = w91Var2.g(y02Var5);
                                                                                    if (objG11 == null) {
                                                                                        objG11 = null;
                                                                                    }
                                                                                    if (p0Var != objG11) {
                                                                                        if (objG11 instanceof p0) {
                                                                                            String str4 = p0Var.a;
                                                                                            p0 p0Var2 = (p0) objG11;
                                                                                            qj0 qj0Var2 = p0Var2.b;
                                                                                            if (ws0.j(str4, p0Var2.a) && (((qj0Var = p0Var.b) != null || qj0Var2 == null) && (qj0Var == null || qj0Var2 != null))) {
                                                                                            }
                                                                                        }
                                                                                        i10 = 1;
                                                                                    }
                                                                                    i10 = 0;
                                                                                } else {
                                                                                    i10 = 1;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            num6 = num9;
                                                            i15 = i33;
                                                            w91Var2 = w91Var2;
                                                            num5 = num8;
                                                            i14 = i41;
                                                        }
                                                    }
                                                    i15 = i33;
                                                    num5 = num8;
                                                    arrayList3 = arrayList5;
                                                    i13 = i38;
                                                    ax0Var2 = ax0Var4;
                                                    i14 = i41;
                                                    num6 = num9;
                                                    w91Var2 = w91Var2;
                                                } else {
                                                    Object objG12 = w91Var2.g(y02Var5);
                                                    if (objG12 == null) {
                                                        objG12 = null;
                                                    }
                                                    if (ws0.j(obj2, objG12)) {
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        ax0Var2 = ax0Var4;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        w91Var2 = w91Var2;
                                                    } else {
                                                        y02Var = u02.d;
                                                        if (ws0.j(y02Var5, y02Var)) {
                                                            obj2.getClass();
                                                            str3 = (String) obj2;
                                                            zC2 = w91Var2.c(y02Var);
                                                            i24 = i34;
                                                            if (zC2) {
                                                                k5Var.A(i33, i24, str3);
                                                            }
                                                        } else {
                                                            i16 = i34;
                                                            if (ws0.j(y02Var5, u02.b)) {
                                                                z(k5Var, k5Var.v(i33), 2048, num8, i16);
                                                                z(k5Var, k5Var.v(i33), 2048, num9, i16);
                                                            } else if (ws0.j(y02Var5, u02.K)) {
                                                                z(k5Var, k5Var.v(i33), 2048, 8192, 8);
                                                                z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                            } else if (ws0.j(y02Var5, u02.M)) {
                                                                z(k5Var, k5Var.v(i33), 2048, 3072, 8);
                                                            } else if (ws0.j(y02Var5, u02.c)) {
                                                                z(k5Var, k5Var.v(i33), 2048, num8, 8);
                                                                z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                            } else {
                                                                y02Var2 = u02.J;
                                                                arrayList3 = arrayList5;
                                                                if (ws0.j(y02Var5, y02Var2)) {
                                                                    objG6 = w91Var3.g(u02.z);
                                                                    if (objG6 == null) {
                                                                        objG6 = null;
                                                                    }
                                                                    wu1Var = (wu1) objG6;
                                                                    if (wu1Var == null) {
                                                                        i13 = i38;
                                                                        ax0Var2 = ax0Var4;
                                                                        z(k5Var, k5Var.v(i33), 2048, num8, 8);
                                                                        z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                                    } else {
                                                                        objG7 = w91Var3.g(y02Var2);
                                                                        if (objG7 == null) {
                                                                            objG7 = null;
                                                                        }
                                                                        if (ws0.j(objG7, Boolean.TRUE)) {
                                                                            accessibilityEventJ = k5Var.j(k5Var.v(i33), 4);
                                                                            p02 p02Var5 = p02Var;
                                                                            ax0Var2 = ax0Var4;
                                                                            p02 p02Var6 = new p02(p02Var5.a, true, ax0Var2, i02Var4);
                                                                            objG8 = p02Var6.k().e.g(u02.a);
                                                                            if (objG8 == null) {
                                                                                objG8 = null;
                                                                            }
                                                                            List list5 = (List) objG8;
                                                                            p02Var = p02Var5;
                                                                            if (list5 != null) {
                                                                            }
                                                                            objG9 = p02Var6.k().e.g(u02.C);
                                                                            if (objG9 == null) {
                                                                                objG9 = null;
                                                                            }
                                                                            list = (List) objG9;
                                                                            i13 = i38;
                                                                            if (list != null) {
                                                                                strA2 = c31.a(list, ",", null, 62);
                                                                            } else {
                                                                                strA2 = null;
                                                                            }
                                                                            if (strA != null) {
                                                                                accessibilityEventJ.setContentDescription(strA);
                                                                            }
                                                                            if (strA2 != null) {
                                                                                accessibilityEventJ.getText().add(strA2);
                                                                            }
                                                                            k5Var.x(accessibilityEventJ);
                                                                        } else {
                                                                            i13 = i38;
                                                                            ax0Var2 = ax0Var4;
                                                                            z(k5Var, k5Var.v(i33), 2048, num9, 8);
                                                                        }
                                                                    }
                                                                } else {
                                                                    i13 = i38;
                                                                    ax0Var2 = ax0Var4;
                                                                    if (ws0.j(y02Var5, u02.a)) {
                                                                        int iV2 = k5Var.v(i33);
                                                                        obj2.getClass();
                                                                        k5Var.y(iV2, 2048, 4, (List) obj2);
                                                                    } else {
                                                                        y02Var3 = u02.G;
                                                                        str = "";
                                                                        if (ws0.j(y02Var5, y02Var3)) {
                                                                            if (w91Var3.c(h02.k)) {
                                                                                objG4 = w91Var2.g(y02Var3);
                                                                                if (objG4 == null) {
                                                                                    objG4 = null;
                                                                                }
                                                                                ybVar2 = (yb) objG4;
                                                                                if (ybVar2 == null) {
                                                                                    ybVar2 = "";
                                                                                }
                                                                                objG5 = w91Var3.g(y02Var3);
                                                                                if (objG5 == null) {
                                                                                    objG5 = null;
                                                                                }
                                                                                charSequence = (yb) objG5;
                                                                                if (charSequence == null) {
                                                                                    charSequence = "";
                                                                                }
                                                                                charSequenceK = K(charSequence);
                                                                                length = ybVar2.length();
                                                                                length2 = charSequence.length();
                                                                                if (length > length2) {
                                                                                    i19 = length2;
                                                                                } else {
                                                                                    i19 = length;
                                                                                }
                                                                                num7 = num9;
                                                                                i20 = 0;
                                                                                while (true) {
                                                                                    num5 = num8;
                                                                                    if (i20 < i19) {
                                                                                        i21 = length;
                                                                                        break;
                                                                                    }
                                                                                    i21 = length;
                                                                                    if (ybVar2.charAt(i20) != charSequence.charAt(i20)) {
                                                                                        break;
                                                                                        break;
                                                                                    } else {
                                                                                        i20++;
                                                                                        length = i21;
                                                                                        num8 = num5;
                                                                                    }
                                                                                }
                                                                                i22 = 0;
                                                                                while (true) {
                                                                                    if (i22 < i19 - i20) {
                                                                                        i23 = i22;
                                                                                        break;
                                                                                    }
                                                                                    i23 = i22;
                                                                                    if (ybVar2.charAt((i21 - 1) - i22) != charSequence.charAt((length2 - 1) - i23)) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i22 = i23 + 1;
                                                                                }
                                                                                int i46 = (i21 - i23) - i20;
                                                                                int i47 = (length2 - i23) - i20;
                                                                                y02 y02Var9 = u02.L;
                                                                                boolean zC5 = w91Var2.c(y02Var9);
                                                                                boolean zC6 = w91Var3.c(y02Var9);
                                                                                zC = w91Var2.c(u02.G);
                                                                                if (zC) {
                                                                                    z2 = false;
                                                                                } else {
                                                                                    z2 = false;
                                                                                }
                                                                                if (zC) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (z2) {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventK = k5Var.k(k5Var.v(i33), num9, num7, Integer.valueOf(length2), charSequenceK);
                                                                                } else {
                                                                                    i15 = i33;
                                                                                    num9 = num7;
                                                                                    accessibilityEventK = k5Var.k(k5Var.v(i33), num9, num7, Integer.valueOf(length2), charSequenceK);
                                                                                }
                                                                                accessibilityEventK.setClassName("android.widget.EditText");
                                                                                k5Var.x(accessibilityEventK);
                                                                                if (z2) {
                                                                                    long j7 = ((of2) i02Var4.c(u02.H)).a;
                                                                                    accessibilityEventK.setFromIndex((int) (j7 >> 32));
                                                                                    accessibilityEventK.setToIndex((int) (j7 & 4294967295L));
                                                                                    k5Var.x(accessibilityEventK);
                                                                                } else {
                                                                                    long j8 = ((of2) i02Var4.c(u02.H)).a;
                                                                                    accessibilityEventK.setFromIndex((int) (j8 >> 32));
                                                                                    accessibilityEventK.setToIndex((int) (j8 & 4294967295L));
                                                                                    k5Var.x(accessibilityEventK);
                                                                                }
                                                                            } else {
                                                                                i15 = i33;
                                                                                w91Var2 = w91Var2;
                                                                                num5 = num8;
                                                                                z(k5Var, k5Var.v(i15), 2048, Integer.valueOf(i28), 8);
                                                                            }
                                                                            num6 = num9;
                                                                            i14 = i41;
                                                                        } else {
                                                                            i15 = i33;
                                                                            w91Var2 = w91Var2;
                                                                            num5 = num8;
                                                                            i14 = i41;
                                                                            y02Var4 = u02.H;
                                                                            if (ws0.j(y02Var5, y02Var4)) {
                                                                                objG3 = w91Var3.g(y02Var3);
                                                                                if (objG3 == null) {
                                                                                    objG3 = null;
                                                                                }
                                                                                ybVar = (yb) objG3;
                                                                                if (ybVar != null) {
                                                                                    str = str2;
                                                                                }
                                                                                long j9 = ((of2) i02Var4.c(y02Var4)).a;
                                                                                num6 = num9;
                                                                                k5Var = this;
                                                                                k5Var.x(k5Var.k(k5Var.v(i15), Integer.valueOf((int) (j9 >> 32)), Integer.valueOf((int) (j9 & 4294967295L)), Integer.valueOf(str.length()), K(str)));
                                                                                k5Var.B(i35);
                                                                            } else {
                                                                                num6 = num9;
                                                                                if (ws0.j(y02Var5, y02Var6)) {
                                                                                    k5Var.r(ax0Var2);
                                                                                    size = arrayList4.size();
                                                                                    i17 = 0;
                                                                                    while (true) {
                                                                                        if (i17 >= size) {
                                                                                            wx1Var2 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((wx1) arrayList4.get(i17)).e == i15) {
                                                                                                wx1Var2 = (wx1) arrayList4.get(i17);
                                                                                                break;
                                                                                            }
                                                                                            i17++;
                                                                                        }
                                                                                    }
                                                                                    wx1Var2.getClass();
                                                                                    objG = w91Var3.g(y02Var6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    wx1Var2.i = (nx1) objG;
                                                                                    objG2 = w91Var3.g(u02.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    wx1Var2.j = (nx1) objG2;
                                                                                    if (wx1Var2.f.contains(wx1Var2)) {
                                                                                        k5Var.h.getSnapshotObserver().a.c(wx1Var2, k5Var.Q, new v4(1, wx1Var2, k5Var));
                                                                                    }
                                                                                } else {
                                                                                    k5Var.r(ax0Var2);
                                                                                    size = arrayList4.size();
                                                                                    i17 = 0;
                                                                                    while (true) {
                                                                                        if (i17 >= size) {
                                                                                            wx1Var2 = null;
                                                                                            break;
                                                                                        } else {
                                                                                            if (((wx1) arrayList4.get(i17)).e == i15) {
                                                                                                wx1Var2 = (wx1) arrayList4.get(i17);
                                                                                                break;
                                                                                            }
                                                                                            i17++;
                                                                                        }
                                                                                    }
                                                                                    wx1Var2.getClass();
                                                                                    objG = w91Var3.g(y02Var6);
                                                                                    if (objG == null) {
                                                                                        objG = null;
                                                                                    }
                                                                                    wx1Var2.i = (nx1) objG;
                                                                                    objG2 = w91Var3.g(u02.w);
                                                                                    if (objG2 == null) {
                                                                                        objG2 = null;
                                                                                    }
                                                                                    wx1Var2.j = (nx1) objG2;
                                                                                    if (wx1Var2.f.contains(wx1Var2)) {
                                                                                        k5Var.h.getSnapshotObserver().a.c(wx1Var2, k5Var.Q, new v4(1, wx1Var2, k5Var));
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                num6 = num9;
                                                                i15 = i33;
                                                                w91Var2 = w91Var2;
                                                                num5 = num8;
                                                                i14 = i41;
                                                            }
                                                        }
                                                        i15 = i33;
                                                        num5 = num8;
                                                        arrayList3 = arrayList5;
                                                        i13 = i38;
                                                        ax0Var2 = ax0Var4;
                                                        i14 = i41;
                                                        num6 = num9;
                                                        w91Var2 = w91Var2;
                                                    }
                                                }
                                            } else {
                                                i02Var2 = i02Var3;
                                                num5 = num8;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i13 = i38;
                                                i39 = i39;
                                                ax0Var2 = ax0Var4;
                                                i14 = length4;
                                                num6 = num9;
                                                i15 = i33;
                                                w91Var2 = w91Var2;
                                            }
                                            i34 = 8;
                                            i33 = i15;
                                            ax0Var4 = ax0Var2;
                                            i02Var3 = i02Var2;
                                            j4 = j >> 8;
                                            i39++;
                                            length4 = i14;
                                            num9 = num6;
                                            w91Var2 = w91Var2;
                                            i38 = i13;
                                            arrayList5 = arrayList3;
                                            num8 = num5;
                                        }
                                        i9 = i33;
                                        i02Var = i02Var3;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        ax0Var = ax0Var4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                        int i48 = i38;
                                        w91Var = w91Var2;
                                        if (i48 != i34) {
                                            break;
                                        }
                                    } else {
                                        i9 = i33;
                                        i02Var = i02Var3;
                                        w91Var = w91Var2;
                                        num3 = num8;
                                        arrayList2 = arrayList5;
                                        ax0Var = ax0Var4;
                                        i5 = 0;
                                        i8 = 1;
                                        i12 = length4;
                                        num4 = num9;
                                    }
                                    if (i37 == i12) {
                                        break;
                                    }
                                    num9 = num4;
                                    i33 = i9;
                                    w91Var2 = w91Var;
                                    ax0Var4 = ax0Var;
                                    p02Var2 = p02Var;
                                    i02Var3 = i02Var;
                                    arrayList5 = arrayList2;
                                    i34 = 8;
                                    i36 = i37 + 1;
                                    length4 = i12;
                                    num8 = num3;
                                }
                            } else {
                                i02Var = i02Var3;
                                num3 = num8;
                                arrayList2 = arrayList5;
                                i4 = i31;
                                p02Var = p02Var2;
                                i8 = 1;
                                num4 = num9;
                                i9 = i33;
                                i5 = 0;
                                i10 = 0;
                            }
                            if (i10 == 0) {
                                Iterator it = i02Var.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i5;
                                        break;
                                    }
                                    if (!p02Var.k().e.c((y02) ((Map.Entry) it.next()).getKey())) {
                                        i11 = i8;
                                        break;
                                    }
                                }
                                i10 = i11;
                            }
                            if (i10 != 0) {
                                int iV3 = k5Var.v(i9);
                                i7 = 8;
                                z(k5Var, iV3, 2048, num4, 8);
                            } else {
                                i7 = 8;
                            }
                        }
                    } else {
                        i3 = i32;
                        num3 = num8;
                        arrayList2 = arrayList5;
                        iArr2 = iArr3;
                        jArr2 = jArr3;
                        i4 = i31;
                        i5 = i26;
                        i6 = i27;
                        num4 = num9;
                        i7 = i30;
                    }
                    j3 >>= i7;
                    i32 = i3 + 1;
                    gr0Var2 = gr0Var;
                    i26 = i5;
                    num9 = num4;
                    i30 = i7;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i27 = i6;
                    i31 = i4;
                    arrayList5 = arrayList2;
                    num8 = num3;
                }
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                int i49 = i27;
                num2 = num9;
                if (i31 != i30) {
                    return;
                } else {
                    i2 = i49;
                }
            } else {
                num = num8;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                i = i26;
                num2 = num9;
                i2 = i27;
            }
            if (i2 == i29) {
                return;
            }
            i27 = i2 + 1;
            gr0Var2 = gr0Var;
            length3 = i29;
            i26 = i;
            num9 = num2;
            i25 = i28;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num8 = num;
        }
    }

    public final void D(ax0 ax0Var, e91 e91Var) {
        i02 i02VarW;
        if (ax0Var.H() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(ax0Var)) {
            ax0 ax0Var2 = null;
            if (!ax0Var.I.c(8)) {
                ax0Var = ax0Var.u();
                while (true) {
                    if (ax0Var == null) {
                        ax0Var = null;
                        break;
                    } else if (ax0Var.I.c(8)) {
                        break;
                    } else {
                        ax0Var = ax0Var.u();
                    }
                }
            }
            if (ax0Var == null || (i02VarW = ax0Var.w()) == null) {
                return;
            }
            if (!i02VarW.g) {
                for (ax0 ax0VarU = ax0Var.u(); ax0VarU != null; ax0VarU = ax0VarU.u()) {
                    i02 i02VarW2 = ax0VarU.w();
                    if (i02VarW2 != null && i02VarW2.g) {
                        ax0Var2 = ax0VarU;
                        break;
                    }
                }
                if (ax0Var2 != null) {
                    ax0Var = ax0Var2;
                }
            }
            int i = ax0Var.f;
            if (e91Var.a(i)) {
                z(this, v(i), 2048, 1, 8);
            }
        }
    }

    public final void E(ax0 ax0Var) {
        if (ax0Var.H() && !this.h.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(ax0Var)) {
            int i = ax0Var.f;
            nx1 nx1Var = (nx1) this.t.b(i);
            nx1 nx1Var2 = (nx1) this.u.b(i);
            if (nx1Var == null && nx1Var2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventJ = j(i, 4096);
            if (nx1Var != null) {
                accessibilityEventJ.setScrollX((int) ((Number) nx1Var.a.a()).floatValue());
                accessibilityEventJ.setMaxScrollX((int) ((Number) nx1Var.b.a()).floatValue());
            }
            if (nx1Var2 != null) {
                accessibilityEventJ.setScrollY((int) ((Number) nx1Var2.a.a()).floatValue());
                accessibilityEventJ.setMaxScrollY((int) ((Number) nx1Var2.b.a()).floatValue());
            }
            x(accessibilityEventJ);
        }
    }

    public final boolean F(p02 p02Var, int i, int i2, boolean z) {
        String strO;
        i02 i02Var = p02Var.d;
        int i3 = p02Var.f;
        y02 y02Var = h02.j;
        if (i02Var.e.c(y02Var) && ws0.r(p02Var)) {
            jj0 jj0Var = (jj0) ((p0) p02Var.d.c(y02Var)).b;
            if (jj0Var != null) {
                return ((Boolean) jj0Var.d(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.x) && (strO = o(p02Var)) != null) {
            if (i < 0 || i != i2 || i2 > strO.length()) {
                i = -1;
            }
            this.x = i;
            boolean z2 = strO.length() > 0;
            x(k(v(i3), z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(this.x) : null, z2 ? Integer.valueOf(strO.length()) : null, strO));
            B(i3);
            return true;
        }
        return false;
    }

    public final Rect H(float f, float f2, float f3, float f4) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f2)) & 4294967295L;
        e5 e5Var = this.h;
        long jU = e5Var.u(jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
        long jU2 = e5Var.u((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
        int i = (int) (jU >> 32);
        int i2 = (int) (jU2 >> 32);
        int i3 = (int) (jU & 4294967295L);
        int i4 = (int) (jU2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int iNumberOfTrailingZeros;
        char c2;
        q02 q02Var;
        e91 e91Var = new e91();
        e91 e91Var2 = this.E;
        int[] iArr = e91Var2.b;
        long[] jArr3 = e91Var2.a;
        int length = jArr3.length - 2;
        d91 d91Var = this.K;
        int i2 = 8;
        if (length >= 0) {
            int i3 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i3];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            int i6 = iArr[(i3 << 3) + i5];
                            c2 = c3;
                            s02 s02Var = (s02) n().b(i6);
                            Object obj = null;
                            p02 p02Var = s02Var != null ? s02Var.a : null;
                            if (p02Var != null) {
                                if (!p02Var.d.e.c(u02.d)) {
                                    e91Var.a(i6);
                                    q02Var = (q02) d91Var.b(i6);
                                    if (q02Var != null) {
                                        Object objG = q02Var.a.e.g(u02.d);
                                        obj = (String) (objG != null ? objG : null);
                                    }
                                    A(i6, 32, obj);
                                }
                            } else {
                                e91Var.a(i6);
                                q02Var = (q02) d91Var.b(i6);
                                if (q02Var != null) {
                                    Object objG2 = q02Var.a.e.g(u02.d);
                                    obj = (String) (objG2 != null ? objG2 : null);
                                }
                                A(i6, 32, obj);
                            }
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i5++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = e91Var.b;
        long[] jArr4 = e91Var.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr4[i7];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i8 = 8 - ((~(i7 - length2)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j6 & j2) < j) {
                            int i10 = iArr2[(i7 << 3) + i9];
                            int iHashCode = Integer.hashCode(i10) * (-862048943);
                            int i11 = iHashCode ^ (iHashCode << 16);
                            int i12 = i11 & 127;
                            int i13 = e91Var2.c;
                            int i14 = (i11 >>> 7) & i13;
                            i = i2;
                            int i15 = 0;
                            while (true) {
                                long[] jArr5 = e91Var2.a;
                                int i16 = i14 >> 3;
                                jArr2 = jArr4;
                                int i17 = (i14 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i16] >>> i17) | ((jArr5[i16 + 1] << (64 - i17)) & ((-i17) >> 63));
                                int i18 = i13;
                                long j8 = (((long) i12) * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (j9 != 0) {
                                    iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j9) >> 3)) & i18;
                                    int i19 = i18;
                                    if (e91Var2.b[iNumberOfTrailingZeros] == i10) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i18 = i19;
                                }
                                int i20 = i18;
                                if ((j7 & ((~j7) << 6) & j3) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i15 += 8;
                                i14 = (i14 + i15) & i20;
                                jArr4 = jArr2;
                                i13 = i20;
                                j6 = j4;
                            }
                            int i21 = iNumberOfTrailingZeros;
                            if (i21 >= 0) {
                                e91Var2.f(i21);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i2;
                        }
                        j6 = j4 >> i;
                        i9++;
                        i2 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i8 != i2) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i7 == length2) {
                    break;
                }
                i7++;
                jArr4 = jArr;
                i2 = 8;
            }
        }
        d91Var.c();
        gr0 gr0VarN = n();
        int[] iArr3 = gr0VarN.b;
        Object[] objArr = gr0VarN.c;
        long[] jArr6 = gr0VarN.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i23 = 8 - ((~(i22 - length3)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j) {
                            int i25 = (i22 << 3) + i24;
                            int i26 = iArr3[i25];
                            p02 p02Var2 = ((s02) objArr[i25]).a;
                            i02 i02Var = p02Var2.d;
                            y02 y02Var = u02.d;
                            if (i02Var.e.c(y02Var) && e91Var2.a(i26)) {
                                A(i26, 16, (String) p02Var2.d.c(y02Var));
                            }
                            d91Var.h(i26, new q02(p02Var2, n()));
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    }
                }
                if (i22 == length3) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.L = new q02(this.h.getSemanticsOwner().a(), n());
    }

    @Override // defpackage.s0
    public final ao2 a(View view) {
        return this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i, k1 k1Var, String str, Bundle bundle) {
        p02 p02Var;
        yr1 yr1Var;
        e5 e5Var;
        RectF rectF;
        yr1 yr1VarE;
        AccessibilityNodeInfo accessibilityNodeInfo = k1Var.a;
        s02 s02Var = (s02) n().b(i);
        if (s02Var == null || (p02Var = s02Var.a) == null) {
            return;
        }
        ax0 ax0Var = p02Var.c;
        i02 i02Var = p02Var.d;
        w91 w91Var = i02Var.e;
        String strO = o(p02Var);
        if (ws0.j(str, this.H)) {
            int iD = this.F.d(i);
            if (iD != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD);
                return;
            }
            return;
        }
        if (ws0.j(str, this.I)) {
            int iD2 = this.G.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        boolean zC = w91Var.c(h02.a);
        e5 e5Var2 = this.h;
        me1 me1Var = null;
        if (zC && bundle != null && ws0.j(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 > 0 && i2 >= 0) {
                if (i2 < (strO != null ? strO.length() : Integer.MAX_VALUE)) {
                    hf2 hf2VarL = c12.l(i02Var);
                    if (hf2VarL == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    int i4 = 0;
                    while (i4 < i3) {
                        int i5 = i2 + i4;
                        if (i5 >= hf2VarL.a.a.f.length()) {
                            arrayList.add(me1Var);
                            i2 = i2;
                            i3 = i3;
                            e5Var = e5Var2;
                        } else {
                            yr1 yr1VarB = hf2VarL.b(i5);
                            me1 me1VarD = p02Var.d();
                            long jR = 0;
                            if (me1VarD != null) {
                                if (!me1VarD.S0().r) {
                                    me1VarD = me1Var;
                                }
                                if (me1VarD != null) {
                                    jR = me1VarD.R(0L);
                                }
                            }
                            yr1 yr1VarI = yr1VarB.i(jR);
                            yr1 yr1VarG = p02Var.g();
                            if (yr1VarI.g(yr1VarG)) {
                                yr1VarE = yr1VarI.e(yr1VarG);
                            } else {
                                yr1Var = me1Var;
                            }
                            if (yr1Var != 0) {
                                yr1Var = yr1VarE;
                                long jU = e5Var2.u((((long) Float.floatToRawIntBits(yr1Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(yr1Var.a)) << 32));
                                e5Var = e5Var2;
                                long jU2 = e5Var.u((((long) Float.floatToRawIntBits(yr1Var.d)) & 4294967295L) | (((long) Float.floatToRawIntBits(yr1Var.c)) << 32));
                                int i6 = (int) (jU >> 32);
                                int i7 = (int) (jU2 >> 32);
                                int i8 = (int) (jU & 4294967295L);
                                int i9 = (int) (jU2 & 4294967295L);
                                rectF = new RectF(Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.max(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7)), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)));
                            } else {
                                yr1Var = yr1VarE;
                                e5Var = e5Var2;
                                rectF = null;
                            }
                            arrayList.add(rectF);
                        }
                        i4++;
                        i3 = i3;
                        e5Var2 = e5Var;
                        i2 = i2;
                        me1Var = null;
                    }
                    accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        y02 y02Var = u02.A;
        if (w91Var.c(y02Var) && bundle != null && ws0.j(str, "androidx.compose.ui.semantics.testTag")) {
            Object objG = w91Var.g(y02Var);
            String str2 = (String) (objG == null ? null : objG);
            if (str2 != null) {
                accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (ws0.j(str, "androidx.compose.ui.semantics.id")) {
            accessibilityNodeInfo.getExtras().putInt(str, p02Var.f);
            return;
        }
        if (ws0.j(str, "androidx.compose.ui.semantics.shapeType")) {
            Object objG2 = w91Var.g(u02.Q);
            u32 u32Var = (u32) (objG2 == null ? null : objG2);
            if (u32Var != null) {
                Rect rect = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect);
                yr1 yr1VarP = p(p02Var, rect, u32Var);
                float f = yr1VarP.b;
                float f2 = yr1VarP.a;
                mx mxVarA = u32Var.a(yr1VarP.c(), ax0Var.C, e5Var2.getDensity());
                if (mxVarA instanceof hi1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(mxVarA, f2, f));
                    return;
                } else if (mxVarA instanceof ii1) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", G(mxVarA, f2, f));
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", I(mxVarA));
                    return;
                } else if (!(mxVarA instanceof gi1)) {
                    qj.p();
                    return;
                } else {
                    accessibilityNodeInfo.getExtras().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", J(mxVarA, f2, f));
                    return;
                }
            }
            return;
        }
        if (ws0.j(str, "androidx.compose.ui.semantics.shapeRect")) {
            Object objG3 = w91Var.g(u02.Q);
            u32 u32Var2 = (u32) (objG3 == null ? null : objG3);
            if (u32Var2 != null) {
                Rect rect2 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect2);
                yr1 yr1VarP2 = p(p02Var, rect2, u32Var2);
                Rect rectG = G(u32Var2.a(yr1VarP2.c(), ax0Var.C, e5Var2.getDensity()), yr1VarP2.a, yr1VarP2.b);
                if (rectG != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRect", rectG);
                    return;
                }
                return;
            }
            return;
        }
        if (ws0.j(str, "androidx.compose.ui.semantics.shapeCorners")) {
            Object objG4 = w91Var.g(u02.Q);
            u32 u32Var3 = (u32) (objG4 == null ? null : objG4);
            if (u32Var3 != null) {
                Rect rect3 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                float[] fArrI = I(u32Var3.a(p(p02Var, rect3, u32Var3).c(), ax0Var.C, e5Var2.getDensity()));
                if (fArrI != null) {
                    accessibilityNodeInfo.getExtras().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrI);
                    return;
                }
                return;
            }
            return;
        }
        if (ws0.j(str, "androidx.compose.ui.semantics.shapeRegion")) {
            Object objG5 = w91Var.g(u02.Q);
            u32 u32Var4 = (u32) (objG5 == null ? null : objG5);
            if (u32Var4 != null) {
                Rect rect4 = new Rect();
                accessibilityNodeInfo.getBoundsInScreen(rect4);
                yr1 yr1VarP3 = p(p02Var, rect4, u32Var4);
                Region regionJ = J(u32Var4.a(yr1VarP3.c(), ax0Var.C, e5Var2.getDensity()), yr1VarP3.a, yr1VarP3.b);
                if (regionJ != null) {
                    accessibilityNodeInfo.getExtras().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionJ);
                }
            }
        }
    }

    public final Rect f(s02 s02Var) {
        mr0 mr0Var = s02Var.b;
        return H(mr0Var.a, mr0Var.b, mr0Var.c, mr0Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:56:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:56:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: all -> 0x0037, LOOP:0: B:33:0x0083->B:34:0x0085, LOOP_END, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:56:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x009c A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:24:0x005c, B:28:0x006e, B:30:0x0076, B:32:0x007f, B:34:0x0085, B:35:0x0094, B:37:0x009c, B:20:0x0046, B:23:0x004d), top: B:56:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        if (defpackage.mx.t(r4, r2) == r7) goto L50;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00f7 -> B:51:0x00fa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.tx r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5.g(tx):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    public final boolean h(boolean z, int i, long j) {
        y02 y02Var;
        int i2;
        if (ws0.j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            gr0 gr0VarN = n();
            if (!uf1.b(j, 9205357640488583168L) && (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                if (z) {
                    y02Var = u02.w;
                } else {
                    if (z) {
                        qj.p();
                        return false;
                    }
                    y02Var = u02.v;
                }
                Object[] objArr = gr0VarN.c;
                long[] jArr = gr0VarN.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8;
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    s02 s02Var = (s02) objArr[(i3 << 3) + i6];
                                    mr0 mr0Var = s02Var.b;
                                    float f = mr0Var.a;
                                    i2 = i4;
                                    float f2 = mr0Var.b;
                                    float f3 = mr0Var.c;
                                    float f4 = mr0Var.d;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                                    if ((fIntBitsToFloat2 < f4) & (fIntBitsToFloat >= f) & (fIntBitsToFloat < f3) & (fIntBitsToFloat2 >= f2)) {
                                        Object objG = s02Var.a.d.e.g(y02Var);
                                        if (objG == null) {
                                            objG = null;
                                        }
                                        nx1 nx1Var = (nx1) objG;
                                        if (nx1Var != null) {
                                            ti0 ti0Var = nx1Var.a;
                                            if (i < 0) {
                                                if (((Number) ti0Var.a()).floatValue() > 0.0f) {
                                                    z2 = true;
                                                }
                                            } else if (((Number) ti0Var.a()).floatValue() < ((Number) nx1Var.b.a()).floatValue()) {
                                                z2 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i4;
                                }
                                j2 >>= i2;
                                i6++;
                                i4 = i2;
                            }
                            if (i5 != i4) {
                                return z2;
                            }
                        }
                        if (i3 == length) {
                            return z2;
                        }
                        i3++;
                    }
                }
            }
        }
        return false;
    }

    public final void i() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (q()) {
                w(this.h.getSemanticsOwner().a(), this.L);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                C(n());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final AccessibilityEvent j(int i, int i2) {
        s02 s02Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        e5 e5Var = this.h;
        accessibilityEventObtain.setPackageName(e5Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(e5Var, i);
        if (q() && (s02Var = (s02) n().b(i)) != null) {
            p02 p02Var = s02Var.a;
            accessibilityEventObtain.setPassword(p02Var.d.e.c(u02.L));
            Object objG = p02Var.d.e.g(u02.o);
            if (objG == null) {
                objG = null;
            }
            boolean zJ = ws0.j(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                t0.j(accessibilityEventObtain, zJ);
            }
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent k(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventJ = j(i, 8192);
        if (num != null) {
            accessibilityEventJ.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventJ.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventJ.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventJ.getText().add(charSequence);
        }
        return accessibilityEventJ;
    }

    public final int l(p02 p02Var) {
        i02 i02Var = p02Var.d;
        if (!i02Var.e.c(u02.a)) {
            y02 y02Var = u02.H;
            if (i02Var.e.c(y02Var)) {
                return (int) (((of2) i02Var.c(y02Var)).a & 4294967295L);
            }
        }
        return this.x;
    }

    public final int m(p02 p02Var) {
        i02 i02Var = p02Var.d;
        if (!i02Var.e.c(u02.a)) {
            y02 y02Var = u02.H;
            if (i02Var.e.c(y02Var)) {
                return (int) (((of2) i02Var.c(y02Var)).a >> 32);
            }
        }
        return this.x;
    }

    public final gr0 n() {
        if (this.B) {
            this.B = false;
            e5 e5Var = this.h;
            this.D = j20.o(e5Var.getSemanticsOwner(), x4.h);
            if (q()) {
                d91 d91Var = this.D;
                Resources resources = e5Var.getContext().getResources();
                b91 b91Var = this.F;
                b91Var.a();
                b91 b91Var2 = this.G;
                b91Var2.a();
                s02 s02Var = (s02) d91Var.b(-1);
                p02 p02Var = s02Var != null ? s02Var.a : null;
                p02Var.getClass();
                ArrayList arrayListB = b12.b(p02Var, new y3(3, d91Var), new y3(4, resources), vs0.u(p02Var));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((p02) arrayListB.get(i - 1)).f;
                        int i3 = ((p02) arrayListB.get(i)).f;
                        b91Var.f(i2, i3);
                        b91Var2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.D;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.m = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager.isEnabled()) {
            this.m = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.h.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.O);
        AccessibilityManager accessibilityManager = this.k;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0073 A[LOOP:0: B:4:0x0014->B:36:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0076 A[EDGE_INSN: B:47:0x0076->B:37:0x0076 BREAK  A[LOOP:0: B:4:0x0014->B:36:0x0073], SYNTHETIC] */
    public final yr1 p(p02 p02Var, Rect rect, u32 u32Var) {
        i5 i5Var = new i5(u32Var);
        ax0 ax0Var = p02Var.c;
        t71 t71Var = ax0Var.I.f;
        b40 b40Var = null;
        if ((t71Var.h & 8) != 0) {
            loop0: while (t71Var != null) {
                if ((t71Var.g & 8) == 0) {
                    if ((t71Var.h & 8) != 0) {
                        break;
                        break;
                    }
                    t71Var = t71Var.j;
                } else {
                    t71 t71VarP = t71Var;
                    fa1 fa1Var = null;
                    while (t71VarP != null) {
                        if (t71VarP instanceof m02) {
                            ((m02) t71VarP).e0(i5Var);
                            if (i5Var.e) {
                                b40Var = t71VarP;
                                break loop0;
                            }
                        } else if ((t71VarP.g & 8) != 0 && (t71VarP instanceof c40)) {
                            int i = 0;
                            for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                if ((t71Var2.g & 8) != 0) {
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
                    if ((t71Var.h & 8) != 0) {
                        break;
                    }
                    t71Var = t71Var.j;
                }
            }
        }
        b40 b40Var2 = (m02) b40Var;
        if (b40Var2 == null || !((t71) b40Var2).e.r) {
            return sv.m(ax0Var.I.d, false);
        }
        me1 me1VarU = qx.U(b40Var2);
        yr1 yr1VarK = sv.A(me1VarU).K(me1VarU, false);
        Rect rectH = H(yr1VarK.a, yr1VarK.b, yr1VarK.c, yr1VarK.d);
        float f = rectH.left - rect.left;
        float f2 = rectH.top - rect.top;
        return new yr1(f, f2, rectH.width() + f, rectH.height() + f2);
    }

    public final boolean q() {
        AccessibilityManager accessibilityManager = this.k;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.m;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.m = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void r(ax0 ax0Var) {
        if (this.z.add(ax0Var)) {
            this.A.c(ll2.a);
        }
    }

    public final int v(int i) {
        if (i == this.h.getSemanticsOwner().a().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[LOOP:1: B:15:0x004c->B:28:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b A[EDGE_INSN: B:44:0x008b->B:29:0x008b BREAK  A[LOOP:1: B:15:0x004c->B:28:0x0088], SYNTHETIC] */
    public final void w(p02 p02Var, q02 q02Var) {
        int[] iArr = pr0.a;
        e91 e91Var = new e91();
        List listJ = p02.j(4, p02Var);
        ax0 ax0Var = p02Var.c;
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            p02 p02Var2 = (p02) listJ.get(i);
            gr0 gr0VarN = n();
            int i2 = p02Var2.f;
            if (gr0VarN.a(i2)) {
                if (!q02Var.b.b(i2)) {
                    r(ax0Var);
                    return;
                }
                e91Var.a(i2);
            }
        }
        e91 e91Var2 = q02Var.b;
        int[] iArr2 = e91Var2.b;
        long[] jArr = e91Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !e91Var.b(iArr2[(i3 << 3) + i5])) {
                            r(ax0Var);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        List listJ2 = p02.j(4, p02Var);
        int size2 = listJ2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            p02 p02Var3 = (p02) listJ2.get(i6);
            q02 q02Var2 = (q02) this.K.b(p02Var3.f);
            if (q02Var2 != null && n().a(p02Var3.f)) {
                w(p02Var3, q02Var2);
            }
        }
    }

    public final boolean x(AccessibilityEvent accessibilityEvent) {
        if (!q()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.s = true;
        }
        try {
            return ((Boolean) this.j.h(accessibilityEvent)).booleanValue();
        } finally {
            this.s = false;
        }
    }

    public final boolean y(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !q()) {
            return false;
        }
        AccessibilityEvent accessibilityEventJ = j(i, i2);
        if (num != null) {
            accessibilityEventJ.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventJ.setContentDescription(c31.a(list, ",", null, 62));
        }
        return x(accessibilityEventJ);
    }
}
