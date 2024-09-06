package mattiasusin.D5S1U5.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mattiasusin.D5S1U5.enums.TipoPostazione;

import java.util.UUID;

@Entity
@Table(name = "postazione")
@NoArgsConstructor
@Getter
@Setter
public class Postazione {
    @Id
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String descrizione;

    @Enumerated
    private TipoPostazione tipoPostazione;
    private int maxPersone;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    // COSTRUTTORI

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int maxPersone, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxPersone = maxPersone;
        this.edificio = edificio;
    }


    // TO STRING

    @Override
    public String toString() {
        return "Postazione{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", tipoPostazione=" + tipoPostazione +
                ", maxPersone=" + maxPersone +
                '}';
    }
}
