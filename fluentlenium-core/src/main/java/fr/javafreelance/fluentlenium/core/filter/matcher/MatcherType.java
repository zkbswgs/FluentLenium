package fr.javafreelance.fluentlenium.core.filter.matcher;

/**
 * Different integration actually supported by the framework.
 * PreFilter are integration than are supported by WebDriver as CSS Selector
 * PostFilter are used after the webdriver selection to integration the collection
 */
public enum MatcherType {
    CONTAINS("*"), START_WITH("^"), END_WITH("$"), EQUAL(""), NOT_CONTAINS(null), NOT_START_WITH(null), NOT_END_WITH(null);

    private String cssRepresentations;

    MatcherType(String cssRepresentations) {
        this.cssRepresentations = cssRepresentations;
    }

    public String getCssRepresentations() {
        return cssRepresentations;
    }
}