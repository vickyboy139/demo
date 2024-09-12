package com.example.demo;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class User {

    public User(){
        System.out.println("hi vicky");
    }
    private int roll;

    private String name;

    
    // @Autowired
    // @Qualifier("love")
    // private InternetConnection Moderm;

  

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public void connect(){
        // Moderm.SwitchOn();
        System.out.println("Success");
    }
}
