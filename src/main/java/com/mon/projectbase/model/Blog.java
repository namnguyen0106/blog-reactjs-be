package com.mon.projectbase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "blogs")
public class Blog extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private String avatarUrl;
    private int status;
}
