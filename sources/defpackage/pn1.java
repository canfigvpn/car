package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class pn1 {
    public final List a;
    public final dq0 b;
    public final int c;
    public final int d;
    public final int e;
    public int f;

    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    public pn1(List list, dq0 dq0Var) {
        MotionEvent motionEventA;
        this.a = list;
        this.b = dq0Var;
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        this.c = (i < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            boolean z = i >= 29 && motionEventA4.getClassification() == 3;
            boolean z2 = i >= 29 && motionEventA4.getClassification() == 5;
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                if (z) {
                                    i2 = 10;
                                } else if (!z2) {
                                    i2 = 1;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 6:
                                if (z) {
                                    i2 = 12;
                                } else if (!z2) {
                                    i2 = 2;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 7:
                                if (z) {
                                    i2 = 11;
                                } else if (!z2) {
                                    i2 = 3;
                                } else {
                                    i2 = 8;
                                }
                                break;
                            case 8:
                                i2 = 6;
                                break;
                            case 9:
                                i2 = 4;
                                break;
                            case 10:
                                i2 = 5;
                                break;
                        }
                    } else if (z) {
                        i2 = 11;
                    } else if (!z2) {
                        i2 = 8;
                    } else {
                        i2 = 3;
                    }
                } else if (z) {
                    i2 = 12;
                } else if (z2) {
                    i2 = 9;
                } else {
                    i2 = 2;
                }
            } else if (z) {
                i2 = 10;
            } else if (z2) {
                i2 = 7;
            } else {
                i2 = 1;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i2 < size) {
                    wn1 wn1Var = (wn1) list.get(i2);
                    if (sv.q(wn1Var)) {
                        i2 = 2;
                    } else if (sv.o(wn1Var)) {
                        i2 = 1;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = 3;
                }
            }
        }
        this.f = i2;
    }

    public final MotionEvent a() {
        dq0 dq0Var = this.b;
        if (dq0Var != null) {
            return (MotionEvent) ((dq0) dq0Var.g).g;
        }
        return null;
    }
}
