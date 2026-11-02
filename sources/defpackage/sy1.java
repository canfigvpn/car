package defpackage;

import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sy1 {
    public final /* synthetic */ uy1 a;

    public sy1(uy1 uy1Var) {
        this.a = uy1Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x020b  */
    /* JADX WARN: Code duplicated, block: B:107:0x021a  */
    /* JADX WARN: Code duplicated, block: B:109:0x021f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0227  */
    /* JADX WARN: Code duplicated, block: B:112:0x022b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0237  */
    /* JADX WARN: Code duplicated, block: B:117:0x023c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0244  */
    /* JADX WARN: Code duplicated, block: B:120:0x0248  */
    /* JADX WARN: Code duplicated, block: B:122:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x0251  */
    /* JADX WARN: Code duplicated, block: B:128:0x0259  */
    /* JADX WARN: Code duplicated, block: B:139:0x0294  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:148:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:164:0x0304  */
    /* JADX WARN: Code duplicated, block: B:165:0x0308  */
    /* JADX WARN: Code duplicated, block: B:171:0x0318  */
    /* JADX WARN: Code duplicated, block: B:178:0x0335  */
    /* JADX WARN: Code duplicated, block: B:180:0x0346  */
    /* JADX WARN: Code duplicated, block: B:181:0x034a  */
    /* JADX WARN: Code duplicated, block: B:187:0x035a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0362  */
    /* JADX WARN: Code duplicated, block: B:195:0x0366  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b A[PHI: r8
  0x014b: PHI (r8v9 float) = (r8v8 float), (r8v12 float) binds: [B:79:0x0179, B:68:0x0144] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0156  */
    /* JADX WARN: Code duplicated, block: B:83:0x0197  */
    public final long a(int i, long j) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fG;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jD;
        long jD2;
        boolean z;
        boolean zF;
        boolean z2;
        EdgeEffect edgeEffectB;
        float fIntBitsToFloat3;
        vk0 vk0Var;
        float f;
        EdgeEffect edgeEffectE;
        float fIntBitsToFloat4;
        vk0 vk0Var2;
        float f2;
        EdgeEffect edgeEffectD;
        float fIntBitsToFloat5;
        vk0 vk0Var3;
        float f3;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        uy1 uy1Var = this.a;
        uy1Var.j = i;
        v6 v6Var = uy1Var.b;
        if (v6Var == null || !(uy1Var.a.c() || uy1Var.a.a())) {
            return uy1Var.c(uy1Var.k, j, i);
        }
        int i5 = uy1Var.j;
        uy1 uy1Var2 = (uy1) uy1Var.m.f;
        g90 g90Var = v6Var.c;
        if (d52.c(v6Var.g)) {
            return new uf1(uy1Var2.c(uy1Var2.k, j, uy1Var2.j)).a;
        }
        if (!v6Var.f) {
            if (g90.g(g90Var.f)) {
                v6Var.f(0L);
            }
            if (g90.g(g90Var.g)) {
                v6Var.g(0L);
            }
            if (g90.g(g90Var.d)) {
                v6Var.h(0L);
            }
            if (g90.g(g90Var.e)) {
                v6Var.e(0L);
            }
            v6Var.f = true;
        }
        int i6 = u7.a;
        float f4 = i5 == 2 ? 4.0f : 1.0f;
        long jF = uf1.f(f4, j);
        int i7 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i7) != 0.0f) {
            if (!g90.g(g90Var.d) || Float.intBitsToFloat(i7) >= 0.0f) {
                j2 = 4294967295L;
                if (g90.g(g90Var.e) && Float.intBitsToFloat(i7) > 0.0f) {
                    float fE = v6Var.e(jF);
                    if (!g90.g(g90Var.e)) {
                        g90Var.b().finish();
                    }
                    fIntBitsToFloat = fE == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i7) : fE / f4;
                }
            } else {
                float fH = v6Var.h(jF);
                j2 = 4294967295L;
                if (!g90.g(g90Var.d)) {
                    g90Var.e().finish();
                }
                fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jF & 4294967295L)) ? Float.intBitsToFloat(i7) : fH / f4;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!g90.g(g90Var.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fG = v6Var.f(jF);
                if (!g90.g(g90Var.f)) {
                    g90Var.c().finish();
                }
                if (fG == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fG / f4;
                }
            } else if (g90.g(g90Var.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fG = v6Var.g(jF);
                if (!g90.g(g90Var.g)) {
                    g90Var.d().finish();
                }
                if (fG == Float.intBitsToFloat((int) (jF >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fG / f4;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!uf1.b(jFloatToRawIntBits, 0L)) {
                v6Var.d();
            }
            jD = uf1.d(j, jFloatToRawIntBits);
            long j3 = new uf1(uy1Var2.c(uy1Var2.k, jD, uy1Var2.j)).a;
            jD2 = uf1.d(jD, j3);
            if ((Float.intBitsToFloat((int) (jD >> 32)) == 0.0f || Float.intBitsToFloat((int) (jD & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j3 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j3 & j2)) != 0.0f) && (g90.g(g90Var.f) || g90.g(g90Var.d) || g90.g(g90Var.g) || g90.g(g90Var.e)))) {
                v6Var.a();
            }
            if (i5 == 1) {
                i3 = (int) (jD2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    v6Var.f(jD2);
                } else {
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        v6Var.g(jD2);
                    } else {
                        z3 = false;
                    }
                    i4 = (int) (jD2 & j2);
                    if (Float.intBitsToFloat(i4) > 0.5f) {
                        v6Var.h(jD2);
                    } else {
                        if (Float.intBitsToFloat(i4) < -0.5f) {
                            v6Var.e(jD2);
                        } else {
                            z4 = false;
                        }
                        if (!z3 || z4) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z4 = true;
                    if (z3) {
                    }
                    z = true;
                }
                z3 = true;
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    v6Var.h(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        v6Var.e(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!uf1.b(jD, 0L)) {
                if (g90.f(g90Var.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    EdgeEffect edgeEffectC = g90Var.c();
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    if (edgeEffectC instanceof vk0) {
                        vk0 vk0Var4 = (vk0) edgeEffectC;
                        float f5 = vk0Var4.b + fIntBitsToFloat6;
                        vk0Var4.b = f5;
                        if (Math.abs(f5) > vk0Var4.a) {
                            vk0Var4.onRelease();
                        }
                    } else {
                        edgeEffectC.onRelease();
                    }
                    zF = g90.f(g90Var.f);
                }
                if (g90.f(g90Var.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    edgeEffectD = g90Var.d();
                    fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                    if (edgeEffectD instanceof vk0) {
                        vk0Var3 = (vk0) edgeEffectD;
                        f3 = vk0Var3.b + fIntBitsToFloat5;
                        vk0Var3.b = f3;
                        if (Math.abs(f3) > vk0Var3.a) {
                            vk0Var3.onRelease();
                        }
                    } else {
                        edgeEffectD.onRelease();
                    }
                    if (!zF || g90.f(g90Var.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (g90.f(g90Var.d) && Float.intBitsToFloat(i7) < 0.0f) {
                    edgeEffectE = g90Var.e();
                    fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                    if (edgeEffectE instanceof vk0) {
                        vk0Var2 = (vk0) edgeEffectE;
                        f2 = vk0Var2.b + fIntBitsToFloat4;
                        vk0Var2.b = f2;
                        if (Math.abs(f2) > vk0Var2.a) {
                            vk0Var2.onRelease();
                        }
                    } else {
                        edgeEffectE.onRelease();
                    }
                    if (!zF || g90.f(g90Var.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (g90.f(g90Var.e) && Float.intBitsToFloat(i7) > 0.0f) {
                    edgeEffectB = g90Var.b();
                    fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                    if (edgeEffectB instanceof vk0) {
                        vk0Var = (vk0) edgeEffectB;
                        f = vk0Var.b + fIntBitsToFloat3;
                        vk0Var.b = f;
                        if (Math.abs(f) > vk0Var.a) {
                            vk0Var.onRelease();
                        }
                    } else {
                        edgeEffectB.onRelease();
                    }
                    if (!zF || g90.f(g90Var.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                v6Var.d();
            }
            return uf1.e(jFloatToRawIntBits, j3);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!g90.g(g90Var.f)) {
            if (g90.g(g90Var.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (g90.g(g90Var.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!uf1.b(jFloatToRawIntBits, 0L)) {
            v6Var.d();
        }
        jD = uf1.d(j, jFloatToRawIntBits);
        long j4 = new uf1(uy1Var2.c(uy1Var2.k, jD, uy1Var2.j)).a;
        jD2 = uf1.d(jD, j4);
        if (Float.intBitsToFloat((int) (jD >> 32)) == 0.0f) {
            v6Var.a();
        } else {
            v6Var.a();
        }
        if (i5 == 1) {
            i3 = (int) (jD2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                v6Var.f(jD2);
            } else {
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    v6Var.g(jD2);
                } else {
                    z3 = false;
                }
                i4 = (int) (jD2 & j2);
                if (Float.intBitsToFloat(i4) > 0.5f) {
                    v6Var.h(jD2);
                } else {
                    if (Float.intBitsToFloat(i4) < -0.5f) {
                        v6Var.e(jD2);
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                    }
                    z = true;
                }
                z4 = true;
                if (z3) {
                }
                z = true;
            }
            z3 = true;
            i4 = (int) (jD2 & j2);
            if (Float.intBitsToFloat(i4) > 0.5f) {
                v6Var.h(jD2);
            } else {
                if (Float.intBitsToFloat(i4) < -0.5f) {
                    v6Var.e(jD2);
                } else {
                    z4 = false;
                }
                if (z3) {
                }
                z = true;
            }
            z4 = true;
            if (z3) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!uf1.b(jD, 0L)) {
            if (g90.f(g90Var.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (g90.f(g90Var.g)) {
                edgeEffectD = g90Var.d();
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
                if (edgeEffectD instanceof vk0) {
                    vk0Var3 = (vk0) edgeEffectD;
                    f3 = vk0Var3.b + fIntBitsToFloat5;
                    vk0Var3.b = f3;
                    if (Math.abs(f3) > vk0Var3.a) {
                        vk0Var3.onRelease();
                    }
                } else {
                    edgeEffectD.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (g90.f(g90Var.d)) {
                edgeEffectE = g90Var.e();
                fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                if (edgeEffectE instanceof vk0) {
                    vk0Var2 = (vk0) edgeEffectE;
                    f2 = vk0Var2.b + fIntBitsToFloat4;
                    vk0Var2.b = f2;
                    if (Math.abs(f2) > vk0Var2.a) {
                        vk0Var2.onRelease();
                    }
                } else {
                    edgeEffectE.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (g90.f(g90Var.e)) {
                edgeEffectB = g90Var.b();
                fIntBitsToFloat3 = Float.intBitsToFloat(i7);
                if (edgeEffectB instanceof vk0) {
                    vk0Var = (vk0) edgeEffectB;
                    f = vk0Var.b + fIntBitsToFloat3;
                    vk0Var.b = f;
                    if (Math.abs(f) > vk0Var.a) {
                        vk0Var.onRelease();
                    }
                } else {
                    edgeEffectB.onRelease();
                }
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (zF) {
                z2 = true;
            } else {
                z2 = true;
            }
            z = z2;
        }
        if (z) {
            v6Var.d();
        }
        return uf1.e(jFloatToRawIntBits, j4);
    }
}
