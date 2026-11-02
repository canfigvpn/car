package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class sa0 extends ex {
    public final dd d;
    public final la0 e;
    public boolean f = true;

    public sa0(dd ddVar) {
        this.d = ddVar;
        this.e = new la0(ddVar);
    }

    @Override // defpackage.ex
    public final void M(boolean z) {
        if (z) {
            U();
        }
    }

    @Override // defpackage.ex
    public final void N(boolean z) {
        this.f = z;
        U();
        dd ddVar = this.d;
        ddVar.setFilters(v(ddVar.getFilters()));
    }

    public final void U() {
        dd ddVar = this.d;
        TransformationMethod transformationMethod = ddVar.getTransformationMethod();
        if (this.f) {
            if (!(transformationMethod instanceof wa0) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new wa0(transformationMethod);
            }
        } else if (transformationMethod instanceof wa0) {
            transformationMethod = ((wa0) transformationMethod).e;
        }
        ddVar.setTransformationMethod(transformationMethod);
    }

    @Override // defpackage.ex
    public final InputFilter[] v(InputFilter[] inputFilterArr) {
        if (!this.f) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof la0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            la0 la0Var = this.e;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = la0Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == la0Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }
}
