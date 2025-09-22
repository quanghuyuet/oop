public class Introduction {
    public static void main(String[] args) {

        String name = "Bui Quang Huy";
        String id = "24021513";
        String className = "Cs5";
        String githubUser = "quanghuyuet";
        String email = "quanghuyuet1510@gmail.com";

        System.out.println(name + "\t" + id + "\t" + className + "\t" + githubUser + "\t" + email);

        for (int i = 9; i >= 1; i--) {
            String bottleWord = (i == 1) ? "bottle" : "bottles";
            System.out.println(i + " " + bottleWord + " of beer on the wall, " + i + " " + bottleWord + " of beer.");
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}
