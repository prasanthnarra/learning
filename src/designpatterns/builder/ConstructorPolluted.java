package designpatterns.builder;

public class ConstructorPolluted {

    private String a1,a2,a3,a4,a5;

    public ConstructorPolluted(String a1) {
        this.a1 = a1;
    }

    public ConstructorPolluted(String a1, String a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public ConstructorPolluted(String a1, String a2, String a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public ConstructorPolluted(String a1, String a2, String a3, String a4) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public ConstructorPolluted(String a1, String a2, String a3, String a4, String a5) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    private ConstructorPolluted(Builder builder) {
        this.a1 = builder.a1;
        this.a2 = builder.a2;
        this.a3 = builder.a3;
        this.a4 = builder.a4;
        this.a5 = builder.a5;
    }

    public static class Builder {

        private String a1;
        private String a2;
        private String a3;
        private String a4;
        private String a5;

        public Builder withA1(String a1) {
            this.a1 = a1;
            return this;
        }

        public Builder withA2(String a2) {
            this.a2 = a2;
            return this;
        }

        public Builder withA3(String a3) {
            this.a3 = a3;
            return this;
        }

        public Builder withA4(String a4) {
            this.a4 = a4;
            return this;
        }

        public Builder withA5(String a5) {
            this.a5 = a5;
            return this;
        }

        public ConstructorPolluted build() {
            return new ConstructorPolluted(this); // new ConstructorPolluted(a1,a2,a3,a4,a5);
        }
    }

}
