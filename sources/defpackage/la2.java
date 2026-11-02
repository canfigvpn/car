package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class la2 extends na2 {
    public final /* synthetic */ int h = 1;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(vh0 vh0Var, String str) {
        super(vh0Var, str);
        vh0Var.getClass();
        str.getClass();
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = vh0Var.e.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        this.i = new ci0(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.na2, defpackage.xv1
    public void D() {
        switch (this.h) {
            case 0:
                ((ma2) this.i).D();
                break;
            default:
                super.D();
                break;
        }
    }

    @Override // defpackage.xv1
    public final void a(int i) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((ma2) obj).a(i);
                return;
            case 1:
                b();
                ((ci0) obj).a(i);
                return;
            default:
                b();
                ix.R("column index out of range", 25);
                throw null;
        }
    }

    @Override // defpackage.xv1
    public final void c(int i, long j) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                ((ma2) obj).c(i, j);
                return;
            case 1:
                b();
                ((ci0) obj).c(i, j);
                return;
            default:
                b();
                ix.R("column index out of range", 25);
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((ma2) obj).close();
                break;
            case 1:
                ((ci0) obj).close();
                this.g = true;
                break;
            default:
                this.g = true;
                break;
        }
    }

    @Override // defpackage.xv1
    public final void e(String str, int i) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                str.getClass();
                ((ma2) obj).e(str, i);
                return;
            case 1:
                str.getClass();
                b();
                ((ci0) obj).x(str, i);
                return;
            default:
                str.getClass();
                b();
                ix.R("column index out of range", 25);
                throw null;
        }
    }

    @Override // defpackage.xv1
    public final String f(int i) {
        switch (this.h) {
            case 0:
                return ((ma2) this.i).f(i);
            case 1:
                b();
                ix.R("no row", 21);
                throw null;
            default:
                b();
                ix.R("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.xv1
    public final int getColumnCount() {
        switch (this.h) {
            case 0:
                return ((ma2) this.i).getColumnCount();
            case 1:
                b();
                return 0;
            default:
                b();
                return 0;
        }
    }

    @Override // defpackage.xv1
    public final String getColumnName(int i) {
        switch (this.h) {
            case 0:
                return ((ma2) this.i).getColumnName(i);
            case 1:
                b();
                ix.R("no row", 21);
                throw null;
            default:
                b();
                ix.R("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.xv1
    public final double getDouble(int i) {
        switch (this.h) {
            case 0:
                return ((ma2) this.i).getDouble(i);
            case 1:
                b();
                ix.R("no row", 21);
                throw null;
            default:
                b();
                ix.R("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.xv1
    public final long getLong(int i) {
        switch (this.h) {
            case 0:
                return ((ma2) this.i).getLong(i);
            case 1:
                b();
                ix.R("no row", 21);
                throw null;
            default:
                b();
                ix.R("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.xv1
    public final boolean isNull(int i) {
        switch (this.h) {
            case 0:
                return ((ma2) this.i).isNull(i);
            case 1:
                b();
                ix.R("no row", 21);
                throw null;
            default:
                b();
                ix.R("no row", 21);
                throw null;
        }
    }

    @Override // defpackage.xv1
    public boolean m() {
        switch (this.h) {
            case 0:
                return ((ma2) this.i).m();
            default:
                return super.m();
        }
    }

    @Override // defpackage.xv1
    public final void o(double d) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((ma2) obj).o(d);
                return;
            case 1:
                b();
                ((ci0) obj).g(d, 7);
                return;
            default:
                b();
                ix.R("column index out of range", 25);
                throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    @Override // defpackage.xv1
    public final boolean y() throws IllegalAccessException, InvocationTargetException {
        int i = this.h;
        vh0 vh0Var = this.e;
        Object obj = this.i;
        switch (i) {
            case 0:
                ma2 ma2Var = (ma2) obj;
                boolean zY = ma2Var.y();
                if (ma2Var.f(0).equalsIgnoreCase("wal")) {
                    vh0Var.e.enableWriteAheadLogging();
                } else {
                    vh0Var.e.disableWriteAheadLogging();
                }
                return zY;
            case 1:
                b();
                ((ci0) obj).f.execute();
                return false;
            default:
                int iOrdinal = ((ka2) obj).ordinal();
                if (iOrdinal == 0) {
                    vh0Var.n();
                    vh0Var.h();
                } else if (iOrdinal == 1) {
                    vh0Var.h();
                } else if (iOrdinal == 2) {
                    vh0Var.b();
                } else if (iOrdinal == 3) {
                    vh0Var.d();
                } else if (iOrdinal == 4) {
                    SQLiteDatabase sQLiteDatabase = vh0Var.e;
                    rx0 rx0Var = vh0.h;
                    if (((Method) rx0Var.getValue()) != null) {
                        rx0 rx0Var2 = vh0.g;
                        if (((Method) rx0Var2.getValue()) != null) {
                            Method method = (Method) rx0Var.getValue();
                            method.getClass();
                            Method method2 = (Method) rx0Var2.getValue();
                            method2.getClass();
                            Object objInvoke = method2.invoke(sQLiteDatabase, null);
                            if (objInvoke != null) {
                                method.invoke(objInvoke, 0, null, 0, null);
                            } else {
                                fu1.h("Required value was null.");
                            }
                        } else {
                            vh0Var.b();
                        }
                    } else {
                        vh0Var.b();
                    }
                } else {
                    qj.p();
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(vh0 vh0Var, String str, ka2 ka2Var) {
        super(vh0Var, str);
        vh0Var.getClass();
        str.getClass();
        this.i = ka2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la2(vh0 vh0Var, String str, ma2 ma2Var) {
        super(vh0Var, str);
        vh0Var.getClass();
        str.getClass();
        this.i = ma2Var;
    }
}
