package com.nb.library.entity.work;

import com.nb.library.entity.WorkInterface;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "work")
@Table(name = "work")
public class Work implements WorkInterface {

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

    @ManyToMany(targetEntity = Author.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "work_authors",
            joinColumns = { @JoinColumn(name = "work_id", referencedColumnName = "id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false, updatable = false) })
    @OrderBy("firstName ASC")
    private Set<Author> authors = new HashSet<>(0);
    public Set<Author> getAuthors() {
        return authors;
    }
    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @ManyToOne(targetEntity = TypeWork.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "type_work_id", referencedColumnName = "id")
    private TypeWork typeWork;
    public TypeWork getTypeWork() {
        return typeWork;
    }
    public void setTypeWork(TypeWork typeWork) {
        this.typeWork = typeWork;
    }

    @OneToMany(targetEntity = Book.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "work_id", referencedColumnName = "id")
    private Set<Book> books = new HashSet<>(0);
    public Set<Book> getBooks() {
        return books;
    }
    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Column(name = "title")
    private String title;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "summary")
    private String summary;
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Column(name = "image_url")
    private String imageURL;
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Column(name = "created_at")
    private Date createdAt;
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name = "updated_at")
    private Date updatedAt;
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
