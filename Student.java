class Student{
    private String Id;
    private String name;
    String uniname;
    private String program;
    private int Semester;
    private String [] courses=new String[5];
    private int [] marks=new int[5];
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

}