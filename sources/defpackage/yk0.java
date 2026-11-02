package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class yk0 extends rw {
    public final BreakIterator e;

    public yk0(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.e = characterInstance;
    }

    @Override // defpackage.rw
    public final int G(int i) {
        return this.e.following(i);
    }

    @Override // defpackage.rw
    public final int K(int i) {
        return this.e.preceding(i);
    }
}
