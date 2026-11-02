package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class iq1 implements jq1, kz, sx1, r42, ty, pm2 {
    public static iq1 f;
    public final /* synthetic */ int e;

    public iq1(h8 h8Var) {
        this.e = 21;
    }

    @Override // defpackage.r42
    public pe0 c(ea2 ea2Var) {
        switch (this.e) {
            case 13:
                return new ue0(0, p42.e);
            default:
                return new ue0(2, new cv1(4, null, ea2Var));
        }
    }

    public boolean d(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.jq1
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.jq1
    public void i(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // defpackage.pm2
    public int k() {
        return 0;
    }

    @Override // defpackage.pm2
    public int o() {
        return 0;
    }

    @Override // defpackage.nm2
    public tb p(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        return j < 0 ? tbVar : tbVar2;
    }

    public String toString() {
        switch (this.e) {
            case 6:
                int iHashCode = hashCode();
                j20.j(16);
                String string = Integer.toString(iHashCode, 16);
                string.getClass();
                return "CreationExtras.Key@" + string + "<" + js1.a(tw1.class).c() + ">";
            case 7:
                int iHashCode2 = hashCode();
                j20.j(16);
                String string2 = Integer.toString(iHashCode2, 16);
                string2.getClass();
                return "CreationExtras.Key@" + string2 + "<" + js1.a(co2.class).c() + ">";
            case 8:
                int iHashCode3 = hashCode();
                j20.j(16);
                String string3 = Integer.toString(iHashCode3, 16);
                string3.getClass();
                return "CreationExtras.Key@" + string3 + "<" + js1.a(Bundle.class).c() + ">";
            case 13:
                return "SharingStarted.Eagerly";
            case 14:
                return "SharingStarted.Lazily";
            case 16:
                return "ReusedSlotId";
            case 26:
                int iHashCode4 = hashCode();
                j20.j(16);
                String string4 = Integer.toString(iHashCode4, 16);
                string4.getClass();
                return "CreationExtras.Key@" + string4 + "<" + js1.a(Application.class).c() + ">";
            case 27:
                int iHashCode5 = hashCode();
                j20.j(16);
                String string5 = Integer.toString(iHashCode5, 16);
                string5.getClass();
                return "CreationExtras.Key@" + string5 + "<" + js1.a(String.class).c() + ">";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ iq1(int i) {
        this.e = i;
    }

    @Override // defpackage.nm2
    public tb l(long j, tb tbVar, tb tbVar2, tb tbVar3) {
        return tbVar3;
    }

    @Override // defpackage.sx1
    public void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override // defpackage.sx1
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }
}
