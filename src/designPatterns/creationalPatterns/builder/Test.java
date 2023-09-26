package designPatterns.creationalPatterns.builder;

public class Test {
    public static void main(String[] args) {
        Sandwich turkeySandwich = new Sandwich.Builder("Wheat", "Turkey")
                .withLettuce()
                .withSauce("Mustard")
                .build();

        System.out.println(turkeySandwich);
    }
}
