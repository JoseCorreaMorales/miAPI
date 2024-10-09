package com.api_springboot.miAPI.models;


import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Opción para que el ID se genere automáticamente
    private Long id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private Integer age;

    public UserModel() {}

    public UserModel(Long id, String name, String lastname, Integer age) {
       // this.id = id; no incluir
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
