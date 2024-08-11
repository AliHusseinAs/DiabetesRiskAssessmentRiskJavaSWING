import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

class myTest extends JFrame implements ActionListener
{
    private int x = 1200;
    private int y = 750;
    static JLabel label;
    static JPanel panel;
    static JPanel panel2;
    static JTextField textOne;
    static JButton testButton;
    static JLabel resultLabel;
    static ImageIcon image;
    static JLabel label2;
    static JLabel flagLabel;
    static JLabel age;
    static JTextField textTwo;
    static JTextField textThree;
    static JTextField textFour;
    static JTextField textFive;
    static JTextField textSix;
    static JTextField textSeven;
    static JLabel sex;
    static JLabel family;
    static JLabel waist;
    static JLabel weight;
    static JLabel height;
    static JLabel blood;
    static JButton resultButton;
    static JLabel errorMessage;
    boolean hasInvalidInput;
    boolean hasInvalidInput2;
    boolean hasInvalidInput3;
    static ImageIcon resultImage;
    static JLabel resultText;
    static JLabel resultText2;
    static JLabel seeDoctor;
    int ageScore;
    int sexScore;
    int waistScore;
    int familyScore;
    int bloodScore;
    int bmiScore;
    myTest()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(x,y);
        this.setLayout(null);
        this.setResizable(false);
        getPanel();
        textFieldOne();
        getButton();
        getResultButton();
        this.getContentPane().add(panel2);
        this.getContentPane().add(panel);
        this.getContentPane().add(textOne);
        this.getContentPane().add(testButton);
        this.getContentPane().add(resultButton);
        this.getContentPane().add(resultLabel);
        this.getContentPane().add(resultText);
        this.getContentPane().add(resultText2);
        this.getContentPane().add(label2);
        this.getContentPane().add(age);
        this.getContentPane().add(textTwo);
        this.getContentPane().add(textThree);
        this.getContentPane().add(textFour);
        this.getContentPane().add(textFive);
        this.getContentPane().add(textSix);
        this.getContentPane().add(textSeven);
        this.getContentPane().add(sex);
        this.getContentPane().add(family);
        this.getContentPane().add(waist);
        this.getContentPane().add(weight);
        this.getContentPane().add(height);
        this.getContentPane().add(blood);
        this.getContentPane().add(errorMessage);
        this.getContentPane().add(resultLabel);
        this.getContentPane().add(seeDoctor);
        this.setVisible(true);
    }
    public void getPanel()
    {
        panel = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel("Please answer carefully and accuratly to get the most accurate result");
        label2.setForeground(Color.black);
        label2.setBounds(130,90,750,100); // here 
        label2.setFont(new Font("comic sans",Font.BOLD,20));
        panel.add(label2);
        panel2.setBackground(new Color(0,0,152));
        panel2.setBounds(0,0,1200,120);
        panel.setBounds(0,0,120,900);
        panel.setBackground(new Color(0,0,153));
    }
    public void textFieldOne()
    {
        age = new JLabel("Enter your age");
        sex = new JLabel("Enter your sex");
        family = new JLabel("Do you have a family of type 2 DM");
        waist = new JLabel("Enter your waist circumference");
        weight = new JLabel("Enter your weight");
        height = new JLabel("Enter your height in meter");
        blood = new JLabel("Do you use Anti-hypertensive");
        errorMessage = new JLabel();
        errorMessage.setForeground(Color.red);
        errorMessage.setFont(new Font("comic sans",Font.BOLD,20));
        errorMessage.setBounds(800,250,250,250);
        errorMessage.setVisible(false);
        age.setBounds(200,250,250,40);
        age.setForeground(Color.black);
        age.setFont(new Font("comic sans",Font.PLAIN,17));
        sex.setBounds(200,300,300,40);
        sex.setForeground(Color.black);
        sex.setFont(new Font("comic sans",Font.PLAIN,17));
        family.setBounds(200,350,300,40);
        family.setForeground(Color.black);
        family.setFont(new Font("comic sans",Font.PLAIN,17));
        waist.setBounds(200,400,300,40);
        waist.setForeground(Color.black);
        waist.setFont(new Font("comic sans",Font.PLAIN,17));
        weight.setBounds(200,450,300,40);
        weight.setForeground(Color.black);
        weight.setFont(new Font("comic sans",Font.PLAIN,17));
        height.setBounds(200,500,300,40);
        height.setForeground(Color.black);
        height.setFont(new Font("comic sans",Font.PLAIN,17));
        blood.setBounds(200,550,300,40);
        blood.setForeground(Color.black);
        blood.setFont(new Font("comic sans",Font.PLAIN,17));
        textOne = new JTextField();
        textTwo = new JTextField();
        textThree = new JTextField();
        textFour = new JTextField();
        textFive = new JTextField();
        textSix = new JTextField();
        textSeven = new JTextField();
        textOne.setPreferredSize(new Dimension(100,100));
        textTwo.setPreferredSize(new Dimension(100,100));
        textThree.setPreferredSize(new Dimension(100,100));
        textFour.setPreferredSize(new Dimension(100,100));
        textFive.setPreferredSize(new Dimension(100,100));
        textSix.setPreferredSize(new Dimension(100,100));
        textSeven.setPreferredSize(new Dimension(100,100));
        textOne.setBounds(500,250,250,40);
        textTwo.setBounds(500,300,250,40);
        textThree.setBounds(500,350,250,40);
        textFour.setBounds(500,400,250,40);
        textFive.setBounds(500,450,250,40);
        textSix.setBounds(500,500,250,40);
        textSeven.setBounds(500,550,250,40);
        age.setBounds(200,250,120,40);
        age.setForeground(Color.black);
        age.setFont(new Font("comic sans",Font.PLAIN,17));
    }
    public void getButton()
    {
        testButton = new JButton();
        resultLabel = new JLabel();
        resultText = new JLabel();
        resultText2 = new JLabel();
        seeDoctor = new JLabel();
        testButton.setBounds(250,250,200,200);
        testButton.setFocusable(true);
        testButton.addActionListener(this);
        testButton.setVisible(false);
        resultLabel.setBounds(910,200,200,200);
        resultLabel.setFont(new Font("comic sans",Font.PLAIN,30));
        resultLabel.setVisible(false);
        resultText.setBounds(900,250,200,200);
        resultText.setFont(new Font("comic sans",Font.BOLD,20));
        resultText.setVisible(false);
        resultText2.setBounds(780,280,450,200);
        resultText2.setFont(new Font("comic sans",Font.PLAIN,15));
        resultText2.setVisible(false);
        seeDoctor.setBounds(850,305,450,200);
        seeDoctor.setFont(new Font("comic sans",Font.ITALIC,20));
        seeDoctor.setForeground(Color.red);
        seeDoctor.setVisible(false);
        // testButton.add(resultText);
        // testButton.add(resultLabel);

    }
    public void getResultButton()
    {
        resultButton = new JButton("Get Score");
        resultButton.setBounds(500,600,200,40);
        resultButton.setFocusable(false);
        resultButton.addActionListener(this);
        resultButton.add(errorMessage);
        resultButton.add(resultText2);
        resultButton.add(resultText);
        resultButton.add(resultLabel);
        resultButton.add(seeDoctor);
    }
    public int getBmi()
    {
        bmiScore = 0;
        String weightString = textFive.getText();
        double w = Double.parseDouble(weightString);
        String heightString = textSix.getText();
        double h = Double.parseDouble(heightString);
        double bmi = w / (h*h);
        if(bmi < 25)
        {
            bmiScore +=0;
        }
        else if(bmi >= 25 && bmi <= 29)
        {
            bmiScore +=3;
        }
        else if(bmi >= 30 && bmi <= 34)
        {
            bmiScore +=5;
        }
        else if(bmi >= 35)
        {
            bmiScore +=8;
        }
        return bmiScore;
        
    }

    public int getSex()
    {
        sexScore = 0;
        String sexString = textTwo.getText().toLowerCase();
        try
        {
            if(sexString.equals("male"))
            {
                sexScore +=0;
            }
            else if(sexString.equals("female"))
            {
                sexScore +=1;
            }
            else 
            {
                throw new Exception("ERROR");
            }
        }
        catch (Exception e)
        {
            hasInvalidInput = true;

        }
        return sexScore;
    }
    public int getAge()
    {
        ageScore = 0;
        String ageString = textOne.getText();
        int scoreForAge = Integer.parseInt(ageString);
        if(scoreForAge >= 40 && scoreForAge <= 49)
        {
            ageScore +=0;
        }
        else if(scoreForAge >= 50 && scoreForAge <= 59)
        {
            ageScore +=5;
        }
        else if(scoreForAge >= 60 && scoreForAge <= 69)
        {
            ageScore +=9;
        }
        else if(scoreForAge >= 70)
        {
            ageScore +=13;
        }
        return ageScore;
    }
    public int getWaist()
    {
        waistScore = 0;
        String waistscore = textFour.getText();
        int scoreforwaist = Integer.parseInt(waistscore);
        if(scoreforwaist < 90)
        {
            waistScore +=0;
        }
        else if(scoreforwaist >= 90 && scoreforwaist <= 99)
        {
            waistScore +=4;
        }
        else if(scoreforwaist >= 100 && scoreforwaist <= 109)
        {
            waistScore +=6;
        }
        else if(scoreforwaist >= 110)
        {
            waistScore +=9;
        }
        return waistScore;
    }
    public int familyHistory()
    {
        familyScore +=0;
        String familyResponse = textThree.getText().toLowerCase();
        try
        {
            if(familyResponse.equals("yes"))
            {
                familyScore +=5;
            }
            else if(familyResponse.equals("no"))
            {
                familyScore +=0;
            }
            else
            {
                throw new Exception("Error");
            }
        }
        catch (Exception es)
        {
            hasInvalidInput2 = true;   
        }
        return familyScore;
    }
    public int bloodAsk()
    {
        bloodScore = 0;
        String bloodRes = textSeven.getText().toLowerCase();
        try
        {
            if(bloodRes.equals("yes"))
            {
                bloodScore +=0;
            }
            else if(bloodRes.equals("no"))
            {
                bloodScore +=5;
            }
            else
            {
                throw new Exception("Error");
            }
        }
        catch(Exception es2)
        {
            hasInvalidInput3 = true;
        }
        return bloodScore;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == resultButton)
        {
            int scoreForSex = getSex();
            int bmiScore = getBmi();
            int ageTotalScore = getAge();
            int totalWaistScore = getWaist();
            int totalFamily = familyHistory();
            int totalBlood = bloodAsk();
            int total = bmiScore + scoreForSex + ageTotalScore + totalWaistScore + totalFamily + totalBlood;
            if(hasInvalidInput)
            {
                System.out.println("ERROR");
                errorMessage.setText("ERROR, try again");
                errorMessage.setVisible(true);
                hasInvalidInput = false;
            }
            else if(hasInvalidInput2)
            {
                System.out.println("Error2");
                errorMessage.setText("Error, try again");
                errorMessage.setVisible(true);
                hasInvalidInput2 = false;
            }
            else if(hasInvalidInput3)
            {
                System.out.println("Error2");
                errorMessage.setText("Error, try again");
                errorMessage.setVisible(true);
                hasInvalidInput3 = false;
            }
            if(total == 0)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("zero.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very Low Risk");
                resultText.setVisible(true);
                resultText2.setText("1% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                
            }
            else if(total == 1)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("one.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very Low Risk");
                resultText.setVisible(true);
                resultText2.setText("1% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 2)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("two.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very Low Risk");
                resultText.setVisible(true);
                resultText2.setText("1% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 3)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("three.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very Low Risk");
                resultText.setVisible(true);
                resultText2.setText("1% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 4)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("four.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very Low Risk");
                resultText.setVisible(true);
                resultText2.setText("1% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 5)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("five.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very Low Risk");
                resultText.setVisible(true);
                resultText2.setText("1% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 6)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("six.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very Low Risk");
                resultText.setVisible(true);
                resultText2.setText("1% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 7)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("seven.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Low risk");
                resultText.setVisible(true);
                resultText2.setText("4% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 8)
            {
                System.out.println("Resul 8");
                resultImage = new ImageIcon("eight.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Low risk");
                resultText.setVisible(true);
                resultText2.setText("4% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 9)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("nine.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Low risk");
                resultText.setVisible(true);
                resultText2.setText("4% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 10)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("ten.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Low risk");
                resultText.setVisible(true);
                resultText2.setText("4% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 11)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("eleven.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Low risk");
                resultText.setVisible(true);
                resultText2.setText("4% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 12)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twelve.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Moderate Risk");
                resultText.setVisible(true);
                resultText2.setText("17% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 13)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("thirteen.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Moderate Risk");
                resultText.setVisible(true);
                resultText2.setText("17% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 14)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("fourteen.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Moderate Risk");
                resultText.setVisible(true);
                resultText2.setText("17% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
            }
            else if(total == 15)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("fifteen.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 16)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("sixteen.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 17)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("seventeen.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 18)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("eighteen.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 19)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("nineteen.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 20)
            {  
                System.out.println("Result");
                resultImage = new ImageIcon("twenty.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 21)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentyone.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("Very High Risk");
                resultText.setVisible(true);
                resultText2.setText("50% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 22)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentytwo.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 23)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentythree.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 24)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentyfour.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 25)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentyfive.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 26)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentysix.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 27)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentyseven.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 28)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentyeight.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 29)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("twentynine.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
            else if(total == 30)
            {
                System.out.println("Result");
                resultImage = new ImageIcon("thirty.png");
                resultLabel.setIcon(resultImage);
                resultLabel.setVisible(true);
                resultText.setText("High Risk");
                resultText.setVisible(true);
                resultText2.setText("33% chance of developing diabetes within 10 years");
                resultText2.setVisible(true);
                seeDoctor.setText("Please Consult A Doctor");
                seeDoctor.setVisible(true);
            }
        }
    }
}

class myWindow implements ActionListener

{
    JFrame frame2;
    static JPanel newPanel;
    static JLabel newLabel2;
    static JLabel logoLabel;
    static JPanel secondPanel;
    static JTextField text;
    static JButton button2;
    static JLabel resultL;
    static JLabel resultL2;
    static JLabel nameField;
    static JLabel surnameField;
    static JTextField text1;
    static JButton button3;
    static JButton button4;
    static int x = 1000;
    static int y = 750;
    myWindow()
    {
        frame2 = new JFrame();
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(x,y);
        frame2.setLayout(null);
        frame2.setResizable(false);
        getNewPanel();
        getSecondPanel();
        getTextFields();
        getTextFields2();
        resultLabel();
        goextpage();
        frame2.getContentPane().add(newLabel2);
        frame2.getContentPane().add(logoLabel);
        frame2.getContentPane().add(newPanel);
        frame2.getContentPane().add(nameField);
        frame2.getContentPane().add(surnameField);
        frame2.getContentPane().add(secondPanel);
        frame2.getContentPane().add(button4);
        frame2.getContentPane().add(button2);
        frame2.getContentPane().add(text);
        frame2.getContentPane().add(resultL);
        frame2.getContentPane().add(text1);
        frame2.getContentPane().add(resultL2);
        frame2.setVisible(true); // last one 
    }
    public void getNewPanel()
    {
        newPanel = new JPanel();
        newPanel.setBounds(0,0,1000,120);
        newPanel.setBackground(new Color(0,0,153));
        getText();
        newPanel.add(newLabel2);
        getLogo();
        newPanel.add(logoLabel);

    }
    public void getLogo()
    {
        logoLabel = new JLabel();
        ImageIcon blood = new ImageIcon("blood.png");
        logoLabel.setIcon(blood);
        logoLabel.setBounds(0,0,140,140);

    }
    public void getText()
    {
        newLabel2 = new JLabel("Please fill the underlying boxs");
        newLabel2.setForeground(Color.black);
        newLabel2.setBounds(350,100,550,100);
        newLabel2.setFont(new Font("comic sans",Font.BOLD,20));
    }
    public void getSecondPanel()
    {
        secondPanel = new JPanel();
        secondPanel.setBounds(0,0,120,900);
        secondPanel.setBackground(new Color(0,0,153));
    }

    public void getTextFields()
    {
        text = new JTextField();
        nameField = new JLabel("your name ");
        nameField.setForeground(Color.black);
        nameField.setFont(new Font("comic sans",Font.PLAIN,15));
        nameField.setBounds(295,250,110,40);
        surnameField = new JLabel("your surname");
        surnameField.setForeground(Color.black);
        surnameField.setFont(new Font("comic sans",Font.PLAIN,15));
        surnameField.setBounds(270,290,110,40);
        button2 = new JButton("submit");
        button2.setBounds(477,350,120,40);
        button2.setFocusable(false);
        button2.addActionListener(this);
        text.add(button2);
        text.setBounds(380,250,350,40);
        text.setPreferredSize(new Dimension(100,100));
    }
    public void getTextFields2() // 2nd textfield 
    {
        text1 = new JTextField();
        text1.setBounds(380,290,350,40);
        text1.setPreferredSize(new Dimension(100,100));
    }
    public void resultLabel()
    {
        resultL = new JLabel();
        resultL2 = new JLabel();
        resultL2.setBounds(310,430,600,100);
        resultL2.setForeground(Color.black);
        resultL2.setFont(new Font("comic sans",Font.PLAIN,15));
        resultL2.setVisible(false);
        resultL.setBounds(400,305,500,200);
        resultL.setFont(new Font("comic sans",Font.PLAIN,15));
        resultL.setForeground(Color.black);
    }
    public String add()
    {
        String name = text.getText();
        String surname = text1.getText();
        String fullName = " " + name +" " +  surname;
        return fullName;
        
    }
    public void goextpage()
    {
        button4 = new JButton();
        button4.setText("Go next page");
        button4.addActionListener(this);
        button4.setBounds(477,420,120,40);
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button2)
        {
            String greed = add();
            resultL.setText("welcome" + greed + " to the diabetes assessment test");
            button4.setVisible(true);
            resultL2.setVisible(true);
            resultL2.setText("please press the above button to start the test when you are ready");
        }
        if(e.getSource() == button4)
        {
            new myTest();
            frame2.dispose();
        }

    }
    
}

class myFrame extends JFrame implements ActionListener
{
    static JLabel label;
    static JLabel label4;
    static JLabel label2;
    static ImageIcon flag;
    static JButton button;
    static JLabel label3;
    static JPanel panel;
    private int x = 900;
    private int y = 750;
    myFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(x,y);
        this.setLayout(null);
        this.setResizable(false);
        getSecondLabel();
        getLabel();
        getThirdLabel();
        getFourthLabel();
        getButton();
        getPanel();
        this.setLayout(null);
        this.getContentPane().add(label2);
        this.getContentPane().add(label);
        this.getContentPane().add(label3);
        this.getContentPane().add(label4);
        this.getContentPane().add(button);
        this.getContentPane().add(panel);
        this.setVisible(true);
    }

    public void getLabel()
    {
        label = new JLabel();
        ImageIcon flag = new ImageIcon("finland.png");
        label.setIcon(flag);
        label.setBounds(345,0,300,200);
    }
    public void getSecondLabel()
    {
        label2 = new JLabel();
        label2.setText("Diabetes assessment test follows Finnish guidlines");
        label2.setForeground(Color.black);
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.CENTER);
        label2.setFont(new Font("MV Boli" ,Font.BOLD,18));
        label2.setBounds(180,0,500,450);
    }
    public void getThirdLabel()
    {
        label3 = new JLabel();
        label3.setText("In case you do not know the answers, please consult your doctor first");
        label3.setForeground(Color.black);
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.CENTER);
        label3.setFont(new Font("MV Boli" ,Font.BOLD,18));
        label3.setBounds(120,60,650,450);
    }
    public void getFourthLabel()
    {
        label4 = new JLabel();
        label4.setText("Please answer all questions with accurate informations");
        label4.setForeground(Color.black);
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setVerticalTextPosition(JLabel.CENTER);
        label4.setFont(new Font("MV Boli" ,Font.BOLD,18));
        label4.setBounds(160,30,550,450);
    }

    public void getButton()
    {
        button = new JButton("Click to start the test");
        button.setFocusable(false);
        button.setOpaque(true);
        button.setBounds(350,330,150,40);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.addActionListener(this);
    }
    public void getPanel()
    {
        panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(0,0,1000,320);
        getButton();
        getFourthLabel();
        getThirdLabel();
        getSecondLabel();
        getLabel();
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == button)
        {
            new myWindow();
            this.dispose();
        }
    }
}

public class firstWindow

{
    public static void main(String[] args)
    {   
        new myFrame();
    }
}