-- 13_Subquery_Exam.sql
-- 서브쿼리 연습문제
-- 1) (사원번호가(ENO) 7788인 사원)과
--   담당 업무가(JOB) 같은 사원을(사원이름(ENAME),담당업무(JOB)) 표시하세요.
-- 대상 : EMPLOYEE
-- 1-1) (사원번호가(ENO) 7788인 사원)
SELECT JOB FROM EMPLOYEE
WHERE ENO = 7788;

-- 1-2) ANALYST 와 같은 업무을 가진 사원 출력
SELECT ENAME, JOB FROM EMPLOYEE
WHERE JOB = 'ANALYST';

-- 1-1, 1-2) 의 sql 문을 1개로 합치기
SELECT ENAME, JOB FROM EMPLOYEE
WHERE JOB = (SELECT JOB FROM EMPLOYEE
            WHERE ENO = 7788);

-- 2) (사원번호가(ENO) 7499인 사원)보다
--   급여가(SALARY) 많은 사원을(사원이름(ENAME),담당업무(JOB)) 표시하세요.
-- 대상 : EMPLOYEE
-- 2-1) 사원번호가(ENO) 7499인 사원의 급여
SELECT SALARY
FROM EMPLOYEE
WHERE ENO = 7499;

-- 2-2) 1600 보다 급여가 많은 사원을(사원이름(ENAME),담당업무(JOB)) 표시
SELECT ENAME, JOB
FROM EMPLOYEE
WHERE SALARY > 1600;

-- 2개 합치기
SELECT ENAME, JOB
FROM EMPLOYEE
WHERE SALARY > (SELECT SALARY
                FROM EMPLOYEE
                WHERE ENO = 7499);


-- 3) (최소(MIN) 급여를(SALARY) 받는 사원)의 이름,(ENAME)
--    담당 업무(JOB) 및 급여(SALARY)를 표시하세요.
-- 대상 : EMPLOYEE
-- 3-1) (최소(MIN) 급여를(SALARY) 받는 사원)
SELECT MIN(SALARY) FROM EMPLOYEE;

-- 3-2) 그 회사의 최소급여 : 800 을 받는 사원명, 담당 업무, 급여 표시하세요
SELECT ENAME, JOB, SALARY
FROM EMPLOYEE
WHERE SALARY = 800;

-- 3-3) 합치기
SELECT ENAME, JOB, SALARY
FROM EMPLOYEE
WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE);

-- 4) 평균 급여가(SALARY) 가장 적은(MIN) 사원의 담당 업무(JOB)를 찾아
--    직급과(JOB) 평균(AVG) 급여를(SALARY) 표시하세요.
--  (설명) == (담당 업무별 평균 급여가 가장 적은) 사람을 찾아
--    직급과 평균 급여를 표시하세요.
-- 단, 소수점 나오면 반올림하기(첫째자리에서)
-- 4-1) 담당 업무별 평균 급여를 구한 후 그 중에서 평균급여가 가장 적은 급여
SELECT MIN(ROUND(AVG(SALARY)))
FROM EMPLOYEE
GROUP BY JOB;

-- 4-2) 그 급여에 해당되는 직급(JOB), 평균급여(AVG(SALARY))를 출력 : 1038
SELECT JOB, ROUND(AVG(SALARY))
FROM EMPLOYEE
GROUP BY JOB
HAVING ROUND(AVG(SALARY)) = 1038;

-- 4-3) 합치기
SELECT JOB, ROUND(AVG(SALARY))
FROM EMPLOYEE
GROUP BY JOB
HAVING ROUND(AVG(SALARY)) = (SELECT MIN(ROUND(AVG(SALARY)))
                            FROM EMPLOYEE
                            GROUP BY JOB);

-- 5) (각 부서의 최소(MIN) 급여(SALARY))를 받는
--   사원의 이름(ENAME), 급여(SALARY), 부서번호(DNO)를 표시하세요.
-- 5-1) 각 부서의(부서별) 최소(MIN) 급여(SALARY)
SELECT MIN(SALARY) FROM EMPLOYEE
GROUP BY DNO;

