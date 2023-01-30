package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Eser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer yapımYılı;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Sanatci> sanatçısı;
    @ManyToOne(cascade = CascadeType.ALL)
    private Sergi sergi;
}
