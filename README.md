# 코멘토 백엔드 직무 부트 캠프

## SW활용 현황 통계 API 개발 과제

### 1차 과제 - 개발 환경 셋팅

-  스프링 5.1.8.RELEASE 환경 검토
-  MariaDB 10.2.14 설정
-  JDBC 4.3.9.RELEASE 설정
-  Mybatis 3.4.4 설정
-  mariaDB, mySql WorkBench 설치 및 샘플 DB 구축
-  스프링, Mariadb, MyBatis 연동, 데이터 조회

</br>

-  개발 환경 세팅 완료 후 스크린샷

![image](https://user-images.githubusercontent.com/71515740/200478547-074880b4-acb1-4560-aa7a-6185013faea4.png)
![image](https://user-images.githubusercontent.com/71515740/200478911-320a5218-52ef-476c-a5e8-378c950d81b6.png)


### 2차 과제 - API 문서 작성
V 1.0

- 데이터 공통사항 정의
- 요청 파라미터 정의
- 접속자 수 API 작성
  + 연도별 접속자 수
  + 월별 접속자 수
  + 일별 접속자 수
  + 부서별 접속자 수
- 로그인 요청 수 API 작성
- 게시글 작성 수 API 작성
  + 총 게시글 작성 수
  + 사용자별 게시글 작성 수

http 통신에 대한 정리 - https://velog.io/@sgb8170/HTTP%EB%9E%80
</br> </br>
url을 통한 요청 및 응답 까지의 과정 정리 - https://velog.io/@sgb8170/%ED%81%B4%EB%9D%BC%EC%9D%B4%EC%96%B8%ED%8A%B8-%EC%84%9C%EB%B2%84%EA%B0%84-%ED%86%B5%EC%8B%A0-%EA%B3%BC%EC%A0%95-%EB%B0%8F-%EA%B5%AC%EC%A1%B0


</br>

### 3차 과제

- 스프링 부트 개발 환경 설정
<div style="float:left">
  <img src="https://user-images.githubusercontent.com/71515740/201973974-9b986c18-f85e-4273-908e-063b613e1580.png" width="400" height="600"/>

  <img src="https://user-images.githubusercontent.com/71515740/201974285-fd637810-0d71-4981-b20f-65c19bf38e41.png" width="400" height="600"/>
</div>

</br>

- DB 및 샘플 데이터 생성
  - 테이블 requestInfo
  
  ![image](https://user-images.githubusercontent.com/71515740/201975850-f7e3b588-c2be-4fdb-9098-531de400e829.png)
  
  </br>

  - 테이블 requestcode
  
  ![image](https://user-images.githubusercontent.com/71515740/201975969-7454083b-672a-4004-82e7-c0582cbd0f65.png)
  
  </br>

  - 테이블 user
  
  ![image](https://user-images.githubusercontent.com/71515740/201976038-e435747a-34d4-4600-beb0-55672dfe7da1.png)
  
  </br>
  
  - 로그인 통계 API 쿼리 작성
    - StatisticMapper.xml
    


</br></br>


### 4차 과제

- API 개발
  - 연도별 접속자 수

  ![연도별 로그인](https://user-images.githubusercontent.com/71515740/201977190-7a5126ef-ee90-493d-9713-caecea5ac42d.PNG)


  - 월별 접속자 수

  ![월별](https://user-images.githubusercontent.com/71515740/201977215-a3b6e4a5-1033-473c-8f47-742e534744e9.PNG)


  - 일자별 접속자 수

  ![일별](https://user-images.githubusercontent.com/71515740/201977241-fabedd60-d9a1-4450-83f7-3e0f1d914ad8.PNG)


  - 평균 하루 로그인 수

  ![하루평균](https://user-images.githubusercontent.com/71515740/201977258-7e5ad716-3233-4a63-984c-665a0dc3e381.PNG)


  - 휴일 제외한 로그인 수

  ![휴일제외](https://user-images.githubusercontent.com/71515740/201977280-db7bc985-3798-4f5e-acdc-c15b3617c7b3.PNG)


  - 부서별 월별 로그인 수

  ![부서별월별](https://user-images.githubusercontent.com/71515740/201977369-7997358b-1616-498e-bffc-3d51d7cedfc4.PNG)


- API 문서 수정 (V 2.0)
  - SW_활용률_API_doc.pptx




