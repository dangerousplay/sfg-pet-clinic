package com.dangerousplay.sfgpetclinic.services.map;

import com.dangerousplay.sfgpetclinic.model.BaseEntiy;
import com.dangerousplay.sfgpetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    public T save(T object) {
        map.put(object.getId(), object);

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

}
