import Timeutils.TimeUtils;

public class Main {
    public static void main(String[] args) {
        int aika = 3199;
        String tulos = TimeUtils.secToTime(aika);
        System.out.println("Aika: " + tulos);
    }
}