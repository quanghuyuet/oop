public class Introduction {
    public static void main(String[] args) {
        // Thông tin cá nhân (thay bằng thông tin thật của bạn)
        String name = "Bui Quang Huy";
        String id = "24021513";
        String className = "Cs5";
        String githubUser = "quanghuyuet";
        String email = "quanghuyuet1510@gmail.com";

        // In thông tin cá nhân cách nhau bằng tab
        System.out.println(name + "\t" + id + "\t" + className + "\t" + githubUser + "\t" + email);

        // In bài hát từ 9 bottles đến 0
        for (int i = 9; i >= 1; i--) {
            String bottleWord = (i == 1) ? "bottle" : "bottles";
            System.out.println(i + " " + bottleWord + " of beer on the wall, " + i + " " + bottleWord + " of beer.");
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}
