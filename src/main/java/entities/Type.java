package entities;

import jakarta.persistence.*;
import models.Types;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users_types")

public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private Types name;

    public Type() {};

    public Type(Types name) {
        this.name = name;
    }

    public void setName(Types name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Types getName() {
        return name;
    }

    public List<User> getUsersByType() {
        return usersByType;
    }

    @ManyToOne(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    // users mapped by type
    @JoinTable(
            name="users_types",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")})
    private List<User> usersByType = new ArrayList<>();
}
