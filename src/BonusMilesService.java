public class BonusMilesService {
    public int calculate(int coast) {
        int result;
        if (coast > 20) {
            result = coast / 20;
        } else {
            result = 0;
        }
        return result;
    }
}