package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import ir.alirezaivaz.mygarage.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dv1 {
    public static final kr C;
    public static final kr D;
    public static final hk2 E;
    public static final float F;
    public static final float G;
    public static final y2 H;
    public static jo0 I;
    public static final gt c;
    public static final gt d;
    public static final gt e;
    public static final t8 m;
    public static final t8 n;
    public static final ud o;
    public static ud p;
    public static final xi1 q;
    public static final rt r;
    public static final ru1 s;
    public static final ru1 t;
    public static final ru1 u;
    public static final ru1 v;
    public static final ru1 w;
    public static final rn0 a = new rn0(0, null);
    public static final rn0 b = new rn0(1, null);
    public static final gt f = new gt(new tt(6), false, 1914698275);
    public static final gt g = new gt(new tt(7), false, 1143765004);
    public static final char[] h = {1776, 1777, 1778, 1779, 1780, 1781, 1782, 1783, 1784, 1785};
    public static final kr i = kr.o;
    public static final float j = 1.0f;
    public static final float[] k = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] l = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final kr x = kr.g;
    public static final hk2 y = hk2.j;
    public static final kr z = kr.h;
    public static final float A = 6.0f;
    public static final y32 B = y32.f;

    static {
        byte b2 = 0;
        Object obj = null;
        int i2 = 4;
        c = new gt(new tt(i2), false, -1101741495);
        int i3 = 5;
        d = new gt(new tt(i3), false, 139442921);
        int i4 = 18;
        e = new gt(new qt(i4), false, -584580881);
        int i5 = 10;
        int i6 = 2;
        m = new t8(i6);
        n = new t8(i3);
        o = new ud(obj, obj, obj, i5);
        q = new xi1(i6);
        r = new rt(i6);
        s = new ru1(i2, new xw1(17, b2), new yw1(8));
        t = new ru1(i2, new xw1(i4, b2), new yw1(9));
        u = new ru1(i2, new xw1(19, b2), new yw1(i5));
        v = new ru1(i2, new xw1(20, b2), new yw1(11));
        w = new ru1(i2, new xw1(21, b2), new yw1(12));
        kr krVar = kr.f;
        C = krVar;
        D = krVar;
        E = hk2.f;
        F = 48.0f;
        G = 68.0f;
        H = new y2(1);
    }

    public static final Typeface A(kt1 kt1Var, Context context) {
        int i2 = kt1Var.a;
        ThreadLocal threadLocal = qt1.a;
        Typeface typefaceA = context.isRestricted() ? null : qt1.a(context, i2, new TypedValue(), 0, null, false);
        typefaceA.getClass();
        return typefaceA;
    }

    public static final String B(String str, ak0 ak0Var) {
        str.getClass();
        return z(ak0Var) ? N(str) : str;
    }

    public static final float[] C(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] D(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0216  */
    public static final long E(int i2, int i3, String str) {
        char cCharAt;
        int i4;
        long j2;
        char c2;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        char c4;
        int i10;
        int i11;
        int i12;
        int i13;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (((long) i2) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i2);
        boolean z2 = cCharAt2 == '-';
        if (z2) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i4);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i4) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i4 = i2;
        }
        int length = str.length();
        int i14 = i4;
        long j5 = 0;
        while (true) {
            if (i14 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i15 = cCharAt - '0';
            if (((char) i15) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + ((long) i15);
            i14++;
            cCharAt = i14 < length ? str.charAt(i14) : (char) 0;
            j4 = j2;
        }
        int i16 = i14 - i4;
        char c5 = '0';
        if (i14 == i3 || cCharAt != '.') {
            c2 = ' ';
            c3 = 1;
            i5 = i14;
            i6 = i5;
            i7 = 0;
        } else {
            int i17 = i14 + 1;
            c2 = ' ';
            i5 = i17;
            while (true) {
                c3 = 1;
                if (i3 - i5 < 4) {
                    i13 = i17;
                    break;
                }
                i13 = i17;
                long jCharAt = ((long) str.charAt(i5)) | (((long) str.charAt(i5 + 1)) << 16) | (((long) str.charAt(i5 + 2)) << 32) | (((long) str.charAt(i5 + 3)) << 48);
                long j6 = jCharAt - 13511005043687472L;
                int i18 = (((jCharAt + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i18 < 0) {
                    break;
                }
                j5 = (j5 * 10000) + ((long) i18);
                i5 += 4;
                i17 = i13;
            }
            char cCharAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i5 == i3) {
                        break loop2;
                    }
                    int i19 = cCharAt - '0';
                    if (((char) i19) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + ((long) i19);
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i5);
            }
            i7 = i13 - i5;
            i16 -= i7;
            i6 = i13;
        }
        if (i16 == 0) {
            return (((long) i5) << c2) | (((long) Float.floatToRawIntBits(Float.NaN)) & j2);
        }
        if ((cCharAt | ' ') == 101) {
            i8 = i5 + 1;
            char cCharAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c6 = cCharAt4 == '-' ? c3 : (char) 0;
            if (c6 != 0 || cCharAt4 == '+') {
                i8 = i5 + 2;
            }
            char cCharAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i12 = i7;
                    break;
                }
                int i20 = cCharAt5 - c5;
                i12 = i7;
                if (((char) i20) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i20;
                }
                i8++;
                cCharAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i12;
                c5 = '0';
            }
            if (c6 != 0) {
                i9 = -i9;
            }
            i7 = i12 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i21 = 19;
        if (i16 > 19) {
            char cCharAt6 = str.charAt(i4);
            int i22 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i21;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i16--;
                }
                i22++;
                cCharAt6 = i22 < length ? str.charAt(i22) : (char) 0;
                i21 = 19;
            }
            if (i16 > i10) {
                char cCharAt7 = str.charAt(i4);
                long j7 = 0;
                while (true) {
                    i11 = i4;
                    if (i4 == i14 || Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                        break;
                    }
                    j7 = (j7 * 10) + ((long) (cCharAt7 - '0'));
                    i4 = i11 + 1;
                    cCharAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                if (Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) >= 0) {
                    i7 = (i14 - i11) + i9;
                } else {
                    char cCharAt8 = str.charAt(i6);
                    int i23 = i6;
                    while (i23 != i5 && Long.compare(j7 ^ Long.MIN_VALUE, -8223372036854775808L) < 0) {
                        j7 = (j7 * 10) + ((long) (cCharAt8 - '0'));
                        i23++;
                        cCharAt8 = i23 < length ? str.charAt(i23) : (char) 0;
                    }
                    i7 = (i6 - i23) + i9;
                }
                j3 = j7;
                c4 = c3;
            } else {
                j3 = j5;
                c4 = 0;
            }
        } else {
            j3 = j5;
            c4 = 0;
        }
        if (-10 <= i7 && i7 < 11 && c4 == 0 && Long.compare(j3 ^ Long.MIN_VALUE, -9223372036837998592L) <= 0) {
            float f2 = j3;
            float[] fArr = k;
            float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
            if (z2) {
                f3 = -f3;
            }
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(f3)) & j2);
        }
        if (j3 == 0) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(z2 ? -0.0f : 0.0f)) & j2);
        }
        if (-126 > i7 || i7 >= 128) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j8 = l[i7 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
        long j9 = j3 << iNumberOfLeadingZeros;
        long j10 = j9 & j2;
        long j11 = j9 >>> c2;
        long j12 = j8 & j2;
        long j13 = j8 >>> c2;
        long j14 = j11 * j13;
        long j15 = j13 * j10;
        long j16 = j14 + ((((j11 * j12) + ((j10 * j12) >>> c2)) + (j15 & j2)) >>> c2) + (j15 >>> c2);
        int i24 = (int) (j16 >>> 63);
        long j17 = j16 >>> (i24 + 9);
        int i25 = iNumberOfLeadingZeros + (i24 ^ 1);
        long j18 = j16 & 511;
        if (j18 == 511 || (j18 == 0 && (3 & j17) == 1)) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        long j19 = (j17 + 1) >>> c3;
        if (j19 >= 9007199254740992L) {
            i25--;
            j19 = 4503599627370496L;
        }
        long j20 = j19 & (-4503599627370497L);
        long j21 = (((((long) i7) * 217706) >> 16) + 1087) - ((long) i25);
        if (j21 < 1 || j21 > 2046) {
            return (((long) i8) << c2) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8)))) & j2);
        }
        return (((long) i8) << c2) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j21 << 52) | j20 | (z2 ? Long.MIN_VALUE : 0L)))) & j2);
    }

    public static u71 F(u71 u71Var, nj1 nj1Var, is1 is1Var, yi yiVar, int i2) {
        if ((i2 & 32) != 0) {
            yiVar = null;
        }
        return u71Var.c(new oj1(nj1Var, is1Var, yiVar));
    }

    public static final s51 G(sv0 sv0Var, ej0 ej0Var, ak0 ak0Var) {
        Object q2Var;
        Object obj;
        y12.t(sv0Var, ak0Var);
        Object objT = y12.t(ej0Var, ak0Var);
        Object[] objArr = new Object[0];
        Object objL = ak0Var.L();
        Object obj2 = cv.a;
        if (objL == obj2) {
            objL = new m2(1);
            ak0Var.g0(objL);
        }
        Object obj3 = (String) ex.H(objArr, (ti0) objL, ak0Var, 48);
        s2 s2Var = (s2) ak0Var.j(i31.a);
        if (s2Var == null) {
            ak0Var.W(1213380307);
            Object baseContext = (Context) ak0Var.j(u5.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof s2) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            s2Var = (s2) baseContext;
        } else {
            ak0Var.W(1213379439);
        }
        ak0Var.p(false);
        if (s2Var == null) {
            fu1.h("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        Object obj4 = ((bt) s2Var).l;
        Object objL2 = ak0Var.L();
        if (objL2 == obj2) {
            objL2 = new l2();
            ak0Var.g0(objL2);
        }
        l2 l2Var = (l2) objL2;
        Object objL3 = ak0Var.L();
        if (objL3 == obj2) {
            objL3 = new s51(l2Var);
            ak0Var.g0(objL3);
        }
        s51 s51Var = (s51) objL3;
        boolean zH = ak0Var.h(l2Var) | ak0Var.h(obj4) | ak0Var.f(obj3) | ak0Var.h(sv0Var) | ak0Var.f(objT);
        Object objL4 = ak0Var.L();
        if (zH || objL4 == obj2) {
            obj = sv0Var;
            q2Var = new q2(l2Var, obj4, obj3, obj, objT, 0);
            ak0Var.g0(q2Var);
        } else {
            q2Var = objL4;
            obj = sv0Var;
        }
        ej0 ej0Var2 = (ej0) q2Var;
        boolean zF = ak0Var.f(obj4) | ak0Var.f(obj3) | ak0Var.f(obj);
        Object objL5 = ak0Var.L();
        if (zF || objL5 == obj2) {
            objL5 = new a60(ej0Var2);
            ak0Var.g0(objL5);
        }
        return s51Var;
    }

    public static final void H(o52 o52Var, int i2, Object obj) {
        int iG = o52Var.g(i2);
        Object[] objArr = o52Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = cv.a;
        if (obj == obj2) {
            return;
        }
        hv.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void I(List list, int i2, int i3) {
        int iS = s(i2, list);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < list.size() && ((et0) list.get(iS)).b < i3) {
        }
    }

    public static final Object J(uy uyVar, ij0 ij0Var) throws Throwable {
        ac0 ac0VarA;
        uy uyVarY;
        Thread threadCurrentThread = Thread.currentThread();
        ty tyVar = q90.A;
        xy xyVar = (xy) uyVar.p(tyVar);
        ab0 ab0Var = ab0.e;
        if (xyVar == null) {
            ac0VarA = ig2.a();
            uyVarY = ix.y(ab0Var, uyVar.k(ac0VarA), true);
            j30 j30Var = u50.a;
            if (uyVarY != j30Var && uyVarY.p(tyVar) == null) {
                uyVarY = uyVarY.k(j30Var);
            }
        } else {
            ac0VarA = (ac0) ig2.a.get();
            uyVarY = ix.y(ab0Var, uyVar, true);
            j30 j30Var2 = u50.a;
            if (uyVarY != j30Var2 && uyVarY.p(tyVar) == null) {
                uyVarY = uyVarY.k(j30Var2);
            }
        }
        bj bjVar = new bj(uyVarY, threadCurrentThread, ac0VarA);
        bjVar.j0(hz.e, bjVar, ij0Var);
        ac0 ac0Var = bjVar.i;
        if (ac0Var != null) {
            int i2 = ac0.j;
            ac0Var.K(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jL = ac0Var != null ? ac0Var.L() : Long.MAX_VALUE;
                if (!(bjVar.O() instanceof so0)) {
                    if (ac0Var != null) {
                        int i3 = ac0.j;
                        ac0Var.I(false);
                    }
                    Object objH = nj2.H(bjVar.O());
                    os osVar = objH instanceof os ? (os) objH : null;
                    if (osVar == null) {
                        return objH;
                    }
                    throw osVar.a;
                }
                LockSupport.parkNanos(bjVar, jL);
            } catch (Throwable th) {
                if (ac0Var != null) {
                    int i4 = ac0.j;
                    ac0Var.I(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        bjVar.C(interruptedException);
        throw interruptedException;
    }

    public static final void K(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String L(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final hb0 M(ki2 ki2Var, ej0 ej0Var, Object obj, ak0 ak0Var) {
        ak0Var.S(ki2Var, -422486745, null, 0);
        boolean zG = ki2Var.g();
        tu tuVar = ki2Var.a;
        hb0 hb0Var = hb0.e;
        hb0 hb0Var2 = hb0.g;
        hb0 hb0Var3 = hb0.f;
        if (zG) {
            ak0Var.W(-212166497);
            ak0Var.p(false);
            if (((Boolean) ej0Var.h(obj)).booleanValue()) {
                hb0Var = hb0Var3;
            } else if (((Boolean) ej0Var.h(tuVar.f())).booleanValue()) {
                hb0Var = hb0Var2;
            }
        } else {
            ak0Var.W(-211892364);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = y12.s(Boolean.FALSE);
                ak0Var.g0(objL);
            }
            da1 da1Var = (da1) objL;
            if (((Boolean) ej0Var.h(tuVar.f())).booleanValue()) {
                da1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) ej0Var.h(obj)).booleanValue()) {
                hb0Var = hb0Var3;
            } else if (((Boolean) da1Var.getValue()).booleanValue()) {
                hb0Var = hb0Var2;
            }
            ak0Var.p(false);
        }
        ak0Var.p(false);
        return hb0Var;
    }

    public static final String N(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if ('0' <= cCharAt && cCharAt < ':') {
                cCharAt = h[cCharAt - '0'];
            }
            arrayList.add(Character.valueOf(cCharAt));
        }
        return vq.V(arrayList, "", null, null, null, 62);
    }

    public static final u71 O(boolean z2, f91 f91Var, boolean z3, wu1 wu1Var, ej0 ej0Var) {
        return o71.a.c(new ah2(z2, f91Var, false, z3, wu1Var, ej0Var));
    }

    public static u71 P(u71 u71Var, boolean z2, wu1 wu1Var, ej0 ej0Var) {
        return u71Var.c(new ah2(z2, null, true, true, wu1Var, ej0Var));
    }

    public static final String Q(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    public static final List R(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return cb0.e;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            nz0 nz0Var = (nz0) arrayList.get(i4);
            int index = nz0Var.getIndex();
            if (i2 <= index && index <= i3) {
                arrayList2.add(nz0Var);
            }
        }
        zq.H(arrayList2, n);
        return arrayList2;
    }

    public static final u71 S(u71 u71Var, qs0 qs0Var) {
        return u71Var.c(new ss0(qs0Var));
    }

    public static final Object T(bv1 bv1Var, ej0 ej0Var, sx sxVar) {
        return U(bv1Var, new o9(2, null, bv1Var, ej0Var), sxVar);
    }

    public static final Object U(bv1 bv1Var, ej0 ej0Var, sx sxVar) {
        cv1 cv1Var = new cv1(0, null, ej0Var);
        vh2 vh2Var = (vh2) sxVar.f().p(vh2.f);
        xy xyVar = vh2Var != null ? vh2Var.e : null;
        if (xyVar != null) {
            return nj2.K(xyVar, cv1Var, sxVar);
        }
        om omVar = new om(1, ex.y(sxVar));
        omVar.v();
        try {
            wh2 wh2Var = bv1Var.d;
            if (wh2Var != null) {
                wh2Var.execute(new gt1(omVar, bv1Var, cv1Var));
                return omVar.t();
            }
            ws0.U("internalTransactionExecutor");
            throw null;
        } catch (RejectedExecutionException e2) {
            omVar.o(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
    }

    public static final void a(ki2 ki2Var, ej0 ej0Var, u71 u71Var, sb0 sb0Var, kc0 kc0Var, ij0 ij0Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        Object obj;
        ki2 ki2Var2;
        boolean z2;
        fi2 fi2Var;
        fi2 fi2Var2;
        fi2 fi2Var3;
        fi2 fi2Var4;
        boolean z3;
        fi2 fi2Var5;
        fi2 fi2Var6;
        fi2 fi2VarB;
        kc0 kc0Var2;
        sb0 sb0Var2;
        gt gtVar2 = gtVar;
        ak0Var.X(1912839215);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(ki2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(ej0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.f(u71Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= ak0Var.f(sb0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= ak0Var.f(kc0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= ak0Var.h(ij0Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= ak0Var.h(gtVar2) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (ak0Var.O(i5 & 1, (4793491 & i5) != 4793490)) {
            dk1 dk1Var = ki2Var.d;
            tu tuVar = ki2Var.a;
            if (((Boolean) ej0Var.h(dk1Var.getValue())).booleanValue() || ((Boolean) ej0Var.h(tuVar.f())).booleanValue() || ki2Var.g() || ki2Var.d()) {
                ak0Var.W(-232413539);
                int i6 = i5 & 14;
                int i7 = i6 | 48;
                int i8 = i7 & 14;
                boolean z4 = ((i8 ^ 6) > 4 && ak0Var.f(ki2Var)) || (i7 & 6) == 4;
                Object objL = ak0Var.L();
                Object obj2 = cv.a;
                if (z4 || objL == obj2) {
                    objL = tuVar.f();
                    ak0Var.g0(objL);
                }
                if (ki2Var.g()) {
                    objL = tuVar.f();
                }
                ak0Var.W(1844425648);
                hb0 hb0VarM = M(ki2Var, ej0Var, objL, ak0Var);
                ak0Var.p(false);
                Object value = ki2Var.d.getValue();
                ak0Var.W(1844425648);
                hb0 hb0VarM2 = M(ki2Var, ej0Var, value, ak0Var);
                ak0Var.p(false);
                int i9 = i8 | 3072;
                v22 v22Var = oi2.a;
                int i10 = (i9 & 14) ^ 6;
                boolean z5 = (i10 > 4 && ak0Var.f(ki2Var)) || (i9 & 6) == 4;
                Object objL2 = ak0Var.L();
                if (z5 || objL2 == obj2) {
                    objL2 = new ki2(new ea1(hb0VarM), ki2Var, ki2Var.c.concat(" > EnterExitTransition"));
                    ak0Var.g0(objL2);
                }
                ki2 ki2Var3 = (ki2) objL2;
                boolean zF = ((i10 > 4 && ak0Var.f(ki2Var)) || (i9 & 6) == 4) | ak0Var.f(ki2Var3);
                Object objL3 = ak0Var.L();
                if (zF || objL3 == obj2) {
                    objL3 = new kc1(21, ki2Var, ki2Var3);
                    ak0Var.g0(objL3);
                }
                s5.e(ki2Var3, (ej0) objL3, ak0Var);
                if (ki2Var.g()) {
                    ki2Var3.k(hb0VarM, hb0VarM2);
                } else {
                    ki2Var3.p(hb0VarM2);
                    ki2Var3.k.setValue(Boolean.FALSE);
                }
                Object objT = y12.t(ij0Var, ak0Var);
                tu tuVar2 = ki2Var3.a;
                tu tuVar3 = ki2Var3.a;
                dk1 dk1Var2 = ki2Var3.d;
                Object objG = ij0Var.g(tuVar2.f(), dk1Var2.getValue());
                boolean zF2 = ak0Var.f(ki2Var3) | ak0Var.f(objT);
                Object objL4 = ak0Var.L();
                sx sxVar = null;
                if (zF2 || objL4 == obj2) {
                    objL4 = new g(1, sxVar, ki2Var3, objT);
                    ak0Var.g0(objL4);
                }
                ij0 ij0Var2 = (ij0) objL4;
                Object objL5 = ak0Var.L();
                if (objL5 == obj2) {
                    objL5 = y12.s(objG);
                    ak0Var.g0(objL5);
                }
                da1 da1Var = (da1) objL5;
                boolean zH = ak0Var.h(ij0Var2);
                Object objL6 = ak0Var.L();
                if (zH || objL6 == obj2) {
                    objL6 = new f72(ij0Var2, da1Var, sxVar, 0);
                    ak0Var.g0(objL6);
                }
                s5.o((ij0) objL6, ak0Var, ll2.a);
                Object objF = tuVar3.f();
                hb0 hb0Var = hb0.g;
                if (objF == hb0Var && dk1Var2.getValue() == hb0Var && ((Boolean) da1Var.getValue()).booleanValue()) {
                    ak0Var.W(-272333293);
                    ak0Var.p(false);
                    z2 = false;
                } else {
                    ak0Var.W(-231383533);
                    boolean z6 = i6 == 4;
                    Object objL7 = ak0Var.L();
                    if (z6 || objL7 == obj2) {
                        objL7 = new hb();
                        ak0Var.g0(objL7);
                    }
                    hb hbVar = (hb) objL7;
                    mj2 mj2Var = nb0.a;
                    mj2 mj2Var2 = ir2.b0;
                    Object objL8 = ak0Var.L();
                    if (objL8 == obj2) {
                        objL8 = wv.l;
                        ak0Var.g0(objL8);
                    }
                    ti0 ti0Var = (ti0) objL8;
                    boolean zF3 = ak0Var.f(ki2Var3);
                    Object objL9 = ak0Var.L();
                    if (zF3 || objL9 == obj2) {
                        objL9 = y12.s(sb0Var);
                        ak0Var.g0(objL9);
                    }
                    da1 da1Var2 = (da1) objL9;
                    Object objF2 = tuVar3.f();
                    Object value2 = dk1Var2.getValue();
                    hb0 hb0Var2 = hb0.f;
                    if (objF2 == value2 && tuVar3.f() == hb0Var2) {
                        if (ki2Var3.g()) {
                            da1Var2.setValue(sb0Var);
                        } else {
                            da1Var2.setValue(sb0.b);
                        }
                    } else if (dk1Var2.getValue() == hb0Var2) {
                        da1Var2.setValue(((sb0) da1Var2.getValue()).a(sb0Var));
                    }
                    sb0 sb0Var3 = (sb0) da1Var2.getValue();
                    boolean zF4 = ak0Var.f(ki2Var3);
                    Object objL10 = ak0Var.L();
                    if (zF4 || objL10 == obj2) {
                        objL10 = y12.s(kc0Var);
                        ak0Var.g0(objL10);
                    }
                    da1 da1Var3 = (da1) objL10;
                    if (tuVar3.f() == dk1Var2.getValue() && tuVar3.f() == hb0Var2) {
                        if (ki2Var3.g()) {
                            da1Var3.setValue(kc0Var);
                        } else {
                            da1Var3.setValue(kc0.b);
                        }
                    } else if (dk1Var2.getValue() != hb0Var2) {
                        da1Var3.setValue(((kc0) da1Var3.getValue()).a(kc0Var));
                    }
                    kc0 kc0Var3 = (kc0) da1Var3.getValue();
                    li2 li2Var = sb0Var3.a;
                    li2 li2Var2 = kc0Var3.a;
                    i52 i52Var = li2Var.b;
                    jo joVar = li2Var.c;
                    boolean z7 = (i52Var == null && li2Var2.b == null) ? false : true;
                    boolean z8 = (joVar == null && li2Var2.c == null) ? false : true;
                    if (z7) {
                        ak0Var.W(133792645);
                        Object objL11 = ak0Var.L();
                        if (objL11 == obj2) {
                            objL11 = "Built-in slide";
                            ak0Var.g0("Built-in slide");
                        }
                        obj = obj2;
                        ki2Var2 = ki2Var3;
                        z2 = false;
                        fi2Var = null;
                        fi2 fi2VarB2 = oi2.b(ki2Var2, mj2Var2, (String) objL11, ak0Var, 384, 0);
                        ak0Var.p(false);
                        fi2Var2 = fi2VarB2;
                    } else {
                        obj = obj2;
                        ki2Var2 = ki2Var3;
                        z2 = false;
                        fi2Var = null;
                        ak0Var.W(133898448);
                        ak0Var.p(false);
                        fi2Var2 = null;
                    }
                    if (z8) {
                        ak0Var.W(133990239);
                        mj2 mj2Var3 = ir2.c0;
                        Object objL12 = ak0Var.L();
                        if (objL12 == obj) {
                            objL12 = "Built-in shrink/expand";
                            ak0Var.g0("Built-in shrink/expand");
                        }
                        fi2 fi2VarB3 = oi2.b(ki2Var2, mj2Var3, (String) objL12, ak0Var, 384, 0);
                        ak0Var.p(z2);
                        fi2Var3 = fi2VarB3;
                    } else {
                        ak0Var.W(134101063);
                        ak0Var.p(z2);
                        fi2Var3 = fi2Var;
                    }
                    if (z8) {
                        ak0Var.W(134174689);
                        Object objL13 = ak0Var.L();
                        if (objL13 == obj) {
                            objL13 = "Built-in InterruptionHandlingOffset";
                            ak0Var.g0("Built-in InterruptionHandlingOffset");
                        }
                        fi2 fi2VarB4 = oi2.b(ki2Var2, mj2Var2, (String) objL13, ak0Var, 384, 0);
                        ak0Var.p(z2);
                        fi2Var4 = fi2VarB4;
                    } else {
                        ak0Var.W(134345095);
                        ak0Var.p(z2);
                        fi2Var4 = fi2Var;
                    }
                    boolean z9 = !z8;
                    float[] fArr = qr.a;
                    ak0Var.W(135150476);
                    ak0Var.p(z2);
                    mj2 mj2Var4 = ir2.V;
                    boolean z10 = (li2Var.a == null && li2Var2.a == null) ? z2 : true;
                    boolean z11 = (li2Var.d == null && li2Var2.d == null) ? z2 : true;
                    if (z10) {
                        ak0Var.W(-703879421);
                        Object objL14 = ak0Var.L();
                        if (objL14 == obj) {
                            objL14 = "Built-in alpha";
                            ak0Var.g0("Built-in alpha");
                        }
                        String str = (String) objL14;
                        z3 = z9;
                        fi2 fi2VarB5 = oi2.b(ki2Var2, mj2Var4, str, ak0Var, 384, 0);
                        ak0Var.p(z2);
                        fi2Var5 = fi2VarB5;
                    } else {
                        z3 = z9;
                        ak0Var.W(-703709976);
                        ak0Var.p(z2);
                        fi2Var5 = fi2Var;
                    }
                    if (z11) {
                        ak0Var.W(-703642333);
                        Object objL15 = ak0Var.L();
                        if (objL15 == obj) {
                            objL15 = "Built-in scale";
                            ak0Var.g0("Built-in scale");
                        }
                        fi2 fi2VarB6 = oi2.b(ki2Var2, mj2Var4, (String) objL15, ak0Var, 384, 0);
                        ak0Var.p(z2);
                        fi2Var6 = fi2VarB6;
                    } else {
                        ak0Var.W(-703472888);
                        ak0Var.p(z2);
                        fi2Var6 = fi2Var;
                    }
                    if (z11) {
                        ak0Var.W(-703395232);
                        fi2VarB = oi2.b(ki2Var2, nb0.a, "TransformOriginInterruptionHandling", ak0Var, 384, 0);
                        ak0Var.p(z2);
                    } else {
                        ak0Var.W(-703222904);
                        ak0Var.p(z2);
                        fi2VarB = fi2Var;
                    }
                    boolean zH2 = ak0Var.h(fi2Var5) | ak0Var.f(sb0Var3) | ak0Var.f(kc0Var3) | ak0Var.h(fi2Var6) | ak0Var.f(ki2Var2) | ak0Var.h(fi2VarB);
                    Object objL16 = ak0Var.L();
                    if (zH2 || objL16 == obj) {
                        kc0Var2 = kc0Var3;
                        sb0Var2 = sb0Var3;
                        objL16 = new jb0(fi2Var5, fi2Var6, ki2Var2, sb0Var2, kc0Var2, fi2VarB);
                        ak0Var.g0(objL16);
                    } else {
                        kc0Var2 = kc0Var3;
                        sb0Var2 = sb0Var3;
                    }
                    jb0 jb0Var = (jb0) objL16;
                    boolean zG = ak0Var.g(z3) | ak0Var.f(ti0Var);
                    Object objL17 = ak0Var.L();
                    if (zG || objL17 == obj) {
                        objL17 = new lb0(z3, ti0Var);
                        ak0Var.g0(objL17);
                    }
                    r71 r71Var = r71.a;
                    u71 u71VarC = nj2.t(r71Var, (ej0) objL17).c(new ib0(ki2Var2, fi2Var3, fi2Var4, fi2Var2, sb0Var2, kc0Var2, ti0Var, jb0Var)).c(r71Var);
                    ak0Var.W(-7432681);
                    ak0Var.p(z2);
                    u71 u71VarC2 = u71Var.c(u71VarC.c(r71Var));
                    Object objL18 = ak0Var.L();
                    if (objL18 == obj) {
                        objL18 = new bb(hbVar);
                        ak0Var.g0(objL18);
                    }
                    bb bbVar = (bb) objL18;
                    int iHashCode = Long.hashCode(ak0Var.T);
                    sl1 sl1VarL = ak0Var.l();
                    u71 u71VarB = nj2.B(ak0Var, u71VarC2);
                    wu.c.getClass();
                    ti0 ti0Var2 = vu.b;
                    ak0Var.Z();
                    if (ak0Var.S) {
                        ak0Var.k(ti0Var2);
                    } else {
                        ak0Var.j0();
                    }
                    p12.l(vu.f, ak0Var, bbVar);
                    p12.l(vu.e, ak0Var, sl1VarL);
                    p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
                    p12.k(ak0Var, vu.h);
                    p12.l(vu.d, ak0Var, u71VarB);
                    gtVar2 = gtVar;
                    gtVar2.d(hbVar, ak0Var, Integer.valueOf((i5 >> 18) & 112));
                    ak0Var.p(true);
                    ak0Var.p(z2);
                }
                ak0Var.p(z2);
            } else {
                ak0Var.W(-272333293);
                ak0Var.p(false);
            }
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new la(ki2Var, ej0Var, u71Var, sb0Var, kc0Var, ij0Var, gtVar2, i2);
        }
    }

    public static final void b(boolean z2, u71 u71Var, sb0 sb0Var, kc0 kc0Var, String str, gt gtVar, ak0 ak0Var, int i2) {
        u71 u71Var2;
        String str2;
        ak0Var.X(234057107);
        int i3 = i2 | (ak0Var.g(z2) ? 32 : 16) | 384 | (ak0Var.f(sb0Var) ? 2048 : 1024) | (ak0Var.f(kc0Var) ? 16384 : 8192) | 196608;
        if (ak0Var.O(i3 & 1, (599185 & i3) != 599184)) {
            ki2 ki2VarE = oi2.e(Boolean.valueOf(z2), "AnimatedVisibility", ak0Var, ((i3 >> 3) & 14) | 48);
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = x4.r;
                ak0Var.g0(objL);
            }
            r71 r71Var = r71.a;
            d(ki2VarE, (ej0) objL, r71Var, sb0Var, kc0Var, gtVar, ak0Var, (i3 & 57344) | (i3 & 7168) | 432 | 196608);
            u71Var2 = r71Var;
            str2 = "AnimatedVisibility";
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            str2 = str;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new eb(z2, u71Var2, sb0Var, kc0Var, str2, gtVar, i2);
        }
    }

    public static final void c(boolean z2, u71 u71Var, sb0 sb0Var, kc0 kc0Var, String str, gt gtVar, ak0 ak0Var, int i2, int i3) {
        int i4;
        u71 u71Var2;
        String str2;
        ak0Var.X(-1448730565);
        if ((i2 & 6) == 0) {
            i4 = (ak0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ak0Var.f(sb0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= ak0Var.f(kc0Var) ? 2048 : 1024;
        }
        int i6 = i4 | 24576;
        if ((196608 & i2) == 0) {
            i6 |= ak0Var.h(gtVar) ? 131072 : 65536;
        }
        if (ak0Var.O(i6 & 1, (74899 & i6) != 74898)) {
            if (i5 != 0) {
                u71Var = r71.a;
            }
            u71Var2 = u71Var;
            ki2 ki2VarE = oi2.e(Boolean.valueOf(z2), "AnimatedVisibility", ak0Var, (i6 & 14) | ((i6 >> 9) & 112));
            Object objL = ak0Var.L();
            if (objL == cv.a) {
                objL = x4.q;
                ak0Var.g0(objL);
            }
            int i7 = i6 << 3;
            d(ki2VarE, (ej0) objL, u71Var2, sb0Var, kc0Var, gtVar, ak0Var, (i7 & 57344) | (i7 & 896) | 48 | (i7 & 7168) | (i6 & 458752));
            str2 = "AnimatedVisibility";
        } else {
            ak0Var.R();
            u71Var2 = u71Var;
            str2 = str;
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new db(z2, u71Var2, sb0Var, kc0Var, str2, gtVar, i2, i3);
        }
    }

    public static final void d(ki2 ki2Var, ej0 ej0Var, u71 u71Var, sb0 sb0Var, kc0 kc0Var, gt gtVar, ak0 ak0Var, int i2) {
        int i3;
        sb0 sb0Var2;
        kc0 kc0Var2;
        gt gtVar2;
        ak0Var.X(1706321816);
        if ((i2 & 6) == 0) {
            i3 = (ak0Var.f(ki2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= ak0Var.h(ej0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= ak0Var.f(u71Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            sb0Var2 = sb0Var;
            i3 |= ak0Var.f(sb0Var2) ? 2048 : 1024;
        } else {
            sb0Var2 = sb0Var;
        }
        if ((i2 & 24576) == 0) {
            kc0Var2 = kc0Var;
            i3 |= ak0Var.f(kc0Var2) ? 16384 : 8192;
        } else {
            kc0Var2 = kc0Var;
        }
        if ((i2 & 196608) == 0) {
            gtVar2 = gtVar;
            i3 |= ak0Var.h(gtVar2) ? 131072 : 65536;
        } else {
            gtVar2 = gtVar;
        }
        if (ak0Var.O(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z2 = (i4 == 32) | (i5 == 4);
            Object objL = ak0Var.L();
            is1 is1Var = cv.a;
            if (z2 || objL == is1Var) {
                objL = new fb(ej0Var, ki2Var);
                ak0Var.g0(objL);
            }
            u71 u71VarK0 = sv0.k0(u71Var, (jj0) objL);
            Object objL2 = ak0Var.L();
            if (objL2 == is1Var) {
                objL2 = ra.h;
                ak0Var.g0(objL2);
            }
            a(ki2Var, ej0Var, u71VarK0, sb0Var2, kc0Var2, (ij0) objL2, gtVar2, ak0Var, 196608 | i5 | i4 | (i3 & 7168) | (57344 & i3) | ((i3 << 6) & 29360128));
        } else {
            ak0Var.R();
        }
        lr1 lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new qa(ki2Var, ej0Var, u71Var, sb0Var, kc0Var, gtVar, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0115  */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x018f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0192 A[Catch: RejectedExecutionException -> 0x0190, TryCatch #0 {RejectedExecutionException -> 0x0190, blocks: (B:120:0x0189, B:128:0x0199, B:130:0x01ab, B:136:0x01b8, B:138:0x01ca, B:142:0x01d1, B:132:0x01b1, B:124:0x0192), top: B:167:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0196  */
    /* JADX WARN: Code duplicated, block: B:127:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ab A[Catch: RejectedExecutionException -> 0x0190, TryCatch #0 {RejectedExecutionException -> 0x0190, blocks: (B:120:0x0189, B:128:0x0199, B:130:0x01ab, B:136:0x01b8, B:138:0x01ca, B:142:0x01d1, B:132:0x01b1, B:124:0x0192), top: B:167:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x01b1 A[Catch: RejectedExecutionException -> 0x0190, TryCatch #0 {RejectedExecutionException -> 0x0190, blocks: (B:120:0x0189, B:128:0x0199, B:130:0x01ab, B:136:0x01b8, B:138:0x01ca, B:142:0x01d1, B:132:0x01b1, B:124:0x0192), top: B:167:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ca A[Catch: RejectedExecutionException -> 0x0190, TryCatch #0 {RejectedExecutionException -> 0x0190, blocks: (B:120:0x0189, B:128:0x0199, B:130:0x01ab, B:136:0x01b8, B:138:0x01ca, B:142:0x01d1, B:132:0x01b1, B:124:0x0192), top: B:167:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x01d1 A[Catch: RejectedExecutionException -> 0x0190, TRY_LEAVE, TryCatch #0 {RejectedExecutionException -> 0x0190, blocks: (B:120:0x0189, B:128:0x0199, B:130:0x01ab, B:136:0x01b8, B:138:0x01ca, B:142:0x01d1, B:132:0x01b1, B:124:0x0192), top: B:167:0x0189 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:156:0x0231  */
    /* JADX WARN: Code duplicated, block: B:157:0x0235  */
    /* JADX WARN: Code duplicated, block: B:159:0x025a  */
    /* JADX WARN: Code duplicated, block: B:161:0x025e  */
    /* JADX WARN: Code duplicated, block: B:164:0x026a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0109  */
    public static final void e(final String str, final u71 u71Var, final vf2 vf2Var, int i2, boolean z2, final int i3, int i4, ak0 ak0Var, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        boolean z3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zH;
        int i15;
        boolean z4;
        final int i16;
        final int i17;
        final boolean z5;
        lr1 lr1VarR;
        int i18;
        jg0 jg0Var;
        int i19;
        Executor executor;
        boolean z6;
        ti0 ti0Var;
        Boolean boolValueOf;
        kw0 kw0Var;
        Object obj;
        boolean z7;
        boolean zD;
        Object objL;
        boolean z8;
        int i20;
        ak0Var.X(-1040751001);
        if ((i5 & 6) == 0) {
            i7 = (ak0Var.f(str) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= ak0Var.f(u71Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= ak0Var.f(vf2Var) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i7 |= ak0Var.h(null) ? 2048 : 1024;
        }
        int i21 = i6 & 16;
        if (i21 == 0) {
            if ((i5 & 24576) == 0) {
                i8 = i2;
                i7 |= ak0Var.d(i8) ? 16384 : 8192;
            }
            i9 = i6 & 32;
            if (i9 != 0) {
                if ((196608 & i5) == 0) {
                    z3 = z2;
                    if (ak0Var.g(z3)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i7 |= i10;
                }
                if ((1572864 & i5) == 0) {
                    if (ak0Var.d(i3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i7 |= i20;
                }
                i11 = i6 & 128;
                if (i11 != 0) {
                    i7 |= 12582912;
                    i12 = i4;
                } else {
                    i12 = i4;
                    if ((i5 & 12582912) == 0) {
                        if (ak0Var.d(i12)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i7 |= i13;
                    }
                }
                i14 = i7 | 100663296;
                if ((i6 & 512) != 0) {
                    i14 = i7 | 905969664;
                } else if ((805306368 & i5) == 0) {
                    if ((1073741824 & i5) == 0) {
                        zH = ak0Var.f(null);
                    } else {
                        zH = ak0Var.h(null);
                    }
                    if (zH) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i14 |= i15;
                }
                if ((i14 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (ak0Var.O(i14 & 1, z4)) {
                    if (i21 != 0) {
                        i8 = 1;
                    }
                    if (i9 != 0) {
                        z3 = true;
                    }
                    if (i11 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i12;
                    }
                    ux.P(i18, i3);
                    if (ak0Var.j(g02.a) == null) {
                        fu1.c();
                        return;
                    }
                    ak0Var.W(356914239);
                    ak0Var.p(false);
                    jg0Var = (jg0) ak0Var.j(yv.k);
                    i19 = (i14 & 14) | ((i14 >> 3) & 112);
                    executor = (Executor) ak0Var.j(ei.a);
                    if (executor != null) {
                        int length = str.length();
                        if (Build.VERSION.SDK_INT >= 28 && length >= 8 && length < 1000) {
                            boolValueOf = ei.b;
                            if (boolValueOf == null) {
                                if (Runtime.getRuntime().availableProcessors() >= 4) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                boolValueOf = Boolean.valueOf(z8);
                                ei.b = boolValueOf;
                            }
                            if (boolValueOf.booleanValue()) {
                                ak0Var.W(1254274527);
                                kw0Var = (kw0) ak0Var.j(yv.n);
                                obj = (m40) ak0Var.j(yv.h);
                                if (((i19 & 112) ^ 48) > 32) {
                                    try {
                                        if (!ak0Var.f(vf2Var)) {
                                            z7 = true;
                                        } else if ((i19 & 48) == 32) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                                        objL = ak0Var.L();
                                        if (!zD || objL == cv.a) {
                                            z6 = false;
                                            try {
                                                Object diVar = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                                jg0Var = jg0Var;
                                                try {
                                                    ak0Var.g0(diVar);
                                                    objL = diVar;
                                                } catch (RejectedExecutionException unused) {
                                                }
                                            } catch (RejectedExecutionException unused2) {
                                                jg0Var = jg0Var;
                                            }
                                        } else {
                                            z6 = false;
                                        }
                                        executor.execute((Runnable) objL);
                                    } catch (RejectedExecutionException unused3) {
                                        z6 = false;
                                    }
                                } else {
                                    if ((i19 & 48) == 32) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                                    objL = ak0Var.L();
                                    if (zD) {
                                        z6 = false;
                                        Object diVar2 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                        jg0Var = jg0Var;
                                        ak0Var.g0(diVar2);
                                        objL = diVar2;
                                        executor.execute((Runnable) objL);
                                    } else {
                                        z6 = false;
                                        Object diVar3 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                        jg0Var = jg0Var;
                                        ak0Var.g0(diVar3);
                                        objL = diVar3;
                                        executor.execute((Runnable) objL);
                                    }
                                }
                            }
                            ak0Var.p(z6);
                            ak0Var.W(357875859);
                            ak0Var.p(z6);
                            i17 = i8;
                            i16 = i18;
                            z5 = z3;
                            u71 u71VarC = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
                            n6 n6Var = n6.e;
                            int iHashCode = Long.hashCode(ak0Var.T);
                            u71 u71VarB = nj2.B(ak0Var, u71VarC);
                            sl1 sl1VarL = ak0Var.l();
                            wu.c.getClass();
                            ti0Var = vu.b;
                            ak0Var.Z();
                            if (ak0Var.S) {
                                ak0Var.k(ti0Var);
                            } else {
                                ak0Var.j0();
                            }
                            p12.l(vu.f, ak0Var, n6Var);
                            p12.l(vu.e, ak0Var, sl1VarL);
                            p12.k(ak0Var, vu.h);
                            p12.l(vu.d, ak0Var, u71VarB);
                            p12.f(ak0Var, Integer.valueOf(iHashCode), vu.g);
                            ak0Var.p(true);
                        }
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    ak0Var.W(1250991751);
                    ak0Var.p(z6);
                    ak0Var.W(357875859);
                    ak0Var.p(z6);
                    i17 = i8;
                    i16 = i18;
                    z5 = z3;
                    u71 u71VarC2 = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
                    n6 n6Var2 = n6.e;
                    int iHashCode2 = Long.hashCode(ak0Var.T);
                    u71 u71VarB2 = nj2.B(ak0Var, u71VarC2);
                    sl1 sl1VarL2 = ak0Var.l();
                    wu.c.getClass();
                    ti0Var = vu.b;
                    ak0Var.Z();
                    if (ak0Var.S) {
                        ak0Var.k(ti0Var);
                    } else {
                        ak0Var.j0();
                    }
                    p12.l(vu.f, ak0Var, n6Var2);
                    p12.l(vu.e, ak0Var, sl1VarL2);
                    p12.k(ak0Var, vu.h);
                    p12.l(vu.d, ak0Var, u71VarB2);
                    p12.f(ak0Var, Integer.valueOf(iHashCode2), vu.g);
                    ak0Var.p(true);
                } else {
                    ak0Var.R();
                    i16 = i12;
                    i17 = i8;
                    z5 = z3;
                }
                lr1VarR = ak0Var.r();
                if (lr1VarR != null) {
                    lr1VarR.d = new ij0() { // from class: ci
                        @Override // defpackage.ij0
                        public final Object g(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            dv1.e(str, u71Var, vf2Var, i17, z5, i3, i16, (ak0) obj2, ei1.P(i5 | 1), i6);
                            return ll2.a;
                        }
                    };
                }
            }
            i7 |= 196608;
            z3 = z2;
            if ((1572864 & i5) == 0) {
                if (ak0Var.d(i3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i7 |= i20;
            }
            i11 = i6 & 128;
            if (i11 != 0) {
                i7 |= 12582912;
                i12 = i4;
            } else {
                i12 = i4;
                if ((i5 & 12582912) == 0) {
                    if (ak0Var.d(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
            }
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = ak0Var.f(null);
                } else {
                    zH = ak0Var.h(null);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ak0Var.O(i14 & 1, z4)) {
                if (i21 != 0) {
                    i8 = 1;
                }
                if (i9 != 0) {
                    z3 = true;
                }
                if (i11 != 0) {
                    i18 = 1;
                } else {
                    i18 = i12;
                }
                ux.P(i18, i3);
                if (ak0Var.j(g02.a) == null) {
                    fu1.c();
                    return;
                }
                ak0Var.W(356914239);
                ak0Var.p(false);
                jg0Var = (jg0) ak0Var.j(yv.k);
                i19 = (i14 & 14) | ((i14 >> 3) & 112);
                executor = (Executor) ak0Var.j(ei.a);
                if (executor != null) {
                    int length2 = str.length();
                    if (Build.VERSION.SDK_INT >= 28) {
                        boolValueOf = ei.b;
                        if (boolValueOf == null) {
                            if (Runtime.getRuntime().availableProcessors() >= 4) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            boolValueOf = Boolean.valueOf(z8);
                            ei.b = boolValueOf;
                        }
                        if (boolValueOf.booleanValue()) {
                            ak0Var.W(1254274527);
                            kw0Var = (kw0) ak0Var.j(yv.n);
                            obj = (m40) ak0Var.j(yv.h);
                            if (((i19 & 112) ^ 48) > 32) {
                                if (!ak0Var.f(vf2Var)) {
                                    z7 = true;
                                } else if ((i19 & 48) == 32) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                                objL = ak0Var.L();
                                if (zD) {
                                    z6 = false;
                                    Object diVar4 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar4);
                                    objL = diVar4;
                                    executor.execute((Runnable) objL);
                                } else {
                                    z6 = false;
                                    Object diVar5 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar5);
                                    objL = diVar5;
                                    executor.execute((Runnable) objL);
                                }
                            } else {
                                if ((i19 & 48) == 32) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                                objL = ak0Var.L();
                                if (zD) {
                                    z6 = false;
                                    Object diVar6 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar6);
                                    objL = diVar6;
                                    executor.execute((Runnable) objL);
                                } else {
                                    z6 = false;
                                    Object diVar7 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar7);
                                    objL = diVar7;
                                    executor.execute((Runnable) objL);
                                }
                            }
                        }
                        ak0Var.p(z6);
                        ak0Var.W(357875859);
                        ak0Var.p(z6);
                        i17 = i8;
                        i16 = i18;
                        z5 = z3;
                        u71 u71VarC3 = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
                        n6 n6Var3 = n6.e;
                        int iHashCode3 = Long.hashCode(ak0Var.T);
                        u71 u71VarB3 = nj2.B(ak0Var, u71VarC3);
                        sl1 sl1VarL3 = ak0Var.l();
                        wu.c.getClass();
                        ti0Var = vu.b;
                        ak0Var.Z();
                        if (ak0Var.S) {
                            ak0Var.k(ti0Var);
                        } else {
                            ak0Var.j0();
                        }
                        p12.l(vu.f, ak0Var, n6Var3);
                        p12.l(vu.e, ak0Var, sl1VarL3);
                        p12.k(ak0Var, vu.h);
                        p12.l(vu.d, ak0Var, u71VarB3);
                        p12.f(ak0Var, Integer.valueOf(iHashCode3), vu.g);
                        ak0Var.p(true);
                    }
                    z6 = false;
                } else {
                    z6 = false;
                }
                ak0Var.W(1250991751);
                ak0Var.p(z6);
                ak0Var.W(357875859);
                ak0Var.p(z6);
                i17 = i8;
                i16 = i18;
                z5 = z3;
                u71 u71VarC4 = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
                n6 n6Var4 = n6.e;
                int iHashCode4 = Long.hashCode(ak0Var.T);
                u71 u71VarB4 = nj2.B(ak0Var, u71VarC4);
                sl1 sl1VarL4 = ak0Var.l();
                wu.c.getClass();
                ti0Var = vu.b;
                ak0Var.Z();
                if (ak0Var.S) {
                    ak0Var.k(ti0Var);
                } else {
                    ak0Var.j0();
                }
                p12.l(vu.f, ak0Var, n6Var4);
                p12.l(vu.e, ak0Var, sl1VarL4);
                p12.k(ak0Var, vu.h);
                p12.l(vu.d, ak0Var, u71VarB4);
                p12.f(ak0Var, Integer.valueOf(iHashCode4), vu.g);
                ak0Var.p(true);
            } else {
                ak0Var.R();
                i16 = i12;
                i17 = i8;
                z5 = z3;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ci
                    @Override // defpackage.ij0
                    public final Object g(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        dv1.e(str, u71Var, vf2Var, i17, z5, i3, i16, (ak0) obj2, ei1.P(i5 | 1), i6);
                        return ll2.a;
                    }
                };
            }
        }
        i7 |= 24576;
        i8 = i2;
        i9 = i6 & 32;
        if (i9 != 0) {
            if ((196608 & i5) == 0) {
                z3 = z2;
                if (ak0Var.g(z3)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i7 |= i10;
            }
            if ((1572864 & i5) == 0) {
                if (ak0Var.d(i3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i7 |= i20;
            }
            i11 = i6 & 128;
            if (i11 != 0) {
                i7 |= 12582912;
                i12 = i4;
            } else {
                i12 = i4;
                if ((i5 & 12582912) == 0) {
                    if (ak0Var.d(i12)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i7 |= i13;
                }
            }
            i14 = i7 | 100663296;
            if ((i6 & 512) != 0) {
                i14 = i7 | 905969664;
            } else if ((805306368 & i5) == 0) {
                if ((1073741824 & i5) == 0) {
                    zH = ak0Var.f(null);
                } else {
                    zH = ak0Var.h(null);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i14 |= i15;
            }
            if ((i14 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ak0Var.O(i14 & 1, z4)) {
                if (i21 != 0) {
                    i8 = 1;
                }
                if (i9 != 0) {
                    z3 = true;
                }
                if (i11 != 0) {
                    i18 = 1;
                } else {
                    i18 = i12;
                }
                ux.P(i18, i3);
                if (ak0Var.j(g02.a) == null) {
                    fu1.c();
                    return;
                }
                ak0Var.W(356914239);
                ak0Var.p(false);
                jg0Var = (jg0) ak0Var.j(yv.k);
                i19 = (i14 & 14) | ((i14 >> 3) & 112);
                executor = (Executor) ak0Var.j(ei.a);
                if (executor != null) {
                    int length3 = str.length();
                    if (Build.VERSION.SDK_INT >= 28) {
                        boolValueOf = ei.b;
                        if (boolValueOf == null) {
                            if (Runtime.getRuntime().availableProcessors() >= 4) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            boolValueOf = Boolean.valueOf(z8);
                            ei.b = boolValueOf;
                        }
                        if (boolValueOf.booleanValue()) {
                            ak0Var.W(1254274527);
                            kw0Var = (kw0) ak0Var.j(yv.n);
                            obj = (m40) ak0Var.j(yv.h);
                            if (((i19 & 112) ^ 48) > 32) {
                                if (!ak0Var.f(vf2Var)) {
                                    z7 = true;
                                } else if ((i19 & 48) == 32) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                                objL = ak0Var.L();
                                if (zD) {
                                    z6 = false;
                                    Object diVar8 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar8);
                                    objL = diVar8;
                                    executor.execute((Runnable) objL);
                                } else {
                                    z6 = false;
                                    Object diVar9 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar9);
                                    objL = diVar9;
                                    executor.execute((Runnable) objL);
                                }
                            } else {
                                if ((i19 & 48) == 32) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                                objL = ak0Var.L();
                                if (zD) {
                                    z6 = false;
                                    Object diVar10 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar10);
                                    objL = diVar10;
                                    executor.execute((Runnable) objL);
                                } else {
                                    z6 = false;
                                    Object diVar11 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                    jg0Var = jg0Var;
                                    ak0Var.g0(diVar11);
                                    objL = diVar11;
                                    executor.execute((Runnable) objL);
                                }
                            }
                        }
                        ak0Var.p(z6);
                        ak0Var.W(357875859);
                        ak0Var.p(z6);
                        i17 = i8;
                        i16 = i18;
                        z5 = z3;
                        u71 u71VarC5 = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
                        n6 n6Var5 = n6.e;
                        int iHashCode5 = Long.hashCode(ak0Var.T);
                        u71 u71VarB5 = nj2.B(ak0Var, u71VarC5);
                        sl1 sl1VarL5 = ak0Var.l();
                        wu.c.getClass();
                        ti0Var = vu.b;
                        ak0Var.Z();
                        if (ak0Var.S) {
                            ak0Var.k(ti0Var);
                        } else {
                            ak0Var.j0();
                        }
                        p12.l(vu.f, ak0Var, n6Var5);
                        p12.l(vu.e, ak0Var, sl1VarL5);
                        p12.k(ak0Var, vu.h);
                        p12.l(vu.d, ak0Var, u71VarB5);
                        p12.f(ak0Var, Integer.valueOf(iHashCode5), vu.g);
                        ak0Var.p(true);
                    }
                    z6 = false;
                } else {
                    z6 = false;
                }
                ak0Var.W(1250991751);
                ak0Var.p(z6);
                ak0Var.W(357875859);
                ak0Var.p(z6);
                i17 = i8;
                i16 = i18;
                z5 = z3;
                u71 u71VarC6 = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
                n6 n6Var6 = n6.e;
                int iHashCode6 = Long.hashCode(ak0Var.T);
                u71 u71VarB6 = nj2.B(ak0Var, u71VarC6);
                sl1 sl1VarL6 = ak0Var.l();
                wu.c.getClass();
                ti0Var = vu.b;
                ak0Var.Z();
                if (ak0Var.S) {
                    ak0Var.k(ti0Var);
                } else {
                    ak0Var.j0();
                }
                p12.l(vu.f, ak0Var, n6Var6);
                p12.l(vu.e, ak0Var, sl1VarL6);
                p12.k(ak0Var, vu.h);
                p12.l(vu.d, ak0Var, u71VarB6);
                p12.f(ak0Var, Integer.valueOf(iHashCode6), vu.g);
                ak0Var.p(true);
            } else {
                ak0Var.R();
                i16 = i12;
                i17 = i8;
                z5 = z3;
            }
            lr1VarR = ak0Var.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: ci
                    @Override // defpackage.ij0
                    public final Object g(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        dv1.e(str, u71Var, vf2Var, i17, z5, i3, i16, (ak0) obj2, ei1.P(i5 | 1), i6);
                        return ll2.a;
                    }
                };
            }
        }
        i7 |= 196608;
        z3 = z2;
        if ((1572864 & i5) == 0) {
            if (ak0Var.d(i3)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i7 |= i20;
        }
        i11 = i6 & 128;
        if (i11 != 0) {
            i7 |= 12582912;
            i12 = i4;
        } else {
            i12 = i4;
            if ((i5 & 12582912) == 0) {
                if (ak0Var.d(i12)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i7 |= i13;
            }
        }
        i14 = i7 | 100663296;
        if ((i6 & 512) != 0) {
            i14 = i7 | 905969664;
        } else if ((805306368 & i5) == 0) {
            if ((1073741824 & i5) == 0) {
                zH = ak0Var.f(null);
            } else {
                zH = ak0Var.h(null);
            }
            if (zH) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i14 |= i15;
        }
        if ((i14 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (ak0Var.O(i14 & 1, z4)) {
            if (i21 != 0) {
                i8 = 1;
            }
            if (i9 != 0) {
                z3 = true;
            }
            if (i11 != 0) {
                i18 = 1;
            } else {
                i18 = i12;
            }
            ux.P(i18, i3);
            if (ak0Var.j(g02.a) == null) {
                fu1.c();
                return;
            }
            ak0Var.W(356914239);
            ak0Var.p(false);
            jg0Var = (jg0) ak0Var.j(yv.k);
            i19 = (i14 & 14) | ((i14 >> 3) & 112);
            executor = (Executor) ak0Var.j(ei.a);
            if (executor != null) {
                int length4 = str.length();
                if (Build.VERSION.SDK_INT >= 28) {
                    boolValueOf = ei.b;
                    if (boolValueOf == null) {
                        if (Runtime.getRuntime().availableProcessors() >= 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolValueOf = Boolean.valueOf(z8);
                        ei.b = boolValueOf;
                    }
                    if (boolValueOf.booleanValue()) {
                        ak0Var.W(1254274527);
                        kw0Var = (kw0) ak0Var.j(yv.n);
                        obj = (m40) ak0Var.j(yv.h);
                        if (((i19 & 112) ^ 48) > 32) {
                            if (!ak0Var.f(vf2Var)) {
                                z7 = true;
                            } else if ((i19 & 48) == 32) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                            objL = ak0Var.L();
                            if (zD) {
                                z6 = false;
                                Object diVar12 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                jg0Var = jg0Var;
                                ak0Var.g0(diVar12);
                                objL = diVar12;
                                executor.execute((Runnable) objL);
                            } else {
                                z6 = false;
                                Object diVar13 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                jg0Var = jg0Var;
                                ak0Var.g0(diVar13);
                                objL = diVar13;
                                executor.execute((Runnable) objL);
                            }
                        } else {
                            if ((i19 & 48) == 32) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zD = z7 | ak0Var.d(kw0Var.ordinal()) | ((((i19 & 14) ^ 6) <= 4 && ak0Var.f(str)) || (i19 & 6) == 4) | ak0Var.f(obj) | ak0Var.h(jg0Var);
                            objL = ak0Var.L();
                            if (zD) {
                                z6 = false;
                                Object diVar14 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                jg0Var = jg0Var;
                                ak0Var.g0(diVar14);
                                objL = diVar14;
                                executor.execute((Runnable) objL);
                            } else {
                                z6 = false;
                                Object diVar15 = new di(vf2Var, kw0Var, str, obj, jg0Var, 0);
                                jg0Var = jg0Var;
                                ak0Var.g0(diVar15);
                                objL = diVar15;
                                executor.execute((Runnable) objL);
                            }
                        }
                    }
                    ak0Var.p(z6);
                    ak0Var.W(357875859);
                    ak0Var.p(z6);
                    i17 = i8;
                    i16 = i18;
                    z5 = z3;
                    u71 u71VarC7 = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
                    n6 n6Var7 = n6.e;
                    int iHashCode7 = Long.hashCode(ak0Var.T);
                    u71 u71VarB7 = nj2.B(ak0Var, u71VarC7);
                    sl1 sl1VarL7 = ak0Var.l();
                    wu.c.getClass();
                    ti0Var = vu.b;
                    ak0Var.Z();
                    if (ak0Var.S) {
                        ak0Var.k(ti0Var);
                    } else {
                        ak0Var.j0();
                    }
                    p12.l(vu.f, ak0Var, n6Var7);
                    p12.l(vu.e, ak0Var, sl1VarL7);
                    p12.k(ak0Var, vu.h);
                    p12.l(vu.d, ak0Var, u71VarB7);
                    p12.f(ak0Var, Integer.valueOf(iHashCode7), vu.g);
                    ak0Var.p(true);
                }
                z6 = false;
            } else {
                z6 = false;
            }
            ak0Var.W(1250991751);
            ak0Var.p(z6);
            ak0Var.W(357875859);
            ak0Var.p(z6);
            i17 = i8;
            i16 = i18;
            z5 = z3;
            u71 u71VarC8 = u71Var.c(new rf2(str, vf2Var, jg0Var, i17, z5, i3, i16));
            n6 n6Var8 = n6.e;
            int iHashCode8 = Long.hashCode(ak0Var.T);
            u71 u71VarB8 = nj2.B(ak0Var, u71VarC8);
            sl1 sl1VarL8 = ak0Var.l();
            wu.c.getClass();
            ti0Var = vu.b;
            ak0Var.Z();
            if (ak0Var.S) {
                ak0Var.k(ti0Var);
            } else {
                ak0Var.j0();
            }
            p12.l(vu.f, ak0Var, n6Var8);
            p12.l(vu.e, ak0Var, sl1VarL8);
            p12.k(ak0Var, vu.h);
            p12.l(vu.d, ak0Var, u71VarB8);
            p12.f(ak0Var, Integer.valueOf(iHashCode8), vu.g);
            ak0Var.p(true);
        } else {
            ak0Var.R();
            i16 = i12;
            i17 = i8;
            z5 = z3;
        }
        lr1VarR = ak0Var.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: ci
                @Override // defpackage.ij0
                public final Object g(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    dv1.e(str, u71Var, vf2Var, i17, z5, i3, i16, (ak0) obj2, ei1.P(i5 | 1), i6);
                    return ll2.a;
                }
            };
        }
    }

    public static final void f(String str, String str2, String str3, u71 u71Var, String str4, ti0 ti0Var, ak0 ak0Var, int i2, int i3) {
        u71 u71Var2;
        int i4;
        String str5;
        int i5;
        ti0 ti0Var2;
        int i6;
        u71 u71Var3;
        ti0 ti0Var3;
        ti0 ti0Var4;
        boolean z2;
        ak0 ak0Var2 = ak0Var;
        str2.getClass();
        str3.getClass();
        ak0Var2.X(601388688);
        int i7 = i2 | (ak0Var2.f(str2) ? 32 : 16) | (ak0Var2.f(str3) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = i7 | 3072;
            u71Var2 = u71Var;
        } else {
            u71Var2 = u71Var;
            i4 = i7 | (ak0Var2.f(u71Var2) ? 2048 : 1024);
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i5 = i4 | 24576;
            str5 = str4;
        } else {
            str5 = str4;
            i5 = i4 | (ak0Var2.f(str5) ? 16384 : 8192);
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i6 = i5 | 196608;
            ti0Var2 = ti0Var;
        } else {
            ti0Var2 = ti0Var;
            i6 = i5 | (ak0Var2.h(ti0Var2) ? 131072 : 65536);
        }
        int i11 = i6;
        if (ak0Var2.O(i11 & 1, (i11 & 74899) != 74898)) {
            r71 r71Var = r71.a;
            u71 u71Var4 = i8 != 0 ? r71Var : u71Var2;
            if (i9 != 0) {
                str5 = null;
            }
            ti0 ti0Var5 = i10 != 0 ? null : ti0Var2;
            u71 u71VarC0 = p61.c0(u71Var4.c(f52.c), 32.0f);
            wr wrVarA = ur.a(ws0.h, q90.s, ak0Var2, 54);
            int iHashCode = Long.hashCode(ak0Var2.T);
            sl1 sl1VarL = ak0Var2.l();
            u71 u71VarB = nj2.B(ak0Var2, u71VarC0);
            wu.c.getClass();
            wv wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            p12.l(vu.f, ak0Var2, wrVarA);
            p12.l(vu.e, ak0Var2, sl1VarL);
            p12.f(ak0Var2, Integer.valueOf(iHashCode), vu.g);
            p12.k(ak0Var2, vu.h);
            p12.l(vu.d, ak0Var2, u71VarB);
            a90 a90Var = ik2.a;
            u71 u71Var5 = u71Var4;
            String str6 = str5;
            ef2.b(str, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(a90Var)).b, ak0Var, 6, 0, 131070);
            ef2.b(str2, p61.f0(r71Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var.j(a90Var)).h, ak0Var, ((i11 >> 3) & 14) | 48, 0, 131068);
            ef2.b(str3, p61.f0(r71Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((jr) ak0Var.j(lr.a)).s, 0L, 0L, new gc2(3), 0L, 0, false, 0, 0, ((gk2) ak0Var.j(a90Var)).k, ak0Var, ((i11 >> 6) & 14) | 48, 0, 130040);
            ak0Var2 = ak0Var;
            if (str6 == null || ti0Var5 == null) {
                ti0Var4 = ti0Var5;
                z2 = false;
                ak0Var2.W(-300658212);
            } else {
                ak0Var2.W(-298967782);
                ti0Var4 = ti0Var5;
                j20.c(ti0Var4, p61.f0(r71Var, 0.0f, 24.0f, 0.0f, 0.0f, 13), false, null, null, null, null, vs0.C(-400960751, new ji0(4, str6), ak0Var2), ak0Var2, ((i11 >> 15) & 14) | 805306416, 508);
                z2 = false;
            }
            ak0Var2.p(z2);
            ak0Var2.p(true);
            ti0Var3 = ti0Var4;
            str5 = str6;
            u71Var3 = u71Var5;
        } else {
            ak0Var2.R();
            u71Var3 = u71Var2;
            ti0Var3 = ti0Var2;
        }
        lr1 lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new hs(str, str2, str3, u71Var3, str5, ti0Var3, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static final void g(final String str, u71 u71Var, ak0 ak0Var, final int i2, final int i3) {
        final u71 u71Var2;
        int i4;
        boolean z2;
        lr1 lr1VarR;
        u71 u71Var3;
        wv wvVar;
        ak0 ak0Var2 = ak0Var;
        str.getClass();
        ak0Var2.X(184878526);
        int i5 = i2 | (ak0Var2.f(str) ? 4 : 2);
        int i6 = i3 & 2;
        if (i6 == 0) {
            if ((i2 & 48) == 0) {
                u71Var2 = u71Var;
                i5 |= ak0Var2.f(u71Var2) ? 32 : 16;
            }
            i4 = i5 | 3456;
            if ((i4 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ak0Var2.O(i4 & 1, z2)) {
                if (i6 != 0) {
                    u71Var3 = r71.a;
                } else {
                    u71Var3 = u71Var2;
                }
                u71 u71VarC = u71Var3.c(f52.a);
                sv1 sv1VarA = rv1.a(ws0.j, q90.p, ak0Var2, 54);
                int iHashCode = Long.hashCode(ak0Var2.T);
                sl1 sl1VarL = ak0Var2.l();
                u71 u71VarB = nj2.B(ak0Var2, u71VarC);
                wu.c.getClass();
                wvVar = vu.b;
                ak0Var2.Z();
                if (ak0Var2.S) {
                    ak0Var2.k(wvVar);
                } else {
                    ak0Var2.j0();
                }
                p12.l(vu.f, ak0Var2, sv1VarA);
                p12.l(vu.e, ak0Var2, sl1VarL);
                p12.f(ak0Var2, Integer.valueOf(iHashCode), vu.g);
                p12.k(ak0Var2, vu.h);
                p12.l(vu.d, ak0Var2, u71VarB);
                ef2.b(str, null, ((jr) ak0Var2.j(lr.a)).a, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(ik2.a)).i, ak0Var, i4 & 14, 0, 131066);
                ak0Var2 = ak0Var;
                ak0Var2.W(-329257816);
                ak0Var2.p(false);
                ak0Var2.p(true);
                u71Var2 = u71Var3;
            } else {
                ak0Var2.R();
            }
            lr1VarR = ak0Var2.r();
            if (lr1VarR != null) {
                lr1VarR.d = new ij0() { // from class: gs
                    @Override // defpackage.ij0
                    public final Object g(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = ei1.P(i2 | 1);
                        dv1.g(str, u71Var2, (ak0) obj, iP, i3);
                        return ll2.a;
                    }
                };
            }
        }
        i5 |= 48;
        u71Var2 = u71Var;
        i4 = i5 | 3456;
        if ((i4 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ak0Var2.O(i4 & 1, z2)) {
            if (i6 != 0) {
                u71Var3 = r71.a;
            } else {
                u71Var3 = u71Var2;
            }
            u71 u71VarC2 = u71Var3.c(f52.a);
            sv1 sv1VarA2 = rv1.a(ws0.j, q90.p, ak0Var2, 54);
            int iHashCode2 = Long.hashCode(ak0Var2.T);
            sl1 sl1VarL2 = ak0Var2.l();
            u71 u71VarB2 = nj2.B(ak0Var2, u71VarC2);
            wu.c.getClass();
            wvVar = vu.b;
            ak0Var2.Z();
            if (ak0Var2.S) {
                ak0Var2.k(wvVar);
            } else {
                ak0Var2.j0();
            }
            p12.l(vu.f, ak0Var2, sv1VarA2);
            p12.l(vu.e, ak0Var2, sl1VarL2);
            p12.f(ak0Var2, Integer.valueOf(iHashCode2), vu.g);
            p12.k(ak0Var2, vu.h);
            p12.l(vu.d, ak0Var2, u71VarB2);
            ef2.b(str, null, ((jr) ak0Var2.j(lr.a)).a, 0L, 0L, null, 0L, 0, false, 0, 0, ((gk2) ak0Var2.j(ik2.a)).i, ak0Var, i4 & 14, 0, 131066);
            ak0Var2 = ak0Var;
            ak0Var2.W(-329257816);
            ak0Var2.p(false);
            ak0Var2.p(true);
            u71Var2 = u71Var3;
        } else {
            ak0Var2.R();
        }
        lr1VarR = ak0Var2.r();
        if (lr1VarR != null) {
            lr1VarR.d = new ij0() { // from class: gs
                @Override // defpackage.ij0
                public final Object g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = ei1.P(i2 | 1);
                    dv1.g(str, u71Var2, (ak0) obj, iP, i3);
                    return ll2.a;
                }
            };
        }
    }

    public static mr h(mr mrVar) {
        oo2 oo2Var = vs0.x;
        if (sv0.Z(mrVar.b, 12884901888L)) {
            ju1 ju1Var = (ju1) mrVar;
            oo2 oo2Var2 = ju1Var.d;
            if (!o(oo2Var2, oo2Var)) {
                return new ju1(ju1Var.a, ju1Var.h, oo2Var, C(l(z2.c.b, oo2Var2.a(), oo2Var.a()), ju1Var.i), ju1Var.k, ju1Var.n, ju1Var.e, ju1Var.f, ju1Var.g, -1);
            }
        }
        return mrVar;
    }

    public static bo i(ak0 ak0Var) {
        jr jrVar = (jr) ak0Var.j(lr.a);
        bo boVar = jrVar.Y;
        if (boVar != null) {
            return boVar;
        }
        kr krVar = ir2.v;
        bo boVar2 = new bo(lr.d(jrVar, krVar), lr.a(jrVar, lr.d(jrVar, krVar)), ws0.p(dr.b(ir2.y, lr.d(jrVar, ir2.x)), lr.d(jrVar, krVar)), dr.b(0.38f, lr.a(jrVar, lr.d(jrVar, krVar))));
        jrVar.Y = boVar2;
        return boVar2;
    }

    public static co j() {
        return new co(ir2.A, ir2.z);
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return bp.b[c2];
        }
        return (byte) 0;
    }

    public static final float[] l(float[] fArr, float[] fArr2, float[] fArr3) {
        D(fArr, fArr2);
        D(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrY = y(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return C(fArrY, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String m(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void n(k52 k52Var, ArrayList arrayList, int i2) {
        boolean zL = k52Var.l(i2);
        int[] iArr = k52Var.b;
        if (zL) {
            arrayList.add(k52Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            n(k52Var, arrayList, i4);
        }
    }

    public static final boolean o(oo2 oo2Var, oo2 oo2Var2) {
        if (oo2Var == oo2Var2) {
            return true;
        }
        return Math.abs(oo2Var.a - oo2Var2.a) < 0.001f && Math.abs(oo2Var.b - oo2Var2.b) < 0.001f;
    }

    public static final Object p(bv1 bv1Var, ej0 ej0Var, sx sxVar) {
        if (bv1Var.i() && bv1Var.k() && bv1Var.j()) {
            return ej0Var.h(sxVar);
        }
        return sxVar.f().p(rm.g) == null ? ej0Var.h(sxVar) : U(bv1Var, ej0Var, sxVar);
    }

    public static final ow q(mr mrVar, mr mrVar2) {
        if (mrVar == mrVar2) {
            return new mw(mrVar, mrVar, 1);
        }
        return (sv0.Z(mrVar.b, 12884901888L) && sv0.Z(mrVar2.b, 12884901888L)) ? new nw((ju1) mrVar, (ju1) mrVar2) : new ow(mrVar, mrVar2, 0);
    }

    public static final int r(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objL = y12.l(view);
            view = objL instanceof View ? (View) objL : null;
        }
        return i4;
    }

    public static final int s(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iN = ws0.n(((et0) list.get(i4)).b, i2);
            if (iN < 0) {
                i3 = i4 + 1;
            } else {
                if (iN <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final View t(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(r(view, R.id.view_tree_lifecycle_owner), r(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (v(view) == null) {
                i2++;
                Object objL = y12.l(view);
                View view4 = view2;
                view2 = view;
                view = objL instanceof View ? (View) objL : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final jo0 u() {
        jo0 jo0Var = I;
        if (jo0Var != null) {
            return jo0Var;
        }
        io0 io0Var = new io0("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = jm2.a;
        o72 o72Var = new o72(dr.b);
        qk1 qk1Var = new qk1(0);
        qk1Var.A(20.0f, 11.0f);
        qk1Var.w(7.83f);
        qk1Var.z(5.59f, -5.59f);
        qk1Var.y(12.0f, 4.0f);
        qk1Var.z(-8.0f, 8.0f);
        qk1Var.z(8.0f, 8.0f);
        qk1Var.z(1.41f, -1.41f);
        qk1Var.y(7.83f, 13.0f);
        qk1Var.w(20.0f);
        qk1Var.I(-2.0f);
        qk1Var.s();
        io0.a(io0Var, (ArrayList) qk1Var.f, o72Var);
        jo0 jo0VarB = io0Var.b();
        I = jo0VarB;
        return jo0VarB;
    }

    public static final av v(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (av) weakReference.get();
        }
        return null;
    }

    public static final om w(sx sxVar) {
        Unsafe unsafe;
        om omVar;
        om omVar2;
        if (!(sxVar instanceof p50)) {
            return new om(1, sxVar);
        }
        p50 p50Var = (p50) sxVar;
        pa0 pa0Var = ws0.q;
        long j2 = p50.l;
        loop0: while (true) {
            unsafe = we.a;
            Object objectVolatile = unsafe.getObjectVolatile(p50Var, j2);
            omVar = null;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(p50Var, j2, pa0Var);
                omVar2 = null;
                break;
            }
            if (objectVolatile instanceof om) {
                do {
                    unsafe = we.a;
                    if (unsafe.compareAndSwapObject(p50Var, p50.l, objectVolatile, pa0Var)) {
                        omVar2 = (om) objectVolatile;
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(p50Var, j2) == objectVolatile);
            } else if (objectVolatile != pa0Var && !(objectVolatile instanceof Throwable)) {
                qj.i(objectVolatile, "Inconsistent state ");
                return null;
            }
        }
        if (omVar2 != null) {
            long j3 = om.l;
            Object objectVolatile2 = unsafe.getObjectVolatile(omVar2, j3);
            if (!(objectVolatile2 instanceof ms) || ((ms) objectVolatile2).d == null) {
                unsafe.putIntVolatile(omVar2, om.j, 536870911);
                unsafe.putObjectVolatile(omVar2, j3, d2.a);
                omVar = omVar2;
            } else {
                omVar2.q();
            }
            if (omVar != null) {
                return omVar;
            }
        }
        return new om(2, sxVar);
    }

    public static final u71 x(u71 u71Var, qs0 qs0Var) {
        return u71Var.c(new ms0(qs0Var));
    }

    public static final float[] y(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final boolean z(ak0 ak0Var) {
        return ws0.j(((Configuration) ak0Var.j(u5.a)).getLocales().get(0).getLanguage(), "fa");
    }
}
