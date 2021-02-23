public class Exception {
    public static void main(String[] args) {
        
    try {
        String str = null;
        str.length();
    } 
    catch (NullPointerException E) {
            System.out.println("エラーが発生しました。" + E.getMessage());
        }
    }
}
