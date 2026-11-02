package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ko1 implements xv1 {
    public final xv1 e;
    public final long f;
    public final /* synthetic */ qo1 g;

    public ko1(qo1 qo1Var, xv1 xv1Var) {
        xv1Var.getClass();
        this.g = qo1Var;
        this.e = xv1Var;
        this.f = p12.c();
    }

    @Override // defpackage.xv1
    public final void D() {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            this.e.D();
        } else {
            ix.R("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.xv1
    public final void a(int i) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            this.e.a(i);
        } else {
            ix.R("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.xv1
    public final void c(int i, long j) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            this.e.c(i, j);
        } else {
            ix.R("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            this.e.close();
        } else {
            ix.R("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.xv1
    public final void e(String str, int i) {
        str.getClass();
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            this.e.e(str, i);
        } else {
            ix.R("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.xv1
    public final String f(int i) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            return this.e.f(i);
        }
        ix.R("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.xv1
    public final int getColumnCount() {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            return this.e.getColumnCount();
        }
        ix.R("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.xv1
    public final String getColumnName(int i) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            return this.e.getColumnName(i);
        }
        ix.R("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.xv1
    public final double getDouble(int i) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            return this.e.getDouble(i);
        }
        ix.R("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.xv1
    public final long getLong(int i) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            return this.e.getLong(i);
        }
        ix.R("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.xv1
    public final boolean isNull(int i) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            return this.e.isNull(i);
        }
        ix.R("Attempted to use statement on a different thread", 21);
        throw null;
    }

    @Override // defpackage.xv1
    public final void o(double d) {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            this.e.o(d);
        } else {
            ix.R("Attempted to use statement on a different thread", 21);
            throw null;
        }
    }

    @Override // defpackage.xv1
    public final boolean y() {
        if (this.g.e.get()) {
            ix.R("Statement is recycled", 21);
            throw null;
        }
        if (this.f == p12.c()) {
            return this.e.y();
        }
        ix.R("Attempted to use statement on a different thread", 21);
        throw null;
    }
}
