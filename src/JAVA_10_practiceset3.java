public class JAVA_10_practiceset3 {
    public static void main(String[] args) {
        //1)Write a Java program to convert a string to lower case

        /*String name = "Jordan";

        System.out.println(name);

        String lowercase = name.toLowerCase();

        System.out.println(lowercase);*/


        //2)Write a Java program to replace spaces with underscores


       /* String name2 = "Jor dan";

        System.out.println(name2.replace(' ','_'));*/


        //3)Write a Java program to fill in a letter template which looks like below:
        //  letter = "Dear </name>, Thans a lot "
        //  Replace </name/> with a String (some name)


        /*String letter = "Dear </name>, Thanks a lot";
        String name ="deven";

        String personlizedletter= letter.replace("</name>",name);

        System.out.println(personlizedletter);*/


        //4)Write a Java program to detect double and triple spaces in a string
/*
        String myString = "This string contains double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));*/

        //5)Write a program to format the following letter using escape sequence Characters.letter =
        //= "Dear Harry, This Java Course is nice. Thanks"


        /*String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);*/

    }
}
