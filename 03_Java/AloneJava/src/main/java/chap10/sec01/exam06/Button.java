package chap10.sec01.exam06;

/**
 * packageName : chap10.sec01.exam06
 * fileName : Button
 * author : GGG
 * date : 2024-02-20
 * description : 중첩 인터페이스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-02-20         GGG          최초 생성
 */
public class Button {
    //    TODO: 중첩 인터페이스 정의
    static interface OnClickListener {
        void onClick();              // 추상함수 : {} 없는 함수
    }

    OnClickListener listener;        // 속성(필드)

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }
}