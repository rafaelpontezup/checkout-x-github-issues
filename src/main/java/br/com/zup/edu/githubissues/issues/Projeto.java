package br.com.zup.edu.githubissues.issues;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Projeto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

}
