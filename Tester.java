public class Tester {
    public static void total(Snack[] arr)
    {
        double totalP = 0;
        for (Snack snack : arr) totalP = totalP + snack.get_price();
        System.out.println(totalP);
    }
    public static void main(String[] args) {
        Snack s1 = new Snack("idk1", 10);
        Snack s2 = new Snack("idk2", 20);
        Snack s3 = new Snack("idk3", 30);
        Snack[] sArr = {s1,s2,s3};

    }
}
