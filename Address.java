public class Address {
    String address="12345 Big St., Alphabet City, CA 90210";
    int buildingNumber=perseBuildingNumber(address);
    String street="";
    String city="";
    String state="";
    int postalcode=1;

    public static void main(String[] args) {
        String address="12345 Big St., Alphabet City, CA 90210";
        System.out.println(perseBuildingNumber(address));
    }

    public static int perseBuildingNumber(String address){
        String [] addressArray=address.split(" ");
        String buildingNumber = addressArray[0];
        return Integer.valueOf(buildingNumber);
    }
    public static String perseStreet(){
        return "";
    }
    public static String perseCity(){
        return"";
    }
    public static String perseState(){
        return "";
    }
    public static int persePostalCode(){
        return 1;
    }
}
