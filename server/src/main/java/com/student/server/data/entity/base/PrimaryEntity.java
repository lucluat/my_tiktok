package com.student.server.data.entity.base;

import com.student.server.config.listener.CreatePrimaryEntityListener;
import com.student.server.data.constant.EntityProperties;
import com.student.server.data.constant.EntityStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
@EntityListeners(CreatePrimaryEntityListener.class)
public abstract class PrimaryEntity extends AuditEntity implements IsIdentified {

    @Id
    @Column(length = EntityProperties.LENGTH_ID, updatable = false)
    private String id;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private EntityStatus status;

    @Override
    public String getId() {
        return this.id;
    }

}
