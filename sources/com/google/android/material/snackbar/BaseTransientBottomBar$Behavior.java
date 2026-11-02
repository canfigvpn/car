package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public BaseTransientBottomBar$Behavior() {
        Math.min(Math.max(0.0f, 0.1f), 1.0f);
        Math.min(Math.max(0.0f, 0.6f), 1.0f);
    }
}
