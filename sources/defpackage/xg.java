package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xg {
    public final Context a;
    public final MyGarageDatabase b;
    public final m32 c;
    public final sz1 d;
    public final jb2 e;
    public final bn f;
    public final w22 g;
    public final s22 h;
    public final i22 i;
    public final rf1 j;

    public xg(Context context, MyGarageDatabase myGarageDatabase, m32 m32Var, sz1 sz1Var, jb2 jb2Var) {
        context.getClass();
        myGarageDatabase.getClass();
        m32Var.getClass();
        sz1Var.getClass();
        jb2Var.getClass();
        this.a = context;
        this.b = myGarageDatabase;
        this.c = m32Var;
        this.d = sz1Var;
        this.e = jb2Var;
        this.f = myGarageDatabase.m();
        this.g = myGarageDatabase.q();
        this.h = myGarageDatabase.p();
        this.i = myGarageDatabase.o();
        this.j = myGarageDatabase.n();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a(hk0 hk0Var, tx txVar) {
        tg tgVar;
        es1 es1Var;
        Object next;
        if (txVar instanceof tg) {
            tgVar = (tg) txVar;
            int i = tgVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgVar.l = i - Integer.MIN_VALUE;
            } else {
                tgVar = new tg(this, txVar);
            }
        } else {
            tgVar = new tg(this, txVar);
        }
        Object obj = tgVar.j;
        int i2 = tgVar.l;
        vd vdVar = null;
        Object obj2 = null;
        boolean z = true;
        if (i2 == 0) {
            ix.Q(obj);
            es1Var = new es1();
            ug ugVar = new ug(this, hk0Var, es1Var, null);
            tgVar.h = hk0Var;
            tgVar.i = es1Var;
            tgVar.l = 1;
            Object objT = dv1.T(this.b, ugVar, tgVar);
            fz fzVar = fz.e;
            if (objT == fzVar) {
                return fzVar;
            }
        } else {
            if (i2 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            es1 es1Var2 = tgVar.i;
            hk0 hk0Var2 = tgVar.h;
            ix.Q(obj);
            es1Var = es1Var2;
            hk0Var = hk0Var2;
        }
        sz1 sz1Var = this.d;
        SharedPreferences sharedPreferences = sz1Var.a;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.remove("selected_car_id");
        editorEdit.apply();
        sz1Var.b.i(null);
        int size = hk0Var.f.size();
        int i3 = es1Var.e;
        mh mhVar = hk0Var.g;
        if (mhVar != null) {
            String str = mhVar.a;
            m32 m32Var = this.c;
            if (str != null) {
                Iterator it = dg2.g.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!ws0.j(((dg2) next).name(), str));
                dg2 dg2Var = (dg2) next;
                if (dg2Var != null) {
                    m32Var.d(dg2Var);
                }
            }
            Boolean bool = mhVar.b;
            if (bool != null) {
                m32Var.a(bool.booleanValue());
            }
            Boolean bool2 = mhVar.d;
            if (bool2 != null) {
                m32Var.c(bool2.booleanValue());
            }
            String str2 = mhVar.c;
            if (str2 != null) {
                for (Object obj3 : vd.h) {
                    if (ws0.j(((vd) obj3).name(), str2)) {
                        obj2 = obj3;
                        break;
                    }
                }
                vdVar = (vd) obj2;
            }
            if (vdVar == null || vdVar == m32Var.g.e.getValue()) {
                z = false;
            } else {
                m32Var.b(vdVar);
            }
        } else {
            z = false;
        }
        return new bh(size, i3, z);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:24:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f0 -> B:23:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0101 -> B:25:0x010e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable b(long r25, defpackage.mg r27, java.util.Map r28, defpackage.tx r29) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.b(long, mg, java.util.Map, tx):java.io.Serializable");
    }
}
