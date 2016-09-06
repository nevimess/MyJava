package com.Michal.Libera;

import java.util.List;


 
public class JDBCTest {
 
    public static void main(String[] args) {
        Biblioteka b = new Biblioteka();
        b.insertCzytelnik("Karol", "Maciaszek", "92873847182");
        b.insertCzytelnik("Piotr", "Wojtecki", "89273849128");
        b.insertCzytelnik("Abdul", "Dabdul", "");
 
        b.insertKsiazka("Cień Wiatru", "Carlos Ruiz Zafon");
        b.insertKsiazka("W pustyni i w puszczy", "Henryk Sienkiewicz");
        b.insertKsiazka("Harry Potter", "Joanne Kathleen Rowling.");
 
        List<Czytelnik> czytelnicy = b.selectCzytelnicy();
        List<Ksiazka> ksiazki = b.selectKsiazki();
 
        System.out.println("Lista czytelników: ");
        for(Czytelnik c: czytelnicy)
            System.out.println(c);
 
        System.out.println("Lista książek:");
        for(Ksiazka k: ksiazki)
            System.out.println(k);
 
        b.closeConnection();
    }
}
