/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.Q2;

/**
 *
 * @author akj_2
 */
public class Student {
    private String studentID;
    private String studentName;
    private int quizNumber;
    private double totalQuizScore;
    
    public Student (){
        this("", "");
    }

//    public Student(String ID, String Name) {
//        studentID = ID;
//        studentName = Name;
//    }
     public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getQuizNumber() {
        return quizNumber;
    }

    public double getTotalQuizScore() {
        return totalQuizScore;
    }
    
    

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
       public void addQuiz(int score){
           
           if (score <0 ||  score >10)
           {
              System.out.println("error");
           }
           else{
                   totalQuizScore+=score;
               quizNumber++;
                   }
           
           
           
           
       }
       public double getAverageScore(){
        return totalQuizScore/(double)quizNumber;
        
    }
       
       
    
    
    
  
}
