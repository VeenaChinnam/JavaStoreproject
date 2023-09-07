package JavaStore;

public class JavaStore {
    public static void main(String[] args){
        Product p1 = new Product("Shirt Blue", "A Blue Shirt",10D,0.0D,false );
        Product p2 = new Product("Shirt Red", "A Red Shirt",10D,0.0D,false );
        Product p3 = new Product("Sharpen Pencil","Pencils",2D,0.0D, true);
        System.out.println(p1);

        Store store = new Store();
        store.add(p1);
        store.add(p2);
        store.add(p3);

        System.out.println("Before");
        System.out.println(store);
        System.out.println("After");
        store.remove(p1.id);
        System.out.println(store);

    }

}
