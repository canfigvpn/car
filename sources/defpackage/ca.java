package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ca implements on2 {
    public final ViewConfiguration a;

    public ca(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.on2
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.on2
    public final long b() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.on2
    public final long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.on2
    public final float d() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.on2
    public final float e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // defpackage.on2
    public final float f() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
