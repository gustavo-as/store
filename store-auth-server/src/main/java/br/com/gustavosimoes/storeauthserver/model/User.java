package br.com.gustavosimoes.storeauthserver.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(updatable = false, nullable = false)
    private String username;

    @Size(max = 500)
    private String password;

    @Email
    @Size(max = 50)
    private String email;

    private boolean activated;

    @Size(max = 100)
    @Column(name = "activationkey")
    private String activationKey;

    @Size(max = 100)
    @Column(name = "resetpasswordkey")
    private String resetPasswordKey;

    @ManyToMany
    @JoinTable(
            name = "user_authority",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "authority"))
    private Set<Authority> authorities;
}

