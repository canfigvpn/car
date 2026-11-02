package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class zj2 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final e4 b;
    public volatile int c = 0;

    public zj2(e4 e4Var, int i) {
        this.b = e4Var;
        this.a = i;
    }

    public final int a(int i) {
        j71 j71VarB = b();
        int iA = j71VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) j71VarB.h;
        int i2 = iA + j71VarB.e;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final j71 b() {
        ThreadLocal threadLocal = d;
        j71 j71Var = (j71) threadLocal.get();
        if (j71Var == null) {
            j71Var = new j71();
            threadLocal.set(j71Var);
        }
        k71 k71Var = (k71) this.b.e;
        int iA = k71Var.a(6);
        if (iA != 0) {
            int i = iA + k71Var.e;
            int i2 = (this.a * 4) + ((ByteBuffer) k71Var.h).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) k71Var.h).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) k71Var.h;
            j71Var.h = byteBuffer;
            if (byteBuffer != null) {
                j71Var.e = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                j71Var.f = i4;
                j71Var.g = ((ByteBuffer) j71Var.h).getShort(i4);
                return j71Var;
            }
            j71Var.e = 0;
            j71Var.f = 0;
            j71Var.g = 0;
        }
        return j71Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        j71 j71VarB = b();
        int iA = j71VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) j71VarB.h).getInt(iA + j71VarB.e) : 0));
        sb.append(", codepoints:");
        j71 j71VarB2 = b();
        int iA2 = j71VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + j71VarB2.e;
            i = ((ByteBuffer) j71VarB2.h).getInt(((ByteBuffer) j71VarB2.h).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
