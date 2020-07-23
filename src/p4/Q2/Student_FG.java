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
public class Student_FG {
    public static void main(String[] args) {
        Student s1 = new Student ();
        Student s2 = new Student ("w45678","abu");
        
        s1.setStudentName("ali");
        s1.setStudentID("w12345");
        
        s1.addQuiz(10);
        s2.addQuiz(8);
        
        System.out.print("%-15s %3d %5.2f \n",s1.getStudentName(),s1.);
    }
}
