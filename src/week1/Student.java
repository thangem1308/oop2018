package week1;
public class Student {
        private String name,id,group,email;
        // TODO: khai báo các thuộc tính cho Student
        public String getName(){ return name; }  public void setName(String name1) { this.name=name1; }
        public String getId(){ return id; }  public void setId(String id1){ this.id=id1; }
        public String getGroup() { return group; }   public void setGroup(String group1){ this.group=group1;}
        public String getEmail(){ return email;}    public  void setEmail(String email1){ this.email=email1;}
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name="Student";
        id="000";
        group="INT 22041";
        email="uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     * /
    Student(String n, String sid, String em) {
        // TODO:
        this.name = n;
        this.id = sid;
        this.email=em;
        this.group="INT 22042";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name=s.getName();
        this.id=s.getId();
        this.email=s.getEmail();
        this.group=s.getGroup();
    }
    String getInfo() {
        // TODO:
        String fullInfo=name + id + group + email;
        return fullInfo; // xóa dòng này sau khi cài đặt
    }
}
