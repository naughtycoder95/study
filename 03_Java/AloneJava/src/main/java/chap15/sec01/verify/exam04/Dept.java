package chap15.sec01.verify.exam04;

/**
 * packageName : chap15.sec01.verify.exam04
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
    private int dno;
    private String dname;
    private String loc;

    //    생성자
    public Dept(int dno, String dname, String loc) {
        this.dno = dno;         // 부서번호
        this.dname = dname;     // 부서명
        this.loc = loc;         // 부서위치
    }

    //    getter
    public int getDno() {
        return dno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dno=" + dno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
