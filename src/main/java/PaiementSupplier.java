import java.util.List;
import java.util.Random;

public class PaiementSupplier {

    public PaiementSupplier(List<Contribuable> contribuableList) {
        Random rand = new Random();
        for (Contribuable ctb: contribuableList) {
            if (ctb.isExcluded()) {
                int nombreAleatoire = rand.nextInt(100 + 1);
                    if (!ctb.isLastTaxPayed() && nombreAleatoire < 10) {
                        ctb.setExcluded(true);
                    }
                    else if ( nombreAleatoire < 10 && ctb.isLastTaxPayed())
                        ctb.setLastTaxPayed(false);
                    else {
                        ctb.setLastTaxPayed(true);
                }
            }
        }
    }
}
