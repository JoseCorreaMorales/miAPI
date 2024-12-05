package com.api_springboot.miAPI.models;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode // lombok
public class UserModel {
    @Id // indicar la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Opción para que el ID se genere automáticamente

    @Getter @Setter // con la dependecias de lombok se puede emitir los getters y settes por esta anotacion
    private Long id;
    @Column
    // @Column(name = "name") para especificar el nombre que esta en la bd si es que es diferente al nombre de variable
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

    // Long getId() {
    //    return id;
    //}

    //public void setId(Long id) {
      //  this.id = id;
    //}

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
