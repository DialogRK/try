class Person{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名："+name+"，年龄："+age);
    }
}
public class Main{
    public static void main(String[] args) {
        Person per1= null;
        Person per2= null;
        per1.name="张三";
        per1.age=20;
        per2.name="李四";
        per2.age=19;
        System.out.print("per1对象中的内容-->");
        per1.tell();
        System.out.print("per2对象中的内容-->");
        per2.tell();
    }
}
