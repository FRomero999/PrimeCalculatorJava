package org.example;

/**
 * Mi primera aplicación de Java
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello 2DAM!" );
        System.out.println( "I'm a prime calculator Java Class..." );
        System.out.println( PrimeCalculator.isPrime(5));
        System.out.println( PrimeCalculator.inRange(90,111));
        System.out.println( PrimeCalculator.next(9));
        System.out.println( PrimeCalculator.next(10,4));
    }
}