-- 5-2) (950, 1300, 800) 급여를(SALARY 받는 사원의
--    이름(ENAME), 급여(SALARY), 부서번호(DNO)를 표시
SELECT ENAME, SALARY, DNO
FROM EMPLOYEE
WHERE SALARY IN (950, 1300, 800);

-- 5-3) 합치기
SELECT ENAME, SALARY, DNO
FROM EMPLOYEE
WHERE SALARY IN (SELECT MIN(SALARY) FROM EMPLOYEE
                GROUP BY DNO);

-- 6) 매니저가(MANAGER) 없는 사원의 이름을(ENAME) 표시하세요.
-- 6-1) 매니저가(MANAGER) 없는 사원의 사원번호
SELECT ENO
FROM EMPLOYEE
WHERE MANAGER IS NULL;

-- 6-2) 그 사람의 이름을 화면에 출력 : 7839
SELECT ENAME FROM EMPLOYEE
WHERE ENO = 7839;

-- 6-3) 합치기
SELECT ENAME FROM EMPLOYEE
WHERE ENO = (SELECT ENO
            FROM EMPLOYEE
            WHERE MANAGER IS NULL);

-- 7) 매니저가(MANAGER) 있는 사원(조건1개)의 이름을(ENAME) 표시(조건2개)하세요.
-- 단, 서브쿼리를 이용하세요
-- 사원테이블 : EMPLOYEE
-- 7-1) 매니저가 있는 사원의 사원번호(ENO) : 7369
-- 7499
-- ,7521
-- ,7566
-- ,7654
-- ,7698
-- ,7782
-- ,7788
-- ,7844
-- ,7876
-- ,7900
-- ,7902
-- ,7934
SELECT ENO FROM EMPLOYEE
WHERE MANAGER IS NOT NULL; -- 여러건이 결과로 나옴


-- 7-2) 위에서 구한 사번들로 이름을 조회
SELECT ENAME FROM EMPLOYEE
WHERE ENO IN (7369
                7499
                ,7521
                ,7566
                ,7654
                ,7698
                ,7782
                ,7788
                ,7844
                ,7876
                ,7900
                ,7902
                ,7934);


-- 합치기
SELECT ENAME FROM EMPLOYEE
WHERE ENO IN (SELECT ENO FROM EMPLOYEE
            WHERE MANAGER IS NOT NULL);

-- 8) (BLAKE와 동일한 부서(DNO))에 속한 사원의 이름과(ENAME) 
--    입사일을(HIREDATE) 표시하는 질의를 작성하세요.
-- 단, BLAKE는 제외
-- 사원테이블 : EMPLOYEE
-- 8-1) BLAKE 가 소속된 부서번호를 찾기 : 30
SELECT DNO FROM EMPLOYEE
WHERE ENAME = 'BLAKE';

-- 8-2) 30 번 부서번호에(DNO) 속한 사원들의 이름과(ENAME) 입사일(HIREDATE) 출력
SELECT ENAME, HIREDATE
FROM EMPLOYEE
WHERE DNO = 30;

-- 합치기
SELECT ENAME, HIREDATE
FROM EMPLOYEE
WHERE DNO = (SELECT DNO FROM EMPLOYEE
            WHERE ENAME = 'BLAKE');

-- 9) 급여가(SALARY) (평균(AVG) 급여(SALARY))보다 많은 사원들의 
--    사원번호와(ENO) 
--    이름을(ENAME) 표시하되 결과를 급여(SALARY)에 대해서
--    오름차순으로 정렬하세요.
-- 사원테이블 : EMPLOYEE
-- 9-1) 평균(AVG) 급여(SALARY) 찾기 : 2073.214285714285714285714285714285714286
SELECT AVG(SALARY) FROM EMPLOYEE;

-- 9-2)2073.214285714285714285714285714285714286 보다 많은 급여를 받는 사원들 출력
SELECT ENO, ENAME FROM EMPLOYEE
WHERE SALARY > 2073.214285714285714285714285714285714286
ORDER BY SALARY;

-- 합치기
SELECT ENO, ENAME FROM EMPLOYEE
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE)
ORDER BY SALARY;

