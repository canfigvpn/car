package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class xf0 {
    public static final xf0 b = new xf0();
    public static final xf0 c = new xf0();
    public static final xf0 d = new xf0();
    public final fa1 a = new fa1(new zf0[16]);

    public static void a(xf0 xf0Var) {
        xf0Var.getClass();
        if (xf0Var == b) {
            fu1.h("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (xf0Var == c) {
            fu1.h("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        fa1 fa1Var = xf0Var.a;
        int i = fa1Var.g;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = fa1Var.e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (zf0) objArr[i2];
            if (!((t71) obj).e.r) {
                vp0.b("visitChildren called on an unattached node");
            }
            fa1 fa1Var2 = new fa1(new t71[16]);
            t71 t71Var = ((t71) obj).e;
            t71 t71Var2 = t71Var.j;
            if (t71Var2 == null) {
                qx.j(fa1Var2, t71Var);
            } else {
                fa1Var2.b(t71Var2);
            }
            while (true) {
                int i3 = fa1Var2.g;
                if (i3 == 0) {
                    break;
                }
                t71 t71VarP = (t71) fa1Var2.k(i3 - 1);
                if ((t71VarP.h & 1024) == 0) {
                    qx.j(fa1Var2, t71VarP);
                } else {
                    while (t71VarP != null) {
                        if ((t71VarP.g & 1024) != 0) {
                            fa1 fa1Var3 = null;
                            while (t71VarP != null) {
                                if (t71VarP instanceof cg0) {
                                    if (((cg0) t71VarP).M0(7)) {
                                        break;
                                    }
                                } else if ((t71VarP.g & 1024) != 0 && (t71VarP instanceof c40)) {
                                    int i4 = 0;
                                    for (t71 t71Var3 = ((c40) t71VarP).t; t71Var3 != null; t71Var3 = t71Var3.j) {
                                        if ((t71Var3.g & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                t71VarP = t71Var3;
                                            } else {
                                                if (fa1Var3 == null) {
                                                    fa1Var3 = new fa1(new t71[16]);
                                                }
                                                if (t71VarP != null) {
                                                    fa1Var3.b(t71VarP);
                                                    t71VarP = null;
                                                }
                                                fa1Var3.b(t71Var3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                t71VarP = qx.P(fa1Var3);
                            }
                            break;
                        }
                        t71VarP = t71VarP.j;
                    }
                }
            }
        }
    }
}
