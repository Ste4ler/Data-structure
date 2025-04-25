public class Shortestpath{
    public static float shortdist(String path){
        int x=0;
        int y=0;

        for(int i=0; i<path.length(); i++){
            //South
            if(path.charAt(i)=='S'){
                y--;
            }
            //North
            else if(path.charAt(i)=='N'){
                y++;
            }
            //East
            else if(path.charAt(i)=='E'){
                x++;
            }
            //West
            else if(path.charAt(i)=='W'){
                x--;
            }
            else{
                System.out.print("Invalid!");
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String dir ="WNEENESENNN";
        System.out.print(shortdist(dir));
        dir.compareToIgnoreCase(dir);
    }
}