package com.akinkemer.manport.enums.app;

public enum Database {
    ORACLE("Oracle"),
    MSSQL("MsSQL"),
    DB2("DB2"),
    OTHER("Other");
    private final String identifier;
    @Override
    public String toString() {
        return identifier;
    }

    Database(String identifier) {
        this.identifier = identifier;
    }

    public static String getEnumByString(String value){
        for(Database database : Database.values()){
            if(database.identifier.equals(value)) return database.name();
        }
        return null;
    }
}
