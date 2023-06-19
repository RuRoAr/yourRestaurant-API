package com.myApp.yourRestaurantApi.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String fullName;
    @Column
    private String userName;
    @Column
    private String password1;
    @Column
    private String password2;
    @Column
    private String email;
    @Column
    @Lob
    private Byte[] userPhoto;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments;

}
