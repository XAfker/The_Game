package Gra.Interactive;

import Gra.Characters.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    JFrame window = new JFrame();
    JPanel titlebcg = new JPanel();
    JPanel startbtn = new JPanel();
    JPanel mainTxt = new JPanel();
    JPanel choiceBtnPan, p1Pan;
    JLabel titletxt = new JLabel("The Game");
    JLabel hpFld, hpAmount, handFld, handItem, pnamefld, pnameStr, enemyFld, enemyHPam;
    JButton startbtnclck = new JButton("Start your adventure");
    JButton choice1, choice2, choice3, choice4;
    Container cont = window.getContentPane();
    JTextArea mainArea = new JTextArea("Main text");
    ScreenGet getscreen = new ScreenGet();
    ChoiceGet getchoice = new ChoiceGet();
    Font fnt = new Font("Italic", Font.ITALIC, 150);
    Font deflt = new Font("Classic", Font.BOLD, 25);
    String position;
    Avatar P1;
    Monster enemy;



    public Menu(){
        window.setLayout(null);
        window.setSize(1700, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);

        titlebcg.setBounds(450, 50, 720, 220);
        titlebcg.setBackground(Color.cyan);

        cont.add(titlebcg);

        titletxt.setForeground(Color.magenta);

        titletxt.setFont(fnt);

        titlebcg.add(titletxt);

        startbtn.setBounds(650, 560, 300, 100);
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

        mainTxt.setBounds(90, 25, 1200, 300);
        mainTxt.setBackground(Color.lightGray);
        cont.add(mainTxt);

        mainArea.setBounds(90, 25, 1200, 300);
        mainArea.setBackground(Color.lightGray);
        mainArea.setForeground(Color.white);
        mainArea.setFont(deflt);
        mainArea.setLineWrap(true);
        mainTxt.add(mainArea);

        choiceBtnPan = new JPanel();
        choiceBtnPan.setBounds(25, 600, 1650, 200);
        choiceBtnPan.setBackground(Color.black);
        choiceBtnPan.setLayout(new GridLayout(4,1));
        cont.add(choiceBtnPan);

        choice1 = new JButton("Choice1");
        choice1.addActionListener(getchoice);
        choice1.setActionCommand("ch1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(deflt);
        choice1.setFocusPainted(false);
        choiceBtnPan.add(choice1);

        choice2 = new JButton("Choice2");
        choice2.addActionListener(getchoice);
        choice2.setActionCommand("ch2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(deflt);
        choice2.setFocusPainted(false);
        choiceBtnPan.add(choice2);

        choice3 = new JButton("Choice3");
        choice3.addActionListener(getchoice);
        choice3.setActionCommand("ch3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(deflt);
        choice3.setFocusPainted(false);
        choiceBtnPan.add(choice3);

        choice4 = new JButton("Choice4");
        choice4.addActionListener(getchoice);
        choice4.setActionCommand("ch4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(deflt);
        choice4.setFocusPainted(false);
        choiceBtnPan.add(choice4);

        p1Pan = new JPanel();
        p1Pan.setBounds(40, 370, 1400, 100);
        p1Pan.setBackground(Color.black);
        p1Pan.setLayout(new GridLayout(4,1));
        cont.add(p1Pan);

        pnamefld = new JLabel("Name: ");
        pnamefld.setFont(deflt);
        pnamefld.setForeground(Color.white);
        p1Pan.add(pnamefld);

        pnameStr = new JLabel();
        pnameStr.setFont(deflt);
        pnameStr.setForeground(Color.white);
        p1Pan.add(pnameStr);

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

        enemyFld = new JLabel("Enemy HP: ");
        enemyFld.setFont(deflt);
        enemyFld.setForeground(Color.white);
        p1Pan.add(enemyFld);

        enemyHPam = new JLabel();
        enemyHPam.setFont(deflt);
        enemyHPam.setForeground(Color.white);
        p1Pan.add(enemyHPam);

        gameStartInfo();

    }

        public void gameStartInfo(){
            position = "Start";

            mainArea.setText("What will be the name of your avatar?");

            choice1.setText("Continue");
            choice2.setText("");
            choice3.setText("");
            choice4.setText("");

//        java.util.Scanner avatarChoice = new java.util.Scanner(System.in);
//        String avatarChosenName = avatarChoice.nextLine();
//
//        choice1.setText("Ok " +avatarChosenName +", let's continue");

    }


    public void classSelect(){
        position = "Select";

        mainArea.setText("Now, select your class ");

        choice1.setText("Warrior, has the highest health and capacity to wield items, mediocre attack strength tho and not so good in avoiding getting hurt");
        choice2.setText("Assassin, well all around balanced with highest chance to dodge an attack");
        choice3.setText("Mage, not a lot of health and capacity but can deal a lot of damage and he has a chance to block an attack");
        choice4.setText("");

    }

    public void selectWarrior(){
        position = "Warrior";

        P1 = new Warrior("Warrior");
        setPlayerMenu(P1);

        mainArea.setText("Ah, I see, so you are a Warrior, grab your axe and come");

        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void selectAssassin(){
        position = "Assassin";

        P1 = new Assassin("Assassin");
        setPlayerMenu(P1);

        mainArea.setText("Ah, I see, so you are a Assassin, grab your daggers and come");

        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void selectMage(){
        position = "Mage";

        P1 = new Mage("Mage");
        setPlayerMenu(P1);

        mainArea.setText("Ah, I see, so you are a Mage, grab your stuff and come");

        choice1.setText("Continue");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void action(){
        position = "action";

        enemy = new Monster();

        enemyHPam.setText("" +enemy.getHealth());

        mainArea.setText("You have encountered a Monster, what do you do?");

        choice1.setText("Use item in your hand");
        choice2.setText("Switch item in your hand");

    }

    public void backpack(){
        position = "backpack";

        mainArea.setText("");

        choice1.setText(String.valueOf(P1.getBackpack()[0]));
        choice2.setText(String.valueOf(P1.getBackpack()[1]));
        choice3.setText(String.valueOf(P1.getBackpack()[2]));
    }

    public void setPlayerMenu(Avatar a){
        handItem.setText(a.getHand().toString());
        hpAmount.setText("" +a.getHealth());
        pnameStr.setText(a.toString());

    }

    public void zeroMenu(){
        handItem.setText("");
        hpAmount.setText("");
        pnameStr.setText("");
        enemyHPam.setText("");
    }

    public void playerDead(){
        position = "Dead";

        mainArea.setText("You are dead");

        choice1.setText("Play again!");
        choice2.setText("End your journey");
        choice3.setText("");
        choice4.setText("");
    }

    public void enemyDead(){
        position = "Win";

        mainArea.setText("You killed the monster");

        choice1.setText("Give me another one");
        choice2.setText("I want to end my journey");
        choice3.setText("");
        choice4.setText("");
    }



    public class ScreenGet implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            showGameScreen();
        }
    }
    public class ChoiceGet implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String choice = e.getActionCommand();

            switch (position){
                case "Start":
                    switch (choice){
                        case "ch1": classSelect();
                        break;
                        case "ch2": break;
                        case "ch3": break;
                        case "ch4": break;
                    }
                    break;
                case "Select":
                    switch (choice){
                        case "ch1": selectWarrior();
                        break;
                        case "ch2": selectAssassin();
                        break;
                        case "ch3": selectMage();
                        break;
                        case "ch4": break;
                    }
                    break;
                    case "Warrior", "Assassin", "Mage":
                    switch (choice) {
                        case "ch1": action();
                        break;
                        case "ch2": break;
                        case "ch3": break;
                        case "ch4": break;
                    }
                    break;
                case "action":
                    switch (choice) {
                        case "ch1":
                            if(P1.isAlive() && enemy.isAlive()) {
                                enemy.hurt(P1.attack());
                                P1.setHealth(P1.getHealth() - enemy.attack());
                                hpAmount.setText("" + P1.getHealth());
                                enemyHPam.setText("" + enemy.getHealth());
                                break;
                            }
                            else if(!P1.isAlive()){
                                playerDead();
                                break;
                            }
                            else {
                                enemyDead();
                                break;
                            }
                        case "ch2": backpack();
                        case "ch3": break;
                        case "ch4": break;
                    }
                    break;
                case "backpack":
                    switch (choice){
                        case "ch1":
                            P1.setHand(P1.getBackpack()[0]);
                            break;
                        case "ch2":
                            P1.setHand(P1.getBackpack()[1]);
                            break;
                        case "ch3":
                            P1.setHand(P1.getBackpack()[2]);
                            break;
                        case "ch4": break;
                    }
                    break;
                case "Dead":
                    switch (choice) {
                        case "ch1":
                            zeroMenu();
                            gameStartInfo();
                            break;
                        case "ch2":
                            System.exit(0);
                            break;
                        case "ch3": break;
                        case "ch4": break;
                    }
                    break;
                case "Win":
                    switch (choice) {
                        case "ch1":
                            action();
                            break;
                        case "ch2":
                            System.exit(0);
                            break;
                        case "ch3": break;
                        case "ch4": break;
                    }
                    break;
            }
        }
    }

}
