package com.shtarev.FullApp.Entity.security;


import com.shtarev.FullApp.Entity.Assignment;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@ToString(exclude = {"assignments", "authorities"})
@Entity
@Table(name = "users")
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    @Column(name = "cohort_start_date")
    private LocalDate cohortStartDate;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "assignedTo")
    private List<Assignment> assignments = new ArrayList<>();
    @OneToMany(mappedBy = "userTo")
    private List<Authority> authorities = new ArrayList<>();


    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
