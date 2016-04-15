import java.util.Iterator;
import java.util.TreeSet;


/**
 * Created by veyra.gutierrez on 11/04/2016.
 */
public class ProductCatalogue implements Iterable<Product>{
    private final TreeSet products = new TreeSet<>(Product.BY_NAME);
    public void isSupplieBy(Supplier oSupplier){
        products.addAll(oSupplier.products());
    }
    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
