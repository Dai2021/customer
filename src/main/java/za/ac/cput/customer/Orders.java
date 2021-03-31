package za.ac.cput.customer;


/**
 * Created by Asanda Mabaso 205049990
 */


public class Orders {

    private String name,surname;
    private int orderNumber, items;

    public Orders (String name, String surname, int orderNumber, int items) {
        this.name = name;
        this.surname = surname;
        this.orderNumber = orderNumber;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getItems() {
        return items;
    }
}
