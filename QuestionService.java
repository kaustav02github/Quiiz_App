import java.util.Scanner;

public class QuestionService {
    Questions[] questions=new Questions[5];
    String Selection[]=new String[5];
    public QuestionService() {
   
        questions[0]=new Questions(1,"2+3?","5","4","1","8","5");
        questions[1]=new Questions(2,"What language was found in 1985","c++","java","py","c","java");
        questions[2]=new Questions(3,"What is the capital of india","a","Delhi","c","d","Delhi"); 
        questions[3]=new Questions(4,"6/2?","3","5","7","4","3");
        questions[4]=new Questions(5,"What is programming language is linux made of?","c++","java","py","c","c");

    }
public void playQuiz(){
    int i=0;
    for(Questions q:questions){
        System.out.println("id: "+q.getId()+" question: "+q.getQuestion());
        System.out.println("opt1:"+q.getOpt1());
        System.out.println("opt2:"+q.getOp12());
        System.out.println("opt3:"+q.getOpt3());
        System.out.println("opt4:"+q.getOpt4());
        Scanner sc=new Scanner(System.in);
        Selection[i]=sc.nextLine();
        i++;
    }
int score=0;
    for(int j=0;j<5;j++){
        if(Selection[j].equals(questions[j].getAnswer())){
            score++;
        }
        
    }
    System.out.println("YOUR SCORE IS: "+score);

}
}