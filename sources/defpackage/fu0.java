package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class fu0 extends sv0 {
    public final fc1 n0;
    public final iq1 o0;

    public fu0(fc1 fc1Var, yt0 yt0Var) {
        this.n0 = fc1Var;
        this.o0 = yt0Var.b;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final long a() {
        fc1 fc1Var = this.n0;
        String strJ = fc1Var.j();
        try {
            strJ.getClass();
            vk2 vk2VarS = r02.s(strJ);
            if (vk2VarS != null) {
                return vk2VarS.e;
            }
            o92.w(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            fc1.l(fc1Var, "Failed to parse type 'ULong' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.jv
    public final int h(s12 s12Var) {
        s12Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.sv0, defpackage.n20
    public final int n() {
        fc1 fc1Var = this.n0;
        String strJ = fc1Var.j();
        try {
            strJ.getClass();
            qk2 qk2VarR = r02.r(strJ);
            if (qk2VarR != null) {
                return qk2VarR.e;
            }
            o92.w(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            fc1.l(fc1Var, "Failed to parse type 'UInt' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.jv
    public final iq1 q() {
        return this.o0;
    }

    @Override // defpackage.sv0, defpackage.n20
    public final byte s() {
        lk2 lk2Var;
        fc1 fc1Var = this.n0;
        String strJ = fc1Var.j();
        try {
            strJ.getClass();
            qk2 qk2VarR = r02.r(strJ);
            if (qk2VarR != null) {
                int i = qk2VarR.e;
                lk2Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new lk2((byte) i);
            }
            if (lk2Var != null) {
                return lk2Var.e;
            }
            o92.w(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            fc1.l(fc1Var, "Failed to parse type 'UByte' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.sv0, defpackage.n20
    public final short w() {
        bl2 bl2Var;
        fc1 fc1Var = this.n0;
        String strJ = fc1Var.j();
        try {
            strJ.getClass();
            qk2 qk2VarR = r02.r(strJ);
            if (qk2VarR != null) {
                int i = qk2VarR.e;
                bl2Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new bl2((short) i);
            }
            if (bl2Var != null) {
                return bl2Var.e;
            }
            o92.w(strJ);
            throw null;
        } catch (IllegalArgumentException unused) {
            fc1.l(fc1Var, "Failed to parse type 'UShort' for input '" + strJ + '\'', 0, null, 6);
            throw null;
        }
    }
}
