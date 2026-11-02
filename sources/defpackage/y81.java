package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class y81 extends tu {
    public final w91 b;
    public final ArrayList c;
    public final x91 d;
    public final w91 e;
    public final p2 f;

    public y81() {
        super(2);
        this.b = qx.t();
        this.c = new ArrayList();
        x91 x91Var = kx1.a;
        this.d = new x91();
        this.e = new w91();
        x7 x7Var = new x7(21, this);
        x62.b(x62.a);
        synchronized (x62.c) {
            x62.h = vq.Z(x62.h, x7Var);
        }
        this.f = new p2(x7Var);
    }

    @Override // defpackage.tu
    public final void c(k12 k12Var) {
        this.c.add(new w81(k12Var));
    }

    @Override // defpackage.tu
    public final void d() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    x81 x81Var = (x81) arrayList.get(i);
                    if (x81Var instanceof v81) {
                        qx.i(this.b, ((v81) x81Var).a, ((v81) x81Var).b);
                    } else {
                        if (!(x81Var instanceof w81)) {
                            throw new ps();
                        }
                        qx.R(this.b, ((w81) x81Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.tu
    public final void e() {
        this.f.a();
        this.c.clear();
        this.e.a();
        synchronized (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.tu
    public final ej0 j(k12 k12Var) {
        w91 w91Var = this.e;
        ej0 dVar = (ej0) w91Var.g(k12Var);
        if (dVar == null) {
            dVar = new d(27, this, k12Var);
            int iF = w91Var.f(k12Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = w91Var.c;
            Object obj = objArr[iF];
            w91Var.b[iF] = k12Var;
            objArr[iF] = dVar;
        }
        return dVar;
    }
}
