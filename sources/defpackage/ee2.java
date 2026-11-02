package defpackage;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ee2 extends wa2 implements ij0 {
    public final /* synthetic */ int i;
    public int j;
    public final /* synthetic */ me2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee2(me2 me2Var, sx sxVar, int i) {
        super(2, sxVar);
        this.i = i;
        this.k = me2Var;
    }

    @Override // defpackage.ij0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        ll2 ll2Var = ll2.a;
        switch (i) {
            case 0:
                long j = ((uf1) obj).a;
                return new ee2(this.k, (sx) obj2, 0).r(ll2Var);
            case 1:
                return ((ee2) p((sx) obj2, (ez) obj)).r(ll2Var);
            default:
                return ((ee2) p((sx) obj2, (ez) obj)).r(ll2Var);
        }
    }

    @Override // defpackage.sh
    public final sx p(sx sxVar, Object obj) {
        int i = this.i;
        me2 me2Var = this.k;
        switch (i) {
            case 0:
                return new ee2(me2Var, sxVar, 0);
            case 1:
                return new ee2(me2Var, sxVar, 1);
            default:
                return new ee2(me2Var, sxVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    @Override // defpackage.sh
    public final Object r(Object obj) {
        Object objK;
        int i;
        yb ybVarM;
        mq mqVar;
        Object lqVar;
        Object ybVar;
        CharSequence text;
        int i2;
        Parcel parcel;
        int i3;
        yb ybVar2;
        int i4 = this.i;
        sl0 sl0Var = sl0.e;
        fz fzVar = fz.e;
        me2 me2Var = this.k;
        ll2 ll2Var = ll2.a;
        switch (i4) {
            case 0:
                int i5 = this.j;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ix.Q(obj);
                    } else {
                        if (i5 != 2) {
                            fu1.h("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ix.Q(obj);
                    }
                    return ll2Var;
                }
                ix.Q(obj);
                this.j = 1;
                if (me2Var.t(this) == fzVar) {
                    return fzVar;
                }
                qj1 qj1VarF = me2Var.f();
                if (qj1VarF != null) {
                    String str = (String) qj1VarF.e;
                    long j = ((of2) qj1VarF.f).a;
                    bn1 bn1Var = me2Var.i;
                    if (bn1Var != null) {
                        this.j = 2;
                        en1 en1Var = (en1) bn1Var;
                        if (str.length() == 0 || of2.c(j)) {
                            objK = ll2Var;
                        } else {
                            objK = nj2.K(en1Var.a, new n7(8, null, en1Var, new h(j, null, en1Var, str)), this);
                        }
                        if (objK != fzVar) {
                            objK = ll2Var;
                        }
                        if (objK == fzVar) {
                            return fzVar;
                        }
                    }
                }
                return ll2Var;
            case 1:
                int i6 = this.j;
                if (i6 == 0) {
                    ix.Q(obj);
                    if (of2.c(me2Var.l().b) || !me2Var.h()) {
                        i = 1;
                        ybVarM = null;
                    } else {
                        ybVarM = y12.m(me2Var.l());
                        yb ybVarO = y12.o(me2Var.l(), me2Var.l().a.f.length());
                        yb ybVarN = y12.n(me2Var.l(), me2Var.l().a.f.length());
                        wb wbVar = new wb(ybVarO);
                        wbVar.a(ybVarN);
                        yb ybVarB = wbVar.b();
                        int iF = of2.f(me2Var.l().b);
                        me2Var.c.h(me2.b(ybVarB, j02.c(iF, iF)));
                        me2Var.r(sl0Var);
                        i = 1;
                        me2Var.a.e = true;
                    }
                    if (ybVarM != null && (mqVar = me2Var.g) != null) {
                        lq lqVarG = ir2.G(ybVarM);
                        this.j = i;
                        ((l4) mqVar).a(lqVarG);
                        if (ll2Var == fzVar) {
                            return fzVar;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                }
                return ll2Var;
            default:
                int i7 = this.j;
                if (i7 == 0) {
                    ix.Q(obj);
                    mq mqVar2 = me2Var.g;
                    if (mqVar2 != null) {
                        this.j = 1;
                        ClipData primaryClip = ((l4) mqVar2).a.a().getPrimaryClip();
                        lqVar = primaryClip != null ? new lq(primaryClip) : null;
                        if (lqVar == fzVar) {
                            return fzVar;
                        }
                    }
                    return ll2Var;
                }
                if (i7 == 1) {
                    ix.Q(obj);
                    lqVar = obj;
                } else {
                    if (i7 != 2) {
                        fu1.h("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ix.Q(obj);
                    ybVar = obj;
                }
                ybVar2 = (yb) ybVar;
                if (ybVar2 != null && me2Var.h()) {
                    wb wbVar2 = new wb(y12.o(me2Var.l(), me2Var.l().a.f.length()));
                    wbVar2.a(ybVar2);
                    yb ybVarB2 = wbVar2.b();
                    yb ybVarN2 = y12.n(me2Var.l(), me2Var.l().a.f.length());
                    wb wbVar3 = new wb(ybVarB2);
                    wbVar3.a(ybVarN2);
                    yb ybVarB3 = wbVar3.b();
                    int length = ybVar2.f.length() + of2.f(me2Var.l().b);
                    me2Var.c.h(me2.b(ybVarB3, j02.c(length, length)));
                    me2Var.r(sl0Var);
                    me2Var.a.e = true;
                }
                return ll2Var;
                lq lqVar2 = (lq) lqVar;
                if (lqVar2 != null) {
                    this.j = 2;
                    int i8 = 0;
                    ClipData.Item itemAt = lqVar2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        ybVar = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i9 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i9];
                                if (ws0.j(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    m20 m20Var = new m20();
                                    Parcel parcelObtain = Parcel.obtain();
                                    m20Var.a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, i8);
                                    parcelObtain.unmarshall(bArrDecode, i8, bArrDecode.length);
                                    parcelObtain.setDataPosition(i8);
                                    Parcel parcel2 = m20Var.a;
                                    long jA = dr.g;
                                    long jA2 = jA;
                                    long jB = yf2.c;
                                    long jB2 = jB;
                                    lh0 lh0Var = null;
                                    hh0 hh0Var = null;
                                    ih0 ih0Var = null;
                                    String string = null;
                                    th thVar = null;
                                    we2 we2Var = null;
                                    ed2 ed2Var = null;
                                    q32 q32Var = null;
                                    while (true) {
                                        if (parcel2.dataAvail() > 1) {
                                            byte b = parcel2.readByte();
                                            if (b != 1) {
                                                i2 = i8;
                                                if (b == 2) {
                                                    if (parcel2.dataAvail() >= 5) {
                                                        jB = m20Var.b();
                                                        i8 = i2;
                                                    }
                                                } else if (b == 3) {
                                                    if (parcel2.dataAvail() >= 4) {
                                                        lh0Var = new lh0(parcel2.readInt());
                                                        i8 = i2;
                                                    }
                                                } else if (b == 4) {
                                                    if (parcel2.dataAvail() >= 1) {
                                                        byte b2 = parcel2.readByte();
                                                        hh0 hh0Var2 = new hh0((b2 != 0 && b2 == 1) ? 1 : i2);
                                                        i8 = i2;
                                                        hh0Var = hh0Var2;
                                                    }
                                                } else if (b != 5) {
                                                    if (b == 6) {
                                                        string = parcel2.readString();
                                                    } else if (b == 7) {
                                                        if (parcel2.dataAvail() >= 5) {
                                                            jB2 = m20Var.b();
                                                        }
                                                    } else if (b == 8) {
                                                        if (parcel2.dataAvail() >= 4) {
                                                            i8 = i2;
                                                            thVar = new th(parcel2.readFloat());
                                                        }
                                                    } else if (b == 9) {
                                                        if (parcel2.dataAvail() >= 8) {
                                                            we2Var = new we2(parcel2.readFloat(), parcel2.readFloat());
                                                        }
                                                    } else if (b == 10) {
                                                        if (parcel2.dataAvail() >= 8) {
                                                            jA2 = m20Var.a();
                                                        }
                                                    } else if (b != 11) {
                                                        parcel = parcel2;
                                                        if (b != 12) {
                                                            i8 = i2;
                                                            parcel2 = parcel;
                                                        } else if (parcel.dataAvail() >= 20) {
                                                            i8 = i2;
                                                            parcel2 = parcel;
                                                            q32Var = new q32(m20Var.a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                        }
                                                    } else if (parcel2.dataAvail() >= 4) {
                                                        int i10 = parcel2.readInt();
                                                        int i11 = (i10 & 2) != 0 ? 1 : i2;
                                                        int i12 = (i10 & 1) != 0 ? 1 : i2;
                                                        ed2 ed2Var2 = ed2.d;
                                                        parcel = parcel2;
                                                        ed2 ed2Var3 = ed2.c;
                                                        if (i11 != 0 && i12 != 0) {
                                                            List listV = vs0.v(ed2Var2, ed2Var3);
                                                            Integer numValueOf = Integer.valueOf(i2);
                                                            int size = listV.size();
                                                            int i13 = i2;
                                                            while (i13 < size) {
                                                                numValueOf = Integer.valueOf(((ed2) listV.get(i13)).a | numValueOf.intValue());
                                                                i13++;
                                                                listV = listV;
                                                            }
                                                            ed2Var = new ed2(numValueOf.intValue());
                                                        } else if (i11 != 0) {
                                                            ed2Var = ed2Var2;
                                                        } else {
                                                            if (i12 == 0) {
                                                                ed2Var3 = ed2.b;
                                                            }
                                                            ed2Var = ed2Var3;
                                                        }
                                                        i8 = i2;
                                                        parcel2 = parcel;
                                                    }
                                                    i8 = i2;
                                                } else if (parcel2.dataAvail() >= 1) {
                                                    byte b3 = parcel2.readByte();
                                                    if (b3 == 0) {
                                                        i3 = i2;
                                                    } else if (b3 == 1) {
                                                        i3 = 65535;
                                                    } else if (b3 == 3) {
                                                        i3 = 2;
                                                    } else if (b3 == 2) {
                                                        i3 = 1;
                                                    } else {
                                                        i3 = i2;
                                                    }
                                                    ih0 ih0Var2 = new ih0(i3);
                                                    i8 = i2;
                                                    ih0Var = ih0Var2;
                                                }
                                            } else if (parcel2.dataAvail() >= 8) {
                                                jA = m20Var.a();
                                            }
                                        }
                                        i2 = i8;
                                    }
                                    arrayList.add(new xb(spanStart, spanEnd, new r72(jA, jB, lh0Var, hh0Var, ih0Var, (kg0) null, string, jB2, thVar, we2Var, (q31) null, jA2, ed2Var, q32Var, 49152)));
                                } else {
                                    i2 = i8;
                                }
                                if (i9 != length2) {
                                    i9++;
                                    text = text;
                                    i8 = i2;
                                }
                            }
                        } else {
                            text = text;
                        }
                        String string2 = text.toString();
                        yb ybVar3 = zb.a;
                        ybVar = new yb(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        ybVar = new yb(text.toString());
                    }
                    if (ybVar == fzVar) {
                        return fzVar;
                    }
                    ybVar2 = (yb) ybVar;
                    if (ybVar2 != null) {
                        wb wbVar4 = new wb(y12.o(me2Var.l(), me2Var.l().a.f.length()));
                        wbVar4.a(ybVar2);
                        yb ybVarB4 = wbVar4.b();
                        yb ybVarN3 = y12.n(me2Var.l(), me2Var.l().a.f.length());
                        wb wbVar5 = new wb(ybVarB4);
                        wbVar5.a(ybVarN3);
                        yb ybVarB5 = wbVar5.b();
                        int length3 = ybVar2.f.length() + of2.f(me2Var.l().b);
                        me2Var.c.h(me2.b(ybVarB5, j02.c(length3, length3)));
                        me2Var.r(sl0Var);
                        me2Var.a.e = true;
                    }
                }
                return ll2Var;
        }
    }
}
