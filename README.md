# /24-08-20

## 자바 프로그램 실행

### 주의
자바 언어는 대소문자를 구분한다. 대소문자가 다르면 오류가 발생할 수 있다.

코드를 분석해보자.

public class HelloJava
- HelloJava를 클래스라 한다. 클래스(class)의 개념을 학습해야 이해할 수 있다.
- 파일명과 클래스 이름이 같아야 한다.
- {} 블록을 사용해서 클래스의 시작과 끝을 나타낸다.

public static void main(String[] args)
- main 메서드라 한다. 함수, 메서드의 개념을 학습해야 이해할 수 있다.
- 자바는 main(String[] args) 메서드를 찾아서 프로그램을 시작한다.
- 지금은 단순히 main은 프로그램의 시작점이라고 이해하면 된다.
- {} 블록을 사용해서 메서드의 시작과 끝을 나타낸다.

System.out.println("hello java");
- 값을 콘솔에 출력하는 기능이다.
- 자바는 문자열을 사용할 때 "(쌍따옴표)를 사용한다. 쌍따옴표 사이에 원하는 문자열을 감싸면 된다.
- ; : 자바는 세미콜론으로 문장을 구분한다. 문장이 끝나면 세미콜론을 필수로 넣어주어야 한다.

### 참고
- () : 소괄호
- {} : 중괄호
- [] : 대괄호

# /24-08-21

## 주석(comment)
소스 코드가 복잡하다면 소스 코드에 대한 이해를 돕기 위해 설명을 적어두고 싶을 수 있다.
또는 특정 코드를 지우지 않고, 잠시 실행을 막아두고 싶을 때도 있다.
이럴 때 주석을 사용하면 된다. 자바는 주석이 있는 곳을 무시한다.

### 주석의 종류
- 한 줄 주석 (single line comment)
  - // 기호로 시작한다. 이 기호 이후의 모든 텍스트는 주석으로 처리된다.
- 여러 줄 주석 (multi line comment)
  - /* 로 시작하고 */ 로 끝난다. 이 사이의 모든 텍스트는 주석으로 처리된다.

# /24-08-22

## 자바란?

### 자바 표준 스펙 
자바 컴파일러
자바 실행 라이브러리
자바 가상 머신(JVM)

자바는 표준 스펙과 구현으로 나눌 수 있다.
- 자바 표준 스펙
  - 자바는 이렇게 만들어야 한다는 설계도이며, 문서이다.
  - 이 표준 스펙을 기반으로 여러 회사에서 실제 작동하는 자바를 만든다.
  - 자바 표준 스펙은 자바 커뮤니티 프로세스(JCP)를 통해 관리된다.
- 다양한 자바 구현
  - 여러 회사에서 자바 표준 스펙에 맞추어 실제 작동하는 자바 프로그램을 개발한다.
  - 각각 장단점이 있다. 예를 들어 Amazon Corretto는 AWS에 최적화 되어 있다.
  - 각 회사들은 대부분 윈도우, MAC, 리눅스 같이 다양한 OS에서 작동하는 버전의 자바도 함께 제공한다.

#### 변경의 용이
- 자바 구현들은 모두 표준 스펙에 맞도록 개발되어 있다. 따라서 오라클 OpenJDK를 사용하다가 Amazon Corretto 자바로 변경해도 대부분 문제 없이 동작한다.

### 컴파일과 실행
자바 프로그램은 컴파일과 실행 단계를 거친다.
- Hello.java와 같은 자바 소스 코드를 개발자가 작성한다.
- 자바 컴파일러를 사용해서 소스 코드를 컴파일 한다.
  - 자바가 제공하는 javac라는 프로그램을 사용한다.
  - .java -> .class 파일이 생성된다.
  - 자바 소스 코드를 바이트코드로 변환하며 자바 가상 머신에서 더 빠르게 실행될 수 있게 최적화하고 문법 오류도 검출한다.
- 자바 프로그램을 실행한다.
  - 자바가 제공하는 java라는 프로그램을 사용한다.
  - 자바 가상 머신(JVM)이 실행되면서 프로그램이 작동한다.
 
### IDE와 자바
#### 인텔리제이를 통한 자바 설치 관리
- 인텔리제이는 내부에 자바를 편리하게 설치하고 관리할 수 있는 기능을 제공한다.
- 이 기능을 사용하면 인텔리제이를 통해 자바를 편리하게 다운로드 받고 실행할 수 있다.

#### 인텔리제이를 통한 자바 컴파일, 실행 과정
- 컴파일
  - 자바 코드를 컴파일 하려면 javac라는 프로그램을 직접 사용해야 하는데, 인텔리제이는 자바 코드를 실행할 때 이 과정을 자동으로 처리해준다.
    - 예) javac Hello.java
  - 인텔리제이 화면에서 프로젝트에 있는 out폴더에 가보면 컴파일된 .class 파일이 있는 것을 확인할 수 있다.
- 실행
  - 자바를 실행하려면 java라는 프로그램을 사용해야 한다. 이때 컴파일된 .class 파일을 지정해주면 된다.
  - 예) java Hello 참고로 확장자는 제외한다.

- 인텔리제이에서 자바 코드를 실행하면 컴파일과 실행을 모두 한번에 처리한다.
- 인텔리제이 덕분에 매우 편리하게 자바 프로그램을 개발하고, 학습할 수 있다.

### 자바와 운영체제 독립성
#### 일반적인 프로그램
- 일반적인 프로그램은 다른 운영체제에서 실행할수 없다.
- 예를 들어서 윈도우 프로그램은 MAC이나 리눅스에서 작동하지 않는다.
- 왜냐하면 윈도우 프로그램은 윈도우 OS가 사용하는 명령어들로 구성되어 있기 때문이다. 해당 명령어는 다른 OSㄴ와는 호환되지 않는다.

#### 자바 프로그램
- 자바 프로그램은 자바가 설치된 모든 OS에서 실행할 수 있다.
- 자바 개발자는 특정 OS에 맞추어 개발을 하지 않아도 된다. 자바 개발자는 자바에 맞추어 개발하면 된다.
  OS 호환성 문제는 자바가 해결한다.
  Hello.class와 같이 컴파일된 자바 파일은 모든 자바 환경에서 실행할 수 있다.
- 윈도우 자바는 윈도우 OS가 사용하는 명령어들로 구성되어 있다.
  MAC이나 리눅스 자바도 본인의 OS가 사용하는 명령어들로 구성되어 있다.
  개발자는 각 OS에 맞도록 자바를 설치하기만 하면 된다.

#### 자바 개발과 운영 환경
- 개발할 때 자바와 서버에서 실행할 때 다른 자바를 사용할 수 있다.
- 개발자들은 개발의 편의를 위해서 윈도우나 MAC OS를 주로 사용한다.
- 서버는 주로 리눅스를 사용한다. 만약 AWS를 사용한다면 Amazon Corretto 자바를 AWS 리눅스 서버에 설치하면 된다.
- 자바의 운영체제 독립성 덕분에 각각의 환경에 맞추어 자바를 설치하는 것이 가능하다.



