import java.awt.*;
class Demo extends Frame
{
      Label l;
      Demo()
      {
            l=new Label("HELLO JAVA");
            l.setFont(new Font("Georgia",Font.BOLD,40));
            l.setForeground(Color.RED);
            add(l);
            setBackground(Color.BLUE);
            setSize(300,300);
            setLayout(new FlowLayout()); 
            setVisible(true);
           
      }
      public static void main(String a[])
      {
            new Demo();
      }
}