package chap06.sec06.exam01;

/**
 * packageName : chap06.sec06.exam01
 * fileName : Car
 * author : GGG
 * date : 2024-02-06
 * description : TODO: 접근제한자 , Getter/Setter
 * 요약 :
 *      TODO: 접근제한자   : 각 속성(필드)/함수(메소드)를 사용허가를 하는 예약어
 *          1) public    : 모든 클래스 사용가능
 *          2) private   : 모든 클래스 사용불가 (오직 자신의 클래스만 사용)
 *          3) default   : 생략가능, 자신의 폴더(패키지)에서만 사용가능
 *          4) protected : 상속관계에서 사용
 *          추천 : 속성(필드) private , 함수(메소드) public -> 캡슐화
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-06         GGG          최초 생성
 */
public class Car {
    //  TODO: 클래스 3요소 : *속성(필드), 생성자, 함수(메소드)
    private int speed;
    private boolean stop;

    //    생성자 생략
//    Getter(속성값 조회) / Setter(속성값 저장) 함수(메소드)
//    단축키 : alt + insert (맥 : cmd + n)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //  get속성명, set속성명 , is속성명()(getter함수) -> 속성 : boolean
    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}