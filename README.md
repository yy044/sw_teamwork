# sw_teamwork
### 1. Contributors List:
- 양은서 (2022020100)
- 김은지 (2022073290)
- 송민아 (2022040391)
- 배재진 (2022028877)

### 2. 프로젝트 개요
구현하고자 하는 것은 게임의 한 종류인 ‘네모 로직(nonogram)’이다. 이 게임은 가운데 있는 그림 보드를, 상단과 좌측에 있는 숫자 힌트를 토대로 완성해가는 것이다. 많은 게임 중 이것을 선택한 이유는 조원 모두가 해 본 적 있는 익숙한 게임이고, 사람들에게 많이 알려져 있기 때문이다. 우리는 이 게임을 java를 사용해 구현할 것이며, 통합개발환경은 eclipse를 사용할 것이다. 전체적인 구현 방향은 가운데 그림 보드를 중심으로 하여, 상단과 좌측에 숫자 힌트를 배치할 것이다. 또한, 게임을 시작하면 단계 (5 X 5, 10 X 10, 15 X 15)를 선택할 수 있게 하고, 게임 진행 도중 틀릴 때마다 기회를 하나씩 줄여 나가는 식으로 구현할 것이다. 마지막으로, 정답을 맞히거나 기회를 다 잃으면 게임을 더 할지 말지 선택하는 결과 창이 나오도록 한다.

![205757632-bec8f180-f9a6-4c01-a589-b5f0c23c5e37](https://user-images.githubusercontent.com/115619689/205757846-26ca8bdb-4ae3-435f-91b5-7a7517faede3.png)

### 3. 1주차
- 주제 선정: Java를 통해 노노그램 게임 프로그램 구현
- 틀 만들기: Java 프로그램에서 사용할 class 지정, 역할 분배

### 4. 2주차
- 구현: 5x5 로직 (완료)

### 5. 3주차
- 구현 : 10 X 10 로직 (완료)
- 구현 : 15 X 15 로직 (완료)
- 구현 : SelectLevel(단계 선택) (완료)

### 6. 4주차
- 구현 : ResultFrame, MoreButtonR, ExitButton (완료)
- 구현 : Moksum, LoseFrame, MoreButtonL (완료)
- 구현 : OButton, XButton (완료)
- 개선 : SelectLevel UI (완료)
- 개선 : BoardFrame UI (완료)

### 7. 결과물
![open1](https://user-images.githubusercontent.com/115148838/207522221-b6380021-b42a-4961-94ef-6ec27c186453.png)
- SelectLevel:
게임 레벨을 고르는 Frame
각 레벨 버튼을 누르면 해당 레벨의 BoardFrame을 불러옴
![open2](https://user-images.githubusercontent.com/115148838/207522298-d439a1d5-41a8-4112-8355-1aef4acba18f.png)
- BoardFrame:
게임을 플레이하는 Frame
3번의 기회 카운트
임시 x 표시 버튼과 정답 표시 o 버튼
위와 왼쪽에 적힌 숫자를 보고 게임 플레이
![open3](https://user-images.githubusercontent.com/115148838/207522336-154e2881-5435-47a3-a088-0c21647b14ce.png)
- ResultFrame:
게임 승리 시 결과를 보여주는 Frame
More 버튼을 누르면 새 게임
Exit 버튼을 누르면 게임 종료
![open4](https://user-images.githubusercontent.com/115148838/207522373-19f27f87-c3a3-484e-bb62-6d738b64bef7.png)
-	LoseFrame:
게임 패배 시 결과를 보여주는 Frame
More 버튼을 누르면 새 게임
Exit 버튼을 누르면 게임 종료
