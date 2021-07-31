package br.com.zup.edu.githubissues.issues;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String sumario;

    @Column(length = 4000, nullable = false)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(length = 60)
    private Status status;

    private LocalDateTime criadoEm;

    @ManyToOne
    @JoinColumn(name = "projeto_pk") // coluna de juncao
    private Projeto projeto;

    @ManyToOne
    private Usuario responsavel;

    @OneToMany(mappedBy = "issue") // tabela ou coluna? tabela
    private List<Comentario> comentarios;

}
