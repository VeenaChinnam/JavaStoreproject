package JavaStore;

import java.util.UUID;

public class Product extends Object {
//    extends - parent child relationship going on obj is a parent of Product means Product is an Object
//    but object is not a product
    UUID id;
    private String product_name;
    String display_name;
    private Double price;
    private Double sale_percent;
    Boolean on_sale;

    public Product( String product_name, String display_name, Double price,
                    Double sale_percent, Boolean on_sale) {
        this.id = UUID.randomUUID();
//        this.product_name = product_name;
        this.setProduct_name(product_name);
        this.display_name = display_name;
//        this.price = price;
        this.setPrice(price);
//        this.sale_percent = sale_percent;
        this.setSale_percent(sale_percent);
        this.on_sale = on_sale;

    }
    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name =  product_name.toLowerCase().replace("", "");
//        this.product_name = product_name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price > 0) this.price = price;
        else this.price = 0D;
//        for double D
//        this.price = price;
    }

    public Double getSale_percent() {
        return sale_percent;
    }

    public void setSale_percent(Double sale_percent) {
        this.sale_percent = sale_percent;
    }


    //    the memory loc of the product java thinks that this is the object to be printer out
//    so to change that behaviour using toString

    @Override
    public String toString() {
        return "Product{" +
                "product_name='" + product_name + '\'' +
                ", display_name='" + display_name + '\'' +
                ", price=" + price +
                ", sale_percent=" + sale_percent +
                '}';
    }
}

