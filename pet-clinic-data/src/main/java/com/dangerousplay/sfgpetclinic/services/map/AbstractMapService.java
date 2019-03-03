package com.dangerousplay.sfgpetclinic.services.map;

import com.dangerousplay.sfgpetclinic.model.BaseEntiy;
import com.dangerousplay.sfgpetclinic.services.CrudService;
import org.springframework.lang.NonNull;

import java.util.*;

/**
 * Criado por Davi Ficanha Henrique em 26/02/2019
 */
public abstract class AbstractMapService<T extends BaseEntiy, ID extends Long> implements CrudService<T, ID> {

    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public T save(@NonNull T object) {
        if (object.getId() == null) {
            Long nextId = getNextId();
            object.setId(nextId);

            map.put(nextId, object);
        } else {
            map.put(object.getId(), object);
        }

        return object;
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(p -> p.getValue().equals(object));
    }

    protected Long getNextId() {
        return map.isEmpty() ? 1L : Collections.max(map.keySet()) + 1;
    }

}
