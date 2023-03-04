package entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import models.Roles;

@AllArgsConstructor
@Entity
@Table(name="users_roles")
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private Roles name;

        public Role() {
    }

    public Role(Roles name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public Roles getName() {
        return this.name;
    }

    public void setName(Roles name) {
        this.name = name;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    // users mapped by roles
    @JoinTable(
            name="users_roles",
            joinColumns={@JoinColumn(name="USER_ID", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
    private List<User> usersByRole = new ArrayList<>();


}

