public class DemoTest {
    public static void main(String[] args) {
        String path= System.getProperty("user.dir");
        System.out.println(path);
        String newPath = path.substring(0, path.lastIndexOf('\\'));

        System.out.println(newPath);
    }
}
