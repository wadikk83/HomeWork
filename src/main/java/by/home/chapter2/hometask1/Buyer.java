package by.home.chapter2.hometask1;

import java.util.List;

public class Buyer {

    String name;
    List<String> productList;

    public Buyer(String name, List<String> productList) {
        this.name = name;
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public List<String> getProductList() {
        return productList;
    }

}
