package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ls1 implements Serializable {
    public final Pattern e;

    public ls1(String str, int i) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this.e = patternCompile;
    }

    public final ud a(String str) {
        str.getClass();
        Matcher matcher = this.e.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new ud(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String string = this.e.toString();
        string.getClass();
        return string;
    }

    public ls1(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.e = patternCompile;
    }
}
