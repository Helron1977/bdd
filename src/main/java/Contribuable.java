
public class Contribuable {
    private int numFiscal;
    private final SalaryKind salaryKind;
    private int nbMonthPayed;
    private int nbMonthUnpayed;
    private int salary;
    private int payedAmount;
    private int taxAmount;
    private boolean lastTaxPayed = true;
    private boolean excluded;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public Contribuable(int numFiscal, SalaryKind salaryKind) {
        this.numFiscal = numFiscal;
        this.salaryKind = salaryKind;
        this.salary = salaryKind.getSalaire();
    }

    private Param[] buildParams(){
        return new Param[]{
                new Param<String, Integer>("nbMonthPayed", nbMonthPayed),
                new Param<String, Integer>("nbMonthUnpayed", nbMonthUnpayed),
                new Param<String, Integer>("Salary", salary),
                new Param<String, Integer>("PayedAmount", payedAmount),
                new Param<String, Integer>("TaxAmount", taxAmount),
                new Param<String, Boolean>("lastIncomePayed", lastTaxPayed),
                new Param<String, Boolean>("excluded", excluded)
        };
    }

    public String toString() {
        StringBuilder strBuild = new StringBuilder();
        for (Param params : buildParams()) {
            strBuild.append( ANSI_GREEN).append(" "+ params.getK()).append(" "+ ANSI_RESET).append(params.getV());
        }
        return strBuild.toString();
    }

    public int getNumFiscal() {
        return numFiscal;
    }

    public void setNumFiscal(int numFiscal) {
        this.numFiscal = numFiscal;
    }

    public int getNbMonthPayed() {
        return nbMonthPayed;
    }

    public void setNbMonthPayed(int nbMonthPayed) {
        this.nbMonthPayed = nbMonthPayed;
    }

    public int getNbMonthUnpayed() {
        return nbMonthUnpayed;
    }

    public void setNbMonthUnpayed(int nbMonthUnpayed) {
        this.nbMonthUnpayed = nbMonthUnpayed;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(int payedAmount) {
        this.payedAmount= payedAmount;
    }

    public int getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount= taxAmount;
    }

    public boolean isLastTaxPayed() {
        return lastTaxPayed;
    }

    public void setLastTaxPayed(boolean lastTaxPayed) {
        this.lastTaxPayed= lastTaxPayed;
    }

    public boolean isExcluded() {
        return !excluded;
    }

    public void setExcluded(boolean excluded) {
        this.excluded = excluded;
    }
}
