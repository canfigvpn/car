package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class io1 {
    public final int a;
    public final ti0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final lw[] f;
    public final g12 g;
    public final vp h;

    public io1(int i, ti0 ti0Var) {
        this.a = i;
        this.b = ti0Var;
        this.f = new lw[i];
        int i2 = h12.a;
        this.g = new g12(i);
        vp vpVar = new vp(0);
        if (i < 1) {
            qj.r("capacity must be >= 1");
            throw null;
        }
        if (i > 1073741824) {
            qj.r("capacity must be <= 2^30");
            throw null;
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        vpVar.d = i - 1;
        vpVar.e = new Object[i];
        this.h = vpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(tx txVar) {
        go1 go1Var;
        int andDecrement;
        g12 g12Var = this.g;
        int i = g12Var.e;
        vp vpVar = this.h;
        if (txVar instanceof go1) {
            go1Var = (go1) txVar;
            int i2 = go1Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                go1Var.j = i2 - Integer.MIN_VALUE;
            } else {
                go1Var = new go1(this, txVar);
            }
        } else {
            go1Var = new go1(this, txVar);
        }
        Object obj = go1Var.h;
        int i3 = go1Var.j;
        if (i3 == 0) {
            ix.Q(obj);
            go1Var.j = 1;
            do {
                andDecrement = f12.i.getAndDecrement(g12Var);
            } while (andDecrement > i);
            Object obj2 = ll2.a;
            fz fzVar = fz.e;
            if (andDecrement <= 0) {
                om omVarW = dv1.w(ex.y(go1Var));
                try {
                    if (!g12Var.a(omVarW)) {
                        while (true) {
                            int andDecrement2 = f12.i.getAndDecrement(g12Var);
                            if (andDecrement2 <= i) {
                                if (andDecrement2 > 0) {
                                    omVarW.m(obj2, g12Var.f);
                                    break;
                                }
                                if (g12Var.a(omVarW)) {
                                    break;
                                }
                            }
                        }
                    }
                    Object objT = omVarW.t();
                    if (objT != fzVar) {
                        objT = obj2;
                    }
                    if (objT == fzVar) {
                        obj2 = objT;
                    }
                } catch (Throwable th) {
                    omVarW.D();
                    throw th;
                }
            }
            if (obj2 == fzVar) {
                return fzVar;
            }
        } else {
            if (i3 != 1) {
                fu1.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ix.Q(obj);
        }
        try {
            ReentrantLock reentrantLock = this.c;
            reentrantLock.lock();
            try {
                if (this.e) {
                    ix.R("Connection pool is closed", 21);
                    throw null;
                }
                if (vpVar.b == vpVar.c && this.d < this.a) {
                    lw lwVar = new lw((vv1) this.b.a());
                    lw[] lwVarArr = this.f;
                    int i4 = this.d;
                    this.d = i4 + 1;
                    lwVarArr[i4] = lwVar;
                    vpVar.a(lwVar);
                }
                int i5 = vpVar.b;
                if (i5 == vpVar.c) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                Object[] objArr = (Object[]) vpVar.e;
                Object obj3 = objArr[i5];
                objArr[i5] = null;
                vpVar.b = (i5 + 1) & vpVar.d;
                lw lwVar2 = (lw) obj3;
                reentrantLock.unlock();
                return lwVar2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            g12Var.c();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:20:0x003e, B:25:0x005b, B:29:0x006f, B:31:0x0075, B:37:0x0086, B:43:0x009b, B:44:0x00a2, B:32:0x0078, B:45:0x00a3, B:46:0x00a8), top: B:70:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:20:0x003e, B:25:0x005b, B:29:0x006f, B:31:0x0075, B:37:0x0086, B:43:0x009b, B:44:0x00a2, B:32:0x0078, B:45:0x00a3, B:46:0x00a8), top: B:70:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:20:0x003e, B:25:0x005b, B:29:0x006f, B:31:0x0075, B:37:0x0086, B:43:0x009b, B:44:0x00a2, B:32:0x0078, B:45:0x00a3, B:46:0x00a8), top: B:70:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086 A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #2 {all -> 0x00ae, blocks: (B:20:0x003e, B:25:0x005b, B:29:0x006f, B:31:0x0075, B:37:0x0086, B:43:0x009b, B:44:0x00a2, B:32:0x0078, B:45:0x00a3, B:46:0x00a8), top: B:70:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[Catch: all -> 0x00ae, TryCatch #2 {all -> 0x00ae, blocks: (B:20:0x003e, B:25:0x005b, B:29:0x006f, B:31:0x0075, B:37:0x0086, B:43:0x009b, B:44:0x00a2, B:32:0x0078, B:45:0x00a3, B:46:0x00a8), top: B:70:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:51:0x00b5, B:53:0x00b9, B:57:0x00c1, B:61:0x00c9), top: B:66:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:51:0x00b5, B:53:0x00b9, B:57:0x00c1, B:61:0x00c9), top: B:66:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9 A[Catch: all -> 0x00bd, TRY_LEAVE, TryCatch #0 {all -> 0x00bd, blocks: (B:51:0x00b5, B:53:0x00b9, B:57:0x00c1, B:61:0x00c9), top: B:66:0x00b5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0094 -> B:42:0x0096). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r12, defpackage.iw r14, defpackage.tx r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io1.b(long, iw, tx):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (lw lwVar : this.f) {
                if (lwVar != null) {
                    lwVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        vp vpVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            z21 z21VarL = vs0.l();
            int i = (vpVar.c - vpVar.b) & vpVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 >= 0) {
                    int i3 = vpVar.c;
                    int i4 = vpVar.b;
                    int i5 = vpVar.d;
                    if (i2 < ((i3 - i4) & i5)) {
                        Object obj = ((Object[]) vpVar.e)[(i4 + i2) & i5];
                        obj.getClass();
                        z21VarL.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            z21 z21VarI = vs0.i(z21VarL);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(we.a.getIntVolatile(this.g, f12.j), 0) + ", ");
            sb.append("queue=(size=" + z21VarI.a() + ")[" + vq.V(z21VarI, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            lw[] lwVarArr = this.f;
            int length = lwVarArr.length;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                lw lwVar = lwVarArr[i7];
                i6++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i6);
                sb2.append("] - ");
                sb2.append(lwVar != null ? lwVar.e.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (lwVar != null) {
                    lwVar.h(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(lw lwVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.a(lwVar);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
