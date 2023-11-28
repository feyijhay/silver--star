public class Human{
  
 private String Name;
 private int Age;
 private String nameOfSchool;

  public Human(String Name, int Age, String nameOfSchool){
   this.Name = Name;
    this.Age = Age;
    this.nameOfSchool = nameOfSchool;
}

     public void setName(String Name){
         this.Name = Name;
     }
     public String getName(){
        return Name;
     }   
     public void setAge(int Age){
       this.Age = Age;
     }
      public int getAge(){
       return Age;
     }
       public void setnameOfSchool(String nameOfSchool){
         this.nameOfSchool = nameOfSchool;
     }
         public String getnameOfSchool(){
          return nameOfSchool;

}









}