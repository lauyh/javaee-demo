package com.github.lauyh.javaeerestapi.constant;

public enum ProductCategories {
    FNB("FNB", "Food and Beverage"),
    EnE("EnE", "Electronic");

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    private final String label;
    private final String value;

    ProductCategories(String label, String value) {
        this.label = label;
        this.value = value;
    }
}
