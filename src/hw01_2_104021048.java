import java.awt.*;
import java.awt.event.*;

public class hw01_2_104021048 extends Frame {
	private Label name = new Label("�m�W: ");
	private Label hight = new Label("����: ");
	private Label weight = new Label("�魫: ");
	private Label sex = new Label("�ʧO: ");
	private Label waistline = new Label("�y��: ");
	private TextField name1 = new TextField();
	private TextField hight1 = new TextField();
	private TextField weight1 = new TextField();
	private TextField sex1 = new TextField();
	private TextField waistline1 = new TextField();
	private Button count = new Button("�p��");
	private Button exit = new Button("����");
	private TextArea show = new TextArea();

	public hw01_2_104021048() {
		initComp();
	}

	private void initComp() {
		CheckboxGroup gp = new CheckboxGroup();
		final Checkbox boy = new Checkbox("�k", gp, true);
		final Checkbox girl = new Checkbox("�k", gp, true);
		this.setLayout(null);
		this.setBounds(350, 400, 500, 500);
		this.setBackground(Color.lightGray);
		this.setTitle("BMI Computing");
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		name.setBounds(20, 50, 40, 25);
		hight.setBounds(20, 75, 40, 25);
		weight.setBounds(20, 100, 40, 25);
		sex.setBounds(200, 50, 40, 25);
		waistline.setBounds(200, 75, 40, 25);
		name1.setBounds(60, 50, 120, 25);
		hight1.setBounds(60, 75, 120, 25);
		weight1.setBounds(60, 100, 120, 25);
		boy.setBounds(260, 50, 30, 25);
		girl.setBounds(300, 50, 30, 25);
		waistline1.setBounds(240, 75, 120, 25);
		count.setBounds(380, 75, 100, 25);
		count.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent m) {
				String n1 = name1.getText();
				String h1 = hight1.getText();
				String w1 = weight1.getText();
				String wa1 = waistline1.getText();
				double h2 = Integer.parseInt(h1);
				double w2 = Integer.parseInt(w1);
				double wa2 = Integer.parseInt(wa1);
				double bmi = w2 / ((h2 / 100) * (h2 / 100));
				boolean b = boy.getState();
				boolean g = girl.getState();
				if (bmi < 18.5) {
					show.append(n1 + ",�z�n\n" + "BMI= " + bmi + "�A�ݩ��魫�L��");
				} else if (18.5 < bmi && bmi < 24) {
					show.append(n1 + ",�z�n\n" + "BMI= " + bmi + "�A�ݩ󰷱d���");
				} else if (24 <= bmi && bmi < 27) {
					show.append(n1 + ",�z�n\n" + "BMI= " + bmi + "�A�ݩ�L��");
				} else if (27 <= bmi && bmi < 30) {
					show.append(n1 + ",�z�n\n" + "BMI= " + bmi + "�A�ݩ󻴫תέD");
				} else if (30 <= bmi && bmi < 35) {
					show.append(n1 + ",�z�n\n" + "BMI= " + bmi + "�A�ݩ󤤫תέD");
				} else if (35 <= bmi) {
					show.append(n1 + ",�z�n\n" + "BMI= " + bmi + "�A�ݩ󭫫תέD");
				}
				if (b = true && 90 <= wa2) {
					show.append("\n�A���y��W���`�ȤF");
				} else if (g = true && 80 <= wa2) {
					show.append("\n�A���y��W���`�ȤF");
				}

			}
		});
		exit.setBounds(380, 100, 100, 25);
		exit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		show.setBounds(20, 135, 450, 340);
		this.add(name);
		this.add(hight);
		this.add(weight);
		this.add(sex);
		this.add(waistline);
		this.add(name1);
		this.add(hight1);
		this.add(weight1);
		this.add(boy);
		this.add(girl);
		this.add(waistline1);
		this.add(count);
		this.add(exit);
		this.add(show);
	}
}