class Student {
  private String name; //good to define private fields
  private int age;
  public Student(String name, int age){
    this.name = name;  this.age = age;
  }
  // 2 setter methods
  public void setName(String name){ this.name = name;}
  public void setAge(int age){ this.age = age;}
  // 2 getter methods
  public String getName(){return name;}
  public int getAge(){return age;}
}
