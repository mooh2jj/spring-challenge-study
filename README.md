# spring-challenge-study

스프링 프로젝트 챌린지 스터디 레포지토리입니다.

<br>

# 📢 스터디 규칙

1. 매주 스터디는 2시간을 기본으로 한다. 스터디원 1명 이상이 발표 진행 1시간, 스터디장 기술소개시간 1시간을 한다, 스터디원 발표 내용은 이 [spring-project-challenge-study](https://github.com/mooh2jj/spring-project-challenge-study)를 `fork`한 후 본인 Repository에서 각 `본인이름의 디렉토리`에 `PR(Pull Request)`하여 정리해주면 된다.

- fork&PR 영상 참고 -> https://www.youtube.com/watch?v=yr6IzOGoMsQ

2. 발표시 CodeReview인 점을 감안하여 `Code 내용을 중심으로 발표`가 이루어진다. (발표는 하고싶은 분을 1순위, 없다면 당일날 랜덤으로 정해집니다)
3. 나머지 스터디원들도 매주 해당 내용 숙지를 위해 스터디한 내용 학습, 학습한 내용을 `해당 본인이름의 디렉토리`에 `PR`하여 정리한다.
   ~~4. 보증금은 `3만원이며 1번 불참시 1만원을 차감`, 스터디비용을 제하고 계속 합류한 분들에게만 지급된다. (불가항력적인 사유일 때는 스터디장에게 개인톡을 보내주시기 바랍니다.)~~

<br>

# 📅 스터디 일정

<details>
<summary>OT(11/04)</summary>
<div markdown="1">

- 자기소개 시간
- 스터디 취지, 방향, 구성 방식 설명
- 과제

```
1) 사용 툴 설치및 이해하기
 * IntelliJ(얼티메이트 버전 추천-플러그인 사용 가능)
 * MySQL8.0, DB 접속 HediSQL or workbench
 * e2e 테스트용 postman
 * git/github git bash 설치

2) 해당 레포지토리 fork & PR 해보기

3) ERD_Cloud 프로그램으로 Entity 설계 ex. Board, Comment (최소 N:1연관과계 컬렉션 엔티티 도 같이 설계해야함!)

5) SpringBoot, JPA, Mysql 사용, DB ERD 설계한 엔티티로 CRUD REST API 구현하기 ex.
* 등록
* 조회/상세조회
* 수정
* 삭제
```

- 환경셋팅 : https://www.notion.so/bb4d80cb1a094696b8ff27f4cd52bb00
- 기존자바정리 : https://www.notion.so/01f2f7d8a1d8453c84acdf47baca5d9e?pvs=4
 
</div>
</details>

<details>
<summary>1week(11/11)</summary>
<div markdown="1">

- 1달간 진행할 스프리부트 도식도 설명(판서)
- 자바 Collections 구조 실습 -> Enum, RequestDto 내 파라미터 설명
- DB Table 과 JPA 엔티티 와의 매핑 도식도 => ERD
- JPA 엔티티 중 1:N 연관관계의 Collection 필드 조회오기 실습 -> @OneToMany , Dto 매핑

미션
```
1) ERD cloud 프로그램을 통해 ERD 추가하기 => User, Category
2) 단톡방에 올린 React 화면단을 보고 REST API 명세서 만들기 
3) @OneToMany 실습 복습
4) Dto 매핑을 잘해야되는 이유 -> Hint) N+1, lazy loading
5) N+1 을 해결하는 방식에 fetch join 외 다른방법 서치하기
```

- 노션정리 : https://www.notion.so/1week-66748cc6137b4d3f891107190fbdd691?pvs=4
 
</div>
</details>

<br>

# 🎃 주의사항

1. 발표 내용에 대한 리뷰, 질문이 너무 날카로워 해당 발표자에 대한 강한 `감정적인 언행은 주의`해주세요 😫!
2. 질문을 받은 발표자도 Code 또는 발표내용 등을 자신과 동일시하여 지적한 것에 대해 너무 불쾌히 여기지 말으셨으면 좋겠습니다 😂!
3. 리뷰, 피드백의 핵심은 `문제점들을 찾고 발전하는 것`이라는 걸 잊지 말아주세요!
