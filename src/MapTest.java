import java.util.*;
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int map[] = new int[30];  //게임 맵
		int pos  = 0;    //인덱스
		map[0] = 1;      //주인공 위치
		
		while(true) { 
			for(int i=0; i<map.length; i++) {
					System.out.print(map[i]);
				}
			System.out.println();
			
			for(int k : map)System.out.print(k);
			System.out.println();
			System.out.println("왼쪽(1), 오른쪽(2) 입력하세요");
			int input = s.nextInt();
			
			if(input==1) {
				if(pos-1<0) System.out.println("맵 밖으로 나갈 수 없습니다");
				else {
					map[pos] = 0;
					pos = pos -1;
					map[pos] = 1;
				}
			}
			else if(input==2) {
				map[pos] = 0;
				pos = pos +1;
				map[pos] =1;
				if(pos==29) {
					System.out.println("목적지에 도착했습니다.");
					break;
				}
			}
			else System.out.println("잘못입력하셨습니다.");
		}
	}	
}
