package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xu0 implements s12 {
    public static final xu0 b = new xu0();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ am0 a;

    public xu0() {
        g92 g92Var = g92.a;
        lu0 lu0Var = lu0.a;
        s12 s12VarC = g92Var.c();
        s12 s12VarC2 = lu0Var.c();
        s12VarC.getClass();
        s12VarC2.getClass();
        this.a = new am0("kotlin.collections.LinkedHashMap", s12VarC, s12VarC2);
    }

    @Override // defpackage.s12
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.s12
    public final String b() {
        return c;
    }

    @Override // defpackage.s12
    public final y12 c() {
        return q92.d;
    }

    @Override // defpackage.s12
    public final int d() {
        return 2;
    }

    @Override // defpackage.s12
    public final String e(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.s12
    public final boolean f() {
        return false;
    }

    @Override // defpackage.s12
    public final List getAnnotations() {
        return cb0.e;
    }

    @Override // defpackage.s12
    public final boolean h() {
        return false;
    }

    @Override // defpackage.s12
    public final List i(int i) {
        this.a.i(i);
        return cb0.e;
    }

    @Override // defpackage.s12
    public final s12 j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.s12
    public final boolean k(int i) {
        this.a.k(i);
        return false;
    }
}
