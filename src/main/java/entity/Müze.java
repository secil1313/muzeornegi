package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Müze {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String bulunduguSehir;
    private int acilisSaati;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Sergi> sergi;

}
