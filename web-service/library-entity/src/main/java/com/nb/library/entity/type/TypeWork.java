package com.nb.library.entity.type;

import com.nb.library.entity.TypeWorkInterface;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "type_work")
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

    @OneToMany(targetEntity = Work.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "type_work_id", referencedColumnName = "id")
    @OrderBy("title ASC")
    private Set<Work> works = new HashSet<>(0);
    public Set<Work> getWorks() {
        return works;
    }
    public void setWorks(Set<Work> works) {
        this.works = works;
    }
}
