package za.ac.cput.custmer;



import za.ac.cput.customer.Orders;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



/**
 *  Created by Asanda Mabaso 205049990
 */

public class OrdersTest {

    private Orders order = new Orders("asanda", "mabaso", 98745, 2525);


    @Test
    public void getName() throws Exception {
    }

    @Test
    public void getSurname() throws Exception {
        assertSame("mabaso", order.getSurname());
    }

    @Test
    public void getOrderNumber() throws Exception {
        assertEquals(98745, order.getOrderNumber());
    }
    @Test
    public void getItems() throws Exception {

    }

    }

