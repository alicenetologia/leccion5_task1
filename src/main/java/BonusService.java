public class BonusService {
    public static void main(String[] args) {
    }

    public long calculate (long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = percent * amount / 100 / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}