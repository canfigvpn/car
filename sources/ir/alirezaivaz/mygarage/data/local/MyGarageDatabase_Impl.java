package ir.alirezaivaz.mygarage.data.local;

import defpackage.aq;
import defpackage.bn;
import defpackage.cb0;
import defpackage.gt0;
import defpackage.hb2;
import defpackage.i22;
import defpackage.js1;
import defpackage.rf1;
import defpackage.s22;
import defpackage.ti0;
import defpackage.w22;
import defpackage.wa1;
import defpackage.ya1;
import defpackage.z90;
import ir.alirezaivaz.mygarage.data.local.MyGarageDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
public final class MyGarageDatabase_Impl extends MyGarageDatabase {
    public final hb2 m;
    public final hb2 n;
    public final hb2 o;
    public final hb2 p;
    public final hb2 q;

    public MyGarageDatabase_Impl() {
        final int i = 0;
        this.m = new hb2(new ti0(this) { // from class: xa1
            public final /* synthetic */ MyGarageDatabase_Impl f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i2 = i;
                MyGarageDatabase_Impl myGarageDatabase_Impl = this.f;
                switch (i2) {
                    case 0:
                        return new bn(myGarageDatabase_Impl);
                    case 1:
                        return new w22(myGarageDatabase_Impl);
                    case 2:
                        return new s22(myGarageDatabase_Impl);
                    case 3:
                        return new i22(myGarageDatabase_Impl);
                    default:
                        return new rf1(myGarageDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.n = new hb2(new ti0(this) { // from class: xa1
            public final /* synthetic */ MyGarageDatabase_Impl f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i3 = i2;
                MyGarageDatabase_Impl myGarageDatabase_Impl = this.f;
                switch (i3) {
                    case 0:
                        return new bn(myGarageDatabase_Impl);
                    case 1:
                        return new w22(myGarageDatabase_Impl);
                    case 2:
                        return new s22(myGarageDatabase_Impl);
                    case 3:
                        return new i22(myGarageDatabase_Impl);
                    default:
                        return new rf1(myGarageDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.o = new hb2(new ti0(this) { // from class: xa1
            public final /* synthetic */ MyGarageDatabase_Impl f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i4 = i3;
                MyGarageDatabase_Impl myGarageDatabase_Impl = this.f;
                switch (i4) {
                    case 0:
                        return new bn(myGarageDatabase_Impl);
                    case 1:
                        return new w22(myGarageDatabase_Impl);
                    case 2:
                        return new s22(myGarageDatabase_Impl);
                    case 3:
                        return new i22(myGarageDatabase_Impl);
                    default:
                        return new rf1(myGarageDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.p = new hb2(new ti0(this) { // from class: xa1
            public final /* synthetic */ MyGarageDatabase_Impl f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i5 = i4;
                MyGarageDatabase_Impl myGarageDatabase_Impl = this.f;
                switch (i5) {
                    case 0:
                        return new bn(myGarageDatabase_Impl);
                    case 1:
                        return new w22(myGarageDatabase_Impl);
                    case 2:
                        return new s22(myGarageDatabase_Impl);
                    case 3:
                        return new i22(myGarageDatabase_Impl);
                    default:
                        return new rf1(myGarageDatabase_Impl);
                }
            }
        });
        final int i5 = 4;
        this.q = new hb2(new ti0(this) { // from class: xa1
            public final /* synthetic */ MyGarageDatabase_Impl f;

            {
                this.f = this;
            }

            @Override // defpackage.ti0
            public final Object a() {
                int i6 = i5;
                MyGarageDatabase_Impl myGarageDatabase_Impl = this.f;
                switch (i6) {
                    case 0:
                        return new bn(myGarageDatabase_Impl);
                    case 1:
                        return new w22(myGarageDatabase_Impl);
                    case 2:
                        return new s22(myGarageDatabase_Impl);
                    case 3:
                        return new i22(myGarageDatabase_Impl);
                    default:
                        return new rf1(myGarageDatabase_Impl);
                }
            }
        });
    }

    @Override // defpackage.bv1
    public final List b(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new wa1(1, 2, 0));
        arrayList.add(new wa1());
        arrayList.add(new wa1(3, 4, 2));
        arrayList.add(new wa1(4, 5, 3));
        return arrayList;
    }

    @Override // defpackage.bv1
    public final gt0 c() {
        return new gt0(this, new LinkedHashMap(), new LinkedHashMap(), "cars", "service_types", "car_service_schedules", "service_records", "odometer_readings");
    }

    @Override // defpackage.bv1
    public final z90 d() {
        return new ya1(this);
    }

    @Override // defpackage.bv1
    public final Set g() {
        return new LinkedHashSet();
    }

    @Override // defpackage.bv1
    public final LinkedHashMap h() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        aq aqVarA = js1.a(bn.class);
        cb0 cb0Var = cb0.e;
        linkedHashMap.put(aqVarA, cb0Var);
        linkedHashMap.put(js1.a(w22.class), cb0Var);
        linkedHashMap.put(js1.a(s22.class), cb0Var);
        linkedHashMap.put(js1.a(i22.class), cb0Var);
        linkedHashMap.put(js1.a(rf1.class), cb0Var);
        return linkedHashMap;
    }

    @Override // ir.alirezaivaz.mygarage.data.local.MyGarageDatabase
    public final bn m() {
        return (bn) this.m.getValue();
    }

    @Override // ir.alirezaivaz.mygarage.data.local.MyGarageDatabase
    public final rf1 n() {
        return (rf1) this.q.getValue();
    }

    @Override // ir.alirezaivaz.mygarage.data.local.MyGarageDatabase
    public final i22 o() {
        return (i22) this.p.getValue();
    }

    @Override // ir.alirezaivaz.mygarage.data.local.MyGarageDatabase
    public final s22 p() {
        return (s22) this.o.getValue();
    }

    @Override // ir.alirezaivaz.mygarage.data.local.MyGarageDatabase
    public final w22 q() {
        return (w22) this.n.getValue();
    }
}
