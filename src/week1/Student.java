package week1;
public class Student {
        private String name,id,group,email;
    // TODO: khai báo các thuộc tính cho Student
        public String getName(){ return name; }  public void setName() { this.name=name; }
        public String getId(){ return id; }  public void setId(){ this.id=id; }
        public String getGroup() { return group; }   public void setGroup(){ this.group=group;}
        public String getEmail(){ return email;}    public  void setEmail(){ this.email=email;}
    // TODO: khai báo các phương thức getter, setter cho Student

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name="Student";
        id="000";
        group="INT22041";
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
        this.group="INT22041";
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
