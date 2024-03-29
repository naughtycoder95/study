package chap15.sec01.verify.exam02;

/**
 * packageName : chap15.sec01.verify.exam02
 * fileName : EmpDao
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
public class Emp {
    private int eno;
    private String ename;
    private int salary;
    private int comission;
    private int dno;

    //    생성자
    public Emp(int eno, String ename, int salary, int comission, int dno) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.comission = comission;
        this.dno = dno;
    }

    //    Getter
    public int getEno() {
        return eno;
    }

    public String getEname() {
        return ename;
    }

    public int getSalary() {
        return salary;
    }

    public int getComission() {
        return comission;
    }

    public int getDno() {
        return dno;
    }
}
