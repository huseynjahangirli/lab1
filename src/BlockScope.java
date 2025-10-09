public class BlockScope {
    public static void main(String[] args) {

        int outerX = 5;  // dış değişken
        System.out.println("outerX (outside if): " + outerX);

        if (true) {
            int innerY = 15; // sadece bu blokta geçerli
            System.out.println("outerX (inside if): " + outerX);
            System.out.println("innerY (inside if): " + innerY);
        }

        // outerX burada hâlâ geçerli
        System.out.println("outerX (after if): " + outerX);
        //System.out.println("innerY (after if): " + innerY);
        //System.out.println("innerY (after if): " + innerY);

        // innerY burada geçerli değil → hata verir
        // System.out.println("innerY (after if): " + innerY);
    }
}


