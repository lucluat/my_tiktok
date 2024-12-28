package com.student.server.data.entity;

import com.student.server.data.constant.EntityProperties;
import com.student.server.data.entity.base.PrimaryEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Table(name = "users")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users extends PrimaryEntity implements Serializable {

    @Column(name = "name", length = EntityProperties.LENGTH_NAME)
    private String name;

    @Column(name = "code", length = EntityProperties.LENGTH_NAME)
    private String code;

    @Column(name = "avatar", length = EntityProperties.LENGTH_PICTURE)
    private String avatar;

    @Column(name = "avatar", length = EntityProperties.LENGTH_PICTURE)
    private String email;

    @Column(name = "phoneNumber", length = EntityProperties.LENGTH_PHONE_NUMBER)
    private String phoneNumber;

    @Column(name = "biography")
    private String biography;

    @Column(name = "birthdate")
    private LocalDateTime birthdate;

}
