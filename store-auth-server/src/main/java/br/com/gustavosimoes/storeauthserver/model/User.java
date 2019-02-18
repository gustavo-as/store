package br.com.gustavosimoes.storeauthserver.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;

@Entity
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
    private String email;
    private boolean activated;
    private String activationKey;
    private String resetPasswordKey;
    private Set<Authority> authorities;
}

