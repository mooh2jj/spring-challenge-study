# spring-project-challenge-study
스프링 프로젝트 챌린지 스터디 레포지토리입니다.

<br>

# 📢 스터디 규칙
1. 매주 스터디는 2시간을 기본으로 한다. 스터디원 1명 이상이 발표 진행 1시간, 스터디장 기술소개시간 1시간을 한다, 스터디원 발표 내용은 이 [spring-project-challenge-study](https://github.com/mooh2jj/spring-project-challenge-study)를 `fork`한 후 본인 Repository에서 각 `본인이름의 디렉토리`에 `PR(Pull Request)`하여 정리해주면 된다.
  * fork&PR 영상 참고 -> https://www.youtube.com/watch?v=yr6IzOGoMsQ

2. 발표시 CodeReview인 점을 감안하여 `Code 내용을 중심으로 발표`가 이루어진다. (발표는 하고싶은 분을 1순위, 없다면 당일날 랜덤으로 정해집니다)
3. 나머지 스터디원들도 매주 해당 내용 숙지를 위해 스터디한 내용 학습, 학습한 내용을 `해당 본인이름의 디렉토리`에 `PR`하여 정리한다. 
4. 보증금은 `3만원이며 1번 불참시 1만원을 차감`, 스터디비용을 제하고 계속 합류한 분들에게만 지급된다. (불가항력적인 사유일 때는 스터디장에게 개인톡을 보내주시기 바랍니다.)


<br>

# 📅 스터디 일정

<details>
<summary>OT(01/07)</summary>
<div markdown="1">

* 자기소개 시간
* 스터디 취지, 방향, 구성 방식 설명
* 과제 
``` 
1) 사용 툴 설치및 이해하기 
 * IntelliJ(얼티메이트 버전 추천-플러그인 사용 가능)
 * MySQL, DB 접속 HediSQL 
 * e2e 테스트용 postman
 * git/github

2) 해당 레포지토리 fork & PR 해보기 
 
3) 자신이 만들 프로젝트 item 정하기 & DB ERD 설계해오기 

4) API 명세서 만들기(스프레드시트든 Notion이든 상관x) 
 
5) SpringBoot, JPA or Mybatis, Mysql 사용, DB ERD 설계한 엔티티로 CRUD REST API 만들기

```

* 환경셋팅 : https://www.notion.so/bb4d80cb1a094696b8ff27f4cd52bb00

 <br>
 
</div>
</details>

<details>
<summary>1주차(01/14)</summary>
<div markdown="1">

* 프로젝트 기술스택 점검
* DB 설계 점검 (index, transaction)
* Exception 예외처리

* 과제 
``` 
1) 자신이 만들 프로젝트 git Repository로 만들고 README.md 정리 
README.MD 내용은 서비스 기획의도, 서비스 지향하는 바, ERD, API 명세서 등을 작성, 검색 참고

2) 자신만의 WBS 표 만들고 설계한 ERD, API 명세서대로 개발진행하기 
 
3) 개발 진행사항 및 이슈사항 정리 - git or 개인 블로그 or Notion 등에 정리할 수 있도록!

4) JPA, JDBC 등 본인이 사용할 DB접근 기술 공부해오고 정리

```
* 정리 - https://www.notion.so/2week-e0ecadeebc1944d4bd5062bf483f1ef6

 <br>
 
</div>
</details>

<details>
<summary>2주차(01/28)</summary>
<div markdown="1">

* JPA 4가지 이슈 정리
* Junut5 테스트 방식
* paging 처리 및 동적조건 처리(querydsl) 
* 정리 - https://rain-tank-b79.notion.site/2week-582106e5292b45b2810706d4f00c069d


* 과제 
``` 
1) JPA 연관관계 단방향 매핑 구현, ex) board - comments 

2) Junit5 테스트코드 구현 (Unit 테스트로 Service 테스트만, Mockito 사용)
 
챌린지) paging 조회 내 검색조건 처리 구현 (Mybatis 동적태그 or JPA queydsl)

```


 <br>
 
</div>
</details>

<details>
<summary>3주차(10/21)</summary>
<div markdown="1">

* Page 처리 -> Pageable 객체 사용, 페이징 커스터마이징
* @Query, Querydsl 로 동적쿼리 사용하기
* reqeust Dto 내 validation -> exception
* ExceptionHandler 커스터마이징 (create dto)
 

* 과제 
```
엔티티 API 미션으로 JPA N+1 이슈 해결 방식 처리 학습 -> fetch batch-size 활용하기
```


 <br>
 
</div>
</details>

<details>
<summary>4주차(10/28)</summary>
<div markdown="1">

* 웹개발 인증처리 기술(세션, 쿠키, 토큰)
* 토큰: jwt 기술 이해, Spring Security 적용
* Spring Security config 소스 이해
* Spring Securiy + jwt 로 인증/인가 코드 구현
 

* 과제 
```
Spring Securiy + jwt 로 인증/인가 소스 본인 프로젝트 에 적용하기
```

<br>

</div>
</details>

<details>
<summary>5주차(11/05)</summary>
<div markdown="1">

* 3rd party 라이브러리 대표적 기술 구현 설명
* 파일업로드 -> AWS s3 저장소 로 구현 및 실습
* sms -> coolsms 서비스로 핸드폰 인증 코드 -> 메시지 발행
* excel -> 업로드/ 다운로드 시 Apach POI 라이브러리 이용 -> workbook, sheet, cell, row 객체 설명
 

* 과제 
```
파일업로드 S3, sms, excel 구현 코드 본인 프로젝트에 적용하기
```

<br>

# 🎃 주의사항

1. 발표 내용에 대한 리뷰, 질문이 너무 날카로워 해당 발표자에 대한 강한 `감정적인 언행은 주의`해주세요 😫!
2. 질문을 받은 발표자도 Code 또는 발표내용 등을 자신과 동일시하여 지적한 것에 대해 너무 불쾌히 여기지 말으셨으면 좋겠습니다 😂!
3. 리뷰, 피드백의 핵심은 `문제점들을 찾고 발전하는 것`이라는 걸 잊지 말아주세요!

