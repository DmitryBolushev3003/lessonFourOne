import java.beans.PropertyEditorSupport;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BonusMilesService bonus = new BonusMilesService();
        int yourBonus = bonus.calculate(10_000);
        System.out.println("Спасибо за покупку, мы начислили вам " + yourBonus + " милей");
    }
}