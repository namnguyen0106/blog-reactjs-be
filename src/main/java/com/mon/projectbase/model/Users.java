package com.mon.projectbase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class Users extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String userName;
    private String password;
}
