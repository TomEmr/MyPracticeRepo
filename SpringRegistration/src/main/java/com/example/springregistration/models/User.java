package com.example.springregistration.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name= "users")
public class User {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

//    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

//    @Column(nullable = false)
    private String password;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = {@JoinColumn(name="USER_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {@JoinColumn(name="ROLE_ID", referencedColumnName = "ID")})
    private List<Role> roles = new ArrayList<>();

}
