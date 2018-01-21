package com.nb.library.entity.work;

import com.nb.library.entity.TypeWorkInterface;

import javax.persistence.*;

@Entity
@Table(name = "type_work")
public class TypeWork implements TypeWorkInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "type_work")
    private String type;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
