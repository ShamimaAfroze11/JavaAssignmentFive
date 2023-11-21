package Inheritance;

public class MethodOverLoading {
    // Overloaded sum method and this sum takes two int parameters
       public int sum(int x, int y)

    {
       return (x + y);
    }
    // Overloaded sum method and this sum takes three int parameters
    public int sum(int a, int b, int c)
    {

        return (a+ b + c);
    }
    // Overloaded sum method and this sum takes four float parameters
    public float sum(float a, float b, float c, float d)
    {
        return (a + b + c + d);
    }
    public static void main(String[] args) {
        MethodOverLoading methodOverLoading =  new MethodOverLoading();
        System.out.println("Summation of two integer numbers:"+ " "+methodOverLoading.sum(179, 769));
        System.out.println("Summation of three integer numbers:"+" "+methodOverLoading.sum(19, 23, 78));
        System.out.println("Summation of four decimal numbers:"+" "+methodOverLoading.sum(17.890F, 75.52379F, 117.976F, 66.7684F));
    }
}
