package nov07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Quiz {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Alegeti raspunsl corect");
		frame.setSize(750, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();    
		frame.add(panel);
		placeComponents(panel);
		frame.setVisible(true);
	}

	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel titleLabel = new JLabel("TEST DE CULTURA GENERALA - GEOGRAFIE");
		titleLabel.setBounds(150,10,300,25);
		panel.add(titleLabel);

		JLabel firstQuestionLabel = new JLabel("1.Care este capitala Italiei?  ");
		firstQuestionLabel.setBounds(10,40,300,25);
		panel.add(firstQuestionLabel);

		JRadioButton q1answ1 = new JRadioButton("a) Berlin");
		q1answ1.setBounds(10,60,80,25);
		//answ1.setSelected(true);
		panel.add(q1answ1);

		JRadioButton q1answ2 = new JRadioButton("b) Berna");
		q1answ2.setBounds(10,80,80,25);
		//answ2.setSelected(false);
		panel.add(q1answ2);

		JRadioButton q1answ3 = new JRadioButton("c) Praga");
		q1answ3.setBounds(10,100,80,25);
		//answ3.setSelected(false);
		panel.add(q1answ3);

		JRadioButton q1answ4= new JRadioButton("d) Roma");
		q1answ4.setBounds(10,120,80,25);
		//answ4.setSelected(false);
		panel.add(q1answ4);



		JLabel secondQuestionLabel = new JLabel("2.Ce inaltime are Everestul? ");
		secondQuestionLabel.setBounds(10,150,200,25);
		panel.add(secondQuestionLabel);

		JRadioButton q2answ1 = new JRadioButton("a) 1.202 m");
		q2answ1.setBounds(10,170,200,25);
		//answ1.setSelected(true);
		panel.add(q2answ1);

		JRadioButton q2answ2 = new JRadioButton("b) 2.544 m");
		q2answ2.setBounds(10,190,200,25);
		//answ2.setSelected(false);
		panel.add(q2answ2);

		JRadioButton q2answ3 = new JRadioButton("c) 8.848 m");
		q2answ3.setBounds(10,210,200,25);
		//answ3.setSelected(false);
		panel.add(q2answ3);

		JRadioButton q2answ4= new JRadioButton("d) 4.808 m");
		q2answ4.setBounds(10,230,200,25);
		//answ4.setSelected(false);
		panel.add(q2answ4);



		JLabel thirdQuestionLabel = new JLabel("3.Prin cate orase capitala traverseaza Dunarea? ");
		thirdQuestionLabel.setBounds(10,260,400,25);
		panel.add(thirdQuestionLabel);

		JRadioButton q3answ1 = new JRadioButton("a) 4");
		q3answ1.setBounds(10,280,80,25);
		//answ1.setSelected(true);
		panel.add(q3answ1);

		JRadioButton q3answ2 = new JRadioButton("b) 5");
		q3answ2.setBounds(10,300,80,25);
		//answ2.setSelected(false);
		panel.add(q3answ2);

		JRadioButton q3answ3 = new JRadioButton("c) 11");
		q3answ3.setBounds(10,320,80,25);
		//answ3.setSelected(false);
		panel.add(q3answ3);

		JRadioButton q3answ4= new JRadioButton("d) 1");
		q3answ4.setBounds(10,340,80,25);
		//answ4.setSelected(false);
		panel.add(q3answ4);



		JLabel fourthQuestionLabel = new JLabel("4.Care este cel mai mare continent? ");
		fourthQuestionLabel.setBounds(10,370,400,25);
		panel.add(fourthQuestionLabel);

		JRadioButton q4answ1 = new JRadioButton("q) Asia");
		q4answ1.setBounds(10,390,80,25);
		//answ1.setSelected(true);
		panel.add(q4answ1);

		JRadioButton q4answ2 = new JRadioButton("b) America de Nord");
		q4answ2.setBounds(10,410,200,25);
		//answ2.setSelected(false);
		panel.add(q4answ2);

		JRadioButton q4answ3 = new JRadioButton("c) Africa");
		q4answ3.setBounds(10,430,80,25);
		//answ3.setSelected(false);
		panel.add(q4answ3);

		JRadioButton q4answ4= new JRadioButton("d) Europa");
		q4answ4.setBounds(10,450,80,25);
		//answ4.setSelected(false);
		panel.add(q4answ4);



		JLabel fifthQuestionLabel = new JLabel("5.Care este cel mai mare ocean? ");
		fifthQuestionLabel.setBounds(10,480,400,25);
		panel.add(fifthQuestionLabel);

		JRadioButton q5answ1 = new JRadioButton("a) Oceanul Arctic");
		q5answ1.setBounds(10,500,200,25);
		//answ1.setSelected(true);
		panel.add(q5answ1);

		JRadioButton q5answ2 = new JRadioButton("b) Oceanul Indian");
		q5answ2.setBounds(10,520,200,25);
		//answ2.setSelected(false);
		panel.add(q5answ2);

		JRadioButton q5answ3 = new JRadioButton("c) Oceanul Pacific");
		q5answ3.setBounds(10,540,200,25);
		//answ3.setSelected(false);
		panel.add(q5answ3);

		JRadioButton q5answ4 = new JRadioButton("d) Oceanul Atlantic");
		q5answ4.setBounds(10,560,200,25);
		//answ4.setSelected(false);
		panel.add(q5answ4);


		JButton resultsButton = new JButton("Trimiteti rezultatele");
		resultsButton.setBounds(150, 600, 200, 25);
		panel.add(resultsButton);


		resultsButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				JFrame frame1 = new JFrame("Raspunsuri:");
				frame1.setSize(600, 600);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setVisible(true);

				JPanel panel1 = new JPanel();    
				panel1.setLayout(null);
				frame1.add(panel1);
				
				
				int sumIncorrect=0;
				int sumCorrect=0;
				float percentage;
				String choice1;
				
				if (q1answ4.isSelected()) {
					choice1 = "Felicitari! Raspunsul este corect!";
					sumCorrect++;}
				else {
					choice1 = "Gresit! Raspunsul corect era: d) Roma";
					sumIncorrect++;}

				JLabel choice1Label = new JLabel("Question1: "+choice1);
				choice1Label.setBounds(10,50,800,25);
				panel1.add(choice1Label);


				String choice2;
				if (q2answ3.isSelected()) {
					choice2 = "Felicitari! Raspunsul este corect!";
					sumCorrect++;}

				else {
					choice2 = "Gresit! Raspunsul corect era: c) 8.848 m";
					sumIncorrect++;}

				JLabel choice2Label = new JLabel("Question2: "+choice2);
				choice2Label.setBounds(10,80,800,25);
				panel1.add(choice2Label);


				String choice3;
				if (q3answ1.isSelected()) {
					choice3 = "Felicitari! Raspunsul este corect!";
					sumCorrect++;}
				else {
					choice3 = "Gresit! Raspunsul corect era: a) 4 (Viena, Bratislava, Belgrad si Budapesta)";
					sumIncorrect++;}

				JLabel choice3Label = new JLabel("Question3: "+choice3);
				choice3Label.setBounds(10,110,1000,25);
				panel1.add(choice3Label);


				String choice4;
				if (q4answ1.isSelected()) {
					choice4 = "Felicitari! Raspunsul este corect!";
					sumCorrect++;}
				else {
					choice4 = "Gresit! Raspunsul corect era: a) Asia";
					sumIncorrect++;}

				JLabel choice4Label = new JLabel("Question4: "+choice4);
				choice4Label.setBounds(10,140,500,25);
				panel1.add(choice4Label);


				String choice5;
				if (q5answ3.isSelected()) {
					choice5 = "Felicitari! Raspunsul este corect!";
					sumCorrect++;}
				else {
					choice5 = "Gresit! Raspunsul corect era: c) Oceanul Pacific";
					sumIncorrect++;}

				JLabel choice5Label = new JLabel("Question5: "+choice5);
				choice5Label.setBounds(10,170,500,25);
				panel1.add(choice5Label);


				JLabel totalCorrectLabel = new JLabel("Raspunsuri corecte: "+sumCorrect);
				totalCorrectLabel.setBounds(10,200,500,25);
				panel1.add(totalCorrectLabel);

				JLabel totalIncorrectLabel = new JLabel("Raspunsuri incorecte: "+sumIncorrect);
				totalIncorrectLabel.setBounds(10,230,500,25);
				panel1.add(totalIncorrectLabel);
				
				percentage=(float)(sumCorrect*100)/5;
				
				JLabel percentageLabel = new JLabel("Procentaj raspunsuri corecte: " +percentage+"%");
				percentageLabel.setBounds(10,260,500,25);
				panel1.add(percentageLabel);
		
		
		}
	});
}
}
