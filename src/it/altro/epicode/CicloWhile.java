package it.altro.epicode;

public class CicloWhile {

    public void stampareCaratteri(String text){
boolean result= text.equals(":q");
while(!result){

    String[] singleChar= text.split(",");
    System.out.println(singleChar);

}
    }
}
