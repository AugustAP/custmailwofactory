package customermailapplication;

public class CustomerFactory {
    public static Customer createCustomer(String type)
    {   
        Customer cs = null;
        switch(type) {
            case "Regular":
                cs = new RegularCustomer();
                break;
            case "Mountain":
                cs = new MountainCustomer();
                break;
            case "Delinquent":
                cs = new DelinquentCustomer();
                break;
        }
        return cs;
    }
}
