package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vh0 implements Closeable {
    public static final String[] f = new String[0];
    public static final rx0 g;
    public static final rx0 h;
    public final SQLiteDatabase e;

    static {
        m2 m2Var = new m2(20);
        v01 v01Var = v01.e;
        g = vv.F(v01Var, m2Var);
        h = vv.F(v01Var, new m2(21));
    }

    public vh0(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    public final void b() {
        this.e.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    public final void d() {
        this.e.beginTransactionNonExclusive();
    }

    public final void h() {
        this.e.endTransaction();
    }

    public final boolean isOpen() {
        return this.e.isOpen();
    }

    public final void j(String str) {
        this.e.execSQL(str);
    }

    public final void k(String str, Object[] objArr) {
        this.e.execSQL(str, objArr);
    }

    public final boolean l() {
        return this.e.inTransaction();
    }

    public final void n() {
        this.e.setTransactionSuccessful();
    }
}
