package br.com.zup.edu.githubissues.issues;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Issue {

    @Id
    @GeneratedValue
    private Long id;

    private String sumario;

    @Column(length=4000)
    private String descricao;

    @ManyToOne
    private Projeto projeto;

    @ManyToOne
    private Usuario responsavel;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "issue")
    private List<Comentario> comentarios;

    @Column(nullable = false)
    private LocalDateTime criadaEm = LocalDateTime.now();

}
