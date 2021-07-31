package br.com.zup.edu.githubissues.issues;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Projeto {

    @Id
    @GeneratedValue
    private Long id;

    /**
     * IMPORTANTE:
     * as anotações da Bean Validation são avaliadas pelo Hibernate para gerar o schema
     * do banco. Além disso, elas são priorizadas ao uso da @Column
     */
    @NotNull // NOT NULL
    @Size(max = 80) // LENGTH=80
    @Column(length = 100, nullable = true)
    private String nome;

}
