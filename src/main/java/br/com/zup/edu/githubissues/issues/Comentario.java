package br.com.zup.edu.githubissues.issues;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Comentario {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 4000)
    private String descricao;

    private LocalDateTime criadaEm = LocalDateTime.now();

    @ManyToOne
    private Usuario autor;

    @ManyToOne
    private Issue issue;

}
