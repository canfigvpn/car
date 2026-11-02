package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class b92 extends sv0 implements n20, jv {
    public final yt0 n0;
    public final gr2 o0;
    public final fc1 p0;
    public final iq1 q0;
    public int r0;
    public final ku0 s0;

    public b92(yt0 yt0Var, gr2 gr2Var, fc1 fc1Var, s12 s12Var) {
        s12Var.getClass();
        this.n0 = yt0Var;
        this.o0 = gr2Var;
        this.p0 = fc1Var;
        this.q0 = yt0Var.b;
        this.r0 = -1;
        this.s0 = yt0Var.a.c ? null : new ku0(s12Var);
    }

    @Override // defpackage.sv0, defpackage.n20
    public final jv A(s12 s12Var) {
        s12Var.getClass();
        yt0 yt0Var = this.n0;
        gr2 gr2VarT = j02.t(yt0Var, s12Var);
        fc1 fc1Var = this.p0;
        h7 h7Var = (h7) fc1Var.e;
        int i = h7Var.f + 1;
        h7Var.f = i;
        if (i == ((Object[]) h7Var.g).length) {
            h7Var.g();
        }
        ((Object[]) h7Var.g)[i] = s12Var;
        fc1Var.g(gr2VarT.e);
        if (fc1Var.s() == 4) {
            fc1.l(fc1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = gr2VarT.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new b92(yt0Var, gr2VarT, fc1Var, s12Var);
        }
        return (this.o0 == gr2VarT && yt0Var.a.c) ? this : new b92(yt0Var, gr2VarT, fc1Var, s12Var);
    }

    @Override // defpackage.sv0, defpackage.n20
    public final int B(s12 s12Var) {
        s12Var.getClass();
        fc1 fc1Var = this.p0;
        String strI = fc1Var.i();
        String strConcat = " at path ".concat(((h7) fc1Var.e).d());
        strI.getClass();
        int iQ = ir2.q(s12Var, this.n0, strI);
        if (iQ != -3) {
            return iQ;
        }
        throw new a22(s12Var.b() + " does not contain element with name '" + strI + '\'' + strConcat);
    }

    @Override // defpackage.sv0, defpackage.n20
    public final double C() {
        fc1 fc1Var = this.p0;
        String strJ = fc1Var.j();
        try {
            double d = Double.parseDouble(strJ);
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            ux.I(fc1Var, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            fc1.l(fc1Var, "Failed to parse type 'double' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.sv0, defpackage.n20
    public final long a() {
        return this.p0.h();
    }

    @Override // defpackage.sv0, defpackage.n20
    public final boolean c() {
        boolean z;
        boolean z2;
        fc1 fc1Var = this.p0;
        int iV = fc1Var.v();
        String str = fc1Var.d;
        if (iV == str.length()) {
            fc1.l(fc1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iV) == '\"') {
            iV++;
            z = true;
        } else {
            z = false;
        }
        int iU = fc1Var.u(iV);
        if (iU >= str.length() || iU == -1) {
            fc1.l(fc1Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = iU + 1;
        int iCharAt = str.charAt(iU) | ' ';
        if (iCharAt == 102) {
            fc1Var.c("alse", i);
            z2 = false;
        } else {
            if (iCharAt != 116) {
                fc1.l(fc1Var, "Expected valid boolean literal prefix, but had '" + fc1Var.j() + '\'', 0, null, 6);
                throw null;
            }
            fc1Var.c("rue", i);
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (fc1Var.b == str.length()) {
            fc1.l(fc1Var, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(fc1Var.b) == '\"') {
            fc1Var.b++;
            return z2;
        }
        fc1.l(fc1Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final boolean d() {
        boolean z;
        ku0 ku0Var = this.s0;
        if (!(ku0Var != null ? ku0Var.b : false)) {
            fc1 fc1Var = this.p0;
            int iU = fc1Var.u(fc1Var.v());
            String str = fc1Var.d;
            int length = str.length() - iU;
            if (length >= 4 && iU != -1) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        if (length <= 4 || dv1.k(str.charAt(iU + 4)) != 0) {
                            fc1Var.b = iU + 4;
                            z = true;
                            break;
                        }
                    } else if ("null".charAt(i) == str.charAt(iU + i)) {
                        i++;
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final char e() {
        fc1 fc1Var = this.p0;
        String strJ = fc1Var.j();
        if (strJ.length() == 1) {
            return strJ.charAt(0);
        }
        fc1.l(fc1Var, "Expected single char, but got '" + strJ + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x011f  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x011f, please report this as an issue */
    @Override // defpackage.sv0, defpackage.n20
    public final Object f(mv0 mv0Var) {
        String message;
        String strA;
        yt0 yt0Var = this.n0;
        fc1 fc1Var = this.p0;
        h7 h7Var = (h7) fc1Var.e;
        mv0Var.getClass();
        try {
            if (!(mv0Var instanceof fo1)) {
                return mv0Var.a(this);
            }
            String strR = fc1Var.r(rw.p(yt0Var, ((fo1) mv0Var).c()));
            if (strR != null) {
                try {
                    ex.o((fo1) mv0Var, this, strR);
                    throw null;
                } catch (a22 e) {
                    String message2 = e.getMessage();
                    message2.getClass();
                    int iG = h92.G(message2, '\n', 0, 6);
                    if (iG != -1) {
                        message2 = message2.substring(0, iG);
                    }
                    if (h92.E(message2, ".")) {
                        message2 = message2.substring(0, message2.length() - 1);
                    }
                    String message3 = e.getMessage();
                    message3.getClass();
                    String strSubstring = "";
                    int iG2 = h92.G(message3, '\n', 0, 6);
                    if (iG2 != -1) {
                        strSubstring = message3.substring(iG2 + 1, message3.length());
                    }
                    fc1.l(fc1Var, message2, 0, strSubstring, 2);
                    throw null;
                }
            }
            String strP = rw.p(yt0Var, ((fo1) mv0Var).c());
            iu0 iu0VarN0 = n0();
            String strB = ((fo1) mv0Var).c().b();
            if (!(iu0VarN0 instanceof wu0)) {
                throw ux.c(-1, "Expected " + js1.a(wu0.class).c() + ", but had " + js1.a(iu0VarN0.getClass()).c() + " as the serialized body of " + strB + " at element: " + h7Var.d(), iu0VarN0.toString());
            }
            wu0 wu0Var = (wu0) iu0VarN0;
            iu0 iu0Var = (iu0) wu0Var.get(strP);
            if (iu0Var != null) {
                av0 av0VarA = ju0.a(iu0Var);
                strA = av0VarA instanceof tu0 ? null : av0VarA.a();
            }
            try {
                ex.o((fo1) mv0Var, this, strA);
                throw null;
            } catch (a22 e2) {
                String message4 = e2.getMessage();
                message4.getClass();
                throw ux.c(-1, message4, wu0Var.toString());
            }
            message = e.getMessage();
            message.getClass();
            if (h92.C(message, "at path", false)) {
                throw e;
            }
            throw new q71(e.e, e.getMessage() + " at path: " + h7Var.d(), e);
        } catch (q71 e3) {
            message = e3.getMessage();
            message.getClass();
            if (h92.C(message, "at path", false)) {
                throw e3;
            }
            throw new q71(e3.e, e3.getMessage() + " at path: " + h7Var.d(), e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jv
    public final int h(s12 s12Var) {
        byte b;
        fc1 fc1Var = this.p0;
        h7 h7Var = (h7) fc1Var.e;
        String str = fc1Var.d;
        s12Var.getClass();
        gr2 gr2Var = this.o0;
        int iOrdinal = gr2Var.ordinal();
        char c = ':';
        int i = 0;
        zW = false;
        boolean zW = false;
        byte b2 = 1;
        int i2 = -1;
        if (iOrdinal == 0) {
            boolean zW2 = fc1Var.w();
            while (true) {
                boolean zB = fc1Var.b();
                ku0 ku0Var = this.s0;
                if (zB) {
                    String strD = fc1Var.d();
                    fc1Var.g(c);
                    yt0 yt0Var = this.n0;
                    int iQ = ir2.q(s12Var, yt0Var, strD);
                    byte b3 = b2;
                    if (iQ != -3) {
                        if (ku0Var != null) {
                            u90 u90Var = ku0Var.a;
                            if (iQ < 64) {
                                u90Var.c |= 1 << iQ;
                            } else {
                                int i3 = (iQ >>> 6) - 1;
                                long[] jArr = u90Var.d;
                                jArr[i3] = jArr[i3] | (1 << (iQ & 63));
                            }
                        }
                        i2 = iQ;
                        break;
                    }
                    if (!ir2.t(yt0Var, s12Var)) {
                        int i4 = h7Var.f;
                        int[] iArr = (int[]) h7Var.h;
                        if (iArr[i4] == -2) {
                            iArr[i4] = -1;
                            i4--;
                            h7Var.f = i4;
                        }
                        if (i4 != -1) {
                            h7Var.f = i4 - 1;
                        }
                        String string = str.subSequence(0, fc1Var.b).toString();
                        string.getClass();
                        int iLastIndexOf = string.lastIndexOf(strD, string.length() - 1);
                        throw new gu0("Encountered an unknown key '" + strD + "' at offset " + iLastIndexOf + " at path: " + h7Var.d() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) ux.B(str, iLastIndexOf)));
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bS = fc1Var.s();
                    if (bS == 8 || bS == 6) {
                        while (true) {
                            byte bS2 = fc1Var.s();
                            b = b3;
                            if (bS2 == b) {
                                fc1Var.d();
                            } else {
                                if (bS2 == 8 || bS2 == 6) {
                                    arrayList.add(Byte.valueOf(bS2));
                                } else if (bS2 == 9) {
                                    if (((Number) vq.W(arrayList)).byteValue() != 8) {
                                        throw ux.c(fc1Var.b, "found ] instead of } at path: " + h7Var, str);
                                    }
                                    ar.L(arrayList);
                                } else if (bS2 == 7) {
                                    if (((Number) vq.W(arrayList)).byteValue() != 6) {
                                        throw ux.c(fc1Var.b, "found } instead of ] at path: " + h7Var, str);
                                    }
                                    ar.L(arrayList);
                                } else if (bS2 == 10) {
                                    fc1.l(fc1Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                fc1Var.e();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            }
                            b3 = b;
                        }
                    } else {
                        fc1Var.j();
                        b = b3;
                    }
                    zW2 = fc1Var.w();
                    b2 = b;
                    c = ':';
                } else if (!zW2) {
                    if (ku0Var == null) {
                        break;
                    }
                    u90 u90Var2 = ku0Var.a;
                    fg0 fg0Var = u90Var2.b;
                    s12 s12Var2 = u90Var2.a;
                    int iD = s12Var2.d();
                    while (true) {
                        long j = u90Var2.c;
                        long j2 = -1;
                        if (j == -1) {
                            if (iD <= 64) {
                                break;
                            }
                            long[] jArr2 = u90Var2.d;
                            int length = jArr2.length;
                            loop3: while (i < length) {
                                int i5 = i + 1;
                                int i6 = i5 * 64;
                                long j3 = jArr2[i];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        int i7 = iNumberOfTrailingZeros + i6;
                                        if (((Boolean) fg0Var.g(s12Var2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i7;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i] = j3;
                                        i = i5;
                                        j2 = -1;
                                    }
                                }
                            }
                            break;
                        }
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                        u90Var2.c |= 1 << iNumberOfTrailingZeros2;
                        if (((Boolean) fg0Var.g(s12Var2, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                            i2 = iNumberOfTrailingZeros2;
                            break;
                        }
                    }
                } else {
                    ux.x(fc1Var, "object");
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zW3 = fc1Var.w();
            if (fc1Var.b()) {
                int i8 = this.r0;
                if (i8 != -1 && !zW3) {
                    fc1.l(fc1Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i8 + 1;
                this.r0 = i2;
            } else if (zW3) {
                ux.x(fc1Var, "array");
                throw null;
            }
        } else {
            int i9 = this.r0;
            byte b4 = i9 % 2 != 0;
            if (b4 != true) {
                fc1Var.g(':');
            } else if (i9 != -1) {
                zW = fc1Var.w();
            }
            if (fc1Var.b()) {
                if (b4 != false) {
                    int i10 = this.r0;
                    int i11 = fc1Var.b;
                    if (i10 == -1) {
                        if (zW) {
                            fc1.l(fc1Var, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else if (!zW) {
                        fc1.l(fc1Var, "Expected comma after the key-value pair", i11, null, 4);
                        throw null;
                    }
                }
                i2 = this.r0 + 1;
                this.r0 = i2;
            } else if (zW) {
                ux.x(fc1Var, "object");
                throw null;
            }
        }
        if (gr2Var != gr2.MAP) {
            ((int[]) h7Var.h)[h7Var.f] = i2;
        }
        return i2;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final int n() {
        fc1 fc1Var = this.p0;
        long jH = fc1Var.h();
        int i = (int) jH;
        if (jH == i) {
            return i;
        }
        fc1.l(fc1Var, "Failed to parse int for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    public final iu0 n0() {
        return new qs(this.n0.a, this.p0).g();
    }

    @Override // defpackage.sv0, defpackage.jv
    public final void p(s12 s12Var) {
        s12Var.getClass();
        if (s12Var.d() == 0 && ir2.t(this.n0, s12Var)) {
            while (h(s12Var) != -1) {
            }
        }
        fc1 fc1Var = this.p0;
        if (fc1Var.w()) {
            ux.x(fc1Var, "");
            throw null;
        }
        fc1Var.g(this.o0.f);
        h7 h7Var = (h7) fc1Var.e;
        int i = h7Var.f;
        int[] iArr = (int[]) h7Var.h;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            i--;
            h7Var.f = i;
        }
        if (i != -1) {
            h7Var.f = i - 1;
        }
    }

    @Override // defpackage.jv
    public final iq1 q() {
        return this.q0;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final byte s() {
        fc1 fc1Var = this.p0;
        long jH = fc1Var.h();
        byte b = (byte) jH;
        if (jH == b) {
            return b;
        }
        fc1.l(fc1Var, "Failed to parse byte for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final n20 t(s12 s12Var) {
        s12Var.getClass();
        return d92.a(s12Var) ? new fu0(this.p0, this.n0) : this;
    }

    @Override // defpackage.sv0, defpackage.jv
    public final Object u(s12 s12Var, int i, mv0 mv0Var, Object obj) {
        h7 h7Var = (h7) this.p0.e;
        s12Var.getClass();
        mv0Var.getClass();
        boolean z = this.o0 == gr2.MAP && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) h7Var.h;
            int i2 = h7Var.f;
            if (iArr[i2] == -2) {
                ((Object[]) h7Var.g)[i2] = q90.Q;
            }
        }
        mv0Var.getClass();
        Object objF = f(mv0Var);
        if (z) {
            int[] iArr2 = (int[]) h7Var.h;
            int i3 = h7Var.f;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                h7Var.f = i4;
                if (i4 == ((Object[]) h7Var.g).length) {
                    h7Var.g();
                }
            }
            Object[] objArr = (Object[]) h7Var.g;
            int i5 = h7Var.f;
            objArr[i5] = objF;
            ((int[]) h7Var.h)[i5] = -2;
        }
        return objF;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final short w() {
        fc1 fc1Var = this.p0;
        long jH = fc1Var.h();
        short s = (short) jH;
        if (jH == s) {
            return s;
        }
        fc1.l(fc1Var, "Failed to parse short for input '" + jH + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final String x() {
        return this.p0.i();
    }

    @Override // defpackage.sv0, defpackage.n20
    public final float y() {
        fc1 fc1Var = this.p0;
        String strJ = fc1Var.j();
        try {
            float f = Float.parseFloat(strJ);
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            ux.I(fc1Var, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            fc1.l(fc1Var, "Failed to parse type 'float' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}
