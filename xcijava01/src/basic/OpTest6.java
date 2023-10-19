package basic;

public class OpTest6 {
    public static void main(String[] args) {
        double seedMoney = 1_000_000;
        seedMoney = seedMoney + (seedMoney * 0.1);
        System.out.println(seedMoney);
        seedMoney = seedMoney - (seedMoney * 0.1);
        System.out.println(seedMoney);

        seedMoney = 1_000_000;
        seedMoney = seedMoney - (seedMoney * 0.1);
        System.out.println(seedMoney);
        seedMoney = seedMoney + (seedMoney * 0.1);
        System.out.println(seedMoney);


        seedMoney = 1_000_000;
        seedMoney = seedMoney + (seedMoney * 0.4);
        System.out.println(seedMoney);
        seedMoney = seedMoney - (seedMoney * 0.3);
        System.out.println(seedMoney);

        seedMoney = 1_000_000;
        for (int i = 0; i < 100; i++) {
            seedMoney = seedMoney + (seedMoney * 0.4);
            seedMoney = seedMoney - (seedMoney * 0.3);
            System.out.println(seedMoney);
        }

    }
}
