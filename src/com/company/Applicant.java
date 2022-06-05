package com.company;

public class Applicant extends Person implements Comparable<Applicant> {

    // variables

    int _id;
    private double alesScore;
    private double gpa;
    private double masterExam;
    private double firstJuryScore;
    private double secondJuryScore;
    private double finalJuryScore;
    private double overallFinalScore;


    //Weights

    final double alesWeight = 0.35;
    final double gpaWeight = 0.20;
    final double examWeight = 0.30;
    final double interviewWeight = 0.15;

    //Constructor
    Applicant(String name, String surname,int _id
            ,double alesScore,double gpa,double masterExam,
              double firstJuryScore,double secondJuryScore){


        super(name,surname);
        this._id = _id;
        this.alesScore = alesChecker(alesScore);
        this.gpa = gpaChecker(gpa);
        this.masterExam = masterExamChecker(masterExam);
        this.finalJuryScore = interviewScoreChecker(firstJuryScore,secondJuryScore);

        this.overallFinalScore = (alesScore * this.alesWeight) + (this.masterExam * examWeight) + (this.finalJuryScore * interviewWeight) +(this.gpa * gpaWeight) ;

    }



    public double getFinalScore(){
        return this.overallFinalScore;
    }

    @Override
    public int compareTo(Applicant o) {
        if(this.getFinalScore() > o.getFinalScore()) return 1;
        else return -1;
    }

    // ****************************************** SCORES CHECK PART ******************************************

    // ALES PART
    public double alesChecker(double alesScore){
        if(alesScore>= 0 && alesScore <= 100){
            return alesScore;
        }
        else{
            return 0;
        }
    }
    public void setAlesScore(double newAlesScore){
        this.alesScore = alesChecker(newAlesScore);
    }

    // GPA PART
    public double gpaChecker(double gpa){
        if(gpa>= 0 && gpa<= 4.00){
            return (gpa * 25);
        }
        else{
            return 0;
        }
    }
    public void setGpaScore(double newGpaScore){
        this.gpa = gpaChecker(newGpaScore);
    }

    // MASTER EXAM PART
    public double masterExamChecker(double masterExam){
        if(masterExam>= 0 && masterExam <= 100){
            return masterExam;
        }
        else{
            return 0;
        }
    }
    public void setMasterExam(double newMasterExam){
        this.masterExam = masterExamChecker(newMasterExam);
    }

    // INTERVIEW SCORES PART
    public double interviewScoreChecker(double interviewScore,double interviewScore2){
        if((interviewScore<0 || interviewScore>10)){
            interviewScore = 0;
        }
        else if((interviewScore2<0 || interviewScore2> 10)){
            interviewScore2 = 0;
        }
        return (interviewScore + interviewScore2) / 2 * 10 ;

    }
    public void setInterviewScore(double a, double b){
        this.finalJuryScore = interviewScoreChecker(a,b);
    }

    public String toString(){
        return this.name + ' ' + this.surname + ' ' + this.overallFinalScore;
    }

}
