package designPatterns.creationalPatterns.builder;

// Step 1: Create a Sandwich class with a nested Builder class.
public class Sandwich {
    private String bread;
    private String filling;
    private String sauce;
    private boolean hasCheese;
    private boolean hasLettuce;

    private Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.filling = builder.filling;
        this.sauce = builder.sauce;
        this.hasCheese = builder.hasCheese;
        this.hasLettuce = builder.hasLettuce;
    }

    public static class Builder {
        private String bread;
        private String filling;
        private String sauce;
        private boolean hasCheese;
        private boolean hasLettuce;

        public Builder(String bread, String filling) {
            this.bread = bread;
            this.filling = filling;
        }

        public Builder withSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder withCheese() {
            this.hasCheese = true;
            return this;
        }

        public Builder withLettuce() {
            this.hasLettuce = true;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sandwich with ").append(bread).append(" bread, ");
        sb.append(filling).append(" filling");
        if (hasCheese) {
            sb.append(", with cheese");
        }
        if (hasLettuce) {
            sb.append(", with lettuce");
        }
        if (sauce != null) {
            sb.append(", with ").append(sauce).append(" sauce");
        }
        return sb.toString();
    }
}

