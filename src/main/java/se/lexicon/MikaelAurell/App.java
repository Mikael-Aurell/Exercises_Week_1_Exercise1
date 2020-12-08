package se.lexicon.MikaelAurell;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //EXERCISE 1
        //System.out.println( "Hello World!" );
        //System.out.println( "Mikael Aurell" );

        //EXERCISE 2
        int inputValue = 2000;
        int leapYear = inputValue % 4;

        if (leapYear != 0 ) {
            System.out.println("This is not a leapYear");}
        else {
            System.out.println("This is a leapYear");}
    }
}
