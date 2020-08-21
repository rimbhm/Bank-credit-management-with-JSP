/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.com.classes;


/**
 *
 * @author Office Info
 */
public class mensualite {
 
 private  double  montant;
private  int age,dur,rmn;
private double taux=(double) 7.3;
private double mensualite;
    public double getMontant() {
        return montant;
    }

    public int getRmn() {
        return rmn;
    }

    public int getAge() {
        return age;
    }

    public int getDur() {
        return dur;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMensualite() {
        return mensualite;
    }

    public void setRmn(int rmn) {
        this.rmn = rmn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public void setMensualite(double mensualite) {
        this.mensualite = mensualite;
    }
    
  
    public double Calmensualite(double montant,int dur){
      double t=taux/100;
      double t1=montant*t/12;
      double t2=1-Math.pow((1+t/12),-1*dur);
     return t1/t2;
   
} 
    
}    
    
    
    
    
