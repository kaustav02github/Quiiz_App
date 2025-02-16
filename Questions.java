public class Questions{
   private int id;
   private String question;
   private String opt1;
   private  String op12;
  private  String opt3;
   private String opt4;
   private String answer;
   
public Questions(int id, String question, String opt1, String op12, String opt3, String opt4, String answer) {
    this.id = id;
    this.question = question;
    this.opt1 = opt1;
    this.op12 = op12;
    this.opt3 = opt3;
    this.opt4 = opt4;
    this.answer = answer;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getQuestion() {
    return question;
}
public void setQuestion(String question) {
    this.question = question;
}
public String getOpt1() {
    return opt1;
}
public void setOpt1(String opt1) {
    this.opt1 = opt1;
}
public String getOp12() {
    return op12;
}
public void setOp12(String op12) {
    this.op12 = op12;
}
public String getOpt3() {
    return opt3;
}
public void setOpt3(String opt3) {
    this.opt3 = opt3;
}
public String getOpt4() {
    return opt4;
}
public void setOpt4(String opt4) {
    this.opt4 = opt4;
}
public String getAnswer() {
    return answer;
}
public void setAnswer(String answer) {
    this.answer = answer;
}
@Override
public String toString() {
    return "Questions [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", op12=" + op12 + ", opt3=" + opt3
            + ", opt4=" + opt4 + ", answer=" + answer + "]";
}
    
}
