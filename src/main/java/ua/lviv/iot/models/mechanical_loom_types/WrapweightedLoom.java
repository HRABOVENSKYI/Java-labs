package ua.lviv.iot.models.mechanical_loom_types;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ua.lviv.iot.models.loom.Country;
import ua.lviv.iot.models.loom_types.MechanicalLoom;
import ua.lviv.iot.models.loom_types.Shape;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class WrapweightedLoom extends MechanicalLoom {

    public WrapweightedLoom(Country originCountry, double price, double powerInWatts, int widthOfTheFormedTissue,
                            String materialOfTheProducedFabric, Shape construction) {
        super(originCountry, price, powerInWatts, widthOfTheFormedTissue, materialOfTheProducedFabric, construction);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
