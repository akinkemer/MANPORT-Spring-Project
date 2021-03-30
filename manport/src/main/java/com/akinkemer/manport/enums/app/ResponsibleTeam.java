package com.akinkemer.manport.enums.app;

public enum ResponsibleTeam {
    MANUFACTURING_SYSTEMS("Manufacturing Systems"),
    EMC_QUALITY("EMC Quality"),
    OTHER("Other");

    private final String identifier;

    ResponsibleTeam(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    public static String getEnumByString(String value){
        for(ResponsibleTeam responsibleTeam : ResponsibleTeam.values()){
            if(responsibleTeam.identifier.equals(value)) return responsibleTeam.name();
        }
        return null;
    }
}
