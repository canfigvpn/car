package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class vk {
    public static final vk e;
    public static final vk f;
    public static final vk g;
    public static final /* synthetic */ vk[] h;

    static {
        vk vkVar = new vk("SUSPEND", 0);
        e = vkVar;
        vk vkVar2 = new vk("DROP_OLDEST", 1);
        f = vkVar2;
        vk vkVar3 = new vk("DROP_LATEST", 2);
        g = vkVar3;
        h = new vk[]{vkVar, vkVar2, vkVar3};
    }

    public static vk valueOf(String str) {
        return (vk) Enum.valueOf(vk.class, str);
    }

    public static vk[] values() {
        return (vk[]) h.clone();
    }
}
