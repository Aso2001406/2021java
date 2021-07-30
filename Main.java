import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int turn=0;
        
        String[][] area=new String[5][5];

        for(int i=0;i<5;i++){
            for(int k=0;k<5;k++){
                area[i][k]="×";
            }
        }
        
        Ship ship1=new Ship();
        ship1.setShip(area,1);

        Ship ship2=new Ship();
        ship2.setShip(area,2);

        Ship ship3=new Ship();
        ship3.setShip(area,3);
        
        Game.game();

        while(ship1.hp!=0 || ship2.hp!=0 || ship3.hp!=0){
            turn++;
            Game.turn(turn);
            
        
        System.out.println("爆弾のX座標を入力してください(1-5)");
        int x=sc.nextInt();
        System.out.println("爆弾のY座標を入力してください(1-5)");
        int y=sc.nextInt();
        
        ship1.checkShip(area,(x-1),(y-1));
        ship2.checkShip(area,(x-1),(y-1));
        ship3.checkShip(area,(x-1),(y-1));
        
        ship1.reSet(area);
        ship2.reSet(area);
        ship3.reSet(area);
        }
        sc.close();
    }
}
