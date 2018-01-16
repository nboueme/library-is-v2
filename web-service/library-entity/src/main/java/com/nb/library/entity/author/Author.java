package com.nb.library.entity.author;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "work_id_seq")
    @SequenceGenerator(name = "work_id_seq", sequenceName = "work_id_seq")
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "first_name")
    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToMany(targetEntity = Work.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "work_authors",
            joinColumns = { @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "work_id", referencedColumnName = "id", nullable = false, updatable = false) })
    @OrderBy("title asc")
    private Set<Work> works = new HashSet<>(0);
    public Set<Work> getWorks() {
        return works;
    }
    public void setWorks(Set<Work> works) {
        this.works = works;
    }
}
