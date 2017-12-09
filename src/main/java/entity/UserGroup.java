package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_groups")
public class UserGroup extends AbstractEntity {

    private String name;
    private List<User> users;

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "group")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
