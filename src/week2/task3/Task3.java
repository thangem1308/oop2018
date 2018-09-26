package week2.task3;

class theCat {
    // Đối tượng con mèo
    private String name;
    private int age;
    private String sex;
    public String getName(){return name;}     public void setName(String name){this.name=name;}
    public int getAge(){return age;}     public void setName(int age){this.age=age;}
    public String getSex(){return sex;}     public void setSex(String sex){this.sex=sex;}
    public void food(String nameFood){
        if (nameFood=="fish") {System.out.println("The cat will eat your food!");}
        else  {System.out.println("Do you kill my cat with your food (-_-) ");}
    }
    public void meow(){
        // TODO: Tiếng mèo kêu
        System.out.printf("Meow");
    }
    public void sleep(){
        //TODO: con mèo đã ngủ
        System.out.println("Z...Z..z.z.zzzz");
    }
}
class theDog{
    private String name;
    private int age;
    private String sex;
    public String getName(){return name;}     public void setName(String name){this.name=name;}
    public int getAge(){return age;}     public void setName(int age){this.age=age;}
    public String getSex(){return sex;}     public void setSex(String sex){this.sex=sex;}
    public void an{System.out.printf("Dang an");}
    public void ngu{System.out.printf("Dang ngu");}
    public void choi{System.out.printf("Dang choi");}
}
class theMouse{
    private String name;
    private int age;
    private String sex;
    public String getName(){return name;}     public void setName(String name){this.name=name;}
    public int getAge(){return age;}     public void setName(int age){this.age=age;}
    public String getSex(){return sex;}     public void setSex(String sex){this.sex=sex;}
    public void an{System.out.printf("Dang an");}
    public void ngu{System.out.printf("Dang ngu");}
    public void choi{System.out.printf("Dang choi");}
}
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
