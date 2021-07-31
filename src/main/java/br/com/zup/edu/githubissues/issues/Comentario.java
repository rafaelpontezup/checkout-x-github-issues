package br.com.zup.edu.githubissues.issues;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private LocalDateTime criadaEm;

    @ManyToOne
    private Usuario autor;

    @ManyToOne // tabela ou coluna? coluna
    private Issue issue;
}
