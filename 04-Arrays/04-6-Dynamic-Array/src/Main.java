public class Main {
    public static void main(String[] args) {
        // init : data(size=0,capacity=10)
        Array<Integer> arr = new Array<>();
        // data(size=0,capacity=10) : 0
        // data(size=1,capacity=10) : 1
        // ...
        // data(size=8,capacity=10) : 8
        // data(size=9,capacity=10) : 9
        for (int i = 0; i < 10; i++)
            arr.addLast(i);
        System.out.println(arr);

        System.out.println("===============Array expansion operation==============");
        // data(size=10,capacity=10)
        arr.addLast(10);// Array expansion
        System.out.println(arr);

        System.out.println("===============Array shrink operation==============");
        // data(size=11,capacity=20)
        arr.removeLast();// Array shrink
        System.out.println(arr);
    }
}
