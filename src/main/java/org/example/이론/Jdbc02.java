package org.example.이론;

/*
    === JDBC 환경설정 ===

    1. 필요한 준비물
        1) JDK (JAVA - JDK17 Ver.)
        2) IDE(intelli j)
        3) MySQL (MySQL 서버 8.x 버전 이상 권장)
        4) JDBC 드라이버
            : mysql-connector-java-x.x.xx.jar
            > 자바가 DB와 통신할 수 있도록 도와주는 드라이버 (연결톹로)

        +) SQL 스키마, JAVA 프로젝트 ...

    2. JDBC 연결 ㅅ ㅣ자주 발생하는 오류 및 해결법
        1) ClassNotFoundException
            : 외부 라이브러리 sql connector가 프로젝트에 추가되지 않아서 발생하는 오류

        2) Access denied for user
            : DB 사용자의 ID/PW 오타 또는 권한이 없어서 발생하는 오류

        3) Communications link failure
            : mySQL 서버가 실행중인지 확인 필요 (포트번호 3306 확인)

        4) Unknow database
            : DB 이름 오타 또는 미생성 시 발생하는 오류

        5)

    3. JDBC 연결 흐름
        JDBC = JAVA + DB를 연결하는 다리

        1) JDBC 드라이버 로드 
            - 자바가 DB와 통신하기 위해서는 JDBC 드라이버가 필요함
            - JDBC 드라이버는 DBMS 별로 제공 됨 (MySQL - com.mysql.cj.jdbc.Driver)
            - Class.forName() 을 사용해 메모리에 적재해야함

            Class.forName("com.mysql.cj.jdbc.Driver");

            >> Java는 다양한 DB와 연결할 수 있어야 함 -> 표준 인터페이스만 제공함 (연결은 해줄테니까 나머지는 알아서...)
                : 실제 동작은 DB 벤더가 만든 드라이버 구현체가 처리함

        2) 데이터베이스 연결 (Connection)
            - 드라이버가 로드되면, DB에 연결이 가능해짐
            - DriverManager.getConnection()을 통해 Connection 객체를 생성하게 됨

                cf) Connection 객체
                    - 실제로 DB 서버와 연결된 통로를 의미
                    - 해당 객체를 통해 SQL 문을 전달하고, 결과를 받을 수 있음
                    >> DB URL(서버주소 + 연결 커넥션), 사용자, 비밀번호 들을 전달해야 함 -> DB 접속 정보 설정

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/k3_iot_jdbc",
                "root",
                "root"
            );

        3) SQL 실행 준비 (Statement OR PreparedStatement)
            - Connection 객체를 이용해 SQL 실행 준비 객체를 생성하게 됨
            - Statement: 문자열로 SQL을 직접 작성하는 것
            - PreparedStatement: 미리 컴파일된 SQL을 사용함 (보안, 성능향상의 이점 有)

            String sql = "SELECT * FROM users WHERE age > ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, 20);

        4) SQL 실행 (Execute)
            - SQL 문장 실행 후 결과를 반환받음
            - 종류에따라 다른 메서드를 사용하게 됨
                > executeQuery(); - 조회(SELECT)
                > executeUpdate(); - 삽입/수정/삭제(INSERT, UPDATE, DELETE)

                ResultSet rs = pstmt.executeQuery(); //SELECT

        5) 결과 처리 및 자원 정리
            - SELECT 문이라면 ResultSet을 통해 결과를 받음
            - 반복문을 통해 결과 처리를 함


            - 자원처리
                rs.close();
                pstmt.close();
                conn.close();
                >> 메모리 누수 방지(모든 자원 해제)

 */

public class Jdbc02 {
}
