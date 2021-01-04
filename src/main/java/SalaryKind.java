public enum SalaryKind {
    RSA(() -> 63000), SMIC(()->135000), UPPERSALAIRE(()-> SalarySupplier.Min + (int)(Math.random() * ((SalarySupplier.Max - SalarySupplier.Min) + 1)));

    private final SalarySupplier salaire;

    SalaryKind(SalarySupplier salaire) {
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire.next();
    }
}
