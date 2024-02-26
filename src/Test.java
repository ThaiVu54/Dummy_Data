import java.util.ArrayList;
import java.util.List;

public class Test {
    private String name;
    private String age;

    public Test(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    // Khai báo danh sách tests ở đây và khởi tạo nó trong khối static
    private static List<Test> tests = new ArrayList<>();

    static {
        tests.add(new Test("thai", "26"));
        tests.add(new Test("vu", "13"));
        tests.add(new Test("an", "56"));
        tests.add(new Test("xuan", "43"));
        tests.add(new Test("anh", "23"));
        tests.add(new Test("aido", "7"));
    }

    // Phương thức static để trả về danh sách tests
    public static List<Test> getTests() {
        return tests;
    }

    @Override
    public String toString() {
        return "{ \"Name\": " + "\"" + this.name + "\"" + ", \"Age\": " + "\"" + this.age + "\"}";
    }

}
