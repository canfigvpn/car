package defpackage;

import ir.alirezaivaz.mygarage.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f22 {
    public static final Map a = h61.f0(new qj1("engine_oil", Integer.valueOf(R.string.service_engine_oil)), new qj1("oil_filter", Integer.valueOf(R.string.service_oil_filter)), new qj1("air_filter", Integer.valueOf(R.string.service_air_filter)), new qj1("cabin_filter", Integer.valueOf(R.string.service_cabin_filter)), new qj1("fuel_filter", Integer.valueOf(R.string.service_fuel_filter)), new qj1("brake_fluid", Integer.valueOf(R.string.service_brake_fluid)), new qj1("gearbox_oil", Integer.valueOf(R.string.service_gearbox_oil)), new qj1("steering_fluid", Integer.valueOf(R.string.service_steering_fluid)), new qj1("timing_belt", Integer.valueOf(R.string.service_timing_belt)), new qj1("alternator_belt", Integer.valueOf(R.string.service_alternator_belt)), new qj1("spark_plugs", Integer.valueOf(R.string.service_spark_plugs)), new qj1("coolant", Integer.valueOf(R.string.service_coolant)), new qj1("clutch", Integer.valueOf(R.string.service_clutch)), new qj1("brake_pads_front", Integer.valueOf(R.string.service_brake_pads_front)), new qj1("brake_pads_rear", Integer.valueOf(R.string.service_brake_pads_rear)), new qj1("tire_rotation", Integer.valueOf(R.string.service_tire_rotation)), new qj1("tire_pressure", Integer.valueOf(R.string.service_tire_pressure)), new qj1("wheel_alignment", Integer.valueOf(R.string.service_wheel_alignment)), new qj1("fuel", Integer.valueOf(R.string.service_fuel)), new qj1("thermostat", Integer.valueOf(R.string.service_thermostat)), new qj1("technical_inspection", Integer.valueOf(R.string.service_technical_inspection)), new qj1("battery", Integer.valueOf(R.string.service_battery)), new qj1("insurance", Integer.valueOf(R.string.service_insurance)), new qj1("window_tint", Integer.valueOf(R.string.service_window_tint)), new qj1("car_wash", Integer.valueOf(R.string.service_car_wash)), new qj1("gearbox_repair", Integer.valueOf(R.string.service_gearbox_repair)));

    public static final String a(double d, ak0 ak0Var) {
        String str = String.format(Locale.US, "%,.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        if (!dv1.z(ak0Var)) {
            return str;
        }
        String strReplace = dv1.N(str).replace(',', (char) 1644);
        strReplace.getClass();
        String strReplace2 = strReplace.replace('.', (char) 1643);
        strReplace2.getClass();
        return strReplace2;
    }

    public static final String b(long j, ak0 ak0Var) {
        String str = String.format(Locale.US, "%,d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        if (!dv1.z(ak0Var)) {
            return str;
        }
        String strReplace = dv1.N(str).replace(',', (char) 1644);
        strReplace.getClass();
        String strReplace2 = strReplace.replace('.', (char) 1643);
        strReplace2.getClass();
        return strReplace2;
    }

    public static final String c(ni0 ni0Var, ak0 ak0Var) {
        int i;
        ni0Var.getClass();
        int iOrdinal = ni0Var.ordinal();
        if (iOrdinal == 0) {
            i = R.string.fuel_gasoline;
        } else if (iOrdinal == 1) {
            i = R.string.fuel_diesel;
        } else if (iOrdinal == 2) {
            i = R.string.fuel_cng_lpg;
        } else if (iOrdinal == 3) {
            i = R.string.fuel_hybrid;
        } else {
            if (iOrdinal != 4) {
                qj.p();
                return null;
            }
            i = R.string.fuel_electric;
        }
        return j02.r(i, ak0Var);
    }

    public static final String d(u22 u22Var, ak0 ak0Var) {
        u22Var.getClass();
        String str = u22Var.b;
        String str2 = u22Var.c;
        if (str2 != null) {
            if (h92.I(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        Integer num = (Integer) a.get(str);
        return num != null ? j02.r(num.intValue(), ak0Var) : str;
    }
}
