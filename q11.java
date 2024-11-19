class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void showNum() {
        System.out.println("Decimal: " + number);
    }
}

class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }

    @Override
    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class q11{
    public static void main(String[] args) {
        Num obj = new HexNum(255);
        obj.showNum();
    }
}
