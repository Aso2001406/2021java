public class Ship{
    
    public int shipnum;
    public int hp;
    public int hpcheck=0;
    public int xplace;
    public int yplace;

    public void setShip(String[][] array,int shipnum){
        this.hp=3;
        this.shipnum=shipnum;
        this.xplace=new java.util.Random().nextInt(5);
        this.yplace=new java.util.Random().nextInt(5);
        array[yplace][xplace]="〇";
    }

    public void checkShip(String[][] array,int y,int x){
        if(array[y][x]=="〇"){
            System.out.println("船"+shipnum+":命中だがまだ沈まない　移動します");
            hp--;
            hpcheck++;
        }else if(y==0){
            if(array[y+1][x]=="〇"){
                System.out.println("船"+shipnum+":波高し");
            }
        }else if(y==4){
            if(array[y-1][x]=="〇"){
                System.out.println("船"+shipnum+":波高し");
            }
        }else if(x==0){
            if(array[y][x+1]=="〇"){
                System.out.println("船"+shipnum+":波高し");
            }
        }else if(x==4){
            if(array[y][x-1]=="〇"){
                System.out.println("船"+shipnum+":波高し");
            }
        }
        else if(array[y][x-1]=="〇" || array[y][x+1]=="〇" || array[y+1][x]=="〇" || array[y-1][x]=="〇"){
            System.out.println("船"+shipnum+":波高し");
        }else{
            System.out.println("船"+shipnum+":はずれ");
        }
    }

        public void reSet(String[][] array){
            if(this.hpcheck==1){
                array[yplace][xplace]="×";
                this.hpcheck=0;
            }
            if(hp!=0){
                this.xplace=new java.util.Random().nextInt(5);
                this.yplace=new java.util.Random().nextInt(5);
                array[yplace][xplace]="〇";
            }
        }
}