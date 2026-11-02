package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class m20 {
    public Parcel a;

    public long a() {
        int i = dr.h;
        long j = this.a.readLong();
        long j2 = 63 & j;
        return j2 < 16 ? j : (j & (-64)) | (j2 + 1);
    }

    public long b() {
        long j;
        Parcel parcel = this.a;
        byte b = parcel.readByte();
        if (b == 1) {
            j = 4294967296L;
        } else {
            j = b == 2 ? 8589934592L : 0L;
        }
        return zf2.a(j, 0L) ? yf2.c : r02.o(parcel.readFloat(), j);
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long jB = yf2.b(j);
        byte b = 0;
        if (!zf2.a(jB, 0L)) {
            if (zf2.a(jB, 4294967296L)) {
                b = 1;
            } else if (zf2.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        c(b);
        if (zf2.a(yf2.b(j), 0L)) {
            return;
        }
        d(yf2.c(j));
    }
}
