package com.goatmanager.modules.users.entity;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import com.goatmanager.modules.users.enum_.*;
@Entity
@Data
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @Column(name="id_user",nullable = false)
    private Long id_user;
    @Column(name = "username",nullable = false)
    private String username;
    @Column(name = "password_hash",nullable = false)
    private String password;
    @Column(name = "email",nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false)
    private enum_users Role;
    @JsonIgnore
    @Column(name = "created_at",nullable = false)
    private LocalDateTime created;
    @JsonIgnore
    @Column(name = "updated_at",nullable = false)
    private LocalDateTime updated;
}
