package com.example.libreria.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.libreria.exceptions.EntidadNoEncontradaException;

/**
 *
 * @param <T>
 */
public abstract class AbstractApiService<T> {

    protected T getEntityApi(Optional<T> entity, String messageNotFound) {
        if (entity.isPresent()) {
            return entity.get();
        }
        throw new EntidadNoEncontradaException(messageNotFound);
    }

    protected T getEntityApi(T entity, String messageNotFound) {
        if (entity != null) {
            return entity;
        }
        throw new EntidadNoEncontradaException(messageNotFound);
    }

    protected java.util.List<T> getEntityApi(java.util.List<T> entities, String messageNotFound) {
        if (entities != null && !entities.isEmpty()) {
            return entities;
        }
        throw new EntidadNoEncontradaException(messageNotFound);
    }

    /**
     * @param entities
     * @param messageNotFound
     * @return
     */
    protected java.util.List<T> getEntityApiList(Iterable<T> entities, String messageNotFound) {
        if (entities != null && entities.iterator().hasNext()) {
            List<T> list = new ArrayList<T>();
            for (T item : entities) {
                list.add(item);
            }
            return list;
        }
        throw new EntidadNoEncontradaException(messageNotFound);
    }
}
