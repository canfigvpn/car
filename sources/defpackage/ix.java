package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.graphics.Typeface;
import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import ir.alirezaivaz.mygarage.R;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ix {
    public static g7 a;
    public static j4 b;
    public static um c;
    public static final /* synthetic */ int d = 0;

    public static final String[] A(hx hxVar) {
        hxVar.getClass();
        return (String[]) ((c6) hxVar).b.toArray(new String[0]);
    }

    public static final Object B(r61 r61Var) {
        Object objJ = r61Var.j();
        ow0 ow0Var = objJ instanceof ow0 ? (ow0) objJ : null;
        if (ow0Var != null) {
            return ow0Var.s;
        }
        return null;
    }

    public static String C(Class cls) {
        LinkedHashMap linkedHashMap = rd1.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            pd1 pd1Var = (pd1) cls.getAnnotation(pd1.class);
            strValue = pd1Var != null ? pd1Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                qj.f("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final ro1 D(View view) {
        ro1 ro1Var = (ro1) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (ro1Var != null) {
            return ro1Var;
        }
        ro1 ro1Var2 = new ro1();
        view.setTag(R.id.pooling_container_listener_holder_tag, ro1Var2);
        return ro1Var2;
    }

    public static final z41 E(z41 z41Var) {
        ax0 ax0Var = z41Var.s.s;
        while (true) {
            ax0 ax0VarU = ax0Var.u();
            ax0 ax0Var2 = null;
            if ((ax0VarU != null ? ax0VarU.l : null) == null) {
                z41 z41VarQ0 = ax0Var.I.d.Q0();
                z41VarQ0.getClass();
                return z41VarQ0;
            }
            ax0 ax0VarU2 = ax0Var.u();
            if (ax0VarU2 != null) {
                ax0Var2 = ax0VarU2.l;
            }
            ax0Var2.getClass();
            ax0 ax0VarU3 = ax0Var.u();
            ax0VarU3.getClass();
            ax0Var = ax0VarU3.l;
            ax0Var.getClass();
        }
    }

    public static iv1 F(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        qj.r(k3.i("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new iv1(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static final boolean G(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static final boolean H(ax0 ax0Var) {
        int iOrdinal = ax0Var.J.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            qj.p();
                            return false;
                        }
                        ax0 ax0VarU = ax0Var.u();
                        if (ax0VarU != null) {
                            return H(ax0VarU);
                        }
                        qj.r("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final Object I(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static byte[] J(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                fu1.h(k3.i("Not enough bytes to read: ", i));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] K(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static long L(InputStream inputStream, int i) {
        byte[] bArrJ = J(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrJ[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r0v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r0v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v6 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v7 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v8 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r8v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: float
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
    /* JADX WARN: Failed to calculate best type for var: r9v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: float
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
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
    public static final long M(float r50, long r51) {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.M(float, long):long");
    }

    public static final jr1 N(pe0 pe0Var, ez ezVar, r42 r42Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        ru1 ru1Var;
        no noVar;
        pe0 pe0VarF;
        lo.b.getClass();
        ko koVar = ko.a;
        int i = 5;
        if (!(pe0Var instanceof no) || (pe0VarF = (noVar = (no) pe0Var).f()) == null) {
            ru1Var = new ru1(i, pe0Var, ab0.e);
        } else {
            if (noVar.f != -3) {
            }
            ru1Var = new ru1(i, pe0VarF, noVar.e);
        }
        s82 s82VarF = j20.f(obj);
        nj2.x(ezVar, (uy) ru1Var.c, r42Var.equals(q42.a) ? hz.e : hz.h, new n7(r42Var, (pe0) ru1Var.b, s82VarF, obj, (sx) null));
        return new jr1(s82VarF);
    }

    public static final int O(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object P(int i, Object obj, kt1 kt1Var, lh0 lh0Var, int i2) {
        byte b2;
        byte b3;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) == 0 || ws0.j(kt1Var.b, lh0Var)) {
            b2 = false;
        } else {
            lh0 lh0Var2 = lh0.h;
            if (lh0Var.compareTo(lh0Var2) < 0 || ws0.n(kt1Var.b.e, lh0Var2.e) >= 0) {
                b2 = false;
            } else {
                b2 = true;
            }
        }
        if ((i & 2) != 0) {
            kt1Var.getClass();
            if (i2 == 0) {
                b3 = false;
            } else {
                b3 = true;
            }
        } else {
            b3 = false;
        }
        if (b3 != true && b2 != true) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int i4 = b2 != false ? lh0Var.e : kt1Var.b.e;
            if (b3 != true) {
                kt1Var.getClass();
            } else if (i2 == 1) {
                z = true;
            }
            return Typeface.create((Typeface) obj, i4, z);
        }
        byte b4 = b3 == true && i2 == 1;
        if (b4 == true && b2 == true) {
            i3 = 3;
        } else if (b2 == true) {
            i3 = 1;
        } else if (b4 != false) {
            i3 = 2;
        }
        return Typeface.create((Typeface) obj, i3);
    }

    public static final void Q(Object obj) {
        if (obj instanceof ut1) {
            throw ((ut1) obj).e;
        }
    }

    public static final void R(String str, int i) {
        throw new SQLException(k3.i("Error code: ", i) + ", message: ".concat(str));
    }

    public static final uz1 S(final a52 a52Var, final vp vpVar, uz1 uz1Var) {
        nz nzVar;
        int i = vpVar.c;
        int i2 = vpVar.b;
        boolean z = a52Var.b;
        final int i3 = z ? i2 : i;
        hf2 hf2Var = (hf2) vpVar.e;
        int i4 = vpVar.d;
        a20 a20Var = new a20(i3, 1, vpVar);
        v01 v01Var = v01.f;
        final rx0 rx0VarF = vv.F(v01Var, a20Var);
        final int i5 = z ? i : i2;
        rx0 rx0VarF2 = vv.F(v01Var, new ti0() { // from class: wz1
            @Override // defpackage.ti0
            public final Object a() {
                vp vpVar2 = vpVar;
                hf2 hf2Var2 = (hf2) vpVar2.e;
                int iIntValue = ((Number) rx0VarF.getValue()).intValue();
                a52 a52Var2 = a52Var;
                boolean z2 = a52Var2.b;
                boolean z3 = a52Var2.a() == nz.e;
                int i6 = i3;
                long jI = hf2Var2.i(i6);
                t81 t81Var = hf2Var2.b;
                int i7 = of2.c;
                int iF = (int) (jI >> 32);
                int i8 = t81Var.f;
                if (t81Var.d(iF) != iIntValue) {
                    iF = iIntValue >= i8 ? hf2Var2.f(i8 - 1) : hf2Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (t81Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? t81Var.c(i8 - 1, false) : t81Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iF == i9) {
                    return vpVar2.b(iC);
                }
                if (iC == i9) {
                    return vpVar2.b(iF);
                }
                if (!(z2 ^ z3) ? i6 >= iF : i6 > iC) {
                    iF = iC;
                }
                return vpVar2.b(iF);
            }
        });
        if (1 != uz1Var.c) {
            return (uz1) rx0VarF2.getValue();
        }
        if (i3 == i4) {
            return uz1Var;
        }
        if (((Number) rx0VarF.getValue()).intValue() != hf2Var.b.d(i4)) {
            return (uz1) rx0VarF2.getValue();
        }
        int i6 = uz1Var.b;
        long jI = hf2Var.i(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                nz nzVar2 = nz.e;
                if (i2 < i) {
                    nzVar = nz.f;
                } else {
                    nzVar = i2 > i ? nzVar2 : nz.g;
                }
                if (((z ? 1 : 0) ^ (nzVar != nzVar2 ? 0 : 1)) == 0) {
                }
            }
            return vpVar.b(i3);
        }
        int i7 = of2.c;
        return (i6 == ((int) (jI >> 32)) || i6 == ((int) (jI & 4294967295L))) ? (uz1) rx0VarF2.getValue() : vpVar.b(i3);
    }

    public static final il2 T(sx sxVar, uy uyVar, Object obj) {
        il2 il2Var = null;
        if ((sxVar instanceof gz) && uyVar.p(rm.h) != null) {
            gz gzVarE = (gz) sxVar;
            while (!(gzVarE instanceof q50) && (gzVarE = gzVarE.e()) != null) {
                if (gzVarE instanceof il2) {
                    il2Var = (il2) gzVarE;
                    break;
                }
            }
            if (il2Var != null) {
                il2Var.l0(uyVar, obj);
            }
        }
        return il2Var;
    }

    public static void U(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, int i) {
        U(byteArrayOutputStream, i, 2);
    }

    public static final c6 a(String str) {
        Set setSingleton = Collections.singleton(str);
        setSingleton.getClass();
        return new c6(setSingleton);
    }

    public static final long b(int i) {
        long j = ((long) i) << 32;
        int i2 = pv0.F;
        return j;
    }

    public static final void c(ti0 ti0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-1646555525);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(ti0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (ak0Var.O(i2 & 1, (i2 & 3) != 2)) {
            i((View) ak0Var.j(u5.f), (m40) ak0Var.j(yv.h), ti0Var, ak0Var, (i2 << 6) & 896);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new f6(i, i3, ti0Var);
        }
    }

    public static final void d(u71 u71Var, gt gtVar, ak0 ak0Var, int i) {
        int i2;
        final u71 u71Var2;
        final gt gtVar2;
        ak0Var.X(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (objL == is1Var) {
                dk1 dk1Var = new dk1(null, q90.U);
                ak0Var.g0(dk1Var);
                objL = dk1Var;
            }
            final da1 da1Var = (da1) objL;
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = new r9(da1Var, 26);
                ak0Var.g0(objL2);
            }
            final ti0 ti0Var = (ti0) objL2;
            yo1 yo1Var = v30.a;
            final xh xhVarT = p61.t(vs0.j, ak0Var, 6);
            u71Var2 = u71Var;
            gtVar2 = gtVar;
            sv.b(new vq1[]{yc2.b.a(p61.g0(ti0Var, ak0Var, 2)), yc2.a.a(xhVarT)}, vs0.C(1070596993, new ij0() { // from class: nm1
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ak0 ak0Var2 = (ak0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (ak0Var2.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objL3 = ak0Var2.L();
                        if (objL3 == cv.a) {
                            objL3 = new s9(da1Var, 7);
                            ak0Var2.g0(objL3);
                        }
                        u71 u71VarZ = j20.z(u71Var2, (ej0) objL3);
                        w61 w61VarC = xj.c(q90.f, true);
                        int iHashCode = Long.hashCode(ak0Var2.T);
                        sl1 sl1VarL = ak0Var2.l();
                        u71 u71VarB = nj2.B(ak0Var2, u71VarZ);
                        wu.c.getClass();
                        wv wvVar = vu.b;
                        ak0Var2.Z();
                        if (ak0Var2.S) {
                            ak0Var2.k(wvVar);
                        } else {
                            ak0Var2.j0();
                        }
                        p12.l(vu.f, ak0Var2, w61VarC);
                        p12.l(vu.e, ak0Var2, sl1VarL);
                        p12.f(ak0Var2, Integer.valueOf(iHashCode), vu.g);
                        p12.k(ak0Var2, vu.h);
                        p12.l(vu.d, ak0Var2, u71VarB);
                        gtVar2.g(ak0Var2, 0);
                        xhVarT.b(ti0Var, ak0Var2, 6);
                        ak0Var2.p(true);
                    } else {
                        ak0Var2.R();
                    }
                    return ll2.a;
                }
            }, ak0Var), ak0Var, 56);
        } else {
            u71Var2 = u71Var;
            gtVar2 = gtVar;
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q9(u71Var2, gtVar2, i, i3);
        }
    }

    public static final void e(u71 u71Var, gt gtVar, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(155925518);
        if ((i & 6) == 0) {
            i2 = (ak0Var.f(u71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        int i3 = 3;
        if (ak0Var.O(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ak0Var.j(yc2.a) != null;
            boolean z2 = ak0Var.j(yc2.b) != null;
            if (z && z2) {
                ak0Var.W(-1977187922);
                w61 w61VarC = xj.c(q90.f, true);
                int iHashCode = Long.hashCode(ak0Var.T);
                sl1 sl1VarL = ak0Var.l();
                u71 u71VarB = nj2.B(ak0Var, u71Var);
                wu.c.getClass();
                wv wvVar = vu.b;
                ak0Var.Z();
                if (ak0Var.S) {
                    ak0Var.k(wvVar);
                } else {
                    ak0Var.j0();
                }
                p12.l(vu.f, ak0Var, w61VarC);
                p12.l(vu.e, ak0Var, sl1VarL);
                p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
                p12.k(ak0Var, vu.h);
                p12.l(vu.d, ak0Var, u71VarB);
                gtVar.g(ak0Var, Integer.valueOf((i2 >> 3) & 14));
                ak0Var.p(true);
                ak0Var.p(false);
            } else if (z) {
                ak0Var.W(-1976997706);
                p61.n(u71Var, gtVar, ak0Var, i2 & 126);
                ak0Var.p(false);
            } else if (z2) {
                ak0Var.W(-1976846922);
                v30.d(u71Var, gtVar, ak0Var, i2 & 126);
                ak0Var.p(false);
            } else {
                ak0Var.W(-1976716505);
                d(u71Var, gtVar, ak0Var, i2 & 126);
                ak0Var.p(false);
            }
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new q9(u71Var, gtVar, i, i3);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r2v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v2 ??, new type: int
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
    /* JADX WARN: Failed to calculate best type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: ak0
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
    /* JADX WARN: Failed to calculate best type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: int
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
    /* JADX WARN: Failed to set immutable type for var: r35v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 ??, new type: ak0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to set immutable type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$0(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v0 ??, new type: int
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
    public static final void f(defpackage.u71 r23, defpackage.ij0 r24, defpackage.ij0 r25, defpackage.ij0 r26, defpackage.ij0 r27, int r28, long r29, long r31, defpackage.uo2 r33, defpackage.gt r34, defpackage.ak0 r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.f(u71, ij0, ij0, ij0, ij0, int, long, long, uo2, gt, ak0, int, int):void");
    }

    public static final void g(final int i, ij0 ij0Var, gt gtVar, ij0 ij0Var2, ij0 ij0Var3, final uo2 uo2Var, ij0 ij0Var4, ak0 ak0Var, int i2) {
        boolean z;
        ak0Var.X(-280287501);
        int i3 = i2 | (ak0Var.d(i) ? 4 : 2) | (ak0Var.h(ij0Var) ? 32 : 16) | (ak0Var.h(gtVar) ? 256 : 128) | (ak0Var.h(ij0Var2) ? 2048 : 1024) | (ak0Var.h(ij0Var3) ? 16384 : 8192) | (ak0Var.f(uo2Var) ? 131072 : 65536) | (ak0Var.h(ij0Var4) ? 1048576 : 524288);
        if (ak0Var.O(i3 & 1, (599187 & i3) != 599186)) {
            Object objL = ak0Var.L();
            Object obj = cv.a;
            if (objL == obj) {
                objL = new fx1();
                ak0Var.g0(objL);
            }
            final fx1 fx1Var = (fx1) objL;
            boolean z2 = (i3 & 112) == 32;
            Object objL2 = ak0Var.L();
            if (z2 || objL2 == obj) {
                objL2 = new gt(new l3(8, ij0Var), true, 605195056);
                ak0Var.g0(objL2);
            }
            final ij0 ij0Var5 = (ij0) objL2;
            boolean z3 = (i3 & 7168) == 2048;
            Object objL3 = ak0Var.L();
            if (z3 || objL3 == obj) {
                objL3 = new gt(new l3(7, ij0Var2), true, 418899191);
                ak0Var.g0(objL3);
            }
            final ij0 ij0Var6 = (ij0) objL3;
            boolean z4 = (57344 & i3) == 16384;
            Object objL4 = ak0Var.L();
            if (z4 || objL4 == obj) {
                objL4 = new gt(new l3(6, ij0Var3), true, 338600263);
                ak0Var.g0(objL4);
            }
            final ij0 ij0Var7 = (ij0) objL4;
            boolean z5 = (i3 & 896) == 256;
            Object objL5 = ak0Var.L();
            if (z5 || objL5 == obj) {
                objL5 = new gt(new ji(9, gtVar, fx1Var, false), true, -1776388365);
                ak0Var.g0(objL5);
            }
            final ij0 ij0Var8 = (ij0) objL5;
            boolean z6 = (i3 & 3670016) == 1048576;
            Object objL6 = ak0Var.L();
            if (z6 || objL6 == obj) {
                z = true;
                Object gtVar2 = new gt(new l3(5, ij0Var4), true, -1731662488);
                ak0Var.g0(gtVar2);
                objL6 = gtVar2;
            } else {
                z = true;
            }
            final ij0 ij0Var9 = (ij0) objL6;
            boolean zF = ak0Var.f(ij0Var5) | ((i3 & 458752) == 131072 ? z : false) | ak0Var.f(ij0Var6) | ak0Var.f(ij0Var7) | ((i3 & 14) == 4) | ak0Var.f(ij0Var9) | ak0Var.f(ij0Var8);
            Object objL7 = ak0Var.L();
            if (zF || objL7 == obj) {
                Object obj2 = new ij0() { // from class: cx1
                    @Override // defpackage.ij0
                    public final Object g(Object obj3, Object obj4) {
                        int i4;
                        int iO;
                        int iO2;
                        yc0 yc0Var;
                        Integer numValueOf;
                        int i5;
                        int iIntValue;
                        int iO3;
                        int iA;
                        final ba2 ba2Var = (ba2) obj3;
                        sw swVar = (sw) obj4;
                        final int iH = sw.h(swVar.a);
                        final int iG = sw.g(swVar.a);
                        long jA = sw.a(swVar.a, 0, 0, 0, 0, 10);
                        kw0 layoutDirection = ba2Var.getLayoutDirection();
                        final uo2 uo2Var2 = uo2Var;
                        int iD = uo2Var2.d(ba2Var, layoutDirection);
                        int iC = uo2Var2.c(ba2Var, ba2Var.getLayoutDirection());
                        int iA2 = uo2Var2.a(ba2Var);
                        final jm1 jm1VarE = ((r61) vq.Q(ba2Var.F(ij0Var5, gx1.e))).e(jA);
                        int i6 = (-iD) - iC;
                        int i7 = -iA2;
                        final jm1 jm1VarE2 = ((r61) vq.Q(ba2Var.F(ij0Var6, gx1.g))).e(tw.i(i6, i7, jA));
                        final jm1 jm1VarE3 = ((r61) vq.Q(ba2Var.F(ij0Var7, gx1.h))).e(tw.i(i6, i7, jA));
                        int i8 = jm1VarE3.e;
                        int i9 = i;
                        if (i8 == 0 && jm1VarE3.f == 0) {
                            yc0Var = null;
                        } else {
                            int i10 = jm1VarE3.f;
                            kw0 kw0Var = kw0.e;
                            if (i9 == 0) {
                                i4 = iD;
                                if (ba2Var.getLayoutDirection() == kw0Var) {
                                    iO = ba2Var.O(16.0f);
                                    iO2 = iO + i4;
                                } else {
                                    iO2 = ((iH - ba2Var.O(16.0f)) - i8) - iC;
                                }
                            } else {
                                i4 = iD;
                                if (i9 != 2 && i9 != 3) {
                                    iO2 = (((iH - i8) + i4) - iC) / 2;
                                } else if (ba2Var.getLayoutDirection() == kw0Var) {
                                    iO2 = ((iH - ba2Var.O(16.0f)) - i8) - iC;
                                } else {
                                    iO = ba2Var.O(16.0f);
                                    iO2 = iO + i4;
                                }
                            }
                            yc0Var = new yc0();
                            yc0Var.a = iO2;
                            yc0Var.b = i10;
                        }
                        final jm1 jm1VarE4 = ((r61) vq.Q(ba2Var.F(ij0Var9, gx1.i))).e(jA);
                        boolean z7 = jm1VarE4.e == 0 && jm1VarE4.f == 0;
                        if (yc0Var != null) {
                            int i11 = yc0Var.b;
                            if (z7 || i9 == 3) {
                                iO3 = ba2Var.O(16.0f) + i11;
                                iA = uo2Var2.a(ba2Var);
                            } else {
                                iO3 = jm1VarE4.f + i11;
                                iA = ba2Var.O(16.0f);
                            }
                            numValueOf = Integer.valueOf(iA + iO3);
                        } else {
                            numValueOf = null;
                        }
                        int i12 = jm1VarE2.f;
                        if (i12 != 0) {
                            if (numValueOf != null) {
                                iIntValue = numValueOf.intValue();
                            } else {
                                Integer numValueOf2 = Integer.valueOf(jm1VarE4.f);
                                if (z7) {
                                    numValueOf2 = null;
                                }
                                iIntValue = numValueOf2 != null ? numValueOf2.intValue() : uo2Var2.a(ba2Var);
                            }
                            i5 = i12 + iIntValue;
                        } else {
                            i5 = 0;
                        }
                        sq0 sq0Var = new sq0(uo2Var2, ba2Var);
                        final yc0 yc0Var2 = yc0Var;
                        fx1Var.a.setValue(new kj1(p61.x(sq0Var, ba2Var.getLayoutDirection()), (jm1VarE.e == 0 && jm1VarE.f == 0) ? sq0Var.d() : ba2Var.n0(jm1VarE.f), p61.w(sq0Var, ba2Var.getLayoutDirection()), z7 ? sq0Var.c() : ba2Var.n0(jm1VarE4.f)));
                        final jm1 jm1VarE5 = ((r61) vq.Q(ba2Var.F(ij0Var8, gx1.f))).e(jA);
                        final Integer num = numValueOf;
                        final int i13 = i5;
                        return ba2Var.d0(iH, iG, db0.e, new ej0() { // from class: dx1
                            @Override // defpackage.ej0
                            public final Object h(Object obj5) {
                                im1 im1Var = (im1) obj5;
                                im1Var.h(jm1VarE5, 0, 0, 0.0f);
                                im1Var.h(jm1VarE, 0, 0, 0.0f);
                                jm1 jm1Var = jm1VarE2;
                                int i14 = iH - jm1Var.e;
                                ba2 ba2Var2 = ba2Var;
                                kw0 layoutDirection2 = ba2Var2.getLayoutDirection();
                                uo2 uo2Var3 = uo2Var2;
                                int iD2 = ((uo2Var3.d(ba2Var2, layoutDirection2) + i14) - uo2Var3.c(ba2Var2, ba2Var2.getLayoutDirection())) / 2;
                                int i15 = iG;
                                im1Var.h(jm1Var, iD2, i15 - i13, 0.0f);
                                jm1 jm1Var2 = jm1VarE4;
                                im1Var.h(jm1Var2, 0, i15 - jm1Var2.f, 0.0f);
                                yc0 yc0Var3 = yc0Var2;
                                if (yc0Var3 != null) {
                                    int i16 = yc0Var3.a;
                                    Integer num2 = num;
                                    num2.getClass();
                                    im1Var.h(jm1VarE3, i16, i15 - num2.intValue(), 0.0f);
                                }
                                return ll2.a;
                            }
                        });
                    }
                };
                ak0Var.g0(obj2);
                objL7 = obj2;
            }
            ws0.g(null, (ij0) objL7, ak0Var, 0);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new hs(i, ij0Var, gtVar, ij0Var2, ij0Var3, uo2Var, ij0Var4, i2);
        }
    }

    public static final void h(jz0 jz0Var, Object obj, int i, Object obj2, ak0 ak0Var, int i2) {
        ak0Var.X(1439843069);
        int i3 = (ak0Var.f(jz0Var) ? 4 : 2) | i2 | (ak0Var.f(obj) ? 32 : 16) | (ak0Var.d(i) ? 256 : 128) | (ak0Var.f(obj2) ? 2048 : 1024);
        if (ak0Var.O(i3 & 1, (i3 & 1171) != 1170)) {
            ((ew1) obj).b(obj2, vs0.C(980966366, new et(jz0Var, i, obj2, 6), ak0Var), ak0Var, 48);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(jz0Var, obj, i, obj2, i2);
        }
    }

    public static final void i(View view, m40 m40Var, ti0 ti0Var, ak0 ak0Var, int i) {
        int i2;
        ak0Var.X(-1319522472);
        if ((i & 6) == 0) {
            i2 = (ak0Var.h(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ak0Var.f(m40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ak0Var.h(ti0Var) ? 256 : 128;
        }
        if (ak0Var.O(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = ak0Var.h(view) | ((i2 & 896) == 256);
            Object objL = ak0Var.L();
            if (zH || objL == cv.a) {
                objL = new d(14, view, ti0Var);
                ak0Var.g0(objL);
            }
            s5.f(view, m40Var, (ej0) objL, ak0Var);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new y8(view, m40Var, ti0Var, i, 8);
        }
    }

    public static final vz1 j(a52 a52Var, is1 is1Var) {
        nz nzVarA = a52Var.a();
        vp vpVar = (vp) a52Var.d;
        boolean z = nzVarA == nz.e;
        return new vz1(l(vpVar, z, true, is1Var), l(vpVar, z, false, is1Var), z);
    }

    public static void k(o52 o52Var, List list, qv qvVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iC = o52Var.c((vj0) list.get(i));
            int iM = o52Var.M(o52Var.b, o52Var.q(iC));
            Object obj = iM < o52Var.f(o52Var.b, o52Var.q(iC + 1)) ? o52Var.c[o52Var.g(iM)] : cv.a;
            lr1 lr1Var = obj instanceof lr1 ? (lr1) obj : null;
            if (lr1Var != null) {
                lr1Var.a = qvVar;
            }
        }
    }

    public static final uz1 l(vp vpVar, boolean z, boolean z2, is1 is1Var) {
        long jC;
        long j;
        int i = z2 ? vpVar.b : vpVar.c;
        switch (is1Var.e) {
            case 2:
                String str = ((hf2) vpVar.e).a.a.f;
                jC = j02.c(y12.h(str, i), y12.g(str, i));
                break;
            default:
                jC = ((hf2) vpVar.e).i(i);
                break;
        }
        if (z ^ z2) {
            int i2 = of2.c;
            j = jC >> 32;
        } else {
            int i3 = of2.c;
            j = 4294967295L & jC;
        }
        return vpVar.b((int) j);
    }

    public static final float m(l20 l20Var, float f) {
        yd0 yd0Var = l20Var.a;
        pb pbVar = new pb(0.0f);
        int iB = pbVar.b();
        int i = 0;
        while (i < iB) {
            pbVar.e(i, yd0Var.g(0.0f, i == 0 ? f : 0.0f));
            i++;
        }
        return pbVar.a;
    }

    public static final uz1 n(uz1 uz1Var, vp vpVar, int i) {
        return new uz1(((hf2) vpVar.e).a(i), i, uz1Var.c);
    }

    public static byte[] o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    public static final boolean p(yr1 yr1Var, float f, float f2) {
        float f3 = yr1Var.a;
        if (f > yr1Var.c || f3 > f) {
            return false;
        }
        return f2 <= yr1Var.d && yr1Var.b <= f2;
    }

    public static final ut1 q(Throwable th) {
        th.getClass();
        return new ut1(th);
    }

    public static final ic1 r(Context context) {
        context.getClass();
        ic1 ic1Var = new ic1(context);
        rb1 rb1Var = ic1Var.b;
        rd1 rd1Var = rb1Var.s;
        rd1Var.a(new fu(rd1Var));
        rd1 rd1Var2 = rb1Var.s;
        rd1Var2.a(new hu());
        rd1Var2.a(new h50());
        return ic1Var;
    }

    public static final dh2 s(Context context) {
        p61.Y(context, android.R.color.system_neutral1_0);
        p61.Y(context, android.R.color.system_neutral1_10);
        M(98.0f, p61.Y(context, android.R.color.system_neutral1_600));
        M(96.0f, p61.Y(context, android.R.color.system_neutral1_600));
        p61.Y(context, android.R.color.system_neutral1_50);
        M(94.0f, p61.Y(context, android.R.color.system_neutral1_600));
        M(92.0f, p61.Y(context, android.R.color.system_neutral1_600));
        p61.Y(context, android.R.color.system_neutral1_100);
        M(87.0f, p61.Y(context, android.R.color.system_neutral1_600));
        p61.Y(context, android.R.color.system_neutral1_200);
        p61.Y(context, android.R.color.system_neutral1_300);
        p61.Y(context, android.R.color.system_neutral1_400);
        p61.Y(context, android.R.color.system_neutral1_500);
        p61.Y(context, android.R.color.system_neutral1_600);
        p61.Y(context, android.R.color.system_neutral1_700);
        M(24.0f, p61.Y(context, android.R.color.system_neutral1_600));
        M(22.0f, p61.Y(context, android.R.color.system_neutral1_600));
        p61.Y(context, android.R.color.system_neutral1_800);
        M(17.0f, p61.Y(context, android.R.color.system_neutral1_600));
        M(12.0f, p61.Y(context, android.R.color.system_neutral1_600));
        p61.Y(context, android.R.color.system_neutral1_900);
        M(6.0f, p61.Y(context, android.R.color.system_neutral1_600));
        M(4.0f, p61.Y(context, android.R.color.system_neutral1_600));
        p61.Y(context, android.R.color.system_neutral1_1000);
        long jY = p61.Y(context, android.R.color.system_neutral2_0);
        p61.Y(context, android.R.color.system_neutral2_10);
        long jM = M(98.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jM2 = M(96.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jY2 = p61.Y(context, android.R.color.system_neutral2_50);
        long jM3 = M(94.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jM4 = M(92.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jY3 = p61.Y(context, android.R.color.system_neutral2_100);
        long jM5 = M(87.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jY4 = p61.Y(context, android.R.color.system_neutral2_200);
        p61.Y(context, android.R.color.system_neutral2_300);
        long jY5 = p61.Y(context, android.R.color.system_neutral2_400);
        long jY6 = p61.Y(context, android.R.color.system_neutral2_500);
        p61.Y(context, android.R.color.system_neutral2_600);
        long jY7 = p61.Y(context, android.R.color.system_neutral2_700);
        long jM6 = M(24.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jM7 = M(22.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jY8 = p61.Y(context, android.R.color.system_neutral2_800);
        long jM8 = M(17.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jM9 = M(12.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jY9 = p61.Y(context, android.R.color.system_neutral2_900);
        long jM10 = M(6.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jM11 = M(4.0f, p61.Y(context, android.R.color.system_neutral2_600));
        long jY10 = p61.Y(context, android.R.color.system_neutral2_1000);
        long jY11 = p61.Y(context, android.R.color.system_accent1_0);
        p61.Y(context, android.R.color.system_accent1_10);
        p61.Y(context, android.R.color.system_accent1_50);
        long jY12 = p61.Y(context, android.R.color.system_accent1_100);
        long jY13 = p61.Y(context, android.R.color.system_accent1_200);
        p61.Y(context, android.R.color.system_accent1_300);
        p61.Y(context, android.R.color.system_accent1_400);
        p61.Y(context, android.R.color.system_accent1_500);
        long jY14 = p61.Y(context, android.R.color.system_accent1_600);
        long jY15 = p61.Y(context, android.R.color.system_accent1_700);
        long jY16 = p61.Y(context, android.R.color.system_accent1_800);
        long jY17 = p61.Y(context, android.R.color.system_accent1_900);
        p61.Y(context, android.R.color.system_accent1_1000);
        long jY18 = p61.Y(context, android.R.color.system_accent2_0);
        p61.Y(context, android.R.color.system_accent2_10);
        p61.Y(context, android.R.color.system_accent2_50);
        long jY19 = p61.Y(context, android.R.color.system_accent2_100);
        long jY20 = p61.Y(context, android.R.color.system_accent2_200);
        p61.Y(context, android.R.color.system_accent2_300);
        p61.Y(context, android.R.color.system_accent2_400);
        p61.Y(context, android.R.color.system_accent2_500);
        long jY21 = p61.Y(context, android.R.color.system_accent2_600);
        long jY22 = p61.Y(context, android.R.color.system_accent2_700);
        long jY23 = p61.Y(context, android.R.color.system_accent2_800);
        long jY24 = p61.Y(context, android.R.color.system_accent2_900);
        p61.Y(context, android.R.color.system_accent2_1000);
        long jY25 = p61.Y(context, android.R.color.system_accent3_0);
        p61.Y(context, android.R.color.system_accent3_10);
        p61.Y(context, android.R.color.system_accent3_50);
        long jY26 = p61.Y(context, android.R.color.system_accent3_100);
        long jY27 = p61.Y(context, android.R.color.system_accent3_200);
        p61.Y(context, android.R.color.system_accent3_300);
        p61.Y(context, android.R.color.system_accent3_400);
        p61.Y(context, android.R.color.system_accent3_500);
        long jY28 = p61.Y(context, android.R.color.system_accent3_600);
        long jY29 = p61.Y(context, android.R.color.system_accent3_700);
        long jY30 = p61.Y(context, android.R.color.system_accent3_800);
        long jY31 = p61.Y(context, android.R.color.system_accent3_900);
        p61.Y(context, android.R.color.system_accent3_1000);
        return new dh2(jY, jM, jM2, jY2, jM3, jM4, jY3, jM5, jY4, jY5, jY6, jY7, jM6, jM7, jY8, jM8, jM9, jY9, jM10, jM11, jY10, jY11, jY12, jY13, jY14, jY15, jY16, jY17, jY18, jY19, jY20, jY21, jY22, jY23, jY24, jY25, jY26, jY27, jY28, jY29, jY30, jY31);
    }

    public static final void t(vv1 vv1Var, String str) {
        vv1Var.getClass();
        xv1 xv1VarC = vv1Var.C(str);
        try {
            xv1VarC.y();
            ir2.h(xv1VarC, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ir2.h(xv1VarC, th);
                throw th2;
            }
        }
    }

    public static final int u(int i, List list) {
        int i2;
        byte b2;
        int i3 = ((sj1) vq.W(list)).c;
        if (i > ((sj1) vq.W(list)).c) {
            wp0.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            sj1 sj1Var = (sj1) list.get(i2);
            if (sj1Var.b > i) {
                b2 = 1;
            } else {
                b2 = sj1Var.c <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbM = k3.m(i2, "Found paragraph index ", " should be in range [0, ");
        sbM.append(list.size());
        sbM.append(").\nDebug info: index=");
        sbM.append(i);
        sbM.append(", paragraphs=[");
        sbM.append(c31.a(list, null, new o01(9), 31));
        sbM.append(']');
        wp0.a(sbM.toString());
        return i2;
    }

    public static final int v(int i, List list) {
        byte b2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            sj1 sj1Var = (sj1) list.get(i3);
            if (sj1Var.d > i) {
                b2 = 1;
            } else {
                b2 = sj1Var.e <= i ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int w(ArrayList arrayList, float f) {
        byte b2;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((sj1) vq.W(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            sj1 sj1Var = (sj1) arrayList.get(i2);
            if (sj1Var.f > f) {
                b2 = 1;
            } else {
                b2 = sj1Var.g <= f ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i = i2 + 1;
            } else {
                if (b2 <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void x(ArrayList arrayList, long j, ej0 ej0Var) {
        int size = arrayList.size();
        for (int iU = u(of2.f(j), arrayList); iU < size; iU++) {
            sj1 sj1Var = (sj1) arrayList.get(iU);
            if (sj1Var.b >= of2.e(j)) {
                return;
            }
            if (sj1Var.b != sj1Var.c) {
                ej0Var.h(sj1Var);
            }
        }
    }

    public static final uy y(uy uyVar, uy uyVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 0;
        boolean zBooleanValue = ((Boolean) uyVar.s(new vy(i), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) uyVar2.s(new vy(i), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return uyVar.k(uyVar2);
        }
        tt ttVar = new tt(28);
        ab0 ab0Var = ab0.e;
        uy uyVar3 = (uy) uyVar.s(ttVar, ab0Var);
        Object objS = uyVar2;
        if (zBooleanValue2) {
            objS = uyVar2.s(new tt(29), ab0Var);
        }
        return uyVar3.k((uy) objS);
    }

    public static final ArrayList z(os0 os0Var) {
        os0Var.getClass();
        ax0 ax0VarZ0 = ((x41) os0Var).z0();
        boolean zH = H(ax0VarZ0);
        n91 n91Var = (n91) ax0VarZ0.o();
        fa1 fa1Var = (fa1) n91Var.f;
        ArrayList arrayList = new ArrayList(fa1Var.g);
        int i = fa1Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ax0 ax0Var = (ax0) n91Var.get(i2);
            arrayList.add(zH ? ax0Var.l() : ax0Var.m());
        }
        return arrayList;
    }
}
