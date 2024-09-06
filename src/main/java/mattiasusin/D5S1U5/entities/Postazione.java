package mattiasusin.D5S1U5.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    // COSTRUTTORI


    public Postazione(String descrizione, TipoPostazione tipoPostazione, int maxPersone) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxPersone = maxPersone;
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
