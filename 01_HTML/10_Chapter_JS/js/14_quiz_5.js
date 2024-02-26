// 14_quiz_5.html
// showDetail() 버튼 클릭 함수
function showDetail() {
    // TODO: 1) #desc 태그 선택 : 나타나게 함 : 상세설명
    document.querySelector("#desc").style.display = "block";
    // TODO: 2) #open 태그 선택 : 오픈 버튼 사라지게 함
    document.querySelector("#open").style.display = "none";
}

// hideDetail() 버튼 클릭 함수
function hideDetail() {
    // TODO: 1) #desc 태그 선택 : 나타나게 함 : 상세설명
    document.querySelector("#desc").style.display = "none";
    // TODO: 2) #open 태그 선택 : 오픈 버튼 사라지게 함
    document.querySelector("#open").style.display = "block";
}