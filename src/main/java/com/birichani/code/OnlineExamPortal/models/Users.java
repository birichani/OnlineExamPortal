package com.birichani.code.OnlineExamPortal.models;

import lombok.Data;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Data
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "usersId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "usersRoles",
            joinColumns = @JoinColumn(name = "usersId"),
            inverseJoinColumns = @JoinColumn(name = "rolesId")
    )
    private Set<Role> roles = new HashSet<>();

    public Long getId() {
        return id;
    }
}
