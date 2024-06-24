/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pertemuansebelas.interface2;

import java.sql.SQLException;

/**
 *
 * @author A-25
 */
public class Main {
  public static void main(String[] args) {
    try {
      // Contoh penggunaan MemoryStorage
      DataStorage memoryStorage = new MemoryStorage();
      memoryStorage.writeData("Data stored in memory");
      System.out.println("Memory storage: " + memoryStorage.readData());
      
      // Contoh penggunaan FileStorage
      DataStorage fileStorage = new FileStorage("data.txt");
      fileStorage.writeData("Data stored in file");
      System.out.println("File storage: " + fileStorage.readData());
      
      // Contoh penggunaan DatabaseStorage
      DataStorage databaseStorage = new DatabaseStorage("database.db");
      databaseStorage.writeData("Data stored in database");
      System.out.println("Database storage: " + databaseStorage.readData());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
