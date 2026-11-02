package defpackage;

import android.graphics.Typeface;
import java.nio.ByteBuffer;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 implements jf, qm2 {
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public e4(Typeface typeface, k71 k71Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.h = typeface;
        this.e = k71Var;
        this.g = new l71(1024);
        int iA = k71Var.a(6);
        if (iA != 0) {
            int i5 = iA + k71Var.e;
            i = ((ByteBuffer) k71Var.h).getInt(((ByteBuffer) k71Var.h).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f = new char[i * 2];
        int iA2 = k71Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + k71Var.e;
            i2 = ((ByteBuffer) k71Var.h).getInt(((ByteBuffer) k71Var.h).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            zj2 zj2Var = new zj2(this, i7);
            j71 j71VarB = zj2Var.b();
            int iA3 = j71VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) j71VarB.h).getInt(iA3 + j71VarB.e) : 0, (char[]) this.f, i7 * 2);
            j71 j71VarB2 = zj2Var.b();
            int iA4 = j71VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + j71VarB2.e;
                i3 = ((ByteBuffer) j71VarB2.h).getInt(((ByteBuffer) j71VarB2.h).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            if (!(i3 > 0)) {
                qj.r("invalid metadata codepoint length");
                throw null;
            }
            l71 l71Var = (l71) this.g;
            j71 j71VarB3 = zj2Var.b();
            int iA5 = j71VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + j71VarB3.e;
                i4 = ((ByteBuffer) j71VarB3.h).getInt(((ByteBuffer) j71VarB3.h).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            l71Var.a(zj2Var, 0, i4 - 1);
        }
    }

    public static void c(e4 e4Var, jd1 jd1Var) {
        e4Var.getClass();
        jd1Var.getClass();
        if (((LinkedHashSet) e4Var.g).add(jd1Var)) {
            md1 md1Var = (md1) e4Var.f;
            if (jd1Var.c != null) {
                fu1.f(jd1Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            md1Var.e.addFirst(jd1Var);
            jd1Var.c = e4Var;
            md1Var.b();
        }
    }

    @Override // defpackage.nm2
    public long b(tb tbVar, tb tbVar2, tb tbVar3) {
        int iB = tbVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((qk1) this.e).u(i).d(tbVar.a(i), tbVar2.a(i), tbVar3.a(i)));
        }
        return jMax;
    }

    public void d(ld1 ld1Var) {
        if (((LinkedHashSet) this.h).add(ld1Var)) {
            ((md1) this.f).a(this, ld1Var, -1);
        }
    }

    public void e(bg1 bg1Var, int i) {
        if (i != 1 && i != 0) {
            qj.f(k3.i("Unsupported priority value: ", i));
        } else if (((LinkedHashSet) this.h).add(bg1Var)) {
            ((md1) this.f).a(this, bg1Var, i);
        }
    }

    public void f(String str, String str2) {
        this.h = ((String) this.h) + (((String) this.h).length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    public void g(ld1 ld1Var, hd1 hd1Var) {
        md1 md1Var = (md1) this.f;
        if (md1Var.g != 0) {
            return;
        }
        jd1 jd1VarC = md1Var.c(-1);
        md1Var.f = jd1VarC;
        md1Var.g = -1;
        md1Var.h = ld1Var;
        if (hd1Var != null) {
            if (jd1VarC != null) {
                jd1VarC.d(hd1Var);
            }
            md1Var.a.j(null, new od1(hd1Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00d1 A[PHI: r14
  0x00d1: PHI (r14v9 fa1) = (r14v8 fa1), (r14v8 fa1), (r14v11 fa1) binds: [B:42:0x009c, B:44:0x00a0, B:58:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object h(long j, long j2, tx txVar) {
        vd1 vd1Var;
        int i;
        zd1 zd1Var;
        long j3;
        zd1 zd1Var2;
        si2 si2Var;
        he1 he1Var;
        si2 si2Var2;
        he1 he1Var2;
        if (txVar instanceof vd1) {
            vd1Var = (vd1) txVar;
            int i2 = vd1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vd1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                vd1Var = new vd1(this, txVar);
            }
        } else {
            vd1Var = new vd1(this, txVar);
        }
        vd1 vd1Var2 = vd1Var;
        Object obj = vd1Var2.h;
        int i3 = vd1Var2.j;
        fa1 fa1Var = null;
        if (i3 == 0) {
            ix.Q(obj);
            zd1 zd1Var3 = (zd1) this.e;
            int i4 = 262144;
            if (zd1Var3 == null || !zd1Var3.r) {
                i = 262144;
                zd1Var = null;
            } else {
                if (!zd1Var3.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71 t71Var = zd1Var3.e.i;
                ax0 ax0VarV = qx.V(zd1Var3);
                loop0: while (true) {
                    if (ax0VarV == null) {
                        i = i4;
                        si2Var2 = null;
                        break;
                    }
                    if ((ax0VarV.I.f.h & i4) != 0) {
                        while (t71Var != null) {
                            if ((t71Var.g & i4) != 0) {
                                fa1 fa1Var2 = fa1Var;
                                t71 t71VarP = t71Var;
                                while (t71VarP != null) {
                                    if (t71VarP instanceof si2) {
                                        si2Var2 = (si2) t71VarP;
                                        i = i4;
                                        if (ws0.j(zd1Var3.p(), si2Var2.p()) && zd1.class == si2Var2.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        i = i4;
                                    }
                                    if ((t71VarP.g & i) == 0 || !(t71VarP instanceof c40)) {
                                        t71VarP = qx.P(fa1Var2);
                                    } else {
                                        int i5 = 0;
                                        for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                            if ((t71Var2.g & i) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    t71VarP = t71Var2;
                                                } else {
                                                    if (fa1Var2 == null) {
                                                        fa1Var2 = new fa1(new t71[16]);
                                                    }
                                                    if (t71VarP != null) {
                                                        fa1Var2.b(t71VarP);
                                                        t71VarP = null;
                                                    }
                                                    fa1Var2.b(t71Var2);
                                                }
                                            }
                                        }
                                        if (i5 != 1) {
                                            t71VarP = qx.P(fa1Var2);
                                        }
                                    }
                                    i4 = i;
                                }
                            }
                            t71Var = t71Var.i;
                            i4 = i4;
                            fa1Var = null;
                        }
                    }
                    int i6 = i4;
                    ax0VarV = ax0VarV.u();
                    t71Var = (ax0VarV == null || (he1Var2 = ax0VarV.I) == null) ? null : he1Var2.e;
                    i4 = i6;
                    fa1Var = null;
                }
                zd1Var = (zd1) si2Var2;
            }
            j3 = 0;
            fz fzVar = fz.e;
            if (zd1Var == null) {
                zd1 zd1Var4 = (zd1) this.f;
                if (zd1Var4 != null) {
                    vd1Var2.j = 1;
                    Object objG0 = zd1Var4.G0(j, j2, vd1Var2);
                    if (objG0 != fzVar) {
                        obj = objG0;
                        j3 = ((sm2) obj).a;
                    }
                    return fzVar;
                }
            } else {
                zd1 zd1Var5 = (zd1) this.e;
                if (zd1Var5 == null || !zd1Var5.r) {
                    zd1Var2 = null;
                } else {
                    if (!zd1Var5.e.r) {
                        vp0.b("visitAncestors called on an unattached node");
                    }
                    t71 t71Var3 = zd1Var5.e.i;
                    ax0 ax0VarV2 = qx.V(zd1Var5);
                    loop3: while (true) {
                        if (ax0VarV2 == null) {
                            si2Var = null;
                            break;
                        }
                        if ((ax0VarV2.I.f.h & i) != 0) {
                            while (t71Var3 != null) {
                                if ((t71Var3.g & i) != 0) {
                                    t71 t71VarP2 = t71Var3;
                                    fa1 fa1Var3 = null;
                                    while (t71VarP2 != null) {
                                        if (t71VarP2 instanceof si2) {
                                            si2 si2Var3 = (si2) t71VarP2;
                                            if (ws0.j(zd1Var5.p(), si2Var3.p()) && zd1.class == si2Var3.getClass()) {
                                                si2Var = si2Var3;
                                                break loop3;
                                            }
                                        }
                                        if ((t71VarP2.g & i) != 0 && (t71VarP2 instanceof c40)) {
                                            int i7 = 0;
                                            for (t71 t71Var4 = ((c40) t71VarP2).t; t71Var4 != null; t71Var4 = t71Var4.j) {
                                                if ((t71Var4.g & i) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        t71VarP2 = t71Var4;
                                                    } else {
                                                        if (fa1Var3 == null) {
                                                            fa1Var3 = new fa1(new t71[16]);
                                                        }
                                                        if (t71VarP2 != null) {
                                                            fa1Var3.b(t71VarP2);
                                                            t71VarP2 = null;
                                                        }
                                                        fa1Var3.b(t71Var4);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        t71VarP2 = qx.P(fa1Var3);
                                    }
                                }
                                t71Var3 = t71Var3.i;
                            }
                        }
                        ax0VarV2 = ax0VarV2.u();
                        t71Var3 = (ax0VarV2 == null || (he1Var = ax0VarV2.I) == null) ? null : he1Var.e;
                    }
                    zd1Var2 = (zd1) si2Var;
                }
                if (zd1Var2 != null) {
                    vd1Var2.j = 2;
                    Object objG1 = zd1Var2.G0(j, j2, vd1Var2);
                    if (objG1 != fzVar) {
                        obj = objG1;
                        j3 = ((sm2) obj).a;
                    }
                    return fzVar;
                }
            }
        } else if (i3 == 1) {
            ix.Q(obj);
            j3 = ((sm2) obj).a;
        } else {
            if (i3 != 2) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
            j3 = ((sm2) obj).a;
        }
        return new sm2(j3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(long j, tx txVar) {
        wd1 wd1Var;
        long j2;
        he1 he1Var;
        if (txVar instanceof wd1) {
            wd1Var = (wd1) txVar;
            int i = wd1Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                wd1Var.j = i - Integer.MIN_VALUE;
            } else {
                wd1Var = new wd1(this, txVar);
            }
        } else {
            wd1Var = new wd1(this, txVar);
        }
        Object objI0 = wd1Var.h;
        int i2 = wd1Var.j;
        zd1 zd1Var = null;
        si2 si2Var = null;
        zd1Var = null;
        if (i2 == 0) {
            ix.Q(objI0);
            zd1 zd1Var2 = (zd1) this.e;
            if (zd1Var2 != null && zd1Var2.r) {
                if (!zd1Var2.e.r) {
                    vp0.b("visitAncestors called on an unattached node");
                }
                t71 t71Var = zd1Var2.e.i;
                ax0 ax0VarV = qx.V(zd1Var2);
                loop0: while (ax0VarV != null) {
                    if ((ax0VarV.I.f.h & 262144) != 0) {
                        while (t71Var != null) {
                            if ((t71Var.g & 262144) != 0) {
                                t71 t71VarP = t71Var;
                                fa1 fa1Var = null;
                                while (t71VarP != null) {
                                    if (t71VarP instanceof si2) {
                                        si2 si2Var2 = (si2) t71VarP;
                                        if (ws0.j(zd1Var2.p(), si2Var2.p()) && zd1.class == si2Var2.getClass()) {
                                            si2Var = si2Var2;
                                            break loop0;
                                        }
                                    }
                                    if ((t71VarP.g & 262144) != 0 && (t71VarP instanceof c40)) {
                                        int i3 = 0;
                                        for (t71 t71Var2 = ((c40) t71VarP).t; t71Var2 != null; t71Var2 = t71Var2.j) {
                                            if ((t71Var2.g & 262144) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        if (i3 == 1) {
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
                zd1Var = (zd1) si2Var;
            }
            if (zd1Var != null) {
                wd1Var.j = 1;
                objI0 = zd1Var.I0(j, wd1Var);
                fz fzVar = fz.e;
                if (objI0 == fzVar) {
                    return fzVar;
                }
            } else {
                j2 = 0;
            }
            return new sm2(j2);
        }
        if (i2 != 1) {
            fu1.h("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ix.Q(objI0);
        j2 = ((sm2) objI0).a;
        return new sm2(j2);
    }

    public un2 j(aq aqVar, String str) {
        un2 un2Var;
        un2 un2VarA;
        synchronized (((iq1) this.h)) {
            try {
                un2Var = (un2) ((bo2) this.e).a.get(str);
                if (aqVar.d(un2Var)) {
                    yn2 yn2Var = (yn2) this.f;
                    if (yn2Var instanceof uw1) {
                        uw1 uw1Var = (uw1) yn2Var;
                        un2Var.getClass();
                        b21 b21Var = uw1Var.d;
                        if (b21Var != null) {
                            ru1 ru1Var = uw1Var.e;
                            ru1Var.getClass();
                            ei1.e(un2Var, ru1Var, b21Var);
                        }
                    }
                    un2Var.getClass();
                } else {
                    a91 a91Var = new a91((lz) this.g);
                    a91Var.a.put(ao2.g, str);
                    yn2 yn2Var2 = (yn2) this.f;
                    yn2Var2.getClass();
                    try {
                        try {
                            un2VarA = yn2Var2.c(aqVar, a91Var);
                        } catch (AbstractMethodError unused) {
                            un2VarA = yn2Var2.b(vv.q(aqVar), a91Var);
                        }
                    } catch (AbstractMethodError unused2) {
                        un2VarA = yn2Var2.a(vv.q(aqVar));
                    }
                    un2Var = un2VarA;
                    bo2 bo2Var = (bo2) this.e;
                    bo2Var.getClass();
                    un2Var.getClass();
                    un2 un2Var2 = (un2) bo2Var.a.put(str, un2Var);
                    if (un2Var2 != null) {
                        un2Var2.b();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return un2Var;
    }

    @Override // defpackage.nm2
    public tb l(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        tb tbVarC = (tb) this.g;
        if (tbVarC == null) {
            tbVarC = tbVar3.c();
            this.g = tbVarC;
        }
        int iB = tbVarC.b();
        int i = 0;
        while (true) {
            tb tbVar4 = (tb) this.g;
            if (i >= iB) {
                if (tbVar4 != null) {
                    return tbVar4;
                }
                ws0.U("velocityVector");
                throw null;
            }
            if (tbVar4 == null) {
                ws0.U("velocityVector");
                throw null;
            }
            long j2 = j;
            tbVar4.e(i, ((qk1) this.e).u(i).c(j2, tbVar.a(i), tbVar2.a(i), tbVar3.a(i)));
            i++;
            j = j2;
        }
    }

    @Override // defpackage.nm2
    public tb p(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        tb tbVarC = (tb) this.f;
        if (tbVarC == null) {
            tbVarC = tbVar.c();
            this.f = tbVarC;
        }
        int iB = tbVarC.b();
        int i = 0;
        while (true) {
            tb tbVar4 = (tb) this.f;
            if (i >= iB) {
                if (tbVar4 != null) {
                    return tbVar4;
                }
                ws0.U("valueVector");
                throw null;
            }
            if (tbVar4 == null) {
                ws0.U("valueVector");
                throw null;
            }
            long j2 = j;
            tbVar4.e(i, ((qk1) this.e).u(i).b(j2, tbVar.a(i), tbVar2.a(i), tbVar3.a(i)));
            i++;
            j = j2;
        }
    }

    @Override // defpackage.nm2
    public tb q(tb tbVar, tb tbVar2, tb tbVar3) {
        tb tbVarC = (tb) this.h;
        if (tbVarC == null) {
            tbVarC = tbVar3.c();
            this.h = tbVarC;
        }
        int iB = tbVarC.b();
        int i = 0;
        while (true) {
            tb tbVar4 = (tb) this.h;
            if (i >= iB) {
                if (tbVar4 != null) {
                    return tbVar4;
                }
                ws0.U("endVelocityVector");
                throw null;
            }
            if (tbVar4 == null) {
                ws0.U("endVelocityVector");
                throw null;
            }
            tbVar4.e(i, ((qk1) this.e).u(i).e(tbVar.a(i), tbVar2.a(i), tbVar3.a(i)));
            i++;
        }
    }

    public e4(mv0 mv0Var) {
        this.g = "";
        this.h = "";
        this.e = mv0Var;
        this.f = mv0Var.c().b();
    }

    public e4(bo2 bo2Var, yn2 yn2Var, lz lzVar) {
        bo2Var.getClass();
        yn2Var.getClass();
        lzVar.getClass();
        this.e = bo2Var;
        this.f = yn2Var;
        this.g = lzVar;
        this.h = new iq1(17);
    }

    public e4(qk1 qk1Var) {
        this.e = qk1Var;
    }

    public e4(vd0 vd0Var) {
        this(new qk1(22, vd0Var));
    }
}
