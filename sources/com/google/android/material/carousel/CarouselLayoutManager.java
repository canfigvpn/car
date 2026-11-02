package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import defpackage.ho;
import defpackage.k3;
import defpackage.qj;
import defpackage.vv;
import defpackage.zq1;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends vv {
    public ho d;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zq1.b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            T(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void T(int i) {
        ho hoVar;
        if (i != 0 && i != 1) {
            qj.r(k3.i("invalid orientation:", i));
            return;
        }
        ho hoVar2 = this.d;
        if (hoVar2 == null || i != hoVar2.a) {
            if (i == 0) {
                hoVar = new ho(0);
            } else {
                if (i != 1) {
                    qj.r("invalid orientation");
                    return;
                }
                hoVar = new ho(1);
            }
            this.d = hoVar;
        }
    }

    public CarouselLayoutManager() {
        Paint paint = new Paint();
        Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
        T(0);
    }
}
