public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");
        System.out.println("Area = " + tri.getArea()+" details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);
        Triangle tri2 = new Triangle(1.1F, 2.0F, "red");
        System.out.println("Triangle2 equals to Triangle1: " + tri.equals(tri2));
        Triangle tri3 = new Triangle(1.1F, 2.0F, "brown");
        System.out.println("Triangle3 equals to Triangle1: " + tri.equals(tri3));

        System.out.println("\n" + "//////////////////////////////////////////" + "\n");

        SimpleChainedList myList = new SimpleChainedList(1);
        myList.addValue(2);
        myList.addValue(3);
        myList.addValue(4);
        myList.addValue(5); myList.addValue(6); myList.addValue(7); myList.addValue(8); myList.addValue(9);
        myList.addValue(10);

        myList.removeNodeByValue(4);
        myList.removeNodeByValue(6);
        myList.removeNodeByValue(8);
        myList.removeNodeByValue(10);


        for (int value : myList.listNodes()) {
            System.out.println(value);
        }

        System.out.println("\n" + "//////////////////////////////////////////" + "\n");

        DoubleChainedList doubleList = new DoubleChainedList(1);
        doubleList.addValue(2);
        doubleList.addValue(3);
        doubleList.addValue(4);
        doubleList.addValue(5); doubleList.addValue(6); doubleList.addValue(7); doubleList.addValue(8);
        doubleList.addValue(9); doubleList.addValue(10);

        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);

        for (int value : doubleList.listNodes()) {
            System.out.println(value);
        }

    }
}