# java-ladder 기능 요구사항

## 입력
- [x] 참여할 사람 이름을 입력받는다.
  - [x] 이름은 쉼표(,)로 구분한다.
  - [x] 이름의 앞뒤 공백은 제거한다. (ex. "aa" == " aa" )
- [x] 최대 사다리 높이를 입력받는다.
  - [x] 자연수여야한다.
- [x] 사다리 게임 실행 결과를 입력받는다.
  - [x] 결과는 쉼표(,)로 구분한다.

## 출력
- [x] 이름을 출력한다.
- [x] 사다리를 출력한다.
- [x] 결과를 원하는 참여자의 결과를 출력한다.

## 참여자들 (Players)
- [x] 참여자 이름 목록을 통해 참여자들을 생성한다.
  - [x] 이름은 중복될 수 없다.
  - [x] 이름은 두명 이상이여야한다.

## 참여자 (Player)
- [x] 이름(Name)을 가지고 있다.

## 이름 (Name)
- [x] 이름을 의미하는 문자열을 가지고 있다.
  - [x] 이름은 최대 5글자까지 가능하다.

## 사다리 결과(LadderResult)
- [x] 사다리 결과를 의미하는 문자열을 가지고 있다.

## 사다리 게임(LadderGame)
- [x] 사다리(Ladder)와 참여자들(Players)을 가지고 있다.
  - [x] 사다리 결과 수가 참여자 수와 동일해야한다.
- [x] 참여자 이름을 가지고 결과를 알려준다.
- [x] 모든 참여자의 결과를 알려준다.

## 사다리 (Ladder)
- [x] 최대 사다리 높이만큼 가로줄(Line)을 가지고 있다.
- [x] 사용자의 사다리 시작 위치를 통해 사다리 결과 위치를 알려준다.

## 가로줄 (Line)
- [x] 가로줄 연결 여부는 생성자에서 정해진다.
- [x] 사다리가 연결되었는지 여부를 가지고 있다.
  - [x] 연속으로 사다리가 연결되면 안된다.
- [x] 해당 위치에서 왼쪽으로 연결된 길이 있는지 알려준다.
- [x] 해당 위치에서 오른쪽으로 연결된 길이 있는지 알려준다.


<br>
<hr>

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
