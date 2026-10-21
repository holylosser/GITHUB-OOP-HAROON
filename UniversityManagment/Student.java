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
        courses = null ;
        for (int i = 0; i < marks.length; i++) {
            courses[i]=null;
            marks[i]=0;
        }
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
    void setCourses(String course){
        this.courses= new String[]{course};
    }
    void setMarks(int mark){
        this.marks= new int[]{mark};
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
    String getCourses(){
        return this.courses;
    }
    int getMarks(){
        return this.marks;
    }

    String getuniname(){
        return uniname;
    }
}