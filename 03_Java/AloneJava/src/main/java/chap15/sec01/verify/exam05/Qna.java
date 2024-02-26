package chap15.sec01.verify.exam05;

import java.util.Objects;

/**
 * packageName : chap15.sec01.verify.exam05
 * fileName : Qna
 * author : GGG
 * date : 2024-02-13
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-13         GGG          최초 생성
 */
public class Qna {
    private int qno;
    private String question;
    private String questioner;
    private String answer;
    private String answerer;

    public Qna(int qno, String question, String questioner, String answer, String answerer) {
        this.qno = qno;
        this.question = question;
        this.questioner = questioner;
        this.answer = answer;
        this.answerer = answerer;
    }

    public int getQno() {
        return qno;
    }

    public String getQuestion() {
        return question;
    }

    public String getQuestioner() {
        return questioner;
    }

    public String getAnswer() {
        return answer;
    }

    public String getAnswerer() {
        return answerer;
    }

    //  TODO: .equals(), .toString(), .hashCode() 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Qna qna = (Qna) o;
        return qno == qna.qno && Objects.equals(question, qna.question) && Objects.equals(questioner, qna.questioner) && Objects.equals(answer, qna.answer) && Objects.equals(answerer, qna.answerer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qno, question, questioner, answer, answerer);
    }

    @Override
    public String toString() {
        return "Qna{" +
                "qno=" + qno +
                ", question='" + question + '\'' +
                ", questioner='" + questioner + '\'' +
                ", answer='" + answer + '\'' +
                ", answerer='" + answerer + '\'' +
                '}';
    }
}







