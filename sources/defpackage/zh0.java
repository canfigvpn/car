package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zh0 extends SQLiteOpenHelper {
    public static final /* synthetic */ int k = 0;
    public final Context e;
    public final ao2 f;
    public final qs g;
    public boolean h;
    public final dq1 i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(Context context, String str, final ao2 ao2Var, final qs qsVar) {
        String string;
        super(context, str, null, qsVar.b, new DatabaseErrorHandler() { // from class: wh0
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = zh0.k;
                sQLiteDatabase.getClass();
                ao2 ao2Var2 = ao2Var;
                vh0 vh0Var = (vh0) ao2Var2.f;
                if (vh0Var == null || !vh0Var.e.equals(sQLiteDatabase)) {
                    vh0Var = new vh0(sQLiteDatabase);
                    ao2Var2.f = vh0Var;
                }
                SQLiteDatabase sQLiteDatabase2 = vh0Var.e;
                qsVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + vh0Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        qs.d(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        vh0Var.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            obj.getClass();
                            qs.d((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            qs.d(path2);
                        }
                    }
                }
            }
        });
        qsVar.getClass();
        this.e = context;
        this.f = ao2Var;
        this.g = qsVar;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.i = new dq1(string, context.getCacheDir(), false);
    }

    public final vh0 b(boolean z) {
        dq1 dq1Var = this.i;
        try {
            dq1Var.a((this.j || getDatabaseName() == null) ? false : true);
            this.h = false;
            SQLiteDatabase sQLiteDatabaseH = h(z);
            if (!this.h) {
                return d(sQLiteDatabaseH);
            }
            close();
            return b(z);
        } finally {
            dq1Var.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        dq1 dq1Var = this.i;
        try {
            dq1Var.a(dq1Var.a);
            super.close();
            this.f.f = null;
            this.j = false;
        } finally {
            dq1Var.b();
        }
    }

    public final vh0 d(SQLiteDatabase sQLiteDatabase) {
        ao2 ao2Var = this.f;
        vh0 vh0Var = (vh0) ao2Var.f;
        if (vh0Var != null && vh0Var.e.equals(sQLiteDatabase)) {
            return vh0Var;
        }
        vh0 vh0Var2 = new vh0(sQLiteDatabase);
        ao2Var.f = vh0Var2;
        return vh0Var2;
    }

    public final SQLiteDatabase h(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.j;
        if (databaseName != null && !z2 && (parentFile = this.e.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            readableDatabase2.getClass();
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase = getWritableDatabase();
                    readableDatabase.getClass();
                } else {
                    readableDatabase = getReadableDatabase();
                    readableDatabase.getClass();
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof xh0) {
                    xh0 xh0Var = (xh0) th;
                    int iOrdinal = xh0Var.e.ordinal();
                    th = xh0Var.f;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        qj.p();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.h;
        qs qsVar = this.g;
        if (!z && qsVar.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            qsVar.getClass();
        } catch (Throwable th) {
            throw new xh0(yh0.e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((t61) this.g.c).p(new ha2(d(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new xh0(yh0.f, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.h = true;
        try {
            this.g.f(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new xh0(yh0.h, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.h) {
            try {
                qs qsVar = this.g;
                vh0 vh0VarD = d(sQLiteDatabase);
                t61 t61Var = (t61) qsVar.c;
                t61Var.r(new ha2(vh0VarD));
                t61Var.h = vh0VarD;
            } catch (Throwable th) {
                throw new xh0(yh0.i, th);
            }
        }
        this.j = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.h = true;
        try {
            this.g.f(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new xh0(yh0.g, th);
        }
    }
}
