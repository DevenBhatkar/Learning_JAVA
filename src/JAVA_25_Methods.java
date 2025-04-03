
class calculator
{
    int a;

    public int add(int n1,int n2)
    {
        int r =n1+n2;
        return r;
    }
}
public class JAVA_25_Methods {

    public static void main(String[] args) {

        int num1 =4;
        int num2 =5;

        calculator calc =new calculator();

        int result =calc.add(num1,num2);

        System.out.println("The sum of two number is :"+result);


    }
}
