package defpackage;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class dm extends bm {
    public static final ZoneId e = ZoneId.of("UTC");
    public final int c;
    public final ArrayList d;

    public dm(Locale locale) {
        super(locale);
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        yb0 yb0Var = cm.a;
        ArrayList arrayList = new ArrayList(yb0Var.a());
        int iA = yb0Var.a();
        for (int i = 0; i < iA; i++) {
            DayOfWeek dayOfWeekF = of.f(yb0Var.get(i));
            TextStyle unused = TextStyle.FULL_STANDALONE;
            String displayName = dayOfWeekF.getDisplayName(TextStyle.FULL_STANDALONE, locale);
            TextStyle unused2 = TextStyle.NARROW_STANDALONE;
            arrayList.add(new qj1(displayName, dayOfWeekF.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    @Override // defpackage.bm
    public final String a(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(e).toLocalDate().format(vs0.n(str, locale, this.b));
    }

    @Override // defpackage.bm
    public final zl b(long j) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(e).toLocalDate();
        return new zl(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 1000 * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // defpackage.bm
    public final d00 c(Locale locale) {
        FormatStyle unused = FormatStyle.SHORT;
        return ws0.q(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // defpackage.bm
    public final int d() {
        return this.c;
    }

    @Override // defpackage.bm
    public final em e(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // defpackage.bm
    public final em f(long j) {
        return l(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).toLocalDate());
    }

    @Override // defpackage.bm
    public final em g(zl zlVar) {
        return l(LocalDate.of(zlVar.e, zlVar.f, 1));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.time.ZonedDateTime] */
    @Override // defpackage.bm
    public final zl h() {
        LocalDate localDateNow = LocalDate.now();
        return new zl(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    @Override // defpackage.bm
    public final List i() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.time.ZonedDateTime] */
    @Override // defpackage.bm
    public final zl j(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, vs0.n(str2, locale, this.b));
            return new zl(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // defpackage.bm
    public final em k(em emVar, int i) {
        return i <= 0 ? emVar : l(Instant.ofEpochMilli(emVar.e).atZone(e).toLocalDate().plusMonths(i));
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.time.ZonedDateTime] */
    public final em l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new em(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(e).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
