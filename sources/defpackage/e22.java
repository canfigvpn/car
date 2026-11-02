package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e22 {
    public static final List a = vs0.v(new fl("engine_oil", "🛢️", 5000, 3, 16), new fl("oil_filter", "🌀", 5000, 3, 16), new fl("air_filter", "💨", 10000, 12, 16), new fl("cabin_filter", "❄️", 15000, 12, 16), new fl("fuel_filter", "🧪", 20000, 24, 16), new fl("brake_fluid", "💧", 40000, 24, 16), new fl("gearbox_oil", "⚙️", 60000, 48, 16), new fl("steering_fluid", "🧴", 40000, 24, 16), new fl("timing_belt", "🔗", 60000, 60, 16), new fl("alternator_belt", "➿", 50000, 48, 16), new fl("spark_plugs", "⚡", 30000, 24, 16), new fl("coolant", "🌡️", 40000, 24, 16), new fl("clutch", "💿", 80000, null, 24), new fl("brake_pads_front", "🛑", 30000, null, 24), new fl("brake_pads_rear", "🔴", 60000, null, 24), new fl("tire_rotation", "🛞", 10000, 12, 16), new fl("tire_pressure", "🌬️", null, 1, 20), new fl("wheel_alignment", "📐", 20000, 12, 16), new fl("fuel", "⛽", null, null, 12), new fl("thermostat", "♨️", 60000, 48, 16), new fl("technical_inspection", "🔍", null, 12, 20), new fl("battery", "🔋", null, 36, 20), new fl("insurance", "📄", null, 12, 20), new fl("window_tint", "🕶️", null, null, 28), new fl("car_wash", "🧼", null, null, 28), new fl("gearbox_repair", "🛠️", null, null, 28));
    public static final Set b = ve.O0(new String[]{"insurance", "technical_inspection", "tire_rotation", "tire_pressure", "wheel_alignment", "window_tint", "gearbox_repair"});
    public static final Map c = h61.f0(new qj1("engine_oil", vs0.v("oil_filter", "air_filter", "cabin_filter", "fuel_filter")), new qj1("brake_pads_front", vs0.u("brake_pads_rear")), new qj1("timing_belt", vs0.u("alternator_belt")));
}
