package com.dangerousplay.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Criado por Davi Ficanha Henrique em 25/02/2019
 */
public class BaseEntiy implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
