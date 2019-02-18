package br.com.gustavosimoes.storeauthserver.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class Authority implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
}