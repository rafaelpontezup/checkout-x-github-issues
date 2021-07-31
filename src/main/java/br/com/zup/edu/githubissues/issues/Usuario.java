package br.com.zup.edu.githubissues.issues;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "tb_usuarios")
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_completo", length = 100, nullable = false)
    private String nome;

    /**
     * Hibernate nao so leva em consideracao as anotacoes da bean validation
     * para criar o schema, como tambem prioriza as anotacoes.
     */
    @Size(max = 42)
    @NotNull
    @Column(nullable = false, unique = true, length = 60)
    private String email;

    @Column(nullable = false, columnDefinition = "text")
    private String senha;

}
