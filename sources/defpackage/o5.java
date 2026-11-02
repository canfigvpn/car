package defpackage;

import android.view.ScrollCaptureSession;
import android.view.View;
import android.view.translation.ViewTranslationResponse;
import android.window.SplashScreenView;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o5 {
    public static /* bridge */ /* synthetic */ ScrollCaptureSession g(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ViewTranslationResponse l(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static /* bridge */ /* synthetic */ SplashScreenView n(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean x(View view) {
        return view instanceof SplashScreenView;
    }
}
