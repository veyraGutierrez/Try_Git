import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

/**
 * Created by veyra.gutierrez on 11/04/2016.
 */
public class Product {

    public static final Comparator<Product> BY_WEIGHT = comparing(Product::getWeight);
    public static final Comparator<Product> BY_NAME = comparing(Product::getName);
//            new Comparator<Product>()
//            {
//                public int compare(final Product p1, final Product p2)
//                {
//                    return Integer.compare(p1.getWeight(), p2.getWeight());
//                }
//            };

    private final String name;
    private final int weight;

    public Product(String sName, int iWeight){
        this.name = sName;
        this.weight = iWeight;
    }

    public String getName(){
        return name;
    }

    public int getWeight (){
        return weight;
    }

    @Override
    public String toString(){
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(final Object o){
        if (this == o)
            return true;
        if(o==null || getClass() != o.getClass())
            return false;
        final Product product = (Product)o;

        if(weight!= product.weight)
            return false;

        return !(name!=null ? !name.equals(product.name):product.name!=null);
    }

    @Override
    public int hashCode(){
        //return Objects.hash(name, weight);

        int result = name != null ? name.hashCode():0;
        result = 31+result+weight;
        return result;
    }

}
