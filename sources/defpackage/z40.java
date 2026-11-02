package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class z40 extends RuntimeException {
    public final su e;

    public z40(su suVar) {
        this.e = suVar;
        if (suVar.b) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = suVar.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            uu uuVar = (uu) list.get(i);
            if (!ve.t0(iArr, uuVar.a)) {
                if (uuVar.a == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((uu) list.get(i3)).a == 1000) {
                        break;
                    } else {
                        ar.M(arrayList);
                    }
                } else {
                    arrayList.add(uuVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((uu) arrayList.get(i4)).a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        su suVar = this.e;
        if (!suVar.b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        z21 z21VarL = vs0.l();
        List list = suVar.a;
        list.getClass();
        du1 du1Var = new du1(list);
        int iA = du1Var.a();
        for (int i = 0; i < iA; i++) {
            ((uu) du1Var.get(i)).getClass();
        }
        z21 z21VarI = vs0.i(z21VarL);
        z21VarI.getClass();
        du1 du1Var2 = new du1(z21VarI);
        int iA2 = du1Var2.a();
        for (int i2 = 0; i2 < iA2; i2++) {
            String str = (String) du1Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
