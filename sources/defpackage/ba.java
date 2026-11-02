package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ba {
    public final XmlPullParser a;
    public int b = 0;
    public final z2 c;

    public ba(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        z2 z2Var = new z2();
        z2Var.b = new float[64];
        this.c = z2Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    public final qs a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        qs qsVar;
        if (c22.i(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    qsVar = qs.c(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    qsVar = null;
                }
                if (qsVar == null) {
                    qsVar = new qs(0, 0, null);
                }
            } else {
                qsVar = new qs(typedValue.data, 0, null);
            }
        } else {
            qsVar = new qs(0, 0, null);
        }
        c(typedArray.getChangingConfigurations());
        return qsVar;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (c22.i(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return ws0.j(this.a, baVar.a) && this.b == baVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return k3.l(sb, this.b, ')');
    }
}
