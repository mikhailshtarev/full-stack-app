package com.shtarev.FullApp.Entity.security;

import com.shtarev.FullApp.Entity.enumerations.UserRole;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Table(name = "authorities")
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    @Column(name = "authority")
    private UserRole authority;
    @ManyToOne(optional = false)
    @JoinColumn(name = "userTo")
    private UserEntity userTo;

    @Override
    public String getAuthority() {
        return authority.toString();
    }

}
