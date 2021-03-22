public class PrintTable {
    /*
    * (Print a table) Write a program that displays the following table. Cast floating-
    point numbers into integers.*/
    public static void main(String[] args) {
        System.out.println("a\t" + "b\t" + "pow(a, b)");
        for (int i=1;i<6;i++) System.out.println(i+"\t"+(i+1)+"\t"+(int)Math.pow(i,i+1));
    }
}
