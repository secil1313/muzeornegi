package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Sergi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String baslangicTarihi;
    private String bitisTarihi;
    private String konusu;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Müze> sergilendigiMüze;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Eser> eser;
    @ManyToMany
    private List<Ziyaretci> ziyaretci;


}
