package ua.lviv.iot.loomshop.models.loom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "looms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected Country originCountry;
    protected double price;
    protected double powerInWatts;
    protected int widthOfTheFormedTissue;
    protected String materialOfTheProducedFabric;
}
