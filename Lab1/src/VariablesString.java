import java.io.*;

/*
  Realizeaza adunarea a doua numere citite de la consola
  */
public class VariablesString
{
/*
Functia principala a programului; cand se executa programul
se executa de fapt metoda main() din clasa cu acelasi nume
@param args sunt parametrii programului, dati in linia de c-da
@throws deocamdata nu arunca exceptii
*/
public static void main (String[] args)
    {
    //'\t' -- horizontal tab
    //'\b' -- backspace
    //'\n' -- newline
    //'\f' -- form feed
    //'\r' -- carriage return

    //Primitive
    char c = 'A';
    char tab = '\t'; 
    char nul = ' ';
    char backslash = '\\';
    char singleQuote ='\'';
    char doubleQuote = '\"';
    char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 

    System.out.println ("--- 1 ---");
    System.out.println ( "c=["+c+"] tab=["+tab+"] nul=["+nul+"] backslash=["+backslash+"] singleQuote=["+singleQuote+"] doubleQuote=["+doubleQuote+"] charArray[0]=["+charArray[0]+"] charArray[4]=["+charArray[4]+"]\n");
    

    //Obiecte
    String str1;
    str1 = new String ( "This is a test... 1 ..." );
    String str2 = new String ( "This is a test... 2 ...");
    String str3 = new String ("");;

    System.out.println ("--- 2 ---");
    System.out.println ("str1="+str1+" str2="+str2);
    System.out.println ("lungime str1="+str1.length()+"\nlungime str2="+str2.length());        

    System.out.println ("Pozitia la care se intalneste prima data caracterul a");
    System.out.println ("pos="+str1.indexOf('a'));
    
    System.out.println ("Substring - de la pozitia 4 la pozitia 9");
    System.out.println ("pos="+str1.substring(4,9));
    
    System.out.println ("Conversie la majuscule");
    System.out.println ("str1="+str1.toUpperCase());
    
    System.out.println ("Concatenarea celor 2 siruri...");
    str3 = str1.concat (str2);
    System.out.println ("str3="+str3);
    System.out.println ("lungime str3="+str3.length());

    System.out.println ("Comparare...");
    System.out.println ("Rezultatul compararii="+str1.compareTo(str2));

    System.out.println ("Inlocuire caracter \'s\' cu caracter \'z\'...");
    System.out.println ("Rezultatul compararii="+str1.replace('s','z'));
    
    System.out.println ("Inlocuire caracter de pe pozitiile 3,5,7 cu cu caracter \'X\'...");
    str1 = str1.substring(0,2) + 'X' + str1.substring(2+1);
    str1 = str1.substring(0,4) + 'X' + str1.substring(4+1);
    str1 = str1.substring(0,6) + 'X' + str1.substring(6+1);
    System.out.println ("Rezultatul inlocuirii="+str1);

  }
  
}

// Teme
//
// Laborator
//
// 1. Compilati programul cu "javac VariablesString.java" si apoi rulati-l
//    cu "java VariablesString" (sau cu mediul integrat)
//
// 2. Creati o variabila de tip array(vector) ce retine 3 propozitii. Afisati-le
//
// 3. Folositi 2 functii pentru un obiect de tip String, la alegerea dvs.
//    descrieti ce realizeaza functiile ?
//
// 4. Pentru o variabila numita strM de tip String, cu un text introdus de dvs. realizati urmatoarele operatii (trebuie sa contina si litera 'c', nu pe prima pozitie)
//    a. Impartiti textul in doua (mijloc) din variabila strM si creati o variabila de tip String in care retineti cele doua jumatati inversate
//    b. Creati o variabila de tip String, in care retineti portiunea de text (din strM) delimitat in stanga de litera 'c'
//
// 5. Rulati "javadoc VariablesString.java" si vizualizati index.html creat !
//
// Casa
//
// 1. Creati o clasa noua cu numele Lab1String ce va contine doar cele 3 teme de mai sus (fara codul din acest fisier) (nu folositi copy-paste)
//
// Imi veti prezenta cele doua surse, la laborator, VariablesString.java modificat 
// Cum va voi nota:
// - daca tema intarzie mai mult de doua saptamani nu o mai consider;
// - daca nu se compileaza vi le trimit inapoi fara sa ma uit peste ele;
// - verific functionalitatea pe un exemplu ales de mine. Daca nu functioneaza
// conform asteptarilor, va scad 1p pe corectura.
// - temele duplicat sau aproape identice le voi colecta si voi imparti nota la numarul autorilor. 