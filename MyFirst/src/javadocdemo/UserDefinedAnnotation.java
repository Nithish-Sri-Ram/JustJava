/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadocdemo;

/**
 *
 * @author nithish
 */
@interface MyAnno {
    String name();
    String project();
    String date() default "today";
    String version() default "13";
}

@MyAnno(name="Ajay", project="Bank") // All values are mandatory to be defined unless they are set with default values.
public class UserDefinedAnnotation {
    int data;

    public static void main(String[] args) {
        int x;
        // Code logic here
    }
}
