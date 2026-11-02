package defpackage;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import ir.alirezaivaz.mygarage.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class f5 extends ao2 {
    public final /* synthetic */ k5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(k5 k5Var) {
        super(1, (byte) 0);
        this.h = k5Var;
    }

    @Override // defpackage.ao2
    public final void g(int i, k1 k1Var, String str, Bundle bundle) {
        this.h.e(i, k1Var, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x0210  */
    /* JADX WARN: Code duplicated, block: B:109:0x021a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0229  */
    /* JADX WARN: Code duplicated, block: B:114:0x0245  */
    /* JADX WARN: Code duplicated, block: B:116:0x024e  */
    /* JADX WARN: Code duplicated, block: B:119:0x029e  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:138:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:143:0x0301  */
    /* JADX WARN: Code duplicated, block: B:146:0x0312  */
    /* JADX WARN: Code duplicated, block: B:149:0x034a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0355  */
    /* JADX WARN: Code duplicated, block: B:154:0x0365  */
    /* JADX WARN: Code duplicated, block: B:160:0x0383  */
    /* JADX WARN: Code duplicated, block: B:163:0x038b  */
    /* JADX WARN: Code duplicated, block: B:165:0x039d A[LOOP:3: B:162:0x0389->B:165:0x039d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:181:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:183:0x0408  */
    /* JADX WARN: Code duplicated, block: B:187:0x0422  */
    /* JADX WARN: Code duplicated, block: B:189:0x0432  */
    /* JADX WARN: Code duplicated, block: B:197:0x0457  */
    /* JADX WARN: Code duplicated, block: B:199:0x0465  */
    /* JADX WARN: Code duplicated, block: B:201:0x046c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0480  */
    /* JADX WARN: Code duplicated, block: B:205:0x0492  */
    /* JADX WARN: Code duplicated, block: B:207:0x049c  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:215:0x04db  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:220:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:223:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:224:0x0502  */
    /* JADX WARN: Code duplicated, block: B:227:0x051a  */
    /* JADX WARN: Code duplicated, block: B:230:0x0520  */
    /* JADX WARN: Code duplicated, block: B:232:0x0524  */
    /* JADX WARN: Code duplicated, block: B:233:0x0529  */
    /* JADX WARN: Code duplicated, block: B:235:0x052d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0539  */
    /* JADX WARN: Code duplicated, block: B:241:0x053f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0545  */
    /* JADX WARN: Code duplicated, block: B:244:0x0549  */
    /* JADX WARN: Code duplicated, block: B:246:0x0550  */
    /* JADX WARN: Code duplicated, block: B:249:0x055a  */
    /* JADX WARN: Code duplicated, block: B:254:0x056c  */
    /* JADX WARN: Code duplicated, block: B:256:0x0574  */
    /* JADX WARN: Code duplicated, block: B:259:0x057a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:260:0x0581  */
    /* JADX WARN: Code duplicated, block: B:264:0x058e  */
    /* JADX WARN: Code duplicated, block: B:267:0x0594  */
    /* JADX WARN: Code duplicated, block: B:269:0x0597  */
    /* JADX WARN: Code duplicated, block: B:272:0x05ae A[LOOP:8: B:268:0x0595->B:272:0x05ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:278:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:281:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:283:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:285:0x05da  */
    /* JADX WARN: Code duplicated, block: B:288:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:291:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:293:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:294:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:297:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:299:0x0609  */
    /* JADX WARN: Code duplicated, block: B:300:0x060d  */
    /* JADX WARN: Code duplicated, block: B:303:0x0625  */
    /* JADX WARN: Code duplicated, block: B:306:0x0638  */
    /* JADX WARN: Code duplicated, block: B:309:0x063e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0643  */
    /* JADX WARN: Code duplicated, block: B:313:0x065d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0670  */
    /* JADX WARN: Code duplicated, block: B:317:0x067a  */
    /* JADX WARN: Code duplicated, block: B:318:0x0681  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:321:0x0692  */
    /* JADX WARN: Code duplicated, block: B:322:0x069a  */
    /* JADX WARN: Code duplicated, block: B:325:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:328:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:331:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:333:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:334:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:340:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:343:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:345:0x06de  */
    /* JADX WARN: Code duplicated, block: B:349:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:352:0x06ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:359:0x06fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:363:0x0701  */
    /* JADX WARN: Code duplicated, block: B:366:0x070b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:371:0x072b  */
    /* JADX WARN: Code duplicated, block: B:373:0x0735  */
    /* JADX WARN: Code duplicated, block: B:376:0x074b  */
    /* JADX WARN: Code duplicated, block: B:379:0x075d  */
    /* JADX WARN: Code duplicated, block: B:381:0x0767  */
    /* JADX WARN: Code duplicated, block: B:384:0x077d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0794  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:390:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:394:0x07be  */
    /* JADX WARN: Code duplicated, block: B:395:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:397:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:400:0x07db  */
    /* JADX WARN: Code duplicated, block: B:405:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:406:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:409:0x0820  */
    /* JADX WARN: Code duplicated, block: B:411:0x0826  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:420:0x0847  */
    /* JADX WARN: Code duplicated, block: B:422:0x084d  */
    /* JADX WARN: Code duplicated, block: B:430:0x0866  */
    /* JADX WARN: Code duplicated, block: B:432:0x086c  */
    /* JADX WARN: Code duplicated, block: B:434:0x0874  */
    /* JADX WARN: Code duplicated, block: B:436:0x087b  */
    /* JADX WARN: Code duplicated, block: B:439:0x087f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:442:0x088e  */
    /* JADX WARN: Code duplicated, block: B:444:0x089e  */
    /* JADX WARN: Code duplicated, block: B:452:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:455:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:458:0x08df  */
    /* JADX WARN: Code duplicated, block: B:460:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:463:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:465:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:466:0x0903  */
    /* JADX WARN: Code duplicated, block: B:469:0x090e  */
    /* JADX WARN: Code duplicated, block: B:470:0x0918  */
    /* JADX WARN: Code duplicated, block: B:473:0x091f  */
    /* JADX WARN: Code duplicated, block: B:477:0x0929  */
    /* JADX WARN: Code duplicated, block: B:478:0x092c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:481:0x0932  */
    /* JADX WARN: Code duplicated, block: B:485:0x093c  */
    /* JADX WARN: Code duplicated, block: B:488:0x0941  */
    /* JADX WARN: Code duplicated, block: B:489:0x0947  */
    /* JADX WARN: Code duplicated, block: B:492:0x094f  */
    /* JADX WARN: Code duplicated, block: B:497:0x0974  */
    /* JADX WARN: Code duplicated, block: B:500:0x097a  */
    /* JADX WARN: Code duplicated, block: B:501:0x0987  */
    /* JADX WARN: Code duplicated, block: B:503:0x099a  */
    /* JADX WARN: Code duplicated, block: B:505:0x099e  */
    /* JADX WARN: Code duplicated, block: B:507:0x09aa  */
    /* JADX WARN: Code duplicated, block: B:509:0x09be  */
    /* JADX WARN: Code duplicated, block: B:50:0x0102  */
    /* JADX WARN: Code duplicated, block: B:513:0x09ca  */
    /* JADX WARN: Code duplicated, block: B:515:0x09d0  */
    /* JADX WARN: Code duplicated, block: B:516:0x09d2  */
    /* JADX WARN: Code duplicated, block: B:518:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:520:0x09de  */
    /* JADX WARN: Code duplicated, block: B:524:0x09fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:527:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:531:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:537:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:540:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:542:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:544:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a60  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:552:0x0a71  */
    /* JADX WARN: Code duplicated, block: B:553:0x0a74  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a83 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:560:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a97  */
    /* JADX WARN: Code duplicated, block: B:564:0x0aa5  */
    /* JADX WARN: Code duplicated, block: B:567:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:570:0x0ac1  */
    /* JADX WARN: Code duplicated, block: B:573:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:575:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:578:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:581:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:584:0x0afe  */
    /* JADX WARN: Code duplicated, block: B:585:0x0b02  */
    /* JADX WARN: Code duplicated, block: B:588:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:590:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:593:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:596:0x0b47  */
    /* JADX WARN: Code duplicated, block: B:599:0x0b5b  */
    /* JADX WARN: Code duplicated, block: B:601:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:603:0x0b7a  */
    /* JADX WARN: Code duplicated, block: B:606:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:607:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:609:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:611:0x0b9f  */
    /* JADX WARN: Code duplicated, block: B:613:0x0baa  */
    /* JADX WARN: Code duplicated, block: B:614:0x0bbd  */
    /* JADX WARN: Code duplicated, block: B:618:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:621:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:623:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:625:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:627:0x0bf2  */
    /* JADX WARN: Code duplicated, block: B:629:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:633:0x0c10  */
    /* JADX WARN: Code duplicated, block: B:635:0x0c1b  */
    /* JADX WARN: Code duplicated, block: B:639:0x0c40  */
    /* JADX WARN: Code duplicated, block: B:640:0x0c44  */
    /* JADX WARN: Code duplicated, block: B:643:0x0c51  */
    /* JADX WARN: Code duplicated, block: B:644:0x0c65  */
    /* JADX WARN: Code duplicated, block: B:647:0x0c6f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:650:0x0c80  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    /* JADX WARN: Code duplicated, block: B:660:0x0c94  */
    /* JADX WARN: Code duplicated, block: B:663:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:0x031e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:682:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0157  */
    /* JADX WARN: Code duplicated, block: B:691:0x05b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0862 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x085d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:703:0x09c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0168  */
    /* JADX WARN: Code duplicated, block: B:75:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:635:0x0c1b, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:660:0x0c94, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v88, types: [cb0] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.ArrayList] */
    @Override // defpackage.ao2
    public final k1 i(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        k1 k1Var;
        int i2;
        p02 p02VarL;
        Integer numValueOf;
        int iIntValue;
        b91 b91Var;
        v72 v72Var;
        Resources resources;
        i02 i02Var;
        w91 w91Var;
        Object objG;
        wu1 wu1Var;
        AccessibilityManager accessibilityManager;
        v72 v72Var2;
        boolean zI;
        List listJ;
        int size;
        boolean z;
        int i3;
        int i4;
        int i5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        yb ybVarC;
        b91 b91Var2;
        p02 p02Var;
        i02 i02Var2;
        wu1 wu1Var2;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        k1 k1Var2;
        w91 w91Var2;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        y02 y02Var;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        p02 p02Var2;
        String strB;
        Object objG2;
        ch2 ch2Var;
        Object objG3;
        Boolean bool;
        wu1 wu1Var3;
        int i6;
        i02 i02Var3;
        Object objG4;
        List list;
        String str;
        Object objG5;
        String str2;
        Object objG6;
        k1 k1Var3;
        Object objG7;
        int i7;
        Object objG8;
        Boolean bool2;
        Object objG9;
        Integer num;
        int iIntValue2;
        y02 y02Var2;
        k5 k5Var;
        boolean z2;
        p02 p02VarL2;
        Object objG10;
        g31 g31Var;
        Object objG11;
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        String strO;
        int i8;
        int i9;
        oq1 oq1Var;
        Resources resources2;
        Object objG12;
        sq sqVar;
        ArrayList arrayList;
        Object objG13;
        boolean zI2;
        int size2;
        int size3;
        List listJ2;
        int size4;
        int i10;
        p02 p02Var3;
        nx1 nx1Var;
        nx1 nx1Var2;
        CharSequence charSequence;
        boolean zE;
        int iD;
        e5 e5Var;
        int iD2;
        String str3;
        p0 p0Var4;
        p0 p0Var5;
        p0 p0Var6;
        y02 y02Var3;
        List list2;
        int size5;
        c91 c91Var;
        v72 v72Var3;
        boolean z3;
        l91 l91Var;
        int[] iArr;
        int i11;
        int[] iArrCopyOf;
        int i12;
        int i13;
        l91 l91Var2;
        ArrayList arrayList2;
        int i14;
        Object objG14;
        Object objG15;
        Object objG16;
        boolean zU;
        kw0 kw0Var;
        ax0 ax0Var;
        f1 f1Var;
        f1 f1Var2;
        Object objG17;
        p0 p0Var7;
        float f;
        float f2;
        y02 y02Var4;
        float f3;
        float f4;
        ArrayList arrayList3;
        CharSequence charSequenceE;
        p0 p0Var8;
        String str4;
        List list3;
        ax0 ax0VarU;
        i02 i02VarW;
        boolean zJ;
        Object objG18;
        i02 i02VarW2;
        p0 p0Var9;
        p0 p0Var10;
        p0 p0Var11;
        p0 p0Var12;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objG19;
        boolean z4;
        boolean z5;
        int i15;
        int i16;
        int iD3;
        p02 p02VarL3;
        boolean zBooleanValue;
        i02 i02Var4;
        y02 y02Var5;
        boolean zBooleanValue2;
        Object objG20;
        m40 density;
        ud udVar;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        ?? arrayList6;
        int size6;
        int i17;
        ?? arrayList7;
        int size7;
        int i18;
        int size8;
        int i19;
        xb xbVar;
        int i20;
        Object obj;
        int i21;
        w21 w21Var;
        WeakHashMap weakHashMap;
        Object duVar;
        xb xbVar2;
        v21 v21Var;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        int size9;
        int i22;
        xb xbVar3;
        xl2 xl2Var;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size10;
        int i23;
        xb xbVar4;
        xm2 xm2Var;
        int i24;
        int i25;
        int size11;
        int i26;
        xb xbVar5;
        int size12;
        int i27;
        int i28;
        int i29;
        long jB;
        lh0 lh0Var;
        hh0 hh0Var;
        we2 we2Var;
        long j;
        ed2 ed2Var;
        ve2 srVar;
        long jB2;
        SpannableString spannableString4;
        lh0 lh0Var2;
        int i30;
        int i31;
        int i32;
        p02 p02Var4;
        gr0 gr0VarN;
        int i33;
        s02 s02Var;
        boolean zJ2;
        p02 p02Var5;
        int i34;
        int i35;
        String strB2;
        Object parentForAccessibility;
        View view;
        k5 k5Var2 = this.h;
        AccessibilityManager accessibilityManager2 = k5Var2.k;
        e5 e5Var2 = k5Var2.h;
        if (e5Var2.getComposeViewContext().c.h().h == r11.e) {
            if (accessibilityManager2.isEnabled()) {
                k1Var3 = null;
            } else {
                k1Var3 = new k1(AccessibilityNodeInfo.obtain());
            }
            k5Var = k5Var2;
            i7 = i;
        } else {
            s02 s02Var2 = (s02) k5Var2.n().b(i);
            if (s02Var2 == null) {
                if (accessibilityManager2.isEnabled()) {
                    k1Var3 = null;
                } else {
                    k1Var3 = new k1(AccessibilityNodeInfo.obtain());
                }
                k5Var = k5Var2;
                i7 = i;
            } else {
                p02 p02Var6 = s02Var2.a;
                i02 i02VarK = p02Var6.k();
                ax0 ax0Var2 = p02Var6.c;
                Object objG21 = i02VarK.e.g(u02.o);
                if (objG21 == null) {
                    objG21 = null;
                }
                boolean zJ3 = ws0.j(objG21, Boolean.TRUE);
                if (!zJ3) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    k1Var = new k1(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        t0.k(accessibilityNodeInfoObtain, zJ3);
                    } else {
                        k1Var.f(64, zJ3);
                    }
                    if (i == -1) {
                        parentForAccessibility = e5Var2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        k1Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        p02VarL = p02Var6.l();
                        if (p02VarL != null) {
                            numValueOf = Integer.valueOf(p02VarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            vp0.c("semanticsNode " + i + " has null parent");
                            qj.e();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == e5Var2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        k1Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(e5Var2, iIntValue);
                    }
                    k1Var.c = i;
                    accessibilityNodeInfoObtain.setSource(e5Var2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(k5Var2.f(s02Var2));
                    b91Var = k5Var2.N;
                    v72Var = k5Var2.w;
                    resources = e5Var2.getContext().getResources();
                    k1Var.g("android.view.View");
                    i02Var = p02Var6.d;
                    w91Var = i02Var.e;
                    if (w91Var.c(u02.G)) {
                        k1Var.g("android.widget.EditText");
                    }
                    if (w91Var.c(u02.C)) {
                        k1Var.g("android.widget.TextView");
                    }
                    objG = w91Var.g(u02.z);
                    if (objG == null) {
                        objG = null;
                    }
                    wu1Var = (wu1) objG;
                    if (wu1Var != null) {
                        i34 = wu1Var.a;
                        if (p02Var6.n()) {
                            accessibilityManager = accessibilityManager2;
                            i35 = 4;
                            v72Var2 = v72Var;
                            if (p02.j(4, p02Var6).isEmpty()) {
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i35 = 4;
                            v72Var2 = v72Var;
                        }
                        if (i34 == i35) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i34 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strB2 = c12.B(i34);
                            if (i34 == 5 || p02Var6.p() || i02Var.g) {
                                k1Var.g(strB2);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        v72Var2 = v72Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(e5Var2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(j20.w(p02Var6));
                    if (i2 >= 34) {
                        zI = t0.i(accessibilityManager);
                    } else {
                        zI = true;
                    }
                    listJ = p02.j(4, p02Var6);
                    size = listJ.size();
                    z = zI;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i36 = size;
                        p02Var4 = (p02) listJ.get(i4);
                        List list5 = listJ;
                        gr0VarN = k5Var2.n();
                        int i37 = i4;
                        i33 = p02Var4.f;
                        if (!gr0VarN.a(i33)) {
                            if (e5Var2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(p02Var4.c) == null) {
                                fu1.c();
                                return null;
                            }
                            if (i33 != -1) {
                                s02Var = (s02) k5Var2.n().b(i33);
                                if (s02Var != null || (p02Var5 = s02Var.a) == null) {
                                    zJ2 = false;
                                } else {
                                    Object objG22 = p02Var5.k().e.g(u02.o);
                                    if (objG22 == null) {
                                        objG22 = null;
                                    }
                                    zJ2 = ws0.j(objG22, Boolean.TRUE);
                                }
                                if (z || !zJ2) {
                                    accessibilityNodeInfoObtain.addChild(e5Var2, i33);
                                }
                                b91Var.f(i33, i3);
                                i3++;
                            }
                        }
                        i4 = i37 + 1;
                        listJ = list5;
                        size = i36;
                    }
                    i5 = k5Var2.o;
                    accessibilityNodeInfo = k1Var.a;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        k1Var.a(f1.e);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        k1Var.a(f1.d);
                    }
                    ybVarC = ws0.C(p02Var6);
                    if (ybVarC != null) {
                        e5Var2.getFontFamilyResolver();
                        density = e5Var2.getDensity();
                        udVar = k5Var2.J;
                        String str5 = ybVarC.f;
                        list4 = ybVarC.e;
                        spannableString2 = new SpannableString(str5);
                        arrayList4 = ybVarC.g;
                        if (arrayList4 != null) {
                            size12 = arrayList4.size();
                            i27 = 0;
                            while (i27 < size12) {
                                int i38 = i27;
                                xb xbVar6 = (xb) arrayList4.get(i27);
                                ArrayList arrayList8 = arrayList4;
                                r72 r72Var = (r72) xbVar6.a;
                                int i39 = size12;
                                i28 = xbVar6.b;
                                i29 = xbVar6.c;
                                b91 b91Var3 = b91Var;
                                i02 i02Var5 = i02Var;
                                wu1 wu1Var4 = wu1Var;
                                jB = r72Var.a.b();
                                p02 p02Var7 = p02Var6;
                                long j2 = r72Var.b;
                                lh0Var = r72Var.c;
                                hh0Var = r72Var.d;
                                we2Var = r72Var.j;
                                q31 q31Var = r72Var.k;
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                k1 k1Var4 = k1Var;
                                j = r72Var.l;
                                ed2Var = r72Var.m;
                                srVar = r72Var.a;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                w91 w91Var3 = w91Var;
                                jB2 = srVar.b();
                                int i40 = dr.h;
                                if (!vk2.a(jB, jB2)) {
                                    if (jB != 16) {
                                        srVar = new sr(jB);
                                    } else {
                                        srVar = ue2.a;
                                    }
                                }
                                c12.u(spannableString2, srVar.b(), i28, i29);
                                spannableString4 = spannableString2;
                                c12.w(spannableString4, j2, density, i28, i29);
                                if (lh0Var == null || hh0Var != null) {
                                    if (lh0Var == null) {
                                        lh0Var2 = lh0.i;
                                    } else {
                                        lh0Var2 = lh0Var;
                                    }
                                    if (hh0Var != null) {
                                        i30 = hh0Var.a;
                                    } else {
                                        i30 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(nj2.p(lh0Var2, i30));
                                    i31 = 33;
                                    spannableString4.setSpan(styleSpan, i28, i29, 33);
                                } else {
                                    i31 = 33;
                                }
                                if (ed2Var != null) {
                                    i32 = ed2Var.a;
                                    if ((i32 | 1) == i32) {
                                        spannableString4.setSpan(new UnderlineSpan(), i28, i29, i31);
                                    }
                                    if ((i32 | 2) == i32) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i28, i29, i31);
                                    }
                                }
                                if (we2Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(we2Var.a), i28, i29, i31);
                                }
                                c12.z(spannableString4, q31Var, i28, i29);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(ws0.V(j)), i28, i29, i31);
                                }
                                spannableString2 = spannableString4;
                                i27 = i38 + 1;
                                w91Var = w91Var3;
                                arrayList4 = arrayList8;
                                size12 = i39;
                                b91Var = b91Var3;
                                i02Var = i02Var5;
                                wu1Var = wu1Var4;
                                p02Var6 = p02Var7;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                k1Var = k1Var4;
                                accessibilityNodeInfo = accessibilityNodeInfo6;
                            }
                        }
                        b91Var2 = b91Var;
                        p02Var = p02Var6;
                        i02Var2 = i02Var;
                        wu1Var2 = wu1Var;
                        AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        k1Var2 = k1Var;
                        spannableString3 = spannableString2;
                        w91Var2 = w91Var;
                        int length = str5.length();
                        arrayList5 = cb0.e;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size11 = list4.size();
                            while (i26 < size11) {
                                Object obj2 = list4.get(i26);
                                xbVar5 = (xb) obj2;
                                if (!(xbVar5.a instanceof xm2) && zb.b(0, length, xbVar5.b, xbVar5.c)) {
                                    arrayList6.add(obj2);
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size6 = arrayList6.size();
                        while (i17 < size6) {
                            xb xbVar7 = (xb) arrayList6.get(i17);
                            xm2Var = (xm2) xbVar7.a;
                            i24 = xbVar7.b;
                            i25 = xbVar7.c;
                            if (xm2Var instanceof xm2) {
                                qj.p();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(xm2Var.a).build(), i24, i25, 33);
                        }
                        int length2 = str5.length();
                        if (list4 != null) {
                            arrayList7 = new ArrayList(list4.size());
                            size10 = list4.size();
                            while (i23 < size10) {
                                Object obj3 = list4.get(i23);
                                xbVar4 = (xb) obj3;
                                if (!(xbVar4.a instanceof xl2) && zb.b(0, length2, xbVar4.b, xbVar4.c)) {
                                    arrayList7.add(obj3);
                                }
                            }
                        } else {
                            arrayList7 = arrayList5;
                        }
                        size7 = arrayList7.size();
                        while (i18 < size7) {
                            xb xbVar8 = (xb) arrayList7.get(i18);
                            xl2Var = (xl2) xbVar8.a;
                            int i41 = xbVar8.b;
                            int i42 = xbVar8.c;
                            weakHashMap3 = (WeakHashMap) udVar.b;
                            uRLSpan2 = weakHashMap3.get(xl2Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(xl2Var.a);
                                weakHashMap3.put(xl2Var, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i41, i42, 33);
                        }
                        int length3 = str5.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size9 = list4.size();
                            while (i22 < size9) {
                                Object obj4 = list4.get(i22);
                                xbVar3 = (xb) obj4;
                                if (!(xbVar3.a instanceof w21) && zb.b(0, length3, xbVar3.b, xbVar3.c)) {
                                    arrayList5.add(obj4);
                                }
                            }
                        }
                        size8 = arrayList5.size();
                        while (i19 < size8) {
                            xbVar = (xb) arrayList5.get(i19);
                            i20 = xbVar.b;
                            obj = xbVar.a;
                            i21 = xbVar.c;
                            if (i20 != i21) {
                                w21Var = (w21) obj;
                                if (w21Var instanceof v21) {
                                    obj.getClass();
                                    v21Var = (v21) obj;
                                    xbVar2 = new xb(i20, i21, v21Var);
                                    weakHashMap2 = (WeakHashMap) udVar.c;
                                    uRLSpan = weakHashMap2.get(xbVar2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(v21Var.a);
                                        weakHashMap2.put(xbVar2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i20, i21, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) udVar.d;
                                    duVar = weakHashMap.get(xbVar);
                                    if (duVar == null) {
                                        duVar = new du(w21Var);
                                        weakHashMap.put(xbVar, duVar);
                                    }
                                    spannableString3.setSpan((ClickableSpan) duVar, i20, i21, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) k5.K(spannableString3);
                        accessibilityNodeInfo3 = accessibilityNodeInfo7;
                    } else {
                        k5Var2 = k5Var2;
                        b91Var2 = b91Var;
                        p02Var = p02Var6;
                        i02Var2 = i02Var;
                        wu1Var2 = wu1Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        k1Var2 = k1Var;
                        w91Var2 = w91Var;
                        spannableString = null;
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo3.setText(spannableString);
                    y02Var = u02.M;
                    if (w91Var2.c(y02Var)) {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setContentInvalid(true);
                        objG20 = w91Var2.g(y02Var);
                        if (objG20 == null) {
                            objG20 = null;
                        }
                        accessibilityNodeInfo4.setError((CharSequence) objG20);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                    }
                    p02Var2 = p02Var;
                    strB = ws0.B(p02Var2, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        g1.h(accessibilityNodeInfo3, strB);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strB);
                    }
                    accessibilityNodeInfo4.setCheckable(ws0.A(p02Var2));
                    objG2 = w91Var2.g(u02.K);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    ch2Var = (ch2) objG2;
                    if (ch2Var != null) {
                        if (ch2Var == ch2.e) {
                            accessibilityNodeInfo3.setChecked(true);
                        } else if (ch2Var == ch2.f) {
                            accessibilityNodeInfo3.setChecked(false);
                        }
                    }
                    objG3 = w91Var2.g(u02.J);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (wu1Var2 == null) {
                            wu1Var3 = wu1Var2;
                            i6 = 4;
                        } else {
                            wu1Var3 = wu1Var2;
                            i6 = 4;
                            if (wu1Var3.a == 4) {
                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                    } else {
                        wu1Var3 = wu1Var2;
                        i6 = 4;
                    }
                    i02Var3 = i02Var2;
                    if (i02Var3.g || p02.j(i6, p02Var2).isEmpty()) {
                        objG4 = w91Var2.g(u02.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) vq.R(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    objG5 = w91Var2.g(u02.A);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    str2 = (String) objG5;
                    if (str2 != null) {
                        p02VarL3 = p02Var2;
                        while (true) {
                            if (p02VarL3 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            i02Var4 = p02VarL3.d;
                            y02Var5 = v02.a;
                            if (i02Var4.e.c(y02Var5)) {
                                zBooleanValue = ((Boolean) i02Var4.c(y02Var5)).booleanValue();
                                break;
                            }
                            p02VarL3 = p02VarL3.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo4.setViewIdResourceName(str2);
                        }
                    }
                    objG6 = w91Var2.g(u02.h);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    if (((ll2) objG6) == null) {
                        k1Var3 = k1Var2;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setHeading(true);
                        k1Var3 = k1Var2;
                    } else {
                        k1Var3 = k1Var2;
                        k1Var3.f(2, true);
                    }
                    objG7 = w91Var2.g(u02.i);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    if (((ll2) objG7) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo4.setTextEntryKey(true);
                        } else {
                            k1Var3.f(8, true);
                        }
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = b91Var2.d(p02Var2.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfo4.setDrawingOrder(iD3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo4.setPassword(w91Var2.c(u02.L));
                    objG8 = w91Var2.g(u02.O);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo4.setEditable(ws0.j(objG8, bool2));
                    objG9 = w91Var2.g(u02.P);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    num = (Integer) objG9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(ws0.r(p02Var2));
                    y02Var2 = u02.l;
                    accessibilityNodeInfo4.setFocusable(w91Var2.c(y02Var2));
                    if (accessibilityNodeInfo4.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) i02Var3.c(y02Var2)).booleanValue());
                        if (accessibilityNodeInfo4.isFocused()) {
                            accessibilityNodeInfo3.addAction(2);
                            k5Var = k5Var2;
                            k5Var.p = i7;
                        } else {
                            k5Var = k5Var2;
                            z2 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        accessibilityNodeInfo3.setVisibleToUser(j20.v(p02Var2) ^ z2);
                        if (p02Var2.n()) {
                            p02VarL2 = p02Var2.l();
                            p02VarL2.getClass();
                        } else {
                            p02VarL2 = p02Var2;
                        }
                        if (p02VarL2.m().f()) {
                            accessibilityNodeInfo3.setVisibleToUser(false);
                        }
                        objG10 = w91Var2.g(u02.k);
                        if (objG10 == null) {
                            objG10 = null;
                        }
                        g31Var = (g31) objG10;
                        if (g31Var != null) {
                            i15 = g31Var.a;
                            if (i15 == 0 && i15 == 1) {
                                i16 = 2;
                            } else {
                                i16 = 1;
                            }
                            accessibilityNodeInfo4.setLiveRegion(i16);
                        }
                        accessibilityNodeInfo3.setClickable(false);
                        objG11 = w91Var2.g(h02.b);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        p0Var = (p0) objG11;
                        if (p0Var != null) {
                            objG19 = w91Var2.g(u02.J);
                            if (objG19 == null) {
                                objG19 = null;
                            }
                            boolean zJ4 = ws0.j(objG19, bool2);
                            z4 = (wu1Var3 == null && wu1Var3.a == 4) || (wu1Var3 != null && wu1Var3.a == 3);
                            if (z4 || (z4 && !zJ4)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            accessibilityNodeInfo3.setClickable(z5);
                            if (ws0.r(p02Var2) && accessibilityNodeInfo4.isClickable()) {
                                k1Var3.a(new f1(p0Var.a, 16));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        p0Var2 = (p0) j02.o(i02Var3, h02.c);
                        if (p0Var2 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (ws0.r(p02Var2)) {
                                k1Var3.a(new f1(p0Var2.a, 32));
                            }
                        }
                        p0Var3 = (p0) j02.o(i02Var3, h02.q);
                        if (p0Var3 != null) {
                            k1Var3.a(new f1(p0Var3.a, 16384));
                        }
                        if (ws0.r(p02Var2)) {
                            p0Var9 = (p0) j02.o(i02Var3, h02.k);
                            if (p0Var9 != null) {
                                k1Var3.a(new f1(p0Var9.a, 2097152));
                            }
                            p0Var10 = (p0) j02.o(i02Var3, h02.p);
                            if (p0Var10 != null) {
                                k1Var3.a(new f1(p0Var10.a, android.R.id.accessibilityActionImeEnter));
                            }
                            p0Var11 = (p0) j02.o(i02Var3, h02.r);
                            if (p0Var11 != null) {
                                k1Var3.a(new f1(p0Var11.a, 65536));
                            }
                            p0Var12 = (p0) j02.o(i02Var3, h02.s);
                            if (p0Var12 != null && accessibilityNodeInfo4.isFocused()) {
                                primaryClipDescription = e5Var2.m5getClipboardManager().a().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    k1Var3.a(new f1(p0Var12.a, 32768));
                                }
                            }
                        }
                        strO = k5.o(p02Var2);
                        if (strO != null && strO.length() != 0) {
                            accessibilityNodeInfo4.setTextSelection(k5Var.m(p02Var2), k5Var.l(p02Var2));
                            p0Var8 = (p0) j02.o(i02Var3, h02.j);
                            if (p0Var8 != null) {
                                str4 = p0Var8.a;
                            } else {
                                str4 = null;
                            }
                            k1Var3.a(new f1(str4, 131072));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            list3 = (List) j02.o(i02Var3, u02.a);
                            if ((list3 != null || list3.isEmpty()) && w91Var2.c(h02.a) && (!w91Var2.c(u02.G) || ws0.j(j02.o(i02Var3, y02Var2), bool2))) {
                                ax0VarU = ax0Var2.u();
                                while (true) {
                                    if (ax0VarU == null) {
                                        ax0VarU = null;
                                        break;
                                    }
                                    i02VarW2 = ax0VarU.w();
                                    if (i02VarW2 == null && i02VarW2.g) {
                                        if (i02VarW2.e.c(u02.G)) {
                                            break;
                                        }
                                    }
                                    ax0VarU = ax0VarU.u();
                                }
                                if (ax0VarU == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    i02VarW = ax0VarU.w();
                                    if (i02VarW != null) {
                                        objG18 = i02VarW.e.g(y02Var2);
                                        if (objG18 == null) {
                                            objG18 = null;
                                        }
                                        zJ = ws0.j(objG18, bool2);
                                    } else {
                                        zJ = false;
                                    }
                                    if (zJ) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 26) {
                            arrayList3 = new ArrayList();
                            arrayList3.add("androidx.compose.ui.semantics.id");
                            charSequenceE = k1Var3.e();
                            if (charSequenceE != null && charSequenceE.length() != 0 && w91Var2.c(h02.a)) {
                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (w91Var2.c(u02.A)) {
                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (w91Var2.c(u02.Q)) {
                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            i9 = Build.VERSION.SDK_INT;
                            if (i9 >= 26) {
                                accessibilityNodeInfo4.setAvailableExtraData(arrayList3);
                            }
                            i8 = i9;
                        } else {
                            i9 = i8;
                        }
                        oq1Var = (oq1) j02.o(i02Var3, u02.c);
                        if (oq1Var != null) {
                            f = oq1Var.a;
                            f2 = oq1Var.b.a;
                            y02Var4 = h02.i;
                            if (w91Var2.c(y02Var4)) {
                                k1Var3.g("android.widget.SeekBar");
                            } else {
                                k1Var3.g("android.widget.ProgressBar");
                            }
                            resources2 = resources;
                            if (oq1Var != oq1.c) {
                                f3 = 0.0f;
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f2, f));
                            } else {
                                f3 = 0.0f;
                            }
                            if (w91Var2.c(y02Var4) && ws0.r(p02Var2)) {
                                if (f2 < f3) {
                                    f4 = f3;
                                } else {
                                    f4 = f2;
                                }
                                if (f < f4) {
                                    k1Var3.a(f1.f);
                                }
                                if (f3 <= f2) {
                                    f2 = 0.0f;
                                }
                                if (f > f2) {
                                    k1Var3.a(f1.g);
                                }
                            }
                        } else {
                            resources2 = resources;
                        }
                        if (ws0.r(p02Var2) && (p0Var7 = (p0) j02.o(i02Var3, h02.i)) != null) {
                            k1Var3.a(new f1(p0Var7.a, android.R.id.accessibilityActionSetProgress));
                        }
                        objG12 = p02Var2.k().e.g(u02.f);
                        if (objG12 == null) {
                            objG12 = null;
                        }
                        sqVar = (sq) objG12;
                        if (sqVar != null) {
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(sqVar.a, sqVar.b, false, 0));
                        } else {
                            arrayList = new ArrayList();
                            objG13 = p02Var2.k().e.g(u02.e);
                            if (objG13 == null) {
                                objG13 = null;
                            }
                            if (objG13 != null) {
                                listJ2 = p02.j(4, p02Var2);
                                size4 = listJ2.size();
                                while (i10 < size4) {
                                    p02Var3 = (p02) listJ2.get(i10);
                                    if (p02Var3.k().e.c(u02.J)) {
                                        arrayList.add(p02Var3);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zI2 = j20.i(arrayList);
                                if (zI2) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList.size();
                                }
                                if (zI2) {
                                    size3 = arrayList.size();
                                } else {
                                    size3 = 1;
                                }
                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                            }
                        }
                        j20.C(k1Var3, p02Var2);
                        nx1Var = (nx1) j02.o(i02Var3, u02.v);
                        p0 p0Var13 = (p0) j02.o(i02Var3, h02.d);
                        if (nx1Var != null && p0Var13 != null) {
                            objG16 = p02Var2.k().e.g(u02.f);
                            if (objG16 == null) {
                                objG16 = null;
                            }
                            if (objG16 == null) {
                                objG17 = p02Var2.k().e.g(u02.e);
                                if (objG17 == null) {
                                    objG17 = null;
                                }
                                if (objG17 == null) {
                                    k1Var3.g("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) nx1Var.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ws0.r(p02Var2)) {
                                zU = k5.u(nx1Var);
                                kw0Var = kw0.f;
                                if (zU) {
                                    k1Var3.a(f1.f);
                                    ax0Var = ax0Var2;
                                    if (ax0Var.C == kw0Var) {
                                        f1Var2 = f1.i;
                                    } else {
                                        f1Var2 = f1.k;
                                    }
                                    k1Var3.a(f1Var2);
                                } else {
                                    ax0Var = ax0Var2;
                                }
                                if (k5.t(nx1Var)) {
                                    k1Var3.a(f1.g);
                                    if (ax0Var.C == kw0Var) {
                                        f1Var = f1.k;
                                    } else {
                                        f1Var = f1.i;
                                    }
                                    k1Var3.a(f1Var);
                                }
                            }
                        }
                        nx1Var2 = (nx1) j02.o(i02Var3, u02.w);
                        if (nx1Var2 != null && p0Var13 != null) {
                            objG14 = p02Var2.k().e.g(u02.f);
                            if (objG14 == null) {
                                objG14 = null;
                            }
                            if (objG14 == null) {
                                objG15 = p02Var2.k().e.g(u02.e);
                                if (objG15 == null) {
                                    objG15 = null;
                                }
                                if (objG15 == null) {
                                    k1Var3.g("android.widget.ScrollView");
                                }
                            }
                            if (((Number) nx1Var2.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ws0.r(p02Var2)) {
                                if (k5.u(nx1Var2)) {
                                    k1Var3.a(f1.f);
                                    k1Var3.a(f1.j);
                                }
                                if (k5.t(nx1Var2)) {
                                    k1Var3.a(f1.g);
                                    k1Var3.a(f1.h);
                                }
                            }
                        }
                        if (i8 >= 29) {
                            vs0.e(k1Var3, p02Var2);
                        }
                        charSequence = (CharSequence) j02.o(i02Var3, u02.d);
                        if (i9 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (ws0.r(p02Var2)) {
                            p0Var4 = (p0) j02.o(i02Var3, h02.t);
                            if (p0Var4 != null) {
                                k1Var3.a(new f1(p0Var4.a, 262144));
                            }
                            p0Var5 = (p0) j02.o(i02Var3, h02.u);
                            if (p0Var5 != null) {
                                k1Var3.a(new f1(p0Var5.a, 524288));
                            }
                            p0Var6 = (p0) j02.o(i02Var3, h02.v);
                            if (p0Var6 != null) {
                                k1Var3.a(new f1(p0Var6.a, 1048576));
                            }
                            y02Var3 = h02.x;
                            if (w91Var2.c(y02Var3)) {
                                list2 = (List) i02Var3.c(y02Var3);
                                size5 = list2.size();
                                c91Var = k5.R;
                                if (size5 < c91Var.b) {
                                    throw new IllegalStateException("Can't have more than " + c91Var.b + " custom actions for one widget");
                                }
                                v72 v72Var4 = new v72();
                                l91 l91VarA = ef1.a();
                                v72Var3 = v72Var2;
                                if (v72Var3.e) {
                                    s5.G(v72Var3);
                                }
                                if (sv0.M(v72Var3.h, i7, v72Var3.f) >= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    l91Var = (l91) s5.B(v72Var3, i7);
                                    iArr = c91Var.a;
                                    i11 = c91Var.b;
                                    iArrCopyOf = new int[16];
                                    i12 = 0;
                                    i13 = 0;
                                    while (i12 < i11) {
                                        int i43 = iArr[i12];
                                        int i44 = i11;
                                        i14 = i13 + 1;
                                        l91 l91Var3 = l91Var;
                                        if (iArrCopyOf.length < i14) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i14, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i13] = i43;
                                        i12++;
                                        i13 = i14;
                                        i11 = i44;
                                        l91Var = l91Var3;
                                    }
                                    l91Var2 = l91Var;
                                    arrayList2 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        k3.v(list2.get(0));
                                        l91Var2.getClass();
                                        throw null;
                                    }
                                    if (arrayList2.size() > 0) {
                                        k3.v(arrayList2.get(0));
                                        if (i13 <= 0) {
                                            qj.j("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i45 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    k3.v(list2.get(0));
                                    c91Var.b(0);
                                    throw null;
                                }
                                k5Var.v.c(i7, v72Var4);
                                v72Var3.c(i7, l91VarA);
                            }
                        }
                        zE = ws0.E(p02Var2, resources2);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(zE);
                        } else {
                            k1Var3.f(1, zE);
                        }
                        iD = k5Var.F.d(i7);
                        if (iD != -1) {
                            c12.t(e5Var2.getAndroidViewsHandler$ui(), iD);
                            e5Var = e5Var2;
                            accessibilityNodeInfo3.setTraversalBefore(e5Var, iD);
                            k5Var.e(i7, k1Var3, k5Var.H, null);
                        } else {
                            e5Var = e5Var2;
                        }
                        iD2 = k5Var.G.d(i7);
                        if (iD2 != -1) {
                            c12.t(e5Var.getAndroidViewsHandler$ui(), iD2);
                        }
                        str3 = (String) j02.o(i02Var3, v02.b);
                        if (str3 != null) {
                            k1Var3.g(str3);
                        }
                    } else {
                        k5Var = k5Var2;
                    }
                    z2 = true;
                    accessibilityNodeInfo3.setVisibleToUser(j20.v(p02Var2) ^ z2);
                    if (p02Var2.n()) {
                        p02VarL2 = p02Var2.l();
                        p02VarL2.getClass();
                    } else {
                        p02VarL2 = p02Var2;
                    }
                    if (p02VarL2.m().f()) {
                        accessibilityNodeInfo3.setVisibleToUser(false);
                    }
                    objG10 = w91Var2.g(u02.k);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    g31Var = (g31) objG10;
                    if (g31Var != null) {
                        i15 = g31Var.a;
                        if (i15 == 0) {
                            i16 = 1;
                        } else {
                            i16 = 2;
                        }
                        accessibilityNodeInfo4.setLiveRegion(i16);
                    }
                    accessibilityNodeInfo3.setClickable(false);
                    objG11 = w91Var2.g(h02.b);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    p0Var = (p0) objG11;
                    if (p0Var != null) {
                        objG19 = w91Var2.g(u02.J);
                        if (objG19 == null) {
                            objG19 = null;
                        }
                        boolean zJ5 = ws0.j(objG19, bool2);
                        if (wu1Var3 == null) {
                        }
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        accessibilityNodeInfo3.setClickable(z5);
                        if (ws0.r(p02Var2)) {
                            k1Var3.a(new f1(p0Var.a, 16));
                        }
                    }
                    accessibilityNodeInfo3.setLongClickable(false);
                    p0Var2 = (p0) j02.o(i02Var3, h02.c);
                    if (p0Var2 != null) {
                        accessibilityNodeInfo3.setLongClickable(true);
                        if (ws0.r(p02Var2)) {
                            k1Var3.a(new f1(p0Var2.a, 32));
                        }
                    }
                    p0Var3 = (p0) j02.o(i02Var3, h02.q);
                    if (p0Var3 != null) {
                        k1Var3.a(new f1(p0Var3.a, 16384));
                    }
                    if (ws0.r(p02Var2)) {
                        p0Var9 = (p0) j02.o(i02Var3, h02.k);
                        if (p0Var9 != null) {
                            k1Var3.a(new f1(p0Var9.a, 2097152));
                        }
                        p0Var10 = (p0) j02.o(i02Var3, h02.p);
                        if (p0Var10 != null) {
                            k1Var3.a(new f1(p0Var10.a, android.R.id.accessibilityActionImeEnter));
                        }
                        p0Var11 = (p0) j02.o(i02Var3, h02.r);
                        if (p0Var11 != null) {
                            k1Var3.a(new f1(p0Var11.a, 65536));
                        }
                        p0Var12 = (p0) j02.o(i02Var3, h02.s);
                        if (p0Var12 != null) {
                            primaryClipDescription = e5Var2.m5getClipboardManager().a().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                k1Var3.a(new f1(p0Var12.a, 32768));
                            }
                        }
                    }
                    strO = k5.o(p02Var2);
                    if (strO != null) {
                        accessibilityNodeInfo4.setTextSelection(k5Var.m(p02Var2), k5Var.l(p02Var2));
                        p0Var8 = (p0) j02.o(i02Var3, h02.j);
                        if (p0Var8 != null) {
                            str4 = p0Var8.a;
                        } else {
                            str4 = null;
                        }
                        k1Var3.a(new f1(str4, 131072));
                        accessibilityNodeInfo3.addAction(256);
                        accessibilityNodeInfo3.addAction(512);
                        accessibilityNodeInfo3.setMovementGranularities(11);
                        list3 = (List) j02.o(i02Var3, u02.a);
                        if (list3 != null) {
                            ax0VarU = ax0Var2.u();
                            while (true) {
                                if (ax0VarU == null) {
                                    ax0VarU = null;
                                    break;
                                }
                                i02VarW2 = ax0VarU.w();
                                if (i02VarW2 == null) {
                                }
                                ax0VarU = ax0VarU.u();
                            }
                            if (ax0VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                i02VarW = ax0VarU.w();
                                if (i02VarW != null) {
                                    objG18 = i02VarW.e.g(y02Var2);
                                    if (objG18 == null) {
                                        objG18 = null;
                                    }
                                    zJ = ws0.j(objG18, bool2);
                                } else {
                                    zJ = false;
                                }
                                if (zJ) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            ax0VarU = ax0Var2.u();
                            while (true) {
                                if (ax0VarU == null) {
                                    ax0VarU = null;
                                    break;
                                }
                                i02VarW2 = ax0VarU.w();
                                if (i02VarW2 == null) {
                                }
                                ax0VarU = ax0VarU.u();
                            }
                            if (ax0VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                i02VarW = ax0VarU.w();
                                if (i02VarW != null) {
                                    objG18 = i02VarW.e.g(y02Var2);
                                    if (objG18 == null) {
                                        objG18 = null;
                                    }
                                    zJ = ws0.j(objG18, bool2);
                                } else {
                                    zJ = false;
                                }
                                if (zJ) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 26) {
                        arrayList3 = new ArrayList();
                        arrayList3.add("androidx.compose.ui.semantics.id");
                        charSequenceE = k1Var3.e();
                        if (charSequenceE != null) {
                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (w91Var2.c(u02.A)) {
                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (w91Var2.c(u02.Q)) {
                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 26) {
                            accessibilityNodeInfo4.setAvailableExtraData(arrayList3);
                        }
                        i8 = i9;
                    } else {
                        i9 = i8;
                    }
                    oq1Var = (oq1) j02.o(i02Var3, u02.c);
                    if (oq1Var != null) {
                        f = oq1Var.a;
                        f2 = oq1Var.b.a;
                        y02Var4 = h02.i;
                        if (w91Var2.c(y02Var4)) {
                            k1Var3.g("android.widget.SeekBar");
                        } else {
                            k1Var3.g("android.widget.ProgressBar");
                        }
                        resources2 = resources;
                        if (oq1Var != oq1.c) {
                            f3 = 0.0f;
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f2, f));
                        } else {
                            f3 = 0.0f;
                        }
                        if (w91Var2.c(y02Var4)) {
                            if (f2 < f3) {
                                f4 = f3;
                            } else {
                                f4 = f2;
                            }
                            if (f < f4) {
                                k1Var3.a(f1.f);
                            }
                            if (f3 <= f2) {
                                f2 = 0.0f;
                            }
                            if (f > f2) {
                                k1Var3.a(f1.g);
                            }
                        }
                    } else {
                        resources2 = resources;
                    }
                    if (ws0.r(p02Var2)) {
                        k1Var3.a(new f1(p0Var7.a, android.R.id.accessibilityActionSetProgress));
                    }
                    objG12 = p02Var2.k().e.g(u02.f);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    sqVar = (sq) objG12;
                    if (sqVar != null) {
                        accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(sqVar.a, sqVar.b, false, 0));
                    } else {
                        arrayList = new ArrayList();
                        objG13 = p02Var2.k().e.g(u02.e);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        if (objG13 != null) {
                            listJ2 = p02.j(4, p02Var2);
                            size4 = listJ2.size();
                            while (i10 < size4) {
                                p02Var3 = (p02) listJ2.get(i10);
                                if (p02Var3.k().e.c(u02.J)) {
                                    arrayList.add(p02Var3);
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zI2 = j20.i(arrayList);
                            if (zI2) {
                                size2 = 1;
                            } else {
                                size2 = arrayList.size();
                            }
                            if (zI2) {
                                size3 = arrayList.size();
                            } else {
                                size3 = 1;
                            }
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                        }
                    }
                    j20.C(k1Var3, p02Var2);
                    nx1Var = (nx1) j02.o(i02Var3, u02.v);
                    p0 p0Var14 = (p0) j02.o(i02Var3, h02.d);
                    if (nx1Var != null) {
                        objG16 = p02Var2.k().e.g(u02.f);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        if (objG16 == null) {
                            objG17 = p02Var2.k().e.g(u02.e);
                            if (objG17 == null) {
                                objG17 = null;
                            }
                            if (objG17 == null) {
                                k1Var3.g("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) nx1Var.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ws0.r(p02Var2)) {
                            zU = k5.u(nx1Var);
                            kw0Var = kw0.f;
                            if (zU) {
                                k1Var3.a(f1.f);
                                ax0Var = ax0Var2;
                                if (ax0Var.C == kw0Var) {
                                    f1Var2 = f1.i;
                                } else {
                                    f1Var2 = f1.k;
                                }
                                k1Var3.a(f1Var2);
                            } else {
                                ax0Var = ax0Var2;
                            }
                            if (k5.t(nx1Var)) {
                                k1Var3.a(f1.g);
                                if (ax0Var.C == kw0Var) {
                                    f1Var = f1.k;
                                } else {
                                    f1Var = f1.i;
                                }
                                k1Var3.a(f1Var);
                            }
                        }
                    }
                    nx1Var2 = (nx1) j02.o(i02Var3, u02.w);
                    if (nx1Var2 != null) {
                        objG14 = p02Var2.k().e.g(u02.f);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        if (objG14 == null) {
                            objG15 = p02Var2.k().e.g(u02.e);
                            if (objG15 == null) {
                                objG15 = null;
                            }
                            if (objG15 == null) {
                                k1Var3.g("android.widget.ScrollView");
                            }
                        }
                        if (((Number) nx1Var2.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ws0.r(p02Var2)) {
                            if (k5.u(nx1Var2)) {
                                k1Var3.a(f1.f);
                                k1Var3.a(f1.j);
                            }
                            if (k5.t(nx1Var2)) {
                                k1Var3.a(f1.g);
                                k1Var3.a(f1.h);
                            }
                        }
                    }
                    if (i8 >= 29) {
                        vs0.e(k1Var3, p02Var2);
                    }
                    charSequence = (CharSequence) j02.o(i02Var3, u02.d);
                    if (i9 >= 28) {
                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (ws0.r(p02Var2)) {
                        p0Var4 = (p0) j02.o(i02Var3, h02.t);
                        if (p0Var4 != null) {
                            k1Var3.a(new f1(p0Var4.a, 262144));
                        }
                        p0Var5 = (p0) j02.o(i02Var3, h02.u);
                        if (p0Var5 != null) {
                            k1Var3.a(new f1(p0Var5.a, 524288));
                        }
                        p0Var6 = (p0) j02.o(i02Var3, h02.v);
                        if (p0Var6 != null) {
                            k1Var3.a(new f1(p0Var6.a, 1048576));
                        }
                        y02Var3 = h02.x;
                        if (w91Var2.c(y02Var3)) {
                            list2 = (List) i02Var3.c(y02Var3);
                            size5 = list2.size();
                            c91Var = k5.R;
                            if (size5 < c91Var.b) {
                                throw new IllegalStateException("Can't have more than " + c91Var.b + " custom actions for one widget");
                            }
                            v72 v72Var5 = new v72();
                            l91 l91VarA2 = ef1.a();
                            v72Var3 = v72Var2;
                            if (v72Var3.e) {
                                s5.G(v72Var3);
                            }
                            if (sv0.M(v72Var3.h, i7, v72Var3.f) >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                l91Var = (l91) s5.B(v72Var3, i7);
                                iArr = c91Var.a;
                                i11 = c91Var.b;
                                iArrCopyOf = new int[16];
                                i12 = 0;
                                i13 = 0;
                                while (i12 < i11) {
                                    int i46 = iArr[i12];
                                    int i47 = i11;
                                    i14 = i13 + 1;
                                    l91 l91Var4 = l91Var;
                                    if (iArrCopyOf.length < i14) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i14, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i13] = i46;
                                    i12++;
                                    i13 = i14;
                                    i11 = i47;
                                    l91Var = l91Var4;
                                }
                                l91Var2 = l91Var;
                                arrayList2 = new ArrayList();
                                if (list2.size() <= 0) {
                                    k3.v(list2.get(0));
                                    l91Var2.getClass();
                                    throw null;
                                }
                                if (arrayList2.size() > 0) {
                                    k3.v(arrayList2.get(0));
                                    if (i13 <= 0) {
                                        qj.j("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i48 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                k3.v(list2.get(0));
                                c91Var.b(0);
                                throw null;
                            }
                            k5Var.v.c(i7, v72Var5);
                            v72Var3.c(i7, l91VarA2);
                        }
                    }
                    zE = ws0.E(p02Var2, resources2);
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setScreenReaderFocusable(zE);
                    } else {
                        k1Var3.f(1, zE);
                    }
                    iD = k5Var.F.d(i7);
                    if (iD != -1) {
                        c12.t(e5Var2.getAndroidViewsHandler$ui(), iD);
                        e5Var = e5Var2;
                        accessibilityNodeInfo3.setTraversalBefore(e5Var, iD);
                        k5Var.e(i7, k1Var3, k5Var.H, null);
                    } else {
                        e5Var = e5Var2;
                    }
                    iD2 = k5Var.G.d(i7);
                    if (iD2 != -1) {
                        c12.t(e5Var.getAndroidViewsHandler$ui(), iD2);
                    }
                    str3 = (String) j02.o(i02Var3, v02.b);
                    if (str3 != null) {
                        k1Var3.g(str3);
                    }
                } else if (Build.VERSION.SDK_INT >= 34 ? t0.i(accessibilityManager2) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    k1Var = new k1(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        t0.k(accessibilityNodeInfoObtain, zJ3);
                    } else {
                        k1Var.f(64, zJ3);
                    }
                    if (i == -1) {
                        parentForAccessibility = e5Var2.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        k1Var.b = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        p02VarL = p02Var6.l();
                        if (p02VarL != null) {
                            numValueOf = Integer.valueOf(p02VarL.f);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            vp0.c("semanticsNode " + i + " has null parent");
                            qj.e();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == e5Var2.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        k1Var.b = iIntValue;
                        accessibilityNodeInfoObtain.setParent(e5Var2, iIntValue);
                    }
                    k1Var.c = i;
                    accessibilityNodeInfoObtain.setSource(e5Var2, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(k5Var2.f(s02Var2));
                    b91Var = k5Var2.N;
                    v72Var = k5Var2.w;
                    resources = e5Var2.getContext().getResources();
                    k1Var.g("android.view.View");
                    i02Var = p02Var6.d;
                    w91Var = i02Var.e;
                    if (w91Var.c(u02.G)) {
                        k1Var.g("android.widget.EditText");
                    }
                    if (w91Var.c(u02.C)) {
                        k1Var.g("android.widget.TextView");
                    }
                    objG = w91Var.g(u02.z);
                    if (objG == null) {
                        objG = null;
                    }
                    wu1Var = (wu1) objG;
                    if (wu1Var != null) {
                        i34 = wu1Var.a;
                        if (p02Var6.n()) {
                            accessibilityManager = accessibilityManager2;
                            i35 = 4;
                            v72Var2 = v72Var;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i35 = 4;
                            v72Var2 = v72Var;
                            if (p02.j(4, p02Var6).isEmpty()) {
                            }
                        }
                        if (i34 == i35) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i34 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strB2 = c12.B(i34);
                            if (i34 == 5) {
                                k1Var.g(strB2);
                            } else {
                                k1Var.g(strB2);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        v72Var2 = v72Var;
                    }
                    accessibilityNodeInfoObtain.setPackageName(e5Var2.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(j20.w(p02Var6));
                    if (i2 >= 34) {
                        zI = t0.i(accessibilityManager);
                    } else {
                        zI = true;
                    }
                    listJ = p02.j(4, p02Var6);
                    size = listJ.size();
                    z = zI;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i310 = size;
                        p02Var4 = (p02) listJ.get(i4);
                        List list6 = listJ;
                        gr0VarN = k5Var2.n();
                        int i311 = i4;
                        i33 = p02Var4.f;
                        if (!gr0VarN.a(i33)) {
                            if (e5Var2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(p02Var4.c) == null) {
                                fu1.c();
                                return null;
                            }
                            if (i33 != -1) {
                                s02Var = (s02) k5Var2.n().b(i33);
                                if (s02Var != null) {
                                    zJ2 = false;
                                } else {
                                    zJ2 = false;
                                }
                                if (z) {
                                    accessibilityNodeInfoObtain.addChild(e5Var2, i33);
                                } else {
                                    accessibilityNodeInfoObtain.addChild(e5Var2, i33);
                                }
                                b91Var.f(i33, i3);
                                i3++;
                            }
                        }
                        i4 = i311 + 1;
                        listJ = list6;
                        size = i310;
                    }
                    i5 = k5Var2.o;
                    accessibilityNodeInfo = k1Var.a;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        k1Var.a(f1.e);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        k1Var.a(f1.d);
                    }
                    ybVarC = ws0.C(p02Var6);
                    if (ybVarC != null) {
                        e5Var2.getFontFamilyResolver();
                        density = e5Var2.getDensity();
                        udVar = k5Var2.J;
                        String str6 = ybVarC.f;
                        list4 = ybVarC.e;
                        spannableString2 = new SpannableString(str6);
                        arrayList4 = ybVarC.g;
                        if (arrayList4 != null) {
                            size12 = arrayList4.size();
                            i27 = 0;
                            while (i27 < size12) {
                                int i312 = i27;
                                xb xbVar9 = (xb) arrayList4.get(i27);
                                ArrayList arrayList9 = arrayList4;
                                r72 r72Var2 = (r72) xbVar9.a;
                                int i313 = size12;
                                i28 = xbVar9.b;
                                i29 = xbVar9.c;
                                b91 b91Var4 = b91Var;
                                i02 i02Var6 = i02Var;
                                wu1 wu1Var5 = wu1Var;
                                jB = r72Var2.a.b();
                                p02 p02Var8 = p02Var6;
                                long j3 = r72Var2.b;
                                lh0Var = r72Var2.c;
                                hh0Var = r72Var2.d;
                                we2Var = r72Var2.j;
                                q31 q31Var2 = r72Var2.k;
                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfoObtain;
                                k1 k1Var5 = k1Var;
                                j = r72Var2.l;
                                ed2Var = r72Var2.m;
                                srVar = r72Var2.a;
                                AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfo;
                                w91 w91Var4 = w91Var;
                                jB2 = srVar.b();
                                int i49 = dr.h;
                                if (!vk2.a(jB, jB2)) {
                                    if (jB != 16) {
                                        srVar = new sr(jB);
                                    } else {
                                        srVar = ue2.a;
                                    }
                                }
                                c12.u(spannableString2, srVar.b(), i28, i29);
                                spannableString4 = spannableString2;
                                c12.w(spannableString4, j3, density, i28, i29);
                                if (lh0Var == null) {
                                    if (lh0Var == null) {
                                        lh0Var2 = lh0.i;
                                    } else {
                                        lh0Var2 = lh0Var;
                                    }
                                    if (hh0Var != null) {
                                        i30 = hh0Var.a;
                                    } else {
                                        i30 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(nj2.p(lh0Var2, i30));
                                    i31 = 33;
                                    spannableString4.setSpan(styleSpan2, i28, i29, 33);
                                } else {
                                    if (lh0Var == null) {
                                        lh0Var2 = lh0.i;
                                    } else {
                                        lh0Var2 = lh0Var;
                                    }
                                    if (hh0Var != null) {
                                        i30 = hh0Var.a;
                                    } else {
                                        i30 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(nj2.p(lh0Var2, i30));
                                    i31 = 33;
                                    spannableString4.setSpan(styleSpan3, i28, i29, 33);
                                }
                                if (ed2Var != null) {
                                    i32 = ed2Var.a;
                                    if ((i32 | 1) == i32) {
                                        spannableString4.setSpan(new UnderlineSpan(), i28, i29, i31);
                                    }
                                    if ((i32 | 2) == i32) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i28, i29, i31);
                                    }
                                }
                                if (we2Var != null) {
                                    spannableString4.setSpan(new ScaleXSpan(we2Var.a), i28, i29, i31);
                                }
                                c12.z(spannableString4, q31Var2, i28, i29);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(ws0.V(j)), i28, i29, i31);
                                }
                                spannableString2 = spannableString4;
                                i27 = i312 + 1;
                                w91Var = w91Var4;
                                arrayList4 = arrayList9;
                                size12 = i313;
                                b91Var = b91Var4;
                                i02Var = i02Var6;
                                wu1Var = wu1Var5;
                                p02Var6 = p02Var8;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo8;
                                k1Var = k1Var5;
                                accessibilityNodeInfo = accessibilityNodeInfo9;
                            }
                        }
                        b91Var2 = b91Var;
                        p02Var = p02Var6;
                        i02Var2 = i02Var;
                        wu1Var2 = wu1Var;
                        AccessibilityNodeInfo accessibilityNodeInfo10 = accessibilityNodeInfo;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        k1Var2 = k1Var;
                        spannableString3 = spannableString2;
                        w91Var2 = w91Var;
                        int length4 = str6.length();
                        arrayList5 = cb0.e;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size11 = list4.size();
                            for (i26 = 0; i26 < size11; i26++) {
                                Object obj5 = list4.get(i26);
                                xbVar5 = (xb) obj5;
                                if (!(xbVar5.a instanceof xm2)) {
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size6 = arrayList6.size();
                        for (i17 = 0; i17 < size6; i17++) {
                            xb xbVar10 = (xb) arrayList6.get(i17);
                            xm2Var = (xm2) xbVar10.a;
                            i24 = xbVar10.b;
                            i25 = xbVar10.c;
                            if (xm2Var instanceof xm2) {
                                qj.p();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(xm2Var.a).build(), i24, i25, 33);
                        }
                        int length5 = str6.length();
                        if (list4 != null) {
                            arrayList7 = new ArrayList(list4.size());
                            size10 = list4.size();
                            for (i23 = 0; i23 < size10; i23++) {
                                Object obj6 = list4.get(i23);
                                xbVar4 = (xb) obj6;
                                if (!(xbVar4.a instanceof xl2)) {
                                }
                            }
                        } else {
                            arrayList7 = arrayList5;
                        }
                        size7 = arrayList7.size();
                        for (i18 = 0; i18 < size7; i18++) {
                            xb xbVar11 = (xb) arrayList7.get(i18);
                            xl2Var = (xl2) xbVar11.a;
                            int i410 = xbVar11.b;
                            int i411 = xbVar11.c;
                            weakHashMap3 = (WeakHashMap) udVar.b;
                            uRLSpan2 = weakHashMap3.get(xl2Var);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(xl2Var.a);
                                weakHashMap3.put(xl2Var, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i410, i411, 33);
                        }
                        int length6 = str6.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size9 = list4.size();
                            for (i22 = 0; i22 < size9; i22++) {
                                Object obj7 = list4.get(i22);
                                xbVar3 = (xb) obj7;
                                if (!(xbVar3.a instanceof w21)) {
                                }
                            }
                        }
                        size8 = arrayList5.size();
                        for (i19 = 0; i19 < size8; i19++) {
                            xbVar = (xb) arrayList5.get(i19);
                            i20 = xbVar.b;
                            obj = xbVar.a;
                            i21 = xbVar.c;
                            if (i20 != i21) {
                                w21Var = (w21) obj;
                                if (w21Var instanceof v21) {
                                    obj.getClass();
                                    v21Var = (v21) obj;
                                    xbVar2 = new xb(i20, i21, v21Var);
                                    weakHashMap2 = (WeakHashMap) udVar.c;
                                    uRLSpan = weakHashMap2.get(xbVar2);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(v21Var.a);
                                        weakHashMap2.put(xbVar2, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i20, i21, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) udVar.d;
                                    duVar = weakHashMap.get(xbVar);
                                    if (duVar == null) {
                                        duVar = new du(w21Var);
                                        weakHashMap.put(xbVar, duVar);
                                    }
                                    spannableString3.setSpan((ClickableSpan) duVar, i20, i21, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) k5.K(spannableString3);
                        accessibilityNodeInfo3 = accessibilityNodeInfo10;
                    } else {
                        k5Var2 = k5Var2;
                        b91Var2 = b91Var;
                        p02Var = p02Var6;
                        i02Var2 = i02Var;
                        wu1Var2 = wu1Var;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        k1Var2 = k1Var;
                        w91Var2 = w91Var;
                        spannableString = null;
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo3.setText(spannableString);
                    y02Var = u02.M;
                    if (w91Var2.c(y02Var)) {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setContentInvalid(true);
                        objG20 = w91Var2.g(y02Var);
                        if (objG20 == null) {
                            objG20 = null;
                        }
                        accessibilityNodeInfo4.setError((CharSequence) objG20);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                    }
                    p02Var2 = p02Var;
                    strB = ws0.B(p02Var2, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        g1.h(accessibilityNodeInfo3, strB);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strB);
                    }
                    accessibilityNodeInfo4.setCheckable(ws0.A(p02Var2));
                    objG2 = w91Var2.g(u02.K);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    ch2Var = (ch2) objG2;
                    if (ch2Var != null) {
                        if (ch2Var == ch2.e) {
                            accessibilityNodeInfo3.setChecked(true);
                        } else if (ch2Var == ch2.f) {
                            accessibilityNodeInfo3.setChecked(false);
                        }
                    }
                    objG3 = w91Var2.g(u02.J);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    bool = (Boolean) objG3;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (wu1Var2 == null) {
                            wu1Var3 = wu1Var2;
                            i6 = 4;
                        } else {
                            wu1Var3 = wu1Var2;
                            i6 = 4;
                            if (wu1Var3.a == 4) {
                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                    } else {
                        wu1Var3 = wu1Var2;
                        i6 = 4;
                    }
                    i02Var3 = i02Var2;
                    if (i02Var3.g) {
                        objG4 = w91Var2.g(u02.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) vq.R(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    } else {
                        objG4 = w91Var2.g(u02.a);
                        if (objG4 == null) {
                            objG4 = null;
                        }
                        list = (List) objG4;
                        if (list != null) {
                            str = (String) vq.R(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    objG5 = w91Var2.g(u02.A);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    str2 = (String) objG5;
                    if (str2 != null) {
                        p02VarL3 = p02Var2;
                        while (true) {
                            if (p02VarL3 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            i02Var4 = p02VarL3.d;
                            y02Var5 = v02.a;
                            if (i02Var4.e.c(y02Var5)) {
                                zBooleanValue = ((Boolean) i02Var4.c(y02Var5)).booleanValue();
                                break;
                            }
                            p02VarL3 = p02VarL3.l();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo4.setViewIdResourceName(str2);
                        }
                    }
                    objG6 = w91Var2.g(u02.h);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    if (((ll2) objG6) == null) {
                        k1Var3 = k1Var2;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setHeading(true);
                        k1Var3 = k1Var2;
                    } else {
                        k1Var3 = k1Var2;
                        k1Var3.f(2, true);
                    }
                    objG7 = w91Var2.g(u02.i);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    if (((ll2) objG7) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo4.setTextEntryKey(true);
                        } else {
                            k1Var3.f(8, true);
                        }
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iD3 = b91Var2.d(p02Var2.f);
                        if (iD3 != -1) {
                            accessibilityNodeInfo4.setDrawingOrder(iD3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo4.setPassword(w91Var2.c(u02.L));
                    objG8 = w91Var2.g(u02.O);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo4.setEditable(ws0.j(objG8, bool2));
                    objG9 = w91Var2.g(u02.P);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    num = (Integer) objG9;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(ws0.r(p02Var2));
                    y02Var2 = u02.l;
                    accessibilityNodeInfo4.setFocusable(w91Var2.c(y02Var2));
                    if (accessibilityNodeInfo4.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) i02Var3.c(y02Var2)).booleanValue());
                        if (accessibilityNodeInfo4.isFocused()) {
                            accessibilityNodeInfo3.addAction(2);
                            k5Var = k5Var2;
                            k5Var.p = i7;
                        } else {
                            k5Var = k5Var2;
                            z2 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        accessibilityNodeInfo3.setVisibleToUser(j20.v(p02Var2) ^ z2);
                        if (p02Var2.n()) {
                            p02VarL2 = p02Var2.l();
                            p02VarL2.getClass();
                        } else {
                            p02VarL2 = p02Var2;
                        }
                        if (p02VarL2.m().f()) {
                            accessibilityNodeInfo3.setVisibleToUser(false);
                        }
                        objG10 = w91Var2.g(u02.k);
                        if (objG10 == null) {
                            objG10 = null;
                        }
                        g31Var = (g31) objG10;
                        if (g31Var != null) {
                            i15 = g31Var.a;
                            if (i15 == 0) {
                                i16 = 1;
                            } else {
                                i16 = 2;
                            }
                            accessibilityNodeInfo4.setLiveRegion(i16);
                        }
                        accessibilityNodeInfo3.setClickable(false);
                        objG11 = w91Var2.g(h02.b);
                        if (objG11 == null) {
                            objG11 = null;
                        }
                        p0Var = (p0) objG11;
                        if (p0Var != null) {
                            objG19 = w91Var2.g(u02.J);
                            if (objG19 == null) {
                                objG19 = null;
                            }
                            boolean zJ6 = ws0.j(objG19, bool2);
                            if (wu1Var3 == null) {
                            }
                            if (z4) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            accessibilityNodeInfo3.setClickable(z5);
                            if (ws0.r(p02Var2)) {
                                k1Var3.a(new f1(p0Var.a, 16));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        p0Var2 = (p0) j02.o(i02Var3, h02.c);
                        if (p0Var2 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (ws0.r(p02Var2)) {
                                k1Var3.a(new f1(p0Var2.a, 32));
                            }
                        }
                        p0Var3 = (p0) j02.o(i02Var3, h02.q);
                        if (p0Var3 != null) {
                            k1Var3.a(new f1(p0Var3.a, 16384));
                        }
                        if (ws0.r(p02Var2)) {
                            p0Var9 = (p0) j02.o(i02Var3, h02.k);
                            if (p0Var9 != null) {
                                k1Var3.a(new f1(p0Var9.a, 2097152));
                            }
                            p0Var10 = (p0) j02.o(i02Var3, h02.p);
                            if (p0Var10 != null) {
                                k1Var3.a(new f1(p0Var10.a, android.R.id.accessibilityActionImeEnter));
                            }
                            p0Var11 = (p0) j02.o(i02Var3, h02.r);
                            if (p0Var11 != null) {
                                k1Var3.a(new f1(p0Var11.a, 65536));
                            }
                            p0Var12 = (p0) j02.o(i02Var3, h02.s);
                            if (p0Var12 != null) {
                                primaryClipDescription = e5Var2.m5getClipboardManager().a().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    k1Var3.a(new f1(p0Var12.a, 32768));
                                }
                            }
                        }
                        strO = k5.o(p02Var2);
                        if (strO != null) {
                            accessibilityNodeInfo4.setTextSelection(k5Var.m(p02Var2), k5Var.l(p02Var2));
                            p0Var8 = (p0) j02.o(i02Var3, h02.j);
                            if (p0Var8 != null) {
                                str4 = p0Var8.a;
                            } else {
                                str4 = null;
                            }
                            k1Var3.a(new f1(str4, 131072));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            list3 = (List) j02.o(i02Var3, u02.a);
                            if (list3 != null) {
                                ax0VarU = ax0Var2.u();
                                while (true) {
                                    if (ax0VarU == null) {
                                        ax0VarU = null;
                                        break;
                                    }
                                    i02VarW2 = ax0VarU.w();
                                    if (i02VarW2 == null) {
                                    }
                                    ax0VarU = ax0VarU.u();
                                }
                                if (ax0VarU == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    i02VarW = ax0VarU.w();
                                    if (i02VarW != null) {
                                        objG18 = i02VarW.e.g(y02Var2);
                                        if (objG18 == null) {
                                            objG18 = null;
                                        }
                                        zJ = ws0.j(objG18, bool2);
                                    } else {
                                        zJ = false;
                                    }
                                    if (zJ) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            } else {
                                ax0VarU = ax0Var2.u();
                                while (true) {
                                    if (ax0VarU == null) {
                                        ax0VarU = null;
                                        break;
                                    }
                                    i02VarW2 = ax0VarU.w();
                                    if (i02VarW2 == null) {
                                    }
                                    ax0VarU = ax0VarU.u();
                                }
                                if (ax0VarU == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    i02VarW = ax0VarU.w();
                                    if (i02VarW != null) {
                                        objG18 = i02VarW.e.g(y02Var2);
                                        if (objG18 == null) {
                                            objG18 = null;
                                        }
                                        zJ = ws0.j(objG18, bool2);
                                    } else {
                                        zJ = false;
                                    }
                                    if (zJ) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 26) {
                            arrayList3 = new ArrayList();
                            arrayList3.add("androidx.compose.ui.semantics.id");
                            charSequenceE = k1Var3.e();
                            if (charSequenceE != null) {
                                arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (w91Var2.c(u02.A)) {
                                arrayList3.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (w91Var2.c(u02.Q)) {
                                arrayList3.add("androidx.compose.ui.semantics.shapeType");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            i9 = Build.VERSION.SDK_INT;
                            if (i9 >= 26) {
                                accessibilityNodeInfo4.setAvailableExtraData(arrayList3);
                            }
                            i8 = i9;
                        } else {
                            i9 = i8;
                        }
                        oq1Var = (oq1) j02.o(i02Var3, u02.c);
                        if (oq1Var != null) {
                            f = oq1Var.a;
                            f2 = oq1Var.b.a;
                            y02Var4 = h02.i;
                            if (w91Var2.c(y02Var4)) {
                                k1Var3.g("android.widget.SeekBar");
                            } else {
                                k1Var3.g("android.widget.ProgressBar");
                            }
                            resources2 = resources;
                            if (oq1Var != oq1.c) {
                                f3 = 0.0f;
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f2, f));
                            } else {
                                f3 = 0.0f;
                            }
                            if (w91Var2.c(y02Var4)) {
                                if (f2 < f3) {
                                    f4 = f3;
                                } else {
                                    f4 = f2;
                                }
                                if (f < f4) {
                                    k1Var3.a(f1.f);
                                }
                                if (f3 <= f2) {
                                    f2 = 0.0f;
                                }
                                if (f > f2) {
                                    k1Var3.a(f1.g);
                                }
                            }
                        } else {
                            resources2 = resources;
                        }
                        if (ws0.r(p02Var2)) {
                            k1Var3.a(new f1(p0Var7.a, android.R.id.accessibilityActionSetProgress));
                        }
                        objG12 = p02Var2.k().e.g(u02.f);
                        if (objG12 == null) {
                            objG12 = null;
                        }
                        sqVar = (sq) objG12;
                        if (sqVar != null) {
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(sqVar.a, sqVar.b, false, 0));
                        } else {
                            arrayList = new ArrayList();
                            objG13 = p02Var2.k().e.g(u02.e);
                            if (objG13 == null) {
                                objG13 = null;
                            }
                            if (objG13 != null) {
                                listJ2 = p02.j(4, p02Var2);
                                size4 = listJ2.size();
                                for (i10 = 0; i10 < size4; i10++) {
                                    p02Var3 = (p02) listJ2.get(i10);
                                    if (p02Var3.k().e.c(u02.J)) {
                                        arrayList.add(p02Var3);
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                zI2 = j20.i(arrayList);
                                if (zI2) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList.size();
                                }
                                if (zI2) {
                                    size3 = arrayList.size();
                                } else {
                                    size3 = 1;
                                }
                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                            }
                        }
                        j20.C(k1Var3, p02Var2);
                        nx1Var = (nx1) j02.o(i02Var3, u02.v);
                        p0 p0Var15 = (p0) j02.o(i02Var3, h02.d);
                        if (nx1Var != null) {
                            objG16 = p02Var2.k().e.g(u02.f);
                            if (objG16 == null) {
                                objG16 = null;
                            }
                            if (objG16 == null) {
                                objG17 = p02Var2.k().e.g(u02.e);
                                if (objG17 == null) {
                                    objG17 = null;
                                }
                                if (objG17 == null) {
                                    k1Var3.g("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) nx1Var.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ws0.r(p02Var2)) {
                                zU = k5.u(nx1Var);
                                kw0Var = kw0.f;
                                if (zU) {
                                    k1Var3.a(f1.f);
                                    ax0Var = ax0Var2;
                                    if (ax0Var.C == kw0Var) {
                                        f1Var2 = f1.i;
                                    } else {
                                        f1Var2 = f1.k;
                                    }
                                    k1Var3.a(f1Var2);
                                } else {
                                    ax0Var = ax0Var2;
                                }
                                if (k5.t(nx1Var)) {
                                    k1Var3.a(f1.g);
                                    if (ax0Var.C == kw0Var) {
                                        f1Var = f1.k;
                                    } else {
                                        f1Var = f1.i;
                                    }
                                    k1Var3.a(f1Var);
                                }
                            }
                        }
                        nx1Var2 = (nx1) j02.o(i02Var3, u02.w);
                        if (nx1Var2 != null) {
                            objG14 = p02Var2.k().e.g(u02.f);
                            if (objG14 == null) {
                                objG14 = null;
                            }
                            if (objG14 == null) {
                                objG15 = p02Var2.k().e.g(u02.e);
                                if (objG15 == null) {
                                    objG15 = null;
                                }
                                if (objG15 == null) {
                                    k1Var3.g("android.widget.ScrollView");
                                }
                            }
                            if (((Number) nx1Var2.b.a()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (ws0.r(p02Var2)) {
                                if (k5.u(nx1Var2)) {
                                    k1Var3.a(f1.f);
                                    k1Var3.a(f1.j);
                                }
                                if (k5.t(nx1Var2)) {
                                    k1Var3.a(f1.g);
                                    k1Var3.a(f1.h);
                                }
                            }
                        }
                        if (i8 >= 29) {
                            vs0.e(k1Var3, p02Var2);
                        }
                        charSequence = (CharSequence) j02.o(i02Var3, u02.d);
                        if (i9 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (ws0.r(p02Var2)) {
                            p0Var4 = (p0) j02.o(i02Var3, h02.t);
                            if (p0Var4 != null) {
                                k1Var3.a(new f1(p0Var4.a, 262144));
                            }
                            p0Var5 = (p0) j02.o(i02Var3, h02.u);
                            if (p0Var5 != null) {
                                k1Var3.a(new f1(p0Var5.a, 524288));
                            }
                            p0Var6 = (p0) j02.o(i02Var3, h02.v);
                            if (p0Var6 != null) {
                                k1Var3.a(new f1(p0Var6.a, 1048576));
                            }
                            y02Var3 = h02.x;
                            if (w91Var2.c(y02Var3)) {
                                list2 = (List) i02Var3.c(y02Var3);
                                size5 = list2.size();
                                c91Var = k5.R;
                                if (size5 < c91Var.b) {
                                    throw new IllegalStateException("Can't have more than " + c91Var.b + " custom actions for one widget");
                                }
                                v72 v72Var6 = new v72();
                                l91 l91VarA3 = ef1.a();
                                v72Var3 = v72Var2;
                                if (v72Var3.e) {
                                    s5.G(v72Var3);
                                }
                                if (sv0.M(v72Var3.h, i7, v72Var3.f) >= 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    l91Var = (l91) s5.B(v72Var3, i7);
                                    iArr = c91Var.a;
                                    i11 = c91Var.b;
                                    iArrCopyOf = new int[16];
                                    i12 = 0;
                                    i13 = 0;
                                    while (i12 < i11) {
                                        int i412 = iArr[i12];
                                        int i413 = i11;
                                        i14 = i13 + 1;
                                        l91 l91Var5 = l91Var;
                                        if (iArrCopyOf.length < i14) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i14, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i13] = i412;
                                        i12++;
                                        i13 = i14;
                                        i11 = i413;
                                        l91Var = l91Var5;
                                    }
                                    l91Var2 = l91Var;
                                    arrayList2 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        k3.v(list2.get(0));
                                        l91Var2.getClass();
                                        throw null;
                                    }
                                    if (arrayList2.size() > 0) {
                                        k3.v(arrayList2.get(0));
                                        if (i13 <= 0) {
                                            qj.j("Index must be between 0 and size");
                                            return null;
                                        }
                                        int i414 = iArrCopyOf[0];
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    k3.v(list2.get(0));
                                    c91Var.b(0);
                                    throw null;
                                }
                                k5Var.v.c(i7, v72Var6);
                                v72Var3.c(i7, l91VarA3);
                            }
                        }
                        zE = ws0.E(p02Var2, resources2);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(zE);
                        } else {
                            k1Var3.f(1, zE);
                        }
                        iD = k5Var.F.d(i7);
                        if (iD != -1) {
                            c12.t(e5Var2.getAndroidViewsHandler$ui(), iD);
                            e5Var = e5Var2;
                            accessibilityNodeInfo3.setTraversalBefore(e5Var, iD);
                            k5Var.e(i7, k1Var3, k5Var.H, null);
                        } else {
                            e5Var = e5Var2;
                        }
                        iD2 = k5Var.G.d(i7);
                        if (iD2 != -1) {
                            c12.t(e5Var.getAndroidViewsHandler$ui(), iD2);
                        }
                        str3 = (String) j02.o(i02Var3, v02.b);
                        if (str3 != null) {
                            k1Var3.g(str3);
                        }
                    } else {
                        k5Var = k5Var2;
                    }
                    z2 = true;
                    accessibilityNodeInfo3.setVisibleToUser(j20.v(p02Var2) ^ z2);
                    if (p02Var2.n()) {
                        p02VarL2 = p02Var2.l();
                        p02VarL2.getClass();
                    } else {
                        p02VarL2 = p02Var2;
                    }
                    if (p02VarL2.m().f()) {
                        accessibilityNodeInfo3.setVisibleToUser(false);
                    }
                    objG10 = w91Var2.g(u02.k);
                    if (objG10 == null) {
                        objG10 = null;
                    }
                    g31Var = (g31) objG10;
                    if (g31Var != null) {
                        i15 = g31Var.a;
                        if (i15 == 0) {
                            i16 = 1;
                        } else {
                            i16 = 2;
                        }
                        accessibilityNodeInfo4.setLiveRegion(i16);
                    }
                    accessibilityNodeInfo3.setClickable(false);
                    objG11 = w91Var2.g(h02.b);
                    if (objG11 == null) {
                        objG11 = null;
                    }
                    p0Var = (p0) objG11;
                    if (p0Var != null) {
                        objG19 = w91Var2.g(u02.J);
                        if (objG19 == null) {
                            objG19 = null;
                        }
                        boolean zJ7 = ws0.j(objG19, bool2);
                        if (wu1Var3 == null) {
                        }
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        accessibilityNodeInfo3.setClickable(z5);
                        if (ws0.r(p02Var2)) {
                            k1Var3.a(new f1(p0Var.a, 16));
                        }
                    }
                    accessibilityNodeInfo3.setLongClickable(false);
                    p0Var2 = (p0) j02.o(i02Var3, h02.c);
                    if (p0Var2 != null) {
                        accessibilityNodeInfo3.setLongClickable(true);
                        if (ws0.r(p02Var2)) {
                            k1Var3.a(new f1(p0Var2.a, 32));
                        }
                    }
                    p0Var3 = (p0) j02.o(i02Var3, h02.q);
                    if (p0Var3 != null) {
                        k1Var3.a(new f1(p0Var3.a, 16384));
                    }
                    if (ws0.r(p02Var2)) {
                        p0Var9 = (p0) j02.o(i02Var3, h02.k);
                        if (p0Var9 != null) {
                            k1Var3.a(new f1(p0Var9.a, 2097152));
                        }
                        p0Var10 = (p0) j02.o(i02Var3, h02.p);
                        if (p0Var10 != null) {
                            k1Var3.a(new f1(p0Var10.a, android.R.id.accessibilityActionImeEnter));
                        }
                        p0Var11 = (p0) j02.o(i02Var3, h02.r);
                        if (p0Var11 != null) {
                            k1Var3.a(new f1(p0Var11.a, 65536));
                        }
                        p0Var12 = (p0) j02.o(i02Var3, h02.s);
                        if (p0Var12 != null) {
                            primaryClipDescription = e5Var2.m5getClipboardManager().a().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                k1Var3.a(new f1(p0Var12.a, 32768));
                            }
                        }
                    }
                    strO = k5.o(p02Var2);
                    if (strO != null) {
                        accessibilityNodeInfo4.setTextSelection(k5Var.m(p02Var2), k5Var.l(p02Var2));
                        p0Var8 = (p0) j02.o(i02Var3, h02.j);
                        if (p0Var8 != null) {
                            str4 = p0Var8.a;
                        } else {
                            str4 = null;
                        }
                        k1Var3.a(new f1(str4, 131072));
                        accessibilityNodeInfo3.addAction(256);
                        accessibilityNodeInfo3.addAction(512);
                        accessibilityNodeInfo3.setMovementGranularities(11);
                        list3 = (List) j02.o(i02Var3, u02.a);
                        if (list3 != null) {
                            ax0VarU = ax0Var2.u();
                            while (true) {
                                if (ax0VarU == null) {
                                    ax0VarU = null;
                                    break;
                                }
                                i02VarW2 = ax0VarU.w();
                                if (i02VarW2 == null) {
                                }
                                ax0VarU = ax0VarU.u();
                            }
                            if (ax0VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                i02VarW = ax0VarU.w();
                                if (i02VarW != null) {
                                    objG18 = i02VarW.e.g(y02Var2);
                                    if (objG18 == null) {
                                        objG18 = null;
                                    }
                                    zJ = ws0.j(objG18, bool2);
                                } else {
                                    zJ = false;
                                }
                                if (zJ) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            ax0VarU = ax0Var2.u();
                            while (true) {
                                if (ax0VarU == null) {
                                    ax0VarU = null;
                                    break;
                                }
                                i02VarW2 = ax0VarU.w();
                                if (i02VarW2 == null) {
                                }
                                ax0VarU = ax0VarU.u();
                            }
                            if (ax0VarU == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                i02VarW = ax0VarU.w();
                                if (i02VarW != null) {
                                    objG18 = i02VarW.e.g(y02Var2);
                                    if (objG18 == null) {
                                        objG18 = null;
                                    }
                                    zJ = ws0.j(objG18, bool2);
                                } else {
                                    zJ = false;
                                }
                                if (zJ) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 26) {
                        arrayList3 = new ArrayList();
                        arrayList3.add("androidx.compose.ui.semantics.id");
                        charSequenceE = k1Var3.e();
                        if (charSequenceE != null) {
                            arrayList3.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (w91Var2.c(u02.A)) {
                            arrayList3.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (w91Var2.c(u02.Q)) {
                            arrayList3.add("androidx.compose.ui.semantics.shapeType");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList3.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList3.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 26) {
                            accessibilityNodeInfo4.setAvailableExtraData(arrayList3);
                        }
                        i8 = i9;
                    } else {
                        i9 = i8;
                    }
                    oq1Var = (oq1) j02.o(i02Var3, u02.c);
                    if (oq1Var != null) {
                        f = oq1Var.a;
                        f2 = oq1Var.b.a;
                        y02Var4 = h02.i;
                        if (w91Var2.c(y02Var4)) {
                            k1Var3.g("android.widget.SeekBar");
                        } else {
                            k1Var3.g("android.widget.ProgressBar");
                        }
                        resources2 = resources;
                        if (oq1Var != oq1.c) {
                            f3 = 0.0f;
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, f2, f));
                        } else {
                            f3 = 0.0f;
                        }
                        if (w91Var2.c(y02Var4)) {
                            if (f2 < f3) {
                                f4 = f3;
                            } else {
                                f4 = f2;
                            }
                            if (f < f4) {
                                k1Var3.a(f1.f);
                            }
                            if (f3 <= f2) {
                                f2 = 0.0f;
                            }
                            if (f > f2) {
                                k1Var3.a(f1.g);
                            }
                        }
                    } else {
                        resources2 = resources;
                    }
                    if (ws0.r(p02Var2)) {
                        k1Var3.a(new f1(p0Var7.a, android.R.id.accessibilityActionSetProgress));
                    }
                    objG12 = p02Var2.k().e.g(u02.f);
                    if (objG12 == null) {
                        objG12 = null;
                    }
                    sqVar = (sq) objG12;
                    if (sqVar != null) {
                        accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(sqVar.a, sqVar.b, false, 0));
                    } else {
                        arrayList = new ArrayList();
                        objG13 = p02Var2.k().e.g(u02.e);
                        if (objG13 == null) {
                            objG13 = null;
                        }
                        if (objG13 != null) {
                            listJ2 = p02.j(4, p02Var2);
                            size4 = listJ2.size();
                            while (i10 < size4) {
                                p02Var3 = (p02) listJ2.get(i10);
                                if (p02Var3.k().e.c(u02.J)) {
                                    arrayList.add(p02Var3);
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zI2 = j20.i(arrayList);
                            if (zI2) {
                                size2 = 1;
                            } else {
                                size2 = arrayList.size();
                            }
                            if (zI2) {
                                size3 = arrayList.size();
                            } else {
                                size3 = 1;
                            }
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                        }
                    }
                    j20.C(k1Var3, p02Var2);
                    nx1Var = (nx1) j02.o(i02Var3, u02.v);
                    p0 p0Var16 = (p0) j02.o(i02Var3, h02.d);
                    if (nx1Var != null) {
                        objG16 = p02Var2.k().e.g(u02.f);
                        if (objG16 == null) {
                            objG16 = null;
                        }
                        if (objG16 == null) {
                            objG17 = p02Var2.k().e.g(u02.e);
                            if (objG17 == null) {
                                objG17 = null;
                            }
                            if (objG17 == null) {
                                k1Var3.g("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) nx1Var.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ws0.r(p02Var2)) {
                            zU = k5.u(nx1Var);
                            kw0Var = kw0.f;
                            if (zU) {
                                k1Var3.a(f1.f);
                                ax0Var = ax0Var2;
                                if (ax0Var.C == kw0Var) {
                                    f1Var2 = f1.i;
                                } else {
                                    f1Var2 = f1.k;
                                }
                                k1Var3.a(f1Var2);
                            } else {
                                ax0Var = ax0Var2;
                            }
                            if (k5.t(nx1Var)) {
                                k1Var3.a(f1.g);
                                if (ax0Var.C == kw0Var) {
                                    f1Var = f1.k;
                                } else {
                                    f1Var = f1.i;
                                }
                                k1Var3.a(f1Var);
                            }
                        }
                    }
                    nx1Var2 = (nx1) j02.o(i02Var3, u02.w);
                    if (nx1Var2 != null) {
                        objG14 = p02Var2.k().e.g(u02.f);
                        if (objG14 == null) {
                            objG14 = null;
                        }
                        if (objG14 == null) {
                            objG15 = p02Var2.k().e.g(u02.e);
                            if (objG15 == null) {
                                objG15 = null;
                            }
                            if (objG15 == null) {
                                k1Var3.g("android.widget.ScrollView");
                            }
                        }
                        if (((Number) nx1Var2.b.a()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (ws0.r(p02Var2)) {
                            if (k5.u(nx1Var2)) {
                                k1Var3.a(f1.f);
                                k1Var3.a(f1.j);
                            }
                            if (k5.t(nx1Var2)) {
                                k1Var3.a(f1.g);
                                k1Var3.a(f1.h);
                            }
                        }
                    }
                    if (i8 >= 29) {
                        vs0.e(k1Var3, p02Var2);
                    }
                    charSequence = (CharSequence) j02.o(i02Var3, u02.d);
                    if (i9 >= 28) {
                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (ws0.r(p02Var2)) {
                        p0Var4 = (p0) j02.o(i02Var3, h02.t);
                        if (p0Var4 != null) {
                            k1Var3.a(new f1(p0Var4.a, 262144));
                        }
                        p0Var5 = (p0) j02.o(i02Var3, h02.u);
                        if (p0Var5 != null) {
                            k1Var3.a(new f1(p0Var5.a, 524288));
                        }
                        p0Var6 = (p0) j02.o(i02Var3, h02.v);
                        if (p0Var6 != null) {
                            k1Var3.a(new f1(p0Var6.a, 1048576));
                        }
                        y02Var3 = h02.x;
                        if (w91Var2.c(y02Var3)) {
                            list2 = (List) i02Var3.c(y02Var3);
                            size5 = list2.size();
                            c91Var = k5.R;
                            if (size5 < c91Var.b) {
                                throw new IllegalStateException("Can't have more than " + c91Var.b + " custom actions for one widget");
                            }
                            v72 v72Var7 = new v72();
                            l91 l91VarA4 = ef1.a();
                            v72Var3 = v72Var2;
                            if (v72Var3.e) {
                                s5.G(v72Var3);
                            }
                            if (sv0.M(v72Var3.h, i7, v72Var3.f) >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                l91Var = (l91) s5.B(v72Var3, i7);
                                iArr = c91Var.a;
                                i11 = c91Var.b;
                                iArrCopyOf = new int[16];
                                i12 = 0;
                                i13 = 0;
                                while (i12 < i11) {
                                    int i415 = iArr[i12];
                                    int i416 = i11;
                                    i14 = i13 + 1;
                                    l91 l91Var6 = l91Var;
                                    if (iArrCopyOf.length < i14) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i14, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i13] = i415;
                                    i12++;
                                    i13 = i14;
                                    i11 = i416;
                                    l91Var = l91Var6;
                                }
                                l91Var2 = l91Var;
                                arrayList2 = new ArrayList();
                                if (list2.size() <= 0) {
                                    k3.v(list2.get(0));
                                    l91Var2.getClass();
                                    throw null;
                                }
                                if (arrayList2.size() > 0) {
                                    k3.v(arrayList2.get(0));
                                    if (i13 <= 0) {
                                        qj.j("Index must be between 0 and size");
                                        return null;
                                    }
                                    int i417 = iArrCopyOf[0];
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                k3.v(list2.get(0));
                                c91Var.b(0);
                                throw null;
                            }
                            k5Var.v.c(i7, v72Var7);
                            v72Var3.c(i7, l91VarA4);
                        }
                    }
                    zE = ws0.E(p02Var2, resources2);
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setScreenReaderFocusable(zE);
                    } else {
                        k1Var3.f(1, zE);
                    }
                    iD = k5Var.F.d(i7);
                    if (iD != -1) {
                        c12.t(e5Var2.getAndroidViewsHandler$ui(), iD);
                        e5Var = e5Var2;
                        accessibilityNodeInfo3.setTraversalBefore(e5Var, iD);
                        k5Var.e(i7, k1Var3, k5Var.H, null);
                    } else {
                        e5Var = e5Var2;
                    }
                    iD2 = k5Var.G.d(i7);
                    if (iD2 != -1) {
                        c12.t(e5Var.getAndroidViewsHandler$ui(), iD2);
                    }
                    str3 = (String) j02.o(i02Var3, v02.b);
                    if (str3 != null) {
                        k1Var3.g(str3);
                    }
                } else {
                    k5Var = k5Var2;
                    i7 = i;
                    k1Var3 = null;
                }
            }
        }
        if (k5Var.s) {
            if (i7 == k5Var.o) {
                k5Var.q = k1Var3;
            }
            if (i7 == k5Var.p) {
                k5Var.r = k1Var3;
            }
        }
        return k1Var3;
    }

    @Override // defpackage.ao2
    public final k1 k(int i) {
        k5 k5Var = this.h;
        if (i != 1) {
            if (i == 2) {
                return i(k5Var.o);
            }
            qj.r(k3.i("Unknown focus type: ", i));
            return null;
        }
        int i2 = k5Var.p;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return i(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x025f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:271:0x042e  */
    /* JADX WARN: Code duplicated, block: B:272:0x0430  */
    /* JADX WARN: Code duplicated, block: B:275:0x0435  */
    /* JADX WARN: Code duplicated, block: B:276:0x0437  */
    /* JADX WARN: Code duplicated, block: B:279:0x043d  */
    /* JADX WARN: Code duplicated, block: B:280:0x043f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0445  */
    /* JADX WARN: Code duplicated, block: B:284:0x0447  */
    /* JADX WARN: Code duplicated, block: B:287:0x044d  */
    /* JADX WARN: Code duplicated, block: B:288:0x044f  */
    /* JADX WARN: Code duplicated, block: B:291:0x0455  */
    /* JADX WARN: Code duplicated, block: B:292:0x0457  */
    /* JADX WARN: Code duplicated, block: B:299:0x0463  */
    /* JADX WARN: Code duplicated, block: B:308:0x0472  */
    /* JADX WARN: Code duplicated, block: B:310:0x047a  */
    /* JADX WARN: Code duplicated, block: B:313:0x0485  */
    /* JADX WARN: Code duplicated, block: B:316:0x048a  */
    /* JADX WARN: Code duplicated, block: B:318:0x048e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0494  */
    /* JADX WARN: Code duplicated, block: B:321:0x0497  */
    /* JADX WARN: Code duplicated, block: B:324:0x049c  */
    /* JADX WARN: Code duplicated, block: B:325:0x049e  */
    /* JADX WARN: Code duplicated, block: B:328:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:331:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:333:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:335:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:338:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:343:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:346:0x0500  */
    /* JADX WARN: Code duplicated, block: B:350:0x0507  */
    /* JADX WARN: Code duplicated, block: B:352:0x0511  */
    /* JADX WARN: Code duplicated, block: B:355:0x0516 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x0592  */
    /* JADX WARN: Code duplicated, block: B:398:0x059c  */
    /* JADX WARN: Code duplicated, block: B:401:0x05a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:403:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:404:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:406:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:407:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:410:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:412:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:419:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:421:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:423:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:424:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:426:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:428:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:429:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:432:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:499:0x06e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:500:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:502:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:503:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:507:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:509:0x0703  */
    /* JADX WARN: Code duplicated, block: B:512:0x0711  */
    /* JADX WARN: Code duplicated, block: B:517:0x071f  */
    /* JADX WARN: Code duplicated, block: B:529:0x0736  */
    /* JADX WARN: Code duplicated, block: B:534:0x0748  */
    /* JADX WARN: Code duplicated, block: B:541:0x075a  */
    /* JADX WARN: Code duplicated, block: B:543:0x075e  */
    /* JADX WARN: Code duplicated, block: B:545:0x076b  */
    /* JADX WARN: Code duplicated, block: B:547:0x076f  */
    /* JADX WARN: Code duplicated, block: B:560:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:562:0x07d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:563:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:564:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:567:0x07df  */
    /* JADX WARN: Code duplicated, block: B:568:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:571:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:573:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:585:0x0815 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:586:0x0817  */
    /* JADX WARN: Code duplicated, block: B:587:0x0819  */
    /* JADX WARN: Code duplicated, block: B:590:0x081d  */
    /* JADX WARN: Code duplicated, block: B:591:0x081f  */
    /* JADX WARN: Code duplicated, block: B:594:0x0833  */
    /* JADX WARN: Code duplicated, block: B:596:0x0838  */
    /* JADX WARN: Code duplicated, block: B:598:0x0848 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:600:0x084b  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x01b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x005c, please report this as an issue */
    @Override // defpackage.ao2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5.p(int, int, android.os.Bundle):boolean");
    }
}
