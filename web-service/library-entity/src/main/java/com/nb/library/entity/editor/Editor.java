package com.nb.library.entity.editor;

import com.nb.library.entity.EditorInterface;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "editor")
@Table(name = "editor")
public class Editor implements EditorInterface {

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

    @Column(name = "name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(targetEntity = Book.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "editor_id", referencedColumnName = "id")
    private Set<Book> books = new HashSet<>(0);
    public Set<Book> getBooks() {
        return books;
    }
    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
