# 솔데스크 (soldesk) 딥러닝 기반의 개인화 서비스 구축을 위한 추천 시스템, 챗봇 개발자 과정

### SWING PROJECT

- 개발 이유 : 점심시간에 무엇을 먹을지에 대해서 결정을 하지 못하는 일이 종종 발생하기 때문에 랜덤으로 결정해 주는 스윙 프로그램을 개발하였습니다.
- 서비스 언어 : Java

- 디자인 : 포토샵을 사용하여 이미지를 제작

- 데이터 : 카카오 맵 지도 검색 데이터를 사용.
     - 자바 언어와, 객체 사용에 대해 숙달을 목표로, 복잡해지는 DB화를 하지 않고, DTO 클래스에 데이터를 하드 코딩
     
#### 프레임을 어떻게 설계하였는가?

- 설계 : ONE(SINGLE) FRAME -> 하나의 프레임 위에 패널을 겹쳐 진행되는 프로세스

    - 이유 : 많은 학생들이 스윙 프로젝트를 진해할 때 프레임을 한 개만 띄워서 진행되는 프로세스가 아니라, 어떠한 액션이 이루어졌을 때
            많은 프레임들이 열리고, 그 위에 화면을 그리는 방식 이거나, 이 전 프레임을 핸들링(삭제, 또는 숨기기) 방향으로 프로세스가 진행되기 때문에
            ONE FRAME 설계를 원하는 학생들에게 방법을 공유하고자 합니다.
      
            
#### CardLayout

- CardLayout 클래스를 사용하여 layout에 CardLayout을 설정하여 사용하고, 그림을 패널에 끼워 사용합니다.
- 자세한 코드는 소스코드에 있습니다. CardLayout 이해를 돕기 위해 코드를 첨부합니다.
        
       public AppFrame() {
           CardLayout cards = new CardLayout();
           getContentPane().setLayout(cards);
           getContentPane().add("testPanel", new TestPanel(this));
       }
           
#### 프로세스 화면
- 심플한걸 좋아하는 취향에 따라 간결하게 디자인 하였습니다.
- 아이폰 앱 화면으로 구성하였으며, 프로세스 또한 하나의 프레임에서 원하는 화면으로 이동 또는, 뒤로갈 수 있습니다.

![20211229_183515](https://user-images.githubusercontent.com/58251630/147649962-c91cb473-078b-4d2b-9418-8725497fee97.png)
![20211229_183525](https://user-images.githubusercontent.com/58251630/147650014-1f18bced-d825-4a03-852d-42093bcbf96c.png)
![20211229_183542](https://user-images.githubusercontent.com/58251630/147650016-650e0dc5-064b-495c-ad80-03d988bd9d0c.png)
![20211229_183552](https://user-images.githubusercontent.com/58251630/147650017-8e7758f6-62c0-4282-b915-fdf75e1cc22d.png)
![20211229_183612](https://user-images.githubusercontent.com/58251630/147650019-0d9b5e0d-fd96-4a63-833f-b4736c8082c6.png)
![20211229_183635](https://user-images.githubusercontent.com/58251630/147650021-362f95a4-04ac-4aff-9dac-c135494026c4.png)








    
