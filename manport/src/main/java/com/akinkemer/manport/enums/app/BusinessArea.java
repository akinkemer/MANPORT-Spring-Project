package com.akinkemer.manport.enums.app;

public enum BusinessArea {
    MANUFACTURING("Manufacturing"),
    QUALITY("Quality"),
    BOTH("Both"),
    OTHER("Other");

    private final String identifier;

    private BusinessArea(String value){
        this.identifier=value;
    }

    @Override
    public String toString() {
        return identifier;
    }

    public static String getEnumByString(String value){
        for(BusinessArea businessArea : BusinessArea.values()){
            if(businessArea.identifier.equals(value)) return businessArea.name();
        }
        return null;
    }
}
