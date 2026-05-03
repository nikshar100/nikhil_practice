public class Main {

    public static void main(String[] args) {
        CampusID Nik = new CampusID("Nik Sharma",
                2304837,
                new Address(1234, "Main St.", "Orange", "California", 93087),
                Department.ENGINEERING
                );
        Nik.showID();

        System.out.println();
    }
}
