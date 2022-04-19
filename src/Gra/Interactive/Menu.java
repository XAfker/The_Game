package Gra.Interactive;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    JFrame window = new JFrame();
    JPanel titlebcg = new JPanel();
    JLabel titletxt = new JLabel("The Game");
    Font fnt = new Font("Italic", Font.ITALIC, 150);
    JPanel startbtn = new JPanel();
    Font deflt = new Font("Classic", Font.BOLD, 25);
    JButton startbtnclck = new JButton("Start your adventure");
    Container cont = window.getContentPane();
    JPanel mainTxt = new JPanel();
    JTextArea mainArea = new JTextArea("Main text");
    JPanel choiceBtnPan, p1Pan;
    JButton choice1, choice2, choice3, choice4;
    ScreenGet getscreen = new ScreenGet();
    JLabel hpFld, hpAmount, handFld, handItem;
    double playerHP;
    String hand;


    public Menu(){
        window.setLayout(null);
        window.setSize(1200, 850);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);

        titlebcg.setBounds(150, 50, 720, 220);
        titlebcg.setBackground(Color.cyan);

        cont.add(titlebcg);

        titletxt.setForeground(Color.magenta);

        titletxt.setFont(fnt);

        titlebcg.add(titletxt);

        startbtn.setBounds(360, 500, 300, 100);
        startbtn.setBackground(Color.black);
        cont.add(startbtn);

        startbtnclck.setBackground(Color.cyan);
        startbtnclck.setForeground(Color.magenta);
        startbtnclck.setFont(deflt);
        startbtn.add(startbtnclck);
        startbtnclck.setFocusPainted(false);
        startbtnclck.addActionListener(getscreen);

        window.setVisible(true);
    }


    public void showGameScreen(){

        titlebcg.setVisible(false);
        startbtn.setVisible(false);

        mainTxt.setBounds(40, 25, 720, 300);
        mainTxt.setBackground(Color.lightGray);
        cont.add(mainTxt);

        mainArea.setBounds(200, 200, 720, 400);
        mainArea.setBackground(Color.lightGray);
        mainArea.setForeground(Color.white);
        mainArea.setFont(deflt);
        mainArea.setLineWrap(true);
        mainTxt.add(mainArea);

        choiceBtnPan = new JPanel();
        choiceBtnPan.setBounds(50, 500, 1100, 200);
        choiceBtnPan.setBackground(Color.black);
        choiceBtnPan.setLayout(new GridLayout(4,1));
        cont.add(choiceBtnPan);

        choice1 = new JButton("Choice1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(deflt);
        choice1.setFocusPainted(false);
        choiceBtnPan.add(choice1);

        choice2 = new JButton("Choice2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(deflt);
        choice2.setFocusPainted(false);
        choiceBtnPan.add(choice2);

        choice3 = new JButton("Choice3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(deflt);
        choice3.setFocusPainted(false);
        choiceBtnPan.add(choice3);

        choice4 = new JButton("Choice4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(deflt);
        choice4.setFocusPainted(false);
        choiceBtnPan.add(choice4);

        p1Pan = new JPanel();
        p1Pan.setBounds(40, 370, 900, 50);
        p1Pan.setBackground(Color.black);
        p1Pan.setLayout(new GridLayout(1,4));
        cont.add(p1Pan);

        hpFld = new JLabel("Hp: ");
        hpFld.setFont(deflt);
        hpFld.setForeground(Color.white);
        p1Pan.add(hpFld);

        hpAmount = new JLabel();
        hpAmount.setFont(deflt);
        hpAmount.setForeground(Color.white);
        p1Pan.add(hpAmount);

        handFld = new JLabel("In hand: ");
        handFld.setFont(deflt);
        handFld.setForeground(Color.white);
        p1Pan.add(handFld);

        handItem = new JLabel();
        handItem.setFont(deflt);
        handItem.setForeground(Color.white);
        p1Pan.add(handItem);

        classSelect();

    }

//    public void setPlayerMenu(double hp, String chhand){
//       playerHP = hp;
//       hand = chhand;
//       handItem.setText(hand);
//       hpAmount.setText("" +playerHP);
//    }

//    public void gameStartInfo(){
//        mainArea.setText("What will be the name of your avatar?");
//        java.util.Scanner avatarChoice = new java.util.Scanner(System.in);
//        String avatarChosenName = avatarChoice.nextLine();
//
//        choice1.setText();
//    }

    public void classSelect(){
        mainArea.setText("Now, select your class ");

        choice1.setText("Warrior, has the highest health and capacity to wield items, mediocre attack strength tho and not so good in avoiding getting hurt");
        choice2.setText("Assassin, well all around balanced with highest chance to dodge an attack");
        choice3.setText("Mage, not a lot of health and capacity but can deal a lot of damage and he has a chance to block an attack");
        choice4.setText("");
    }



    public class ScreenGet implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            showGameScreen();
        }
    }

}
