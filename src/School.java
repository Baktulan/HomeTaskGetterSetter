public class School {
   private String name;
  private   String director;
   private int quantityOfStudents;
  private   int classrooms;

    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public String getDirector(){
        return director;
    }
    public void setQuantityOfStudents(int quantityOfStudents){
        this.quantityOfStudents=quantityOfStudents;
    }
    public int getQuantityOfStudents(){
        return  quantityOfStudents;
    }
    public void setClassrooms(int classrooms){
        this.classrooms=classrooms;
    }
    public int getClassrooms(){
        return classrooms;
    }

}
