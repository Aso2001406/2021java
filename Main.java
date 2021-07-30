import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int turn=0;
        //while(){}
        turn++;
        System.out.println("********************");
        System.out.println("      戦艦ゲーム     ");
        System.out.println("********************");
        System.out.println("------[ターン"+turn+"]------");
        int[][] area=new int[5][5];

        for(int i=0;i<5;i++){
            for(int k=0;k<5;k++){
                area[i][k]=0;
            }
        }
        
        Ship ship1=new Ship();
        ship1.setShip(area,1);

        Ship ship2=new Ship();
        ship2.setShip(area,2);

        Ship ship3=new Ship();
        ship3.setShip(area,3);
        

        System.out.println("爆弾のX座標を入力してください(1-5)");
        int x=sc.nextInt();
        System.out.println("爆弾のY座標を入力してください(1-5)");
        int y=sc.nextInt();
        
        ship1.checkShip(area,(x-1),(y-1));
        ship2.checkShip(area,(x-1),(y-1));
        ship3.checkShip(area,(x-1),(y-1));
        
        sc.close();
    
    }
}
