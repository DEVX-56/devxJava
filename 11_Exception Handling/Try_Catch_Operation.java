
public class Try_Catch_Operation {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e);
            System.out.println(e.getStackTrace());
            System.out.println(e.toString());
        }
    }
    
}
