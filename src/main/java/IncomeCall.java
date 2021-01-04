import java.util.List;


public class IncomeCall {

    public IncomeCall(List<Contribuable> contribuableList) {
            for (Contribuable ctb: contribuableList) {
                if (ctb.isExcluded())
                    System.out.print("+1");
            }
    }
}
