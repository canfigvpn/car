package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sz1 {
    public final SharedPreferences a;
    public final s82 b;
    public final jr1 c;

    public sz1(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("mygarage_ui_prefs", 0);
        this.a = sharedPreferences;
        long j = sharedPreferences.getLong("selected_car_id", -1L);
        s82 s82VarF = j20.f(j == -1 ? null : Long.valueOf(j));
        this.b = s82VarF;
        this.c = new jr1(s82VarF);
    }

    public final void a(long j) {
        SharedPreferences sharedPreferences = this.a;
        sharedPreferences.getClass();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.getClass();
        editorEdit.putLong("selected_car_id", j);
        editorEdit.apply();
        this.b.j(null, Long.valueOf(j));
    }
}
