package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements mv0 {
    public static final ar0 a = new ar0();
    public static final yp1 b = new yp1("kotlin.time.Instant", xp1.j);

    /* JADX WARN: Code duplicated, block: B:195:0x0471  */
    /* JADX WARN: Code duplicated, block: B:196:0x0494  */
    /* JADX WARN: Instruction removed from duplicated block: B:195:0x0471, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x0494, please report this as an issue */
    @Override // defpackage.mv0
    public final Object a(n20 n20Var) {
        int i;
        zq0 zq0VarH;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        char cCharAt2;
        wq0 wq0Var = wq0.g;
        String strX = n20Var.x();
        strX.getClass();
        if (strX.length() == 0) {
            zq0VarH = new dq0(16, "An empty string is not a valid Instant", strX);
        } else {
            char cCharAt3 = strX.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strX.length() && '0' <= (cCharAt2 = strX.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strX.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                zq0VarH = ws0.I(strX, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && ws0.n(strX.charAt(i), 50) >= 0) {
                zq0VarH = ws0.I(strX, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                zq0VarH = ws0.I(strX, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                zq0VarH = ws0.I(strX, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strX.length() < i7) {
                    zq0VarH = ws0.I(strX, "The input string is too short");
                } else {
                    dq0 dq0VarH = ws0.H(strX, "'-'", i5, new n30(14));
                    if (dq0VarH == null && (dq0VarH = ws0.H(strX, "'-'", i5 + 3, new n30(15))) == null && (dq0VarH = ws0.H(strX, "'T' or 't'", i5 + 6, new n30(16))) == null && (dq0VarH = ws0.H(strX, "':'", i5 + 9, new n30(17))) == null) {
                        zq0VarH = ws0.H(strX, "':'", i5 + 12, new n30(18));
                        if (zq0VarH == null) {
                            int[] iArr = ws0.u;
                            for (int i8 = 0; i8 < 10; i8++) {
                                dq0 dq0VarH2 = ws0.H(strX, "an ASCII digit", iArr[i8] + i5, new n30(19));
                                if (dq0VarH2 != null) {
                                    zq0VarH = dq0VarH2;
                                }
                            }
                            int iJ = ws0.J(strX, i5 + 1);
                            int iJ2 = ws0.J(strX, i5 + 4);
                            int iJ3 = ws0.J(strX, i5 + 7);
                            int iJ4 = ws0.J(strX, i5 + 10);
                            int iJ5 = ws0.J(strX, i5 + 13);
                            int i9 = i5 + 15;
                            if (strX.charAt(i9) == '.') {
                                i9 = i7;
                                int iCharAt2 = 0;
                                while (i9 < strX.length() && '0' <= (cCharAt = strX.charAt(i9)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strX.charAt(i9) - '0');
                                    i9++;
                                }
                                int i10 = i9 - i7;
                                if (1 > i10 || i10 >= 10) {
                                    zq0VarH = ws0.I(strX, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                                } else {
                                    i2 = iCharAt2 * ws0.t[9 - i10];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i9 >= strX.length()) {
                                zq0VarH = ws0.I(strX, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strX.charAt(i9);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strX.length() - i9;
                                    if (length > 9) {
                                        zq0VarH = ws0.I(strX, "The UTC offset string \"" + ws0.W(strX.subSequence(i9, strX.length()).toString(), 16) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        zq0VarH = ws0.I(strX, "Invalid UTC offset string \"" + strX.subSequence(i9, strX.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = ws0.v;
                                        int i11 = 0;
                                        for (int i12 = 2; i11 < i12; i12 = 2) {
                                            int i13 = i9 + iArr2[i11];
                                            if (i13 >= strX.length()) {
                                                break;
                                            }
                                            if (strX.charAt(i13) != ':') {
                                                StringBuilder sbM = k3.m(i13, "Expected ':' at index ", ", got '");
                                                sbM.append(strX.charAt(i13));
                                                sbM.append('\'');
                                                zq0VarH = ws0.I(strX, sbM.toString());
                                            } else {
                                                i11++;
                                            }
                                        }
                                        int[] iArr3 = ws0.w;
                                        int i14 = 0;
                                        while (i14 < 6 && (i4 = iArr3[i14] + i9) < strX.length()) {
                                            char cCharAt5 = strX.charAt(i4);
                                            int[] iArr4 = iArr3;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbM2 = k3.m(i4, "Expected an ASCII digit at index ", ", got '");
                                                sbM2.append(strX.charAt(i4));
                                                sbM2.append('\'');
                                                zq0VarH = ws0.I(strX, sbM2.toString());
                                            } else {
                                                i14++;
                                                iArr3 = iArr4;
                                            }
                                        }
                                        int iJ6 = ws0.J(strX, i9 + 1);
                                        int iJ7 = length > 3 ? ws0.J(strX, i9 + 4) : 0;
                                        int iJ8 = length > 6 ? ws0.J(strX, i9 + 7) : 0;
                                        if (iJ7 > 59) {
                                            zq0VarH = ws0.I(strX, "Expected offset-minute-of-hour in 0..59, got " + iJ7);
                                        } else if (iJ8 > 59) {
                                            zq0VarH = ws0.I(strX, "Expected offset-second-of-minute in 0..59, got " + iJ8);
                                        } else if (iJ6 <= 17 || (iJ6 == 18 && iJ7 == 0 && iJ8 == 0)) {
                                            i3 = ((iJ7 * 60) + (iJ6 * 3600) + iJ8) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iJ || iJ >= 13) {
                                                zq0VarH = ws0.I(strX, "Expected a month number in 1..12, got " + iJ);
                                            } else if (1 > iJ2) {
                                                zq0VarH = ws0.I(strX, "Expected a valid day-of-month for month " + iJ + " of year " + iCharAt + ", got " + iJ2);
                                            } else {
                                                int i15 = iCharAt & 3;
                                                if (iJ2 > (iJ != 2 ? (iJ == 4 || iJ == 6 || iJ == 9 || iJ == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    zq0VarH = ws0.I(strX, "Expected a valid day-of-month for month " + iJ + " of year " + iCharAt + ", got " + iJ2);
                                                } else if (iJ3 > 23) {
                                                    zq0VarH = ws0.I(strX, "Expected hour in 0..23, got " + iJ3);
                                                } else if (iJ4 > 59) {
                                                    zq0VarH = ws0.I(strX, "Expected minute-of-hour in 0..59, got " + iJ4);
                                                } else if (iJ5 > 59) {
                                                    zq0VarH = ws0.I(strX, "Expected second-of-minute in 0..59, got " + iJ5);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iJ * 367) - 362) / 12)) + ((long) (iJ2 - 1));
                                                    if (iJ > 2) {
                                                        j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    zq0VarH = new yq0(i2, (((j3 - 719528) * 86400) + ((long) (((iJ4 * 60) + (iJ3 * 3600)) + iJ5))) - ((long) i3));
                                                }
                                            }
                                        } else {
                                            zq0VarH = ws0.I(strX, "Expected an offset in -18:00..+18:00, got " + strX.subSequence(i9, strX.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i16 = i9 + 1;
                                    if (strX.length() == i16) {
                                        i3 = 0;
                                        if (1 <= iJ) {
                                            zq0VarH = ws0.I(strX, "Expected a month number in 1..12, got " + iJ);
                                        } else {
                                            zq0VarH = ws0.I(strX, "Expected a month number in 1..12, got " + iJ);
                                        }
                                    } else {
                                        zq0VarH = ws0.I(strX, "Extra text after the instant at position " + i16);
                                    }
                                } else {
                                    zq0VarH = ws0.I(strX, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    } else {
                        zq0VarH = dq0VarH;
                    }
                }
            } else {
                zq0VarH = ws0.I(strX, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return zq0VarH.toInstant();
    }

    @Override // defpackage.mv0
    public final s12 c() {
        return b;
    }

    @Override // defpackage.mv0
    public final void d(p61 p61Var, Object obj) {
        wq0 wq0Var = (wq0) obj;
        wq0Var.getClass();
        p61Var.Q(wq0Var.toString());
    }
}
