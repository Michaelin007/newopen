/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.asknutritionist;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
//import javax.enterprise.context.RequestScoped;
//import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.mail.MessagingException;

/**
 *
 * @author Michael
 */
@Named 
@ManagedBean 
@RequestScoped
public class AskD implements Serializable {
    String question;
    String name;
    String emailadd;
    String re;
    
    public String getName(){
        return name;
    }
    public void setName(String namex){
        name=namex;
    }
    public String getQuestion(){
        return question;
    }
    public void setQuestion(String ques){
        question=ques;
    }
     public String getEmailadd(){
        return emailadd;
    }
    public void setEmailadd(String quest){
        emailadd=quest;
    }
     public String getRe(){
        //String i=(Double.toString((double) height));
        return re;
    }
  
    public void setRe(String rr1){
        re=rr1;
    }
    
    public String  Sendmail() {
        try {
            SendM mike= new SendM();
            mike.sendMessage(name, emailadd, question);
     re="Message sent";
}       catch (MessagingException ex) {
           Logger.getLogger(AskD.class.getName()).log(Level.SEVERE, null, ex);
           re="Message not sent";
            
        }
        return null;
    }}  

