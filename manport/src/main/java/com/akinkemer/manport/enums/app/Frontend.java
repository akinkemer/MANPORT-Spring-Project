package com.akinkemer.manport.enums.app;

public enum Frontend {
    NO_UI("No UI"),
    PURE_HTML_CSS_JS("Pure HTML CSS Javascript"),
    JSP("JSP"),
    APACHE_WICKET("Apache Wicket"),
    BACKBONE_JS("Backbone.js"),
    REACT_JS("React.js"),
    OTHER("Other");
    private final String identifier;

    Frontend(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }

    public static String getEnumByString(String value){
        for(Frontend frontend : Frontend.values()){
            if(frontend.identifier.equals(value)) return frontend.name();
        }
        return null;
    }
}
