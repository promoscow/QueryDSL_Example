package entity;

import javax.persistence.*;

@MappedSuperclass
public class AbstractEntity {

    private Long id;

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "general_seq", sequenceName = "generalSequenceGenerator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "general_seq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
