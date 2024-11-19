class ThisKeywordDemo {
    String name;

    ThisKeywordDemo(String name) {
        this.name = name; 
    }

    void display() {
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo("Alice");
        obj.display();
    }
}

