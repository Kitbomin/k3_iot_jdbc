package org.example.이론;

/***
 * === SQL 실행 및 결과처리 ===
 *
 * 1. Connection 객체 생성
 *
 * 2. SQL 문 준비(SELECT, INSERT 등등)
 *
 * 3. Statement, PrepareStatement 객체 생성 - SQL 실행 객체 생성
 *
 * 4. SQL 실행 (executeQuery, executeUpdate)
 *
 * 5. 결과 처리 (ResultSet 또는 자원 해제)
 *
 *
 * === Statement VS PrepareStatement ===
 * 1) SQL 작성 방법
 *      - Statement: SQL 직접 작성
 *      - PrepareStatement: ?를 사용해 파라미터를 처리함
 *
 * 2) 보안 사항
 *      - Statement: SQL Injection 위험이 있음
 *
 *          cf) SQL Injection: 악의적인 SQL 문 실행(SQL 쿼리를 일반 입력 또는 양식 필드에 삽입하는 보안 취약성 공격)
 *
 *      - PrepareStatement: SQL Injection을 방지함
 *          => 자바 컴파일러가 SQL 쿼리문을 먼저 한번 읽게됨 -> 쿼리문이 변형되는 상황을 1차적으로 막을 수 있음
 *
 * 3) 성능
 *      - Statement: 매번 컴파일 해야함
 *      - PrepareStatement: 사전 컴파일을 하여 속도가 더 빠름
 *
 * === executeQuery VS executeUpdate ===
 * 1) executeQuery
 *  : SELECT 문 실행 시 사용됨
 *      - 쿼리 실행 후 결과를 ResultSet 이라는 객체로 반환함
 *      - ResultSet 내부에서 데이터를 추출함
 *
 *  >> ResultSet 결과 처리방법
 *      - rs.next(): 다음 행 존재 여부 확인 및 이동
 *      - rs.getInt("컬럼명"), rs.getString("컬럼명"), rs.getDate("컬럼명")
 *          : 정수값, 문자열값, 날짜 값 추출
 *
 * 2) executeUpdate
 *  : INSERT, UPDATE, DELETE 문 실행 시 사용 -> 실행 결과로 영향 받은 레코드 수를 반환함
 *      - 반환 티입: INT
 *      - 행의 개수를 반환하기 때문에 rs(ResultSet)을 사용할 필요가 없음
 *
 *
 */


public class Jdbc03 {
}