-- 10) (이름에(ENAME) K가 포함된 사원)과 같은 부서에서(DNO) 일하는 사원의 
--   사원번호와(ENO) 이름을(ENAME) 표시하는 
-- 질의를(sql문==쿼리(query)문) 작성하세요.
-- 사원테이블 : EMPLOYEE
-- 10-1) 이름에(ENAME) K가 포함된 사원의 부서번호(DNO) 조회 : (30, 10, 10)
SELECT DNO FROM EMPLOYEE
WHERE ENAME LIKE '%K%';

-- 10-2) (30, 10, 10) 에 포함되는(IN) 부서번호를(DNO) 가진 사원의 
--   사원번호(ENO) 및 사원이름을(ENAME) 조회
SELECT ENO, ENAME
FROM EMPLOYEE
WHERE DNO IN (30, 10, 10);

-- 합치기
SELECT ENO, ENAME
FROM EMPLOYEE
WHERE DNO IN (SELECT DNO FROM EMPLOYEE
            WHERE ENAME LIKE '%K%');

-- 11) (부서 위치가(LOC) DALLAS인) 사원의 이름과(ENAME) 
--    부서번호(DNO) 및 담당 업무를(JOB) 표시하세요.
-- 단, 서브쿼리를 이용하세요
-- 힌트 : 서브쿼리
-- 11-1) 부서 위치가(LOC) DALLAS 인 부서번호를 조회 : 20 (DEPARTMENT)
SELECT DNO FROM DEPARTMENT
WHERE LOC = 'DALLAS';

-- 11-2) 20 의 부서번호와 일치하는 사원의 이름과(ENAME) 부서번호(DNO), 담당업무(JOB) 조회
SELECT ENAME, DNO, JOB
FROM EMPLOYEE
WHERE DNO = 20;

-- 합치기
SELECT ENAME, DNO, JOB
FROM EMPLOYEE
WHERE DNO = (SELECT DNO FROM DEPARTMENT
            WHERE LOC = 'DALLAS');


-- 12) (KING에게) 보고하는 사원의 이름과(ENAME) 급여를(SALARY) 표시하세요.
-- 힌트 : 보고하는 사원의 매니저가(MANAGER) KING 임(7839)
-- 사원테이블 : EMPLOYEE
-- 12-1) KING 의(ENAME) 사번을(ENO) 구하기 : 7839
SELECT ENO FROM EMPLOYEE
WHERE ENAME = 'KING';

-- 12-2) 7839 가 MANAGER 인 사원의 사원명과(ENAME) 급여를(SALARY) 조회하면 됨
SELECT ENAME, SALARY FROM EMPLOYEE
WHERE MANAGER = 7839;

-- 합치기
SELECT ENAME, SALARY FROM EMPLOYEE
WHERE MANAGER = (SELECT ENO FROM EMPLOYEE
                WHERE ENAME = 'KING');


-- 13) (RESEARCH 부서(DNO))의 사원에 대한 부서번호(DNO), 
--   사원이름(ENAME) 및 담당 업무(JOB)를 표시하세요.
-- 13-1) RESEARCH 부서의(DNAME) 부서번호 조회 : 20
SELECT DNO FROM DEPARTMENT
WHERE DNAME = 'RESEARCH';

-- 13-2) 20 번 부서번호에(DNO) 해당하는 사원의 부서번호(DNO), 사원명(ENAME), 담당 업무(JOB) 조회
SELECT DNO, ENAME, JOB
FROM EMPLOYEE
WHERE DNO = 20;

-- 합치기
SELECT DNO, ENAME, JOB
FROM EMPLOYEE
WHERE DNO = (SELECT DNO FROM DEPARTMENT
            WHERE DNAME = 'RESEARCH');

-- 14(*)) 1)평균(AVG) 급여보다(SALARY) 많은 급여를 받고 (서브쿼리1)
--     2)이름에 M이 포함된 사원과(ENAME) 같은 부서에서(DNO) 근무하는(서브쿼리2)
--    사원의 사원번호(ENO), 이름(ENAME), 급여(SALARY)를 표시하세요.
-- 14-1) 모든 사원의 평균 급여 : 2073.214285714285714285714285714285714286 (A)
SELECT AVG(SALARY) FROM EMPLOYEE;

