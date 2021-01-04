import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ContribuableDao implements Dao<Contribuable>{
    private final List<Contribuable> contribuables = new ArrayList<>();

    public ContribuableDao() {
        contribuables.add(new Contribuable(999, SalaryKind.RSA));
    }

    @Override
    public Optional<Contribuable> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Contribuable> getAll() {
        return contribuables;
    }

    @Override
    public void save(Contribuable contribuable) {
        contribuables.add(contribuable);
    }

    @Override
    public void update(Contribuable contribuable, String[] params) {
        contribuable.setLastTaxPayed((Boolean.parseBoolean(params[0])));
        contribuable.setExcluded((Boolean.parseBoolean(params[1])));
        contribuable.setNbMonthPayed(Integer.parseInt(params[2]));
        contribuable.setSalary(Integer.parseInt(params[3]));
        contribuables.add(contribuable);
    }

    @Override
    public void delete(Contribuable contribuable) {
        contribuables.remove(contribuable);
    }
}
