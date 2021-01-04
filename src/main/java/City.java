import java.util.ArrayList;
import java.util.List;

public class City {
    private int taxRate;
    private final int nbRSA;
    private final int nbSMIC;
    private final int nbUPPERSALAIRE;
    private final List<Contribuable> contribuableList = new ArrayList<Contribuable>();
    //TODO renommer
    int monthNumber = 0;

    public City(int taxRate, int nbRSA, int nbSMIC, int nbUPPERSALAIRE) {
        this.taxRate = taxRate;
        this.nbRSA = nbRSA;
        this.nbSMIC = nbSMIC;
        this.nbUPPERSALAIRE = nbUPPERSALAIRE;
        initContribuables();
    }

    public void nextIncomeCall() {

        IncomeCall incomeCall = new IncomeCall(contribuableList);
    }

    private void initContribuables() {
        int numFiscal = 0;
        numFiscal = initRsaContribuables(numFiscal);
        numFiscal = initSmicContribuables(numFiscal);
        numFiscal = initUpperSalairesContribuables(numFiscal);
    }

    private int initUpperSalairesContribuables(int numFiscal) {
        for( int i = 0; i < this.nbUPPERSALAIRE; i++) {
            Contribuable contribuable = new Contribuable(i, SalaryKind.UPPERSALAIRE);
            contribuableList.add(contribuable);
            numFiscal++;
        }
        return numFiscal;
    }

    private int initSmicContribuables(int numFiscal) {
        for( int i = 0; i < this.nbSMIC; i++) {
            Contribuable contribuable = new Contribuable(i, SalaryKind.SMIC);
            contribuableList.add(contribuable);
            numFiscal++;
        }
        return numFiscal;
    }

    private int initRsaContribuables(int numFiscal) {
        for( int i = 0; i < this.nbRSA; i++) {
            Contribuable contribuable = new Contribuable(i, SalaryKind.RSA);
            contribuableList.add(contribuable);
            numFiscal++;
        }
        return numFiscal;
    }

    public List<Contribuable> getContribuableList() {
        return contribuableList;
    }

    public void nextPaiement() {
        PaiementSupplier paiement = new PaiementSupplier(contribuableList);
    }
}