-- 14-2) 이름에(ENAME) M이 포함된 사원의 부서번호 : 20, 30, 20, 30, 10 (B)
SELECT DNO FROM EMPLOYEE
WHERE ENAME LIKE '%M%';

-- 14-3) A 보다 급여가(SALARY) 많고, B에 포함되는 부서번호를 가진 사원의 
--    사원번호(ENO), 사원명(ENAME), 급여를(SALARY) 출력하기
SELECT ENO, ENAME, SALARY FROM EMPLOYEE
WHERE SALARY > 2073.214285714285714285714285714285714286
AND   DNO IN (20, 30, 20, 30, 10);

-- 합치기 
SELECT ENO, ENAME, SALARY FROM EMPLOYEE
WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEE)
AND   DNO IN (SELECT DNO FROM EMPLOYEE
            WHERE ENAME LIKE '%M%');

-- 16 *) 전체 사원 중 ALLEN과 같은 직위(JOB)인 사원들의 
-- 직위(JOB), 사원번호(ENO), 사원명(ENAME), 급여(SALARY), 
-- 부서번호(DNO), 부서명(DNAME) 출력하는 SQL문을 작성하세요
-- 힌트) 조인 + 서브쿼리
-- 16-1) ALLEN 이 가지고 있는 직위(JOB) 를 조회 : SALESMAN
SELECT JOB FROM EMPLOYEE
WHERE ENAME = 'ALLEN';

-- 16-2) SALESMAN 직위로 전체 사원 + 부서를 조인한 테이블을 조회
-- 공통컬럼 : 사원(DNO), 부서(DNO:부서번호)
SELECT EM.JOB, EM.ENO, EM.ENAME, EM.SALARY, EM.DNO, DE.DNAME
FROM EMPLOYEE   EM
    ,DEPARTMENT DE
WHERE EM.DNO = DE.DNO
AND   JOB = 'SALESMAN';

-- 합치기
SELECT EM.JOB, EM.ENO, EM.ENAME, EM.SALARY, EM.DNO, DE.DNAME
FROM EMPLOYEE   EM
    ,DEPARTMENT DE
WHERE EM.DNO = DE.DNO
AND   JOB = (SELECT JOB FROM EMPLOYEE
            WHERE ENAME = 'ALLEN');


-- 17) 10번 부서에 근무하는 사원 중 30번 부서에는 존재하지 않는 직책을 가진 사원들의
-- 사원번호(ENO), 사원명(ENAME), 직위(JOB), 부서번호(DNO), 부서명(DNAME), 
-- 부서위치를(LOC) 출력하세요
-- 힌트) 조인 + 서브쿼리
-- 17-1) 30번 부서번호에(DNO) 존재하는 직위를(JOB) 조회 : (SALESMAN, MANAGER, CLERK)
SELECT DISTINCT JOB FROM EMPLOYEE
WHERE DNO = 30;


-- 17-2) (SALESMAN, MANAGER, CLERK) 에 해당되지 않는 직위(JOB) 찾아서 
--    전체 사원 + 부서를 조인한 테이블을 조회
--   (단, 10 번부서에 해당하는 사람만 추가로 조건을 걸기 )
SELECT EM.ENO, EM.ENAME, EM.JOB, DE.DNO, DE.DNAME, DE.LOC
FROM EMPLOYEE   EM
    ,DEPARTMENT DE
WHERE EM.DNO = DE.DNO
AND   DE.DNO = 10
AND   EM.JOB NOT IN ('SALESMAN', 'MANAGER', 'CLERK');

-- 합치기
SELECT EM.ENO, EM.ENAME, EM.JOB, DE.DNO, DE.DNAME, DE.LOC
FROM EMPLOYEE   EM
    ,DEPARTMENT DE
WHERE EM.DNO = DE.DNO
AND   DE.DNO = 10
AND   EM.JOB NOT IN (SELECT DISTINCT JOB FROM EMPLOYEE
                    WHERE DNO = 30);
