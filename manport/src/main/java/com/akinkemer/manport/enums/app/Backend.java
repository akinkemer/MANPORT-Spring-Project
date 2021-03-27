package com.akinkemer.manport.enums.app;

public enum Backend {
    PURE_JAVA("Pure Java"),
    JSP("JSP"),
    PL_SQL("PL/SQL"),
    SPRING("Spring"),
    SPRING_BOOT("Spring Boot"),
    OTHER("Other");
    private final String identifier;

    private Backend(String value){
        this.identifier=value;
    }

    @Override
    public String toString() {
        return identifier;
    }

    public static String getEnumByString(String value){
        for(Backend backend : Backend.values()){
            if(backend.identifier.equals(value)) return backend.name();
        }
        return null;
    }
}
