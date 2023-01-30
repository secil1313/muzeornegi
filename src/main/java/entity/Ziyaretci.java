package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Ziyaretci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private Integer telefonNumarası;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Sergi> sergi;
}
