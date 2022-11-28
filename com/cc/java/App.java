package com.cc.java;
import java.util.Arrays;

public class App {
    public static void main( String[] args ) {

		output( "\n" + App.c( "#g" ) + "---int declaration----------------------------" );	
			// Deklaration: int (setzt 4 )
				int [] intArr = new int [4];
				output( "\tLänge Array: " + intArr.length );	
			
			// Index
				output( "\t3. Element " + intArr[ 2 ] );
			
			// Übreschreibe Index 0
				intArr[0] = 10;
				output( "\t1. Element " + intArr[ 0 ] );

			// Übreschreibe letzten Index
				intArr[ intArr.length - 1 ] = 11;
				
			// Ausgabe aller Indexe per for Schleife
				for ( int i = 0; i < intArr.length; i++ ) {
					output( "\tElement: " + i + " : "+ intArr[ i ] );
				}
			
		output( "\n" + App.c( "#g" ) + "---String declaration----------------------------" );	

			// Deklaration: String als Speicherbelegung
				// String [] strArr = new String [ 2 ];
			// oder Deklaration: String als Wert
				String [] strArr = { "Hallo", "Nikola" };
				
				for (int i = 0; i < strArr.length; i++) {
					output("\tElement: " + strArr[i]);
				}
			
			
		output( "\n" + App.c( "#g" ) + "---Mehrdimensionale Arrays-----------------------" );	
			// Deklaration: als Speicherbelegung
				// String [][] strMdArr = new String [ 2 ][ 2 ];
			// oder Deklaration: als Wert
				String [][] strMdArr = { { "Max", "Mustermann" }, { "Maxine", "Musterfrau" } };
				
			// {{0,2,1},{1,0,0}}  x|y|z
				
				output( "\t" + strMdArr[ 0 ][ 0 ] );
				output( "\t" + strMdArr[ 1 ][ 1 ] );
				
			// nested loops
				for ( int i = 0; i < strMdArr.length; i++ ) {
					for ( int j = 0; j < strMdArr.length; j++ ) {
						output( "\tIndizes i/j: " + "i:" +  i + " j:"+ j + " " + strMdArr[ i ][ j ] );
					}
				}
		
		output( "\n" + App.c( "#g" ) + "---Chars Arrays----------------------------------" );	
			// Deklaration | Chars
			char [] letters = { 'd', 'c', 'a', 'A', 'b' };
	
				output( "\t" + App.c( "#y" ) + "---- vor Sortierung: " );
				for ( int i = 0; i < letters.length; i++ ) {
					output( "\t\t" + letters[ i ] );	
				}

			// Sortierfunktion --> sortiertes Array
				Arrays.sort( letters );  // Statische Klasse | Methode

				output( "\t" + App.c( "#y" ) + "---- nach Sortierung: " );
				for ( int i = 0; i < letters.length; i++ ) {
					output( "\t\t" + letters[ i ] );	
				}

			// Sortierfunktion --> sortiertes Array
				output( "\t" + App.c( "#y" ) + "---- Suche: erfolgreich ");
				// ... danach Suche (1)
					int searchIndex = Arrays.binarySearch( letters, 'a' );
					output( "\t\t" + App.c( "#r" ) + "---- Binäre Suche: ");
					output( "\t\t\tsearchIndex: " + searchIndex );

				output( "\t" + App.c( "#y" ) + "---- Suche: erfolglos ");
				// ... danach Suche (2).... isInArray()
					searchIndex = Arrays.binarySearch( letters, 'e' );
					output( "\t\t" + App.c( "#r" ) + "---- Binäre Suche: isInArray() ");
					output( "\t\t\tsearchIndex: " + searchIndex );  // -(length+1)
				
			//.. Array füllen
				output( "\t" + App.c( "#y" ) + "---- fill() ");
				//... Array füllen
					Arrays.fill( letters, '0' );
					for ( int i = 0; i < letters.length; i++ ) {
						output( "\t\t" + ( letters[ i ] ) );
					}
		output( "\n" + App.c( "#g" ) + "---End of File----------------------------------" );	

    }

	// standart Methode
    private static void output( String outStr ) {
        System.out.println( outStr );
    }
	// überladene Methode
	private static void output( char outChar ) {
		System.out.print( outChar );
    }
	public static String c( String c ) {
        switch ( c ) {
            case "#r":
                return "\u001b[31m";
            case "#g":
                return "\u001b[32m";
            case "#y":
                return "\u001b[33m";
            case "#b":
                return "\u001b[34m";
            case "#p":
                return "\u001b[35m";
            case "#c":
                return "\u001b[36m";
            default:
                return "\u001b[0m";
        }
	}
}
