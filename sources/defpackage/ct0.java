package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ct0 implements y61, os0 {
    public final /* synthetic */ os0 e;
    public final kw0 f;

    public ct0(os0 os0Var, kw0 kw0Var) {
        this.e = os0Var;
        this.f = kw0Var;
    }

    @Override // defpackage.m40
    public final float H(long j) {
        return this.e.H(j);
    }

    @Override // defpackage.y61
    public final x61 N(int i, int i2, Map map, ej0 ej0Var, ej0 ej0Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            vp0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new bt0(i, i2, map, ej0Var);
    }

    @Override // defpackage.m40
    public final int O(float f) {
        return this.e.O(f);
    }

    @Override // defpackage.m40
    public final long Y(long j) {
        return this.e.Y(j);
    }

    @Override // defpackage.m40
    public final float b() {
        return this.e.b();
    }

    @Override // defpackage.m40
    public final float b0(long j) {
        return this.e.b0(j);
    }

    @Override // defpackage.os0
    public final kw0 getLayoutDirection() {
        return this.f;
    }

    @Override // defpackage.m40
    public final long j0(float f) {
        return this.e.j0(f);
    }

    @Override // defpackage.m40
    public final float l() {
        return this.e.l();
    }

    @Override // defpackage.m40
    public final float n0(int i) {
        return this.e.n0(i);
    }

    @Override // defpackage.m40
    public final float q0(float f) {
        return this.e.q0(f);
    }

    @Override // defpackage.os0
    public final boolean r() {
        return this.e.r();
    }

    @Override // defpackage.m40
    public final long v(float f) {
        return this.e.v(f);
    }

    @Override // defpackage.m40
    public final long w(long j) {
        return this.e.w(j);
    }

    @Override // defpackage.m40
    public final float x(float f) {
        return this.e.x(f);
    }
}
