public class PlacingOrder {

    public static void main(String[] args) {
        Ordering order = new Ordering();
        order.orderingItems("Shirt");
        order.orderingItems("Shirt","Pant");
        order.orderingItems("Shirt","Pant","Shoe");
        order.orderingItems("Shirt","Pant","Shoe","Belt");



    }
}
