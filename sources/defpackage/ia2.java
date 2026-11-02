package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public interface ia2 extends Closeable {
    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);

    vh0 z();
}
