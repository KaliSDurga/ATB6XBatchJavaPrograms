package ex_16102024;

public class Lab049 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++);

        //part A --> ++a ep_val =11  , a =11
        //part B --> a++ ep_val = 11 , a =12
        //part c --> a++ ep_val =12  , a =13
        System.out.println(a);
    }
}
