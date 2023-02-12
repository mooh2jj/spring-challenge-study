- 깃 허브 주소 : https://github.com/alexgim961101/ski-sharing
- erd        : https://www.erdcloud.com/d/KeuBBErLkggY6kfKG
- API 명세서 : https://docs.google.com/spreadsheets/d/1fTIWcbuxU-xtftxc7pVbGo4eLdu0GnWNc1UD1-L2hX0/edit?usp=sharing

- 생각거리 정리
1. 자바 VS 모던 자바
큰 차이점의 함수형 프로그래밍이 모던자바에서 가능해졌다는 것!
여기서 함수형 프로그래밍이란?
- 높은 수준의 추상화를 제공
- 함수 단위의 코드 재사용 수월
- 불변성 지향 -> ㅡ로그램 동작 예측 수월
단점
- 순수 함수 -> 코드의 가독성이 떨어질 수 있다.
- 반복을 재귀를 통해 구현 -> 무한루프에 빠질 가능성 존재

2. SSR VS SPA
SSR : 서버 사이드 랜더링 
- 요청시마다 새고고침 발생 + 서버에 새로운 페이지에대한 요청
- 정보량 많아짐 -> 서버에 대한 부담 -> SPA 등장
- 검색 엔진 최적화 유리

SPA : Single Page Application
- 최초 한번만 페이지 전체를 로딩한 후 데이터만 변경해서 사용할 수 있는 웹 어플리케이션 
- 화면 구성에 필요한 모든 HTML을 클라이언트가 가지고 있고 필요한 데이터만 서버에 JSON으로 받기 때문에 SSR에 비해 화면 구성 속도 빠름

3. 스프링 프레임워크 VS 스프링 부트
1. dependency, configuration 설정 부분에서 스프링 부트가 매우 편함
2. 배포 용이 war 파일 대신 jar로 파일로 간단하게 배포
--> 스프링 부트는 일반 스프링보다 개발에만 더욱 집중할 수 있도록 도와주는 프레임워크

4. MySQL 5.7 VS MySQL 8.0
- 성능 측면에서 8.0 버전이 유리 (인덱스 내림차순 지원)
- NoSQL 기능 제공
- 사용자 인증 방식 변경

5. Mybatis VS JPA
Mybatis (Object Mapping ): SQL을 직접 작성하여 쿼리 수행 결과를 객체와 매핑 -> 객체와 뭐리문 모두 관리해야됨

JPA (ORM) : 쿼리를 만들지 않아도 됨 -> 객체 중심으로 개발 가능 but 복잡한 쿼리는 해결하기 힘들다는 단점

