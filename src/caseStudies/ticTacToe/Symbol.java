package caseStudies.ticTacToe;

public enum Symbol {
    CROSS("X"),
    CIRCLE("O"),
    TRIANGLE("^"),
    SQUARE("[]");

    public final String label;

    Symbol(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }
}
