package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ny1 extends c40 implements vv0, m02, zn1, mp0, rv {
    public boolean A;
    public boolean B;
    public f70 C;
    public i70 D;
    public h70 E;
    public g70 F;
    public sv G;
    public qk1 H;
    public long I;
    public sh2 J;
    public kp0 K;
    public long L;
    public v6 M;
    public pd0 N;
    public final e4 O;
    public final cy1 P;
    public final w20 Q;
    public final uy1 R;
    public final dv S;
    public final cg0 T;
    public final cx U;
    public x7 V;
    public ly1 W;
    public x40 X;
    public di1 u;
    public ej0 v;
    public boolean w;
    public f91 x;
    public zk y;
    public b80 z;

    public ny1(v6 v6Var, pd0 pd0Var, f91 f91Var, di1 di1Var, oy1 oy1Var, boolean z, boolean z2) {
        yw1 yw1Var = hy1.a;
        this.u = di1Var;
        this.v = yw1Var;
        this.w = z;
        this.x = f91Var;
        this.I = 9205357640488583168L;
        this.L = 0L;
        this.M = v6Var;
        this.N = pd0Var;
        e4 e4Var = new e4();
        e4Var.g = new h8(9, e4Var);
        this.O = e4Var;
        cy1 cy1Var = new cy1();
        cy1Var.s = z;
        F0(cy1Var);
        this.P = cy1Var;
        w20 w20Var = new w20(new l20(new qk1(hy1.d)));
        this.Q = w20Var;
        v6 v6Var2 = this.M;
        pd0 pd0Var2 = this.N;
        uy1 uy1Var = new uy1(oy1Var, v6Var2, pd0Var2 == null ? w20Var : pd0Var2, di1Var, z2, e4Var, this, new jy1(this, 0));
        this.R = uy1Var;
        dv dvVar = new dv();
        dvVar.b = uy1Var;
        dvVar.a = z;
        this.S = dvVar;
        cg0 cg0Var = new cg0(2, null, 10);
        F0(cg0Var);
        this.T = cg0Var;
        cx cxVar = new cx(di1Var, uy1Var, z2, new jy1(this, 1));
        F0(cxVar);
        this.U = cxVar;
        F0(new zd1(dvVar, e4Var));
        jk jkVar = new jk();
        jkVar.s = cxVar;
        F0(jkVar);
    }

    public static void L0(ny1 ny1Var, wn1 wn1Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        h70 h70Var = ny1Var.E;
        if (h70Var == null) {
            h70Var = new h70();
            h70Var.b = null;
            h70Var.c = Long.MAX_VALUE;
            h70Var.d = false;
            ny1Var.E = h70Var;
        }
        h70Var.b = wn1Var;
        h70Var.c = j;
        sh2 sh2Var = ny1Var.J;
        di1 di1Var = ny1Var.u;
        if (sh2Var == null) {
            ny1Var.J = new sh2(di1Var);
        } else {
            sh2Var.a = di1Var;
            sh2Var.b = j2;
        }
        h70Var.d = false;
        ny1Var.G = h70Var;
    }

    /* JADX WARN: Failed to calculate best type for var: r14v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v10 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v8 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v27 ??, new type: sh2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v27 ??, new type: sh2
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v16 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v17 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v19 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v20 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v21 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v11 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // defpackage.mp0
    public final void D(defpackage.h7 r27, defpackage.qn1 r28) {
        /*
            Method dump skipped, instruction units count: 996
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny1.D(h7, qn1):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:229:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0151 A[EDGE_INSN: B:230:0x0151->B:82:0x0151 BREAK  A[LOOP:3: B:76:0x013f->B:80:0x014d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0134  */
    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:80:0x014d A[LOOP:3: B:76:0x013f->B:80:0x014d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:86:0x015b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0160  */
    /* JADX WARN: Code duplicated, block: B:89:0x0172  */
    /* JADX WARN: Code duplicated, block: B:91:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
    @Override // defpackage.zn1
    public final void G(pn1 pn1Var, qn1 qn1Var, long j) {
        qn1 qn1Var2;
        qn1 qn1Var3;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        h70 h70Var;
        wn1 wn1Var;
        long j2;
        sh2 sh2Var;
        float f;
        sh2 sh2Var2;
        long jA;
        i70 i70Var;
        int size;
        int i;
        Object obj5;
        wn1 wn1Var2;
        Object obj6;
        f70 f70Var;
        ny1 ny1Var = this;
        List list = pn1Var.a;
        List list2 = pn1Var.a;
        int size2 = list.size();
        int i2 = 0;
        while (true) {
            qn1Var2 = qn1.f;
            qn1Var3 = qn1.e;
            if (i2 >= size2) {
                break;
            }
            if (((Boolean) ny1Var.v.h(new co1(((wn1) list.get(i2)).i))).booleanValue()) {
                ny1Var.B = true;
                if (!ny1Var.w) {
                    break;
                }
                sv svVar = ny1Var.G;
                if (svVar == null) {
                    f70 f70Var2 = ny1Var.C;
                    if (f70Var2 == null) {
                        obj = svVar;
                        f70Var = f70Var2;
                        f70 f70Var3 = new f70();
                        f70Var3.b = e70.g;
                        f70Var3.c = false;
                        ny1Var.C = f70Var3;
                        f70Var = f70Var3;
                    }
                    obj = svVar;
                    f70Var = f70Var2;
                    ny1Var.G = f70Var;
                    obj = f70Var;
                }
                obj = svVar;
                if (!(obj instanceof f70)) {
                    boolean z2 = obj instanceof h70;
                    qn1 qn1Var4 = qn1.g;
                    if (!z2) {
                        if (obj instanceof g70) {
                            g70 g70Var = (g70) obj;
                            if (qn1Var == qn1Var4) {
                                List list3 = pn1Var.a;
                                int size3 = list3.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size3) {
                                        z = true;
                                        break;
                                    } else {
                                        if (((wn1) list3.get(i3)).b()) {
                                            z = false;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                int size4 = list3.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < size4) {
                                        if (((wn1) list3.get(i4)).d) {
                                            if (!list3.isEmpty()) {
                                                if (!z) {
                                                    break;
                                                }
                                                long j3 = ((wn1) vq.Q(list3)).c;
                                                wn1 wn1Var3 = g70Var.b;
                                                wn1Var3.getClass();
                                                long jD = uf1.d(j3, wn1Var3.c);
                                                wn1 wn1Var4 = g70Var.b;
                                                if (wn1Var4 != null) {
                                                    L0(ny1Var, wn1Var4, g70Var.c, jD, 8);
                                                    break;
                                                } else {
                                                    qj.r("AwaitGesturePickup.initialDown was not initialized.");
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        i4++;
                                    }
                                    ny1Var.J0();
                                    break;
                                }
                            }
                        } else {
                            if (!(obj instanceof i70)) {
                                qj.p();
                                break;
                            }
                            i70 i70Var2 = (i70) obj;
                            if (qn1Var != qn1Var2) {
                                break;
                            }
                            long j4 = i70Var2.b;
                            List list4 = pn1Var.a;
                            int size5 = list4.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size5) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = list4.get(i5);
                                if (vv.j(((wn1) obj2).a, j4)) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            wn1 wn1Var5 = (wn1) obj2;
                            if (wn1Var5 == null) {
                                break;
                            }
                            boolean zQ = sv.q(wn1Var5);
                            j70 j70Var = j70.a;
                            if (!zQ) {
                                if (!wn1Var5.b()) {
                                    if (uf1.c(sv.S(wn1Var5, true)) != 0.0f) {
                                        ny1Var.U0(wn1Var5, sv.S(wn1Var5, false));
                                        wn1Var5.a();
                                        break;
                                    }
                                    break;
                                }
                                ny1Var.S0().c(j70Var);
                            } else {
                                List list5 = pn1Var.a;
                                int size6 = list5.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size6) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = list5.get(i6);
                                    if (((wn1) obj3).d) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                wn1 wn1Var6 = (wn1) obj3;
                                if (wn1Var6 == null) {
                                    if (wn1Var5.b() || !sv.q(wn1Var5)) {
                                        ny1Var.S0().c(j70Var);
                                    } else {
                                        r02.c(ny1Var.T0(), wn1Var5, 0L);
                                        float fA = ((on2) ir2.j(ny1Var, yv.t)).a();
                                        long jR = ny1Var.T0().r(n02.d(fA, fA));
                                        w30 w30Var = (w30) ny1Var.T0().f;
                                        um2 um2Var = w30Var.a;
                                        b00[] b00VarArr = um2Var.d;
                                        ve.B0(0, b00VarArr.length, null, b00VarArr);
                                        um2Var.e = 0;
                                        um2 um2Var2 = w30Var.b;
                                        b00[] b00VarArr2 = um2Var2.d;
                                        ve.B0(0, b00VarArr2.length, null, b00VarArr2);
                                        um2Var2.e = 0;
                                        w30Var.c = 0L;
                                        ny1Var.S0().c(new m70(e80.a(jR), false));
                                        ny1Var.B = false;
                                    }
                                    ny1Var.J0();
                                } else {
                                    i70Var2.b = wn1Var6.a;
                                }
                            }
                        }
                        break;
                        break;
                    }
                    h70 h70Var2 = (h70) obj;
                    if (qn1Var != qn1Var3) {
                        List list6 = pn1Var.a;
                        int size7 = list6.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size7) {
                                obj4 = null;
                                break;
                            }
                            obj4 = list6.get(i7);
                            int i8 = size7;
                            int i9 = i7;
                            if (vv.j(((wn1) obj4).a, h70Var2.c)) {
                                break;
                            }
                            i7 = i9 + 1;
                            size7 = i8;
                        }
                        wn1 wn1Var7 = (wn1) obj4;
                        if (wn1Var7 != null) {
                            if (qn1Var != qn1Var2) {
                                h70Var = h70Var2;
                                if (qn1Var == qn1Var4) {
                                }
                            } else if (!wn1Var7.b()) {
                                h70Var = h70Var2;
                                wn1Var = h70Var.b;
                                if (wn1Var != null) {
                                    j2 = h70Var.c;
                                    sh2Var = ny1Var.J;
                                    if (sh2Var != null) {
                                        ny1Var.K0(wn1Var, j2, sh2Var);
                                        if (qn1Var == qn1Var4) {
                                        }
                                    } else {
                                        qj.r("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    }
                                } else {
                                    qj.r("AwaitTouchSlop.initialDown was not initialized");
                                }
                            } else if (sv.q(wn1Var7)) {
                                size = list6.size();
                                i = 0;
                                while (true) {
                                    if (i < size) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = list6.get(i);
                                    if (((wn1) obj5).d) {
                                        break;
                                        break;
                                    }
                                    i++;
                                }
                                wn1Var2 = (wn1) obj5;
                                if (wn1Var2 == null) {
                                    ny1Var.J0();
                                } else {
                                    h70Var2.c = wn1Var2.a;
                                }
                                h70Var = h70Var2;
                                if (qn1Var == qn1Var4) {
                                }
                            } else {
                                f = u70.f((on2) ir2.j(ny1Var, yv.t), wn1Var7.i);
                                sh2Var2 = ny1Var.J;
                                if (sh2Var2 != null) {
                                    h70Var = h70Var2;
                                    jA = sh2Var2.a(wn1Var7.c, wn1Var7.g, f);
                                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                        wn1Var7.a();
                                        wn1 wn1Var8 = h70Var.b;
                                        wn1Var8.getClass();
                                        ny1Var.V0(wn1Var8, wn1Var7, jA);
                                        ny1Var.U0(wn1Var7, jA);
                                        long j5 = wn1Var7.a;
                                        i70Var = ny1Var.D;
                                        if (i70Var == null) {
                                            i70Var = new i70();
                                            i70Var.b = Long.MAX_VALUE;
                                            ny1Var.D = i70Var;
                                        }
                                        i70Var.b = j5;
                                        ny1Var.G = i70Var;
                                    } else {
                                        h70Var.d = true;
                                    }
                                    if (qn1Var == qn1Var4) {
                                    }
                                } else {
                                    qj.r("Touch slop detector not initialized.");
                                }
                            }
                            break;
                            break;
                        }
                        int size8 = list6.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size8) {
                                obj6 = null;
                                break;
                            }
                            obj6 = list6.get(i10);
                            if (((wn1) obj6).d) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        wn1Var7 = (wn1) obj6;
                        if (wn1Var7 == null) {
                            ny1Var.J0();
                        } else {
                            h70Var2.c = wn1Var7.a;
                            if (qn1Var != qn1Var2) {
                                h70Var = h70Var2;
                                if (qn1Var == qn1Var4 || !h70Var.d) {
                                    break;
                                }
                                if (!wn1Var7.b()) {
                                    h70Var.d = false;
                                    break;
                                }
                                wn1 wn1Var9 = h70Var.b;
                                if (wn1Var9 != null) {
                                    long j6 = h70Var.c;
                                    sh2 sh2Var3 = ny1Var.J;
                                    if (sh2Var3 != null) {
                                        ny1Var.K0(wn1Var9, j6, sh2Var3);
                                    } else {
                                        qj.r("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    }
                                } else {
                                    qj.r("AwaitTouchSlop.initialDown was not initialized");
                                }
                            } else if (!wn1Var7.b()) {
                                h70Var = h70Var2;
                                wn1Var = h70Var.b;
                                if (wn1Var != null) {
                                    j2 = h70Var.c;
                                    sh2Var = ny1Var.J;
                                    if (sh2Var != null) {
                                        ny1Var.K0(wn1Var, j2, sh2Var);
                                        if (qn1Var == qn1Var4) {
                                        }
                                    } else {
                                        qj.r("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    }
                                } else {
                                    qj.r("AwaitTouchSlop.initialDown was not initialized");
                                }
                            } else if (sv.q(wn1Var7)) {
                                size = list6.size();
                                i = 0;
                                while (true) {
                                    if (i < size) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = list6.get(i);
                                    if (((wn1) obj5).d) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                                wn1Var2 = (wn1) obj5;
                                if (wn1Var2 == null) {
                                    ny1Var.J0();
                                } else {
                                    h70Var2.c = wn1Var2.a;
                                }
                                h70Var = h70Var2;
                                if (qn1Var == qn1Var4) {
                                }
                            } else {
                                f = u70.f((on2) ir2.j(ny1Var, yv.t), wn1Var7.i);
                                sh2Var2 = ny1Var.J;
                                if (sh2Var2 != null) {
                                    h70Var = h70Var2;
                                    jA = sh2Var2.a(wn1Var7.c, wn1Var7.g, f);
                                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                        wn1Var7.a();
                                        wn1 wn1Var10 = h70Var.b;
                                        wn1Var10.getClass();
                                        ny1Var.V0(wn1Var10, wn1Var7, jA);
                                        ny1Var.U0(wn1Var7, jA);
                                        long j7 = wn1Var7.a;
                                        i70Var = ny1Var.D;
                                        if (i70Var == null) {
                                            i70Var = new i70();
                                            i70Var.b = Long.MAX_VALUE;
                                            ny1Var.D = i70Var;
                                        }
                                        i70Var.b = j7;
                                        ny1Var.G = i70Var;
                                    } else {
                                        h70Var.d = true;
                                    }
                                    if (qn1Var == qn1Var4) {
                                    }
                                } else {
                                    qj.r("Touch slop detector not initialized.");
                                }
                            }
                        }
                        break;
                        break;
                    }
                    break;
                    break;
                }
                f70 f70Var4 = (f70) obj;
                if (pn1Var.a.isEmpty() || !bc2.c(pn1Var, false)) {
                    break;
                    break;
                }
                wn1 wn1Var11 = (wn1) vq.Q(pn1Var.a);
                int i11 = v70.a[f70Var4.b.ordinal()];
                e70 e70Var = e70.f;
                e70 e70Var2 = e70.e;
                e70 e70Var3 = i11 == 1 ? !ny1Var.W0() ? e70Var2 : e70Var : f70Var4.b;
                f70Var4.b = e70Var3;
                if (qn1Var == qn1Var3 && e70Var3 == e70Var) {
                    wn1Var11.a();
                    f70Var4.c = true;
                }
                if (qn1Var == qn1Var2) {
                    if (e70Var3 == e70Var2) {
                        L0(ny1Var, wn1Var11, wn1Var11.a, 0L, 12);
                    } else if (f70Var4.c) {
                        ny1Var.V0(wn1Var11, wn1Var11, 0L);
                        ny1Var.U0(wn1Var11, 0L);
                        long j8 = wn1Var11.a;
                        i70 i70Var3 = ny1Var.D;
                        if (i70Var3 == null) {
                            i70Var3 = new i70();
                            i70Var3.b = Long.MAX_VALUE;
                            ny1Var.D = i70Var3;
                        }
                        i70Var3.b = j8;
                        ny1Var.G = i70Var3;
                    }
                }
                break;
            }
            i2++;
        }
        if (ny1Var.w) {
            if (qn1Var == qn1Var3 && pn1Var.f == 6) {
                x40 x40Var = ny1Var.X;
                if (x40Var == null) {
                    ny1Var = this;
                    x40 x40Var2 = new x40(ny1Var.R, new ao2(2, ViewConfiguration.get(ux.E(ny1Var).getContext())), new ft(2, this, ny1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), qx.V(ny1Var).B);
                    ny1Var.X = x40Var2;
                    x40Var = x40Var2;
                }
                ez ezVarT0 = ny1Var.t0();
                if (((j82) x40Var.g) == null) {
                    x40Var.g = nj2.y(ezVarT0, null, new e(24, null, x40Var), 3);
                }
            }
            x40 x40Var3 = ny1Var.X;
            if (x40Var3 == null || pn1Var.f != 6) {
                return;
            }
            int size9 = list2.size();
            for (int i12 = 0; i12 < size9; i12++) {
                if (((wn1) list2.get(i12)).b()) {
                    return;
                }
            }
            if (qn1Var == qn1Var3 && x40Var3.a) {
                x40Var3.e(pn1Var);
                int size10 = list2.size();
                for (int i13 = 0; i13 < size10; i13++) {
                    ((wn1) list2.get(i13)).a();
                }
            }
            if (qn1Var == qn1Var2 && !x40Var3.a && x40Var3.e(pn1Var)) {
                int size11 = list2.size();
                for (int i14 = 0; i14 < size11; i14++) {
                    ((wn1) list2.get(i14)).a();
                }
            }
        }
    }

    public final void I0() {
        b80 b80Var = this.z;
        if (b80Var != null) {
            f91 f91Var = this.x;
            if (f91Var != null) {
                f91Var.c(new a80(b80Var));
            }
            this.z = null;
        }
    }

    public final void J0() {
        f70 f70Var = this.C;
        e70 e70Var = e70.g;
        if (f70Var == null) {
            f70Var = new f70();
            f70Var.b = e70Var;
            f70Var.c = false;
            this.C = f70Var;
        }
        f70Var.b = e70Var;
        f70Var.c = false;
        this.G = f70Var;
    }

    public final void K0(wn1 wn1Var, long j, sh2 sh2Var) {
        g70 g70Var = this.F;
        if (g70Var == null) {
            g70Var = new g70();
            g70Var.b = null;
            g70Var.c = Long.MAX_VALUE;
            this.F = g70Var;
        }
        g70Var.b = wn1Var;
        g70Var.c = j;
        sh2Var.b = 0L;
        this.G = g70Var;
    }

    public final void M0(n70 n70Var) {
        if ((n70Var instanceof l70) && !this.A) {
            this.A = true;
            X0();
        }
        S0().c(n70Var);
    }

    public final void O0(m70 m70Var) {
        ez ezVar = (ez) ((ti0) this.O.g).a();
        if (ezVar != null) {
            nj2.y(ezVar, null, new cv1(1, null, m70Var, this), 3);
        } else {
            fu1.h("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P0(tx txVar) throws Throwable {
        w70 w70Var;
        if (txVar instanceof w70) {
            w70Var = (w70) txVar;
            int i = w70Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                w70Var.j = i - Integer.MIN_VALUE;
            } else {
                w70Var = new w70(this, txVar);
            }
        } else {
            w70Var = new w70(this, txVar);
        }
        Object obj = w70Var.h;
        int i2 = w70Var.j;
        if (i2 == 0) {
            ix.Q(obj);
            b80 b80Var = this.z;
            if (b80Var != null) {
                f91 f91Var = this.x;
                if (f91Var != null) {
                    a80 a80Var = new a80(b80Var);
                    w70Var.j = 1;
                    Object objB = f91Var.b(a80Var, w70Var);
                    fz fzVar = fz.e;
                    if (objB == fzVar) {
                        return fzVar;
                    }
                }
            }
            O0(new m70(0L, false));
            return ll2.a;
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(obj);
        this.z = null;
        O0(new m70(0L, false));
        return ll2.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(l70 l70Var, tx txVar) {
        x70 x70Var;
        f91 f91Var;
        b80 b80Var;
        l70 l70Var2;
        b80 b80Var2;
        if (txVar instanceof x70) {
            x70Var = (x70) txVar;
            int i = x70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                x70Var.l = i - Integer.MIN_VALUE;
            } else {
                x70Var = new x70(this, txVar);
            }
        } else {
            x70Var = new x70(this, txVar);
        }
        Object obj = x70Var.j;
        int i2 = x70Var.l;
        fz fzVar = fz.e;
        if (i2 == 0) {
            ix.Q(obj);
            b80 b80Var3 = this.z;
            if (b80Var3 != null && (f91Var = this.x) != null) {
                a80 a80Var = new a80(b80Var3);
                x70Var.h = l70Var;
                x70Var.l = 1;
                if (f91Var.b(a80Var, x70Var) != fzVar) {
                }
                return fzVar;
            }
            this.z = b80Var;
            long j = l70Var.a;
            return ll2.a;
        }
        if (i2 == 1) {
            l70Var = x70Var.h;
            ix.Q(obj);
        } else {
            if (i2 != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b80Var2 = x70Var.i;
            l70Var2 = x70Var.h;
            ix.Q(obj);
        }
        b80Var = b80Var2;
        l70Var = l70Var2;
        this.z = b80Var;
        long j2 = l70Var.a;
        return ll2.a;
        b80Var = new b80();
        f91 f91Var2 = this.x;
        if (f91Var2 != null) {
            x70Var.h = l70Var;
            x70Var.i = b80Var;
            x70Var.l = 2;
            if (f91Var2.b(b80Var, x70Var) != fzVar) {
                l70Var2 = l70Var;
                b80Var2 = b80Var;
                b80Var = b80Var2;
                l70Var = l70Var2;
            }
            return fzVar;
        }
        this.z = b80Var;
        long j3 = l70Var.a;
        return ll2.a;
    }

    @Override // defpackage.vv0
    public final boolean R(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.w || ((!pv0.a(sv0.d0(keyEvent), pv0.D) && !pv0.a(ix.b(keyEvent.getKeyCode()), pv0.C)) || sv0.g0(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.R.d == di1.e;
        cx cxVar = this.U;
        if (z) {
            int i = (int) (cxVar.y & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(pv0.a(ix.b(keyEvent.getKeyCode()), pv0.C) ? i : -i)));
        } else {
            int i2 = (int) (cxVar.y >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(pv0.a(ix.b(keyEvent.getKeyCode()), pv0.C) ? i2 : -i2)) << 32);
        }
        nj2.y(t0(), null, new ly1(this, jFloatToRawIntBits, null, 0), 3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object R0(m70 m70Var, tx txVar) throws Throwable {
        y70 y70Var;
        if (txVar instanceof y70) {
            y70Var = (y70) txVar;
            int i = y70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y70Var.k = i - Integer.MIN_VALUE;
            } else {
                y70Var = new y70(this, txVar);
            }
        } else {
            y70Var = new y70(this, txVar);
        }
        Object obj = y70Var.i;
        int i2 = y70Var.k;
        if (i2 == 0) {
            ix.Q(obj);
            b80 b80Var = this.z;
            if (b80Var != null) {
                f91 f91Var = this.x;
                if (f91Var != null) {
                    c80 c80Var = new c80(b80Var);
                    y70Var.h = m70Var;
                    y70Var.k = 1;
                    Object objB = f91Var.b(c80Var, y70Var);
                    fz fzVar = fz.e;
                    if (objB == fzVar) {
                        return fzVar;
                    }
                }
            }
            O0(m70Var);
            return ll2.a;
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        m70Var = y70Var.h;
        ix.Q(obj);
        this.z = null;
        O0(m70Var);
        return ll2.a;
    }

    public final lo S0() {
        zk zkVar = this.y;
        if (zkVar != null) {
            return zkVar;
        }
        qj.r("Events channel not initialized.");
        return null;
    }

    public final qk1 T0() {
        qk1 qk1Var = this.H;
        if (qk1Var != null) {
            return qk1Var;
        }
        qj.r("Velocity Tracker not initialized.");
        return null;
    }

    public final void U0(wn1 wn1Var, long j) {
        long jC = qx.U(this.e).c(0L);
        if (!uf1.b(this.I, 9205357640488583168L) && !uf1.b(jC, this.I)) {
            this.L = uf1.e(this.L, uf1.d(jC, this.I));
        }
        this.I = jC;
        r02.c(T0(), wn1Var, this.L);
        S0().c(new k70(j, false));
    }

    public final void V0(wn1 wn1Var, wn1 wn1Var2, long j) {
        if (this.H == null) {
            this.H = new qk1(24);
        }
        r02.c(T0(), wn1Var, 0L);
        long jD = uf1.d(wn1Var2.c, j);
        this.L = 0L;
        if (((Boolean) this.v.h(new co1(wn1Var.i))).booleanValue()) {
            if (!this.A) {
                if (this.y == null) {
                    this.y = s5.d(Integer.MAX_VALUE, 6, null);
                }
                X0();
            }
            this.I = qx.U(this).c(0L);
            S0().c(new l70(jD));
        }
    }

    public final boolean W0() {
        uy1 uy1Var = this.R;
        if (uy1Var.a.b()) {
            return true;
        }
        v6 v6Var = uy1Var.b;
        if (v6Var == null) {
            return false;
        }
        g90 g90Var = v6Var.c;
        EdgeEffect edgeEffect = g90Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x5.d(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = g90Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x5.d(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = g90Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? x5.d(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = g90Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? x5.d(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final void X0() {
        this.A = true;
        if (this.y == null) {
            this.y = s5.d(Integer.MAX_VALUE, 6, null);
        }
        nj2.y(t0(), null, new z70(this, null), 3);
    }

    public final void Y0(v6 v6Var, pd0 pd0Var, f91 f91Var, di1 di1Var, oy1 oy1Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.w != z) {
            this.S.a = z;
            this.P.s = z;
            z3 = true;
        } else {
            z3 = false;
        }
        pd0 pd0Var2 = pd0Var == null ? this.Q : pd0Var;
        uy1 uy1Var = this.R;
        if (ws0.j(uy1Var.a, oy1Var)) {
            z4 = false;
        } else {
            uy1Var.a = oy1Var;
            z4 = true;
        }
        uy1Var.b = v6Var;
        di1 di1Var2 = uy1Var.d;
        if (di1Var2 != di1Var) {
            uy1Var.d = di1Var;
            di1Var2 = di1Var;
            z4 = true;
        }
        if (uy1Var.e != z2) {
            uy1Var.e = z2;
            z4 = true;
        }
        uy1Var.c = pd0Var2;
        uy1Var.f = this.O;
        cx cxVar = this.U;
        cxVar.s = di1Var;
        cxVar.u = z2;
        this.M = v6Var;
        this.N = pd0Var;
        yw1 yw1Var = hy1.a;
        di1 di1Var3 = di1.e;
        if (di1Var2 != di1Var3) {
            di1Var3 = di1.f;
        }
        this.v = yw1Var;
        if (this.w != z) {
            this.w = z;
            if (!z) {
                I0();
                this.K = null;
            }
            z4 = true;
        }
        if (!ws0.j(this.x, f91Var)) {
            I0();
            this.x = f91Var;
        }
        if (this.u != di1Var3) {
            this.u = di1Var3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.B;
            j70 j70Var = j70.a;
            if (z6) {
                J0();
                if (this.A) {
                    S0().c(j70Var);
                }
                this.H = null;
            }
            kp0 kp0Var = this.K;
            if (kp0Var != null) {
                kp0Var.a();
                ny1 ny1Var = kp0Var.a;
                if (ny1Var.A) {
                    ny1Var.M0(j70Var);
                }
                kp0Var.g = null;
                lp0 lp0Var = kp0Var.k;
                lp0Var.a = 0;
                lp0Var.b.clear();
            }
        }
        if (z3) {
            this.V = null;
            this.W = null;
            n02.l(this);
        }
    }

    @Override // defpackage.b40, defpackage.zn1
    public final void a() {
        f0();
        if (this.r) {
            m40 m40Var = qx.V(this).B;
            w20 w20Var = this.Q;
            w20Var.getClass();
            w20Var.a = new l20(new qk1(m40Var));
        }
        x40 x40Var = this.X;
        if (x40Var != null) {
            x40Var.e = qx.V(this).B;
        }
    }

    @Override // defpackage.m02
    public final void e0(z02 z02Var) {
        if (this.w && (this.V == null || this.W == null)) {
            this.V = new x7(24, this);
            this.W = new ly1(this, null);
        }
        x7 x7Var = this.V;
        if (x7Var != null) {
            lv0[] lv0VarArr = w02.a;
            z02Var.a(h02.d, new p0(null, x7Var));
        }
        ly1 ly1Var = this.W;
        if (ly1Var != null) {
            lv0[] lv0VarArr2 = w02.a;
            z02Var.a(h02.e, ly1Var);
        }
    }

    @Override // defpackage.zn1
    public final void f0() {
        if (this.B) {
            J0();
            if (this.A) {
                S0().c(j70.a);
            }
            this.H = null;
        }
        this.B = false;
    }

    @Override // defpackage.vv0
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.t71
    public final boolean u0() {
        return false;
    }

    @Override // defpackage.t71
    public final void x0() {
        if (this.r) {
            m40 m40Var = qx.V(this).B;
            w20 w20Var = this.Q;
            w20Var.getClass();
            w20Var.a = new l20(new qk1(m40Var));
        }
        x40 x40Var = this.X;
        if (x40Var != null) {
            x40Var.e = qx.V(this).B;
        }
    }

    @Override // defpackage.t71
    public final void y0() {
        this.A = false;
        I0();
        this.L = 0L;
    }

    @Override // defpackage.mp0
    public final void z() {
        kp0 kp0Var = this.K;
        if (kp0Var != null) {
            kp0Var.a();
            ny1 ny1Var = kp0Var.a;
            if (ny1Var.A) {
                ny1Var.M0(j70.a);
            }
            kp0Var.g = null;
            lp0 lp0Var = kp0Var.k;
            lp0Var.a = 0;
            lp0Var.b.clear();
        }
    }

    public final void N0(long j) {
    }
}
