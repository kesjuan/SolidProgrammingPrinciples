import java.util.List;

public class CustomerService {
    private final CustomerRepository customerDao;

    public CustomerService(CustomerRepository customerDao) {
        this.customerDao = customerDao;
    }
}
interface CustomerRepository{
    List<String> findNames();
}