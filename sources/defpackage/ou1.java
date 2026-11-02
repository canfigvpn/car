package defpackage;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class ou1 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ou1);
    }

    public final int hashCode() {
        return Float.hashCode(0.1f) + k3.a(0.08f, k3.a(0.1f, Float.hashCode(0.16f) * 31, 31), 31);
    }

    public final String toString() {
        return "RippleAlpha(draggedAlpha=0.16, focusedAlpha=0.1, hoveredAlpha=0.08, pressedAlpha=0.1)";
    }
}
