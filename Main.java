import java.awt.*;

class Board extends Frame{
Board(){
 Button b=new Button("solanki");
 b.setBounds(30,30,30,30);
 add(b);
 setSize(300,300);
//  setLayout(null);
 setVisible(true);
}
}

class Main{
    public static void main(String []args){
        Board gameBoard=new Board();
    }
}