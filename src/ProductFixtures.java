/**
 * Created by veyra.gutierrez on 11/04/2016.
 */
public class ProductFixtures {

    public static Product door = new Product("Door", 40);
    public static Product floorPlanel = new Product("Door", 40);
    public static Product ktchenPanel = new Product("Door", 40);

    public static Supplier bob = new Supplier("Bob's Depot");
    public static Supplier sara = new Supplier("Sara's Depot");

    static
    {
        bob.products().add(floorPlanel);
    }
}
