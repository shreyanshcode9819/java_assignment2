class StaticKeywordDemo {
    static int count = 0; 

    StaticKeywordDemo() {
        count++;
    }

    static void displayCount() { 
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        new StaticKeywordDemo();
        new StaticKeywordDemo();
        StaticKeywordDemo.displayCount();
    }
}
