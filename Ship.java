public class Ship{
    
    public int shipnum;
    public int xplace;
    public int yplace;

    public void setShip(int[][] array,int shipnum){
        this.shipnum=shipnum;
        this.xplace=new java.util.Random().nextInt(5);
        this.yplace=new java.util.Random().nextInt(5);
        array[yplace][xplace]=1;
    }

    public void checkShip(int[][] array,int y,int x){
        if(array[y][x]==1){
            System.out.println("船"+shipnum+":命中だがまだ沈まない　移動します");
            setShip(array,shipnum);
        }else if(y==0){
            if(array[y+1][x]==1){
                System.out.println("船"+shipnum+":波高し");
            }
        }else if(y==4){
            if(array[y-1][x]==1){
                System.out.println("船"+shipnum+":波高し");
            }
        }else if(x==0){
            if(array[y][x+1]==1){
                System.out.println("船"+shipnum+":波高し");
            }
        }else if(x==4){
            if(array[y][x-1]==1){
                System.out.println("船"+shipnum+":波高し");
            }
        }
        else if(array[y][x-1]==1 || array[y][x+1]==1 || array[y+1][x]==1 || array[y-1][x]==1){
            System.out.println("船"+shipnum+":波高し");
        }else{
            System.out.println("船"+shipnum+":はずれ");
        }
    }
}