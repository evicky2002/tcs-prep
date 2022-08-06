import java.util.*;

class MyClass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();
        String category = kb.nextLine();
        HashMap<String, Integer> brandPrice = new HashMap<String, Integer>();
        int n = Integer.parseInt(kb.nextLine());
        for (int i = 0; i < n; i++) {
            String brand = kb.nextLine();
            int price = Integer.parseInt(kb.nextLine());
            brandPrice.put(brand, price);
        }
        Product product = new Product(name, category, brandPrice);
        String out = product.findCostliestBrand();
        System.out.println(out);
    }
}

class Product {
    String Name;
    String Category;
    HashMap<String, Integer> BrandPrice = new HashMap();

    Product(String name, String category, HashMap<String, Integer> brandPrice) {
        this.Name = name;
        this.Category = category;
        this.BrandPrice = brandPrice;
    }

    public String findCostliestBrand() {
        int max = Integer.MIN_VALUE;
        Collection<Integer> values = BrandPrice.values();
        String res = "";
        for (Integer v : values) {
            max = Math.max(max, v);
        }
        for (java.util.Map.Entry entry : BrandPrice.entrySet()) {
            if ((int) entry.getValue() == max) {
                res = entry.getKey().toString();
            }
        }
        String out = "Costliest Brand = " + res;
        return out;
    }
}