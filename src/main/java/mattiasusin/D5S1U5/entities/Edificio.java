package mattiasusin.D5S1U5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "edificio")
@NoArgsConstructor
@Getter
@Setter
public class Edificio {

    @Id
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String città;
    private String nomeEdificio;


    // COSTRUTTORI

    public Edificio(String città, String nomeEdificio) {
        this.città = città;
        this.nomeEdificio = nomeEdificio;
    }


    // TO STRING

    @Override
    public String toString() {
        return "Edificio{" +
                "id=" + id +
                ", città='" + città + '\'' +
                ", nomeEdificio='" + nomeEdificio + '\'' +
                '}';
    }
}
