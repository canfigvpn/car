package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ma2 extends na2 {
    public int[] h;
    public long[] i;
    public double[] j;
    public String[] k;
    public byte[][] l;
    public Cursor m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma2(vh0 vh0Var, String str) {
        super(vh0Var, str);
        vh0Var.getClass();
        str.getClass();
        this.h = new int[0];
        this.i = new long[0];
        this.j = new double[0];
        this.k = new String[0];
        this.l = new byte[0][];
    }

    public static void j(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            ix.R("column index out of range", 25);
            throw null;
        }
    }

    @Override // defpackage.na2, defpackage.xv1
    public final void D() {
        b();
        Cursor cursor = this.m;
        if (cursor != null) {
            cursor.close();
        }
        this.m = null;
    }

    @Override // defpackage.xv1
    public final void a(int i) {
        b();
        d(5, i);
        this.h[i] = 5;
    }

    @Override // defpackage.xv1
    public final void c(int i, long j) {
        b();
        d(1, i);
        this.h[i] = 1;
        this.i[i] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.g) {
            b();
            this.h = new int[0];
            this.i = new long[0];
            this.j = new double[0];
            this.k = new String[0];
            this.l = new byte[0][];
            D();
        }
        this.g = true;
    }

    public final void d(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.h;
        if (iArr.length < i3) {
            this.h = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.i;
            if (jArr.length < i3) {
                this.i = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.j;
            if (dArr.length < i3) {
                this.j = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.k;
            if (strArr.length < i3) {
                this.k = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.l;
        if (bArr.length < i3) {
            this.l = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.xv1
    public final void e(String str, int i) {
        str.getClass();
        b();
        d(3, i);
        this.h[i] = 3;
        this.k[i] = str;
    }

    @Override // defpackage.xv1
    public final String f(int i) {
        b();
        Cursor cursorK = k();
        j(cursorK, i);
        String string = cursorK.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.xv1
    public final int getColumnCount() {
        b();
        h();
        Cursor cursor = this.m;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.xv1
    public final String getColumnName(int i) {
        b();
        h();
        Cursor cursor = this.m;
        if (cursor == null) {
            fu1.h("Required value was null.");
            return null;
        }
        j(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.xv1
    public final double getDouble(int i) {
        b();
        Cursor cursorK = k();
        j(cursorK, i);
        return cursorK.getDouble(i);
    }

    @Override // defpackage.xv1
    public final long getLong(int i) {
        b();
        Cursor cursorK = k();
        j(cursorK, i);
        return cursorK.getLong(i);
    }

    public final void h() {
        if (this.m == null) {
            qk1 qk1Var = new qk1(15, this);
            vh0 vh0Var = this.e;
            vh0Var.getClass();
            final b8 b8Var = new b8(1, qk1Var);
            Cursor cursorRawQueryWithFactory = vh0Var.e.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: uh0
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) b8Var.l(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((ma2) qk1Var.f).f, vh0.f, null);
            cursorRawQueryWithFactory.getClass();
            this.m = cursorRawQueryWithFactory;
        }
    }

    @Override // defpackage.xv1
    public final boolean isNull(int i) {
        b();
        Cursor cursorK = k();
        j(cursorK, i);
        return cursorK.isNull(i);
    }

    public final Cursor k() {
        Cursor cursor = this.m;
        if (cursor != null) {
            return cursor;
        }
        ix.R("no row", 21);
        throw null;
    }

    @Override // defpackage.xv1
    public final void o(double d) {
        b();
        d(2, 7);
        this.h[7] = 2;
        this.j[7] = d;
    }

    @Override // defpackage.xv1
    public final boolean y() {
        b();
        h();
        Cursor cursor = this.m;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        fu1.h("Required value was null.");
        return false;
    }
}
