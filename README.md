# spring-factory

-. spring framework 환경에서 설정파일(.xml)과 어노테이션(@Configuration) 방식으로 객체의 생성을 담당하는 팩토리 패턴의 클래스를 구성.

-. 팩토리 클래스의 관리를 스프링 컨테이너로 위임함로써, 새로운 오브젝트 추가에도 재컴파일 없이 유연하게 대처 가능.

-. 테스트를 위한 Restful API 게시.

-. Class 설명

	(1). HumanFactoryConfiguration.java : 어노테이션(@bean) 방식을 통한 Factory(HumanFactory) 클래스 정의.
	
	(2). HumanFactory.java : Factory 로써 게시할 메소드를 정의한 인터페이스.
	
	(3). Man.java, Woman.java : Factory에서 생성 가능한 Model 클래스.
	
	(4). ISay.java : Model(Man,Woman)에서 구현 약속한 공통 인터페이스.
	
	(5). TFactoryController.java : Factory 사용에 대한 테스트를 수행할 Restful API를 게시하는 컨트롤러.
	
	(6). TFactoryServiceImpl.java : Spring에서 관장하는 Factory를 사용한 비지니스 로직을 수행하는 서비스.
