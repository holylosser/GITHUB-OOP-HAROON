package UniversityManagment;

class Student{
    private String Id;
    private String name;
    String uniname;
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
            marks[i]=0;
            courses[i]=null;
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
}