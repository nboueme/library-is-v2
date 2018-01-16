package com.nb.library.entity;

import com.nb.library.entity.work.Work;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "type_work")
public class TypeWork {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_work_id_seq")
    @SequenceGenerator(name = "type_work_id_seq", sequenceName = "type_work_id_seq")
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

    @OneToMany(mappedBy = "typeWork")
    private Set<Work> works = new HashSet<>(0);
    @XmlTransient
    public Set<Work> getWorks() {
        return works;
    }
    public void setWorks(Set<Work> works) {
        this.works = works;
    }
}
