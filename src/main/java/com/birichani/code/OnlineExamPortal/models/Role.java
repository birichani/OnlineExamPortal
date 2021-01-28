package com.birichani.code.OnlineExamPortal.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="Roles")
public class Role {
    @Id
    @Column(name = "rolesId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

}
