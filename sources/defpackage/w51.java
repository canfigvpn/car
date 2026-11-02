package defpackage;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w51 {
    public int e;
    public int f;
    public int g;
    public Object h;

    public w51() {
        if (iq1.f == null) {
            iq1.f = new iq1(24);
        }
    }

    public int a(int i) {
        if (i < this.g) {
            return ((ByteBuffer) this.h).getShort(this.f + i);
        }
        return 0;
    }

    public void b() {
        if (((x51) this.h).l != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        while (true) {
            int i = this.e;
            x51 x51Var = (x51) this.h;
            if (i >= x51Var.j || x51Var.g[i] >= 0) {
                return;
            } else {
                this.e = i + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.e < ((x51) this.h).j;
    }

    public void remove() {
        x51 x51Var = (x51) this.h;
        b();
        if (this.f == -1) {
            fu1.h("Call next() before removing element from the iterator.");
            return;
        }
        x51Var.c();
        x51Var.k(this.f);
        this.f = -1;
        this.g = x51Var.l;
    }
}
