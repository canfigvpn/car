package defpackage;

import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class jb2 {
    public static int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (int) Math.floorDiv(jCurrentTimeMillis + ((long) TimeZone.getDefault().getOffset(jCurrentTimeMillis)), 86400000L);
    }
}
