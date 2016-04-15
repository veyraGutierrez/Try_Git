import java.util.*;

/**
 * Created by veyra.gutierrez on 11/04/2016.
 */
public class TheArrayProblem {
    public static void main (String [] args){

        Product door = new Product("Wooden", 20);
        Product floor = new Product("Floor Panel", 35);
        Product window = new Product("Glass Window", 10);


//        Collection<Product> oProduct = new ArrayList<Product>();
//
//        oProduct.add(door);
//        oProduct.add(floor);
//        oProduct.add(window);
//
//        iterateCollection(oProduct);
//
//        System.out.println(oProduct);
//
//        //Lists
//
//        //Sets
//        Set<Product> oSet = new HashSet<Product>();
//
//        oSet.add(door);
//        oSet.add(floor);
//        oSet.add(window);
//
//        iterateSet(oSet);

        //Map
        Map<String, Integer > oMap = new HashMap<String , Integer>();
        oMap.put("key1",1);
        oMap.put("key2",2);
        //System.out.println(oMap.get("key1").toString());
        System.out.println(oMap.values());
        oMap.keySet();


//
//        //SortedSet
//        SortedSet<Product> oSortSet = new TreeSet<Product>(Product.BY_WEIGHT);
//        oSortSet.add(door);
//        oSortSet.add(floor);
//        oSortSet.add(window);
//
//        iterateSortedSet(oSortSet);
    }


    public static void iterateCollection (Collection<Product> oArrayList){

        final Iterator <Product> oProductIterator = oArrayList.iterator();

        for(Product product : oArrayList){
            System.out.println("List of "+ product);
        }
//        while (oProductIterator.hasNext()){
//            Product currentProduct = oProductIterator.next();
//            if (currentProduct.getWeight()>15) {
//                System.out.println(currentProduct);
//            }
//            else {
//                System.out.println(currentProduct);
//                oProductIterator.remove();
//            }
//        }

    }

    public static void iterateSet(Set<Product> oSet){
        final Iterator <Product> oProductIterator = oSet.iterator();
        while (oProductIterator.hasNext()){
            Product currentProduct = oProductIterator.next();
            System.out.println("Set of "+ currentProduct);
        }

    }

    public static void iterateSortedSet(SortedSet<Product> oSSet){
        final Iterator <Product> ossProductIterator = oSSet.iterator();
        while (ossProductIterator.hasNext()){
            Product currentOssProduct = ossProductIterator.next();
            System.out.println("SortSet of "+ currentOssProduct);
        }

    }
}
