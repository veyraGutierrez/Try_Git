import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by veyra.gutierrez on 11/04/2016.
 */
public class Shipment implements Iterable <Product>{
    private static final int LICHT_VAN_MAX_WEIGHT = 15;
    private static final int PRODUCT_NOT_PRESENT = -1;
    private final List<Product> products = new ArrayList<>();
    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    private final List<Product> productos = new LinkedList<>();


    public void add(Product oProd){
        products.add(oProd);

    }

    public void replace(Product oOldProd, Product oNewProd){
        final int index = products.indexOf(oOldProd);
        if (index != PRODUCT_NOT_PRESENT) {
            products.set(index, oNewProd);
        }
    }

    public void prepared(){
        products.sort(Product.BY_WEIGHT);
        int splitpoint = findSplitPoint();

        lightVanProducts = products.subList(0,splitpoint);
        heavyVanProducts = products.subList(splitpoint, products.size());

    }

    private int findSplitPoint() {
        for (int i= 0; i< products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.getWeight() > LICHT_VAN_MAX_WEIGHT) {
                return i;
            }

        }
        return 0;
    }

    public List<Product> getLightVanProducts(){
        return heavyVanProducts;
    }

    public List<Product> getHeavyVanProducts(){
        return  lightVanProducts;
    }

    public LinkedList<Product> test(){
        return null;
    }


    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
