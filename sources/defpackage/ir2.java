package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.inputmethodservice.InputMethodService;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ir2 {
    public static final float A;
    public static final double[][] B;
    public static final double[][] C;
    public static final double[] D;
    public static final double[] E;
    public static final w40 F;
    public static final kr G;
    public static final kr H;
    public static final kr I;
    public static final y32 J;
    public static final kr K;
    public static final kr L;
    public static final kr M;
    public static final float N;
    public static final hk2 O;
    public static final StackTraceElement[] P;
    public static final byte[] Q;
    public static final byte[] R;
    public static final kg2 S;
    public static final kr T;
    public static final float U;
    public static final mj2 V;
    public static final mj2 W;
    public static final mj2 X;
    public static final mj2 Y;
    public static final mj2 Z;
    public static final kr a = kr.t;
    public static final mj2 a0;
    public static final kr b;
    public static final mj2 b0;
    public static final kr c;
    public static final mj2 c0;
    public static final kr d;
    public static final mj2 d0;
    public static final kr e;
    public static Method e0;
    public static final kr f;
    public static Method f0;
    public static final gt g;
    public static boolean g0;
    public static final gt h;
    public static final gt i;
    public static final gt j;
    public static final gt k;
    public static final gt l;
    public static final gt m;
    public static final gt n;
    public static final gt o;
    public static final gt p;
    public static final gt q;
    public static final gt r;
    public static final gt s;
    public static final gt t;
    public static final fz u;
    public static final kr v;
    public static final y32 w;
    public static final kr x;
    public static final float y;
    public static final float z;

    static {
        kr krVar = kr.l;
        b = krVar;
        kr krVar2 = kr.u;
        c = krVar2;
        kr krVar3 = kr.m;
        d = krVar3;
        e = krVar;
        f = krVar3;
        int i2 = 7;
        int i3 = 0;
        g = new gt(new ut(i2), false, 406634314);
        h = new gt(new ut(11), false, -2131324243);
        i = new gt(new ut(12), false, 1992763521);
        j = new gt(new ut(13), false, 1520766112);
        k = new gt(new ut(14), false, 796031845);
        l = new gt(new ut(15), false, -1597060260);
        m = new gt(new ut(16), false, 1699692728);
        n = new gt(new ut(17), false, 1188680569);
        o = new gt(new ut(8), false, 677668410);
        p = new gt(new ut(9), false, -30995193);
        int i4 = 10;
        q = new gt(new qt(i4), false, -2056481311);
        r = new gt(new ut(i4), false, 1067155230);
        int i5 = 22;
        s = new gt(new tt(i5), false, 872478498);
        t = new gt(new ut(i3), false, -1957812409);
        u = fz.e;
        v = kr.w;
        w = y32.i;
        x = kr.x;
        y = 0.38f;
        z = 6.0f;
        A = 1.0f;
        B = new double[][]{new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
        C = new double[][]{new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
        D = new double[]{0.2126d, 0.7152d, 0.0722d};
        E = new double[]{0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
        F = new w40(i3);
        G = krVar2;
        H = kr.k;
        I = kr.s;
        J = y32.g;
        K = kr.r;
        L = krVar3;
        M = krVar3;
        N = 80.0f;
        O = hk2.k;
        P = new StackTraceElement[0];
        Q = new byte[]{112, 114, 111, 0};
        R = new byte[]{112, 114, 109, 0};
        S = new kg2(0, new long[0], new Object[0]);
        T = krVar3;
        U = 0.38f;
        V = new mj2(new v22(20), new gm2(i2));
        W = new mj2(new v22(21), new v22(i5));
        X = new mj2(new v22(23), new v22(24));
        Y = new mj2(new v22(25), new v22(26));
        Z = new mj2(new v22(27), new v22(28));
        a0 = new mj2(new v22(29), new gm2(i3));
        b0 = new mj2(new gm2(1), new gm2(2));
        c0 = new mj2(new gm2(3), new gm2(4));
        d0 = new mj2(new gm2(5), new gm2(6));
    }

    public static y40[] A(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, y40[] y40VarArr) {
        y40 y40Var;
        if (byteArrayInputStream.available() == 0) {
            return new y40[0];
        }
        if (i2 != y40VarArr.length) {
            fu1.h("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ix.L(byteArrayInputStream, 2);
            String str = new String(ix.J(byteArrayInputStream, (int) ix.L(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jL = ix.L(byteArrayInputStream, 4);
            int iL = (int) ix.L(byteArrayInputStream, 2);
            if (y40VarArr.length <= 0) {
                y40Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i4 = 0;
            while (true) {
                if (i4 >= y40VarArr.length) {
                    y40Var = null;
                    break;
                }
                if (y40VarArr[i4].b.equals(strSubstring)) {
                    y40Var = y40VarArr[i4];
                    break;
                }
                i4++;
            }
            if (y40Var == null) {
                fu1.h("Missing profile key: ".concat(str));
                return null;
            }
            y40Var.d = jL;
            int[] iArrX = x(byteArrayInputStream, iL);
            if (Arrays.equals(bArr, s5.Q)) {
                y40Var.e = iL;
                y40Var.h = iArrX;
            }
        }
        return y40VarArr;
    }

    public static y40[] B(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, s5.N)) {
            fu1.h("Unsupported version");
            return null;
        }
        int iL = (int) ix.L(fileInputStream, 1);
        byte[] bArrK = ix.K(fileInputStream, (int) ix.L(fileInputStream, 4), (int) ix.L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            fu1.h("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrK);
        try {
            y40[] y40VarArrC = C(byteArrayInputStream, str, iL);
            byteArrayInputStream.close();
            return y40VarArrC;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static y40[] C(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new y40[0];
        }
        y40[] y40VarArr = new y40[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iL = (int) ix.L(byteArrayInputStream, 2);
            int iL2 = (int) ix.L(byteArrayInputStream, 2);
            y40VarArr[i4] = new y40(str, new String(ix.J(byteArrayInputStream, iL), StandardCharsets.UTF_8), ix.L(byteArrayInputStream, 4), iL2, (int) ix.L(byteArrayInputStream, 4), (int) ix.L(byteArrayInputStream, 4), new int[iL2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            y40 y40Var = y40VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = y40Var.f;
            int i7 = y40Var.g;
            TreeMap treeMap = y40Var.i;
            int i8 = iAvailable - i6;
            int iL3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iL3 += (int) ix.L(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iL3), 1);
                int iL4 = (int) ix.L(byteArrayInputStream, 2);
                while (iL4 > 0) {
                    ix.L(byteArrayInputStream, 2);
                    int iL5 = (int) ix.L(byteArrayInputStream, 1);
                    if (iL5 != 6 && iL5 != 7) {
                        while (iL5 > 0) {
                            ix.L(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iL6 = (int) ix.L(byteArrayInputStream, 1); iL6 > 0; iL6--) {
                                ix.L(byteArrayInputStream, 2);
                            }
                            iL5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iL4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                fu1.h("Read too much data during profile line parse");
                return null;
            }
            y40Var.h = x(byteArrayInputStream, y40Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(ix.J(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return y40VarArr;
    }

    public static u71 D(u71 u71Var, oy1 oy1Var, di1 di1Var, v6 v6Var, boolean z2, pd0 pd0Var, f91 f91Var) {
        di1 di1Var2 = di1.e;
        r71 r71Var = r71.a;
        return u71Var.c(di1Var == di1Var2 ? nj2.k(r71Var, tn0.c) : nj2.k(r71Var, tn0.b)).c(new ay1(v6Var, pd0Var, f91Var, di1Var, oy1Var, z2, false));
    }

    public static final void E(aq aqVar, String str) {
        String str2;
        String str3 = "in the polymorphic scope of '" + aqVar.c() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + aqVar.c() + "' has to be sealed and '@Serializable'.";
        }
        throw new a22(str2);
    }

    public static final Bitmap.Config F(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26 || i2 != 3) {
            return (i3 < 26 || i2 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    public static final lq G(yb ybVar) {
        List list = ybVar.g;
        cb0 cb0Var = cb0.e;
        List list2 = list == null ? cb0Var : list;
        CharSequence charSequence = ybVar.f;
        if (!list2.isEmpty()) {
            SpannableString spannableString = new SpannableString(charSequence);
            m20 m20Var = new m20();
            m20Var.a = Parcel.obtain();
            if (list == null) {
                list = cb0Var;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                xb xbVar = (xb) list.get(i2);
                r72 r72Var = (r72) xbVar.a;
                int i3 = xbVar.b;
                int i4 = xbVar.c;
                m20Var.a.recycle();
                m20Var.a = Parcel.obtain();
                ve2 ve2Var = r72Var.a;
                long j2 = r72Var.l;
                long j3 = r72Var.h;
                int i5 = i2;
                long j4 = r72Var.b;
                List list3 = list;
                int i6 = size;
                long jB = ve2Var.b();
                long j5 = dr.g;
                if (!vk2.a(jB, j5)) {
                    m20Var.c((byte) 1);
                    m20Var.a.writeLong(r72Var.a.b());
                }
                long j6 = yf2.c;
                byte b2 = 2;
                if (!yf2.a(j4, j6)) {
                    m20Var.c((byte) 2);
                    m20Var.e(j4);
                }
                lh0 lh0Var = r72Var.c;
                if (lh0Var != null) {
                    m20Var.c((byte) 3);
                    m20Var.a.writeInt(lh0Var.e);
                }
                hh0 hh0Var = r72Var.d;
                if (hh0Var != null) {
                    int i7 = hh0Var.a;
                    m20Var.c((byte) 4);
                    m20Var.c((i7 != 0 && i7 == 1) ? (byte) 1 : (byte) 0);
                }
                ih0 ih0Var = r72Var.e;
                if (ih0Var != null) {
                    int i8 = ih0Var.a;
                    m20Var.c((byte) 5);
                    if (i8 == 0) {
                        b2 = 0;
                    } else if (i8 == 65535) {
                        b2 = 1;
                    } else if (i8 != 1) {
                        if (i8 == 2) {
                            b2 = 3;
                        } else {
                            b2 = 0;
                        }
                    }
                    m20Var.c(b2);
                }
                String str = r72Var.g;
                if (str != null) {
                    m20Var.c((byte) 6);
                    m20Var.a.writeString(str);
                }
                if (!yf2.a(j3, j6)) {
                    m20Var.c((byte) 7);
                    m20Var.e(j3);
                }
                th thVar = r72Var.i;
                if (thVar != null) {
                    float f2 = thVar.a;
                    m20Var.c((byte) 8);
                    m20Var.d(f2);
                }
                we2 we2Var = r72Var.j;
                if (we2Var != null) {
                    m20Var.c((byte) 9);
                    m20Var.d(we2Var.a);
                    m20Var.d(we2Var.b);
                }
                if (!vk2.a(j2, j5)) {
                    m20Var.c((byte) 10);
                    m20Var.a.writeLong(j2);
                }
                ed2 ed2Var = r72Var.m;
                if (ed2Var != null) {
                    m20Var.c((byte) 11);
                    m20Var.a.writeInt(ed2Var.a);
                }
                q32 q32Var = r72Var.n;
                if (q32Var != null) {
                    m20Var.c((byte) 12);
                    m20Var.a.writeLong(q32Var.a);
                    long j7 = q32Var.b;
                    m20Var.d(Float.intBitsToFloat((int) (j7 >> 32)));
                    m20Var.d(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    m20Var.d(q32Var.c);
                }
                SpannableString spannableString2 = spannableString;
                spannableString2.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(m20Var.a.marshall(), 0)), i3, i4, 33);
                i2 = i5 + 1;
                spannableString = spannableString2;
                list = list3;
                size = i6;
            }
            charSequence = spannableString;
        }
        return new lq(ClipData.newPlainText("plain text", charSequence));
    }

    public static boolean H(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, y40[] y40VarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = s5.Q;
        byte[] bArr3 = s5.P;
        byte[] bArr4 = s5.M;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = s5.N;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrI = i(y40VarArr, bArr5);
                ix.U(byteArrayOutputStream, y40VarArr.length, 1);
                ix.U(byteArrayOutputStream, bArrI.length, 4);
                byte[] bArrO = ix.o(bArrI);
                ix.U(byteArrayOutputStream, bArrO.length, 4);
                byteArrayOutputStream.write(bArrO);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                ix.U(byteArrayOutputStream, y40VarArr.length, 1);
                for (y40 y40Var : y40VarArr) {
                    int size = y40Var.i.size() * 4;
                    String strP = p(y40Var.a, y40Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    ix.V(byteArrayOutputStream, strP.getBytes(charset).length);
                    ix.V(byteArrayOutputStream, y40Var.h.length);
                    ix.U(byteArrayOutputStream, size, 4);
                    ix.U(byteArrayOutputStream, y40Var.c, 4);
                    byteArrayOutputStream.write(strP.getBytes(charset));
                    Iterator it = y40Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        ix.V(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        ix.V(byteArrayOutputStream, 0);
                    }
                    for (int i4 : y40Var.h) {
                        ix.V(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = s5.O;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrI2 = i(y40VarArr, bArr6);
                ix.U(byteArrayOutputStream, y40VarArr.length, 1);
                ix.U(byteArrayOutputStream, bArrI2.length, 4);
                byte[] bArrO2 = ix.o(bArrI2);
                ix.U(byteArrayOutputStream, bArrO2.length, 4);
                byteArrayOutputStream.write(bArrO2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            ix.V(byteArrayOutputStream, y40VarArr.length);
            for (y40 y40Var2 : y40VarArr) {
                String str = y40Var2.a;
                TreeMap treeMap = y40Var2.i;
                String strP2 = p(str, y40Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                ix.V(byteArrayOutputStream, strP2.getBytes(charset2).length);
                ix.V(byteArrayOutputStream, treeMap.size());
                ix.V(byteArrayOutputStream, y40Var2.h.length);
                ix.U(byteArrayOutputStream, y40Var2.c, 4);
                byteArrayOutputStream.write(strP2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    ix.V(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : y40Var2.h) {
                    ix.V(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            ix.V(byteArrayOutputStream2, y40VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (y40 y40Var3 : y40VarArr) {
                ix.U(byteArrayOutputStream2, y40Var3.c, 4);
                ix.U(byteArrayOutputStream2, y40Var3.d, 4);
                ix.U(byteArrayOutputStream2, y40Var3.g, 4);
                String strP3 = p(y40Var3.a, y40Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strP3.getBytes(charset3).length;
                ix.V(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strP3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            fr2 fr2Var = new fr2(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(fr2Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < y40VarArr.length) {
                try {
                    y40 y40Var4 = y40VarArr[i8];
                    ix.V(byteArrayOutputStream3, i8);
                    ix.V(byteArrayOutputStream3, y40Var4.e);
                    i9 = i9 + 4 + (y40Var4.e * i6);
                    int[] iArr = y40Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        ix.V(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            fr2 fr2Var2 = new fr2(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(fr2Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < y40VarArr.length; i14++) {
                try {
                    y40 y40Var5 = y40VarArr[i14];
                    Iterator it3 = y40Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        M(byteArrayOutputStream5, iIntValue, y40Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            N(byteArrayOutputStream6, y40Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            ix.V(byteArrayOutputStream4, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            ix.U(byteArrayOutputStream4, length4, 4);
                            ix.V(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i15 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            fr2 fr2Var3 = new fr2(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(fr2Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            ix.U(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                fr2 fr2Var4 = (fr2) arrayList.get(i16);
                int i17 = fr2Var4.a;
                byte[] bArr7 = fr2Var4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                ix.U(byteArrayOutputStream, j2, 4);
                ix.U(byteArrayOutputStream, size2, 4);
                if (fr2Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrO3 = ix.o(bArr7);
                    arrayList2.add(bArrO3);
                    ix.U(byteArrayOutputStream, bArrO3.length, 4);
                    ix.U(byteArrayOutputStream, length5, 4);
                    length = bArrO3.length;
                } else {
                    arrayList2.add(bArr7);
                    ix.U(byteArrayOutputStream, bArr7.length, 4);
                    ix.U(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static double I(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static final Object J(uy uyVar, Object obj, Object obj2, ij0 ij0Var, sx sxVar) {
        Object objS0 = p61.s0(uyVar, obj2);
        try {
            h82 h82Var = new h82(sxVar, uyVar);
            nj2.i(2, ij0Var);
            Object objG = ij0Var.g(obj, h82Var);
            p61.h0(uyVar, objS0);
            if (objG == fz.e) {
                sxVar.getClass();
            }
            return objG;
        } catch (Throwable th) {
            p61.h0(uyVar, objS0);
            throw th;
        }
    }

    public static void K(ByteArrayOutputStream byteArrayOutputStream, y40 y40Var) throws IOException {
        N(byteArrayOutputStream, y40Var);
        int i2 = y40Var.g;
        int[] iArr = y40Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            ix.V(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : y40Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void L(ByteArrayOutputStream byteArrayOutputStream, y40 y40Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        ix.V(byteArrayOutputStream, str.getBytes(charset).length);
        ix.V(byteArrayOutputStream, y40Var.e);
        ix.U(byteArrayOutputStream, y40Var.f, 4);
        ix.U(byteArrayOutputStream, y40Var.c, 4);
        ix.U(byteArrayOutputStream, y40Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void M(ByteArrayOutputStream byteArrayOutputStream, int i2, y40 y40Var) throws IOException {
        int i3 = y40Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : y40Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, y40 y40Var) {
        int i2 = 0;
        for (Map.Entry entry : y40Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                ix.V(byteArrayOutputStream, iIntValue - i2);
                ix.V(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x0132  */
    /* JADX WARN: Code duplicated, block: B:79:0x014b  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static final void a(ti0 ti0Var, gt gtVar, u71 u71Var, ij0 ij0Var, ij0 ij0Var2, ij0 ij0Var3, u32 u32Var, long j2, long j3, long j4, long j5, i50 i50Var, ak0 ak0Var, int i2, int i3) {
        ti0 ti0Var2;
        int i4;
        gt gtVar2;
        ij0 ij0Var4;
        int i5;
        int i6;
        ij0 ij0Var5;
        int i7;
        boolean z2;
        u32 u32Var2;
        long j6;
        long j7;
        long j8;
        i50 i50Var2;
        ij0 ij0Var6;
        ij0 ij0Var7;
        u71 u71Var2;
        long j9;
        lr1 lr1VarR;
        u32 u32VarA;
        u71 u71Var3;
        int i8;
        ij0 ij0Var8;
        i50 i50Var3;
        long j10;
        long j11;
        long j12;
        long j13;
        int i9;
        ak0Var.X(94478519);
        if ((i2 & 6) == 0) {
            ti0Var2 = ti0Var;
            i4 = (ak0Var.h(ti0Var2) ? 4 : 2) | i2;
        } else {
            ti0Var2 = ti0Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            gtVar2 = gtVar;
            i4 |= ak0Var.h(gtVar2) ? 32 : 16;
        } else {
            gtVar2 = gtVar;
        }
        int i10 = i4 | 384;
        int i11 = i3 & 8;
        if (i11 == 0) {
            if ((i2 & 3072) == 0) {
                ij0Var4 = ij0Var;
                i10 |= ak0Var.h(ij0Var4) ? 2048 : 1024;
            }
            i5 = i10 | 24576;
            if ((196608 & i2) != 0) {
                if (ak0Var.h(ij0Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i5 |= i9;
            }
            i6 = i3 & 64;
            if (i6 != 0) {
                if ((1572864 & i2) == 0) {
                    ij0Var5 = ij0Var3;
                    if (ak0Var.h(ij0Var5)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i5 |= i7;
                }
                if ((12582912 & i2) == 0) {
                    i5 |= 4194304;
                }
                if ((100663296 & i2) == 0) {
                    i5 |= 33554432;
                }
                if ((805306368 & i2) == 0) {
                    i5 |= 268435456;
                }
                if ((306783379 & i5) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (ak0Var.O(i5 & 1, z2)) {
                    ak0Var.T();
                    if ((i2 & 1) != 0 || ak0Var.y()) {
                        if (i11 != 0) {
                            ij0Var4 = null;
                        }
                        if (i6 != 0) {
                            ij0Var5 = null;
                        }
                        u32VarA = j42.a(vs0.o, ak0Var);
                        long jE = lr.e(vs0.n, ak0Var);
                        long jE2 = lr.e(vs0.t, ak0Var);
                        long jE3 = lr.e(vs0.p, ak0Var);
                        long jE4 = lr.e(vs0.r, ak0Var);
                        i50 i50Var4 = new i50(7);
                        u71Var3 = r71.a;
                        i8 = i5 & (-2143289345);
                        ij0Var8 = ij0Var5;
                        i50Var3 = i50Var4;
                        j10 = jE;
                        j11 = jE4;
                        j12 = jE3;
                        j13 = jE2;
                    } else {
                        ak0Var.R();
                        u71Var3 = u71Var;
                        u32VarA = u32Var;
                        j10 = j2;
                        j12 = j4;
                        j11 = j5;
                        i50Var3 = i50Var;
                        i8 = i5 & (-2143289345);
                        ij0Var8 = ij0Var5;
                        j13 = j3;
                    }
                    ak0Var.q();
                    ti0 ti0Var3 = ti0Var2;
                    u71 u71Var4 = u71Var3;
                    r3.c(ti0Var3, gtVar2, u71Var4, ij0Var4, ij0Var2, ij0Var8, u32VarA, j10, j13, j12, j11, i50Var3, ak0Var, i8 & 2147483646, 3456);
                    ij0Var6 = ij0Var4;
                    i50Var2 = i50Var3;
                    u71Var2 = u71Var4;
                    j8 = j11;
                    j7 = j12;
                    j6 = j13;
                    j9 = j10;
                    u32Var2 = u32VarA;
                    ij0Var7 = ij0Var8;
                } else {
                    ak0Var.R();
                    u32Var2 = u32Var;
                    j6 = j3;
                    j7 = j4;
                    j8 = j5;
                    i50Var2 = i50Var;
                    ij0Var6 = ij0Var4;
                    ij0Var7 = ij0Var5;
                    u71Var2 = u71Var;
                    j9 = j2;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new g3(ti0Var, gtVar, u71Var2, ij0Var6, ij0Var2, ij0Var7, u32Var2, j9, j6, j7, j8, i50Var2, i2, i3, 1);
                }
            }
            i5 |= 1572864;
            ij0Var5 = ij0Var3;
            if ((12582912 & i2) == 0) {
                i5 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i5 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                i5 |= 268435456;
            }
            if ((306783379 & i5) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (ak0Var.O(i5 & 1, z2)) {
                ak0Var.T();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        ij0Var4 = null;
                    }
                    if (i6 != 0) {
                        ij0Var5 = null;
                    }
                    u32VarA = j42.a(vs0.o, ak0Var);
                    long jE5 = lr.e(vs0.n, ak0Var);
                    long jE6 = lr.e(vs0.t, ak0Var);
                    long jE7 = lr.e(vs0.p, ak0Var);
                    long jE8 = lr.e(vs0.r, ak0Var);
                    i50 i50Var5 = new i50(7);
                    u71Var3 = r71.a;
                    i8 = i5 & (-2143289345);
                    ij0Var8 = ij0Var5;
                    i50Var3 = i50Var5;
                    j10 = jE5;
                    j11 = jE8;
                    j12 = jE7;
                    j13 = jE6;
                } else {
                    if (i11 != 0) {
                        ij0Var4 = null;
                    }
                    if (i6 != 0) {
                        ij0Var5 = null;
                    }
                    u32VarA = j42.a(vs0.o, ak0Var);
                    long jE9 = lr.e(vs0.n, ak0Var);
                    long jE10 = lr.e(vs0.t, ak0Var);
                    long jE11 = lr.e(vs0.p, ak0Var);
                    long jE12 = lr.e(vs0.r, ak0Var);
                    i50 i50Var6 = new i50(7);
                    u71Var3 = r71.a;
                    i8 = i5 & (-2143289345);
                    ij0Var8 = ij0Var5;
                    i50Var3 = i50Var6;
                    j10 = jE9;
                    j11 = jE12;
                    j12 = jE11;
                    j13 = jE10;
                }
                ak0Var.q();
                ti0 ti0Var4 = ti0Var2;
                u71 u71Var5 = u71Var3;
                r3.c(ti0Var4, gtVar2, u71Var5, ij0Var4, ij0Var2, ij0Var8, u32VarA, j10, j13, j12, j11, i50Var3, ak0Var, i8 & 2147483646, 3456);
                ij0Var6 = ij0Var4;
                i50Var2 = i50Var3;
                u71Var2 = u71Var5;
                j8 = j11;
                j7 = j12;
                j6 = j13;
                j9 = j10;
                u32Var2 = u32VarA;
                ij0Var7 = ij0Var8;
            } else {
                ak0Var.R();
                u32Var2 = u32Var;
                j6 = j3;
                j7 = j4;
                j8 = j5;
                i50Var2 = i50Var;
                ij0Var6 = ij0Var4;
                ij0Var7 = ij0Var5;
                u71Var2 = u71Var;
                j9 = j2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new g3(ti0Var, gtVar, u71Var2, ij0Var6, ij0Var2, ij0Var7, u32Var2, j9, j6, j7, j8, i50Var2, i2, i3, 1);
            }
        }
        i10 = i4 | 3456;
        ij0Var4 = ij0Var;
        i5 = i10 | 24576;
        if ((196608 & i2) != 0) {
            if (ak0Var.h(ij0Var2)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i5 |= i9;
        }
        i6 = i3 & 64;
        if (i6 != 0) {
            if ((1572864 & i2) == 0) {
                ij0Var5 = ij0Var3;
                if (ak0Var.h(ij0Var5)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i5 |= i7;
            }
            if ((12582912 & i2) == 0) {
                i5 |= 4194304;
            }
            if ((100663296 & i2) == 0) {
                i5 |= 33554432;
            }
            if ((805306368 & i2) == 0) {
                i5 |= 268435456;
            }
            if ((306783379 & i5) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (ak0Var.O(i5 & 1, z2)) {
                ak0Var.T();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        ij0Var4 = null;
                    }
                    if (i6 != 0) {
                        ij0Var5 = null;
                    }
                    u32VarA = j42.a(vs0.o, ak0Var);
                    long jE13 = lr.e(vs0.n, ak0Var);
                    long jE14 = lr.e(vs0.t, ak0Var);
                    long jE15 = lr.e(vs0.p, ak0Var);
                    long jE16 = lr.e(vs0.r, ak0Var);
                    i50 i50Var7 = new i50(7);
                    u71Var3 = r71.a;
                    i8 = i5 & (-2143289345);
                    ij0Var8 = ij0Var5;
                    i50Var3 = i50Var7;
                    j10 = jE13;
                    j11 = jE16;
                    j12 = jE15;
                    j13 = jE14;
                } else {
                    if (i11 != 0) {
                        ij0Var4 = null;
                    }
                    if (i6 != 0) {
                        ij0Var5 = null;
                    }
                    u32VarA = j42.a(vs0.o, ak0Var);
                    long jE17 = lr.e(vs0.n, ak0Var);
                    long jE18 = lr.e(vs0.t, ak0Var);
                    long jE19 = lr.e(vs0.p, ak0Var);
                    long jE110 = lr.e(vs0.r, ak0Var);
                    i50 i50Var8 = new i50(7);
                    u71Var3 = r71.a;
                    i8 = i5 & (-2143289345);
                    ij0Var8 = ij0Var5;
                    i50Var3 = i50Var8;
                    j10 = jE17;
                    j11 = jE110;
                    j12 = jE19;
                    j13 = jE18;
                }
                ak0Var.q();
                ti0 ti0Var5 = ti0Var2;
                u71 u71Var6 = u71Var3;
                r3.c(ti0Var5, gtVar2, u71Var6, ij0Var4, ij0Var2, ij0Var8, u32VarA, j10, j13, j12, j11, i50Var3, ak0Var, i8 & 2147483646, 3456);
                ij0Var6 = ij0Var4;
                i50Var2 = i50Var3;
                u71Var2 = u71Var6;
                j8 = j11;
                j7 = j12;
                j6 = j13;
                j9 = j10;
                u32Var2 = u32VarA;
                ij0Var7 = ij0Var8;
            } else {
                ak0Var.R();
                u32Var2 = u32Var;
                j6 = j3;
                j7 = j4;
                j8 = j5;
                i50Var2 = i50Var;
                ij0Var6 = ij0Var4;
                ij0Var7 = ij0Var5;
                u71Var2 = u71Var;
                j9 = j2;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new g3(ti0Var, gtVar, u71Var2, ij0Var6, ij0Var2, ij0Var7, u32Var2, j9, j6, j7, j8, i50Var2, i2, i3, 1);
            }
        }
        i5 |= 1572864;
        ij0Var5 = ij0Var3;
        if ((12582912 & i2) == 0) {
            i5 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= 268435456;
        }
        if ((306783379 & i5) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (ak0Var.O(i5 & 1, z2)) {
            ak0Var.T();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    ij0Var4 = null;
                }
                if (i6 != 0) {
                    ij0Var5 = null;
                }
                u32VarA = j42.a(vs0.o, ak0Var);
                long jE111 = lr.e(vs0.n, ak0Var);
                long jE112 = lr.e(vs0.t, ak0Var);
                long jE113 = lr.e(vs0.p, ak0Var);
                long jE114 = lr.e(vs0.r, ak0Var);
                i50 i50Var9 = new i50(7);
                u71Var3 = r71.a;
                i8 = i5 & (-2143289345);
                ij0Var8 = ij0Var5;
                i50Var3 = i50Var9;
                j10 = jE111;
                j11 = jE114;
                j12 = jE113;
                j13 = jE112;
            } else {
                if (i11 != 0) {
                    ij0Var4 = null;
                }
                if (i6 != 0) {
                    ij0Var5 = null;
                }
                u32VarA = j42.a(vs0.o, ak0Var);
                long jE115 = lr.e(vs0.n, ak0Var);
                long jE116 = lr.e(vs0.t, ak0Var);
                long jE117 = lr.e(vs0.p, ak0Var);
                long jE118 = lr.e(vs0.r, ak0Var);
                i50 i50Var10 = new i50(7);
                u71Var3 = r71.a;
                i8 = i5 & (-2143289345);
                ij0Var8 = ij0Var5;
                i50Var3 = i50Var10;
                j10 = jE115;
                j11 = jE118;
                j12 = jE117;
                j13 = jE116;
            }
            ak0Var.q();
            ti0 ti0Var6 = ti0Var2;
            u71 u71Var7 = u71Var3;
            r3.c(ti0Var6, gtVar2, u71Var7, ij0Var4, ij0Var2, ij0Var8, u32VarA, j10, j13, j12, j11, i50Var3, ak0Var, i8 & 2147483646, 3456);
            ij0Var6 = ij0Var4;
            i50Var2 = i50Var3;
            u71Var2 = u71Var7;
            j8 = j11;
            j7 = j12;
            j6 = j13;
            j9 = j10;
            u32Var2 = u32VarA;
            ij0Var7 = ij0Var8;
        } else {
            ak0Var.R();
            u32Var2 = u32Var;
            j6 = j3;
            j7 = j4;
            j8 = j5;
            i50Var2 = i50Var;
            ij0Var6 = ij0Var4;
            ij0Var7 = ij0Var5;
            u71Var2 = u71Var;
            j9 = j2;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new g3(ti0Var, gtVar, u71Var2, ij0Var6, ij0Var2, ij0Var7, u32Var2, j9, j6, j7, j8, i50Var2, i2, i3, 1);
        }
    }

    public static final void b(me2 me2Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        u71 u71VarT;
        ak0Var.X(1533506138);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.h(me2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(gtVar) ? 32 : 16;
        }
        int i5 = 0;
        if (ak0Var.O(i3 & 1, (i3 & 19) != 18)) {
            ak0Var.W(-885604480);
            if (me2Var.i()) {
                sx sxVar = null;
                u71VarT = ws0.T(s5.S(new ee2(me2Var, sxVar, i5)), me2Var.x, new fe2(i5, sxVar, me2Var), new ge2(me2Var, sxVar, i5), new wx(me2Var, i4));
            } else {
                u71VarT = r71.a;
            }
            ix.e(u71VarT, gtVar, ak0Var, i3 & 112);
            ak0Var.p(false);
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new fs(me2Var, gtVar, i2, i5);
        }
    }

    public static boolean c(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    public static final Bitmap d(g7 g7Var) {
        if (g7Var instanceof g7) {
            return g7Var.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final u71 e(u71 u71Var, fk fkVar) {
        return u71Var.c(new dk(fkVar));
    }

    public static final s40 f(View view) {
        oq2 oq2Var;
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            q40 q40VarF = sv0.F(context);
            long jA = mx.a(configuration.screenWidthDp, configuration.screenHeightDp);
            long jY = q40VarF.Y(jA);
            return new s40((((long) ((int) Float.intBitsToFloat((int) (jY & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jY >> 32)))) << 32), jA);
        }
        mq2.a.getClass();
        lq2 lq2Var = lq2.a;
        nq2 nq2Var = lq2.b;
        nq2Var.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            oq2Var = o40.f;
        } else {
            oq2Var = i2 >= 30 ? uj.f : is1.v;
        }
        kq2 kq2VarB = oq2Var.b(contextWrapper2, nq2Var.b);
        long jHeight = (4294967295L & ((long) kq2VarB.a().height())) | (((long) kq2VarB.a().width()) << 32);
        return new s40(jHeight, sv0.F(baseContext).w(ux.M(jHeight)));
    }

    public static double g(double d2) {
        int i2;
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        if (d2 < 0.0d) {
            i2 = -1;
        } else {
            i2 = d2 == 0.0d ? 0 : 1;
        }
        return ((((double) i2) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(xv1 xv1Var, Throwable th) {
        boolean zIsTerminated;
        if (xv1Var != 0) {
            if (th != null) {
                try {
                    k3.t(xv1Var);
                    return;
                } catch (Throwable th2) {
                    vv.e(th, th2);
                    return;
                }
            }
            if (xv1Var instanceof AutoCloseable) {
                xv1Var.close();
                return;
            }
            if (!(xv1Var instanceof ExecutorService)) {
                if (xv1Var instanceof TypedArray) {
                    ((TypedArray) xv1Var).recycle();
                    return;
                } else if (xv1Var instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) xv1Var).release();
                    return;
                } else {
                    if (!(xv1Var instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) xv1Var).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) xv1Var;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z2 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        executorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static byte[] i(y40[] y40VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (y40 y40Var : y40VarArr) {
            length += ((((y40Var.g * 2) + 7) & (-8)) / 8) + (y40Var.e * 2) + p(y40Var.a, y40Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + y40Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, s5.O)) {
            int length2 = y40VarArr.length;
            while (i2 < length2) {
                y40 y40Var2 = y40VarArr[i2];
                L(byteArrayOutputStream, y40Var2, p(y40Var2.a, y40Var2.b, bArr));
                K(byteArrayOutputStream, y40Var2);
                i2++;
            }
        } else {
            for (y40 y40Var3 : y40VarArr) {
                L(byteArrayOutputStream, y40Var3, p(y40Var3.a, y40Var3.b, bArr));
            }
            int length3 = y40VarArr.length;
            while (i2 < length3) {
                K(byteArrayOutputStream, y40VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object j(rv rvVar, tq1 tq1Var) {
        if (!((t71) rvVar).e.r) {
            vp0.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        sl1 sl1Var = (sl1) qx.V(rvVar).E;
        sl1Var.getClass();
        return vv.N(sl1Var, tq1Var);
    }

    public static boolean k(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = k(file2) && z2;
        }
        return z2;
    }

    public static final u71 l(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new g80(ej0Var));
    }

    public static final u71 m(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new o80(ej0Var));
    }

    public static final u71 n(u71 u71Var, ej0 ej0Var) {
        return u71Var.c(new p80(ej0Var));
    }

    public static void o(Canvas canvas, boolean z2) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z2) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!g0) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    e0 = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f0 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    e0 = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f0 = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = e0;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f0;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            g0 = true;
        }
        if (z2) {
            try {
                Method method4 = e0;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z2 || (method = f0) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static String p(String str, String str2, byte[] bArr) {
        byte[] bArr2 = s5.P;
        byte[] bArr3 = s5.Q;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder(str);
                sb.append((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static final int q(s12 s12Var, yt0 yt0Var, String str) {
        s12Var.getClass();
        str.getClass();
        w(yt0Var, s12Var);
        int iA = s12Var.a(str);
        if (iA != -3 || !yt0Var.a.f) {
            return iA;
        }
        ao2 ao2Var = yt0Var.c;
        n1 n1Var = new n1(21, s12Var, yt0Var);
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ao2Var.f;
        Map map = (Map) concurrentHashMap.get(s12Var);
        w40 w40Var = F;
        Object obj = map != null ? map.get(w40Var) : null;
        Object objA = obj != null ? obj : null;
        if (objA == null) {
            objA = n1Var.a();
            Object concurrentHashMap2 = concurrentHashMap.get(s12Var);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(s12Var, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(w40Var, objA);
        }
        Integer num = (Integer) ((Map) objA).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final mv0 r(mv0 mv0Var) {
        return mv0Var.c().h() ? mv0Var : new cf1(mv0Var);
    }

    public static double s(double[] dArr) {
        double d2 = dArr[0];
        double[][] dArr2 = B;
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        double d9 = (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0]);
        double dG = g(d7);
        double dG2 = g(d8);
        double dG3 = g(d9);
        return Math.atan2(((dG + dG2) - (dG3 * 2.0d)) / 9.0d, ((((-12.0d) * dG2) + (dG * 11.0d)) + dG3) / 11.0d);
    }

    public static final boolean t(yt0 yt0Var, s12 s12Var) {
        s12Var.getClass();
        if (yt0Var.a.a) {
            return true;
        }
        List annotations = s12Var.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((java.lang.annotation.Annotation) it.next()) instanceof ou0) {
                return true;
            }
        }
        return false;
    }

    public static double u(double d2) {
        int i2;
        double dAbs = Math.abs(d2);
        double dMax = Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs));
        if (d2 < 0.0d) {
            i2 = -1;
        } else {
            i2 = d2 == 0.0d ? 0 : 1;
        }
        return Math.pow(dMax, 2.380952380952381d) * ((double) i2);
    }

    public static boolean v(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static final void w(yt0 yt0Var, s12 s12Var) {
        s12Var.getClass();
        ws0.j(s12Var.c(), q92.b);
    }

    public static int[] x(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iL = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iL += (int) ix.L(byteArrayInputStream, 2);
            iArr[i3] = iL;
        }
        return iArr;
    }

    public static y40[] y(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, y40[] y40VarArr) throws IOException {
        byte[] bArr3 = s5.R;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, s5.S)) {
                fu1.h("Unsupported meta version");
                return null;
            }
            int iL = (int) ix.L(fileInputStream, 2);
            byte[] bArrK = ix.K(fileInputStream, (int) ix.L(fileInputStream, 4), (int) ix.L(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                fu1.h("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrK);
            try {
                y40[] y40VarArrA = A(byteArrayInputStream, bArr2, iL, y40VarArr);
                byteArrayInputStream.close();
                return y40VarArrA;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(s5.M, bArr2)) {
            fu1.h("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            fu1.h("Unsupported meta version");
            return null;
        }
        int iL2 = (int) ix.L(fileInputStream, 1);
        byte[] bArrK2 = ix.K(fileInputStream, (int) ix.L(fileInputStream, 4), (int) ix.L(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            fu1.h("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrK2);
        try {
            y40[] y40VarArrZ = z(byteArrayInputStream2, iL2, y40VarArr);
            byteArrayInputStream2.close();
            return y40VarArrZ;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static y40[] z(ByteArrayInputStream byteArrayInputStream, int i2, y40[] y40VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new y40[0];
        }
        if (i2 != y40VarArr.length) {
            fu1.h("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iL = (int) ix.L(byteArrayInputStream, 2);
            iArr[i3] = (int) ix.L(byteArrayInputStream, 2);
            strArr[i3] = new String(ix.J(byteArrayInputStream, iL), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            y40 y40Var = y40VarArr[i4];
            if (!y40Var.b.equals(strArr[i4])) {
                fu1.h("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            y40Var.e = i5;
            y40Var.h = x(byteArrayInputStream, i5);
        }
        return y40VarArr;
    }
}
