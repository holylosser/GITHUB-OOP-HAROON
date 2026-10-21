package UniversityManagment;

class Student{
    private String Id;
    private String name;
    final String uniname;
    private String program;
    private int Semester;
    private String [] courses;
    private int [] marks;
    Student(){
        Id=null;
        name=null;
        uniname="University of Central Punjab";
        program=null;
        Semester=0;
        courses = new String[5] ;
        marks=new int[5];
    }

    void setid(String id){
        this.Id=id;
    }
    void setname(String name){
        this.name=name;
    }
    void setprogram(String pro){
        this.program=pro;
    }
    void setCourses(int index ,String course){
        this.courses[index]=course;
    }
    void setMarks(int index,int mark){
        this.marks[index]=mark;
    }
    String getid(){
        return this.Id;
    }
    String getname(){
        return this.name;
    }
    String getprogram(){
        return this.program;
    }
    String getCourses(int index){
        return this.courses[index];
    }
    int getMarks(int index){
        return this.marks[index];
    }

    String getuniname(){
        return uniname;
    }
}