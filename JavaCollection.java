import java.util.*;
class Student{
    private String name;
    private int age;
    private int mark;
    static int no=0;
    static HashMap<Integer, List<String>> map=new HashMap<>(); 
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    void setMark(int mark){
        this.mark=mark;
    }
    int getMark(){
        return mark;
    }
    HashMap<Integer, List<String>> addStudent(){
        no=no+1;
        if(map.get(no)==null){
        map.put(no, new ArrayList(Arrays.asList(name,age,mark)));
        }
        return map;
    }
    void display(HashMap<Integer,List<String>> m){
        System.out.println("======================================");
        System.out.println("hiii "+name+" "+age+" "+mark);
        // for(Map.Entry<Integer, List<String>> it:m.entrySet()){
        //     List<String> l=)
        // }
        for(int number:m.keySet()){
            List<String> l=m.get(number);
            System.out.println("The roll no of student "+number);

            System.out.println(l);
            
            System.out.println("======================================");
        }

    }

}
public class JavaCollection {
    public static void main(String args[]){
        Scanner scanf=new Scanner(System.in);
        System.out.println("Enter the number of student");
        int n=scanf.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+"st student detail");
            Student s=new Student();
            System.out.println("Enter the name of the student");
            s.setName(scanf.next());
            System.out.println("Enter the age of the student");
            s.setAge(scanf.nextInt());
            System.out.println("Enter the mark of the student");
            s.setMark(scanf.nextInt());
            HashMap<Integer, List<String>> hm=s.addStudent();
            s.display(hm);
        }
    }
}
