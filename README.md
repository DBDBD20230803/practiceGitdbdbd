# 첫 프로젝트 : 자바 기초 연산 로직 구성하기 - 협업을 통해서

<h3>❤팀장❤ 김유빈</h3>
 <p>♦ 맡은 부분 : </br>
  Main Class를 생성해서 전체 Application의 구성을 짜고, 호출 시 실행할 수 있는 로직을 생성했다.</br>
  Git Repository 생성 후, push 해서 팀원들이 공유할 수 있게 했고, 팀원들의 소스코드를 merge 했다. </br>
  최소값 및 나누기 연산자를 구하는 로직을 구성했다.</br>
  Git Repository를 pull받아서 commit 후, push하는 과정을 연습했다.</br>
 </p>
  <hr>
<h3>❤팀원❤ 이소망</h3>
 <p>♦ 맡은 부분 : </br>
  substract 연산자 및 1~N(내가 입력한 값)의 합의 평균값을 구하는 로직을 구성했다.</br>
  Git Repository를 pull받아서 commit 후, push하는 과정을 연습했다.</br>
 </p>

public class CalavgtoN {
    public static void calAvgtoN() {
        Scanner sc = new Scanner(System.in);

        System.out.println("<8. 1 ~ n 평균값 구하기>");
        System.out.println("값을 입력해주세요. ");
        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        int ave = sum / n;

        System.out.println("1부터 " + n + "까지의 합의 평균은 " + ave + "입니다.");
    }
    }

public class Calmin {

    public static void calMin() {

        Scanner sc = new Scanner(System.in);
        System.out.println("<10. 최소값>");

        System.out.print("첫번째 숫자를 입력해주세요. ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("두번째 숫자를 입력해주세요. ");
        int b = sc.nextInt();
        sc.nextLine();
        int c = Math.min(a, b);
        System.out.println("값이 더 작은 수는 " + c + "입니다.");
    }
}

 <hr>
<h3>❤팀원❤ 강한성</h3>
 <p>♦ 맡은 부분 : </br>
 최대값 및 나머지 연산자를 구하는 로직을 구성했다.</br>
  Git Repository를 pull받아서 commit 후, push하는 과정을 연습했다.</br>
 </p>
 <hr>
<h3>❤팀원❤ 이선호</h3>
 <p>♦ 맡은 부분 : </br>
 더하기 연산자 및 1~N(내가 입력한 값)의 합을 구하는 로직을 구성했다.</br>
  Git Repository를 pull받아서 commit 후, push하는 과정을 연습했다.</br>
 </p>

 <h4>🎈우리 팀 화이팅!🎈</h4>
