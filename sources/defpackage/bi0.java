package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class bi0 implements ja2 {
    public final SQLiteProgram e;

    public bi0(SQLiteProgram sQLiteProgram) {
        this.e = sQLiteProgram;
    }

    @Override // defpackage.ja2
    public final void a(int i) {
        this.e.bindNull(i);
    }

    @Override // defpackage.ja2
    public final void c(int i, long j) {
        this.e.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    @Override // defpackage.ja2
    public final void g(double d, int i) {
        this.e.bindDouble(i, d);
    }

    @Override // defpackage.ja2
    public final void w(int i, byte[] bArr) {
        this.e.bindBlob(i, bArr);
    }

    @Override // defpackage.ja2
    public final void x(String str, int i) {
        str.getClass();
        this.e.bindString(i, str);
    }
}
