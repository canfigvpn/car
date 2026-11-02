package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class g42 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public g42() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        c42 c42Var = new c42(f4, f5, f4, f5);
        c42Var.f = this.d;
        c42Var.g = f3;
        this.g.add(new a42(c42Var));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((e42) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        d42 d42Var = new d42();
        d42Var.b = f;
        d42Var.c = f2;
        this.f.add(d42Var);
        b42 b42Var = new b42(d42Var, this.b, this.c);
        float fB = b42Var.b() + 270.0f;
        float fB2 = b42Var.b() + 270.0f;
        a(fB);
        this.g.add(b42Var);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
