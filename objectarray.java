public class objectarray{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll=10;
        s1.name="sam";
        s1.score=100;
        Student s2=new Student();
        s2.roll=11;
        s2.name="dam";
        s2.score=10;
        Student s3=new Student();
        s3.roll=120;
        s3.name="kam";
        s3.score=90;
        Student stu[]= new Student[3];
        stu[0]=s1;
        stu[1]=s2;
        stu[2]=s3;

        for(int i=0;i<3;i++){
            System.out.println(stu[i].name+" "+stu[i].score);
        }
        
    }
}
class Student{
    int roll;
    String name;
    int score;
}