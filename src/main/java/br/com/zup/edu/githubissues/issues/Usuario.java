package br.com.zup.edu.githubissues.issues;

import javax.persistence.*;

@Entity
@Table(name = "TB_USUARIOS")
public class Usuario {

    /**
     * SELECT nextval('seq_usuario');
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_USUARIO")
    @SequenceGenerator(name="SEQ_USUARIO", sequenceName="SEQ_USUARIO", allocationSize = 1)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false)
    private String senha;

}
