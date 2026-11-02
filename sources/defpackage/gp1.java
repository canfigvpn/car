package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gp1 implements ti0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ gp1(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0211 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0213 A[LOOP:0: B:72:0x01de->B:82:0x0213, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0216 A[SYNTHETIC] */
    @Override // defpackage.ti0
    public final Object a() throws PendingIntent.CanceledException {
        qv qvVar;
        long j;
        if2 if2VarD;
        f11 f11Var;
        yb ybVar;
        int i = this.e;
        sx sxVar = null;
        ll2 ll2Var = ll2.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((nu) obj2).d = (ij0) obj;
                return ll2Var;
            case 1:
                x91 x91Var = (x91) obj2;
                qv qvVar2 = (qv) obj;
                Object[] objArr = x91Var.b;
                long[] jArr = x91Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    qvVar2.z(objArr[(i2 << 3) + i4]);
                                }
                                j2 >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                return ll2Var;
            case 2:
                ((o32) obj2).b.d((dg2) obj);
                return ll2Var;
            case 3:
                ((ph) obj).b.e.getClass();
                int iA = jb2.a();
                pu0 pu0Var = ik0.a;
                wp wpVarV = p61.V(iA);
                ((s51) obj2).t0(String.format(Locale.ROOT, "mygarage-backup-%04d-%02d-%02d.json", Arrays.copyOf(new Object[]{Integer.valueOf(wpVarV.a), Integer.valueOf(wpVarV.b), Integer.valueOf(wpVarV.c)}, 3)));
                return ll2Var;
            case 4:
                ((da1) obj).setValue(Boolean.FALSE);
                ((s51) obj2).t0(l32.b);
                return ll2Var;
            case 5:
                u52 u52Var = (u52) obj2;
                bd0 bd0Var = (bd0) obj;
                if (!ws0.j(u52Var, bd0Var.a)) {
                    ar.J(bd0Var.b, new tr1(9, u52Var));
                    lr1 lr1Var = bd0Var.c;
                    if (lr1Var != null && (qvVar = lr1Var.a) != null) {
                        qvVar.s(lr1Var, null);
                    }
                }
                return ll2Var;
            case 6:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                    }
                    break;
                } else {
                    activity.send();
                }
                return ll2Var;
            case 7:
                nj2.y((ez) obj2, null, new ln(15, sxVar, (ej0) obj), 1);
                return ll2Var;
            default:
                me2 me2Var = (me2) obj2;
                long j3 = ((qr0) ((da1) obj).getValue()).a;
                uf1 uf1VarG = me2Var.g();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (uf1VarG != null) {
                    long j4 = uf1VarG.a;
                    yb ybVarK = me2Var.k();
                    if (ybVarK != null && ybVarK.f.length() != 0) {
                        ql0 ql0Var = (ql0) me2Var.q.getValue();
                        int i5 = ql0Var == null ? -1 : oe2.a[ql0Var.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1 || i5 == 2) {
                                long j5 = me2Var.l().b;
                                int i6 = of2.c;
                                j = j5 >> 32;
                            } else {
                                if (i5 != 3) {
                                    qj.p();
                                    return null;
                                }
                                long j6 = me2Var.l().b;
                                int i7 = of2.c;
                                j = j6 & 4294967295L;
                            }
                            int i8 = (int) j;
                            f11 f11Var2 = me2Var.d;
                            if (f11Var2 != null && (if2VarD = f11Var2.d()) != null && (f11Var = me2Var.d) != null && (ybVar = f11Var.a.a) != null) {
                                int iH = ex.h(me2Var.b.r(i8), 0, ybVar.f.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (if2VarD.d(j4) >> 32));
                                hf2 hf2Var = if2VarD.a;
                                t81 t81Var = hf2Var.b;
                                int iD = t81Var.d(iH);
                                float fD = hf2Var.d(iD);
                                float fE = hf2Var.e(iD);
                                float fG = ex.g(fIntBitsToFloat, Math.min(fD, fE), Math.max(fD, fE));
                                if (qr0.a(j3, 0L) || Math.abs(fIntBitsToFloat - fG) <= ((int) (j3 >> 32)) / 2) {
                                    float f = t81Var.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(((t81Var.b(iD) - f) / 2.0f) + f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new uf1(jFloatToRawIntBits);
        }
    }
}
