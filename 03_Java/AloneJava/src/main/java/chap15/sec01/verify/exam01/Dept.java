package chap15.sec01.verify.exam01;

/**
 * packageName : chap15.sec01.verify.exam01
 * fileName : Dept
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
public class Dept {
    //    속성 : 3개
    private int dno;       // 부서번호
    private String dname;  // 부서명
    private String loc;    // 부서위치

    //  TODO: 생성자 3개(매개변수==인자)
    public Dept(int dno, String dname, String loc) {
        this.dno = dno;
        this.dname = dname;
        this.loc = loc;
    }

    //  TODO: getter 함수 3개
    public int getDno() {
        return dno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }
}

