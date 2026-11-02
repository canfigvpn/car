package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-0bfc939acdb2c2ed066a39909232567106f3dc80b59d530c205412207654b975 */
/* JADX INFO: loaded from: classes.dex */
@z12(with = yu0.class)
public final class wu0 extends iu0 implements Map<String, iu0>, fv0 {
    public static final vu0 Companion = new vu0();
    public final Map e;

    public wu0(Map map) {
        map.getClass();
        this.e = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ iu0 compute(String str, BiFunction<? super String, ? super iu0, ? extends iu0> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ iu0 computeIfAbsent(String str, Function<? super String, ? extends iu0> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ iu0 computeIfPresent(String str, BiFunction<? super String, ? super iu0, ? extends iu0> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.e.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof iu0)) {
            return false;
        }
        return this.e.containsValue((iu0) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, iu0>> entrySet() {
        return this.e.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return ws0.j(this.e, obj);
    }

    @Override // java.util.Map
    public final iu0 get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (iu0) this.e.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.e.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ iu0 merge(String str, iu0 iu0Var, BiFunction<? super iu0, ? super iu0, ? extends iu0> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ iu0 put(String str, iu0 iu0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends iu0> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ iu0 putIfAbsent(String str, iu0 iu0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final iu0 remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ iu0 replace(String str, iu0 iu0Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super iu0, ? extends iu0> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.e.size();
    }

    public final String toString() {
        return vq.V(this.e.entrySet(), ",", "{", "}", new n30(22), 24);
    }

    @Override // java.util.Map
    public final Collection<iu0> values() {
        return this.e.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, iu0 iu0Var, iu0 iu0Var2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
