package com.Michal.Libera;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

//Klasa realizuje zarządzanie przykładową relacyjną bazą danych w oparciu o SQLLite


public class Biblioteka {

	public static final String DRIVER = "org.sqlite.JDBC";
	public static final String DB_URL = "jdbc:sqlite:biblioteka.db";
	
	private Connection conn;
	private Statement stat;
	
	public Biblioteka(){
		
		try{
			
			Class.forName(Biblioteka.DRIVER);
		}
		
		catch(ClassNotFoundException e){
			
			System.err.println("Brak sterownika JDBC");
			e.printStackTrace();
		}
		
		try{
			
			conn = DriverManager.getConnection(DB_URL);
			stat = conn.createStatement();
		}
		
		catch(SQLException e){
			
			System.err.println("Blad polaczenia z baza danych");
			e.printStackTrace();
		}
		
		
	}
	
	public boolean createTables(){
		
		// zapytania SQL do utworzenia tabel
		String createTable = "CREATE TABLE IF NOT EXISTS czytelnicy (id_czytelnika INTEGER PRIMARY KEY AUTOINCREMENT, imie varchar(255), nazwisko varchar(255), pesel int)";
		String createKsiazki = "CREATE TABLE IF NOT EXISTS ksiazki (id_ksiazki INTEGER PRIMARY KEY AUTOINCREMENT, tytul varchar(255), autor varchar(255))";
		String createWypozyczenia = "CREATE TABLE IF NOT EXISTS wypozyczenia (id_wypozycz INTEGER PRIMARY KEY AUTOINCREMENT, id_czytelnika int, id_ksiazki int)";
		
		try{
			stat.execute(createTable);
			stat.execute(createKsiazki);
			stat.execute(createWypozyczenia);
		}
		catch(SQLException e){
			
			System.err.println("Blad przy tworzeniu tabeli!");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
}
