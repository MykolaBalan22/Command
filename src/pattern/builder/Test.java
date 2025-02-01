package pattern.builder;

import model.User;

public class Test {

    private int counter;
    private String barcode;
    private User manager;

    private Test(int counter, String barcode, User manager) {
        this.counter = counter;
        this.barcode = barcode;
        this.manager = manager;
    }

    public static TestBuilder builder(){
        return new TestBuilder();
    }

    @Override
    public String toString() {
        return "Test{" +
                "counter=" + counter +
                ", barcode='" + barcode + '\'' +
                ", manager=" + manager +
                '}';
    }

    public static class TestBuilder {

        private int counter;
        private String barcode;
        private User manager;


        public TestBuilder counter(int counter) {
            this.counter = counter;
            return this;
        }

        public TestBuilder barcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        public TestBuilder manager(User manager) {
            this.manager = manager;
            return this;
        }

        public Test build(){
            return new Test(this.counter, this.barcode,this.manager);
        }

    }



}
