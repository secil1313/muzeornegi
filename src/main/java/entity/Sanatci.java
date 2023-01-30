package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Sanatci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer dogumYılı;
    private Integer olumYılı;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Eser> eserleri;
}
