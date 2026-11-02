package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xa2 extends y71 {
    public final Object a;
    public final Object b;
    public final PointerInputEventHandler c;

    public xa2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.a = obj;
        this.b = obj2;
        this.c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa2)) {
            return false;
        }
        xa2 xa2Var = (xa2) obj;
        return ws0.j(this.a, xa2Var.a) && ws0.j(this.b, xa2Var.b) && this.c == xa2Var.c;
    }

    @Override // defpackage.y71
    public final t71 f() {
        return new cb2(this.a, this.b, this.c);
    }

    @Override // defpackage.y71
    public final void g(t71 t71Var) {
        cb2 cb2Var = (cb2) t71Var;
        Object obj = cb2Var.s;
        Object obj2 = this.a;
        boolean z = !ws0.j(obj, obj2);
        cb2Var.s = obj2;
        Object obj3 = cb2Var.t;
        Object obj4 = this.b;
        if (!ws0.j(obj3, obj4)) {
            z = true;
        }
        cb2Var.t = obj4;
        Class<?> cls = cb2Var.u.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.c;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            cb2Var.H0();
        }
        cb2Var.u = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return this.c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
