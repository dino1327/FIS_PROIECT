package org.fis2022.services;

import org.dizitart.no2.Nitrite;

import static org.fis2022.services.FileSystemService.getPathToFile;

public class DBService {

    private static Nitrite database;

    public static void initDatabase() {
        database = Nitrite.builder()
                .filePath(getPathToFile("RealEstateDB.db").toFile())
                .openOrCreate("admin", "realestate");
    }

    public static Nitrite getDatabase(){
        return database;
    }

    public static void closeDatabase(){ database.close();}
}
